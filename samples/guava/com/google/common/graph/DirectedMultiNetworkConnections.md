# Class: `DirectedMultiNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedMultiNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractDirectedNetworkConnections<N,E>`](./AbstractDirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An implementation of `NetworkConnections` for directed networks with parallel edges.
**Author:** James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Fields

### `predecessorsReference`

**Type:** `java.lang.ref.Reference<com.google.common.collect.Multiset<N>>`

### `successorsReference`

**Type:** `java.lang.ref.Reference<com.google.common.collect.Multiset<N>>`

## Constructors

### `<init>(`java.util.Map<E,N>` inEdges, `java.util.Map<E,N>` outEdges, `int` selfLoopCount)`

## Methods

### `of()`

**Returns:** [`com.google.common.graph.DirectedMultiNetworkConnections<N,E>`](./DirectedMultiNetworkConnections.md)

### `ofImmutable(`java.util.Map<E,N>` inEdges, `java.util.Map<E,N>` outEdges, `int` selfLoopCount)`

**Returns:** [`com.google.common.graph.DirectedMultiNetworkConnections<N,E>`](./DirectedMultiNetworkConnections.md)

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `predecessorsMultiset()`

**Returns:** [`com.google.common.collect.Multiset<N>`](../collect/Multiset.md)

### `successors()`

**Returns:** `java.util.Set<N>`

### `successorsMultiset()`

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

