# Class: `dd`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.dd`

**Extends:** `javax.swing.JPanel`

**Implements:** [`ro.sync.exml.editor.l`](./l.md), [`ro.sync.exml.workspace.api.editor.ScenarioInvoker`](../workspace/api/editor/ScenarioInvoker.md), [`ro.sync.exml.editor.ad`](./ad.md)

## Fields

### `xgn`

**Type:** [`org.slf4j.Logger`](../../../../org/slf4j/Logger.md)

### `ngn`

**Type:** `java.net.URL`

### `zgn`

**Type:** `int`

### `fgn`

**Type:** `boolean`

### `egn`

**Type:** `java.util.Map<java.lang.String,java.util.List>`

### `ugn`

**Type:** `java.util.List<ro.sync.ui.application.action.d>`

### `nhn`

**Type:** [`ro.sync.exml.editor.db`](./db.md)

### `yfn`

**Type:** `boolean`

### `mhn`

**Type:** [`ro.sync.exml.editor.h.f`](h/f.md)

### `fhn`

**Type:** [`ro.sync.exml.editor.z.h`](z/h.md)

### `saveAction`

**Type:** [`ro.sync.ui.application.action.d`](../../ui/application/action/d.md)

### `reloadAction`

**Type:** [`ro.sync.ui.application.action.d`](../../ui/application/action/d.md)

### `filePrintAction`

**Type:** [`ro.sync.ui.application.action.d`](../../ui/application/action/d.md)

### `filePrintPreviewAction`

**Type:** [`ro.sync.ui.application.action.d`](../../ui/application/action/d.md)

### `vgn`

**Type:** [`ro.sync.ui.application.action.d`](../../ui/application/action/d.md)

### `ygn`

**Type:** `int`

### `jhn`

**Type:** `java.lang.String`

### `messages`

**Type:** [`ro.sync.i18n.c`](../../i18n/c.md)

### `fileHistory`

**Type:** [`ro.sync.exml.k`](../k.md)

### `kgn`

**Type:** `javax.swing.Icon`

### `parentFrame`

**Type:** `java.awt.Frame`

### `ideAccess`

**Type:** [`ro.sync.exml.v`](../v.md)

### `editorManager`

**Type:** [`ro.sync.exml.editor.bb`](./bb.md)

### `currentPageID`

**Type:** `java.lang.String`

### `editorPages`

**Type:** `java.util.List<ro.sync.exml.editor.mb>`

### `pageChangeToolbar`

**Type:** [`ro.sync.ui.i.b`](../../ui/i/b.md)

### `hhn`

**Type:** `java.awt.CardLayout`

### `ehn`

**Type:** `javax.swing.JPanel`

### `bhn`

**Type:** `java.lang.String`

### `editorListeners`

**Type:** `java.util.List<ro.sync.exml.editor.qg>`

### `cgn`

**Type:** [`ro.sync.exml.editor.s.c`](s/c.md)

### `hgn`

**Type:** `boolean`

### `ogn`

**Type:** `java.lang.String`

### `bgn`

**Type:** [`ro.sync.exml.editor.we`](./we.md)

### `fileChangeWatcher`

**Type:** [`ro.sync.exml.b.e`](../b/e.md)

### `markCreatorAnyName`

**Type:** [`ro.sync.ui.marks.t`](../../ui/marks/t.md)

### `breakPointCreator`

**Type:** [`ro.sync.ui.marks.m`](../../ui/marks/m.md)

### `dhn`

**Type:** `javax.swing.ButtonGroup`

### `documentMenuActions`

**Type:** `java.util.List`

### `tgn`

**Type:** `javax.swing.JPanel`

### `rgn`

**Type:** [`ro.sync.exml.editor.n`](./n.md)

### `qgn`

**Type:** `boolean`

### `ign`

**Type:** `java.awt.Rectangle`

### `isEditorClosed`

**Type:** `boolean`

### `editorManagerListener`

**Type:** [`ro.sync.exml.editor.dd._c`](dd/_c.md)

