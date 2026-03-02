# Class: `ValueGraphBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ValueGraphBuilder`

**Extends:** [`com.google.common.graph.AbstractGraphBuilder<N>`](./AbstractGraphBuilder.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A ValueGraph built by this class has the following default properties:

 

   - does not allow self-loops
   - orders ValueGraph#nodes() in the order in which the elements were added (insertion
       order)
 


 
ValueGraphs built by this class also guarantee that each collection-returning accessor
 returns a **(live) unmodifiable view**; see [the external
 documentation](https://github.com/google/guava/wiki/GraphsExplained#accessor-behavior) for details.

 
Examples of use:

 

```

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
 
```

## Constructors

### `<init>(boolean directed)`

**Parameters:**
- `directed` (`boolean`)

## Methods

### `directed()`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<java.lang.Object,java.lang.Object>`](./ValueGraphBuilder.md)

### `undirected()`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<java.lang.Object,java.lang.Object>`](./ValueGraphBuilder.md)

### `from(com.google.common.graph.ValueGraph<N,V> graph)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N,V>`](./ValueGraphBuilder.md)

The "queryable" properties are those that are exposed through the ValueGraph
 interface, such as ValueGraph#isDirected(). Other properties, such as #expectedNodeCount(int), are not set in the new builder.

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

### `immutable()`

**Returns:** `com.google.common.graph.ImmutableValueGraph.Builder<N1,V1>`

The returned builder can be used for populating an ImmutableValueGraph.

 
Note that the returned builder will always have #incidentEdgeOrder set to ElementOrder#stable(), regardless of the value that was set in this builder.

### `allowsSelfLoops(boolean allowsSelfLoops)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N,V>`](./ValueGraphBuilder.md)

Attempting to add a self-loop to a graph that does not allow them will throw an UnsupportedOperationException.

 
The default value is false.

**Parameters:**
- `allowsSelfLoops` (`boolean`)

### `expectedNodeCount(int expectedNodeCount)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N,V>`](./ValueGraphBuilder.md)

**Parameters:**
- `expectedNodeCount` (`int`)

### `nodeOrder(com.google.common.graph.ElementOrder<N1> nodeOrder)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N1,V>`](./ValueGraphBuilder.md)

The default value is insertion order.

**Parameters:**
- `nodeOrder` ([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md))

### `incidentEdgeOrder(com.google.common.graph.ElementOrder<N1> incidentEdgeOrder)`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N1,V>`](./ValueGraphBuilder.md)

The default value is unordered for mutable graphs. For
 immutable graphs, this value is ignored; they always have a stable order.

**Parameters:**
- `incidentEdgeOrder` ([`com.google.common.graph.ElementOrder<N1>`](./ElementOrder.md))

### `build()`

**Returns:** [`com.google.common.graph.MutableValueGraph<N1,V1>`](./MutableValueGraph.md)

### `copy()`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N,V>`](./ValueGraphBuilder.md)

### `cast()`

**Returns:** [`com.google.common.graph.ValueGraphBuilder<N1,V1>`](./ValueGraphBuilder.md)

