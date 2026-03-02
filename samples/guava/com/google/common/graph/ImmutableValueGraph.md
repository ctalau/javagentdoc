# Class: `ImmutableValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ImmutableValueGraph`

**Extends:** [`com.google.common.graph.StandardValueGraph<N,V>`](./StandardValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Instances of
 this class may be obtained with #copyOf(ValueGraph).

 
See the Guava User's Guide's [discussion
 of the Immutable* types](https://github.com/google/guava/wiki/GraphsExplained#immutable-implementations) for more information on the properties and guarantees
 provided by this class.

## Constructors

### `<init>(com.google.common.graph.ValueGraph<N,V> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

## Methods

### `copyOf(com.google.common.graph.ValueGraph<N,V> graph)`

**Returns:** [`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md)

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

### `copyOf(com.google.common.graph.ImmutableValueGraph<N,V> graph)`

**Returns:** [`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md)

**Parameters:**
- `graph` ([`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md))

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `asGraph()`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

### `getNodeConnections(com.google.common.graph.ValueGraph<N,V> graph)`

**Returns:** [`com.google.common.collect.ImmutableMap<N,com.google.common.graph.GraphConnections<N,V>>`](../collect/ImmutableMap.md)

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

### `connectionsOf(com.google.common.graph.ValueGraph<N,V> graph, N node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))
- `node` (`N`)

