# Class: `id`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.id`

**Implements:** [`ro.sync.exml.editor.bb`](./bb.md)

## Constructors

### `<init>()`

## Methods

### `isModified()`

**Returns:** `boolean`

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

### `newEditor(`java.lang.String` arg0)`

**Returns:** [`ro.sync.exml.editor.dd`](./dd.md)

### `open(`java.net.URL` arg0)`

**Returns:** `java.lang.Object`

### `openOperationResult(`java.net.URL` arg0)`

**Returns:** `java.lang.Object`

### `closeEditor()`

**Returns:** `boolean`

### `removeEditor([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** `void`

### `removePlaceHolder([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** `void`

### `replaceHolderEditorNow([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** [`ro.sync.exml.editor.dd`](./dd.md)

### `closeAll()`

**Returns:** `boolean`

### `getSelectedEditor()`

**Returns:** [`ro.sync.exml.editor.dd`](./dd.md)

### `getSelectedURL(`boolean` arg0)`

**Returns:** `java.net.URL`

### `setSelectedEditor([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** `void`

### `saveAll()`

**Returns:** `void`

### `saveAll(`boolean` arg0)`

**Returns:** `void`

### `saveAllExceptNew()`

**Returns:** `void`

### `saveAllExceptNew(`boolean` arg0)`

**Returns:** `void`

### `getAllOpenedURLs()`

**Returns:** `java.net.URL[]`

### `openAndShowLocation(`java.net.URL` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, `boolean` arg2, `java.lang.String` arg3)`

**Returns:** `java.lang.Object`

### `createBookMark(`java.lang.String` arg0)`

**Returns:** [`ro.sync.ui.marks.s`](../../ui/marks/s.md)

### `removeBookMark(`java.lang.String` arg0)`

**Returns:** `void`

### `removeAllBookMarks()`

**Returns:** `void`

### `gotoBookMark(`java.lang.String` arg0)`

**Returns:** `void`

### `hasBookMark(`java.lang.String` arg0)`

**Returns:** `boolean`

### `createAnyNameMark()`

**Returns:** [`ro.sync.ui.marks.s`](../../ui/marks/s.md)

### `setPerspectiveID(`int` arg0)`

**Returns:** `void`

### `getAllEditors()`

**Returns:** [`ro.sync.exml.editor.rc[]`](./rc.md)

### `getAllEditorsInVisualOrder()`

**Returns:** [`ro.sync.exml.editor.rc[]`](./rc.md)

### `hnj()`

**Returns:** [`ro.sync.exml.editor.rc[]`](./rc.md)

### `setSearchControl([`ro.sync.exml.controllers.p`](../controllers/p.md) arg0)`

**Returns:** `void`

### `getSearchControl()`

**Returns:** [`ro.sync.exml.controllers.p`](../controllers/p.md)

### `isOpened(`java.net.URL` arg0)`

**Returns:** `boolean`

### `setPerspectiveManager([`ro.sync.exml.xb`](../xb.md) arg0)`

**Returns:** `void`

### `getAllBookMarks()`

**Returns:** [`ro.sync.ui.marks.s[]`](../../ui/marks/s.md)

### `getPerspectiveID()`

**Returns:** `int`

### `disableOpen(`java.lang.String` arg0)`

**Returns:** `void`

### `getOpenedFileInfos()`

**Returns:** [`ro.sync.exml.editor.projecteditingstate.OpenedFileInfo[]`](projecteditingstate/OpenedFileInfo.md)

### `open([`ro.sync.exml.editor.projecteditingstate.OpenedFileInfo[]`](projecteditingstate/OpenedFileInfo.md) arg0, `boolean` arg1)`

**Returns:** `void`

### `createBookMark(`java.lang.String` arg0, `int` arg1)`

**Returns:** [`ro.sync.ui.marks.s`](../../ui/marks/s.md)

### `open(`java.net.URL` arg0, `java.lang.String` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** `java.lang.Object`

### `setToggleMaximizable([`ro.sync.exml.hd`](../hd.md) arg0)`

**Returns:** `void`

### `getLoadedURLs(`java.lang.String` arg0)`

**Returns:** `java.net.URL[]`

### `saveLayout()`

**Returns:** `void`

### `loadLayout()`

**Returns:** `void`

### `isLayoutLoaded()`

**Returns:** `boolean`

### `resetLayout()`

**Returns:** `void`

### `findValidationEditor(`java.net.URL` arg0)`

**Returns:** [`ro.sync.exml.editor.validate.ab`](validate/ab.md)

### `getAutomaticallyValidationManager()`

**Returns:** [`ro.sync.exml.editor.td`](./td.md)

### `getZOrderEditorList()`

**Returns:** [`ro.sync.exml.editor.bf`](./bf.md)

### `isAlreadyOpened([`ro.sync.exml.editor.mf`](./mf.md) arg0, `java.net.URL` arg1)`

**Returns:** `boolean`

