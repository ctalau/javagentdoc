# Class: `DirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractDirectedNetworkConnections<N,E>`](./AbstractDirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An implementation of `NetworkConnections` for directed networks.
**Author:** James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Constructors

### `<init>(`java.util.Map<E,N>` inEdgeMap, `java.util.Map<E,N>` outEdgeMap, `int` selfLoopCount)`

## Methods

### `of()`

**Returns:** [`com.google.common.graph.DirectedNetworkConnections<N,E>`](./DirectedNetworkConnections.md)

### `ofImmutable(`java.util.Map<E,N>` inEdges, `java.util.Map<E,N>` outEdges, `int` selfLoopCount)`

**Returns:** [`com.google.common.graph.DirectedNetworkConnections<N,E>`](./DirectedNetworkConnections.md)

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `edgesConnecting(`N` node)`

**Returns:** `java.util.Set<E>`

