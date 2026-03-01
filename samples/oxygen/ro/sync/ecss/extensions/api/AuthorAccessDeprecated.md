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

### `insertText(`java.lang.String` text, `int` offset)`

**Returns:** `void`

After the operation is performed the caret will be positioned at the end 
 of the inserted text.

### `insertXMLFragment(`java.lang.String` xmlFragment, `int` offset)`

**Returns:** `void`

After the operation is performed the caret will be positioned at the end of the inserted XML fragment.

### `insertXMLFragment(`java.lang.String` xmlFragment, `java.lang.String` xpathLocation, `java.lang.String` relativePosition)`

**Returns:** `void`

Note: if the `xpathLocation` is not specified then the XML fragment 
 will be inserted at the caret position(`relativePosition` is ignored). 


 After the operation is performed the caret will be positioned at the end of the inserted XML fragment.

### `deleteSelection()`

**Returns:** `void`

### `hasSelection()`

**Returns:** `boolean`

### `selectWord()`

**Returns:** `void`

### `surroundInFragment(`java.lang.String` xmlFragment, `int` startOffset, `int` endOffset)`

**Returns:** `void`

If endOffset < startOffset the `xmlFragment` will be inserted at `startOffset`.

### `surroundInText(`java.lang.String` header, `java.lang.String` footer, `int` startOffset, `int` endOffset)`

**Returns:** `void`

### `setCaretPosition(`int` offset)`

**Returns:** `void`

### `select(`int` startOffset, `int` endOffset)`

**Returns:** `void`

### `getWordAtCaret()`

**Returns:** `int[]`

### `getParentFrame()`

**Returns:** `java.lang.Object`

### `makeRelative(`java.net.URL` baseURL, `java.net.URL` childURL)`

**Returns:** `java.lang.String`

The child path is relatively expressed to the base file. If is
 not possible, the child URL is returned. 
 

 Ex: Base: "file://c:/projects/exml/base.prx", Child
 "file://c:/projects/exml/test/someTest.xml" 


 Result: "test/someTest.xml"

### `escapeAttributeValue(`java.lang.String` attributeValue)`

**Returns:** `java.lang.String`

### `getEditorLocation()`

**Returns:** `java.net.URL`

### `locateFile(`java.net.URL` url)`

**Returns:** `java.io.File`

### `chooseFile(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr, `boolean` openForSave)`

**Returns:** `java.io.File`

### `chooseFile(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr)`

**Returns:** `java.io.File`

### `chooseURL(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr)`

**Returns:** `java.net.URL`

### `getTableCellAbove([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) cellElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `getTableCellBelow([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) cellElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `getTableCellIndex([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) authorElement)`

**Returns:** `int[]`

### `getTableCellAt(`int` row, `int` column, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `getTableRow(`int` index, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `getTableRowCount([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) tableElement)`

**Returns:** `int`

### `getTableNumberOfColumns([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) tableElement)`

**Returns:** `int`

### `getTableColSpanIndices([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) cellElement)`

**Returns:** `int[]`

The indices are 0 based.

### `isStandalone()`

**Returns:** `boolean`

### `inInlineContext(`int` offset)`

**Returns:** `boolean`

For example a text paragraph determines an inline context, 
 and for an offset inside this paragraph the method will return `true`. 
 For an offset between two paragraphs(block boxes) the method will returns `false`.

### `insertMultipleElements([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, `java.lang.String[]` elementNames, `int[]` offsets, `java.lang.String` namespace)`

**Returns:** `void`

The offsets and elements must be in the document order.

### `multipleDelete([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, `int[]` startOffsets, `int[]` endOffsets)`

**Returns:** `void`

The offsets must be in document order and the intervals 
 must not intersect with one another.

### `removeClonedElementAttribute([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element, `java.lang.String` attrName)`

**Returns:** `void`

Warning: Use this only when the element is not from the existing content.
 All operations on nodes from the document model must be done through the AuthorDocumentController.

### `setClonedElementAttribute([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element, `java.lang.String` name, [`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md) attributeValue)`

**Returns:** `void`

Warning: Use this only when the element is not from the existing content.
 All operations on nodes from the document model must be done through the AuthorDocumentController.

### `showConfirmDialog(`java.lang.String` title, `java.lang.String` message, `java.lang.String[]` buttonNames, `int[]` buttonIds)`

**Returns:** `int`

### `newNonValidatingXMLReader()`

**Returns:** `org.xml.sax.XMLReader`

### `correctURL(`java.lang.String` url)`

**Returns:** `java.lang.String`

### `showErrorMessage(`java.lang.String` message)`

**Returns:** `void`

### `resolvePath(`java.net.URL` baseURL, `java.lang.String` relativeLocation, `boolean` entityResolve, `boolean` uriResolve)`

**Returns:** `java.net.URL`

### `findNodesByXPath(`java.lang.String` xpathExpression, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

The result of this function is an array of AuthorNode's selected by the given XPath expression.
 Author text nodes, Author CDATA section nodes and Author comment nodes can be ignored for performance reasons.
 

 For example executing the expression:
 
 `//node()`
 
 will return an array with all the AuthorNode's in the document.
 

 But the result of calling the function with the expression:
 
 `count(//node())`
 
 will return an empty array.

### `evaluateXPath(`java.lang.String` xpathExpression, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments)`

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

### `addAuthorListener([`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md) listener)`

**Returns:** `void`

### `removeAuthorListener([`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md) listener)`

**Returns:** `void`

### `viewToModel(`int` x, `int` y)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorViewToModelInfo`](./AuthorViewToModelInfo.md)

### `isTrackingChanges()`

**Returns:** `boolean`

### `toggleTrackChanges()`

**Returns:** `void`

### `getChangeTrackingController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](./AuthorChangeTrackingController.md)

