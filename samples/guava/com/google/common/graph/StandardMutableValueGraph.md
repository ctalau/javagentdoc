# Class: `StandardMutableValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardMutableValueGraph`

**Extends:** [`com.google.common.graph.StandardValueGraph<N,V>`](./StandardValueGraph.md)

**Implements:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Instances of this class should be constructed with ValueGraphBuilder.

 
Time complexities for mutation methods are all O(1) except for removeNode(N node),
 which is in O(d_node) where d_node is the degree of node.

## Fields

### `incidentEdgeOrder`

**Type:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

## Constructors

### `<init>(com.google.common.graph.AbstractGraphBuilder<? super N> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md))

## Methods

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `addNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `addNodeInternal(N node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

**Parameters:**
- `node` (`N`)

### `putEdgeValue(N nodeU, N nodeV, V value)`

**Returns:** `V`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `value` (`V`)

### `putEdgeValue(com.google.common.graph.EndpointPair<N> endpoints, V value)`

**Returns:** `V`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `value` (`V`)

### `removeNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `removeEdge(N nodeU, N nodeV)`

**Returns:** `V`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `removeEdge(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `V`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `newConnections()`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

