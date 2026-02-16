# Class: `ValueGraphBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ValueGraphBuilder`

**Extends:** [`com.google.common.graph.AbstractGraphBuilder<N>`](./AbstractGraphBuilder.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A builder for constructing instances of {@link MutableValueGraph} or {@link ImmutableValueGraph}
 with user-defined properties.

 <p>A {@code ValueGraph} built by this class has the following default properties:

 <ul>
   <li>does not allow self-loops
   <li>orders {@link ValueGraph#nodes()} in the order in which the elements were added (insertion
       order)
 </ul>

 <p>{@code ValueGraph}s built by this class also guarantee that each collection-returning accessor
 returns a <b>(live) unmodifiable view</b>; see <a href="https://github.com/google/guava/wiki/GraphsExplained#accessor-behavior">the external
 documentation</a> for details.

 <p>Examples of use:

 <pre>{@code
 // Building a mutable value graph
 MutableValueGraph<String, Double> graph =
     ValueGraphBuilder.undirected().allowsSelfLoops(true).build();
 graph.putEdgeValue("San Francisco", "San Francisco", 0.0);
 graph.putEdgeValue("San Jose", "San Jose", 0.0);
 graph.putEdgeValue("San Francisco", "San Jose", 48.4);

 // Building an immutable value graph
 ImmutableValueGraph<String, Double> immutableGraph =
     ValueGraphBuilder.undirected()
         .allowsSelfLoops(true)
         .<String, Double>immutable()
         .putEdgeValue("San Francisco", "San Francisco", 0.0)
         .putEdgeValue("San Jose", "San Jose", 0.0)
         .putEdgeValue("San Francisco", "San Jose", 48.4)
         .build();
 }</pre>
@author James Sexton
@author Joshua O'Madadhain
@param <N> The most general node type this builder will support. This is normally {@code Object}
     unless it is constrained by using a method like {@link #nodeOrder}, or the builder is
     constructed based on an existing {@code ValueGraph} using {@link #from(ValueGraph)}.
@param <V> The most general value type this builder will support. This is normally {@code Object}
     unless the builder is constructed based on an existing {@code Graph} using {@link #from(ValueGraph)}.
@since 20.0

## Constructors

### `<init>(`boolean` directed)`

Creates a new instance with the specified edge directionality.

## Methods

### `directed()`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<java.lang.Object,java.lang.Object>`](./ValueGraphBuilder.md)

Returns a {@link ValueGraphBuilder} for building directed graphs.

### `undirected()`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<java.lang.Object,java.lang.Object>`](./ValueGraphBuilder.md)

Returns a {@link ValueGraphBuilder} for building undirected graphs.

### `from([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N,V>`](./ValueGraphBuilder.md)

Returns a {@link ValueGraphBuilder} initialized with all properties queryable from {@code
 graph}.

 <p>The "queryable" properties are those that are exposed through the {@link ValueGraph}
 interface, such as {@link ValueGraph#isDirected()}. Other properties, such as {@link #expectedNodeCount(int)}, are not set in the new builder.

### `immutable()`

**Returns:** [`com.google.common.graph.ImmutableValueGraph.Builder<N1,V1>`](ImmutableValueGraph/Builder.md)

Returns an {@link ImmutableValueGraph.Builder} with the properties of this {@link ValueGraphBuilder}.

 <p>The returned builder can be used for populating an {@link ImmutableValueGraph}.

 <p>Note that the returned builder will always have {@link #incidentEdgeOrder} set to {@link ElementOrder#stable()}, regardless of the value that was set in this builder.
@since 28.0

### `allowsSelfLoops(`boolean` allowsSelfLoops)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N,V>`](./ValueGraphBuilder.md)

Specifies whether the graph will allow self-loops (edges that connect a node to itself).
 Attempting to add a self-loop to a graph that does not allow them will throw an {@link UnsupportedOperationException}.

 <p>The default value is {@code false}.

### `expectedNodeCount(`int` expectedNodeCount)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N,V>`](./ValueGraphBuilder.md)

Specifies the expected number of nodes in the graph.
@throws IllegalArgumentException if {@code expectedNodeCount} is negative

### `nodeOrder([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md) nodeOrder)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N1,V>`](./ValueGraphBuilder.md)

Specifies the order of iteration for the elements of {@link Graph#nodes()}.

 <p>The default value is {@link ElementOrder#insertion() insertion order}.

### `incidentEdgeOrder([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md) incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N1,V>`](./ValueGraphBuilder.md)

Specifies the order of iteration for the elements of {@link ValueGraph#edges()}, {@link ValueGraph#adjacentNodes(Object)}, {@link ValueGraph#predecessors(Object)}, {@link ValueGraph#successors(Object)} and {@link ValueGraph#incidentEdges(Object)}.

 <p>The default value is {@link ElementOrder#unordered() unordered} for mutable graphs. For
 immutable graphs, this value is ignored; they always have a {@link ElementOrder#stable() stable} order.
@throws IllegalArgumentException if {@code incidentEdgeOrder} is not either {@code
     ElementOrder.unordered()} or {@code ElementOrder.stable()}.
@since 29.0

### `build()`

**Returns:** [`com.google.common.graph.MutableValueGraph<N1,V1>`](./MutableValueGraph.md)

Returns an empty {@link MutableValueGraph} with the properties of this {@link ValueGraphBuilder}.

### `copy()`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N,V>`](./ValueGraphBuilder.md)

### `cast()`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N1,V1>`](./ValueGraphBuilder.md)

