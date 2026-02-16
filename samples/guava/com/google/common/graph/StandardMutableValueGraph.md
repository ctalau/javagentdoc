# Class: `StandardMutableValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardMutableValueGraph`

**Extends:** [`com.google.common.graph.StandardValueGraph<N,V>`](./StandardValueGraph.md)

**Implements:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Standard implementation of {@link MutableValueGraph} that supports both directed and undirected
 graphs. Instances of this class should be constructed with {@link ValueGraphBuilder}.

 <p>Time complexities for mutation methods are all O(1) except for {@code removeNode(N node)},
 which is in O(d_node) where d_node is the degree of {@code node}.
@author James Sexton
@author Joshua O'Madadhain
@author Omar Darwish
@param <N> Node parameter type
@param <V> Value parameter type

## Fields

### `incidentEdgeOrder`

**Type:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

## Constructors

### `<init>([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md) builder)`

Constructs a mutable graph with the properties specified in {@code builder}.

## Methods

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `addNode([`N`](N.md) node)`

**Returns:** `boolean`

### `addNodeInternal([`N`](N.md) node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

Adds {@code node} to the graph and returns the associated {@link GraphConnections}.
@throws IllegalStateException if {@code node} is already present

### `putEdgeValue([`N`](N.md) nodeU, [`N`](N.md) nodeV, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `putEdgeValue([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `removeNode([`N`](N.md) node)`

**Returns:** `boolean`

### `removeEdge([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`V`](V.md)

### `removeEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`V`](V.md)

### `newConnections()`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