### `agn`

**Type:** `java.lang.String`

### `khn`

**Type:** `boolean`

### `operationInProgress`

**Type:** [`ro.sync.basic.util.concurrent.Semaphore`](../../basic/util/concurrent/Semaphore.md)

### `dgn`

**Type:** `java.util.List`

### `zfn`

**Type:** `javax.swing.border.Border`

### `xfn`

**Type:** `javax.swing.border.Border`

### `ahn`

**Type:** `javax.swing.border.Border`

### `jgn`

**Type:** `java.lang.String`

### `ghn`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

### `ggn`

**Type:** `java.lang.String[]`

### `pgn`

**Type:** `java.util.Map<ro.sync.exml.editor.mb,java.util.Map<java.lang.String,java.lang.Long>>`

### `ihn`

**Type:** `java.lang.String`

### `chn`

**Type:** `boolean`

### `wgn`

**Type:** `java.lang.String`

### `mgn`

**Type:** `boolean`

### `lhn`

**Type:** `java.lang.String`

### `isEditableViaAPI`

**Type:** `boolean`

### `lgn`

**Type:** [`ro.sync.io.h`](../../io/h.md)

### `sgn`

**Type:** [`ro.sync.ecss.component.ui.b.b.d`](../../ecss/component/ui/b/b/d.md)

## Constructors

### `<init>(`java.awt.Frame` arg0, [`ro.sync.exml.editor.bb`](./bb.md) arg1, `java.lang.String` arg2, [`ro.sync.ui.marks.t`](../../ui/marks/t.md) arg3, [`ro.sync.ui.marks.m`](../../ui/marks/m.md) arg4)`

## Methods

### `createEditorActions()`

**Returns:** `java.util.List<ro.sync.ui.application.action.d>`

### `saveBeforeClose(`boolean` arg0)`

**Returns:** `boolean`

### `setFileHistory([`ro.sync.exml.k`](../k.md) arg0)`

**Returns:** `void`

### `setTitle(`java.lang.String` arg0)`

**Returns:** `void`

### `setModifiedStatus(`int` arg0)`

**Returns:** `void`

### `setStatus([`ro.sync.exml.editor.eg`](./eg.md) arg0)`

**Returns:** `void`

### `getIcon()`

**Returns:** `javax.swing.Icon`

### `getTooltipDescription()`

**Returns:** `java.lang.String`

### `getFileHistory()`

**Returns:** [`ro.sync.exml.k`](../k.md)

### `getFileExtension()`

**Returns:** `java.lang.String`

### `isNewDocument()`

**Returns:** `boolean`

### `getTitle()`

**Returns:** `java.lang.String`

### `getModifiedStatus()`

**Returns:** `int`

### `isModified()`

**Returns:** `boolean`

### `save()`

**Returns:** `void`

### `saveDocument()`

**Returns:** `java.net.URL`

### `srj()`

**Returns:** `void`

### `saveDocumentAs()`

**Returns:** `java.net.URL`

### `saveDocumentAs(`java.net.URL` arg0)`

**Returns:** `void`

### `saveDocumentAsURL()`

**Returns:** `void`

### `isSaving()`

**Returns:** `boolean`

### `print(`boolean` arg0)`

**Returns:** `void`

### `open(`java.net.URL` arg0, `java.net.URLConnection` arg1)`

**Returns:** `java.lang.Object`

### `open(`java.net.URL` arg0)`

**Returns:** `java.lang.Object`

### `open(`java.net.URL` arg0, `boolean` arg1)`

**Returns:** `void`

### `openOperationResult(`java.net.URL` arg0)`

**Returns:** `java.lang.Object`

### `open(`java.net.URL` arg0, `java.net.URLConnection` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** `java.lang.Object`

### `open(`java.net.URL` arg0, [`ro.sync.exml.editor.yg`](./yg.md) arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4)`

**Returns:** `java.lang.Object`

