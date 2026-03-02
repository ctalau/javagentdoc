# Class: `ForwardingValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ForwardingValueGraph`

**Extends:** [`com.google.common.graph.AbstractValueGraph<N,V>`](./AbstractValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This is
 not currently planned to be released as a general-purpose forwarding class.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

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

**Returns:** `java.util.Set<N>`

**Parameters:**
- `node` (`N`)

### `predecessors(N node)`

**Returns:** `java.util.Set<N>`

**Parameters:**
- `node` (`N`)

### `successors(N node)`

**Returns:** `java.util.Set<N>`

**Parameters:**
- `node` (`N`)

### `degree(N node)`

**Returns:** `int`

**Parameters:**
- `node` (`N`)

### `inDegree(N node)`

**Returns:** `int`

**Parameters:**
- `node` (`N`)

### `outDegree(N node)`

**Returns:** `int`

**Parameters:**
- `node` (`N`)

### `hasEdgeConnecting(N nodeU, N nodeV)`

**Returns:** `boolean`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `boolean`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `edgeValue(N nodeU, N nodeV)`

**Returns:** `java.util.Optional<V>`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgeValue(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `java.util.Optional<V>`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `edgeValueOrDefault(N nodeU, N nodeV, V defaultValue)`

**Returns:** `V`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `defaultValue` (`V`)

### `edgeValueOrDefault(com.google.common.graph.EndpointPair<N> endpoints, V defaultValue)`

**Returns:** `V`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `defaultValue` (`V`)

