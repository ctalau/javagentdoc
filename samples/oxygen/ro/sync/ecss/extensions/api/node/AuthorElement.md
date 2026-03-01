# Interface: `AuthorElement`

**Package:** [`ro.sync.ecss.extensions.api.node`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.node.AuthorElement`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorElementBaseInterface`](../AuthorElementBaseInterface.md)

## Description

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

## Methods

### `getAttribute(`java.lang.String` name)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AttrValue`](./AttrValue.md)

If no such
 attribute exists, returns `null`.

### `getNamespace()`

**Returns:** `java.lang.String`

### `getLocalName()`

**Returns:** `java.lang.String`

### `getChild(`java.lang.String` childLocalName)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

### `getElementsByLocalName(`java.lang.String` localName)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](./AuthorElement.md)

### `getAttributesCount()`

**Returns:** `int`

### `getAttributeAtIndex(`int` index)`

**Returns:** `java.lang.String`

### `setAttribute(`java.lang.String` qName, [`ro.sync.ecss.extensions.api.node.AttrValue`](./AttrValue.md) attributeValue)`

**Returns:** `void`

If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

### `setName(`java.lang.String` newName)`

**Returns:** `void`

If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

### `removeAttribute(`java.lang.String` qName)`

**Returns:** `void`

If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

### `getAttributeNamespace(`java.lang.String` attributePrefix)`

**Returns:** `java.lang.String`

### `setAttributesNoNSUpdate(`java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>` attrs)`

**Returns:** `void`

**Warning:** Use this only when the element is from an AuthorDocumentFragment and not from 
 the current AuthorDocument content.

  All operations on nodes from the document model must be done using the 
  AuthorDocumentController methods.
 If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

### `getPseudoClassNames()`

**Returns:** `java.util.Set<java.lang.String>`

