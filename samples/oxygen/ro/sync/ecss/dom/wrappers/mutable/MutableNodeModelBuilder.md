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

### `build([`ro.sync.ecss.dom.wrappers.mutable.AuthorSource`](./AuthorSource.md) arg0, `net.sf.saxon.Configuration` arg1)`

**Returns:** `net.sf.saxon.om.NodeInfo`

### `makeWrapper(`org.w3c.dom.Node` arg0, [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md) arg1, [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md) arg2, `int` arg3)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `setContextNode([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md) arg0, `net.sf.saxon.om.NodeInfo` arg1, `net.sf.saxon.Configuration` arg2, `net.sf.saxon.query.DynamicQueryContext` arg3)`

**Returns:** `void`

### `getLocationXpathExpression([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `java.lang.String`

### `getNodesByXPath(`net.sf.saxon.om.NodeInfo` arg0, `net.sf.saxon.Configuration` arg1, `java.lang.String` arg2, [`ro.sync.ecss.extensions.api.node.NamespaceContext`](../../../extensions/api/node/NamespaceContext.md) arg3)`

**Returns:** `net.sf.saxon.om.NodeInfo`

### `setSelectionContext([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md) arg0, `net.sf.saxon.om.NodeInfo` arg1, `net.sf.saxon.Configuration` arg2, `net.sf.saxon.query.DynamicQueryContext` arg3)`

**Returns:** `void`

### `initializeQueryContext([`ro.sync.ecss.dom.wrappers.mutable.AuthorSource`](./AuthorSource.md) arg0, `net.sf.saxon.Configuration` arg1, `net.sf.saxon.query.DynamicQueryContext` arg2)`

**Returns:** `void`

