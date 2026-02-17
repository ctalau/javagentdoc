# Class: `r`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.r`

**Extends:** `javax.swing.JPanel`

**Implements:** [`ro.sync.exml.editor.mb`](./mb.md), [`ro.sync.exml.editor.qg`](./qg.md)

## Fields

### `messages`

**Type:** [`ro.sync.i18n.c`](../../i18n/c.md)

### `fne`

**Type:** [`org.slf4j.Logger`](../../../../org/slf4j/Logger.md)

### `allActions`

**Type:** `java.util.List<ro.sync.ui.application.action.d>`

### `parentEditor`

**Type:** [`ro.sync.exml.editor.l`](./l.md)

### `pageInitialized`

**Type:** `boolean`

### `ene`

**Type:** `boolean`

### `cne`

**Type:** `boolean`

### `dne`

**Type:** `java.util.List`

### `yme`

**Type:** `boolean`

### `bne`

**Type:** [`ro.sync.exml.editor.mc[]`](./mc.md)

### `ane`

**Type:** `java.util.Map<java.lang.String,ro.sync.exml.editor.projecteditingstate.MarkLocation>`

### `zme`

**Type:** `boolean`

### `contentOfPageLoadAlreadyCalled`

**Type:** `boolean`

### `editorIsLoading`

**Type:** `boolean`

### `gne`

**Type:** `boolean`

## Constructors

### `<init>([`ro.sync.exml.editor.l`](./l.md) arg0, `boolean` arg1)`

## Methods

### `jfd([`ro.sync.exml.editor.l`](./l.md) arg0)`

**Returns:** `void`

### `addEditorListener([`ro.sync.exml.editor.l`](./l.md) arg0)`

**Returns:** `void`

### `getSystemIDFromInternalModelForRevert()`

**Returns:** `java.lang.String`

### `getHelpPageID()`

**Returns:** `java.lang.String`

### `getGenericHelpPageID()`

**Returns:** `java.lang.String`

### `getAction(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `javax.swing.AbstractAction`

### `getAllActions()`

**Returns:** `java.util.Map<java.lang.String,javax.swing.Action>`

### `getIcon()`

**Returns:** `javax.swing.Icon`

### `loadPage(`java.net.URL` arg0, `java.io.Reader` arg1, [`ro.sync.exml.editor.eb`](./eb.md) arg2)`

**Returns:** `void`

### `loadPage(`java.net.URL` arg0, `java.io.Reader` arg1, [`ro.sync.exml.editor.eb`](./eb.md) arg2, `boolean` arg3)`

**Returns:** `void`

### `setDefaultOptions()`

**Returns:** `void`

### `loadPageData(`java.net.URL` arg0, `java.io.Reader` arg1, [`ro.sync.exml.editor.eb`](./eb.md) arg2)`

**Returns:** `void`

### `initPageComponents([`ro.sync.exml.editor.n`](./n.md) arg0)`

**Returns:** `void`

### `wasModifiedSincePageChanged()`

**Returns:** `boolean`

### `showLocation([`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `showLocation([`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg0, `boolean` arg1)`

**Returns:** `void`

### `editorWillStartToLoad()`

**Returns:** `void`

### `editorFinishedLoading(`boolean` arg0, `java.net.URL` arg1)`

**Returns:** `void`

### `editorWillBeClosed()`

**Returns:** `void`

### `editorWasClosed()`

**Returns:** `void`

### `editorWasSelected(`boolean` arg0)`

**Returns:** `void`

### `saveCurrentPosition()`

**Returns:** `void`

### `restoreLastSavedPosition()`

**Returns:** `void`

### `perspectiveChanged(`int` arg0)`

**Returns:** `void`

### `putProperties(`java.util.Map` arg0)`

**Returns:** `void`

### `addEditorPageListener([`ro.sync.exml.editor.lc`](./lc.md) arg0)`

**Returns:** `void`

### `firePageEdited(`boolean` arg0, `int` arg1, `int` arg2)`

**Returns:** `void`

### `firePageTextSelected()`

**Returns:** `void`

### `getParentEditor()`

**Returns:** [`ro.sync.exml.editor.l`](./l.md)

### `getAdditionalDockableViewer(`int` arg0)`

**Returns:** [`ro.sync.exml.editor.mc`](./mc.md)

### `mustReload()`

**Returns:** `boolean`

### `setMustReload(`boolean` arg0)`

**Returns:** `void`

### `setModifiedSincePageChanged(`boolean` arg0)`

**Returns:** `void`

### `revert()`

**Returns:** `void`

### `saveBookmarks()`

**Returns:** `java.util.Map<java.lang.String,ro.sync.exml.editor.projecteditingstate.MarkLocation>`

### `restoreBookmarks(`java.util.Map` arg0)`

**Returns:** `void`

### `revertInternal()`

**Returns:** `void`

### `getAdditionalURLsToCheckForChange()`

**Returns:** `java.net.URL[]`

### `updateUI()`

**Returns:** `void`

### `createAdditionalDockableViewer()`

