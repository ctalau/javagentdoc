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

### `<init>(AbstractGraphBuilder<? super N> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md))

## Methods

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `addNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `addNodeInternal(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

### `putEdgeValue(N nodeU, N nodeV, V value)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `value` (`V`)

**Returns:** `V`

### `putEdgeValue(EndpointPair<N> endpoints, V value)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `value` (`V`)

**Returns:** `V`

### `removeNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `removeEdge(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `V`

### `removeEdge(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `V`

### `newConnections()`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