### `fireEditorFinishedLoading(`java.net.URL` arg0, `boolean` arg1)`

**Returns:** `void`

### `fireEditorWillStartToLoad()`

**Returns:** `void`

### `reloadFromReader(`java.io.Reader` arg0, `java.net.URL` arg1)`

**Returns:** `void`

### `relocate(`java.net.URL` arg0)`

**Returns:** `void`

### `askForSave()`

**Returns:** `boolean`

### `close(`boolean` arg0)`

**Returns:** `boolean`

### `csj(`java.lang.String` arg0)`

**Returns:** `boolean`

### `urj(`java.net.URL` arg0)`

**Returns:** `void`

### `initFrame()`

**Returns:** `void`

### `mrj()`

**Returns:** `boolean`

### `zrj(`java.util.List<ro.sync.ui.application.action.d>` arg0)`

**Returns:** `void`

### `getInitialPage()`

**Returns:** `java.lang.String`

### `getPageButton(`java.lang.String` arg0)`

**Returns:** [`ro.sync.exml.editor.pe`](./pe.md)

### `trj(`boolean` arg0)`

**Returns:** `void`

### `addEditorListener([`ro.sync.exml.editor.qg`](./qg.md) arg0)`

**Returns:** `void`

### `removeEditorListener([`ro.sync.exml.editor.qg`](./qg.md) arg0)`

**Returns:** `void`

### `getDocumentJavaEncoding()`

**Returns:** `java.lang.String`

### `getDocumentJavaEncoding(`java.util.List` arg0)`

**Returns:** `java.lang.String`

### `saveInWriter(`java.io.Writer` arg0, `java.net.URL` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `createReaderFromCurrentPage([`ro.sync.exml.editor.mb`](./mb.md) arg0, `boolean` arg1)`

**Returns:** [`ro.sync.basic.io.NonCloseableReader`](../../basic/io/NonCloseableReader.md)

### `checkForChange()`

**Returns:** `int`

### `revert()`

**Returns:** `void`

### `revert(`boolean` arg0)`

**Returns:** `void`

### `acceptRevert()`

**Returns:** `boolean`

### `readDocument(`java.io.Reader` arg0, `java.net.URL` arg1, `boolean` arg2)`

**Returns:** `void`

### `decideInitialPage(`java.io.Reader` arg0, `java.net.URL` arg1)`

**Returns:** `java.io.Reader`

### `krj()`

**Returns:** `void`

### `fireEditorReLoaded()`

**Returns:** `void`

### `fsj()`

**Returns:** `void`

### `getPluggableMenuItems()`

**Returns:** `java.util.List`

### `grj(`java.util.List<ro.sync.ui.application.action.d>` arg0)`

**Returns:** `java.util.List<ro.sync.ui.application.menu.g>`

### `getCurrentPage()`

**Returns:** [`ro.sync.exml.editor.mb`](./mb.md)

### `getEditorPage(`java.lang.String` arg0)`

**Returns:** [`ro.sync.exml.editor.mb`](./mb.md)

### `perspectiveChanged(`int` arg0)`

**Returns:** `void`

### `esj(`java.net.URL` arg0)`

**Returns:** `void`

### `setLoadedURL(`java.net.URL` arg0)`

**Returns:** `void`

### `yrj()`

**Returns:** `void`

### `dsj()`

**Returns:** `void`

### `hsj()`

**Returns:** `void`

### `getStatusModel()`

**Returns:** [`ro.sync.exml.editor.s.c`](s/c.md)

### `showLocation([`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg0, `boolean` arg1)`

**Returns:** `void`

### `getContentType()`

**Returns:** `java.lang.String`

### `toString()`

**Returns:** `java.lang.String`

### `getOpenFrameCount()`

**Returns:** `int`

### `updateChangeTime()`

**Returns:** `void`

### `getComponent()`

**Returns:** `javax.swing.JComponent`

### `getContentLength()`

**Returns:** `int`

### `getPersistenceManager()`

**Returns:** [`ro.sync.exml.editor.we`](./we.md)

