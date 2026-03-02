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

### `<init>(ValueGraph<N,V> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

## Methods

### `copyOf(ValueGraph<N,V> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

**Returns:** [`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md)

### `copyOf(ImmutableValueGraph<N,V> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md))

**Returns:** [`com.google.common.graph.ImmutableValueGraph<N,V>`](./ImmutableValueGraph.md)

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `asGraph()`

**Returns:** [`com.google.common.graph.ImmutableGraph<N>`](./ImmutableGraph.md)

### `getNodeConnections(ValueGraph<N,V> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

**Returns:** [`com.google.common.collect.ImmutableMap<N,com.google.common.graph.GraphConnections<N,V>>`](../collect/ImmutableMap.md)

### `connectionsOf(ValueGraph<N,V> graph, N node)`

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))
- `node` (`N`)

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

