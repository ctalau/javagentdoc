# Class: `AbstractValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractValueGraph`

**Extends:** [`com.google.common.graph.AbstractBaseGraph<N>`](./AbstractBaseGraph.md)

**Implements:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of `ValueGraph`. It is recommended to extend
 this class rather than implement `ValueGraph` directly.

 <p>The methods implemented in this class should not be overridden unless the subclass admits a
 more efficient implementation.
**Author:** James Sexton
@param <N> Node parameter type
@param <V> Value parameter type
**Since:** 20.0

## Constructors

### `<init>()`

## Methods

### `asGraph()`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

### `edgeValue(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Optional<V>`

### `edgeValue([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Optional<V>`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this graph.

### `edgeValueMap([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph)`

**Returns:** `java.util.Map<com.google.common.graph.EndpointPair<N>,V>`

