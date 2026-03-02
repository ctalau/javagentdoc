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

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

**Parameters:**
- `source` (`N`)
- `target` (`N`)

### `unordered(N nodeU, N nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `of(com.google.common.graph.Graph<?> graph, N nodeU, N nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<?>`](./Graph.md))
- `nodeU` (`N`)
- `nodeV` (`N`)

### `of(com.google.common.graph.Network<?,?> network, N nodeU, N nodeV)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

**Parameters:**
- `network` ([`com.google.common.graph.Network<?,?>`](./Network.md))
- `nodeU` (`N`)
- `nodeV` (`N`)

### `source()`

**Returns:** `N`

### `target()`

**Returns:** `N`

### `nodeU()`

**Returns:** `N`

### `nodeV()`

**Returns:** `N`

If this EndpointPair #isOrdered(), this is equal to #target().

### `adjacentNode(N node)`

**Returns:** `N`

**Parameters:**
- `node` (`N`)

### `isOrdered()`

**Returns:** `boolean`

represents the
 endpoints of a directed edge).

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<N>`](../collect/UnmodifiableIterator.md)

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

Two unordered EndpointPairs are equal if they contain the same nodes. An
 ordered EndpointPair is never equal to an unordered EndpointPair.

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

The hashcode of an unordered EndpointPair is equal to 
 nodeU().hashCode() + nodeV().hashCode().

