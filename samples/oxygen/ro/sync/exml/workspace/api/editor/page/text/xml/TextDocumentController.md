# Interface: `TextDocumentController`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text.xml`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.xml.TextDocumentController`

## Description

## Methods

### `insertXMLFragment(String xmlFragment, String xpathLocation, RelativeInsertPosition relativePosition)`

The inserted fragment is indented after being added to the document.
 

 After the operation the caret will be positioned in the first leaf of the fragment.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.
- `xpathLocation` (`java.lang.String`): The XPath location.
- `relativePosition` ([`ro.sync.exml.editor.xmleditor.operations.context.RelativeInsertPosition`](../../../../../../editor/xmleditor/operations/context/RelativeInsertPosition.md)): The position relative to the node identified by the XPath location. 
   Can be one of the constants: AuthorConstants#POSITION_BEFORE, AuthorConstants#POSITION_AFTER, 
   AuthorConstants#POSITION_INSIDE_FIRST or AuthorConstants#POSITION_INSIDE_LAST.

**Returns:** `void`

### `insertXMLFragment(String xmlFragment, int caretOffset)`

When the caret offset is inside an element tag (start element, empty element or end element) tries to place the caret
 inside the element's contents. 
 If the element is empty, it tries to expand the element (eg: from <a/> to <a></a>) placing the caret between the tags. 
 After insertion is done, the caret is placed after the inserted element.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.
- `caretOffset` (`int`): The caret offset

**Returns:** `void`

### `indentSection(int startOffset, int endOffset)`

Indents each line from the section according to the XML structure.

**Parameters:**
- `startOffset` (`int`): The start offset of the section.
- `endOffset` (`int`): The end offset of the section. Inclusive.

**Returns:** `void`

