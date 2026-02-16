# Class: `AbstractNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractNetwork`

**Implements:** [`com.google.common.graph.Network<N,E>`](./Network.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of `Network`. It is recommended to extend
 this class rather than implement `Network` directly.

 <p>The methods implemented in this class should not be overridden unless the subclass admits a
 more efficient implementation.
**Author:** James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type
**Since:** 20.0

## Constructors

### `<init>()`

## Methods

### `asGraph()`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

### `degree(`N` node)`

**Returns:** `int`

### `inDegree(`N` node)`

**Returns:** `int`

### `outDegree(`N` node)`

**Returns:** `int`

### `adjacentEdges(`E` edge)`

**Returns:** `java.util.Set<E>`

### `edgesConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Set<E>`

### `edgesConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Set<E>`

### `connectedPredicate(`N` nodePresent, `N` nodeToCheck)`

**Returns:** [`com.google.common.base.Predicate<E>`](../base/Predicate.md)

### `edgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Optional<E>`

### `edgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Optional<E>`

### `edgeConnectingOrNull(`N` nodeU, `N` nodeV)`

**Returns:** `E`

### `edgeConnectingOrNull([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `E`

### `hasEdgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `validateEndpoints([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md) endpoints)`

**Returns:** `void`

Throws an IllegalArgumentException if the ordering of `endpoints` is not compatible with
 the directionality of this graph.

### `isOrderingCompatible([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this network.

### `edgeIncidentNodesMap([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** `java.util.Map<E,com.google.common.graph.EndpointPair<N>>`

