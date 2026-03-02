# Class: `MutableNodeModelBuilder`

**Package:** [`ro.sync.ecss.dom.wrappers.mutable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dom.wrappers.mutable.MutableNodeModelBuilder`

## Fields

### `SELECTION_PARAM`

**Type:** `java.lang.String`

### `OXY_NAMESPACE`

**Type:** `java.lang.String`

### `OXY_PREFIX`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `build(AuthorSource arg0, Configuration arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dom.wrappers.mutable.AuthorSource`](./AuthorSource.md))
- `arg1` (`net.sf.saxon.Configuration`)

**Returns:** `net.sf.saxon.om.NodeInfo`

### `makeWrapper(Node arg0, DocumentWrapper arg1, DOMNodeWrapper arg2, int arg3)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `setContextNode(AuthorAccess arg0, NodeInfo arg1, Configuration arg2, DynamicQueryContext arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md))
- `arg1` (`net.sf.saxon.om.NodeInfo`)
- `arg2` (`net.sf.saxon.Configuration`)
- `arg3` (`net.sf.saxon.query.DynamicQueryContext`)

**Returns:** `void`

### `getLocationXpathExpression(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md))

**Returns:** `java.lang.String`

### `getNodesByXPath(NodeInfo arg0, Configuration arg1, String arg2, NamespaceContext arg3)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)
- `arg1` (`net.sf.saxon.Configuration`)
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.extensions.api.node.NamespaceContext`](../../../extensions/api/node/NamespaceContext.md))

**Returns:** `net.sf.saxon.om.NodeInfo`

### `setSelectionContext(AuthorAccess arg0, NodeInfo arg1, Configuration arg2, DynamicQueryContext arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md))
- `arg1` (`net.sf.saxon.om.NodeInfo`)
- `arg2` (`net.sf.saxon.Configuration`)
- `arg3` (`net.sf.saxon.query.DynamicQueryContext`)

**Returns:** `void`

### `initializeQueryContext(AuthorSource arg0, Configuration arg1, DynamicQueryContext arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dom.wrappers.mutable.AuthorSource`](./AuthorSource.md))
- `arg1` (`net.sf.saxon.Configuration`)
- `arg2` (`net.sf.saxon.query.DynamicQueryContext`)

**Returns:** `void`

