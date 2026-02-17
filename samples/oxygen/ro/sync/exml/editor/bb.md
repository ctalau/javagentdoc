# Interface: `bb`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.bb`

**Extends:** [`ro.sync.exml.editor.u.e`](u/e.md), [`ro.sync.exml.editor.vf`](./vf.md), [`ro.sync.exml.editor.u.m`](u/m.md), [`ro.sync.exml.editor.u.f`](u/f.md), [`ro.sync.ui.marks.f`](../../ui/marks/f.md), [`ro.sync.exml.editor.validate.q`](validate/q.md), [`ro.sync.exml.editor.je`](./je.md), [`ro.sync.exml.sd`](../sd.md), [`ro.sync.exml.editor.u.b`](u/b.md), [`ro.sync.exml.editor.yb`](./yb.md), [`ro.sync.exml.editor.kd<ro.sync.exml.editor.rc>`](./kd.md), [`ro.sync.exml.editor.j`](./j.md), [`ro.sync.exml.editor.ib`](./ib.md)

## Methods

### `setFileHistory([`ro.sync.exml.k`](../k.md) arg0)`

**Returns:** `void`

### `getComponent()`

**Returns:** `javax.swing.JComponent`

### `setParentFrame(`javax.swing.JFrame` arg0)`

**Returns:** `void`

### `setProjectManager([`ro.sync.exml.project.z`](../project/z.md) arg0)`

**Returns:** `void`

### `addEditorManagerListener([`ro.sync.exml.editor.bc`](./bc.md) arg0)`

**Returns:** `void`

### `removeEditorManagerListener([`ro.sync.exml.editor.bc`](./bc.md) arg0)`

**Returns:** `void`

### `closeEditor()`

**Returns:** `boolean`

### `closeOtherEditors([`ro.sync.exml.editor.SAEditorInterface`](./SAEditorInterface.md) arg0)`

**Returns:** `boolean`

### `closeOtherEditorsFromSelectedStack([`ro.sync.exml.editor.SAEditorInterface`](./SAEditorInterface.md) arg0)`

**Returns:** `boolean`

### `closeAllEditorsToTheRight([`ro.sync.exml.editor.SAEditorInterface`](./SAEditorInterface.md) arg0)`

**Returns:** `boolean`

### `moveTabToTheLeftOrRight(`boolean` arg0, `int` arg1)`

**Returns:** `void`

### `switchToTheLeftOrRightTab(`boolean` arg0)`

**Returns:** `void`

### `closeEditor([`ro.sync.exml.editor.SAEditorInterface`](./SAEditorInterface.md) arg0)`

**Returns:** `boolean`

### `removeEditor([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** `void`

### `removePlaceHolder([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** `void`

### `replaceHolderEditorNow([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** [`ro.sync.exml.editor.dd`](./dd.md)

### `closeAll()`

**Returns:** `boolean`

### `reopenLastClosedEditor()`

**Returns:** `void`

### `getSelectedEditor()`

**Returns:** [`ro.sync.exml.editor.dd`](./dd.md)

### `getTopEditors()`

**Returns:** [`ro.sync.exml.editor.dd[]`](./dd.md)

### `getEditorsFromTheSameGroup([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** [`ro.sync.exml.editor.rc[]`](./rc.md)

### `setSelectedEditor([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** `void`

### `getAllEditors()`

**Returns:** [`ro.sync.exml.editor.rc[]`](./rc.md)

### `getAllEditorsInVisualOrder()`

**Returns:** [`ro.sync.exml.editor.rc[]`](./rc.md)

### `setPerspectiveID(`int` arg0)`

**Returns:** `void`

### `getPerspectiveID()`

**Returns:** `int`

### `setSearchControl([`ro.sync.exml.controllers.p`](../controllers/p.md) arg0)`

**Returns:** `void`

### `getSearchControl()`

**Returns:** [`ro.sync.exml.controllers.p`](../controllers/p.md)

### `setSpellControl([`ro.sync.azcheck.ui.b.d`](../../azcheck/ui/b/d.md) arg0)`

**Returns:** `void`

### `setBatchFormatAndIndentControl([`ro.sync.exml.editor.pagetext.formatandindent.f`](pagetext/formatandindent/f.md) arg0)`

**Returns:** `void`

### `getBatchFormatAndIndentControl()`

**Returns:** [`ro.sync.exml.editor.pagetext.formatandindent.f`](pagetext/formatandindent/f.md)

### `getSpellControl()`

**Returns:** [`ro.sync.azcheck.ui.b.d`](../../azcheck/ui/b/d.md)

