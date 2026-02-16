# Class: `AbstractUndirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractUndirectedNetworkConnections`

**Implements:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A base implementation of `NetworkConnections` for undirected networks.
**Author:** James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Fields

### `incidentEdgeMap`

**Type:** `java.util.Map<E,N>`

Keys are edges incident to the origin node, values are the node at the other end.

## Constructors

### `<init>(`java.util.Map<E,N>` incidentEdgeMap)`

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

### `adjacentNode(`E` edge)`

**Returns:** `N`

### `removeInEdge(`E` edge, `boolean` isSelfLoop)`

**Returns:** `N`

### `removeOutEdge(`E` edge)`

**Returns:** `N`

### `addInEdge(`E` edge, `N` node, `boolean` isSelfLoop)`

**Returns:** `void`

### `addOutEdge(`E` edge, `N` node)`

**Returns:** `void`

