# Interface: `MutableNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MutableNetwork`

**Extends:** [`com.google.common.graph.Network<N,E>`](./Network.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A subinterface of `Network` which adds mutation methods. When mutation is not required,
 users should prefer the `Network` interface.
**Author:** James Sexton
**Author:** Joshua O'Madadhain
@param <N> Node parameter type
@param <E> Edge parameter type
**Since:** 20.0

## Methods

### `addNode(`N` node)`

**Returns:** `boolean`

Adds `node` if it is not already present.

 <p><b>Nodes must be unique</b>, just as `Map` keys must be. They must also be non-null.
@return `true` if the network was modified as a result of this call

### `addEdge(`N` nodeU, `N` nodeV, `E` edge)`

**Returns:** `boolean`

Adds `edge` connecting `nodeU` to `nodeV`.

 <p>If the graph is directed, `edge` will be directed in this graph; otherwise, it will be
 undirected.

 <p><b>`edge` must be unique to this graph</b>, just as a `Map` key must be. It must
 also be non-null.

 <p>If `nodeU` and `nodeV` are not already present in this graph, this method will
 silently `addNode(Object) add` `nodeU` and `nodeV` to the graph.

 <p>If `edge` already connects `nodeU` to `nodeV` (in the specified order if
 this network `isDirected()`, else in any order), then this method will have no effect.
@return `true` if the network was modified as a result of this call
@throws IllegalArgumentException if `edge` already exists in the graph and does not
     connect `nodeU` to `nodeV`
@throws IllegalArgumentException if the introduction of the edge would violate `allowsParallelEdges()` or `allowsSelfLoops()`

### `addEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, `E` edge)`

**Returns:** `boolean`

Adds `edge` connecting `endpoints`. In an undirected network, `edge` will
 also connect `nodeV` to `nodeU`.

 <p>If this graph is directed, `edge` will be directed in this graph; if it is undirected,
 `edge` will be undirected in this graph.

 <p>If this graph is directed, `endpoints` must be ordered.

 <p><b>`edge` must be unique to this graph</b>, just as a `Map` key must be. It must
 also be non-null.

 <p>If either or both endpoints are not already present in this graph, this method will silently
 `addNode(Object) add` each missing endpoint to the graph.

 <p>If `edge` already connects an endpoint pair equal to `endpoints`, then this
 method will have no effect.
@return `true` if the network was modified as a result of this call
@throws IllegalArgumentException if `edge` already exists in the graph and connects some
     other endpoint pair that is not equal to `endpoints`
@throws IllegalArgumentException if the introduction of the edge would violate `allowsParallelEdges()` or `allowsSelfLoops()`
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
**Since:** 27.1

### `removeNode(`N` node)`

**Returns:** `boolean`

Removes `node` if it is present; all edges incident to `node` will also be removed.
@return `true` if the network was modified as a result of this call

### `removeEdge(`E` edge)`

**Returns:** `boolean`

Removes `edge` from this network, if it is present.
@return `true` if the network was modified as a result of this call

