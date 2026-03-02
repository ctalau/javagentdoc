# Class: `StandardMutableNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardMutableNetwork`

**Extends:** [`com.google.common.graph.StandardNetwork<N,E>`](./StandardNetwork.md)

**Implements:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

Instances of this class should be constructed with NetworkBuilder.

 
Time complexities for mutation methods are all O(1) except for removeNode(N node),
 which is in O(d_node) where d_node is the degree of node.

## Constructors

### `<init>(com.google.common.graph.NetworkBuilder<? super N,? super E> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md))

## Methods

### `addNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `addNodeInternal(N node)`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

**Parameters:**
- `node` (`N`)

### `addEdge(N nodeU, N nodeV, E edge)`

**Returns:** `boolean`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `edge` (`E`)

### `addEdge(com.google.common.graph.EndpointPair<N> endpoints, E edge)`

**Returns:** `boolean`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `edge` (`E`)

### `removeNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `removeEdge(E edge)`

**Returns:** `boolean`

**Parameters:**
- `edge` (`E`)

### `newConnections()`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

