# Class: `GraphBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.GraphBuilder`

**Extends:** [`com.google.common.graph.AbstractGraphBuilder<N>`](./AbstractGraphBuilder.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A builder for constructing instances of `MutableGraph` or `ImmutableGraph` with
 user-defined properties.

 <p>A `Graph` built by this class has the following default properties:

 <ul>
   <li>does not allow self-loops
   <li>orders `Graph.nodes()` in the order in which the elements were added (insertion
       order)
 </ul>

 <p>`Graph`s built by this class also guarantee that each collection-returning accessor
 returns a <b>(live) unmodifiable view</b>; see <a href="https://github.com/google/guava/wiki/GraphsExplained#accessor-behavior">the external
 documentation</a> for details.

 <p>Examples of use:

 <pre>`// Building a mutable graph
 MutableGraph<String> graph = GraphBuilder.undirected().allowsSelfLoops(true).build();
 graph.putEdge("bread", "bread");
 graph.putEdge("chocolate", "peanut butter");
 graph.putEdge("peanut butter", "jelly");

 // Building an immutable graph
 ImmutableGraph<String> immutableGraph =
     GraphBuilder.undirected()
         .allowsSelfLoops(true)
         .<String>immutable()
         .putEdge("bread", "bread")
         .putEdge("chocolate", "peanut butter")
         .putEdge("peanut butter", "jelly")
         .build();
 `</pre>
**Author:** James Sexton
**Author:** Joshua O'Madadhain
@param <N> The most general node type this builder will support. This is normally `Object`
     unless it is constrained by using a method like `nodeOrder`, or the builder is
     constructed based on an existing `Graph` using `from(Graph)`.
**Since:** 20.0

## Constructors

### `<init>(`boolean` directed)`

Creates a new instance with the specified edge directionality.

## Methods

### `directed()`

**Returns:** [`com.google.common.graph.GraphBuilder<java.lang.Object>`](./GraphBuilder.md)

Returns a `GraphBuilder` for building directed graphs.

### `undirected()`

**Returns:** [`com.google.common.graph.GraphBuilder<java.lang.Object>`](./GraphBuilder.md)

Returns a `GraphBuilder` for building undirected graphs.

### `from([`com.google.common.graph.Graph<N>`](./Graph.md) graph)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

Returns a `GraphBuilder` initialized with all properties queryable from `graph`.

 <p>The "queryable" properties are those that are exposed through the `Graph` interface,
 such as `Graph.isDirected()`. Other properties, such as `expectedNodeCount(int)`,
 are not set in the new builder.

### `immutable()`

**Returns:** [`com.google.common.graph.ImmutableGraph.Builder<N1>`](ImmutableGraph/Builder.md)

Returns an `ImmutableGraph.Builder` with the properties of this `GraphBuilder`.

 <p>The returned builder can be used for populating an `ImmutableGraph`.

 <p>Note that the returned builder will always have `incidentEdgeOrder` set to `ElementOrder.stable()`, regardless of the value that was set in this builder.
**Since:** 28.0

### `allowsSelfLoops(`boolean` allowsSelfLoops)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

Specifies whether the graph will allow self-loops (edges that connect a node to itself).
 Attempting to add a self-loop to a graph that does not allow them will throw an `UnsupportedOperationException`.

 <p>The default value is `false`.

### `expectedNodeCount(`int` expectedNodeCount)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

Specifies the expected number of nodes in the graph.
@throws IllegalArgumentException if `expectedNodeCount` is negative

### `nodeOrder([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md) nodeOrder)`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

Specifies the order of iteration for the elements of `Graph.nodes()`.

 <p>The default value is `ElementOrder.insertion() insertion order`.

### `incidentEdgeOrder([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md) incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

Specifies the order of iteration for the elements of `Graph.edges()`, `Graph.adjacentNodes(Object)`, `Graph.predecessors(Object)`, `Graph.successors(Object)` and `Graph.incidentEdges(Object)`.

 <p>The default value is `ElementOrder.unordered() unordered` for mutable graphs. For
 immutable graphs, this value is ignored; they always have a `ElementOrder.stable() stable` order.
@throws IllegalArgumentException if `incidentEdgeOrder` is not either `ElementOrder.unordered()` or `ElementOrder.stable()`.
**Since:** 29.0

### `build()`

**Returns:** [`com.google.common.graph.MutableGraph<N1>`](./MutableGraph.md)

Returns an empty `MutableGraph` with the properties of this `GraphBuilder`.

### `copy()`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

### `cast()`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

