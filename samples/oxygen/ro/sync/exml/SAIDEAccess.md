# Class: `SAIDEAccess`

**Package:** [`ro.sync.exml`](README.md)

**Fully Qualified Name:** `ro.sync.exml.SAIDEAccess`

**Extends:** [`ro.sync.exml.mc`](./mc.md)

**Implements:** [`ro.sync.exml.fc`](./fc.md), [`ro.sync.exml.vc`](./vc.md), [`ro.sync.exml.g`](./g.md)

## Fields

### `nc`

**Type:** [`org.slf4j.Logger`](../../../org/slf4j/Logger.md)

### `ec`

**Type:** [`ro.sync.db.h`](../db/h.md)

### `kc`

**Type:** [`ro.sync.exml.td`](./td.md)

### `lc`

**Type:** [`ro.sync.exml.modules.hierarchy.l`](modules/hierarchy/l.md)

### `gc`

**Type:** [`ro.sync.exml.editor.finders.b.h`](editor/finders/b/h.md)

### `fc`

**Type:** [`ro.sync.f.f.nb`](../f/f/nb.md)

### `bc`

**Type:** [`ro.sync.exml.docking.f`](docking/f.md)

### `hc`

**Type:** [`ro.sync.exml.editor.finders.c`](editor/finders/c.md)

### `mc`

**Type:** [`ro.sync.exml.masterfiles.w`](masterfiles/w.md)

### `jc`

**Type:** [`ro.sync.exml.zb`](./zb.md)

### `ic`

**Type:** [`ro.sync.k.b.b`](../k/b/b.md)

### `dc`

**Type:** [`ro.sync.diff.ui.t`](../diff/ui/t.md)

### `cc`

**Type:** [`ro.sync.exml.project.o`](project/o.md)

## Constructors

### `<init>()`

## Methods

### `setTableOpener([`ro.sync.db.h`](../db/h.md) arg0)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, [`ro.sync.db.fb`](../db/fb.md) arg1)`

**Returns:** `void`

### `getPreferencePagePresenter()`

**Returns:** [`ro.sync.exml.td`](./td.md)

### `createTransformationHelper([`ro.sync.exml.editor.xmleditor.c`](editor/xmleditor/c.md) arg0, `java.lang.String` arg1)`

**Returns:** [`ro.sync.exml.editor.xmleditor.transform.jb`](editor/xmleditor/transform/jb.md)

### `showDockableView(`java.lang.String` arg0, `boolean` arg1)`

**Returns:** `void`

### `setDockingManager([`ro.sync.exml.docking.f`](docking/f.md) arg0)`

**Returns:** `void`

### `showHierarchyOrDependences(`java.lang.String` arg0, `boolean` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `setHierarchyPanel([`ro.sync.exml.modules.hierarchy.l`](modules/hierarchy/l.md) arg0)`

**Returns:** `void`

### `showComponentDependencies([`ro.sync.exml.editor.hb.g`](editor/hb/g.md) arg0, [`ro.sync.exml.modules.b.i[]`](modules/b/i.md) arg1)`

**Returns:** `void`

### `setComponentDependenciesPanel([`ro.sync.exml.editor.finders.b.h`](editor/finders/b/h.md) arg0)`

**Returns:** `void`

### `setFindResourcePanel([`ro.sync.k.b.b`](../k/b/b.md) arg0)`

**Returns:** `void`

### `setWatchPanel([`ro.sync.f.f.nb`](../f/f/nb.md) arg0)`

**Returns:** `void`

### `addWatchExpression(`java.lang.String` arg0)`

**Returns:** `void`

### `getDocumentResourceFactory()`

**Returns:** [`ro.sync.exml.editor.finders.c`](editor/finders/c.md)

### `getResourceManagerFactory()`

**Returns:** [`ro.sync.exml.editor.e`](editor/e.md)

### `initializeForTests([`ro.sync.exml.SAIDEAccess`](./SAIDEAccess.md) arg0)`

**Returns:** `void`

### `getWorkspaceResourceProvider()`

**Returns:** [`ro.sync.exml.project.cb`](project/cb.md)

### `getDiffFilePresenter()`

**Returns:** [`ro.sync.diff.ui.t`](../diff/ui/t.md)

### `setDiffFilePresenter([`ro.sync.diff.ui.t`](../diff/ui/t.md) arg0)`

**Returns:** `void`

### `setWorkspaceController([`ro.sync.exml.project.o`](project/o.md) arg0)`

**Returns:** `void`

### `getWorkspaceController()`

**Returns:** [`ro.sync.exml.project.o`](project/o.md)

### `getDITAMapSelectionInterractor()`

**Returns:** [`ro.sync.exml.editor.xmleditor.pageauthor.k`](editor/xmleditor/pageauthor/k.md)

### `getDITAMapContextResolver()`

**Returns:** [`ro.sync.ecss.dita.mapeditor.q`](../ecss/dita/mapeditor/q.md)

### `doBrowseRemote(`java.net.URL` arg0)`

**Returns:** `java.net.URL`

### `doBrowseForResource()`

**Returns:** `java.net.URL`

### `canChooseResource()`

**Returns:** `boolean`

### `getMasterFilesSupport()`

**Returns:** [`ro.sync.exml.masterfiles.w`](masterfiles/w.md)

### `refreshFilesInProject([`ro.sync.exml.project.wb`](project/wb.md) arg0)`

**Returns:** `void`

### `refreshDMMResourcesWithSysIDs(`java.util.List<java.lang.String>` arg0)`

**Returns:** `void`

### `bd(`java.util.List<java.lang.String>` arg0, [`ro.sync.exml.editor.rc`](editor/rc.md) arg1)`

**Returns:** `void`

### `ad([`ro.sync.ecss.dita.mapeditor.c`](../ecss/dita/mapeditor/c.md) arg0)`

**Returns:** `void`

### `doBrowseRemote(`java.net.URL` arg0, `boolean` arg1)`

**Returns:** `java.net.URL`

### `doMoveResource(`java.io.File` arg0, `java.io.File` arg1, `boolean` arg2)`

**Returns:** `void`

### `setSvnAccess([`ro.sync.exml.zb`](./zb.md) arg0)`

**Returns:** `void`

### `disableOpen(`java.lang.String` arg0)`

**Returns:** `void`

### `showOpenFindResource(`java.lang.String` arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `saveAllEditors()`

**Returns:** `boolean`

### `showMoreDetailsAboutValidation()`

**Returns:** `void`

### `getActiveFrameTag()`

**Returns:** `java.lang.String`

### `getProjectURL()`

**Returns:** `java.net.URL`

