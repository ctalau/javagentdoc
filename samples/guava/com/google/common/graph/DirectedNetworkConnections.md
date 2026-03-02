# Class: `DirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractDirectedNetworkConnections<N,E>`](./AbstractDirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

## Constructors

### `<init>(java.util.Map<E,N> inEdgeMap, java.util.Map<E,N> outEdgeMap, int selfLoopCount)`

**Parameters:**
- `inEdgeMap` (`java.util.Map<E,N>`)
- `outEdgeMap` (`java.util.Map<E,N>`)
- `selfLoopCount` (`int`)

## Methods

### `of()`

**Returns:** [`com.google.common.graph.DirectedNetworkConnections<N,E>`](./DirectedNetworkConnections.md)

### `ofImmutable(java.util.Map<E,N> inEdges, java.util.Map<E,N> outEdges, int selfLoopCount)`

**Returns:** [`com.google.common.graph.DirectedNetworkConnections<N,E>`](./DirectedNetworkConnections.md)

**Parameters:**
- `inEdges` (`java.util.Map<E,N>`)
- `outEdges` (`java.util.Map<E,N>`)
- `selfLoopCount` (`int`)

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `edgesConnecting(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

