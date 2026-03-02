# Class: `StandardMutableGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardMutableGraph`

**Extends:** [`com.google.common.graph.ForwardingGraph<N>`](./ForwardingGraph.md)

**Implements:** [`com.google.common.graph.MutableGraph<N>`](./MutableGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

Instances of this class should be constructed with GraphBuilder.

 
Time complexities for mutation methods are all O(1) except for removeNode(N node),
 which is in O(d_node) where d_node is the degree of node.

## Fields

### `backingValueGraph`

**Type:** [`com.google.common.graph.MutableValueGraph<N,com.google.common.graph.GraphConstants.Presence>`](./MutableValueGraph.md)

## Constructors

### `<init>(com.google.common.graph.AbstractGraphBuilder<? super N> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md))

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

### `addNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `putEdge(N nodeU, N nodeV)`

**Returns:** `boolean`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `putEdge(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `boolean`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `removeNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `removeEdge(N nodeU, N nodeV)`

**Returns:** `boolean`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `removeEdge(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `boolean`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

