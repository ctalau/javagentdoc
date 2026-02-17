# Class: `p`

**Package:** [`ro.sync.ecss.extensions`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.p`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)

## Fields

### `s`

**Type:** [`org.slf4j.Logger`](../../../../org/slf4j/Logger.md)

### `q`

**Type:** [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](api/access/AuthorEditorAccess.md)

### `k`

**Type:** [`ro.sync.ecss.extensions.hb`](./hb.md)

### `n`

**Type:** [`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](api/access/AuthorWorkspaceAccess.md)

### `j`

**Type:** [`ro.sync.ecss.extensions.api.access.AuthorTableAccess`](api/access/AuthorTableAccess.md)

### `r`

**Type:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](api/AuthorDocumentController.md)

### `o`

**Type:** [`ro.sync.ecss.component.z`](../component/z.md)

### `m`

**Type:** [`ro.sync.ecss.extensions.ab`](./ab.md)

### `g`

**Type:** [`ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`](api/access/AuthorOutlineAccess.md)

### `t`

**Type:** [`ro.sync.ecss.extensions.api.AuthorReviewController`](api/AuthorReviewController.md)

### `p`

**Type:** [`ro.sync.ecss.extensions.api.ClassPathResourcesAccess`](api/ClassPathResourcesAccess.md)

### `h`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](api/AuthorResourceBundle.md)

### `i`

**Type:** [`ro.sync.exml.editor.xmleditor.nb`](../../exml/editor/xmleditor/nb.md)

### `l`

**Type:** [`ro.sync.i18n.c`](../../i18n/c.md)

## Constructors

### `<init>([`ro.sync.ecss.component.lc`](../component/lc.md) arg0, [`ro.sync.ecss.extensions.api.AuthorReviewController`](api/AuthorReviewController.md) arg1, [`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](api/access/AuthorWorkspaceAccess.md) arg2, [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](api/access/AuthorEditorAccess.md) arg3, [`ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`](api/access/AuthorOutlineAccess.md) arg4, [`ro.sync.ecss.extensions.api.ClassPathResourcesAccess`](api/ClassPathResourcesAccess.md) arg5)`

### `<init>([`ro.sync.ecss.component.z`](../component/z.md) arg0, [`ro.sync.ecss.extensions.api.AuthorReviewController`](api/AuthorReviewController.md) arg1, [`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](api/access/AuthorWorkspaceAccess.md) arg2, [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](api/access/AuthorEditorAccess.md) arg3, [`ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`](api/access/AuthorOutlineAccess.md) arg4, [`ro.sync.ecss.extensions.api.ClassPathResourcesAccess`](api/ClassPathResourcesAccess.md) arg5, [`ro.sync.exml.editor.xmleditor.nb`](../../exml/editor/xmleditor/nb.md) arg6, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](api/AuthorDocumentController.md) arg7, [`ro.sync.ecss.extensions.api.access.AuthorTableAccess`](api/access/AuthorTableAccess.md) arg8)`

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

### `findNodesByXPath(`java.lang.String` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](api/node/AuthorNode.md)

### `evaluateXPath(`java.lang.String` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** `java.lang.Object[]`

### `deleteSelection()`

**Returns:** `void`

### `hasSelection()`

**Returns:** `boolean`

### `surroundInFragment(`java.lang.String` arg0, `int` arg1, `int` arg2)`

**Returns:** `void`

### `surroundInText(`java.lang.String` arg0, `java.lang.String` arg1, `int` arg2, `int` arg3)`

**Returns:** `void`

### `getWordAtCaret()`

**Returns:** `int[]`

### `selectWord()`

**Returns:** `void`

### `setCaretPosition(`int` arg0)`

**Returns:** `void`

### `escapeAttributeValue(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `makeRelative(`java.net.URL` arg0, `java.net.URL` arg1)`

**Returns:** `java.lang.String`

### `getEditorLocation()`

**Returns:** `java.net.URL`

### `locateFile(`java.net.URL` arg0)`

**Returns:** `java.io.File`

### `getDocumentController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](api/AuthorDocumentController.md)

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

### `g()`

