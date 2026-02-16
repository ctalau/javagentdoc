# Class: `ForwardingValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ForwardingValueGraph`

**Extends:** [`com.google.common.graph.AbstractValueGraph<N,V>`](./AbstractValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A class to allow `ValueGraph` implementations to be backed by a provided delegate. This is
 not currently planned to be released as a general-purpose forwarding class.
**Author:** James Sexton
**Author:** Joshua O'Madadhain

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

### `nodes()`

**Returns:** `java.util.Set<N>`

### `edgeCount()`

**Returns:** `long`

Defer to `AbstractValueGraph.edges()` (based on `successors(Object)`) for full
 edges() implementation.

### `isDirected()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `adjacentNodes(`N` node)`

**Returns:** `java.util.Set<N>`

### `predecessors(`N` node)`

**Returns:** `java.util.Set<N>`

### `successors(`N` node)`

**Returns:** `java.util.Set<N>`

### `degree(`N` node)`

**Returns:** `int`

### `inDegree(`N` node)`

**Returns:** `int`

### `outDegree(`N` node)`

**Returns:** `int`

### `hasEdgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `edgeValue(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Optional<V>`

### `edgeValue([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Optional<V>`

### `edgeValueOrDefault(`N` nodeU, `N` nodeV, `V` defaultValue)`

**Returns:** `V`

### `edgeValueOrDefault([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, `V` defaultValue)`

**Returns:** `V`

