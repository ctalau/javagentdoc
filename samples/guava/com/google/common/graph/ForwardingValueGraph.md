# Class: `ForwardingValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ForwardingValueGraph`

**Extends:** [`com.google.common.graph.AbstractValueGraph<N,V>`](./AbstractValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A class to allow {@link ValueGraph} implementations to be backed by a provided delegate. This is
 not currently planned to be released as a general-purpose forwarding class.
@author James Sexton
@author Joshua O'Madadhain

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

### `nodes()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `edgeCount()`

**Returns:** `long`

Defer to {@link AbstractValueGraph#edges()} (based on {@link #successors(Object)}) for full
 edges() implementation.

### `isDirected()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `adjacentNodes([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `predecessors([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `degree([`N`](N.md) node)`

**Returns:** `int`

### `inDegree([`N`](N.md) node)`

**Returns:** `int`

### `outDegree([`N`](N.md) node)`

**Returns:** `int`

### `hasEdgeConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `edgeValue([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`java.util.Optional<V>`](../../../../java/util/Optional.md)

### `edgeValue([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`java.util.Optional<V>`](../../../../java/util/Optional.md)

### `edgeValueOrDefault([`N`](N.md) nodeU, [`N`](N.md) nodeV, [`V`](V.md) defaultValue)`

**Returns:** [`V`](V.md)

### `edgeValueOrDefault([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, [`V`](V.md) defaultValue)`

**Returns:** [`V`](V.md)

