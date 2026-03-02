# Interface: `AuthorAccessDeprecated`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorAccessDeprecated`

## Description

## Methods

### `getSelectionStart()`

**Returns:** `int`

It is inclusive.

### `getSelectionEnd()`

**Returns:** `int`

It is exclusive.

### `getSelectedText()`

**Returns:** `java.lang.String`

The text does not contains XML tags.

### `getCaretOffset()`

**Returns:** `int`

### `insertText(java.lang.String text, int offset)`

**Returns:** `void`

After the operation is performed the caret will be positioned at the end 
 of the inserted text.

**Parameters:**
- `text` (`java.lang.String`): The text to insert.
- `offset` (`int`): The offset of the insertion point, 0 based.

### `insertXMLFragment(java.lang.String xmlFragment, int offset)`

**Returns:** `void`

After the operation is performed the caret will be positioned at the end of the inserted XML fragment.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.
- `offset` (`int`): The offset of the insertion point, 0 based.

### `insertXMLFragment(java.lang.String xmlFragment, java.lang.String xpathLocation, java.lang.String relativePosition)`

**Returns:** `void`

Note: if the `xpathLocation` is not specified then the XML fragment 
 will be inserted at the caret position(`relativePosition` is ignored). 


 After the operation is performed the caret will be positioned at the end of the inserted XML fragment.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.
- `xpathLocation` (`java.lang.String`): The xpath location.
- `relativePosition` (`java.lang.String`): The position relative to the node identified by the xpath location. 
 Can be one of the constants: AuthorConstants.POSITION_BEFORE, AuthorConstants.POSITION_AFTER,
 AuthorConstants.POSITION_INSIDE.

### `deleteSelection()`

**Returns:** `void`

### `hasSelection()`

**Returns:** `boolean`

### `selectWord()`

**Returns:** `void`

### `surroundInFragment(java.lang.String xmlFragment, int startOffset, int endOffset)`

**Returns:** `void`

If endOffset < startOffset the `xmlFragment` will be inserted at `startOffset`.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment which will surround the given offsets.
 The first XML fragment leaf(deepest on the first branch) will be the surround point.
- `startOffset` (`int`): The start offset of the fragment to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the fragment to be surrounded, 0 based and inclusive.

### `surroundInText(java.lang.String header, java.lang.String footer, int startOffset, int endOffset)`

**Returns:** `void`

**Parameters:**
- `header` (`java.lang.String`): The header to be inserted before the surrounded text.
- `footer` (`java.lang.String`): The footer to be inserted after the surrounded text.
- `startOffset` (`int`): The start offset of the text to be surrounded, 0 based.
- `endOffset` (`int`): The end offset of the text to be surrounded, zero based.

### `setCaretPosition(int offset)`

**Returns:** `void`

**Parameters:**
- `offset` (`int`): The offset where the caret should be positioned, 0 based.

### `select(int startOffset, int endOffset)`

**Returns:** `void`

**Parameters:**
- `startOffset` (`int`): Inclusive start offset
- `endOffset` (`int`): Exclusive end offset

### `getWordAtCaret()`

**Returns:** `int[]`

### `getParentFrame()`

**Returns:** `java.lang.Object`

### `makeRelative(java.net.URL baseURL, java.net.URL childURL)`

**Returns:** `java.lang.String`

The child path is relatively expressed to the base file. If is
 not possible, the child URL is returned. 
 

 Ex: Base: "file://c:/projects/exml/base.prx", Child
 "file://c:/projects/exml/test/someTest.xml" 


 Result: "test/someTest.xml"

**Parameters:**
- `baseURL` (`java.net.URL`): The base URL.
- `childURL` (`java.net.URL`): The child URL.

### `escapeAttributeValue(java.lang.String attributeValue)`

**Returns:** `java.lang.String`

**Parameters:**
- `attributeValue` (`java.lang.String`): The attribute value.

### `getEditorLocation()`

**Returns:** `java.net.URL`

### `locateFile(java.net.URL url)`

**Returns:** `java.io.File`

**Parameters:**
- `url` (`java.net.URL`): The URL to be checked.

### `chooseFile(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr, boolean openForSave)`

**Returns:** `java.io.File`

**Parameters:**
- `title` (`java.lang.String`): The file chooser title.
- `allowedExtensions` (`java.lang.String[]`): Allowed file extensions.
- `filterDescr` (`java.lang.String`): Description for this file filter.
- `openForSave` (`boolean`): True to show the file chooser for saving, false to use it for opening

### `chooseFile(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr)`

**Returns:** `java.io.File`

**Parameters:**
- `title` (`java.lang.String`): The file chooser title.
- `allowedExtensions` (`java.lang.String[]`): Allowed file extensions.
- `filterDescr` (`java.lang.String`): Description for this file filter.

### `chooseURL(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr)`

**Returns:** `java.net.URL`

**Parameters:**
- `title` (`java.lang.String`): The file chooser title.
- `allowedExtensions` (`java.lang.String[]`): Allowed extensions.
- `filterDescr` (`java.lang.String`): Description for this file filter.

### `getTableCellAbove(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The table cell element.

### `getTableCellBelow(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The table cell element.

### `getTableCellIndex(ro.sync.ecss.extensions.api.node.AuthorElement authorElement)`

**Returns:** `int[]`

