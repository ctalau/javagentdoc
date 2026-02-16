# Class: `AbstractBaseGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractBaseGraph`

**Implements:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of {@link BaseGraph}.

 <p>The methods implemented in this class should not be overridden unless the subclass admits a
 more efficient implementation.
@author James Sexton
@param <N> Node parameter type

## Constructors

### `<init>()`

## Methods

### `edgeCount()`

**Returns:** `long`

Returns the number of edges in this graph; used to calculate the size of {@link Graph#edges()}.
 This implementation requires O(|N|) time. Classes extending this one may manually keep track of
 the number of edges as the graph is updated, and override this method for better performance.

### `edges()`

**Returns:** [`java.util.Set<com.google.common.graph.EndpointPair<N>>`](../../../../java/util/Set>.md)

An implementation of {@link BaseGraph#edges()} defined in terms of {@link Graph#nodes()} and
 {@link #successors(Object)}.

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `incidentEdges([`N`](N.md) node)`

**Returns:** [`java.util.Set<com.google.common.graph.EndpointPair<N>>`](../../../../java/util/Set>.md)

### `degree([`N`](N.md) node)`

**Returns:** `int`

### `inDegree([`N`](N.md) node)`

**Returns:** `int`

### `outDegree([`N`](N.md) node)`

**Returns:** `int`

### `hasEdgeConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `validateEndpoints([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md) endpoints)`

**Returns:** `void`

Throws {@code IllegalArgumentException} if the ordering of {@code endpoints} is not compatible
 with the directionality of this graph.

### `isOrderingCompatible([`com.google.common.graph.EndpointPair<?>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

Returns {@code true} iff {@code endpoints}' ordering is compatible with the directionality of
 this graph.

