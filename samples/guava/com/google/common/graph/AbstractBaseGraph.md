# Class: `AbstractBaseGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractBaseGraph`

**Implements:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

The methods implemented in this class should not be overridden unless the subclass admits a
 more efficient implementation.

## Constructors

### `<init>()`

## Methods

### `edgeCount()`

**Returns:** `long`

This implementation requires O(|N|) time. Classes extending this one may manually keep track of
 the number of edges as the graph is updated, and override this method for better performance.

### `edges()`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `incidentEdges(N node)`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

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

### `validateEndpoints(com.google.common.graph.EndpointPair<?> endpoints)`

**Returns:** `void`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md))

### `isOrderingCompatible(com.google.common.graph.EndpointPair<?> endpoints)`

**Returns:** `boolean`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md))

