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

### `adjacentEdges(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** `java.util.Set<E>`

### `edgesConnecting(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `java.util.Set<E>`

### `edgesConnecting(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `java.util.Set<E>`

### `connectedPredicate(N nodePresent, N nodeToCheck)`

**Parameters:**
- `nodePresent` (`N`)
- `nodeToCheck` (`N`)

**Returns:** [`com.google.common.base.Predicate<E>`](../base/Predicate.md)

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

### `validateEndpoints(EndpointPair<?> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md))

**Returns:** `void`

### `isOrderingCompatible(EndpointPair<?> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md))

**Returns:** `boolean`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `edgeIncidentNodesMap(Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

**Returns:** `java.util.Map<E,com.google.common.graph.EndpointPair<N>>`

