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

### `<init>(NetworkBuilder<? super N,? super E> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md))

## Methods

### `addNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `addNodeInternal(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

### `addEdge(N nodeU, N nodeV, E edge)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `edge` (`E`)

**Returns:** `boolean`

### `addEdge(EndpointPair<N> endpoints, E edge)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `edge` (`E`)

**Returns:** `boolean`

### `removeNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `removeEdge(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** `boolean`

### `newConnections()`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

