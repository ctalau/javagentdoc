# Class: `ForwardingGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ForwardingGraph`

**Extends:** [`com.google.common.graph.AbstractGraph<N>`](./AbstractGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

This is not
 currently planned to be released as a general-purpose forwarding class.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

### `nodes()`

**Returns:** `java.util.Set<N>`

### `edgeCount()`

**Returns:** `long`

### `isDirected()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `adjacentNodes(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `predecessors(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `successors(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `incidentEdges(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

### `degree(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `int`

### `inDegree(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `int`

### `outDegree(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `int`

### `hasEdgeConnecting(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `boolean`

### `hasEdgeConnecting(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `boolean`

