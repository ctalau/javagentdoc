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

**Returns:** `java.util.Set<E>`

### `inEdges(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

### `outEdges(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

### `incidentNodes(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `adjacentEdges(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** `java.util.Set<E>`

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

### `edgesConnecting(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `java.util.Set<E>`

### `edgesConnecting(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `java.util.Set<E>`

### `edgeConnecting(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `java.util.Optional<E>`

### `edgeConnecting(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `java.util.Optional<E>`

### `edgeConnectingOrNull(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `E`

### `edgeConnectingOrNull(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `E`

### `hasEdgeConnecting(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `boolean`

### `hasEdgeConnecting(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `boolean`

