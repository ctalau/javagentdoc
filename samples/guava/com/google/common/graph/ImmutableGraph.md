# Class: `ImmutableGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ImmutableGraph`

**Extends:** [`com.google.common.graph.ForwardingGraph<N>`](./ForwardingGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

Instances of this
 class may be obtained with #copyOf(Graph).

 
See the Guava User's Guide's [discussion
 of the Immutable* types](https://github.com/google/guava/wiki/GraphsExplained#immutable-implementations) for more information on the properties and guarantees
 provided by this class.

## Fields

### `backingGraph`

**Type:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

## Constructors

### `<init>(BaseGraph<N> backingGraph)`

**Parameters:**
- `backingGraph` ([`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md))

## Methods

### `copyOf(Graph<N> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

### `copyOf(ImmutableGraph<N> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md))

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `getNodeConnections(Graph<N> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

**Returns:** [`com.google.common.collect.ImmutableMap<N,com.google.common.graph.GraphConnections<N,com.google.common.graph.GraphConstants.Presence>>`](../collect/ImmutableMap.md)

### `connectionsOf(Graph<N> graph, N node)`

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))
- `node` (`N`)

**Returns:** [`com.google.common.graph.GraphConnections<N,com.google.common.graph.GraphConstants.Presence>`](./GraphConnections.md)

### `delegate()`

**Returns:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

