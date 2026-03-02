# Class: `DefaultSaveStrategy`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.DefaultSaveStrategy`

**Implements:** [`ro.sync.ecss.extensions.api.webapp.ce.GroupChangesForMultiplePeersStrategy`](./GroupChangesForMultiplePeersStrategy.md)

## Description

Saves all changes at once, as the user who triggered the save.

## Constructors

### `<init>()`

## Methods

### `openConnection(URL documentUrl, PeerContext committer, List<PeerContext> authors)`

**Parameters:**
- `documentUrl` (`java.net.URL`)
- `committer` ([`ro.sync.ecss.extensions.api.webapp.ce.PeerContext`](./PeerContext.md))
- `authors` (`java.util.List<ro.sync.ecss.extensions.api.webapp.ce.PeerContext>`)

**Returns:** `java.net.URLConnection`

