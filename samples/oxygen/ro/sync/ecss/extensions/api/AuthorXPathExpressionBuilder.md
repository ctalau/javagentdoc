# Interface: `AuthorXPathExpressionBuilder`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorXPathExpressionBuilder`

## Description

## Methods

### `processChanges(boolean processChanges)`

**Parameters:**
- `processChanges` (`boolean`): If `true` the delete changes will be ignored.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorXPathExpressionBuilder`](./AuthorXPathExpressionBuilder.md)

### `avoidNamespacePrefixes()`

For example, intead of generating an expression like the one below that uses namespace prefixes
 

```
/db:article/db:sect1
```

 
Generate an expression that use the full namespace URI for the element.
 

```
/*[namespace-uri()='http://docbook.org/ns/docbook' and local-name()='article']/*[namespace-uri()='http://docbook.org/ns/docbook' and local-name()='sect1'][1]
```

**Returns:** [`ro.sync.ecss.extensions.api.AuthorXPathExpressionBuilder`](./AuthorXPathExpressionBuilder.md)

### `getXpathExpresion()`

**Returns:** `java.lang.String`

