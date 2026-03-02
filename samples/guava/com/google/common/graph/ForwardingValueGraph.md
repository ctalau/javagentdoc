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

### `edgeValue(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `java.util.Optional<V>`

### `edgeValue(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `java.util.Optional<V>`

### `edgeValueOrDefault(N nodeU, N nodeV, V defaultValue)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `defaultValue` (`V`)

**Returns:** `V`

### `edgeValueOrDefault(EndpointPair<N> endpoints, V defaultValue)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `defaultValue` (`V`)

**Returns:** `V`

