# Interface: `MutableGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MutableGraph`

**Extends:** [`com.google.common.graph.Graph<N>`](./Graph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A subinterface of `Graph` which adds mutation methods. When mutation is not required, users
 should prefer the `Graph` interface.
**Author:** James Sexton
**Author:** Joshua O'Madadhain
@param <N> Node parameter type
**Since:** 20.0

## Methods

### `addNode(`N` node)`

**Returns:** `boolean`

Adds `node` if it is not already present.

 <p><b>Nodes must be unique</b>, just as `Map` keys must be. They must also be non-null.
@return `true` if the graph was modified as a result of this call

### `putEdge(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

Adds an edge connecting `nodeU` to `nodeV` if one is not already present.

 <p>If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 <p>If `nodeU` and `nodeV` are not already present in this graph, this method will
 silently `addNode(Object) add` `nodeU` and `nodeV` to the graph.
@return `true` if the graph was modified as a result of this call
@throws IllegalArgumentException if the introduction of the edge would violate `allowsSelfLoops()`

### `putEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

Adds an edge connecting `endpoints` (in the order, if any, specified by `endpoints`) if one is not already present.

 <p>If this graph is directed, `endpoints` must be ordered and the added edge will be
 directed; if it is undirected, the added edge will be undirected.

 <p>If this graph is directed, `endpoints` must be ordered.

 <p>If either or both endpoints are not already present in this graph, this method will silently
 `addNode(Object) add` each missing endpoint to the graph.
@return `true` if the graph was modified as a result of this call
@throws IllegalArgumentException if the introduction of the edge would violate `allowsSelfLoops()`
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
**Since:** 27.1

### `removeNode(`N` node)`

**Returns:** `boolean`

Removes `node` if it is present; all edges incident to `node` will also be removed.
@return `true` if the graph was modified as a result of this call

### `removeEdge(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

Removes the edge connecting `nodeU` to `nodeV`, if it is present.
@return `true` if the graph was modified as a result of this call

### `removeEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

Removes the edge connecting `endpoints`, if it is present.

 <p>If this graph is directed, `endpoints` must be ordered.
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
@return `true` if the graph was modified as a result of this call
**Since:** 27.1

