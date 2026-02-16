# Class: `ImmutableNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ImmutableNetwork`

**Extends:** [`com.google.common.graph.StandardNetwork<N,E>`](./StandardNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A {@link Network} whose elements and structural relationships will never change. Instances of
 this class may be obtained with {@link #copyOf(Network)}.

 <p>See the Guava User's Guide's <a href="https://github.com/google/guava/wiki/GraphsExplained#immutable-implementations">discussion
 of the {@code Immutable*} types</a> for more information on the properties and guarantees
 provided by this class.
@author James Sexton
@author Joshua O'Madadhain
@author Omar Darwish
@author Jens Nyman
@param <N> Node parameter type
@param <E> Edge parameter type
@since 20.0

## Constructors

### `<init>([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

## Methods

### `copyOf([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** [`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md)

Returns an immutable copy of {@code network}.

### `copyOf([`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md) network)`

**Returns:** [`com.google.common.graph.ImmutableNetwork<N,E>`](./ImmutableNetwork.md)

Simply returns its argument.
@deprecated no need to use this

### `asGraph()`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

### `getNodeConnections([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** [`java.util.Map<N,com.google.common.graph.NetworkConnections<N,E>>`](../../../../java/util/Map>.md)

### `getEdgeToReferenceNode([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** [`java.util.Map<E,N>`](../../../../java/util/Map.md)

### `connectionsOf([`com.google.common.graph.Network<N,E>`](./Network.md) network, [`N`](N.md) node)`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

### `sourceNodeFn([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

### `targetNodeFn([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

### `adjacentNodeFn([`com.google.common.graph.Network<N,E>`](./Network.md) network, [`N`](N.md) node)`

**Returns:** [`com.google.common.base.Function<E,N>`](../base/Function.md)

