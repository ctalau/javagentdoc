# Class: `DirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractDirectedNetworkConnections<N,E>`](./AbstractDirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An implementation of {@link NetworkConnections} for directed networks.
@author James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Constructors

### `<init>([`java.util.Map<E,N>`](../../../../java/util/Map.md) inEdgeMap, [`java.util.Map<E,N>`](../../../../java/util/Map.md) outEdgeMap, `int` selfLoopCount)`

## Methods

### `of()`

**Returns:** [`com.google.common.graph.DirectedNetworkConnections<N,E>`](./DirectedNetworkConnections.md)

### `ofImmutable([`java.util.Map<E,N>`](../../../../java/util/Map.md) inEdges, [`java.util.Map<E,N>`](../../../../java/util/Map.md) outEdges, `int` selfLoopCount)`

**Returns:** [`com.google.common.graph.DirectedNetworkConnections<N,E>`](./DirectedNetworkConnections.md)

### `predecessors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `edgesConnecting([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

