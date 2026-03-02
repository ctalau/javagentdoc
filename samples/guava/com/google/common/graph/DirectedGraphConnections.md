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

### `<init>(Map<N,Object> adjacentNodeValues, List<DirectedGraphConnections.NodeConnection<N>> orderedNodeConnections, int predecessorCount, int successorCount)`

**Parameters:**
- `adjacentNodeValues` (`java.util.Map<N,java.lang.Object>`)
- `orderedNodeConnections` (`java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>>`)
- `predecessorCount` (`int`)
- `successorCount` (`int`)

## Methods

### `of(ElementOrder<N> incidentEdgeOrder)`

**Parameters:**
- `incidentEdgeOrder` ([`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md))

**Returns:** [`com.google.common.graph.DirectedGraphConnections<N,V>`](./DirectedGraphConnections.md)

### `ofImmutable(N thisNode, Iterable<EndpointPair<N>> incidentEdges, Function<N,V> successorNodeToValueFn)`

**Parameters:**
- `thisNode` (`N`)
- `incidentEdges` (`java.lang.Iterable<com.google.common.graph.EndpointPair<N>>`)
- `successorNodeToValueFn` ([`com.google.common.base.Function<N,V>`](../base/Function.md))

**Returns:** [`com.google.common.graph.DirectedGraphConnections<N,V>`](./DirectedGraphConnections.md)

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `incidentEdgeIterator(N thisNode)`

**Parameters:**
- `thisNode` (`N`)

**Returns:** `java.util.Iterator<com.google.common.graph.EndpointPair<N>>`

### `value(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `V`

### `removePredecessor(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `void`

### `removeSuccessor(Object node)`

**Parameters:**
- `node` (`java.lang.Object`)

**Returns:** `V`

### `addPredecessor(N node, V unused)`

**Parameters:**
- `node` (`N`)
- `unused` (`V`)

**Returns:** `void`

### `addSuccessor(N node, V value)`

**Parameters:**
- `node` (`N`)
- `value` (`V`)

**Returns:** `V`

### `isPredecessor(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `isSuccessor(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

