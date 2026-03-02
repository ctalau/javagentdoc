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

### `<init>(Node arg0, DocumentWrapper arg1, DOMNodeWrapper arg2, int arg3)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

## Methods

### `makeWrapper(Node arg0, DocumentWrapper arg1)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `makeWrapper(Node arg0, DocumentWrapper arg1, DOMNodeWrapper arg2, int arg3)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` ([`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md))
- `arg2` ([`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md))
- `arg3` (`int`)

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getTreeInfo()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md)

### `getUnderlyingNode()`

**Returns:** `org.w3c.dom.Node`

### `getNodeKind()`

**Returns:** `int`

### `equals(Object arg0)`

**Parameters:**
- `arg0` (`java.lang.Object`)

**Returns:** `boolean`

### `equalOrNull(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `compareOrder(NodeInfo arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NodeInfo`)

**Returns:** `int`

### `getUnicodeStringValue()`

**Returns:** `net.sf.saxon.str.UnicodeString`

### `emptyIfNull(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `net.sf.saxon.str.UnicodeString`

### `expandStringValue(NodeList arg0, UnicodeBuilder arg1)`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` (`net.sf.saxon.str.UnicodeBuilder`)

**Returns:** `void`

### `getLocalPart()`

**Returns:** `java.lang.String`

### `getLocalName(Node arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)

**Returns:** `java.lang.String`

### `getNamespaceUri()`

**Returns:** `net.sf.saxon.om.NamespaceUri`

### `getElementURI(Element arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.Element`)

**Returns:** `java.lang.String`

### `getAttributeURI(Attr arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.Attr`)

**Returns:** `java.lang.String`

### `getPrefix()`

**Returns:** `java.lang.String`

### `getDisplayName()`

**Returns:** `java.lang.String`

### `getParent()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getSiblingPosition()`

**Returns:** `int`

### `iterateAttributes(NodeTest arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

### `isElementOnly(NodeTest arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)

**Returns:** `boolean`

### `iterateChildren(NodeTest arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

### `iterateSiblings(NodeTest arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)
- `arg1` (`boolean`)

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

### `iterateDescendants(NodeTest arg0, boolean arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.pattern.NodeTest`)
- `arg1` (`boolean`)

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

### `getAttributeValue(NamespaceUri arg0, String arg1)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NamespaceUri`)
- `arg1` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getRoot()`

**Returns:** `net.sf.saxon.om.NodeInfo`

### `hasChildNodes()`

**Returns:** `boolean`

### `generateId(StringBuilder arg0)`

**Parameters:**
- `arg0` (`java.lang.StringBuilder`)

**Returns:** `void`

### `getDeclaredNamespaces(NamespaceBinding[] arg0)`

**Parameters:**
- `arg0` (`net.sf.saxon.om.NamespaceBinding[]`)

**Returns:** `net.sf.saxon.om.NamespaceBinding[]`

### `getAllNamespaces()`

**Returns:** `net.sf.saxon.om.NamespaceMap`

### `isId()`

**Returns:** `boolean`

### `getNextSibling()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `spannedWrapper(Node arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getFirstChild()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getPreviousSibling()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getSuccessorElement(SteppingNode arg0, NamespaceUri arg1, String arg2)`

**Parameters:**
- `arg0` (`net.sf.saxon.tree.util.SteppingNode`)
- `arg1` (`net.sf.saxon.om.NamespaceUri`)
- `arg2` (`java.lang.String`)

**Returns:** `net.sf.saxon.tree.util.SteppingNode`

### `getSuccessorNode(Node arg0, Node arg1)`

**Parameters:**
- `arg0` (`org.w3c.dom.Node`)
- `arg1` (`org.w3c.dom.Node`)

**Returns:** `org.w3c.dom.Node`

