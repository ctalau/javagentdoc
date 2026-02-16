# Class: `UndirectedMultiNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedMultiNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractUndirectedNetworkConnections<N,E>`](./AbstractUndirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An implementation of `NetworkConnections` for undirected networks with parallel edges.
**Author:** James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Fields

### `adjacentNodesReference`

**Type:** `java.lang.ref.Reference<com.google.common.collect.Multiset<N>>`

## Constructors

### `<init>(`java.util.Map<E,N>` incidentEdges)`

## Methods

### `of()`

**Returns:** [`com.google.common.graph.UndirectedMultiNetworkConnections<N,E>`](./UndirectedMultiNetworkConnections.md)

### `ofImmutable(`java.util.Map<E,N>` incidentEdges)`

**Returns:** [`com.google.common.graph.UndirectedMultiNetworkConnections<N,E>`](./UndirectedMultiNetworkConnections.md)

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `adjacentNodesMultiset()`

**Returns:** [`com.google.common.collect.Multiset<N>`](../collect/Multiset.md)

### `edgesConnecting(`N` node)`

**Returns:** `java.util.Set<E>`

### `removeInEdge(`E` edge, `boolean` isSelfLoop)`

**Returns:** `N`

### `removeOutEdge(`E` edge)`

**Returns:** `N`

### `addInEdge(`E` edge, `N` node, `boolean` isSelfLoop)`

**Returns:** `void`

### `addOutEdge(`E` edge, `N` node)`

**Returns:** `void`

### `getReference(`java.lang.ref.Reference<T>` reference)`

**Returns:** `T`

