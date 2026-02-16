# Class: `AbstractDirectedNetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractDirectedNetworkConnections`

**Implements:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A base implementation of `NetworkConnections` for directed networks.
**Author:** James Sexton
@param <N> Node parameter type
@param <E> Edge parameter type

## Fields

### `inEdgeMap`

**Type:** `java.util.Map<E,N>`

Keys are edges incoming to the origin node, values are the source node.

### `outEdgeMap`

**Type:** `java.util.Map<E,N>`

Keys are edges outgoing from the origin node, values are the target node.

### `selfLoopCount`

**Type:** `int`

## Constructors

### `<init>(`java.util.Map<E,N>` inEdgeMap, `java.util.Map<E,N>` outEdgeMap, `int` selfLoopCount)`

## Methods

### `adjacentNodes()`

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

