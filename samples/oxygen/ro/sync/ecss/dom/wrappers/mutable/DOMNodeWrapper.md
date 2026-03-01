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

### `<init>(`org.w3c.dom.Node` arg0, [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md) arg1, [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md) arg2, `int` arg3)`

## Methods

### `makeWrapper(`org.w3c.dom.Node` arg0, [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md) arg1)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `makeWrapper(`org.w3c.dom.Node` arg0, [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md) arg1, [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md) arg2, `int` arg3)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getTreeInfo()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DocumentWrapper`](./DocumentWrapper.md)

### `getUnderlyingNode()`

**Returns:** `org.w3c.dom.Node`

### `getNodeKind()`

**Returns:** `int`

### `equals(`java.lang.Object` arg0)`

**Returns:** `boolean`

### `equalOrNull(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `boolean`

### `compareOrder(`net.sf.saxon.om.NodeInfo` arg0)`

**Returns:** `int`

### `getUnicodeStringValue()`

**Returns:** `net.sf.saxon.str.UnicodeString`

### `emptyIfNull(`java.lang.String` arg0)`

**Returns:** `net.sf.saxon.str.UnicodeString`

### `expandStringValue(`org.w3c.dom.NodeList` arg0, `net.sf.saxon.str.UnicodeBuilder` arg1)`

**Returns:** `void`

### `getLocalPart()`

**Returns:** `java.lang.String`

### `getLocalName(`org.w3c.dom.Node` arg0)`

**Returns:** `java.lang.String`

### `getNamespaceUri()`

**Returns:** `net.sf.saxon.om.NamespaceUri`

### `getElementURI(`org.w3c.dom.Element` arg0)`

**Returns:** `java.lang.String`

### `getAttributeURI(`org.w3c.dom.Attr` arg0)`

**Returns:** `java.lang.String`

### `getPrefix()`

**Returns:** `java.lang.String`

### `getDisplayName()`

**Returns:** `java.lang.String`

### `getParent()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getSiblingPosition()`

**Returns:** `int`

### `iterateAttributes(`net.sf.saxon.pattern.NodeTest` arg0)`

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

### `isElementOnly(`net.sf.saxon.pattern.NodeTest` arg0)`

**Returns:** `boolean`

### `iterateChildren(`net.sf.saxon.pattern.NodeTest` arg0)`

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

### `iterateSiblings(`net.sf.saxon.pattern.NodeTest` arg0, `boolean` arg1)`

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

### `iterateDescendants(`net.sf.saxon.pattern.NodeTest` arg0, `boolean` arg1)`

**Returns:** `net.sf.saxon.tree.iter.AxisIterator`

### `getAttributeValue(`net.sf.saxon.om.NamespaceUri` arg0, `java.lang.String` arg1)`

**Returns:** `java.lang.String`

### `getRoot()`

**Returns:** `net.sf.saxon.om.NodeInfo`

### `hasChildNodes()`

**Returns:** `boolean`

### `generateId(`java.lang.StringBuilder` arg0)`

**Returns:** `void`

### `getDeclaredNamespaces(`net.sf.saxon.om.NamespaceBinding[]` arg0)`

**Returns:** `net.sf.saxon.om.NamespaceBinding[]`

### `getAllNamespaces()`

**Returns:** `net.sf.saxon.om.NamespaceMap`

### `isId()`

**Returns:** `boolean`

### `getNextSibling()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `spannedWrapper(`org.w3c.dom.Node` arg0)`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getFirstChild()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getPreviousSibling()`

**Returns:** [`ro.sync.ecss.dom.wrappers.mutable.DOMNodeWrapper`](./DOMNodeWrapper.md)

### `getSuccessorElement(`net.sf.saxon.tree.util.SteppingNode` arg0, `net.sf.saxon.om.NamespaceUri` arg1, `java.lang.String` arg2)`

**Returns:** `net.sf.saxon.tree.util.SteppingNode`

### `getSuccessorNode(`org.w3c.dom.Node` arg0, `org.w3c.dom.Node` arg1)`

**Returns:** `org.w3c.dom.Node`

