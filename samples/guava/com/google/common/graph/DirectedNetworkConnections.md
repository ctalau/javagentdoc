# Class: `DirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractDirectedNetworkConnections<N,E>`](./AbstractDirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

## Constructors

### `<init>(Map<E,N> inEdgeMap, Map<E,N> outEdgeMap, int selfLoopCount)`

**Parameters:**
- `inEdgeMap` (`java.util.Map<E,N>`)
- `outEdgeMap` (`java.util.Map<E,N>`)
- `selfLoopCount` (`int`)

## Methods

### `of()`

**Returns:** [`com.google.common.graph.DirectedNetworkConnections<N,E>`](./DirectedNetworkConnections.md)

### `ofImmutable(Map<E,N> inEdges, Map<E,N> outEdges, int selfLoopCount)`

**Parameters:**
- `inEdges` (`java.util.Map<E,N>`)
- `outEdges` (`java.util.Map<E,N>`)
- `selfLoopCount` (`int`)

**Returns:** [`com.google.common.graph.DirectedNetworkConnections<N,E>`](./DirectedNetworkConnections.md)

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `edgesConnecting(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

