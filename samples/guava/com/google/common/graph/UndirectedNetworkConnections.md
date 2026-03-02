# Class: `UndirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractUndirectedNetworkConnections<N,E>`](./AbstractUndirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

## Constructors

### `<init>(Map<E,N> incidentEdgeMap)`

**Parameters:**
- `incidentEdgeMap` (`java.util.Map<E,N>`)

## Methods

### `of()`

**Returns:** [`com.google.common.graph.UndirectedNetworkConnections<N,E>`](./UndirectedNetworkConnections.md)

### `ofImmutable(Map<E,N> incidentEdges)`

**Parameters:**
- `incidentEdges` (`java.util.Map<E,N>`)

**Returns:** [`com.google.common.graph.UndirectedNetworkConnections<N,E>`](./UndirectedNetworkConnections.md)

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `edgesConnecting(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

