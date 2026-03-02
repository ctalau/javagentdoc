# Class: `GetCurrentElementSaxonExtension`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.GetCurrentElementSaxonExtension`

**Extends:** `net.sf.saxon.lib.ExtensionFunctionDefinition`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `elementLocation`

**Type:** [`ro.sync.ecss.extensions.commons.operations.ElementLocationPath`](./ElementLocationPath.md)

### `cachedElement`

**Type:** `net.sf.saxon.om.NodeInfo`

## Constructors

### `<init>(ElementLocationPath currentElementLocation)`

**Parameters:**
- `currentElementLocation` ([`ro.sync.ecss.extensions.commons.operations.ElementLocationPath`](./ElementLocationPath.md)): the location of the element defined as a simple XPath.

## Methods

### `getFunctionQName()`

**Returns:** `net.sf.saxon.om.StructuredQName`

### `getArgumentTypes()`

**Returns:** `net.sf.saxon.value.SequenceType[]`

### `getResultType(SequenceType[] suppliedArgumentTypes)`

**Parameters:**
- `suppliedArgumentTypes` (`net.sf.saxon.value.SequenceType[]`)

**Returns:** `net.sf.saxon.value.SequenceType`

### `makeCallExpression()`

**Returns:** `net.sf.saxon.lib.ExtensionFunctionCall`

