# Interface: `WSAuthorEditorPageBase`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPageBase`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSTextBasedEditorPage`](../WSTextBasedEditorPage.md), [`ro.sync.exml.workspace.api.editor.page.author.tooltip.AuthorTooltipCustomizerProvider`](tooltip/AuthorTooltipCustomizerProvider.md)

## Description

## Methods

### `viewToModel(int x, int y)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorViewToModelInfo`](../../../../../../ecss/extensions/api/AuthorViewToModelInfo.md)

**Parameters:**
- `x` (`int`): The "x" coordinate relative to the viewport origin.
- `y` (`int`): The "y" coordinate relative to the viewport origin.

### `setPopUpMenuCustomizer(ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer popUpCustomizer)`

**Returns:** `void`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](../../../../../../ecss/extensions/api/structure/AuthorPopupMenuCustomizer.md)): the pop-up menu customizer.

### `addPopUpMenuCustomizer(ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer popUpCustomizer)`

**Returns:** `void`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](../../../../../../ecss/extensions/api/structure/AuthorPopupMenuCustomizer.md)): the pop-up menu customizer.
 If the customizer is already added, it will not be added again.

### `removePopUpMenuCustomizer(ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer popUpCustomizer)`

**Returns:** `void`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](../../../../../../ecss/extensions/api/structure/AuthorPopupMenuCustomizer.md)): the pop-up menu customizer.

### `addAuthorMouseListener(ro.sync.ecss.extensions.api.AuthorMouseListener mouseListener)`

**Returns:** `void`

**Parameters:**
- `mouseListener` ([`ro.sync.ecss.extensions.api.AuthorMouseListener`](../../../../../../ecss/extensions/api/AuthorMouseListener.md)): The AuthorMouseListener to be added.

### `removeAuthorMouseListener(ro.sync.ecss.extensions.api.AuthorMouseListener mouseListener)`

**Returns:** `void`

**Parameters:**
- `mouseListener` ([`ro.sync.ecss.extensions.api.AuthorMouseListener`](../../../../../../ecss/extensions/api/AuthorMouseListener.md)): The AuthorMouseListener to be removed.

### `addAuthorCaretListener(ro.sync.ecss.extensions.api.AuthorCaretListener caretListener)`

**Returns:** `void`

**Parameters:**
- `caretListener` ([`ro.sync.ecss.extensions.api.AuthorCaretListener`](../../../../../../ecss/extensions/api/AuthorCaretListener.md)): The AuthorCaretListener to be added.

### `removeAuthorCaretListener(ro.sync.ecss.extensions.api.AuthorCaretListener caretListener)`

**Returns:** `void`

**Parameters:**
- `caretListener` ([`ro.sync.ecss.extensions.api.AuthorCaretListener`](../../../../../../ecss/extensions/api/AuthorCaretListener.md)): The AuthorCaretListener to be removed.

### `refresh(ro.sync.ecss.extensions.api.node.AuthorNode authorNode)`

**Returns:** `void`

**Note:** This should be called on the AWT thread because it will generate a layout event.

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)): The node for which the layout and styles will be recomputed.

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

### `getBalancedSelection(int selectionStart, int selectionEnd)`

**Returns:** `int[]`

If the selection start is immediately to the right of a start tag and the corresponding end tag 
 is contained in the selection, then the balanced selection start will be obtained by extending
 the selection start to contain the start tag. If the selection end is immediately 
 to the left of a end tag and the corresponding start tag is contained in the selection, 
 then the balanced selection end will be obtained by extending the selection 
 end to contain the end tag.

**Parameters:**
- `selectionStart` (`int`): The inclusive selection start.
- `selectionEnd` (`int`): The exclusive selection end.

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

### `getStyles(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `ro.sync.ecss.css.Styles`

This method **MUST** only be used to query styles. If you want to modify styles please use the StylesFilter.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)): The node for which we want to obtain the styles.

### `getPseudoElementStyles(ro.sync.ecss.extensions.api.node.AuthorParentNode node)`

**Returns:** `java.util.Map<ro.sync.exml.workspace.api.editor.page.author.PseudoElementDescriptor,ro.sync.ecss.css.Styles>`

This method **MUST** only be used to query styles. If you want to modify styles, use the StylesFilter.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](../../../../../../ecss/extensions/api/node/AuthorParentNode.md)): The node for which we want to obtain the pseudo-element styles.

### `addAuthorAttributesDisplayFilter(ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter attributesDisplayFilter)`

**Returns:** `void`

**Parameters:**
- `attributesDisplayFilter` ([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md)): The AuthorAttributesDisplayFilter to be added.

### `removeAuthorAttributesDisplayFilter(ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter attributesDisplayFilter)`

**Returns:** `void`

**Parameters:**
- `attributesDisplayFilter` ([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md)): The AuthorAttributesDisplayFilter to be added.

