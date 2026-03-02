# Class: `UndirectedMultiNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedMultiNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractUndirectedNetworkConnections<N,E>`](./AbstractUndirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

## Fields

### `adjacentNodesReference`

**Type:** `java.lang.ref.Reference<com.google.common.collect.Multiset<N>>`

## Constructors

### `<init>(java.util.Map<E,N> incidentEdges)`

**Parameters:**
- `incidentEdges` (`java.util.Map<E,N>`)

## Methods

### `of()`

**Returns:** [`com.google.common.graph.UndirectedMultiNetworkConnections<N,E>`](./UndirectedMultiNetworkConnections.md)

### `ofImmutable(java.util.Map<E,N> incidentEdges)`

**Returns:** [`com.google.common.graph.UndirectedMultiNetworkConnections<N,E>`](./UndirectedMultiNetworkConnections.md)

**Parameters:**
- `incidentEdges` (`java.util.Map<E,N>`)

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `adjacentNodesMultiset()`

**Returns:** [`com.google.common.collect.Multiset<N>`](../collect/Multiset.md)

### `edgesConnecting(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

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

### `getReference(java.lang.ref.Reference<T> reference)`

**Returns:** `T`

**Parameters:**
- `reference` (`java.lang.ref.Reference<T>`)

