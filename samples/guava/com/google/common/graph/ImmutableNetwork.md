# Class: `ImmutableNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ImmutableNetwork`

**Extends:** [`com.google.common.graph.StandardNetwork<N,E>`](./StandardNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

Instances of
 this class may be obtained with #copyOf(Network).

 
See the Guava User's Guide's [discussion
 of the Immutable* types](https://github.com/google/guava/wiki/GraphsExplained#immutable-implementations) for more information on the properties and guarantees
 provided by this class.

## Constructors

### `<init>(com.google.common.graph.Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

## Methods

### `copyOf(com.google.common.graph.Network<N,E> network)`

**Returns:** [`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md)

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

### `copyOf(com.google.common.graph.ImmutableNetwork<N,E> network)`

**Returns:** [`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md)

**Parameters:**
- `network` ([`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md))

### `asGraph()`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

### `getNodeConnections(com.google.common.graph.Network<N,E> network)`

**Returns:** `java.util.Map<N,com.google.common.graph.NetworkConnections<N,E>>`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

### `getEdgeToReferenceNode(com.google.common.graph.Network<N,E> network)`

**Returns:** `java.util.Map<E,N>`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

### `connectionsOf(com.google.common.graph.Network<N,E> network, N node)`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))
- `node` (`N`)

### `sourceNodeFn(com.google.common.graph.Network<N,E> network)`

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

### `targetNodeFn(com.google.common.graph.Network<N,E> network)`

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

### `adjacentNodeFn(com.google.common.graph.Network<N,E> network, N node)`

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))
- `node` (`N`)

