# Class: `d`

**Package:** [`ro.sync.ecss.extensions`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.d`

**Implements:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../../exml/workspace/api/editor/page/author/WSAuthorEditorPage.md)

## Fields

### `vqx`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)

## Constructors

### `<init>([`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md) arg0)`

## Methods

### `getChangeTrackingController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](api/AuthorChangeTrackingController.md)

### `getDocumentController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](api/AuthorDocumentController.md)

### `getOptionsStorage()`

**Returns:** [`ro.sync.ecss.extensions.api.OptionsStorage`](api/OptionsStorage.md)

### `getOutlineAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`](api/access/AuthorOutlineAccess.md)

### `getTableAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorTableAccess`](api/access/AuthorTableAccess.md)

### `addAuthorCaretListener([`ro.sync.ecss.extensions.api.AuthorCaretListener`](api/AuthorCaretListener.md) arg0)`

**Returns:** `void`

### `addAuthorMouseListener([`ro.sync.ecss.extensions.api.AuthorMouseListener`](api/AuthorMouseListener.md) arg0)`

**Returns:** `void`

### `getHighlighter()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](api/highlights/AuthorHighlighter.md)

### `getPersistentHighlighter()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlighter`](api/highlights/AuthorPersistentHighlighter.md)

### `refresh([`ro.sync.ecss.extensions.api.node.AuthorNode`](api/node/AuthorNode.md) arg0)`

**Returns:** `void`

### `refresh()`

**Returns:** `void`

### `removeAuthorCaretListener([`ro.sync.ecss.extensions.api.AuthorCaretListener`](api/AuthorCaretListener.md) arg0)`

**Returns:** `void`

### `removeAuthorMouseListener([`ro.sync.ecss.extensions.api.AuthorMouseListener`](api/AuthorMouseListener.md) arg0)`

**Returns:** `void`

### `viewToModel(`int` arg0, `int` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorViewToModelInfo`](api/AuthorViewToModelInfo.md)

### `deleteSelection()`

**Returns:** `void`

### `getCaretOffset()`

**Returns:** `int`

### `getLocationOnScreenAsPoint(`int` arg0, `int` arg1)`

**Returns:** [`ro.sync.exml.view.graphics.Point`](../../exml/view/graphics/Point.md)

### `getLocationRelativeToEditorFromScreen(`int` arg0, `int` arg1)`

**Returns:** [`ro.sync.exml.view.graphics.Point`](../../exml/view/graphics/Point.md)

### `getSelectedText()`

**Returns:** `java.lang.String`

### `getSelectionEnd()`

**Returns:** `int`

### `getSelectionStart()`

**Returns:** `int`

### `getWordAtCaret()`

**Returns:** `int[]`

### `hasSelection()`

**Returns:** `boolean`

### `modelToViewRectangle(`int` arg0)`

**Returns:** [`ro.sync.exml.view.graphics.Rectangle`](../../exml/view/graphics/Rectangle.md)

### `select(`int` arg0, `int` arg1)`

**Returns:** `void`

### `selectWord()`

**Returns:** `void`

### `setCaretPosition(`int` arg0)`

**Returns:** `void`

### `viewToModelOffset(`int` arg0, `int` arg1)`

**Returns:** `int`

### `setPopUpMenuCustomizer([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](api/structure/AuthorPopupMenuCustomizer.md) arg0)`

**Returns:** `void`

### `addPopUpMenuCustomizer([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](api/structure/AuthorPopupMenuCustomizer.md) arg0)`

**Returns:** `void`

### `removePopUpMenuCustomizer([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](api/structure/AuthorPopupMenuCustomizer.md) arg0)`

**Returns:** `void`

### `getReviewController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReviewController`](api/AuthorReviewController.md)

### `getBalancedSelectionEnd()`

**Returns:** `int`

### `getBalancedSelectionStart()`

**Returns:** `int`

### `getBalancedSelection(`int` arg0, `int` arg1)`

**Returns:** `int[]`

### `getDefaultAuthorSchemaAwareEditingHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`](api/AuthorSchemaAwareEditingHandler.md)

### `getActionsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.actions.AuthorActionsProvider`](../../exml/workspace/api/editor/page/author/actions/AuthorActionsProvider.md)

### `getAuthorComponent()`

**Returns:** `java.lang.Object`

### `setReadOnly(`java.lang.String` arg0)`

**Returns:** `void`

### `setReadOnly([`ro.sync.exml.workspace.api.editor.ReadOnlyReason`](../../exml/workspace/api/editor/ReadOnlyReason.md) arg0)`

**Returns:** `void`

### `setEditable(`boolean` arg0)`

**Returns:** `void`

### `isEditable()`

**Returns:** `boolean`

### `getStartEndOffsets([`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg0)`

**Returns:** `int[]`

### `scrollToRectangle([`ro.sync.exml.view.graphics.Rectangle`](../../exml/view/graphics/Rectangle.md) arg0)`

**Returns:** `void`

### `getStyles([`ro.sync.ecss.extensions.api.node.AuthorNode`](api/node/AuthorNode.md) arg0)`

**Returns:** [`ro.sync.ecss.css.Styles`](../css/Styles.md)

### `getPseudoElementStyles([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](api/node/AuthorParentNode.md) arg0)`

**Returns:** `java.util.Map<ro.sync.exml.workspace.api.editor.page.author.PseudoElementDescriptor,ro.sync.ecss.css.Styles>`

### `addAuthorAttributesDisplayFilter([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](api/attributes/AuthorAttributesDisplayFilter.md) arg0)`

**Returns:** `void`

### `removeAuthorAttributesDisplayFilter([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](api/attributes/AuthorAttributesDisplayFilter.md) arg0)`

**Returns:** `void`

### `getFullySelectedNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](api/node/AuthorNode.md)

### `getFullySelectedNode(`int` arg0, `int` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](api/node/AuthorNode.md)

### `getAuthorSelectionModel()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSelectionModel`](api/AuthorSelectionModel.md)

### `goToNextEditablePosition(`int` arg0, `int` arg1)`

**Returns:** `void`

### `editAttribute([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)

### `isOffsetInInvisibleBounds(`int` arg0)`

**Returns:** `boolean`

### `getAuthorFoldManager()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.fold.AuthorFoldManager`](../../exml/workspace/api/editor/page/author/fold/AuthorFoldManager.md)

### `moveOutOfInvisibleBounds(`int` arg0, `boolean` arg1)`

**Returns:** `int`

### `addDNDListener(`java.lang.Object` arg0)`

**Returns:** `void`

### `removeDNDListener(`java.lang.Object` arg0)`

**Returns:** `void`

### `setTagsDisplayMode(`int` arg0)`

**Returns:** `void`

### `getTagsDisplayMode()`

**Returns:** `int`

### `addTooltipCustomizer([`ro.sync.exml.workspace.api.editor.page.author.tooltip.AuthorTooltipCustomizer`](../../exml/workspace/api/editor/page/author/tooltip/AuthorTooltipCustomizer.md) arg0)`

**Returns:** `void`

### `removeTooltipCustomizer([`ro.sync.exml.workspace.api.editor.page.author.tooltip.AuthorTooltipCustomizer`](../../exml/workspace/api/editor/page/author/tooltip/AuthorTooltipCustomizer.md) arg0)`

**Returns:** `void`

### `scrollCaretToVisible()`

**Returns:** `void`

### `buildURLForReferencedContent(`int` arg0, `boolean` arg1)`

**Returns:** `java.net.URL`

### `createAnchor(`int` arg0)`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.Anchor`](../../exml/workspace/api/editor/page/Anchor.md)

### `getOffsetForAnchor([`ro.sync.exml.workspace.api.editor.page.Anchor`](../../exml/workspace/api/editor/page/Anchor.md) arg0)`

**Returns:** `int`

### `copy()`

**Returns:** `void`

