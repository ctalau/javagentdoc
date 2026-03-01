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

### `<init>(`org.w3c.dom.Node` arg0, [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md) arg1, [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md) arg2, `int` arg3)`

## Methods

### `makeWrapper(`org.w3c.dom.Node` arg0, [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md) arg1, [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md) arg2, `int` arg3)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `setNodeKind(`short` arg0)`

**Returns:** `void`

### `removeTypeAnnotation()`

**Returns:** `void`

### `insertChildren(`net.sf.saxon.om.NodeInfo[]` arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `insertSiblings(`net.sf.saxon.om.NodeInfo[]` arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `removeAttribute(`net.sf.saxon.om.NodeInfo` arg0)`

**Returns:** `void`

### `getAttributeIndex(`net.sf.saxon.om.NodeInfo` arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../extensions/api/node/AuthorElement.md) arg1)`

**Returns:** `int`

### `setAttributes(`net.sf.saxon.om.AttributeMap` arg0)`

**Returns:** `void`

### `addAttribute(`net.sf.saxon.om.NodeName` arg0, `net.sf.saxon.type.SimpleType` arg1, `java.lang.String` arg2, `int` arg3, `boolean` arg4)`

**Returns:** `void`

### `delete()`

**Returns:** `void`

### `getController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../extensions/api/AuthorDocumentController.md)

### `isDeleted()`

**Returns:** `boolean`

### `replace(`net.sf.saxon.om.NodeInfo[]` arg0, `boolean` arg1)`

**Returns:** `void`

### `replaceStringValue(`net.sf.saxon.str.UnicodeString` arg0)`

**Returns:** `void`

### `unescapeAMP(`java.lang.CharSequence` arg0)`

**Returns:** `java.lang.String`

### `rename(`net.sf.saxon.om.NodeName` arg0, `boolean` arg1)`

**Returns:** `void`

### `getRenameAwareAttributeName(`org.w3c.dom.Attr` arg0)`

**Returns:** `java.lang.String`

### `getQName(`net.sf.saxon.om.NodeName` arg0)`

**Returns:** `java.lang.String`

### `defineNamespace(`net.sf.saxon.om.NodeName` arg0, `boolean` arg1)`

**Returns:** `void`

### `defineNamespace(`boolean` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `addNamespace(`net.sf.saxon.om.NamespaceBinding` arg0, `boolean` arg1)`

**Returns:** `void`

### `newBuilder()`

**Returns:** `net.sf.saxon.event.Builder`

### `serializeAsXML(`net.sf.saxon.om.NodeInfo[]` arg0)`

**Returns:** `java.lang.String`

### `getAuthorNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../extensions/api/node/AuthorNode.md)

### `getNodeOffsets()`

**Returns:** `int[]`

### `getNamespaceForPrefix(`java.lang.String` arg0, `boolean` arg1)`

**Returns:** `java.lang.String`

### `addNamespaceMapping(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `setTypeAnnotation(`net.sf.saxon.type.SchemaType` arg0)`

**Returns:** `void`

### `setTreeInfo([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md) arg0)`

**Returns:** `void`

