# Class: `DirectedMultiNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedMultiNetworkConnections`

**Extends:** [`com.google.common.graph.AbstractDirectedNetworkConnections<N,E>`](./AbstractDirectedNetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

## Fields

### `predecessorsReference`

**Type:** `java.lang.ref.Reference<com.google.common.collect.Multiset<N>>`

### `successorsReference`

**Type:** `java.lang.ref.Reference<com.google.common.collect.Multiset<N>>`

## Constructors

### `<init>(java.util.Map<E,N> inEdges, java.util.Map<E,N> outEdges, int selfLoopCount)`

**Parameters:**
- `inEdges` (`java.util.Map<E,N>`)
- `outEdges` (`java.util.Map<E,N>`)
- `selfLoopCount` (`int`)

## Methods

### `of()`

**Returns:** [`com.google.common.graph.DirectedMultiNetworkConnections<N,E>`](./DirectedMultiNetworkConnections.md)

### `ofImmutable(java.util.Map<E,N> inEdges, java.util.Map<E,N> outEdges, int selfLoopCount)`

**Returns:** [`com.google.common.graph.DirectedMultiNetworkConnections<N,E>`](./DirectedMultiNetworkConnections.md)

**Parameters:**
- `inEdges` (`java.util.Map<E,N>`)
- `outEdges` (`java.util.Map<E,N>`)
- `selfLoopCount` (`int`)

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `predecessorsMultiset()`

**Returns:** [`com.google.common.collect.Multiset<N>`](../collect/Multiset.md)

### `successors()`

**Returns:** `java.util.Set<N>`

### `successorsMultiset()`

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

