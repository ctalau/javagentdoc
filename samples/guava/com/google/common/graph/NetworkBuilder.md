# Class: `NetworkBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.NetworkBuilder`

**Extends:** [`com.google.common.graph.AbstractGraphBuilder<N>`](./AbstractGraphBuilder.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A Network built by this class has the following default properties:

 

   - does not allow parallel edges
   - does not allow self-loops
   - orders Network#nodes() and Network#edges() in the order in which the
       elements were added (insertion order)
 


 
Networks built by this class also guarantee that each collection-returning accessor
 returns a **(live) unmodifiable view**; see [the external
 documentation](https://github.com/google/guava/wiki/GraphsExplained#accessor-behavior) for details.

 
Examples of use:

 

```

 // Building a mutable network
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
 
```

## Fields

### `allowsParallelEdges`

**Type:** `boolean`

### `edgeOrder`

**Type:** [`com.google.common.graph.ElementOrder<? super E>`](./ElementOrder.md)

### `expectedEdgeCount`

**Type:** [`com.google.common.base.Optional<java.lang.Integer>`](../base/Optional.md)

## Constructors

### `<init>(boolean directed)`

**Parameters:**
- `directed` (`boolean`)

## Methods

### `directed()`

**Returns:** [`com.google.common.graph.NetworkBuilder<java.lang.Object,java.lang.Object>`](./NetworkBuilder.md)

### `undirected()`

**Returns:** [`com.google.common.graph.NetworkBuilder<java.lang.Object,java.lang.Object>`](./NetworkBuilder.md)

### `from(com.google.common.graph.Network<N,E> network)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

The "queryable" properties are those that are exposed through the Network interface,
 such as Network#isDirected(). Other properties, such as #expectedNodeCount(int), are not set in the new builder.

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

### `immutable()`

**Returns:** `com.google.common.graph.ImmutableNetwork.Builder<N1,E1>`

The returned builder can be used for populating an ImmutableNetwork.

### `allowsParallelEdges(boolean allowsParallelEdges)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

Attempting to add a parallel edge to a
 network that does not allow them will throw an UnsupportedOperationException.

 
The default value is false.

**Parameters:**
- `allowsParallelEdges` (`boolean`)

### `allowsSelfLoops(boolean allowsSelfLoops)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

Attempting to add a self-loop to a network that does not allow them will throw an UnsupportedOperationException.

 
The default value is false.

**Parameters:**
- `allowsSelfLoops` (`boolean`)

### `expectedNodeCount(int expectedNodeCount)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

**Parameters:**
- `expectedNodeCount` (`int`)

### `expectedEdgeCount(int expectedEdgeCount)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E>`](./NetworkBuilder.md)

**Parameters:**
- `expectedEdgeCount` (`int`)

### `nodeOrder(com.google.common.graph.ElementOrder<N1> nodeOrder)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N1,E>`](./NetworkBuilder.md)

The default value is insertion order.

**Parameters:**
- `nodeOrder` ([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md))

### `edgeOrder(com.google.common.graph.ElementOrder<E1> edgeOrder)`

**Returns:** [`com.google.common.graph.NetworkBuilder<N,E1>`](./NetworkBuilder.md)

The default value is insertion order.

**Parameters:**
- `edgeOrder` ([`com.google.common.graph.ElementOrder<E1>`](./ElementOrder.md))

### `build()`

**Returns:** [`com.google.common.graph.MutableNetwork<N1,E1>`](./MutableNetwork.md)

### `cast()`

**Returns:** [`com.google.common.graph.NetworkBuilder<N1,E1>`](./NetworkBuilder.md)

