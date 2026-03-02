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

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `setNodeKind(short arg0)`

**Parameters:**
- `arg0` (`short`)

**Returns:** `void`

### `removeTypeAnnotation()`

**Returns:** `void`

### `insertChildren(net.sf.saxon.om.NodeInfo[] arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `void`

### `insertSiblings(net.sf.saxon.om.NodeInfo[] arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `void`

### `removeAttribute(net.sf.saxon.om.NodeInfo arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)

**Returns:** `void`

### `getAttributeIndex(net.sf.saxon.om.NodeInfo arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../extensions/api/node/AuthorElement.md))

**Returns:** `int`

### `setAttributes(net.sf.saxon.om.AttributeMap arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.AttributeMap`)

**Returns:** `void`

### `addAttribute(net.sf.saxon.om.NodeName arg0, net.sf.saxon.type.SimpleType arg1, java.lang.String arg2, int arg3, boolean arg4)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)
- `arg1` (`net.sf.saxon.type.SimpleType`)
- `arg2` (`java.lang.String`)
- `arg3` (`int`)
- `arg4` (`boolean`)

**Returns:** `void`

### `delete()`

**Returns:** `void`

### `getController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../extensions/api/AuthorDocumentController.md)

### `isDeleted()`

**Returns:** `boolean`

### `replace(net.sf.saxon.om.NodeInfo[] arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)

**Returns:** `void`

### `replaceStringValue(net.sf.saxon.str.UnicodeString arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.str.UnicodeString`)

**Returns:** `void`

### `unescapeAMP(java.lang.CharSequence arg0)`

**Parameters:**
- `arg0` (`java.lang.CharSequence`)

**Returns:** `java.lang.String`

### `rename(net.sf.saxon.om.NodeName arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)
- `arg1` (`boolean`)

**Returns:** `void`

### `getRenameAwareAttributeName(org.w3c.dom.Attr arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.Attr`)

**Returns:** `java.lang.String`

### `getQName(net.sf.saxon.om.NodeName arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)

**Returns:** `java.lang.String`

### `defineNamespace(net.sf.saxon.om.NodeName arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)
- `arg1` (`boolean`)

**Returns:** `void`

### `defineNamespace(boolean arg0, java.lang.String arg1, java.lang.String arg2)`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `void`

### `addNamespace(net.sf.saxon.om.NamespaceBinding arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NamespaceBinding`)
- `arg1` (`boolean`)

**Returns:** `void`

### `newBuilder()`

**Returns:** `net.sf.saxon.event.Builder`

### `serializeAsXML(net.sf.saxon.om.NodeInfo[] arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)

**Returns:** `java.lang.String`

### `getAuthorNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../extensions/api/node/AuthorNode.md)

### `getNodeOffsets()`

**Returns:** `int[]`

### `getNamespaceForPrefix(java.lang.String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `java.lang.String`

### `addNamespaceMapping(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `setTypeAnnotation(net.sf.saxon.type.SchemaType arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.type.SchemaType`)

**Returns:** `void`

### `setTreeInfo(ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))

**Returns:** `void`

