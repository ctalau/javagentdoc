# Class: `ForwardingNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ForwardingNetwork`

**Extends:** [`com.google.common.graph.AbstractNetwork<N,E>`](./AbstractNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

This is not
 currently planned to be released as a general-purpose forwarding class.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.Network<N,E>`](./Network.md)

### `nodes()`

**Returns:** `java.util.Set<N>`

### `edges()`

**Returns:** `java.util.Set<E>`

### `isDirected()`

**Returns:** `boolean`

### `allowsParallelEdges()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `edgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<E>`](./ElementOrder.md)

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

### `incidentEdges(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

### `inEdges(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

### `outEdges(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

### `incidentNodes(E edge)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

**Parameters:**
- `edge` (`E`)

### `adjacentEdges(E edge)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `edge` (`E`)

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

### `edgesConnecting(N nodeU, N nodeV)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgesConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `edgeConnecting(N nodeU, N nodeV)`

**Returns:** `java.util.Optional<E>`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgeConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `java.util.Optional<E>`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `edgeConnectingOrNull(N nodeU, N nodeV)`

**Returns:** `E`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `E`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `hasEdgeConnecting(N nodeU, N nodeV)`

**Returns:** `boolean`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `boolean`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

