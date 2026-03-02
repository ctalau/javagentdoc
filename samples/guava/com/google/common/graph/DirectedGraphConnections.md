# Class: `DirectedGraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedGraphConnections`

**Implements:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `PRED`

**Type:** `java.lang.Object`

### `adjacentNodeValues`

**Type:** `java.util.Map<N,java.lang.Object>`

### `orderedNodeConnections`

**Type:** `java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>>`

Note: This field and #adjacentNodeValues cannot be combined into a single
 LinkedHashMap because one target node may be mapped to both a predecessor and a successor. A
 LinkedHashMap combines two such edges into a single node-value pair, even though the edges may
 not have been inserted consecutively.

### `predecessorCount`

**Type:** `int`

### `successorCount`

**Type:** `int`

## Constructors

### `<init>(java.util.Map<N,java.lang.Object> adjacentNodeValues, java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> orderedNodeConnections, int predecessorCount, int successorCount)`

**Parameters:**
- `adjacentNodeValues` (`java.util.Map<N,java.lang.Object>`)
- `orderedNodeConnections` (`java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>>`)
- `predecessorCount` (`int`)
- `successorCount` (`int`)

## Methods

### `of(com.google.common.graph.ElementOrder<N> incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.DirectedGraphConnections<N,V>`](./DirectedGraphConnections.md)

**Parameters:**
- `incidentEdgeOrder` ([`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md))

### `ofImmutable(N thisNode, java.lang.Iterable<com.google.common.graph.EndpointPair<N>> incidentEdges, com.google.common.base.Function<N,V> successorNodeToValueFn)`

**Returns:** [`com.google.common.graph.DirectedGraphConnections<N,V>`](./DirectedGraphConnections.md)

**Parameters:**
- `thisNode` (`N`)
- `incidentEdges` (`java.lang.Iterable<com.google.common.graph.EndpointPair<N>>`)
- `successorNodeToValueFn` ([`com.google.common.base.Function<N,V>`](../base/Function.md))

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `incidentEdgeIterator(N thisNode)`

**Returns:** `java.util.Iterator<com.google.common.graph.EndpointPair<N>>`

**Parameters:**
- `thisNode` (`N`)

### `value(N node)`

**Returns:** `V`

**Parameters:**
- `node` (`N`)

### `removePredecessor(N node)`

**Returns:** `void`

**Parameters:**
- `node` (`N`)

### `removeSuccessor(java.lang.Object node)`

**Returns:** `V`

**Parameters:**
- `node` (`java.lang.Object`)

### `addPredecessor(N node, V unused)`

**Returns:** `void`

**Parameters:**
- `node` (`N`)
- `unused` (`V`)

### `addSuccessor(N node, V value)`

**Returns:** `V`

**Parameters:**
- `node` (`N`)
- `value` (`V`)

### `isPredecessor(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `isSuccessor(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

