# Class: `AbstractUndirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractUndirectedNetworkConnections`

**Implements:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A base implementation of {@link NetworkConnections} for undirected networks.
@author James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Fields

### `incidentEdgeMap`

**Type:** [`java.util.Map<E,N>`](../../../../java/util/Map.md)

Keys are edges incident to the origin node, values are the node at the other end.

## Constructors

### `<init>([`java.util.Map<E,N>`](../../../../java/util/Map.md) incidentEdgeMap)`

## Methods

### `predecessors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `incidentEdges()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `inEdges()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `outEdges()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `adjacentNode([`E`](E.md) edge)`

**Returns:** [`N`](N.md)

### `removeInEdge([`E`](E.md) edge, `boolean` isSelfLoop)`

**Returns:** [`N`](N.md)

### `removeOutEdge([`E`](E.md) edge)`

**Returns:** [`N`](N.md)

### `addInEdge([`E`](E.md) edge, [`N`](N.md) node, `boolean` isSelfLoop)`

**Returns:** `void`

### `addOutEdge([`E`](E.md) edge, [`N`](N.md) node)`

**Returns:** `void`

