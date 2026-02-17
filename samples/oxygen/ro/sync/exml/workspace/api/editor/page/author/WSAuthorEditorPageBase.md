# Interface: `WSAuthorEditorPageBase`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPageBase`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSTextBasedEditorPage`](../WSTextBasedEditorPage.md), [`ro.sync.exml.workspace.api.editor.page.author.tooltip.AuthorTooltipCustomizerProvider`](tooltip/AuthorTooltipCustomizerProvider.md)

## Description

## Methods

### `viewToModel(`int` x, `int` y)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorViewToModelInfo`](../../../../../../ecss/extensions/api/AuthorViewToModelInfo.md)

### `setPopUpMenuCustomizer([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](../../../../../../ecss/extensions/api/structure/AuthorPopupMenuCustomizer.md) popUpCustomizer)`

**Returns:** `void`

### `addPopUpMenuCustomizer([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](../../../../../../ecss/extensions/api/structure/AuthorPopupMenuCustomizer.md) popUpCustomizer)`

**Returns:** `void`

### `removePopUpMenuCustomizer([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](../../../../../../ecss/extensions/api/structure/AuthorPopupMenuCustomizer.md) popUpCustomizer)`

**Returns:** `void`

### `addAuthorMouseListener([`ro.sync.ecss.extensions.api.AuthorMouseListener`](../../../../../../ecss/extensions/api/AuthorMouseListener.md) mouseListener)`

**Returns:** `void`

### `removeAuthorMouseListener([`ro.sync.ecss.extensions.api.AuthorMouseListener`](../../../../../../ecss/extensions/api/AuthorMouseListener.md) mouseListener)`

**Returns:** `void`

### `addAuthorCaretListener([`ro.sync.ecss.extensions.api.AuthorCaretListener`](../../../../../../ecss/extensions/api/AuthorCaretListener.md) caretListener)`

**Returns:** `void`

### `removeAuthorCaretListener([`ro.sync.ecss.extensions.api.AuthorCaretListener`](../../../../../../ecss/extensions/api/AuthorCaretListener.md) caretListener)`

**Returns:** `void`

### `refresh([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md) authorNode)`

**Returns:** `void`

**Note:** This should be called on the AWT thread because it will generate a layout event.

### `refresh()`

**Returns:** `void`

### `getHighlighter()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../../../../../ecss/extensions/api/highlights/AuthorHighlighter.md)

### `getPersistentHighlighter()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlighter`](../../../../../../ecss/extensions/api/highlights/AuthorPersistentHighlighter.md)

Persistent highlights get serialized in the XML as processing instructions with the form:
 

 `<?oxy_custom_start prop1="val1"....?> xml content <?oxy_custom_end?>`

### `getBalancedSelectionStart()`

**Returns:** `int`

If the selection start is immediately to the right of a start tag and the corresponding end tag 
 is contained in the selection, then the balanced selection start will be obtained by extending
 the selection start to contain the start tag.

### `getBalancedSelectionEnd()`

**Returns:** `int`

The offset is **exclusive**
 

 If the selection end is immediately to the left of a end tag and the corresponding start tag 
 is contained in the selection, then the balanced selection end will be obtained by extending
 the selection end to contain the end tag. If the selection end is to the right of a tag which does not have the 
 start included in the selection, then the selection end is decreased.

### `getBalancedSelection(`int` selectionStart, `int` selectionEnd)`

**Returns:** `int[]`

If the selection start is immediately to the right of a start tag and the corresponding end tag 
 is contained in the selection, then the balanced selection start will be obtained by extending
 the selection start to contain the start tag. If the selection end is immediately 
 to the left of a end tag and the corresponding start tag is contained in the selection, 
 then the balanced selection end will be obtained by extending the selection 
 end to contain the end tag.

### `getDefaultAuthorSchemaAwareEditingHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`](../../../../../../ecss/extensions/api/AuthorSchemaAwareEditingHandler.md)

This can be used from a custom AuthorSchemaAwareEditingHandler implementation from an ExtensionsBundle to delegate various operations to.

### `getActionsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.actions.AuthorActionsProvider`](actions/AuthorActionsProvider.md)

### `getAuthorComponent()`

**Returns:** `java.lang.Object`

Use of this method is discouraged but it may be useful in some cases like:
 
 This can be helpful when you want to set a busy cursor on the component for example or when you want to get access to the scroll bars.
 You can also request focus in the component by casting it to its native equivalent.

### `getStyles([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md) node)`

**Returns:** [`ro.sync.ecss.css.Styles`](../../../../../../ecss/css/Styles.md)

This method **MUST** only be used to query styles. If you want to modify styles please use the StylesFilter.

### `getPseudoElementStyles([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](../../../../../../ecss/extensions/api/node/AuthorParentNode.md) node)`

**Returns:** `java.util.Map<ro.sync.exml.workspace.api.editor.page.author.PseudoElementDescriptor,ro.sync.ecss.css.Styles>`

