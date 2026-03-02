# Interface: `WSXMLTextEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text.xml`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`](../WSTextEditorPage.md)

## Description

## Methods

### `findElementsByXPath(java.lang.String xpathExpression)`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextNodeRange[]`](./WSXMLTextNodeRange.md)

The result of this function is an array of WSXMLTextNodeRange selected 
 by the given XPath expression.
 

 For example executing the expression:
 
 `//node()`
 
 will return an array with all the node ranges in the document.
 

 But the result of calling the function with the expression:
 
 `count(//node())`
 
 will return an empty array.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.

### `evaluateXPath(java.lang.String xpathExpression)`

**Returns:** `java.lang.Object[]`

This function returns the result of the given XPath expression as an array of Object.
 

 For example, executing the expression:
 
 `//node()`
 
 will return an array with all the DOM Nodes created over the XML structure.
 

 while evaluating the expression:
 
 `count(//node())`
 
 will return an array having a single component representing the number of nodes in the document.
 

 Evaluating the expression:
 
 `//node(), count(//node())`
 
 will return an array containing all DOM Nodes and having as last component
 the total number of nodes.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.

### `getXMLSchemaManager()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../WSTextXMLSchemaManager.md)

### `getDocumentController()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.text.xml.TextDocumentController`](./TextDocumentController.md)

### `getXPath(int offset, boolean includeIndexInParent)`

**Returns:** `java.lang.String`

**Parameters:**
- `offset` (`int`): The current offset.
- `includeIndexInParent` (`boolean`): If `true` the child index in parent is included.
       Example (without index): /personnel/person/name/family
       Example (with index):    /personnel/person[2]/name[1]/family[1]

