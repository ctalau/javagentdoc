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

### `<init>(Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

## Methods

### `copyOf(Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

**Returns:** [`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md)

### `copyOf(ImmutableNetwork<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md))

**Returns:** [`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md)

### `asGraph()`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

### `getNodeConnections(Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

**Returns:** `java.util.Map<N,com.google.common.graph.NetworkConnections<N,E>>`

### `getEdgeToReferenceNode(Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

**Returns:** `java.util.Map<E,N>`

### `connectionsOf(Network<N,E> network, N node)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))
- `node` (`N`)

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

### `sourceNodeFn(Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

### `targetNodeFn(Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

### `adjacentNodeFn(Network<N,E> network, N node)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))
- `node` (`N`)

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

