# Class: `UndirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractUndirectedNetworkConnections<N,E>`](./AbstractUndirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An implementation of `NetworkConnections` for undirected networks.
**Author:** James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Constructors

### `<init>(`java.util.Map<E,N>` incidentEdgeMap)`

## Methods

### `of()`

**Returns:** [`com.google.common.graph.UndirectedNetworkConnections<N,E>`](./UndirectedNetworkConnections.md)

### `ofImmutable(`java.util.Map<E,N>` incidentEdges)`

**Returns:** [`com.google.common.graph.UndirectedNetworkConnections<N,E>`](./UndirectedNetworkConnections.md)

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `edgesConnecting(`N` node)`

**Returns:** `java.util.Set<E>`

