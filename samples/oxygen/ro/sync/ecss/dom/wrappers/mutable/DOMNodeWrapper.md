# Class: `DOMNodeWrapper`

**Package:** [`ro.sync.ecss.dom.wrappers.mutable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`

**Extends:** `net.sf.saxon.tree.wrapper.AbstractNodeWrapper`

**Implements:** `net.sf.saxon.tree.wrapper.SiblingCountingNode`, `net.sf.saxon.tree.util.SteppingNode`

## Fields

### `node`

**Type:** `org.w3c.dom.Node`

### `nodeKind`

**Type:** `short`

### `parent`

**Type:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `docWrapper`

**Type:** [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md)

### `index`

**Type:** `int`

### `span`

**Type:** `int`

### `localNamespaces`

**Type:** `net.sf.saxon.om.NamespaceBinding[]`

### `inScopeNamespaces`

**Type:** `net.sf.saxon.om.NamespaceMap`

## Constructors

### `<init>(org.w3c.dom.Node arg0, ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper arg1, ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper arg2, int arg3)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

## Methods

### `makeWrapper(org.w3c.dom.Node arg0, ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper arg1)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))

### `makeWrapper(org.w3c.dom.Node arg0, ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper arg1, ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper arg2, int arg3)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

### `getTreeInfo()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md)

### `getUnderlyingNode()`

**Returns:** `org.w3c.dom.Node`

### `getNodeKind()`

**Returns:** `int`

### `equals(java.lang.Object arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.Object`)

### `equalOrNull(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `compareOrder(net.sf.saxon.om.NodeInfo arg0)`

**Returns:** `int`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)

### `getUnicodeStringValue()`

**Returns:** `net.sf.saxon.str.UnicodeString`

### `emptyIfNull(java.lang.String arg0)`

**Returns:** `net.sf.saxon.str.UnicodeString`

**Parameters:**
- `arg0` (`java.lang.String`)

### `expandStringValue(org.w3c.dom.NodeList arg0, net.sf.saxon.str.UnicodeBuilder arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` (`net.sf.saxon.str.UnicodeBuilder`)

### `getLocalPart()`

**Returns:** `java.lang.String`

### `getLocalName(org.w3c.dom.Node arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)

### `getNamespaceUri()`

**Returns:** `net.sf.saxon.om.NamespaceUri`

### `getElementURI(org.w3c.dom.Element arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`org.w3c.dom.Element`)

### `getAttributeURI(org.w3c.dom.Attr arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`org.w3c.dom.Attr`)

### `getPrefix()`

**Returns:** `java.lang.String`

### `getDisplayName()`

**Returns:** `java.lang.String`

### `getParent()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getSiblingPosition()`

**Returns:** `int`

### `iterateAttributes(net.sf.saxon.pattern.NodeTest arg0)`

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)

### `isElementOnly(net.sf.saxon.pattern.NodeTest arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)

### `iterateChildren(net.sf.saxon.pattern.NodeTest arg0)`

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)

### `iterateSiblings(net.sf.saxon.pattern.NodeTest arg0, boolean arg1)`

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)
- `arg1` (`boolean`)

### `iterateDescendants(net.sf.saxon.pattern.NodeTest arg0, boolean arg1)`

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)
- `arg1` (`boolean`)

### `getAttributeValue(net.sf.saxon.om.NamespaceUri arg0, java.lang.String arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NamespaceUri`)
- `arg1` (`java.lang.String`)

### `getRoot()`

**Returns:** `net.sf.saxon.om.NodeInfo`

### `hasChildNodes()`

**Returns:** `boolean`

### `generateId(java.lang.StringBuilder arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.StringBuilder`)

### `getDeclaredNamespaces(net.sf.saxon.om.NamespaceBinding[] arg0)`

**Returns:** `net.sf.saxon.om.NamespaceBinding[]`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NamespaceBinding[]`)

### `getAllNamespaces()`

**Returns:** `net.sf.saxon.om.NamespaceMap`

### `isId()`

**Returns:** `boolean`

### `getNextSibling()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `spannedWrapper(org.w3c.dom.Node arg0)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)

### `getFirstChild()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getPreviousSibling()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getSuccessorElement(net.sf.saxon.tree.util.SteppingNode arg0, net.sf.saxon.om.NamespaceUri arg1, java.lang.String arg2)`

**Returns:** `net.sf.saxon.tree.util.SteppingNode`

**Parameters:**
- `arg0` (`net.sf.saxon.tree.util.SteppingNode`)
- `arg1` (`net.sf.saxon.om.NamespaceUri`)
- `arg2` (`java.lang.String`)

### `getSuccessorNode(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1)`

**Returns:** `org.w3c.dom.Node`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` (`org.w3c.dom.Node`)

