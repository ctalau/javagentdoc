# Interface: `TextDocumentController`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text.xml`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.xml.TextDocumentController`

## Description

## Methods

### `insertXMLFragment(`java.lang.String` xmlFragment, `java.lang.String` xpathLocation, [`ro.sync.exml.editor.xmleditor.operations.context.RelativeInsertPosition`](../../../../../../editor/xmleditor/operations/context/RelativeInsertPosition.md) relativePosition)`

**Returns:** `void`

The inserted fragment is indented after being added to the document.
 

 After the operation the caret will be positioned in the first leaf of the fragment.

### `insertXMLFragment(`java.lang.String` xmlFragment, `int` caretOffset)`

**Returns:** `void`

When the caret offset is inside an element tag (start element, empty element or end element) tries to place the caret
 inside the element's contents. 
 If the element is empty, it tries to expand the element (eg: from <a/> to <a></a>) placing the caret between the tags. 
 After insertion is done, the caret is placed after the inserted element.

### `indentSection(`int` startOffset, `int` endOffset)`

**Returns:** `void`

Indents each line from the section according to the XML structure.

