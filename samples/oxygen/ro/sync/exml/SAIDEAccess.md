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

### `setTableOpener(ro.sync.db.h arg0)`

**Parameters:**
- `arg0` (`ro.sync.db.h`)

**Returns:** `void`

### `updateResults(java.lang.String arg0, ro.sync.db.fb arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`ro.sync.db.fb`)

**Returns:** `void`

### `getPreferencePagePresenter()`

**Returns:** `ro.sync.exml.td`

### `createTransformationHelper(ro.sync.exml.editor.xmleditor.c arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.xmleditor.c`)
- `arg1` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.xmleditor.transform.jb`

### `showDockableView(java.lang.String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `void`

### `setDockingManager(ro.sync.exml.docking.f arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.docking.f`)

**Returns:** `void`

### `showHierarchyOrDependences(java.lang.String arg0, boolean arg1, java.lang.String arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`java.lang.String`)

**Returns:** `void`

### `setHierarchyPanel(ro.sync.exml.modules.hierarchy.l arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.modules.hierarchy.l`)

**Returns:** `void`

### `showComponentDependencies(ro.sync.exml.editor.hb.g arg0, ro.sync.exml.modules.b.i[] arg1)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.hb.g`)
- `arg1` (`ro.sync.exml.modules.b.i[]`)

**Returns:** `void`

### `setComponentDependenciesPanel(ro.sync.exml.editor.finders.b.h arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.finders.b.h`)

**Returns:** `void`

### `setFindResourcePanel(ro.sync.k.b.b arg0)`

**Parameters:**
- `arg0` (`ro.sync.k.b.b`)

**Returns:** `void`

### `setWatchPanel(ro.sync.f.f.nb arg0)`

**Parameters:**
- `arg0` (`ro.sync.f.f.nb`)

**Returns:** `void`

### `addWatchExpression(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getDocumentResourceFactory()`

**Returns:** `ro.sync.exml.editor.finders.c`

### `getResourceManagerFactory()`

**Returns:** `ro.sync.exml.editor.e`

### `initializeForTests(ro.sync.exml.SAIDEAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.SAIDEAccess`](./SAIDEAccess.md))

**Returns:** `void`

### `getWorkspaceResourceProvider()`

**Returns:** `ro.sync.exml.project.cb`

### `getDiffFilePresenter()`

**Returns:** `ro.sync.diff.ui.t`

### `setDiffFilePresenter(ro.sync.diff.ui.t arg0)`

**Parameters:**
- `arg0` (`ro.sync.diff.ui.t`)

**Returns:** `void`

### `setWorkspaceController(ro.sync.exml.project.o arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.project.o`)

**Returns:** `void`

### `getWorkspaceController()`

**Returns:** `ro.sync.exml.project.o`

### `getDITAMapSelectionInterractor()`

**Returns:** `ro.sync.exml.editor.xmleditor.pageauthor.k`

### `getDITAMapContextResolver()`

**Returns:** `ro.sync.ecss.dita.mapeditor.q`

### `doBrowseRemote(java.net.URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.net.URL`

### `doBrowseForResource()`

**Returns:** `java.net.URL`

### `canChooseResource()`

**Returns:** `boolean`

### `getMasterFilesSupport()`

**Returns:** `ro.sync.exml.masterfiles.w`

### `refreshFilesInProject(ro.sync.exml.project.wb arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.project.wb`)

**Returns:** `void`

### `refreshDMMResourcesWithSysIDs(java.util.List<java.lang.String> arg0)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.String>`)

**Returns:** `void`

### `bd(java.util.List<java.lang.String> arg0, ro.sync.exml.editor.rc arg1)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.String>`)
- `arg1` (`ro.sync.exml.editor.rc`)

**Returns:** `void`

### `ad(ro.sync.ecss.dita.mapeditor.c arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.mapeditor.c`)

**Returns:** `void`

### `doBrowseRemote(java.net.URL arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`boolean`)

**Returns:** `java.net.URL`

### `doMoveResource(java.io.File arg0, java.io.File arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.io.File`)
- `arg2` (`boolean`)

**Returns:** `void`

### `setSvnAccess(ro.sync.exml.zb arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.zb`)

**Returns:** `void`

### `disableOpen(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `showOpenFindResource(java.lang.String arg0, boolean arg1, boolean arg2)`

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

