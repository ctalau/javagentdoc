# Class: `StandardMutableValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardMutableValueGraph`

**Extends:** [`com.google.common.graph.StandardValueGraph<N,V>`](./StandardValueGraph.md)

**Implements:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Standard implementation of `MutableValueGraph` that supports both directed and undirected
 graphs. Instances of this class should be constructed with `ValueGraphBuilder`.

 <p>Time complexities for mutation methods are all O(1) except for `removeNode(N node)`,
 which is in O(d_node) where d_node is the degree of `node`.
**Author:** James Sexton
**Author:** Joshua O'Madadhain
**Author:** Omar Darwish
@param <N> Node parameter type
@param <V> Value parameter type

## Fields

### `incidentEdgeOrder`

**Type:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

## Constructors

### `<init>([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md) builder)`

Constructs a mutable graph with the properties specified in `builder`.

## Methods

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `addNode(`N` node)`

**Returns:** `boolean`

### `addNodeInternal(`N` node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

Adds `node` to the graph and returns the associated `GraphConnections`.
@throws IllegalStateException if `node` is already present

### `putEdgeValue(`N` nodeU, `N` nodeV, `V` value)`

**Returns:** `V`

### `putEdgeValue([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, `V` value)`

**Returns:** `V`

### `removeNode(`N` node)`

**Returns:** `boolean`

### `removeEdge(`N` nodeU, `N` nodeV)`

**Returns:** `V`

### `removeEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `V`

### `newConnections()`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