**Returns:** [`ro.sync.ecss.component.z`](../component/z.md)

### `newNonValidatingXMLReader()`

**Returns:** [`org.xml.sax.XMLReader`](../../../../org/xml/sax/XMLReader.md)

### `correctURL(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `showErrorMessage(`java.lang.String` arg0)`

**Returns:** `void`

### `resolvePath(`java.net.URL` arg0, `java.lang.String` arg1, `boolean` arg2, `boolean` arg3)`

**Returns:** `java.net.URL`

### `select(`int` arg0, `int` arg1)`

**Returns:** `void`

### `addAuthorListener([`ro.sync.ecss.extensions.api.AuthorListener`](api/AuthorListener.md) arg0)`

**Returns:** `void`

### `removeAuthorListener([`ro.sync.ecss.extensions.api.AuthorListener`](api/AuthorListener.md) arg0)`

**Returns:** `void`

### `d([`ro.sync.ecss.extensions.api.AuthorDocumentController`](api/AuthorDocumentController.md) arg0)`

**Returns:** `void`

### `viewToModel(`int` arg0, `int` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorViewToModelInfo`](api/AuthorViewToModelInfo.md)

### `isTrackingChanges()`

**Returns:** `boolean`

### `toggleTrackChanges()`

**Returns:** `void`

### `chooseFile(`java.lang.String` arg0, `java.lang.String[]` arg1, `java.lang.String` arg2)`

**Returns:** `java.io.File`

### `getUtilAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorUtilAccess`](api/access/AuthorUtilAccess.md)

### `getEditorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](api/access/AuthorEditorAccess.md)

### `getWorkspaceAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](api/access/AuthorWorkspaceAccess.md)

### `getChangeTrackingController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](api/AuthorChangeTrackingController.md)

### `getTableAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorTableAccess`](api/access/AuthorTableAccess.md)

### `chooseFile(`java.lang.String` arg0, `java.lang.String[]` arg1, `java.lang.String` arg2, `boolean` arg3)`

**Returns:** `java.io.File`

### `chooseURL(`java.lang.String` arg0, `java.lang.String[]` arg1, `java.lang.String` arg2)`

**Returns:** `java.net.URL`

### `getParentFrame()`

**Returns:** `java.lang.Object`

### `isStandalone()`

**Returns:** `boolean`

### `getOptionsStorage()`

**Returns:** [`ro.sync.ecss.extensions.api.OptionsStorage`](api/OptionsStorage.md)

### `getXMLUtilAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorXMLUtilAccess`](api/access/AuthorXMLUtilAccess.md)

### `getOutlineAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`](api/access/AuthorOutlineAccess.md)

### `getReviewController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReviewController`](api/AuthorReviewController.md)

### `getClassPathResourcesAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.ClassPathResourcesAccess`](api/ClassPathResourcesAccess.md)

### `m(`java.lang.String` arg0, `java.net.URL[]` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](api/AuthorResourceBundle.md)

### `getAuthorResourceBundle()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](api/AuthorResourceBundle.md)

### `j()`

**Returns:** `void`

### `k([`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](api/access/AuthorWorkspaceAccess.md) arg0)`

**Returns:** `void`

### `i()`

**Returns:** [`ro.sync.exml.editor.xmleditor.nb`](../../exml/editor/xmleditor/nb.md)

### `getAuthorObjectFromClipboard()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../component/AuthorClipboardObject.md)

### `getTextFromClipboard()`

**Returns:** `java.lang.String`

### `getCaretOffsetByAnchor(`java.lang.String` arg0)`

**Returns:** `int`

### `getElementByAnchor(`java.lang.String` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `h([`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `c([`ro.sync.exml.editor.Anchor`](../../exml/editor/Anchor.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `n([`ro.sync.exml.editor.Anchor`](../../exml/editor/Anchor.md) arg0)`

**Returns:** `int`

### `l(`int` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](api/node/AuthorElement.md)

### `e()`

**Returns:** [`ro.sync.ecss.contentcompletion.c`](../contentcompletion/c.md)

### `f()`

**Returns:** [`ro.sync.ecss.component.z`](../component/z.md)

