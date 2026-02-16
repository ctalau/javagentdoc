# Interface: `NetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.NetworkConnections`

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An interface for representing and manipulating an origin node's adjacent nodes and incident edges
 in a `Network`.
**Author:** James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Methods

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `incidentEdges()`

**Returns:** `java.util.Set<E>`

### `inEdges()`

**Returns:** `java.util.Set<E>`

### `outEdges()`

**Returns:** `java.util.Set<E>`

### `edgesConnecting(`N` node)`

**Returns:** `java.util.Set<E>`

Returns the set of edges connecting the origin node to `node`. For networks without
 parallel edges, this set cannot be of size greater than one.

### `adjacentNode(`E` edge)`

**Returns:** `N`

Returns the node that is adjacent to the origin node along `edge`.

 <p>In the directed case, `edge` is assumed to be an outgoing edge.

### `removeInEdge(`E` edge, `boolean` isSelfLoop)`

**Returns:** `N`

Remove `edge` from the set of incoming edges. Returns the former predecessor node.

 <p>In the undirected case, returns `null` if `isSelfLoop` is true.

### `removeOutEdge(`E` edge)`

**Returns:** `N`

Remove `edge` from the set of outgoing edges. Returns the former successor node.

### `addInEdge(`E` edge, `N` node, `boolean` isSelfLoop)`

**Returns:** `void`

Add `edge` to the set of incoming edges. Implicitly adds `node` as a predecessor.

### `addOutEdge(`E` edge, `N` node)`

**Returns:** `void`

Add `edge` to the set of outgoing edges. Implicitly adds `node` as a successor.

