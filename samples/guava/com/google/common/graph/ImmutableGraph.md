# Class: `ImmutableGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ImmutableGraph`

**Extends:** [`com.google.common.graph.ForwardingGraph<N>`](./ForwardingGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A `Graph` whose elements and structural relationships will never change. Instances of this
 class may be obtained with `copyOf(Graph)`.

 <p>See the Guava User's Guide's <a href="https://github.com/google/guava/wiki/GraphsExplained#immutable-implementations">discussion
 of the `Immutable*` types</a> for more information on the properties and guarantees
 provided by this class.
**Author:** James Sexton
**Author:** Joshua O'Madadhain
**Author:** Omar Darwish
**Author:** Jens Nyman
@param <N> Node parameter type
**Since:** 20.0

## Fields

### `backingGraph`

**Type:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

## Constructors

### `<init>([`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md) backingGraph)`

## Methods

### `copyOf([`com.google.common.graph.Graph<N>`](./Graph.md) graph)`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

Returns an immutable copy of `graph`.

### `copyOf([`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md) graph)`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

Simply returns its argument.
**Deprecated:** no need to use this

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `getNodeConnections([`com.google.common.graph.Graph<N>`](./Graph.md) graph)`

**Returns:** [`com.google.common.collect.ImmutableMap<N,com.google.common.graph.GraphConnections<N,com.google.common.graph.GraphConstants.Presence>>`](../collect/ImmutableMap>.md)

### `connectionsOf([`com.google.common.graph.Graph<N>`](./Graph.md) graph, `N` node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,com.google.common.graph.GraphConstants.Presence>`](./GraphConnections.md)

### `delegate()`

**Returns:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