### `setPerspectiveManager([`ro.sync.exml.xb`](../xb.md) arg0)`

**Returns:** `void`

### `getPerspectiveManager()`

**Returns:** [`ro.sync.exml.xb`](../xb.md)

### `disableOpen(`java.lang.String` arg0)`

**Returns:** `void`

### `isDisableOpen()`

**Returns:** `boolean`

### `getOpenedFileInfos()`

**Returns:** [`ro.sync.exml.editor.projecteditingstate.OpenedFileInfo[]`](projecteditingstate/OpenedFileInfo.md)

### `open([`ro.sync.exml.editor.projecteditingstate.OpenedFileInfo[]`](projecteditingstate/OpenedFileInfo.md) arg0, `boolean` arg1)`

**Returns:** `void`

### `open(`java.net.URL` arg0, `java.lang.String` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** `java.lang.Object`

### `setToggleMaximizable([`ro.sync.exml.hd`](../hd.md) arg0)`

**Returns:** `void`

### `saveLayout()`

**Returns:** `void`

### `loadLayout()`

**Returns:** `void`

### `resetLayout()`

**Returns:** `void`

### `isLayoutLoaded()`

**Returns:** `boolean`

### `getAutomaticallyValidationManager()`

**Returns:** [`ro.sync.exml.editor.td`](./td.md)

### `getZOrderEditorList()`

**Returns:** [`ro.sync.exml.editor.bf`](./bf.md)

### `getToggleMaximizable()`

**Returns:** [`ro.sync.exml.hd`](../hd.md)

### `getEditor(`java.lang.String` arg0)`

**Returns:** [`ro.sync.exml.editor.rc`](./rc.md)

### `repaint()`

**Returns:** `void`

### `checkFileChooserTargetDir()`

**Returns:** `void`

### `setHistoryMarker([`ro.sync.exml.controllers.r`](../controllers/r.md) arg0)`

**Returns:** `void`

### `isModified()`

**Returns:** `boolean`

### `updateIconAndTooltip([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** `void`

### `getProjectManager()`

**Returns:** [`ro.sync.exml.project.z`](../project/z.md)

### `getAutorecoveryManager()`

**Returns:** [`ro.sync.exml.editor.mb.b`](mb/b.md)

### `setArchiveBrowser([`ro.sync.exml.zip.t`](../zip/t.md) arg0)`

**Returns:** `void`

### `setDITAMapOpener([`ro.sync.exml.editor.u.h`](u/h.md) arg0)`

**Returns:** `void`

### `openAndHighlightLocation(`java.net.URL` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, `java.lang.String` arg2, `java.lang.String` arg3, [`ro.sync.exml.editor.zf`](./zf.md) arg4, `boolean` arg5)`

**Returns:** `java.lang.Object`

### `removeAllHighlights(`java.net.URL` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `removeHighlight(`java.net.URL` arg0, `java.lang.String` arg1, `java.lang.Object` arg2)`

**Returns:** `void`

### `getCurrentConditionAttributesManager()`

**Returns:** [`ro.sync.ecss.conditions.s`](../../ecss/conditions/s.md)

### `getCurrentDitavalStyleProvider()`

**Returns:** [`ro.sync.ecss.conditions.n`](../../ecss/conditions/n.md)

### `getWorkspaceAccess()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../workspace/api/standalone/StandalonePluginWorkspace.md)

### `setWorkspaceAccess([`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../workspace/api/standalone/StandalonePluginWorkspace.md) arg0)`

**Returns:** `void`

### `setAdditionalViewsUpdater([`ro.sync.exml.tc`](../tc.md) arg0)`

**Returns:** `void`

### `setOpenFilesInProgress(`boolean` arg0)`

**Returns:** `void`

### `fireEditorAboutToBeRemoved([`ro.sync.exml.editor.rc`](./rc.md) arg0)`

**Returns:** `boolean`

### `fireEditorRelocated([`ro.sync.exml.editor.rc`](./rc.md) arg0, `java.net.URL` arg1)`

**Returns:** `void`

### `checkURLIsOpenedInOtherEditorManager(`java.net.URL` arg0)`

**Returns:** `boolean`

### `closeAllFromSelectedStack()`

**Returns:** `boolean`

### `setExtraNewResourceSaveListener([`ro.sync.exml.editor.yb`](./yb.md) arg0)`

**Returns:** `void`

### `resetEditorTabsVisibility()`

**Returns:** `void`

### `updateAnchorsInDPIs([`ro.sync.exml.editor.mb`](./mb.md) arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1)`

**Returns:** `void`

