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

### `getAttribute(java.lang.String name)`

If no such
 attribute exists, returns `null`.

**Parameters:**
- `name` (`java.lang.String`): Name of the attribute.

**Returns:** [`ro.sync.ecss.extensions.api.node.AttrValue`](./AttrValue.md)

### `getNamespace()`

**Returns:** `java.lang.String`

### `getLocalName()`

**Returns:** `java.lang.String`

### `getChild(java.lang.String childLocalName)`

**Parameters:**
- `childLocalName` (`java.lang.String`): The local name of the searched children.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

### `getElementsByLocalName(java.lang.String localName)`

**Parameters:**
- `localName` (`java.lang.String`): The local name of the searched children.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](./AuthorElement.md)

### `getAttributesCount()`

**Returns:** `int`

### `getAttributeAtIndex(int index)`

**Parameters:**
- `index` (`int`): The index of the searched attribute, 0 based.

**Returns:** `java.lang.String`

### `setAttribute(java.lang.String qName, ro.sync.ecss.extensions.api.node.AttrValue attributeValue)`

If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

**Parameters:**
- `qName` (`java.lang.String`): The qualified name of the attribute to be set.
- `attributeValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](./AttrValue.md)): The AttrValue to set. Must not be `null`.

**Returns:** `void`

### `setName(java.lang.String newName)`

If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

**Parameters:**
- `newName` (`java.lang.String`): The new qualified name to be set.

**Returns:** `void`

### `removeAttribute(java.lang.String qName)`

If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

**Parameters:**
- `qName` (`java.lang.String`): The qualified name of the attribute to remove.

**Returns:** `void`

### `getAttributeNamespace(java.lang.String attributePrefix)`

**Parameters:**
- `attributePrefix` (`java.lang.String`): Prefix of attribute.

**Returns:** `java.lang.String`

### `setAttributesNoNSUpdate(java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue> attrs)`

**Warning:** Use this only when the element is from an AuthorDocumentFragment and not from 
 the current AuthorDocument content.

  All operations on nodes from the document model must be done using the 
  AuthorDocumentController methods.
 If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

**Parameters:**
- `attrs` (`java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>`): The map containing attribute qNames and their attributeValues.

**Returns:** `void`

### `getPseudoClassNames()`

**Returns:** `java.util.Set<java.lang.String>`

