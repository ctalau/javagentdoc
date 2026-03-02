# Class: `AbstractUndirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractUndirectedNetworkConnections`

**Implements:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

## Fields

### `incidentEdgeMap`

**Type:** `java.util.Map<E,N>`

## Constructors

### `<init>(java.util.Map<E,N> incidentEdgeMap)`

**Parameters:**
- `incidentEdgeMap` (`java.util.Map<E,N>`)

## Methods

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `incidentEdges()`

**Returns:** `java.util.Set<E>`

### `inEdges()`

**Returns:** `java.util.Set<E>`

### `outEdges()`

**Returns:** `java.util.Set<E>`

### `adjacentNode(E edge)`

**Returns:** `N`

**Parameters:**
- `edge` (`E`)

### `removeInEdge(E edge, boolean isSelfLoop)`

**Returns:** `N`

**Parameters:**
- `edge` (`E`)
- `isSelfLoop` (`boolean`)

### `removeOutEdge(E edge)`

**Returns:** `N`

**Parameters:**
- `edge` (`E`)

### `addInEdge(E edge, N node, boolean isSelfLoop)`

**Returns:** `void`

**Parameters:**
- `edge` (`E`)
- `node` (`N`)
- `isSelfLoop` (`boolean`)

### `addOutEdge(E edge, N node)`

**Returns:** `void`

**Parameters:**
- `edge` (`E`)
- `node` (`N`)

