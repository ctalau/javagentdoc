# Class: `EndpointPair`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.EndpointPair`

**Implements:** `java.lang.Iterable<N>`

## Type Parameters

- `N` extends `java.lang.Object`

## Description

An immutable pair representing the two endpoints of an edge in a graph. The `EndpointPair`
 of a directed edge is an ordered pair of nodes (`source()` and `target()`). The
 `EndpointPair` of an undirected edge is an unordered pair of nodes (`nodeU()` and
 `nodeV()`).

 <p>The edge is a self-loop if, and only if, the two endpoints are equal.
**Author:** James Sexton
**Since:** 20.0

## Fields

### `nodeU`

**Type:** `N`

### `nodeV`

**Type:** `N`

## Constructors

### `<init>(`N` nodeU, `N` nodeV)`

## Methods

### `ordered(`N` source, `N` target)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns an `EndpointPair` representing the endpoints of a directed edge.

### `unordered(`N` nodeU, `N` nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns an `EndpointPair` representing the endpoints of an undirected edge.

### `of([`com.google.common.graph.Graph<?>`](./Graph.md) graph, `N` nodeU, `N` nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns an `EndpointPair` representing the endpoints of an edge in `graph`.

### `of([`com.google.common.graph.Network<?,?>`](./Network.md) network, `N` nodeU, `N` nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns an `EndpointPair` representing the endpoints of an edge in `network`.

### `source()`

**Returns:** `N`

If this `EndpointPair` `isOrdered()`, returns the node which is the source.
@throws UnsupportedOperationException if this `EndpointPair` is not ordered

### `target()`

**Returns:** `N`

If this `EndpointPair` `isOrdered()`, returns the node which is the target.
@throws UnsupportedOperationException if this `EndpointPair` is not ordered

### `nodeU()`

**Returns:** `N`

If this `EndpointPair` `isOrdered()` returns the `source()`; otherwise,
 returns an arbitrary (but consistent) endpoint of the origin edge.

### `nodeV()`

**Returns:** `N`

Returns the node `adjacentNode(Object) adjacent` to `nodeU()` along the origin
 edge. If this `EndpointPair` `isOrdered()`, this is equal to `target()`.

### `adjacentNode(`N` node)`

**Returns:** `N`

Returns the node that is adjacent to `node` along the origin edge.
@throws IllegalArgumentException if this `EndpointPair` does not contain `node`
**Since:** 20.0 (but the argument type was changed from `Object` to `N` in 31.0)

### `isOrdered()`

**Returns:** `boolean`

Returns `true` if this `EndpointPair` is an ordered pair (i.e. represents the
 endpoints of a directed edge).

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<N>`](../collect/UnmodifiableIterator.md)

Iterates in the order `nodeU()`, `nodeV()`.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Two ordered `EndpointPair`s are equal if their `source()` and `target()`
 are equal. Two unordered `EndpointPair`s are equal if they contain the same nodes. An
 ordered `EndpointPair` is never equal to an unordered `EndpointPair`.

### `hashCode()`

**Returns:** `int`

The hashcode of an ordered `EndpointPair` is equal to `Objects.hashCode(source(),
 target())`. The hashcode of an unordered `EndpointPair` is equal to `nodeU().hashCode() + nodeV().hashCode()`.

