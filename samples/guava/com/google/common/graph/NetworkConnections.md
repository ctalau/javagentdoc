# Interface: `NetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.NetworkConnections`

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An interface for representing and manipulating an origin node's adjacent nodes and incident edges
 in a {@link Network}.
@author James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Methods

### `adjacentNodes()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `predecessors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `incidentEdges()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `inEdges()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `outEdges()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `edgesConnecting([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

Returns the set of edges connecting the origin node to {@code node}. For networks without
 parallel edges, this set cannot be of size greater than one.

### `adjacentNode([`E`](E.md) edge)`

**Returns:** [`N`](N.md)

Returns the node that is adjacent to the origin node along {@code edge}.

 <p>In the directed case, {@code edge} is assumed to be an outgoing edge.

### `removeInEdge([`E`](E.md) edge, `boolean` isSelfLoop)`

**Returns:** [`N`](N.md)

Remove {@code edge} from the set of incoming edges. Returns the former predecessor node.

 <p>In the undirected case, returns {@code null} if {@code isSelfLoop} is true.

### `removeOutEdge([`E`](E.md) edge)`

**Returns:** [`N`](N.md)

Remove {@code edge} from the set of outgoing edges. Returns the former successor node.

### `addInEdge([`E`](E.md) edge, [`N`](N.md) node, `boolean` isSelfLoop)`

**Returns:** `void`

Add {@code edge} to the set of incoming edges. Implicitly adds {@code node} as a predecessor.

### `addOutEdge([`E`](E.md) edge, [`N`](N.md) node)`

**Returns:** `void`

Add {@code edge} to the set of outgoing edges. Implicitly adds {@code node} as a successor.

