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

**Parameters:**
- `thisNode` (`N`): The node that this all of the connections in this class are connected to.

**Returns:** `java.util.Iterator<com.google.common.graph.EndpointPair<N>>`

### `value(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `V`

### `removePredecessor(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `void`

### `removeSuccessor(N node)`

Returns the value previously associated with
 the edge connecting the two nodes.

**Parameters:**
- `node` (`N`)

**Returns:** `V`

### `addPredecessor(N node, V value)`

In the case of an undirected graph, it
 also becomes a successor. Associates value with the edge connecting the two nodes.

**Parameters:**
- `node` (`N`)
- `value` (`V`)

**Returns:** `void`

### `addSuccessor(N node, V value)`

In the case of an undirected graph, it also
 becomes a predecessor. Associates value with the edge connecting the two nodes. Returns
 the value previously associated with the edge connecting the two nodes.

**Parameters:**
- `node` (`N`)
- `value` (`V`)

**Returns:** `V`

