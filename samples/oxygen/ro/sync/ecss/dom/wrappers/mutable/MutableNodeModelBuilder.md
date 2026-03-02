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

### `build(ro.sync.ecss.dom.wrappers.mutable.AuthorSource arg0, net.sf.saxon.Configuration arg1)`

**Returns:** `net.sf.saxon.om.NodeInfo`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dom.wrappers.mutable.AuthorSource`](./AuthorSource.md))
- `arg1` (`net.sf.saxon.Configuration`)

### `makeWrapper(org.w3c.dom.Node arg0, ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper arg1, ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper arg2, int arg3)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

### `setContextNode(ro.sync.ecss.extensions.api.AuthorAccess arg0, net.sf.saxon.om.NodeInfo arg1, net.sf.saxon.Configuration arg2, net.sf.saxon.query.DynamicQueryContext arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md))
- `arg1` (`net.sf.saxon.om.NodeInfo`)
- `arg2` (`net.sf.saxon.Configuration`)
- `arg3` (`net.sf.saxon.query.DynamicQueryContext`)

### `getLocationXpathExpression(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md))

### `getNodesByXPath(net.sf.saxon.om.NodeInfo arg0, net.sf.saxon.Configuration arg1, java.lang.String arg2, ro.sync.ecss.extensions.api.node.NamespaceContext arg3)`

**Returns:** `net.sf.saxon.om.NodeInfo`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)
- `arg1` (`net.sf.saxon.Configuration`)
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.extensions.api.node.NamespaceContext`](../../../extensions/api/node/NamespaceContext.md))

### `setSelectionContext(ro.sync.ecss.extensions.api.AuthorAccess arg0, net.sf.saxon.om.NodeInfo arg1, net.sf.saxon.Configuration arg2, net.sf.saxon.query.DynamicQueryContext arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md))
- `arg1` (`net.sf.saxon.om.NodeInfo`)
- `arg2` (`net.sf.saxon.Configuration`)
- `arg3` (`net.sf.saxon.query.DynamicQueryContext`)

### `initializeQueryContext(ro.sync.ecss.dom.wrappers.mutable.AuthorSource arg0, net.sf.saxon.Configuration arg1, net.sf.saxon.query.DynamicQueryContext arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dom.wrappers.mutable.AuthorSource`](./AuthorSource.md))
- `arg1` (`net.sf.saxon.Configuration`)
- `arg2` (`net.sf.saxon.query.DynamicQueryContext`)