**Returns:** [`ro.sync.exml.editor.mc[]`](./mc.md)

### `createSearchable(`boolean` arg0)`

**Returns:** [`ro.sync.find.bb`](../../find/bb.md)

### `getRefreshSupport()`

**Returns:** [`ro.sync.exml.editor.h`](./h.md)

### `setAlwaysShowValidationStatusPanel(`boolean` arg0)`

**Returns:** `void`

### `getAllBookMarksLocations()`

**Returns:** `java.util.Map<java.lang.String,ro.sync.exml.editor.projecteditingstate.MarkLocation>`

### `restoreBookMark(`java.lang.String` arg0, [`ro.sync.exml.editor.Anchor`](./Anchor.md) arg1)`

**Returns:** `void`

### `createBookMark(`java.lang.String` arg0, `int` arg1)`

**Returns:** [`ro.sync.ui.marks.s`](../../ui/marks/s.md)

### `getAllBookMarks()`

**Returns:** [`ro.sync.ui.marks.s[]`](../../ui/marks/s.md)

### `gotoBookMark(`java.lang.String` arg0)`

**Returns:** `void`

### `hasBookMark(`java.lang.String` arg0)`

**Returns:** `boolean`

### `removeAllBookMarks()`

**Returns:** `void`

### `removeBookMark(`java.lang.String` arg0)`

**Returns:** `void`

### `createBookMark(`java.lang.String` arg0)`

**Returns:** [`ro.sync.ui.marks.s`](../../ui/marks/s.md)

### `isActivePage()`

**Returns:** `boolean`

### `modifiedStateChanged([`ro.sync.document.Descriptor`](../../document/Descriptor.md) arg0)`

**Returns:** `void`

### `loadedFileChanged([`ro.sync.document.Descriptor`](../../document/Descriptor.md) arg0)`

**Returns:** `void`

### `getFallbackLocatorProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocatorProvider`](../../ecss/extensions/api/link/ElementLocatorProvider.md)

### `addCaretListener(`javax.swing.event.CaretListener` arg0)`

**Returns:** `void`

### `removeCaretListener(`javax.swing.event.CaretListener` arg0)`

**Returns:** `void`

### `getCaretOffset()`

**Returns:** `int`

### `documentLoaded()`

**Returns:** `void`

### `reloadContent(`java.io.Reader` arg0, `boolean` arg1)`

**Returns:** `void`

### `discardEditsOnReload()`

**Returns:** `boolean`

### `wasLoaded()`

**Returns:** `boolean`

### `addScrollListener(`java.awt.event.AdjustmentListener` arg0, `boolean` arg1)`

**Returns:** `void`

### `removeScrollListener(`java.awt.event.AdjustmentListener` arg0, `boolean` arg1)`

**Returns:** `void`

### `getAdjustable(`boolean` arg0)`

**Returns:** `java.awt.Adjustable`

### `urlsDropped(`java.util.List<java.net.URL>` arg0, [`ro.sync.exml.editor.qb`](./qb.md) arg1, `int` arg2)`

**Returns:** `boolean`

### `urlsDragged([`ro.sync.exml.editor.qb`](./qb.md) arg0, `int` arg1)`

**Returns:** `boolean`

### `scrollCursorLineToMiddle()`

**Returns:** `void`

### `stopCellEditing()`

**Returns:** `void`

### `addAction([`ro.sync.ui.application.action.d`](../../ui/application/action/d.md) arg0)`

**Returns:** `void`

### `addAction([`ro.sync.ui.application.action.d`](../../ui/application/action/d.md) arg0, `boolean` arg1)`

**Returns:** `void`

### `removeAction([`ro.sync.ui.application.action.d`](../../ui/application/action/d.md) arg0)`

**Returns:** `void`

### `addActions(`java.util.List<ro.sync.ui.application.action.d>` arg0)`

**Returns:** `void`

### `getAllActionsIterator()`

**Returns:** `java.util.Iterator<ro.sync.ui.application.action.d>`

### `getMarkersManager()`

**Returns:** [`ro.sync.exml.editor.ob.e`](ob/e.md)

### `isReverting()`

**Returns:** `boolean`

### `setIsReverting(`boolean` arg0)`

**Returns:** `void`

### `clearQuickFixes()`

**Returns:** `void`

### `getToolbarComponentsContainer(`java.lang.String` arg0, `java.util.List<java.lang.String[]>` arg1)`

**Returns:** [`ro.sync.ui.i.c`](../../ui/i/c.md)

### `getToolbarComponentsContainer(`java.lang.String` arg0, `java.util.List<java.lang.String[]>` arg1, [`ro.sync.exml.editor.fh`](./fh.md) arg2, `java.lang.String[]` arg3)`

**Returns:** [`ro.sync.ui.i.c`](../../ui/i/c.md)

### `clearCaches()`

**Returns:** `void`

### `setVisibleBookmarkStripe(`boolean` arg0)`

**Returns:** `void`

### `setVisibleRangeRuller(`boolean` arg0)`

**Returns:** `void`

### `performRefreshReferences()`

**Returns:** `void`