### `setUseProgressOnSave(`boolean` arg0)`

**Returns:** `void`

### `getDefaultJavaEncoding()`

**Returns:** `java.lang.String`

### `requestFocusInEditor()`

**Returns:** `void`

### `getOperationInProgressSemaphore()`

**Returns:** [`ro.sync.basic.util.concurrent.Semaphore`](../../basic/util/concurrent/Semaphore.md)

### `getEditorManager()`

**Returns:** [`ro.sync.exml.editor.bb`](./bb.md)

### `getParentFrame()`

**Returns:** `java.awt.Frame`

### `discardAllUndoableEdits()`

**Returns:** `void`

### `addUndoableEditListener(`javax.swing.event.UndoableEditListener` arg0)`

**Returns:** `void`

### `getPropertiesMap()`

**Returns:** `java.util.LinkedHashMap<java.lang.String,java.lang.String>`

### `isPlaceHolderEditor()`

**Returns:** `boolean`

### `fillPropertiesMap(`java.util.Map<java.lang.String,java.lang.String>` arg0)`

**Returns:** `void`

### `fillTransformationProperties(`java.util.Map<java.lang.String,java.lang.String>` arg0)`

**Returns:** `void`

### `fillValidationProperties(`java.util.Map<java.lang.String,java.lang.String>` arg0)`

**Returns:** `void`

### `getFileSaver()`

**Returns:** [`ro.sync.exml.editor.u.c`](u/c.md)

### `getFileChangeWatcher()`

**Returns:** [`ro.sync.exml.b.e`](../b/e.md)

### `setClearUndoBufferOnSave(`boolean` arg0)`

**Returns:** `void`

### `getAction(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `javax.swing.AbstractAction`

### `changeModifiedStatus(`java.lang.String` arg0, `int` arg1)`

**Returns:** `java.lang.String`

### `getAdditionalDockableViewer(`int` arg0)`

**Returns:** [`ro.sync.exml.editor.mc`](./mc.md)

### `setUseValidationAsYouType(`boolean` arg0)`

**Returns:** `void`

### `setValidationAsYouTypeSecondsDelay(`int` arg0)`

**Returns:** `void`

### `setValidationAsYouTypeMiliSecondsDelay(`int` arg0)`

**Returns:** `void`

### `editorSelected(`boolean` arg0, `boolean` arg1)`

**Returns:** `void`

### `isCurrentSelected()`

**Returns:** `boolean`

### `setSelectedBorder(`boolean` arg0)`

**Returns:** `void`

### `getSaveAsFileExtensions()`

**Returns:** `java.lang.String[]`

### `jrj()`

**Returns:** `void`

### `generateDocumentation()`

**Returns:** `void`

### `isGenerateDocumentationSupported()`

**Returns:** `boolean`

### `changePage(`java.lang.String` arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `vrj([`ro.sync.exml.editor.mb`](./mb.md) arg0)`

**Returns:** `void`

### `frj([`ro.sync.exml.editor.mb`](./mb.md) arg0)`

**Returns:** `void`

### `changePage(`java.lang.String` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4)`

**Returns:** `void`

### `gsj()`

**Returns:** `boolean`

### `updateIDValuesAfterSwitchPage([`ro.sync.exml.editor.mb`](./mb.md) arg0, [`ro.sync.exml.editor.mb`](./mb.md) arg1)`

**Returns:** `void`

### `createEditorPages()`

**Returns:** `java.util.List<ro.sync.exml.editor.mb>`

### `createTextPage()`

**Returns:** [`ro.sync.exml.editor.pagetext.g`](pagetext/g.md)

### `getCurrentPageID()`

**Returns:** `java.lang.String`

### `resetOpenFrameCountForTests()`

**Returns:** `void`

### `getSystemId()`

**Returns:** `java.lang.String`

### `hrj([`ro.sync.exml.editor.mb`](./mb.md) arg0)`

**Returns:** `java.util.List<ro.sync.ui.application.menu.g>`

