# Class: `DirectedGraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedGraphConnections`

**Implements:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An implementation of `GraphConnections` for directed graphs.
**Author:** James Sexton
**Author:** Jens Nyman
@param <N> Node parameter type
@param <V> Value parameter type

## Fields

### `PRED`

**Type:** `java.lang.Object`

### `adjacentNodeValues`

**Type:** `java.util.Map<N,java.lang.Object>`

### `orderedNodeConnections`

**Type:** `java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>>`

All node connections in this graph, in edge insertion order.

 <p>Note: This field and `adjacentNodeValues` cannot be combined into a single
 LinkedHashMap because one target node may be mapped to both a predecessor and a successor. A
 LinkedHashMap combines two such edges into a single node-value pair, even though the edges may
 not have been inserted consecutively.

### `predecessorCount`

**Type:** `int`

### `successorCount`

**Type:** `int`

## Constructors

### `<init>(`java.util.Map<N,java.lang.Object>` adjacentNodeValues, `java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>>` orderedNodeConnections, `int` predecessorCount, `int` successorCount)`

## Methods

### `of([`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md) incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.DirectedGraphConnections<N,V>`](./DirectedGraphConnections.md)

### `ofImmutable(`N` thisNode, `java.lang.Iterable<com.google.common.graph.EndpointPair<N>>` incidentEdges, [`com.google.common.base.Function<N,V>`](../base/Function.md) successorNodeToValueFn)`

**Returns:** [`com.google.common.graph.DirectedGraphConnections<N,V>`](./DirectedGraphConnections.md)

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

### `removeSuccessor(`java.lang.Object` node)`

**Returns:** `V`

### `addPredecessor(`N` node, `V` unused)`

**Returns:** `void`

### `addSuccessor(`N` node, `V` value)`

**Returns:** `V`

### `isPredecessor(`java.lang.Object` value)`

**Returns:** `boolean`

### `isSuccessor(`java.lang.Object` value)`

**Returns:** `boolean`

