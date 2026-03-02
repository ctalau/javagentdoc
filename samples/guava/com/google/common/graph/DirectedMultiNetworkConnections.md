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

### `<init>(Map<E,N> inEdges, Map<E,N> outEdges, int selfLoopCount)`

**Parameters:**
- `inEdges` (`java.util.Map<E,N>`)
- `outEdges` (`java.util.Map<E,N>`)
- `selfLoopCount` (`int`)

## Methods

### `of()`

**Returns:** [`com.google.common.graph.DirectedMultiNetworkConnections<N,E>`](./DirectedMultiNetworkConnections.md)

### `ofImmutable(Map<E,N> inEdges, Map<E,N> outEdges, int selfLoopCount)`

**Parameters:**
- `inEdges` (`java.util.Map<E,N>`)
- `outEdges` (`java.util.Map<E,N>`)
- `selfLoopCount` (`int`)

**Returns:** [`com.google.common.graph.DirectedMultiNetworkConnections<N,E>`](./DirectedMultiNetworkConnections.md)

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `predecessorsMultiset()`

**Returns:** [`com.google.common.collect.Multiset<N>`](../collect/Multiset.md)

### `successors()`

**Returns:** `java.util.Set<N>`

### `successorsMultiset()`

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