### `getTextPage()`

**Returns:** [`ro.sync.exml.editor.pagetext.g`](pagetext/g.md)

### `getSyntaxDocumentProvider()`

**Returns:** [`ro.sync.exml.editor.xmleditor.e.b.n`](xmleditor/e/b/n.md)

### `getEditorLocation()`

**Returns:** `java.net.URL`

### `createReader()`

**Returns:** [`ro.sync.basic.io.NonCloseableReader`](../../basic/io/NonCloseableReader.md)

### `nrj()`

**Returns:** `void`

### `setContent([`ro.sync.basic.io.NonCloseableReader`](../../basic/io/NonCloseableReader.md) arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `setContent([`ro.sync.basic.io.NonCloseableReader`](../../basic/io/NonCloseableReader.md) arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** `void`

### `getEditorPages()`

**Returns:** [`ro.sync.exml.editor.mb[]`](./mb.md)

### `getSelectedText()`

**Returns:** `java.lang.String`

### `getContent()`

**Returns:** `java.lang.String`

### `getPrettyPrintAnalyser()`

**Returns:** [`ro.sync.exml.editor.k.c`](k/c.md)

### `undoableEditHappened(`javax.swing.event.UndoableEditEvent` arg0)`

**Returns:** `void`

### `addDropHandler([`ro.sync.ui.k.f`](../../ui/k/f.md) arg0)`

**Returns:** `void`

### `setFileEverSaved(`boolean` arg0)`

**Returns:** `void`

### `setEditorListener([`ro.sync.exml.editor.db`](./db.md) arg0)`

**Returns:** `void`

### `pageTextSelected([`ro.sync.exml.editor.mb`](./mb.md) arg0)`

**Returns:** `void`

### `pageEdited([`ro.sync.exml.editor.mb`](./mb.md) arg0, `boolean` arg1, `int` arg2, `int` arg3)`

**Returns:** `void`

### `getDocumentTypeProvider()`

**Returns:** [`ro.sync.exml.editor.xmleditor.db`](xmleditor/db.md)

### `getDefaultSchemaManagerUsage()`

**Returns:** `int`

### `isInitialized()`

**Returns:** `boolean`

### `isToolbarAvailable(`java.lang.String` arg0)`

**Returns:** `boolean`

### `getToolbarComponents(`java.lang.String` arg0)`

**Returns:** [`ro.sync.ui.i.c`](../../ui/i/c.md)

### `getToolbarComponentsContainer(`java.lang.String` arg0, `java.util.List<java.lang.String[]>` arg1)`

**Returns:** [`ro.sync.ui.i.c`](../../ui/i/c.md)

### `extensionComponentsChanged()`

**Returns:** `void`

### `updateExtensionMenu([`ro.sync.ui.application.menu.g`](../../ui/application/menu/g.md) arg0)`

**Returns:** `void`

### `isExtensionMenuAvailable()`

**Returns:** `boolean`

### `rrj(`java.lang.String` arg0)`

**Returns:** `boolean`

### `erj([`ro.sync.exml.editor.pb`](./pb.md) arg0, `boolean` arg1)`

**Returns:** `void`

### `asj(`boolean` arg0)`

**Returns:** `boolean`

### `orj(`boolean` arg0)`

**Returns:** `void`

### `setShowPagesSwitch(`boolean` arg0)`

**Returns:** `void`

### `isPagesSwitchEnabled()`

**Returns:** `boolean`

### `setInitialPage([`ro.sync.exml.editor.df`](./df.md) arg0)`

**Returns:** `void`

### `addStatusModelListener([`ro.sync.exml.editor.s.g`](s/g.md) arg0)`

**Returns:** `void`

### `goToReference(`java.lang.String` arg0)`

**Returns:** `void`

### `goToReferenceInternal(`java.lang.String` arg0)`

**Returns:** `void`

### `getAdditionalURLsToCheckForChange()`

**Returns:** `java.net.URL[]`