**Parameters:**
- `authorElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element.

### `getTableCellAt(int row, int column, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

**Parameters:**
- `row` (`int`): The row, 0 based.
- `column` (`int`): The column, 0 based.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The table element.

### `getTableRow(int index, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

**Parameters:**
- `index` (`int`): The index of the row to find, 0 based.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The table element.

### `getTableRowCount(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `int`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The table element.

### `getTableNumberOfColumns(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `int`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The table element.

### `getTableColSpanIndices(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `int[]`

The indices are 0 based.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The table cell element.

### `isStandalone()`

**Returns:** `boolean`

### `inInlineContext(int offset)`

**Returns:** `boolean`

For example a text paragraph determines an inline context, 
 and for an offset inside this paragraph the method will return `true`. 
 For an offset between two paragraphs(block boxes) the method will returns `false`.

**Parameters:**
- `offset` (`int`): The offset in the document, zero based.

### `insertMultipleElements(ro.sync.ecss.extensions.api.node.AuthorElement parentElement, java.lang.String[] elementNames, int[] offsets, java.lang.String namespace)`

**Returns:** `void`

The offsets and elements must be in the document order.

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element that will be the parent of the inserted elements.
- `elementNames` (`java.lang.String[]`): The element names to be inserted.
- `offsets` (`int[]`): The absolute offsets where the elements will be inserted.
- `namespace` (`java.lang.String`): The namespace of the new inserted elements. `null` for default namespace.

### `multipleDelete(ro.sync.ecss.extensions.api.node.AuthorElement parentElement, int[] startOffsets, int[] endOffsets)`

**Returns:** `void`

The offsets must be in document order and the intervals 
 must not intersect with one another.

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element that contains all the deleted intervals.
- `startOffsets` (`int[]`): The start offset for each interval. Must be in document order.
- `endOffsets` (`int[]`): The end offset for each interval. Must be in document order.

### `removeClonedElementAttribute(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String attrName)`

**Returns:** `void`

Warning: Use this only when the element is not from the existing content.
 All operations on nodes from the document model must be done through the AuthorDocumentController.

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): Element node.
- `attrName` (`java.lang.String`): The attribute name to remove.

### `setClonedElementAttribute(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String name, ro.sync.ecss.extensions.api.node.AttrValue attributeValue)`

**Returns:** `void`

Warning: Use this only when the element is not from the existing content.
 All operations on nodes from the document model must be done through the AuthorDocumentController.

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): Element node.
- `name` (`java.lang.String`): Name of the attribute to be set.
- `attributeValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md)): The attribute value to set. Must not be `null`.

### `showConfirmDialog(java.lang.String title, java.lang.String message, java.lang.String[] buttonNames, int[] buttonIds)`

**Returns:** `int`

**Parameters:**
- `title` (`java.lang.String`): The dialog title.
- `message` (`java.lang.String`): The message to be presented to the user.
- `buttonNames` (`java.lang.String[]`): The names of the buttons representing the choices.
- `buttonIds` (`int[]`): The id for each button. Used to identify which button was pressed.
 All ids must be greater or equal to 0.

### `newNonValidatingXMLReader()`

**Returns:** `org.xml.sax.XMLReader`

### `correctURL(java.lang.String url)`

**Returns:** `java.lang.String`

**Parameters:**
- `url` (`java.lang.String`): The URL to be corrected.

### `showErrorMessage(java.lang.String message)`

**Returns:** `void`

**Parameters:**
- `message` (`java.lang.String`): The error message to be presented.

### `resolvePath(java.net.URL baseURL, java.lang.String relativeLocation, boolean entityResolve, boolean uriResolve)`

**Returns:** `java.net.URL`

**Parameters:**
- `baseURL` (`java.net.URL`): The URL of the current opened XML file.
- `relativeLocation` (`java.lang.String`): The relative href.
- `entityResolve` (`boolean`): True to pass through catalog entity resolver
- `uriResolve` (`boolean`): True to pass through catalog URI resolver.

### `findNodesByXPath(java.lang.String xpathExpression, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

The result of this function is an array of AuthorNode's selected by the given XPath expression.
 Author text nodes, Author CDATA section nodes and Author comment nodes can be ignored for performance reasons.
 

 For example executing the expression:
 
 `//node()`
 
 will return an array with all the AuthorNode's in the document.
 

 But the result of calling the function with the expression:
 
 `count(//node())`
 
 will return an empty array.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression.
- `ignoreTexts` (`boolean`): If `true` Author text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` Author CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` Author comments will not be returned.

### `evaluateXPath(java.lang.String xpathExpression, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments)`

**Returns:** `java.lang.Object[]`

This functions returns the result of the given XPath expression as an array of Object's.
 Author DOM text nodes, DOM CDATA sections and DOM comments wrappers can be ignored for performance reasons.
 

 For example, executing the expression:
 
 `//node()`
 
 will return an array with all the Author DOM Node wrappers in the document.
 

 while evaluating the expression:
 
 `count(//node())`
 
 will return an array having a single component representing the number of nodes in the document.
 

 Evaluating the expression:
 
 `//node(), count(//node())`
 
 will return an array containing all the Author DOM Node wrappers in the document and having as last component
 the total number of nodes.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression.
- `ignoreTexts` (`boolean`): If `true` DOM text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` DOM CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` DOM comments will not be returned.

### `addAuthorListener(ro.sync.ecss.extensions.api.AuthorListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md)): The listener to be added.

### `removeAuthorListener(ro.sync.ecss.extensions.api.AuthorListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md)): The listener to be removed.

### `viewToModel(int x, int y)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorViewToModelInfo`](./AuthorViewToModelInfo.md)

**Parameters:**
- `x` (`int`): The "x" coordinate relative to the viewport origin.
- `y` (`int`): The "y" coordinate relative to the viewport origin.

### `isTrackingChanges()`

**Returns:** `boolean`

### `toggleTrackChanges()`

**Returns:** `void`

### `getChangeTrackingController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](./AuthorChangeTrackingController.md)

