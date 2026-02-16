# Class: `DirectedMultiNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedMultiNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractDirectedNetworkConnections<N,E>`](./AbstractDirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An implementation of {@link NetworkConnections} for directed networks with parallel edges.
@author James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Fields

### `predecessorsReference`

**Type:** `java.lang.ref.Reference<com.google.common.collect.Multiset<N>>`

### `successorsReference`

**Type:** `java.lang.ref.Reference<com.google.common.collect.Multiset<N>>`

## Constructors

### `<init>([`java.util.Map<E,N>`](../../../../java/util/Map.md) inEdges, [`java.util.Map<E,N>`](../../../../java/util/Map.md) outEdges, `int` selfLoopCount)`

## Methods

### `of()`

**Returns:** [`com.google.common.graph.DirectedMultiNetworkConnections<N,E>`](./DirectedMultiNetworkConnections.md)

### `ofImmutable([`java.util.Map<E,N>`](../../../../java/util/Map.md) inEdges, [`java.util.Map<E,N>`](../../../../java/util/Map.md) outEdges, `int` selfLoopCount)`

**Returns:** [`com.google.common.graph.DirectedMultiNetworkConnections<N,E>`](./DirectedMultiNetworkConnections.md)

### `predecessors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `predecessorsMultiset()`

**Returns:** [`com.google.common.collect.Multiset<N>`](../collect/Multiset.md)

### `successors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successorsMultiset()`

**Returns:** [`com.google.common.collect.Multiset<N>`](../collect/Multiset.md)

### `edgesConnecting([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `removeInEdge([`E`](E.md) edge, `boolean` isSelfLoop)`

**Returns:** [`N`](N.md)

### `removeOutEdge([`E`](E.md) edge)`

**Returns:** [`N`](N.md)

### `addInEdge([`E`](E.md) edge, [`N`](N.md) node, `boolean` isSelfLoop)`

**Returns:** `void`

### `addOutEdge([`E`](E.md) edge, [`N`](N.md) node)`

**Returns:** `void`

### `getReference(`java.lang.ref.Reference<T>` reference)`

**Returns:** [`T`](T.md)