### `checkForChangeInCurrentEditor()`

**Returns:** `void`

### `getEditor(`java.lang.String` arg0)`

**Returns:** [`ro.sync.exml.editor.rc`](./rc.md)

### `editorPageChanged([`ro.sync.exml.editor.pb`](./pb.md) arg0)`

**Returns:** `void`

### `newEditor(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** [`ro.sync.exml.editor.dd`](./dd.md)

### `repaint()`

**Returns:** `void`

### `checkFileChooserTargetDir()`

**Returns:** `void`

### `open(`java.net.URL` arg0, `boolean` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.Object`

### `applicationAboutToBeClosedOrHidden(`boolean` arg0)`

**Returns:** `boolean`

### `applicationIsClosingOrHiding(`boolean` arg0)`

**Returns:** `boolean`

### `applicationClosingVetoed()`

**Returns:** `void`

### `newEditor(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** [`ro.sync.exml.editor.dd`](./dd.md)

### `open(`java.net.URL` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.Object`

### `closeEditor([`ro.sync.exml.editor.SAEditorInterface`](./SAEditorInterface.md) arg0)`

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

### `newResourceSaved(`java.net.URL` arg0)`

**Returns:** `void`

### `getHistoryMarker()`

**Returns:** [`ro.sync.exml.controllers.r`](../controllers/r.md)

### `setHistoryMarker([`ro.sync.exml.controllers.r`](../controllers/r.md) arg0)`

**Returns:** `void`

### `updateIconAndTooltip([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** `void`

### `getProjectManager()`

**Returns:** [`ro.sync.exml.project.z`](../project/z.md)

### `getAutorecoveryManager()`

**Returns:** [`ro.sync.exml.editor.mb.b`](mb/b.md)

### `enj(`java.lang.String` arg0)`

**Returns:** [`ro.sync.exml.editor.rc`](./rc.md)

### `gnj()`

**Returns:** [`ro.sync.exml.editor.rc`](./rc.md)

### `hasUnsavedModifications()`

**Returns:** `boolean`

### `getSpellControl()`

**Returns:** [`ro.sync.azcheck.ui.b.d`](../../azcheck/ui/b/d.md)

### `setSpellControl([`ro.sync.azcheck.ui.b.d`](../../azcheck/ui/b/d.md) arg0)`

**Returns:** `void`

### `getEditorForURL(`java.net.URL` arg0)`

**Returns:** [`ro.sync.exml.editor.rc`](./rc.md)

### `reopenLastClosedEditor()`

**Returns:** `void`

### `getToggleMaximizable()`

**Returns:** [`ro.sync.exml.hd`](../hd.md)

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

### `newEditorWithContentType(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** [`ro.sync.exml.editor.dd`](./dd.md)

### `setAdditionalViewsUpdater([`ro.sync.exml.tc`](../tc.md) arg0)`

**Returns:** `void`

### `setOpenFilesInProgress(`boolean` arg0)`

**Returns:** `void`

### `fireEditorAboutToBeRemoved([`ro.sync.exml.editor.rc`](./rc.md) arg0)`

**Returns:** `boolean`

### `isDisableOpen()`

**Returns:** `boolean`

### `fireEditorRelocated([`ro.sync.exml.editor.rc`](./rc.md) arg0, `java.net.URL` arg1)`

**Returns:** `void`

### `getTopEditors()`

**Returns:** [`ro.sync.exml.editor.dd[]`](./dd.md)

### `checkURLIsOpenedInOtherEditorManager(`java.net.URL` arg0)`

**Returns:** `boolean`

### `closeAllFromSelectedStack()`

**Returns:** `boolean`

### `fnj(`java.lang.String` arg0, `boolean` arg1)`

**Returns:** [`ro.sync.exml.editor.rc`](./rc.md)

### `getEditorForURL(`java.net.URL` arg0, `boolean` arg1)`

**Returns:** [`ro.sync.exml.editor.rc`](./rc.md)

### `showStartPage()`

**Returns:** `void`

### `open(`java.net.URL` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3)`

**Returns:** `java.lang.Object`

### `setBatchFormatAndIndentControl([`ro.sync.exml.editor.pagetext.formatandindent.f`](pagetext/formatandindent/f.md) arg0)`

**Returns:** `void`

### `getBatchFormatAndIndentControl()`

**Returns:** [`ro.sync.exml.editor.pagetext.formatandindent.f`](pagetext/formatandindent/f.md)

### `setExtraNewResourceSaveListener([`ro.sync.exml.editor.yb`](./yb.md) arg0)`

**Returns:** `void`

### `getPerspectiveManager()`

**Returns:** [`ro.sync.exml.xb`](../xb.md)

### `resetEditorTabsVisibility()`

**Returns:** `void`

### `getEditorsFromTheSameGroup([`ro.sync.exml.editor.dd`](./dd.md) arg0)`

**Returns:** [`ro.sync.exml.editor.rc[]`](./rc.md)

