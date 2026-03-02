# Class: `UndirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractUndirectedNetworkConnections<N,E>`](./AbstractUndirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

## Constructors

### `<init>(java.util.Map<E,N> incidentEdgeMap)`

**Parameters:**
- `incidentEdgeMap` (`java.util.Map<E,N>`)

## Methods

### `of()`

**Returns:** [`com.google.common.graph.UndirectedNetworkConnections<N,E>`](./UndirectedNetworkConnections.md)

### `ofImmutable(java.util.Map<E,N> incidentEdges)`

**Returns:** [`com.google.common.graph.UndirectedNetworkConnections<N,E>`](./UndirectedNetworkConnections.md)

**Parameters:**
- `incidentEdges` (`java.util.Map<E,N>`)

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `edgesConnecting(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

