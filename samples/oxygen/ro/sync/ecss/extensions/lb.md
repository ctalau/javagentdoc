# Class: `lb`

**Package:** [`ro.sync.ecss.extensions`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.lb`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)

## Constructors

### `<init>()`

## Methods

### `getSelectionStart()`

**Returns:** `int`

### `getSelectionEnd()`

**Returns:** `int`

### `getSelectedText()`

**Returns:** `java.lang.String`

### `getCaretOffset()`

**Returns:** `int`

### `insertText(`java.lang.String` arg0, `int` arg1)`

**Returns:** `void`

### `insertXMLFragment(`java.lang.String` arg0, `int` arg1)`

**Returns:** `void`

### `insertXMLFragment(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `deleteSelection()`

**Returns:** `void`

### `hasSelection()`

**Returns:** `boolean`

### `selectWord()`

**Returns:** `void`

### `surroundInFragment(`java.lang.String` arg0, `int` arg1, `int` arg2)`

**Returns:** `void`

### `surroundInText(`java.lang.String` arg0, `java.lang.String` arg1, `int` arg2, `int` arg3)`

**Returns:** `void`

### `setCaretPosition(`int` arg0)`

**Returns:** `void`

### `select(`int` arg0, `int` arg1)`

**Returns:** `void`

### `getWordAtCaret()`

**Returns:** `int[]`

### `getParentFrame()`

**Returns:** `java.lang.Object`

### `makeRelative(`java.net.URL` arg0, `java.net.URL` arg1)`

**Returns:** `java.lang.String`

### `escapeAttributeValue(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `getEditorLocation()`

**Returns:** `java.net.URL`

### `locateFile(`java.net.URL` arg0)`

**Returns:** `java.io.File`

### `chooseFile(`java.lang.String` arg0, `java.lang.String[]` arg1, `java.lang.String` arg2, `boolean` arg3)`

**Returns:** `java.io.File`

### `chooseFile(`java.lang.String` arg0, `java.lang.String[]` arg1, `java.lang.String` arg2)`

**Returns:** `java.io.File`

### `chooseURL(`java.lang.String` arg0, `java.lang.String[]` arg1, `java.lang.String` arg2)`

**Returns:** `java.net.URL`

### `getTableCellAbove([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `getTableCellBelow([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `getTableCellIndex([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0)`

**Returns:** `int[]`

### `getTableCellAt(`int` arg0, `int` arg1, [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `getTableRow(`int` arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `getTableRowCount([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0)`

**Returns:** `int`

### `getTableNumberOfColumns([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0)`

**Returns:** `int`

### `getTableColSpanIndices([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0)`

**Returns:** `int[]`

### `isStandalone()`

**Returns:** `boolean`

### `inInlineContext(`int` arg0)`

**Returns:** `boolean`

### `insertMultipleElements([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0, `java.lang.String[]` arg1, `int[]` arg2, `java.lang.String` arg3)`

**Returns:** `void`

### `multipleDelete([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0, `int[]` arg1, `int[]` arg2)`

**Returns:** `void`

### `removeClonedElementAttribute([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `setClonedElementAttribute([`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md) arg0, `java.lang.String` arg1, [`ro.sync.ecss.extensions.api.node.AttrValue`](api/node/AttrValue.md) arg2)`

**Returns:** `void`

### `showConfirmDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String[]` arg2, `int[]` arg3)`

**Returns:** `int`

### `newNonValidatingXMLReader()`

**Returns:** [`org.xml.sax.XMLReader`](../../../../org/xml/sax/XMLReader.md)

### `correctURL(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `showErrorMessage(`java.lang.String` arg0)`

**Returns:** `void`

### `resolvePath(`java.net.URL` arg0, `java.lang.String` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** `java.net.URL`

### `findNodesByXPath(`java.lang.String` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](api/node/AuthorNode.md)

### `evaluateXPath(`java.lang.String` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** `java.lang.Object[]`

### `addAuthorListener([`ro.sync.ecss.extensions.api.AuthorListener`](api/AuthorListener.md) arg0)`

**Returns:** `void`

### `removeAuthorListener([`ro.sync.ecss.extensions.api.AuthorListener`](api/AuthorListener.md) arg0)`

**Returns:** `void`

### `viewToModel(`int` arg0, `int` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorViewToModelInfo`](api/AuthorViewToModelInfo.md)

### `isTrackingChanges()`

**Returns:** `boolean`

### `toggleTrackChanges()`

**Returns:** `void`

### `getChangeTrackingController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](api/AuthorChangeTrackingController.md)

### `getEditorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](api/access/AuthorEditorAccess.md)

### `getDocumentController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](api/AuthorDocumentController.md)

### `getWorkspaceAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](api/access/AuthorWorkspaceAccess.md)

### `getUtilAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorUtilAccess`](api/access/AuthorUtilAccess.md)

### `getXMLUtilAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorXMLUtilAccess`](api/access/AuthorXMLUtilAccess.md)

### `getTableAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorTableAccess`](api/access/AuthorTableAccess.md)

### `getReviewController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReviewController`](api/AuthorReviewController.md)

### `getOptionsStorage()`

**Returns:** [`ro.sync.ecss.extensions.api.OptionsStorage`](api/OptionsStorage.md)

### `getOutlineAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`](api/access/AuthorOutlineAccess.md)

### `getClassPathResourcesAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.ClassPathResourcesAccess`](api/ClassPathResourcesAccess.md)

### `getAuthorResourceBundle()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](api/AuthorResourceBundle.md)

### `getAuthorObjectFromClipboard()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../component/AuthorClipboardObject.md)

### `getElementByAnchor(`java.lang.String` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `getCaretOffsetByAnchor(`java.lang.String` arg0)`

**Returns:** `int`

### `getTextFromClipboard()`

**Returns:** `java.lang.String`

