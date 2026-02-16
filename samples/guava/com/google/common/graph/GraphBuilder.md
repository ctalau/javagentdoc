# Class: `GraphBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.GraphBuilder`

**Extends:** [`com.google.common.graph.AbstractGraphBuilder<N>`](./AbstractGraphBuilder.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A builder for constructing instances of {@link MutableGraph} or {@link ImmutableGraph} with
 user-defined properties.

 <p>A {@code Graph} built by this class has the following default properties:

 <ul>
   <li>does not allow self-loops
   <li>orders {@link Graph#nodes()} in the order in which the elements were added (insertion
       order)
 </ul>

 <p>{@code Graph}s built by this class also guarantee that each collection-returning accessor
 returns a <b>(live) unmodifiable view</b>; see <a href="https://github.com/google/guava/wiki/GraphsExplained#accessor-behavior">the external
 documentation</a> for details.

 <p>Examples of use:

 <pre>{@code
 // Building a mutable graph
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
 }</pre>
@author James Sexton
@author Joshua O'Madadhain
@param <N> The most general node type this builder will support. This is normally {@code Object}
     unless it is constrained by using a method like {@link #nodeOrder}, or the builder is
     constructed based on an existing {@code Graph} using {@link #from(Graph)}.
@since 20.0

## Constructors

### `<init>(`boolean` directed)`

Creates a new instance with the specified edge directionality.

## Methods

### `directed()`

**Returns:** [`com.google.common.graph.GraphBuilder<java.lang.Object>`](./GraphBuilder.md)

Returns a {@link GraphBuilder} for building directed graphs.

### `undirected()`

**Returns:** [`com.google.common.graph.GraphBuilder<java.lang.Object>`](./GraphBuilder.md)

Returns a {@link GraphBuilder} for building undirected graphs.

### `from([`com.google.common.graph.Graph<N>`](./Graph.md) graph)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

Returns a {@link GraphBuilder} initialized with all properties queryable from {@code graph}.

 <p>The "queryable" properties are those that are exposed through the {@link Graph} interface,
 such as {@link Graph#isDirected()}. Other properties, such as {@link #expectedNodeCount(int)},
 are not set in the new builder.

### `immutable()`

**Returns:** [`com.google.common.graph.ImmutableGraph.Builder<N1>`](ImmutableGraph/Builder.md)

Returns an {@link ImmutableGraph.Builder} with the properties of this {@link GraphBuilder}.

 <p>The returned builder can be used for populating an {@link ImmutableGraph}.

 <p>Note that the returned builder will always have {@link #incidentEdgeOrder} set to {@link ElementOrder#stable()}, regardless of the value that was set in this builder.
@since 28.0

### `allowsSelfLoops(`boolean` allowsSelfLoops)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

Specifies whether the graph will allow self-loops (edges that connect a node to itself).
 Attempting to add a self-loop to a graph that does not allow them will throw an {@link UnsupportedOperationException}.

 <p>The default value is {@code false}.

### `expectedNodeCount(`int` expectedNodeCount)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

Specifies the expected number of nodes in the graph.
@throws IllegalArgumentException if {@code expectedNodeCount} is negative

### `nodeOrder([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md) nodeOrder)`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

Specifies the order of iteration for the elements of {@link Graph#nodes()}.

 <p>The default value is {@link ElementOrder#insertion() insertion order}.

### `incidentEdgeOrder([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md) incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

Specifies the order of iteration for the elements of {@link Graph#edges()}, {@link Graph#adjacentNodes(Object)}, {@link Graph#predecessors(Object)}, {@link Graph#successors(Object)} and {@link Graph#incidentEdges(Object)}.

 <p>The default value is {@link ElementOrder#unordered() unordered} for mutable graphs. For
 immutable graphs, this value is ignored; they always have a {@link ElementOrder#stable() stable} order.
@throws IllegalArgumentException if {@code incidentEdgeOrder} is not either {@code
     ElementOrder.unordered()} or {@code ElementOrder.stable()}.
@since 29.0

### `build()`

**Returns:** [`com.google.common.graph.MutableGraph<N1>`](./MutableGraph.md)

Returns an empty {@link MutableGraph} with the properties of this {@link GraphBuilder}.

### `copy()`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

### `cast()`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

