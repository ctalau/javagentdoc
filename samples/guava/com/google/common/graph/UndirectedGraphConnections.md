# Class: `UndirectedGraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedGraphConnections`

**Implements:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `adjacentNodeValues`

**Type:** `java.util.Map<N,V>`

## Constructors

### `<init>(java.util.Map<N,V> adjacentNodeValues)`

**Parameters:**
- `adjacentNodeValues` (`java.util.Map<N,V>`)

## Methods

### `of(com.google.common.graph.ElementOrder<N> incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.UndirectedGraphConnections<N,V>`](./UndirectedGraphConnections.md)

**Parameters:**
- `incidentEdgeOrder` ([`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md))

### `ofImmutable(java.util.Map<N,V> adjacentNodeValues)`

**Returns:** [`com.google.common.graph.UndirectedGraphConnections<N,V>`](./UndirectedGraphConnections.md)

**Parameters:**
- `adjacentNodeValues` (`java.util.Map<N,V>`)

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

### `removeSuccessor(N node)`

**Returns:** `V`

**Parameters:**
- `node` (`N`)

### `addPredecessor(N node, V value)`

**Returns:** `void`

**Parameters:**
- `node` (`N`)
- `value` (`V`)

### `addSuccessor(N node, V value)`

**Returns:** `V`

**Parameters:**
- `node` (`N`)
- `value` (`V`)

