# Interface: `mb`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.mb`

**Extends:** [`ro.sync.exml.editor.EditorPageConstants`](./EditorPageConstants.md), [`ro.sync.ui.marks.r`](../../ui/marks/r.md), [`ro.sync.exml.x`](../x.md), [`ro.sync.ecss.extensions.ContentReloader`](../../ecss/extensions/ContentReloader.md), [`ro.sync.exml.editor.i.g`](i/g.md), [`ro.sync.exml.editor.mh`](./mh.md), [`ro.sync.exml.editor.ag`](./ag.md), [`ro.sync.exml.editor.pagetext.CaretListenerHandler`](pagetext/CaretListenerHandler.md), [`ro.sync.ui.application.HelpPageProvider`](../../ui/application/HelpPageProvider.md), [`ro.sync.exml.editor.fc`](./fc.md), [`ro.sync.ecss.component.ui.f.k`](../../ecss/component/ui/f/k.md)

## Methods

### `addEditorPageListener([`ro.sync.exml.editor.lc`](./lc.md) arg0)`

**Returns:** `void`

### `getParentEditor()`

**Returns:** [`ro.sync.exml.editor.l`](./l.md)

### `createReader(`boolean` arg0)`

**Returns:** [`ro.sync.basic.io.NonCloseableReader`](../../basic/io/NonCloseableReader.md)

### `getCCManager()`

**Returns:** [`ro.sync.contentcompletion.z`](../../contentcompletion/z.md)

### `editorPageDeactivated()`

**Returns:** `void`

### `setUsedFont(`java.awt.Font` arg0)`

**Returns:** `void`

### `getSelectedText()`

**Returns:** `java.lang.String`

### `getAction(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `javax.swing.AbstractAction`

### `getAdditionalDockableViewer(`int` arg0)`

**Returns:** [`ro.sync.exml.editor.mc`](./mc.md)

### `print(`boolean` arg0)`

**Returns:** `void`

### `saveCurrentPosition()`

**Returns:** `void`

### `restoreLastSavedPosition()`

**Returns:** `void`

### `revert()`

**Returns:** `void`

### `loadPage(`java.net.URL` arg0, `java.io.Reader` arg1, [`ro.sync.exml.editor.eb`](./eb.md) arg2)`

**Returns:** `void`

### `getPageID()`

**Returns:** `java.lang.String`

### `getPluggableMenuActions()`

**Returns:** `java.util.List`

### `perspectiveChanged(`int` arg0)`

**Returns:** `void`

### `showLocation([`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `requestFocusInPage()`

**Returns:** `void`

### `putProperties(`java.util.Map` arg0)`

**Returns:** `void`

### `getTitleTag()`

**Returns:** `java.lang.String`

### `getToolTip()`

**Returns:** `java.lang.String`

### `wasModifiedSincePageChanged()`

**Returns:** `boolean`

### `mustReload()`

**Returns:** `boolean`

### `editorWillBeClosed()`

**Returns:** `void`

### `editorWasSelected(`boolean` arg0)`

**Returns:** `void`

### `discardAllUndoableEdits()`

**Returns:** `void`

### `setModifiedSincePageChanged(`boolean` arg0)`

**Returns:** `void`

### `setMustReload(`boolean` arg0)`

**Returns:** `void`

### `getContentLength()`

**Returns:** `int`

### `addDropHandler([`ro.sync.ui.k.f`](../../ui/k/f.md) arg0)`

**Returns:** `void`

### `removeDropHandler([`ro.sync.ui.k.f`](../../ui/k/f.md) arg0)`

**Returns:** `void`

### `getAdditionalURLsToCheckForChange()`

**Returns:** `java.net.URL[]`

### `createDocumentTypeChecker()`

**Returns:** [`ro.sync.exml.editor.xmleditor.v`](xmleditor/v.md)

### `getRefreshSupport()`

**Returns:** [`ro.sync.exml.editor.h`](./h.md)

### `isToolbarAvailable(`java.lang.String` arg0)`

**Returns:** `boolean`

### `getToolbarComponents(`java.lang.String` arg0)`

**Returns:** [`ro.sync.ui.i.c`](../../ui/i/c.md)

### `getToolbarComponentsContainer(`java.lang.String` arg0, `java.util.List<java.lang.String[]>` arg1)`

**Returns:** [`ro.sync.ui.i.c`](../../ui/i/c.md)

### `updateExtensionMenu([`ro.sync.ui.application.menu.g`](../../ui/application/menu/g.md) arg0)`

**Returns:** `void`

### `isExtensionMenuAvailable()`

**Returns:** `boolean`

### `getPosition([`ro.sync.exml.editor.Anchor`](./Anchor.md) arg0)`

**Returns:** `int`

### `createAnchor(`int` arg0)`

**Returns:** [`ro.sync.exml.editor.Anchor`](./Anchor.md)

### `pageWasSelected(`boolean` arg0)`

**Returns:** `void`

### `isInitialized()`

**Returns:** `boolean`

### `restoreBookMark(`java.lang.String` arg0, [`ro.sync.exml.editor.Anchor`](./Anchor.md) arg1)`

**Returns:** `void`

### `getBookMarkable()`

**Returns:** [`ro.sync.ui.marks.d`](../../ui/marks/d.md)

### `setVisibleBookmarkStripe(`boolean` arg0)`

**Returns:** `void`

### `isActivePage()`

**Returns:** `boolean`

### `getElementIterator()`

**Returns:** [`ro.sync.exml.editor.cd`](./cd.md)

### `getFallbackLocatorProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocatorProvider`](../../ecss/extensions/api/link/ElementLocatorProvider.md)

### `documentLoaded()`

**Returns:** `void`

### `reconfigureReadOnly()`

**Returns:** `void`

### `getExpansionModel()`

**Returns:** `java.lang.Object`

### `restoreExpansionModel(`java.lang.Object` arg0)`

**Returns:** `void`

### `wasLoaded()`

**Returns:** `boolean`

### `getPageAccess()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../workspace/api/editor/page/WSEditorPage.md)

### `addHighlight(`java.lang.String` arg0, `int` arg1, `int` arg2, [`ro.sync.exml.editor.zf`](./zf.md) arg3, `boolean` arg4)`

**Returns:** `java.lang.Object`

### `addHighlight([`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg0, `java.lang.String` arg1, [`ro.sync.exml.editor.zf`](./zf.md) arg2, `boolean` arg3)`

**Returns:** `java.lang.Object`

### `removeHighlight(`java.lang.String` arg0, `java.lang.Object` arg1)`

**Returns:** `void`

### `removeAllHighlights(`java.lang.String` arg0)`

**Returns:** `void`

### `scrollCursorLineToMiddle()`

**Returns:** `void`

### `stopCellEditing()`

**Returns:** `void`

### `postEdit(`javax.swing.undo.UndoableEdit` arg0)`

**Returns:** `void`

### `getMarkersManager()`

**Returns:** [`ro.sync.exml.editor.ob.e`](ob/e.md)

### `setVisibleRangeRuller(`boolean` arg0)`

**Returns:** `void`

### `markSaveOperationEdit()`

**Returns:** `void`

### `getUndoManager()`

**Returns:** `javax.swing.undo.UndoManager`

### `resetSavedOperationEdit()`

**Returns:** `void`

### `clearQuickFixes()`

**Returns:** `void`

