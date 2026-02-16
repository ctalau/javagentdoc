# Class: `StandardMutableNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardMutableNetwork`

**Extends:** [`com.google.common.graph.StandardNetwork<N,E>`](./StandardNetwork.md)

**Implements:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

Standard implementation of `MutableNetwork` that supports both directed and undirected
 graphs. Instances of this class should be constructed with `NetworkBuilder`.

 <p>Time complexities for mutation methods are all O(1) except for `removeNode(N node)`,
 which is in O(d_node) where d_node is the degree of `node`.
**Author:** James Sexton
**Author:** Joshua O'Madadhain
**Author:** Omar Darwish
@param <N> Node parameter type
@param <E> Edge parameter type

## Constructors

### `<init>([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md) builder)`

Constructs a mutable graph with the properties specified in `builder`.

## Methods

### `addNode(`N` node)`

**Returns:** `boolean`

### `addNodeInternal(`N` node)`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

Adds `node` to the graph and returns the associated `NetworkConnections`.
@throws IllegalStateException if `node` is already present

### `addEdge(`N` nodeU, `N` nodeV, `E` edge)`

**Returns:** `boolean`

### `addEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, `E` edge)`

**Returns:** `boolean`

### `removeNode(`N` node)`

**Returns:** `boolean`

### `removeEdge(`E` edge)`

**Returns:** `boolean`

### `newConnections()`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

