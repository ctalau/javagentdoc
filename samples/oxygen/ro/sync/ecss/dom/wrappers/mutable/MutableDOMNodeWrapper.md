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

### `<init>(Node arg0, DocumentWrapper arg1, DOMNodeWrapper arg2, int arg3)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

## Methods

### `makeWrapper(Node arg0, DocumentWrapper arg1, DOMNodeWrapper arg2, int arg3)`

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

### `insertChildren(NodeInfo[] arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `void`

### `insertSiblings(NodeInfo[] arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `void`

### `removeAttribute(NodeInfo arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)

**Returns:** `void`

### `getAttributeIndex(NodeInfo arg0, AuthorElement arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../extensions/api/node/AuthorElement.md))

**Returns:** `int`

### `setAttributes(AttributeMap arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.AttributeMap`)

**Returns:** `void`

### `addAttribute(NodeName arg0, SimpleType arg1, String arg2, int arg3, boolean arg4)`

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

### `replace(NodeInfo[] arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)
- `arg1` (`boolean`)

**Returns:** `void`

### `replaceStringValue(UnicodeString arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.str.UnicodeString`)

**Returns:** `void`

### `unescapeAMP(CharSequence arg0)`

**Parameters:**
- `arg0` (`java.lang.CharSequence`)

**Returns:** `java.lang.String`

### `rename(NodeName arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)
- `arg1` (`boolean`)

**Returns:** `void`

### `getRenameAwareAttributeName(Attr arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.Attr`)

**Returns:** `java.lang.String`

### `getQName(NodeName arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)

**Returns:** `java.lang.String`

### `defineNamespace(NodeName arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeName`)
- `arg1` (`boolean`)

**Returns:** `void`

### `defineNamespace(boolean arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `void`

### `addNamespace(NamespaceBinding arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NamespaceBinding`)
- `arg1` (`boolean`)

**Returns:** `void`

### `newBuilder()`

**Returns:** `net.sf.saxon.event.Builder`

### `serializeAsXML(NodeInfo[] arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo[]`)

**Returns:** `java.lang.String`

### `getAuthorNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../extensions/api/node/AuthorNode.md)

### `getNodeOffsets()`

**Returns:** `int[]`

### `getNamespaceForPrefix(String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `java.lang.String`

### `addNamespaceMapping(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `setTypeAnnotation(SchemaType arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.type.SchemaType`)

**Returns:** `void`

### `setTreeInfo(DocumentWrapper arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))

**Returns:** `void`

