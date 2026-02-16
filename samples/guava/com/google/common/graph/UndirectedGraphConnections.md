# Class: `UndirectedGraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedGraphConnections`

**Implements:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An implementation of `GraphConnections` for undirected graphs.
**Author:** James Sexton
@param <N> Node parameter type
@param <V> Value parameter type

## Fields

### `adjacentNodeValues`

**Type:** `java.util.Map<N,V>`

## Constructors

### `<init>(`java.util.Map<N,V>` adjacentNodeValues)`

## Methods

### `of([`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md) incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.UndirectedGraphConnections<N,V>`](./UndirectedGraphConnections.md)

### `ofImmutable(`java.util.Map<N,V>` adjacentNodeValues)`

**Returns:** [`com.google.common.graph.UndirectedGraphConnections<N,V>`](./UndirectedGraphConnections.md)

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `incidentEdgeIterator(`N` thisNode)`

**Returns:** `java.util.Iterator<com.google.common.graph.EndpointPair<N>>`

### `value(`N` node)`

**Returns:** `V`

### `removePredecessor(`N` node)`

**Returns:** `void`

### `removeSuccessor(`N` node)`

**Returns:** `V`

### `addPredecessor(`N` node, `V` value)`

**Returns:** `void`

### `addSuccessor(`N` node, `V` value)`

**Returns:** `V`

