# Class: `AbstractNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractNetwork`

**Implements:** [`com.google.common.graph.Network<N,E>`](./Network.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of {@link Network}. It is recommended to extend
 this class rather than implement {@link Network} directly.

 <p>The methods implemented in this class should not be overridden unless the subclass admits a
 more efficient implementation.
@author James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type
@since 20.0

## Constructors

### `<init>()`

## Methods

### `asGraph()`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

### `degree([`N`](N.md) node)`

**Returns:** `int`

### `inDegree([`N`](N.md) node)`

**Returns:** `int`

### `outDegree([`N`](N.md) node)`

**Returns:** `int`

### `adjacentEdges([`E`](E.md) edge)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `edgesConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `edgesConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `connectedPredicate([`N`](N.md) nodePresent, [`N`](N.md) nodeToCheck)`

**Returns:** [`com.google.common.base.Predicate<E>`](../base/Predicate.md)

### `edgeConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`java.util.Optional<E>`](../../../../java/util/Optional.md)

### `edgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`java.util.Optional<E>`](../../../../java/util/Optional.md)

### `edgeConnectingOrNull([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`E`](E.md)

### `edgeConnectingOrNull([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`E`](E.md)

### `hasEdgeConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `validateEndpoints([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md) endpoints)`

**Returns:** `void`

Throws an IllegalArgumentException if the ordering of {@code endpoints} is not compatible with
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

**Returns:** [`java.util.Map<E,com.google.common.graph.EndpointPair<N>>`](../../../../java/util/Map>.md)

