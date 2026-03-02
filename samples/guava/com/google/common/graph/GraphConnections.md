# Interface: `GraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.GraphConnections`

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Methods

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `incidentEdgeIterator(N thisNode)`

**Returns:** `java.util.Iterator<com.google.common.graph.EndpointPair<N>>`

**Parameters:**
- `thisNode` (`N`): The node that this all of the connections in this class are connected to.

### `value(N node)`

**Returns:** `V`

**Parameters:**
- `node` (`N`)

### `removePredecessor(N node)`

**Returns:** `void`

**Parameters:**
- `node` (`N`)

### `removeSuccessor(N node)`

**Returns:** `V`

Returns the value previously associated with
 the edge connecting the two nodes.

**Parameters:**
- `node` (`N`)

### `addPredecessor(N node, V value)`

**Returns:** `void`

In the case of an undirected graph, it
 also becomes a successor. Associates value with the edge connecting the two nodes.

**Parameters:**
- `node` (`N`)
- `value` (`V`)

### `addSuccessor(N node, V value)`

**Returns:** `V`

In the case of an undirected graph, it also
 becomes a predecessor. Associates value with the edge connecting the two nodes. Returns
 the value previously associated with the edge connecting the two nodes.

**Parameters:**
- `node` (`N`)
- `value` (`V`)

