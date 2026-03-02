# Class: `AbstractValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractValueGraph`

**Extends:** [`com.google.common.graph.AbstractBaseGraph<N>`](./AbstractBaseGraph.md)

**Implements:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

It is recommended to extend
 this class rather than implement ValueGraph directly.

 
The methods implemented in this class should not be overridden unless the subclass admits a
 more efficient implementation.

## Constructors

### `<init>()`

## Methods

### `asGraph()`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

### `edgeValue(N nodeU, N nodeV)`

**Returns:** `java.util.Optional<V>`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgeValue(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `java.util.Optional<V>`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `edgeValueMap(com.google.common.graph.ValueGraph<N,V> graph)`

**Returns:** `java.util.Map<com.google.common.graph.EndpointPair<N>,V>`

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

