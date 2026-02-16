# Class: `StandardMutableGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardMutableGraph`

**Extends:** [`com.google.common.graph.ForwardingGraph<N>`](./ForwardingGraph.md)

**Implements:** [`com.google.common.graph.MutableGraph<N>`](./MutableGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

Standard implementation of `MutableGraph` that supports both directed and undirected
 graphs. Instances of this class should be constructed with `GraphBuilder`.

 <p>Time complexities for mutation methods are all O(1) except for `removeNode(N node)`,
 which is in O(d_node) where d_node is the degree of `node`.
**Author:** James Sexton
@param <N> Node parameter type

## Fields

### `backingValueGraph`

**Type:** [`com.google.common.graph.MutableValueGraph<N,com.google.common.graph.GraphConstants.Presence>`](./MutableValueGraph.md)

## Constructors

### `<init>([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md) builder)`

Constructs a `MutableGraph` with the properties specified in `builder`.

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

### `addNode(`N` node)`

**Returns:** `boolean`

### `putEdge(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

### `putEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `removeNode(`N` node)`

**Returns:** `boolean`

### `removeEdge(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

### `removeEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

