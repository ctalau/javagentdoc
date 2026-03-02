# Class: `DocumentWrapper`

**Package:** [`ro.sync.ecss.dom.wrappers.mutable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`

**Extends:** `net.sf.saxon.om.GenericTreeInfo`

## Fields

### `domLevel3`

**Type:** `boolean`

### `docNode`

**Type:** `org.w3c.dom.Node`

## Constructors

### `<init>(org.w3c.dom.Node arg0, java.lang.String arg1, net.sf.saxon.Configuration arg2)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` (`java.lang.String`)
- `arg2` (`net.sf.saxon.Configuration`)

## Methods

### `wrap(org.w3c.dom.Node arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `setDOMLevel(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `getDOMLevel()`

**Returns:** `int`

### `selectID(java.lang.String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `net.sf.saxon.om.NodeInfo`

### `getUnparsedEntityNames()`

**Returns:** `java.util.Iterator<java.lang.String>`

### `getUnparsedEntity(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String[]`

### `getUnparsedEntity(org.w3c.dom.Entity arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.Entity`)

**Returns:** `java.lang.String[]`

### `isMutable()`

**Returns:** `boolean`

