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

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)

### `setDOMLevel(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `getDOMLevel()`

**Returns:** `int`

### `selectID(java.lang.String arg0, boolean arg1)`

**Returns:** `net.sf.saxon.om.NodeInfo`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

### `getUnparsedEntityNames()`

**Returns:** `java.util.Iterator<java.lang.String>`

### `getUnparsedEntity(java.lang.String arg0)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getUnparsedEntity(org.w3c.dom.Entity arg0)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `arg0` (`org.w3c.dom.Entity`)

### `isMutable()`

**Returns:** `boolean`

