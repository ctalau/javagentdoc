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

### `<init>(Map<N,V> adjacentNodeValues)`

**Parameters:**
- `adjacentNodeValues` (`java.util.Map<N,V>`)

## Methods

### `of(ElementOrder<N> incidentEdgeOrder)`

**Parameters:**
- `incidentEdgeOrder` ([`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md))

**Returns:** [`com.google.common.graph.UndirectedGraphConnections<N,V>`](./UndirectedGraphConnections.md)

### `ofImmutable(Map<N,V> adjacentNodeValues)`

**Parameters:**
- `adjacentNodeValues` (`java.util.Map<N,V>`)

**Returns:** [`com.google.common.graph.UndirectedGraphConnections<N,V>`](./UndirectedGraphConnections.md)

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

### `removeSuccessor(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `V`

### `addPredecessor(N node, V value)`

**Parameters:**
- `node` (`N`)
- `value` (`V`)

**Returns:** `void`

### `addSuccessor(N node, V value)`

**Parameters:**
- `node` (`N`)
- `value` (`V`)

**Returns:** `V`

