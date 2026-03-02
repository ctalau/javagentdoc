# Class: `AbstractNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractNetwork`

**Implements:** [`com.google.common.graph.Network<N,E>`](./Network.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

It is recommended to extend
 this class rather than implement Network directly.

 
The methods implemented in this class should not be overridden unless the subclass admits a
 more efficient implementation.

## Constructors

### `<init>()`

## Methods

### `asGraph()`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

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

### `adjacentEdges(E edge)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `edge` (`E`)

### `edgesConnecting(N nodeU, N nodeV)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgesConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `connectedPredicate(N nodePresent, N nodeToCheck)`

**Returns:** [`com.google.common.base.Predicate<E>`](../base/Predicate.md)

**Parameters:**
- `nodePresent` (`N`)
- `nodeToCheck` (`N`)

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

### `validateEndpoints(com.google.common.graph.EndpointPair<?> endpoints)`

**Returns:** `void`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md))

### `isOrderingCompatible(com.google.common.graph.EndpointPair<?> endpoints)`

**Returns:** `boolean`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md))

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `edgeIncidentNodesMap(com.google.common.graph.Network<N,E> network)`

**Returns:** `java.util.Map<E,com.google.common.graph.EndpointPair<N>>`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

