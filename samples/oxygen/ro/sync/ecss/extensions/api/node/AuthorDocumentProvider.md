# Interface: `AuthorDocumentProvider`

**Package:** [`ro.sync.ecss.extensions.api.node`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`

## Description

## Methods

### `getAuthorDocumentController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../AuthorDocumentController.md)

You can use it to make changes to the structure of nodes, run XPath expressions to identify 
 nodes and much more.

### `getContentReader()`

**Returns:** `java.io.Reader`

### `getContentInputStream()`

**Returns:** `java.io.InputStream`

### `save()`

**Returns:** `void`

### `getStyles([`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md) node)`

**Returns:** `ro.sync.ecss.css.Styles`

This method **MUST** only be used to query styles.

### `getLineColumnMapping(`int` offset)`

**Returns:** `int[]`

