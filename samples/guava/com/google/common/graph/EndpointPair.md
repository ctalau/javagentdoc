# Class: `EndpointPair`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.EndpointPair`

**Implements:** `java.lang.Iterable<N>`

## Type Parameters

- `N` extends `java.lang.Object`

## Description

The EndpointPair
 of a directed edge is an ordered pair of nodes (#source() and #target()). The
 EndpointPair of an undirected edge is an unordered pair of nodes (#nodeU() and
 #nodeV()).

 
The edge is a self-loop if, and only if, the two endpoints are equal.

## Fields

### `nodeU`

**Type:** `N`

### `nodeV`

**Type:** `N`

## Constructors

### `<init>(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

## Methods

### `ordered(N source, N target)`

**Parameters:**
- `source` (`N`)
- `target` (`N`)

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `unordered(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `of(Graph<?> graph, N nodeU, N nodeV)`

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<?>`](./Graph.md))
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `of(Network<?,?> network, N nodeU, N nodeV)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<?,?>`](./Network.md))
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `source()`

**Returns:** `N`

### `target()`

**Returns:** `N`

### `nodeU()`

**Returns:** `N`

### `nodeV()`

If this EndpointPair #isOrdered(), this is equal to #target().

**Returns:** `N`

### `adjacentNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `N`

### `isOrdered()`

represents the
 endpoints of a directed edge).

**Returns:** `boolean`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<N>`](../collect/UnmodifiableIterator.md)

### `equals(Object obj)`

Two unordered EndpointPairs are equal if they contain the same nodes. An
 ordered EndpointPair is never equal to an unordered EndpointPair.

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

The hashcode of an unordered EndpointPair is equal to 
 nodeU().hashCode() + nodeV().hashCode().

**Returns:** `int`

