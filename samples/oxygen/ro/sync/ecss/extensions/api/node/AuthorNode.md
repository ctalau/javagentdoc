# Interface: `AuthorNode`

**Package:** [`ro.sync.ecss.extensions.api.node`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.node.AuthorNode`

## Description

The Author nodes model is similar with the DOM model with the difference 
 that the TEXT nodes do not exists in this model. The text from the document
 is kept separately into a data structure similar to Content from Swing. 
 The nodes have start and end pointers into the Content, see `#getStartOffset()`
 and `#getEndOffset()` methods. 
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

## Fields

### `NODE_TYPE_ELEMENT`

**Type:** `int`

The value is 0.

### `NODE_TYPE_TEXT`

**Type:** `int`

The value is 1.

### `NODE_TYPE_DOCUMENT`

**Type:** `int`

The value is 2.

### `NODE_TYPE_COMMENT`

**Type:** `int`

The value is 3.

### `NODE_TYPE_CDATA`

**Type:** `int`

The value is 4.

### `NODE_TYPE_PI`

**Type:** `int`

The value is 5.

### `NODE_TYPE_PSEUDO_ELEMENT`

**Type:** `int`

The value is 6.

### `NODE_TYPE_REFERENCE`

**Type:** `int`

`xinclude` elements).
 The value is 7.

### `NODE_TYPE_PSEUDO_DOCTYPE`

**Type:** `int`

The value is 8.

### `NODE_NAME_CDATA`

**Type:** `java.lang.String`

The value is `#cdata`.

### `NODE_NAME_COMMENT`

**Type:** `java.lang.String`

The value is `#comment`.

### `NODE_NAME_DOCUMENT`

**Type:** `java.lang.String`

The value is `#document`.

### `NODE_NAME_PI`

**Type:** `java.lang.String`

The value is `processing-instruction`.

### `NODE_NAME_REFERENCE`

**Type:** `java.lang.String`

## Methods

### `getOwnerDocument()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocument`](./AuthorDocument.md)

### `isDescendentOf(ro.sync.ecss.extensions.api.node.AuthorNode ancestor)`

**Returns:** `boolean`

**Parameters:**
- `ancestor` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)): The AuthorNode tested to see if it is an ancestor of this node.

### `getType()`

**Returns:** `int`

Can be one of the constants:
 #NODE_TYPE_CDATA, #NODE_TYPE_COMMENT, #NODE_TYPE_DOCUMENT,
 #NODE_TYPE_ELEMENT, #NODE_TYPE_PI, #NODE_TYPE_PSEUDO_DOCTYPE,
 #NODE_TYPE_PSEUDO_ELEMENT, #NODE_TYPE_REFERENCE.

### `getStartOffset()`

**Returns:** `int`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `getEndOffset()`

**Returns:** `int`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `getName()`

**Returns:** `java.lang.String`

Depending on the node type the method returns:
 
 

   - #NODE_TYPE_ELEMENT - the qualified name of the element

   - #NODE_TYPE_CDATA - the constant #NODE_NAME_CDATA

   - #NODE_TYPE_COMMENT - the constant #NODE_NAME_COMMENT 

   - #NODE_TYPE_DOCUMENT - the constant #NODE_NAME_DOCUMENT 

   - #NODE_TYPE_REFERENCE - the name of the entity

   - #NODE_TYPE_PI - the constant #NODE_NAME_PI

### `getParent()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

### `getDisplayName()`

**Returns:** `java.lang.String`

### `getXMLBaseURL()`

**Returns:** `java.net.URL`

It is resolved taking into account the values of all the `'xml:base'` 
 attributes from the ancestors and the document URL if necessary. 
 

 If no `'xml:base'` attribute is present, the document system ID
 will be returned.
 
 See specification: [http://www.w3.org/TR/xmlbase/](http://www.w3.org/TR/xmlbase/).

### `getTextContent()`

**Returns:** `java.lang.String`

The returned value is obtained by adding all the descendants 
 text content. The special sentinel characters are removed.

### `getContentIterator()`

**Returns:** [`ro.sync.ecss.extensions.api.node.ContentIterator`](./ContentIterator.md)

The content may contain special characters which have the value equal to 0. 
 These special characters are the markers for content referenced by descendant nodes.
 
 
More about how Author Nodes point to the content:

### `getNamespace()`

**Returns:** `java.lang.String`

### `getNamespaceContext()`

**Returns:** [`ro.sync.ecss.extensions.api.node.NamespaceContext`](./NamespaceContext.md)