This method **MUST** only be used to query styles. If you want to modify styles, use the StylesFilter.

### `addAuthorAttributesDisplayFilter([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md) attributesDisplayFilter)`

**Returns:** `void`

### `removeAuthorAttributesDisplayFilter([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md) attributesDisplayFilter)`

**Returns:** `void`

### `getFullySelectedNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)

In such cases the method AuthorDocumentController#getNodeAtOffset(int) called for the caret offset always returns the parent of the selected element
 as the caret is actually outside the selected element.
   
 Thus, in order to obtain the context node, this method should be used and if it returns `null` 
 you can use the AuthorDocumentController#getNodeAtOffset(int) method.

### `getFullySelectedNode(`int` selectionStart, `int` selectionEnd)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)

In such cases the method AuthorDocumentController#getNodeAtOffset(int) called for the caret offset always returns the parent of the selected element
 as the caret is actually outside the selected element.
   
 Thus, in order to obtain the context node, this method should be used and if it returns `null` 
 you can use the AuthorDocumentController#getNodeAtOffset(int) method.

### `getAuthorSelectionModel()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSelectionModel`](../../../../../../ecss/extensions/api/AuthorSelectionModel.md)

### `getSelectionStart()`

**Returns:** `int`

It is **inclusive**.
 

 

 If the Author editor page has multiple selection intervals, this method returns
 the start offset of the last selected content interval.
 

 Use AuthorSelectionModel to get more information and access to the Author 
 editor page selection. 
 

 

 If there is no selection in Author editor page, the caret offset is returned.

### `getSelectionEnd()`

**Returns:** `int`

It is **exclusive**
 

 

 If the Author editor page has multiple selection intervals, this method returns
 the end offset of the last selected content interval.
 

 Use AuthorSelectionModel to get more information and access to the Author 
 editor page selection. 
 

 

 If there is no selection in Author editor page, the caret offset is returned.

### `getSelectedText()`

**Returns:** `java.lang.String`

The text does not contain XML tags for the Author page. 
 

 

 If the Author editor page has multiple selection intervals, this method returns
 the text from the last selected content interval.
 

 Use AuthorSelectionModel to get more information and access to the Author 
 editor page selection.

### `deleteSelection()`

**Returns:** `void`

If the Author editor page has multiple selection intervals, this method deletes 
 the content from the last selected interval.
 

 Use AuthorSelectionModel to get more information and access to the Author 
 editor page selection.

### `hasSelection()`

**Returns:** `boolean`

### `select(`int` startOffset, `int` endOffset)`

**Returns:** `void`

Use AuthorSelectionModel to get more information and access to the Author 
 editor page selection.

### `isOffsetInInvisibleBounds(`int` offset)`

**Returns:** `boolean`

For example: oxy-collapse-text nodes, 'display: none' nodes or 
 tracked deleted content which is not presented in 'Final' mode.

### `moveOutOfInvisibleBounds(`int` offset, `boolean` forward)`

**Returns:** `int`

If this is the case, this method returns an offset which is outside
 that region in the specified direction. 
 
 For example: oxy-collapse-text nodes, 'display: none' nodes or tracked deleted 
 content which is not presented in 'Final' mode are considered invisible.

### `goToNextEditablePosition(`int` startOffset, `int` endOffset)`

**Returns:** `void`

Depending on which is first, this can be:
 

 - An offset inside the first leaf element or the first element with mixed content.

 - An in-place editor used to edit the value of an attribute (for example a checkbox). 
 In this case the editor will be activated.
 
 

 The offset should be in the given interval specified by startOffset and endOffset exclusive.

### `editAttribute([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../../../ecss/extensions/api/node/AuthorElement.md) targetElement, `java.lang.String` attributeName)`

**Returns:** `void`

If such an editor is found it will activate
 the editor to start editing. 
 
 Hypothetically there could be more than one editor for the same attribute 
 (even though is not a real use case nor is it encouraged) but we'll activate the 
 first one we encounter. 
 
 The search will first look at the BEFORE styles, then the element styles and finally
 the AFTER styles.

### `scrollToRectangle([`ro.sync.exml.view.graphics.Rectangle`](../../../../../view/graphics/Rectangle.md) rectangle)`

**Returns:** `void`

To find the rectangle 
 that corresponds to a specific offset in the Author document you can use the
 WSAuthorEditorPage#modelToViewRectangle(int) method.

### `getAuthorFoldManager()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.fold.AuthorFoldManager`](fold/AuthorFoldManager.md)

### `addDNDListener(`java.lang.Object` dndListener)`

**Returns:** `void`

### `removeDNDListener(`java.lang.Object` dndListener)`

**Returns:** `void`

### `setTagsDisplayMode(`int` displayMode)`

**Returns:** `void`

### `getTagsDisplayMode()`

**Returns:** `int`

### `buildURLForReferencedContent(`int` caretOffset, `boolean` shortAnchor)`

**Returns:** `java.net.URL`