### `getFullySelectedNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)

In such cases the method AuthorDocumentController#getNodeAtOffset(int) called for the caret offset always returns the parent of the selected element
 as the caret is actually outside the selected element.
   
 Thus, in order to obtain the context node, this method should be used and if it returns `null` 
 you can use the AuthorDocumentController#getNodeAtOffset(int) method.

### `getFullySelectedNode(int selectionStart, int selectionEnd)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)

In such cases the method AuthorDocumentController#getNodeAtOffset(int) called for the caret offset always returns the parent of the selected element
 as the caret is actually outside the selected element.
   
 Thus, in order to obtain the context node, this method should be used and if it returns `null` 
 you can use the AuthorDocumentController#getNodeAtOffset(int) method.

**Parameters:**
- `selectionStart` (`int`): **Inclusive** start offset.
- `selectionEnd` (`int`): **Exclusive** end offset.

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

### `select(int startOffset, int endOffset)`

**Returns:** `void`

Use AuthorSelectionModel to get more information and access to the Author 
 editor page selection.

**Parameters:**
- `startOffset` (`int`): **Inclusive** start offset
- `endOffset` (`int`): **Exclusive** end offset

### `isOffsetInInvisibleBounds(int offset)`

**Returns:** `boolean`

For example: oxy-collapse-text nodes, 'display: none' nodes or 
 tracked deleted content which is not presented in 'Final' mode.

**Parameters:**
- `offset` (`int`): The offset to check.

### `moveOutOfInvisibleBounds(int offset, boolean forward)`

**Returns:** `int`

If this is the case, this method returns an offset which is outside
 that region in the specified direction. 
 
 For example: oxy-collapse-text nodes, 'display: none' nodes or tracked deleted 
 content which is not presented in 'Final' mode are considered invisible.

**Parameters:**
- `offset` (`int`): The offset to check.
- `forward` (`boolean`): `true` if we should move to a position in a 
 forward direction.

### `goToNextEditablePosition(int startOffset, int endOffset)`

**Returns:** `void`

Depending on which is first, this can be:
 

 - An offset inside the first leaf element or the first element with mixed content.

 - An in-place editor used to edit the value of an attribute (for example a checkbox). 
 In this case the editor will be activated.
 
 

 The offset should be in the given interval specified by startOffset and endOffset exclusive.

**Parameters:**
- `startOffset` (`int`): The offset from where to start looking.
- `endOffset` (`int`): The offset where to stop looking for.

### `editAttribute(ro.sync.ecss.extensions.api.node.AuthorElement targetElement, java.lang.String attributeName)`

**Returns:** `void`

If such an editor is found it will activate
 the editor to start editing. 
 
 Hypothetically there could be more than one editor for the same attribute 
 (even though is not a real use case nor is it encouraged) but we'll activate the 
 first one we encounter. 
 
 The search will first look at the BEFORE styles, then the element styles and finally
 the AFTER styles.

**Parameters:**
- `targetElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../../../ecss/extensions/api/node/AuthorElement.md)): The parent element of the attribute.
- `attributeName` (`java.lang.String`): The QName of the searched attribute.

### `scrollToRectangle(ro.sync.exml.view.graphics.Rectangle rectangle)`

**Returns:** `void`

To find the rectangle 
 that corresponds to a specific offset in the Author document you can use the
 WSAuthorEditorPage#modelToViewRectangle(int) method.

**Parameters:**
- `rectangle` (`ro.sync.exml.view.graphics.Rectangle`): The rectangle to scroll to.

### `getAuthorFoldManager()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.fold.AuthorFoldManager`](fold/AuthorFoldManager.md)

### `addDNDListener(java.lang.Object dndListener)`

**Returns:** `void`

**Parameters:**
- `dndListener` (`java.lang.Object`): The drag and drop listener.
 Needs to be an instance of "ro.sync.exml.editor.xmleditor.pageauthor.AuthorDnDListener" for the standalone implementation and
 com.oxygenxml.editor.editors.author.AuthorDnDListener for the Eclipse implementation.

### `removeDNDListener(java.lang.Object dndListener)`

**Returns:** `void`

**Parameters:**
- `dndListener` (`java.lang.Object`): The drag and drop listener to remove.

### `setTagsDisplayMode(int displayMode)`

**Returns:** `void`

**Parameters:**
- `displayMode` (`int`): The tags display mode, one of DisplayModeConstants constants.

### `getTagsDisplayMode()`

**Returns:** `int`

### `buildURLForReferencedContent(int caretOffset, boolean shortAnchor)`

**Returns:** `java.net.URL`

**Parameters:**
- `caretOffset` (`int`): The offset at which the caret is currently located.
- `shortAnchor` (`boolean`): Flag telling whether to build a short version of the referenced content URL or not. This format is used in Web Author.

