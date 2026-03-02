# Class: `SAIDEAccess`

**Package:** [`ro.sync.exml`](README.md)

**Fully Qualified Name:** `ro.sync.exml.SAIDEAccess`

**Extends:** `ro.sync.exml.mc`

**Implements:** `ro.sync.exml.fc`, `ro.sync.exml.vc`, `ro.sync.exml.g`

## Fields

### `nc`

**Type:** `org.slf4j.Logger`

### `ec`

**Type:** `ro.sync.db.h`

### `kc`

**Type:** `ro.sync.exml.td`

### `lc`

**Type:** `ro.sync.exml.modules.hierarchy.l`

### `gc`

**Type:** `ro.sync.exml.editor.finders.b.h`

### `fc`

**Type:** `ro.sync.f.f.nb`

### `bc`

**Type:** `ro.sync.exml.docking.f`

### `hc`

**Type:** `ro.sync.exml.editor.finders.c`

### `mc`

**Type:** `ro.sync.exml.masterfiles.w`

### `jc`

**Type:** `ro.sync.exml.zb`

### `ic`

**Type:** `ro.sync.k.b.b`

### `dc`

**Type:** `ro.sync.diff.ui.t`

### `cc`

**Type:** `ro.sync.exml.project.o`

## Constructors

### `<init>()`

## Methods

### `setTableOpener(h arg0)`

**Parameters:**
- `arg0` (`ro.sync.db.h`)

**Returns:** `void`

### `updateResults(String arg0, fb arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`ro.sync.db.fb`)

**Returns:** `void`

### `getPreferencePagePresenter()`

**Returns:** `ro.sync.exml.td`

### `createTransformationHelper(c arg0, String arg1)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.xmleditor.c`)
- `arg1` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.xmleditor.transform.jb`

### `showDockableView(String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `void`

### `setDockingManager(f arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.docking.f`)

**Returns:** `void`

### `showHierarchyOrDependences(String arg0, boolean arg1, String arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`java.lang.String`)

**Returns:** `void`

### `setHierarchyPanel(l arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.modules.hierarchy.l`)

**Returns:** `void`

### `showComponentDependencies(g arg0, i[] arg1)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.hb.g`)
- `arg1` (`ro.sync.exml.modules.b.i[]`)

**Returns:** `void`

### `setComponentDependenciesPanel(h arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.finders.b.h`)

**Returns:** `void`

### `setFindResourcePanel(b arg0)`

**Parameters:**
- `arg0` (`ro.sync.k.b.b`)

**Returns:** `void`

### `setWatchPanel(nb arg0)`

**Parameters:**
- `arg0` (`ro.sync.f.f.nb`)

**Returns:** `void`

### `addWatchExpression(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getDocumentResourceFactory()`

**Returns:** `ro.sync.exml.editor.finders.c`

### `getResourceManagerFactory()`

**Returns:** `ro.sync.exml.editor.e`

### `initializeForTests(SAIDEAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.SAIDEAccess`](./SAIDEAccess.md))

**Returns:** `void`

### `getWorkspaceResourceProvider()`

**Returns:** `ro.sync.exml.project.cb`

### `getDiffFilePresenter()`

**Returns:** `ro.sync.diff.ui.t`

### `setDiffFilePresenter(t arg0)`

**Parameters:**
- `arg0` (`ro.sync.diff.ui.t`)

**Returns:** `void`

### `setWorkspaceController(o arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.project.o`)

**Returns:** `void`

### `getWorkspaceController()`

**Returns:** `ro.sync.exml.project.o`

### `getDITAMapSelectionInterractor()`

**Returns:** `ro.sync.exml.editor.xmleditor.pageauthor.k`

### `getDITAMapContextResolver()`

**Returns:** `ro.sync.ecss.dita.mapeditor.q`

### `doBrowseRemote(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.net.URL`

### `doBrowseForResource()`

**Returns:** `java.net.URL`

### `canChooseResource()`

**Returns:** `boolean`

### `getMasterFilesSupport()`

**Returns:** `ro.sync.exml.masterfiles.w`

### `refreshFilesInProject(wb arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.project.wb`)

**Returns:** `void`

### `refreshDMMResourcesWithSysIDs(List<String> arg0)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.String>`)

**Returns:** `void`

### `bd(List<String> arg0, rc arg1)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.String>`)
- `arg1` (`ro.sync.exml.editor.rc`)

**Returns:** `void`

### `ad(c arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.mapeditor.c`)

**Returns:** `void`

### `doBrowseRemote(URL arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`boolean`)

**Returns:** `java.net.URL`

### `doMoveResource(File arg0, File arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.io.File`)
- `arg2` (`boolean`)

**Returns:** `void`

### `setSvnAccess(zb arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.zb`)

**Returns:** `void`

### `disableOpen(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `showOpenFindResource(String arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `void`

### `saveAllEditors()`

**Returns:** `boolean`

### `showMoreDetailsAboutValidation()`

**Returns:** `void`

### `getActiveFrameTag()`

**Returns:** `java.lang.String`

### `getProjectURL()`

**Returns:** `java.net.URL`

