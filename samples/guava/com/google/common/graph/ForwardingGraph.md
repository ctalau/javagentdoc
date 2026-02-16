# Class: `ForwardingGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ForwardingGraph`

**Extends:** [`com.google.common.graph.AbstractGraph<N>`](./AbstractGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A class to allow `Graph` implementations to be backed by a `BaseGraph`. This is not
 currently planned to be released as a general-purpose forwarding class.
**Author:** James Sexton

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

### `nodes()`

**Returns:** `java.util.Set<N>`

### `edgeCount()`

**Returns:** `long`

Defer to `AbstractGraph.edges()` (based on `successors(Object)`) for full edges()
 implementation.

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

### `incidentEdges(`N` node)`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

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

