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

### `<init>(Map<E,N> incidentEdges)`

**Parameters:**
- `incidentEdges` (`java.util.Map<E,N>`)

## Methods

### `of()`

**Returns:** [`com.google.common.graph.UndirectedMultiNetworkConnections<N,E>`](./UndirectedMultiNetworkConnections.md)

### `ofImmutable(Map<E,N> incidentEdges)`

**Parameters:**
- `incidentEdges` (`java.util.Map<E,N>`)

**Returns:** [`com.google.common.graph.UndirectedMultiNetworkConnections<N,E>`](./UndirectedMultiNetworkConnections.md)

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `adjacentNodesMultiset()`

**Returns:** [`com.google.common.collect.Multiset<N>`](../collect/Multiset.md)

### `edgesConnecting(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

### `removeInEdge(E edge, boolean isSelfLoop)`

**Parameters:**
- `edge` (`E`)
- `isSelfLoop` (`boolean`)

**Returns:** `N`

### `removeOutEdge(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** `N`

### `addInEdge(E edge, N node, boolean isSelfLoop)`

**Parameters:**
- `edge` (`E`)
- `node` (`N`)
- `isSelfLoop` (`boolean`)

**Returns:** `void`

### `addOutEdge(E edge, N node)`

**Parameters:**
- `edge` (`E`)
- `node` (`N`)

**Returns:** `void`

### `getReference(Reference<T> reference)`

**Parameters:**
- `reference` (`java.lang.ref.Reference<T>`)

**Returns:** `T`

