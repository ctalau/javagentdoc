# Interface: `GraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.GraphConnections`

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An interface for representing and manipulating an origin node's adjacent nodes and edge values in
 a {@link Graph}.
@author James Sexton
@param <N> Node parameter type
@param <V> Value parameter type

## Methods

### `adjacentNodes()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `predecessors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `incidentEdgeIterator([`N`](N.md) thisNode)`

**Returns:** [`java.util.Iterator<com.google.common.graph.EndpointPair<N>>`](../../../../java/util/Iterator>.md)

Returns an iterator over the incident edges.
@param thisNode The node that this all of the connections in this class are connected to.

### `value([`N`](N.md) node)`

**Returns:** [`V`](V.md)

Returns the value associated with the edge connecting the origin node to {@code node}, or null
 if there is no such edge.

### `removePredecessor([`N`](N.md) node)`

**Returns:** `void`

Remove {@code node} from the set of predecessors.

### `removeSuccessor([`N`](N.md) node)`

**Returns:** [`V`](V.md)

Remove {@code node} from the set of successors. Returns the value previously associated with
 the edge connecting the two nodes.

### `addPredecessor([`N`](N.md) node, [`V`](V.md) value)`

**Returns:** `void`

Add {@code node} as a predecessor to the origin node. In the case of an undirected graph, it
 also becomes a successor. Associates {@code value} with the edge connecting the two nodes.

### `addSuccessor([`N`](N.md) node, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

Add {@code node} as a successor to the origin node. In the case of an undirected graph, it also
 becomes a predecessor. Associates {@code value} with the edge connecting the two nodes. Returns
 the value previously associated with the edge connecting the two nodes.

