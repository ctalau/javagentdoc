# Oxygen XML Web Author Docker + Playwright Run Log

Date: 2026-03-02

## Goal

1. Build the Oxygen XML Web Author Docker image from GitHub.
2. Start it with `-DforTestingMaxStackSize=127`.
3. Use Playwright to open the first built-in sample document.
4. Capture a screenshot.

## Source repository used

- `https://github.com/oxygenxml/web-author-docker`
- Cloned to: `/home/miciiortodocsi/repo/web-author-docker`

## Build steps

### 1) Build base image

Executed in `/home/miciiortodocsi/repo/web-author-docker/base`:

```bash
docker build -t web-author-base .
```

Result: build completed successfully and produced image `web-author-base`.

### 2) Start container with requested JVM flag

```bash
docker volume create web-author-data

docker run -d \
  --name web-author-test \
  -p 8080:8080 \
  --mount source=web-author-data,target=/usr/local/tomcat/work/Catalina/localhost/oxygen-xml-web-author \
  -e CATALINA_OPTS='-DforTestingMaxStackSize=127' \
  web-author-base
```

Container: `web-author-test`

### 3) Verify flag was applied

Checked container logs and confirmed this startup argument:

```text
Command line argument: -DforTestingMaxStackSize=127
```

## Web Author first-run setup

On first launch, Web Author requires admin user initialization.

- Admin setup password was read from container logs (`Admin Setup Password: ...`).
- Admin user was configured through the server endpoint (`admin-anon/configure-user`).
- Note: password must be at least 12 characters.

## Determine the first sample document

The first sample was read from:

- `/usr/local/tomcat/work/Catalina/localhost/oxygen-xml-web-author/samples/.descriptor/samples.json`

First sample entry:

- Name: `DITA Topic`
- Path: `dita/flowers/topics/flowers/gardenia.dita`
- DITAMAP: `dita/flowers/flowers.ditamap`

The samples plugin (`web-author-samples-plugin`) builds sample URLs as:

- `oxygen.html?url=<encoded samples://samples/...>`

## Playwright execution

A local Playwright workspace was prepared in `/tmp/wa-playwright`:

```bash
npm init -y
npm install @playwright/test
npx playwright install chromium
```

A Playwright script then opened:

```text
http://localhost:8080/oxygen-xml-web-author/app/oxygen.html?url=samples%3A%2F%2Fsamples%2Fdita%2Fflowers%2Ftopics%2Fflowers%2Fgardenia.dita&ditamap=samples%3A%2F%2Fsamples%2Fdita%2Fflowers%2Fflowers.ditamap&ccOnEnter=false&stylesheet-titles=Basic%2C%2B+Inline+insertion+actions
```

Observed during automation:

- Editor title became `gardenia.dita`.
- REST document load returned HTTP 200.
- UI fully rendered with sample content.

## Artifacts

- Final screenshot:
  - `/home/miciiortodocsi/repo/javagentdoc/oxygen-web-author-first-sample.png`
- Debug screenshot (kept):
  - `/home/miciiortodocsi/repo/javagentdoc/oxygen-web-author-first-sample-debug.png`