### `getRefreshSupport()`

**Returns:** [`ro.sync.exml.editor.h`](./h.md)

### `saveCurrentPosition()`

**Returns:** `void`

### `reconfigureReadOnly()`

**Returns:** `void`

### `restoreLastSavedPosition()`

**Returns:** `void`

### `setModifiedSincePageChanged(`boolean` arg0)`

**Returns:** `void`

### `getModificationTimeStamp()`

**Returns:** `long`

### `isReadOnly()`

**Returns:** `boolean`

### `lrj()`

**Returns:** `boolean`

### `irj()`

**Returns:** `boolean`

### `xrj()`

**Returns:** [`ro.sync.exml.editor.dd._b`](dd/_b.md)

### `setCanEditReadOnlyFiles(`boolean` arg0)`

**Returns:** `void`

### `setCaretPosition([`ro.sync.exml.editor.Anchor`](./Anchor.md) arg0)`

**Returns:** `void`

### `reloadContent(`java.io.Reader` arg0, `boolean` arg1)`

**Returns:** `void`

### `reload(`java.net.URL` arg0)`

**Returns:** `boolean`

### `reload(`java.net.URL` arg0, `boolean` arg1)`

**Returns:** `boolean`

### `reload(`java.net.URL` arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `boolean`

### `getLargeDocumentMode()`

**Returns:** [`ro.sync.exml.editor.n`](./n.md)

### `setLargeDocumentMode([`ro.sync.exml.editor.n`](./n.md) arg0)`

**Returns:** `void`

### `setLongLineDocument(`boolean` arg0)`

**Returns:** `void`

### `isLongLineDocument()`

**Returns:** `boolean`

### `getBackupStorage()`

**Returns:** [`ro.sync.exml.editor.gb`](./gb.md)

### `setDocumentTypeInitialPage(`java.lang.String` arg0)`

**Returns:** `void`

### `getDocumentTypeInitialPage()`

**Returns:** `java.lang.String`

### `setPersistenceManagerForTests([`ro.sync.exml.editor.we`](./we.md) arg0)`

**Returns:** `void`

### `setCustomQueryParams(`java.util.Map<java.lang.String,java.lang.String>` arg0)`

**Returns:** `void`

### `getCustomQueryParameters()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `getCustomOxygenQueryParams()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `highlightLocation([`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg0, `java.lang.String` arg1, [`ro.sync.exml.editor.zf`](./zf.md) arg2, `boolean` arg3)`

**Returns:** `java.lang.Object`

### `removeAllHighlights(`java.lang.String` arg0)`

**Returns:** `void`

### `removeHighlight(`java.lang.String` arg0, `java.lang.Object` arg1)`

**Returns:** `void`

### `prj(`java.lang.String[]` arg0)`

**Returns:** `void`

### `qrj(`java.lang.String` arg0)`

**Returns:** `boolean`

### `bsj(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `getAvailablePages(`int` arg0)`

**Returns:** `java.lang.String[]`

### `setFixedTitle(`java.lang.String` arg0)`

**Returns:** `void`

### `setFixedTooltip(`java.lang.String` arg0)`

**Returns:** `void`

### `addSaveListener([`ro.sync.exml.editor.ib`](./ib.md) arg0)`

**Returns:** `void`

### `removeSaveListener([`ro.sync.exml.editor.ib`](./ib.md) arg0)`

**Returns:** `void`

### `addPrioritySaveListener([`ro.sync.exml.editor.ib`](./ib.md) arg0)`

**Returns:** `void`

### `removePrioritySaveListener([`ro.sync.exml.editor.ib`](./ib.md) arg0)`

**Returns:** `void`

### `changeEditorIcon(`java.lang.String` arg0)`

**Returns:** `void`

### `changePage(`java.lang.String` arg0)`

**Returns:** `void`

### `addValidationProblemsFilter([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](../workspace/api/editor/validation/ValidationProblemsFilter.md) arg0)`

**Returns:** `void`

