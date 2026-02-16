# Class: `ImmutableValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ImmutableValueGraph`

**Extends:** [`com.google.common.graph.StandardValueGraph<N,V>`](./StandardValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A `ValueGraph` whose elements and structural relationships will never change. Instances of
 this class may be obtained with `copyOf(ValueGraph)`.

 <p>See the Guava User's Guide's <a href="https://github.com/google/guava/wiki/GraphsExplained#immutable-implementations">discussion
 of the `Immutable*` types</a> for more information on the properties and guarantees
 provided by this class.
**Author:** James Sexton
**Author:** Jens Nyman
@param <N> Node parameter type
@param <V> Value parameter type
**Since:** 20.0

## Constructors

### `<init>([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph)`

## Methods

### `copyOf([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph)`

**Returns:** [`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md)

Returns an immutable copy of `graph`.

### `copyOf([`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md) graph)`

**Returns:** [`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md)

Simply returns its argument.
**Deprecated:**no need to use this

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `asGraph()`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

### `getNodeConnections([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph)`

**Returns:** [`com.google.common.collect.ImmutableMap<N,com.google.common.graph.GraphConnections<N,V>>`](../collect/ImmutableMap>.md)

### `connectionsOf([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph, `N` node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

