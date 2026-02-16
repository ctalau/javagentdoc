# Class: `StandardMutableNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardMutableNetwork`

**Extends:** [`com.google.common.graph.StandardNetwork<N,E>`](./StandardNetwork.md)

**Implements:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

Standard implementation of {@link MutableNetwork} that supports both directed and undirected
 graphs. Instances of this class should be constructed with {@link NetworkBuilder}.

 <p>Time complexities for mutation methods are all O(1) except for {@code removeNode(N node)},
 which is in O(d_node) where d_node is the degree of {@code node}.
@author James Sexton
@author Joshua O'Madadhain
@author Omar Darwish
@param <N> Node parameter type
@param <E> Edge parameter type

## Constructors

### `<init>([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md) builder)`

Constructs a mutable graph with the properties specified in {@code builder}.

## Methods

### `addNode([`N`](N.md) node)`

**Returns:** `boolean`

### `addNodeInternal([`N`](N.md) node)`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

Adds {@code node} to the graph and returns the associated {@link NetworkConnections}.
@throws IllegalStateException if {@code node} is already present

### `addEdge([`N`](N.md) nodeU, [`N`](N.md) nodeV, [`E`](E.md) edge)`

**Returns:** `boolean`

### `addEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, [`E`](E.md) edge)`

**Returns:** `boolean`

### `removeNode([`N`](N.md) node)`

**Returns:** `boolean`

### `removeEdge([`E`](E.md) edge)`

**Returns:** `boolean`

### `newConnections()`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

