# Class: `MutableDOMNodeWrapper`

**Package:** [`ro.sync.ecss.dom.wrappers.mutable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dom.wrappers.mutable.MutableDOMNodeWrapper`

**Extends:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

**Implements:** `net.sf.saxon.om.MutableNodeInfo`

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `deleted`

**Type:** `java.lang.Boolean`

### `newAttrName`

**Type:** `java.lang.String`

## Constructors

### `<init>(org.w3c.dom.Node arg0, ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper arg1, ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper arg2, int arg3)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

## Methods

### `makeWrapper(org.w3c.dom.Node arg0, ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper arg1, ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper arg2, int arg3)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

### `setNodeKind(short arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`short`)

### `removeTypeAnnotation()`

**Returns:** `void`

### `insertChildren(net.sf.saxon.om.NodeInfo[] arg0, boolean arg1, boolean arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

### `insertSiblings(net.sf.saxon.om.NodeInfo[] arg0, boolean arg1, boolean arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

### `removeAttribute(net.sf.saxon.om.NodeInfo arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)

### `getAttributeIndex(net.sf.saxon.om.NodeInfo arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Returns:** `int`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../extensions/api/node/AuthorElement.md))

### `setAttributes(net.sf.saxon.om.AttributeMap arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.AttributeMap`)

### `addAttribute(net.sf.saxon.om.NodeName arg0, net.sf.saxon.type.SimpleType arg1, java.lang.String arg2, int arg3, boolean arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)
- `arg1` (`net.sf.saxon.type.SimpleType`)
- `arg2` (`java.lang.String`)
- `arg3` (`int`)
- `arg4` (`boolean`)

### `delete()`

**Returns:** `void`

### `getController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../extensions/api/AuthorDocumentController.md)

### `isDeleted()`

**Returns:** `boolean`

### `replace(net.sf.saxon.om.NodeInfo[] arg0, boolean arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)

### `replaceStringValue(net.sf.saxon.str.UnicodeString arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.str.UnicodeString`)

### `unescapeAMP(java.lang.CharSequence arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.CharSequence`)

### `rename(net.sf.saxon.om.NodeName arg0, boolean arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)
- `arg1` (`boolean`)

### `getRenameAwareAttributeName(org.w3c.dom.Attr arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`org.w3c.dom.Attr`)

### `getQName(net.sf.saxon.om.NodeName arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)

### `defineNamespace(net.sf.saxon.om.NodeName arg0, boolean arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)
- `arg1` (`boolean`)

### `defineNamespace(boolean arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `addNamespace(net.sf.saxon.om.NamespaceBinding arg0, boolean arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NamespaceBinding`)
- `arg1` (`boolean`)

### `newBuilder()`

**Returns:** `net.sf.saxon.event.Builder`

### `serializeAsXML(net.sf.saxon.om.NodeInfo[] arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)

### `getAuthorNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../extensions/api/node/AuthorNode.md)

### `getNodeOffsets()`

**Returns:** `int[]`

### `getNamespaceForPrefix(java.lang.String arg0, boolean arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

### `addNamespaceMapping(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `toString()`

**Returns:** `java.lang.String`

### `setTypeAnnotation(net.sf.saxon.type.SchemaType arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`net.sf.saxon.type.SchemaType`)

### `setTreeInfo(ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))

