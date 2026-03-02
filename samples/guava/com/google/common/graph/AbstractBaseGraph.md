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

This implementation requires O(|N|) time. Classes extending this one may manually keep track of
 the number of edges as the graph is updated, and override this method for better performance.

**Returns:** `long`

### `edges()`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

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

### `validateEndpoints(EndpointPair<?> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md))

**Returns:** `void`

### `isOrderingCompatible(EndpointPair<?> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md))

**Returns:** `boolean`

