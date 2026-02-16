# Class: `DirectedGraphConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.DirectedGraphConnections`

**Implements:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An implementation of {@link GraphConnections} for directed graphs.
@author James Sexton
@author Jens Nyman
@param <N> Node parameter type
@param <V> Value parameter type

## Fields

### `PRED`

**Type:** `java.lang.Object`

### `adjacentNodeValues`

**Type:** [`java.util.Map<N,java.lang.Object>`](../../../../java/util/Map.md)

### `orderedNodeConnections`

**Type:** [`java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>>`](../../../../java/util/List>.md)

All node connections in this graph, in edge insertion order.

 <p>Note: This field and {@link #adjacentNodeValues} cannot be combined into a single
 LinkedHashMap because one target node may be mapped to both a predecessor and a successor. A
 LinkedHashMap combines two such edges into a single node-value pair, even though the edges may
 not have been inserted consecutively.

### `predecessorCount`

**Type:** `int`

### `successorCount`

**Type:** `int`

## Constructors

### `<init>([`java.util.Map<N,java.lang.Object>`](../../../../java/util/Map.md) adjacentNodeValues, [`java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>>`](../../../../java/util/List>.md) orderedNodeConnections, `int` predecessorCount, `int` successorCount)`

## Methods

### `of([`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md) incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.DirectedGraphConnections<N,V>`](./DirectedGraphConnections.md)

### `ofImmutable([`N`](N.md) thisNode, `java.lang.Iterable<com.google.common.graph.EndpointPair<N>>` incidentEdges, [`com.google.common.base.Function<N,V>`](../base/Function.md) successorNodeToValueFn)`

**Returns:** [`com.google.common.graph.DirectedGraphConnections<N,V>`](./DirectedGraphConnections.md)

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

### `removeSuccessor(`java.lang.Object` node)`

**Returns:** [`V`](V.md)

### `addPredecessor([`N`](N.md) node, [`V`](V.md) unused)`

**Returns:** `void`

### `addSuccessor([`N`](N.md) node, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `isPredecessor(`java.lang.Object` value)`

**Returns:** `boolean`

### `isSuccessor(`java.lang.Object` value)`

**Returns:** `boolean`