### `removeValidationProblemsFilter([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](../workspace/api/editor/validation/ValidationProblemsFilter.md) arg0)`

**Returns:** `void`

### `setBounds(`int` arg0, `int` arg1, `int` arg2, `int` arg3)`

**Returns:** `void`

### `setBounds(`java.awt.Rectangle` arg0)`

**Returns:** `void`

### `processLastEditorBounds()`

**Returns:** `void`

### `isEnableSetBoundsInEditor()`

**Returns:** `boolean`

### `setEnableSetBoundsInEditor(`boolean` arg0)`

**Returns:** `void`

### `setEncodingDetectedOnOpen(`java.lang.String` arg0)`

**Returns:** `void`

### `isEditorClosed()`

**Returns:** `boolean`

### `showInfoPanel([`ro.sync.exml.editor.h.f`](h/f.md) arg0)`

**Returns:** `void`

### `hideInfoPanel()`

**Returns:** `void`

### `getInfoPanel()`

**Returns:** [`ro.sync.exml.editor.h.f`](h/f.md)

### `checkAdditionalConnectionParams([`ro.sync.exml.editor.yg`](./yg.md) arg0)`

**Returns:** `void`

### `runTransformationScenarios(`java.lang.String[]` arg0, [`ro.sync.exml.workspace.api.editor.transformation.TransformationFeedback`](../workspace/api/editor/transformation/TransformationFeedback.md) arg1)`

**Returns:** `void`

### `stopCurrentTransformationScenario()`

**Returns:** `void`

### `runTransformationScenario(`java.lang.String` arg0, `java.util.Map<java.lang.String,java.lang.String>` arg1, [`ro.sync.exml.workspace.api.editor.transformation.TransformationFeedback`](../workspace/api/editor/transformation/TransformationFeedback.md) arg2)`

**Returns:** `void`

### `runValidationScenarios(`java.lang.String[]` arg0)`

**Returns:** `java.lang.Thread`

### `getCurrentAuthorName()`

**Returns:** `java.lang.String`

### `createInputStream()`

**Returns:** `java.io.InputStream`

### `createSaveInWriter(`java.io.OutputStream` arg0)`

**Returns:** `java.io.Writer`

### `clearQuickFixes()`

**Returns:** `void`

### `getReloadAction()`

**Returns:** [`ro.sync.ui.application.action.d`](../../ui/application/action/d.md)

### `localResourceLockingOptionChanged(`boolean` arg0, `boolean` arg1)`

**Returns:** `void`

### `isEditable()`

**Returns:** `boolean`

### `setEditable(`boolean` arg0)`

**Returns:** `void`

### `getKeyScopeContextProvider()`

**Returns:** [`ro.sync.ecss.dita.reference.keyref.c.b`](../../ecss/dita/reference/keyref/c/b.md)

### `setFirstRead(`boolean` arg0)`

**Returns:** `void`

### `isOpened()`

**Returns:** `boolean`

### `prepareReaderForLoadPage(`java.io.Reader` arg0, `java.lang.String` arg1)`

**Returns:** `java.io.Reader`

### `createProgressReader(`java.io.Reader` arg0, `boolean` arg1, `int` arg2)`

**Returns:** `java.io.Reader`

### `changePageOnButtonSwitch(`java.lang.String` arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `isPageSwitchOnThreadInProgress()`

**Returns:** `boolean`

### `setReviewDocumentsNavigatorProvider([`ro.sync.ecss.component.ui.b.b.d`](../../ecss/component/ui/b/b/d.md) arg0)`

**Returns:** `void`

### `getReviewDocumentsNavigator()`

**Returns:** [`ro.sync.ecss.component.ui.b.b.b`](../../ecss/component/ui/b/b/b.md)

### `revertFromPage()`

**Returns:** `void`

### `getFrameworkDetectedModuleTypes()`

**Returns:** [`ro.sync.exml.modules.b.i[]`](../modules/b/i.md)

### `saveOnThread()`

**Returns:** `void`

