# Interface: `AuthorElementBaseInterface`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorElementBaseInterface`

**Extends:** [`ro.sync.ecss.extensions.api.node.AuthorParentNode`](node/AuthorParentNode.md)

## Description

The element is mapped into the content
 by two sentinel characters (the node positions point to them), having the '\0' character code. This is 
 needed for easily moving the caret between two adjacent elements.

## Methods

### `getBeforeElement()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorElementBaseInterface`](./AuthorElementBaseInterface.md)

### `isFirstChildElement()`

**Returns:** `boolean`

### `getLocalName()`

**Returns:** `java.lang.String`

### `hasPseudoClass(`java.lang.String` name)`

**Returns:** `boolean`

### `setPseudoClass(`java.lang.String` name)`

**Returns:** `void`

**Warning:** Use this only when the element is from an AuthorDocumentFragment and not from 
 the current AuthorDocument content.

 All operations on nodes from the document model must be done using the AuthorDocumentController methods.

 If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

### `removePseudoClass(`java.lang.String` name)`

**Returns:** `void`

**Warning:** Use this only when the element is from an AuthorDocumentFragment and not from 
 the current AuthorDocument content.

 All operations on nodes from the document model must be done using the AuthorDocumentController methods.

 If the element is part of the edited document, an java.lang.UnsupportedOperationException is thrown.

### `isEmptyCSS3()`

**Returns:** `boolean`

