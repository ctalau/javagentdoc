# Class: `NetworkBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.NetworkBuilder`

**Extends:** [`com.google.common.graph.AbstractGraphBuilder<N>`](./AbstractGraphBuilder.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A builder for constructing instances of `MutableNetwork` or `ImmutableNetwork` with
 user-defined properties.

 <p>A `Network` built by this class has the following default properties:

 <ul>
   <li>does not allow parallel edges
   <li>does not allow self-loops
   <li>orders `Network.nodes()` and `Network.edges()` in the order in which the
       elements were added (insertion order)
 </ul>

 <p>`Network`s built by this class also guarantee that each collection-returning accessor
 returns a <b>(live) unmodifiable view</b>; see <a href="https://github.com/google/guava/wiki/GraphsExplained#accessor-behavior">the external
 documentation</a> for details.

 <p>Examples of use:

 <pre>`// Building a mutable network
 MutableNetwork<String, Integer> network =
     NetworkBuilder.directed().allowsParallelEdges(true).build();
 flightNetwork.addEdge("LAX", "ATL", 3025);
 flightNetwork.addEdge("LAX", "ATL", 1598);
 flightNetwork.addEdge("ATL", "LAX", 2450);

 // Building a immutable network
 ImmutableNetwork<String, Integer> immutableNetwork =
     NetworkBuilder.directed()
         .allowsParallelEdges(true)
         .<String, Integer>immutable()
         .addEdge("LAX", "ATL", 3025)
         .addEdge("LAX", "ATL", 1598)
         .addEdge("ATL", "LAX", 2450)
         .build();
 `</pre>
**Author:** James Sexton
**Author:** Joshua O'Madadhain
@param <N> The most general node type this builder will support. This is normally `Object`
     unless it is constrained by using a method like `nodeOrder`, or the builder is
     constructed based on an existing `Network` using `from(Network)`.
@param <E> The most general edge type this builder will support. This is normally `Object`
     unless it is constrained by using a method like `edgeOrder`, or the builder is
     constructed based on an existing `Network` using `from(Network)`.
**Since:** 20.0

## Fields

### `allowsParallelEdges`

**Type:** `boolean`

### `edgeOrder`

**Type:** [`com.google.common.graph.ElementOrder<? super E>`](./ElementOrder.md)

### `expectedEdgeCount`

**Type:** [`com.google.common.base.Optional<java.lang.Integer>`](../base/Optional.md)

## Constructors

### `<init>(`boolean` directed)`

Creates a new instance with the specified edge directionality.

## Methods

### `directed()`

**Returns:** [`com.google.common.graph.NetworkBuilder<java.lang.Object,java.lang.Object>`](./NetworkBuilder.md)

Returns a `NetworkBuilder` for building directed networks.

### `undirected()`

**Returns:** [`com.google.common.graph.NetworkBuilder<java.lang.Object,java.lang.Object>`](./NetworkBuilder.md)

Returns a `NetworkBuilder` for building undirected networks.

### `from([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

Returns a `NetworkBuilder` initialized with all properties queryable from `network`.

 <p>The "queryable" properties are those that are exposed through the `Network` interface,
 such as `Network.isDirected()`. Other properties, such as `expectedNodeCount(int)`, are not set in the new builder.

### `immutable()`

**Returns:** [`com.google.common.graph.ImmutableNetwork.Builder<N1,E1>`](ImmutableNetwork/Builder.md)

Returns an `ImmutableNetwork.Builder` with the properties of this `NetworkBuilder`.

 <p>The returned builder can be used for populating an `ImmutableNetwork`.
**Since:** 28.0

### `allowsParallelEdges(`boolean` allowsParallelEdges)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

Specifies whether the network will allow parallel edges. Attempting to add a parallel edge to a
 network that does not allow them will throw an `UnsupportedOperationException`.

 <p>The default value is `false`.

### `allowsSelfLoops(`boolean` allowsSelfLoops)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

Specifies whether the network will allow self-loops (edges that connect a node to itself).
 Attempting to add a self-loop to a network that does not allow them will throw an `UnsupportedOperationException`.

 <p>The default value is `false`.

### `expectedNodeCount(`int` expectedNodeCount)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

Specifies the expected number of nodes in the network.
@throws IllegalArgumentException if `expectedNodeCount` is negative

### `expectedEdgeCount(`int` expectedEdgeCount)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

Specifies the expected number of edges in the network.
@throws IllegalArgumentException if `expectedEdgeCount` is negative

### `nodeOrder([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md) nodeOrder)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N1,E>`](./NetworkBuilder.md)

Specifies the order of iteration for the elements of `Network.nodes()`.

 <p>The default value is `ElementOrder.insertion() insertion order`.

### `edgeOrder([`com.google.common.graph.ElementOrder<E1>`](./ElementOrder.md) edgeOrder)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E1>`](./NetworkBuilder.md)

Specifies the order of iteration for the elements of `Network.edges()`.

 <p>The default value is `ElementOrder.insertion() insertion order`.

### `build()`

**Returns:** [`com.google.common.graph.MutableNetwork<N1,E1>`](./MutableNetwork.md)

Returns an empty `MutableNetwork` with the properties of this `NetworkBuilder`.

### `cast()`

**Returns:** [`com.google.common.graph.NetworkBuilder<N1,E1>`](./NetworkBuilder.md)

