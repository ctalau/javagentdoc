# Class: `ForwardingNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ForwardingNetwork`

**Extends:** [`com.google.common.graph.AbstractNetwork<N,E>`](./AbstractNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A class to allow `Network` implementations to be backed by a provided delegate. This is not
 currently planned to be released as a general-purpose forwarding class.
**Author:** James Sexton
**Author:** Joshua O'Madadhain

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.Network<N,E>`](./Network.md)

### `nodes()`

**Returns:** `java.util.Set<N>`

### `edges()`

**Returns:** `java.util.Set<E>`

### `isDirected()`

**Returns:** `boolean`

### `allowsParallelEdges()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `edgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<E>`](./ElementOrder.md)

### `adjacentNodes(`N` node)`

**Returns:** `java.util.Set<N>`

### `predecessors(`N` node)`

**Returns:** `java.util.Set<N>`

### `successors(`N` node)`

**Returns:** `java.util.Set<N>`

### `incidentEdges(`N` node)`

**Returns:** `java.util.Set<E>`

### `inEdges(`N` node)`

**Returns:** `java.util.Set<E>`

### `outEdges(`N` node)`

**Returns:** `java.util.Set<E>`

### `incidentNodes(`E` edge)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `adjacentEdges(`E` edge)`

**Returns:** `java.util.Set<E>`

### `degree(`N` node)`

**Returns:** `int`

### `inDegree(`N` node)`

**Returns:** `int`

### `outDegree(`N` node)`

**Returns:** `int`

### `edgesConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Set<E>`

### `edgesConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Set<E>`

### `edgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Optional<E>`

### `edgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Optional<E>`

### `edgeConnectingOrNull(`N` nodeU, `N` nodeV)`

**Returns:** `E`

### `edgeConnectingOrNull([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `E`

### `hasEdgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

