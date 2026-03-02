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

### `<init>(com.google.common.graph.BaseGraph<N> backingGraph)`

**Parameters:**
- `backingGraph` ([`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md))

## Methods

### `copyOf(com.google.common.graph.Graph<N> graph)`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

### `copyOf(com.google.common.graph.ImmutableGraph<N> graph)`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

**Parameters:**
- `graph` ([`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md))

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `getNodeConnections(com.google.common.graph.Graph<N> graph)`

**Returns:** [`com.google.common.collect.ImmutableMap<N,com.google.common.graph.GraphConnections<N,com.google.common.graph.GraphConstants.Presence>>`](../collect/ImmutableMap.md)

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

### `connectionsOf(com.google.common.graph.Graph<N> graph, N node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,com.google.common.graph.GraphConstants.Presence>`](./GraphConnections.md)

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))
- `node` (`N`)

### `delegate()`

**Returns:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

