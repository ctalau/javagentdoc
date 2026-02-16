# Interface: `GraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.GraphConnections`

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An interface for representing and manipulating an origin node's adjacent nodes and edge values in
 a `Graph`.
**Author:** James Sexton
@param <N> Node parameter type
@param <V> Value parameter type

## Methods

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `incidentEdgeIterator(`N` thisNode)`

**Returns:** `java.util.Iterator<com.google.common.graph.EndpointPair<N>>`

Returns an iterator over the incident edges.
@param thisNode The node that this all of the connections in this class are connected to.

### `value(`N` node)`

**Returns:** `V`

Returns the value associated with the edge connecting the origin node to `node`, or null
 if there is no such edge.

### `removePredecessor(`N` node)`

**Returns:** `void`

Remove `node` from the set of predecessors.

### `removeSuccessor(`N` node)`

**Returns:** `V`

Remove `node` from the set of successors. Returns the value previously associated with
 the edge connecting the two nodes.

### `addPredecessor(`N` node, `V` value)`

**Returns:** `void`

Add `node` as a predecessor to the origin node. In the case of an undirected graph, it
 also becomes a successor. Associates `value` with the edge connecting the two nodes.

### `addSuccessor(`N` node, `V` value)`

**Returns:** `V`

Add `node` as a successor to the origin node. In the case of an undirected graph, it also
 becomes a predecessor. Associates `value` with the edge connecting the two nodes. Returns
 the value previously associated with the edge connecting the two nodes.

