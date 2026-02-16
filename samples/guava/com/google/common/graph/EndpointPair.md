# Class: `EndpointPair`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.EndpointPair`

**Implements:** `java.lang.Iterable<N>`

## Type Parameters

- `N` extends `java.lang.Object`

## Description

An immutable pair representing the two endpoints of an edge in a graph. The {@link EndpointPair}
 of a directed edge is an ordered pair of nodes ({@link #source()} and {@link #target()}). The
 {@link EndpointPair} of an undirected edge is an unordered pair of nodes ({@link #nodeU()} and
 {@link #nodeV()}).

 <p>The edge is a self-loop if, and only if, the two endpoints are equal.
@author James Sexton
@since 20.0

## Fields

### `nodeU`

**Type:** [`N`](N.md)

### `nodeV`

**Type:** [`N`](N.md)

## Constructors

### `<init>([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

## Methods

### `ordered([`N`](N.md) source, [`N`](N.md) target)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns an {@link EndpointPair} representing the endpoints of a directed edge.

### `unordered([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns an {@link EndpointPair} representing the endpoints of an undirected edge.

### `of([`com.google.common.graph.Graph<?>`](./Graph.md) graph, [`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns an {@link EndpointPair} representing the endpoints of an edge in {@code graph}.

### `of([`com.google.common.graph.Network<?,?>`](./Network.md) network, [`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns an {@link EndpointPair} representing the endpoints of an edge in {@code network}.

### `source()`

**Returns:** [`N`](N.md)

If this {@link EndpointPair} {@link #isOrdered()}, returns the node which is the source.
@throws UnsupportedOperationException if this {@link EndpointPair} is not ordered

### `target()`

**Returns:** [`N`](N.md)

If this {@link EndpointPair} {@link #isOrdered()}, returns the node which is the target.
@throws UnsupportedOperationException if this {@link EndpointPair} is not ordered

### `nodeU()`

**Returns:** [`N`](N.md)

If this {@link EndpointPair} {@link #isOrdered()} returns the {@link #source()}; otherwise,
 returns an arbitrary (but consistent) endpoint of the origin edge.

### `nodeV()`

**Returns:** [`N`](N.md)

Returns the node {@link #adjacentNode(Object) adjacent} to {@link #nodeU()} along the origin
 edge. If this {@link EndpointPair} {@link #isOrdered()}, this is equal to {@link #target()}.

### `adjacentNode([`N`](N.md) node)`

**Returns:** [`N`](N.md)

Returns the node that is adjacent to {@code node} along the origin edge.
@throws IllegalArgumentException if this {@link EndpointPair} does not contain {@code node}
@since 20.0 (but the argument type was changed from {@code Object} to {@code N} in 31.0)

### `isOrdered()`

**Returns:** `boolean`

Returns {@code true} if this {@link EndpointPair} is an ordered pair (i.e. represents the
 endpoints of a directed edge).

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<N>`](../collect/UnmodifiableIterator.md)

Iterates in the order {@link #nodeU()}, {@link #nodeV()}.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Two ordered {@link EndpointPair}s are equal if their {@link #source()} and {@link #target()}
 are equal. Two unordered {@link EndpointPair}s are equal if they contain the same nodes. An
 ordered {@link EndpointPair} is never equal to an unordered {@link EndpointPair}.

### `hashCode()`

**Returns:** `int`

The hashcode of an ordered {@link EndpointPair} is equal to {@code Objects.hashCode(source(),
 target())}. The hashcode of an unordered {@link EndpointPair} is equal to {@code
 nodeU().hashCode() + nodeV().hashCode()}.

