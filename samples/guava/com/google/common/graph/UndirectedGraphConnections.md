# Class: `UndirectedGraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.UndirectedGraphConnections`

**Implements:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An implementation of {@link GraphConnections} for undirected graphs.
@author James Sexton
@param <N> Node parameter type
@param <V> Value parameter type

## Fields

### `adjacentNodeValues`

**Type:** [`java.util.Map<N,V>`](../../../../java/util/Map.md)

## Constructors

### `<init>([`java.util.Map<N,V>`](../../../../java/util/Map.md) adjacentNodeValues)`

## Methods

### `of([`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md) incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.UndirectedGraphConnections<N,V>`](./UndirectedGraphConnections.md)

### `ofImmutable([`java.util.Map<N,V>`](../../../../java/util/Map.md) adjacentNodeValues)`

**Returns:** [`com.google.common.graph.UndirectedGraphConnections<N,V>`](./UndirectedGraphConnections.md)

### `adjacentNodes()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `predecessors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `incidentEdgeIterator([`N`](N.md) thisNode)`

**Returns:** [`java.util.Iterator<com.google.common.graph.EndpointPair<N>>`](../../../../java/util/Iterator>.md)

### `value([`N`](N.md) node)`

**Returns:** [`V`](V.md)

### `removePredecessor([`N`](N.md) node)`

**Returns:** `void`

### `removeSuccessor([`N`](N.md) node)`

**Returns:** [`V`](V.md)

### `addPredecessor([`N`](N.md) node, [`V`](V.md) value)`

**Returns:** `void`

### `addSuccessor([`N`](N.md) node, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

