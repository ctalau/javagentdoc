# Class: `ForwardingNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ForwardingNetwork`

**Extends:** [`com.google.common.graph.AbstractNetwork<N,E>`](./AbstractNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A class to allow {@link Network} implementations to be backed by a provided delegate. This is not
 currently planned to be released as a general-purpose forwarding class.
@author James Sexton
@author Joshua O'Madadhain

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.graph.Network<N,E>`](./Network.md)

### `nodes()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `edges()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

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

### `adjacentNodes([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `predecessors([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `incidentEdges([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `inEdges([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `outEdges([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `incidentNodes([`E`](E.md) edge)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `adjacentEdges([`E`](E.md) edge)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `degree([`N`](N.md) node)`

**Returns:** `int`

### `inDegree([`N`](N.md) node)`

**Returns:** `int`

### `outDegree([`N`](N.md) node)`

**Returns:** `int`

### `edgesConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `edgesConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `edgeConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`java.util.Optional<E>`](../../../../java/util/Optional.md)

### `edgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`java.util.Optional<E>`](../../../../java/util/Optional.md)

### `edgeConnectingOrNull([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`E`](E.md)

### `edgeConnectingOrNull([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`E`](E.md)

### `hasEdgeConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

