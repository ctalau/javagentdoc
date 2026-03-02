# Class: `GraphBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.GraphBuilder`

**Extends:** [`com.google.common.graph.AbstractGraphBuilder<N>`](./AbstractGraphBuilder.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A Graph built by this class has the following default properties:

 

   - does not allow self-loops
   - orders Graph#nodes() in the order in which the elements were added (insertion
       order)
 


 
Graphs built by this class also guarantee that each collection-returning accessor
 returns a **(live) unmodifiable view**; see [the external
 documentation](https://github.com/google/guava/wiki/GraphsExplained#accessor-behavior) for details.

 
Examples of use:

 

```

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
 
```

## Constructors

### `<init>(boolean directed)`

**Parameters:**
- `directed` (`boolean`)

## Methods

### `directed()`

**Returns:** [`com.google.common.graph.GraphBuilder<java.lang.Object>`](./GraphBuilder.md)

### `undirected()`

**Returns:** [`com.google.common.graph.GraphBuilder<java.lang.Object>`](./GraphBuilder.md)

### `from(com.google.common.graph.Graph<N> graph)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

The "queryable" properties are those that are exposed through the Graph interface,
 such as Graph#isDirected(). Other properties, such as #expectedNodeCount(int),
 are not set in the new builder.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

### `immutable()`

**Returns:** `com.google.common.graph.ImmutableGraph.Builder<N1>`

The returned builder can be used for populating an ImmutableGraph.

 
Note that the returned builder will always have #incidentEdgeOrder set to ElementOrder#stable(), regardless of the value that was set in this builder.

### `allowsSelfLoops(boolean allowsSelfLoops)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

Attempting to add a self-loop to a graph that does not allow them will throw an UnsupportedOperationException.

 
The default value is false.

**Parameters:**
- `allowsSelfLoops` (`boolean`)

### `expectedNodeCount(int expectedNodeCount)`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

**Parameters:**
- `expectedNodeCount` (`int`)

### `nodeOrder(com.google.common.graph.ElementOrder<N1> nodeOrder)`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

The default value is insertion order.

**Parameters:**
- `nodeOrder` ([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md))

### `incidentEdgeOrder(com.google.common.graph.ElementOrder<N1> incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

The default value is unordered for mutable graphs. For
 immutable graphs, this value is ignored; they always have a stable order.

**Parameters:**
- `incidentEdgeOrder` ([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md))

### `build()`

**Returns:** [`com.google.common.graph.MutableGraph<N1>`](./MutableGraph.md)

### `copy()`

**Returns:** [`com.google.common.graph.GraphBuilder<N>`](./GraphBuilder.md)

### `cast()`

**Returns:** [`com.google.common.graph.GraphBuilder<N1>`](./GraphBuilder.md)

