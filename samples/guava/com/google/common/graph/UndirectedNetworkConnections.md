# Class: `UndirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractUndirectedNetworkConnections<N,E>`](./AbstractUndirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An implementation of {@link NetworkConnections} for undirected networks.
@author James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Constructors

### `<init>([`java.util.Map<E,N>`](../../../../java/util/Map.md) incidentEdgeMap)`

## Methods

### `of()`

**Returns:** [`com.google.common.graph.UndirectedNetworkConnections<N,E>`](./UndirectedNetworkConnections.md)

### `ofImmutable([`java.util.Map<E,N>`](../../../../java/util/Map.md) incidentEdges)`

**Returns:** [`com.google.common.graph.UndirectedNetworkConnections<N,E>`](./UndirectedNetworkConnections.md)

### `adjacentNodes()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `edgesConnecting([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

