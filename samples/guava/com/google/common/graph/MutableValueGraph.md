# Interface: `MutableValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MutableValueGraph`

**Extends:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A subinterface of `ValueGraph` which adds mutation methods. When mutation is not required,
 users should prefer the `ValueGraph` interface.
**Author:** James Sexton
@param <N> Node parameter type
@param <V> Value parameter type
**Since:** 20.0

## Methods

### `addNode(`N` node)`

**Returns:** `boolean`

Adds `node` if it is not already present.

 <p><b>Nodes must be unique</b>, just as `Map` keys must be. They must also be non-null.
@return `true` if the graph was modified as a result of this call

### `putEdgeValue(`N` nodeU, `N` nodeV, `V` value)`

**Returns:** `V`

Adds an edge connecting `nodeU` to `nodeV` if one is not already present, and sets
 a value for that edge to `value` (overwriting the existing value, if any).

 <p>If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 <p>Values do not have to be unique. However, values must be non-null.

 <p>If `nodeU` and `nodeV` are not already present in this graph, this method will
 silently `addNode(Object) add` `nodeU` and `nodeV` to the graph.
@return the value previously associated with the edge connecting `nodeU` to `nodeV`, or null if there was no such edge.
@throws IllegalArgumentException if the introduction of the edge would violate `allowsSelfLoops()`

### `putEdgeValue([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, `V` value)`

**Returns:** `V`

Adds an edge connecting `endpoints` if one is not already present, and sets a value for
 that edge to `value` (overwriting the existing value, if any).

 <p>If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 <p>If this graph is directed, `endpoints` must be ordered.

 <p>Values do not have to be unique. However, values must be non-null.

 <p>If either or both endpoints are not already present in this graph, this method will silently
 `addNode(Object) add` each missing endpoint to the graph.
@return the value previously associated with the edge connecting `nodeU` to `nodeV`, or null if there was no such edge.
@throws IllegalArgumentException if the introduction of the edge would violate `allowsSelfLoops()`
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
**Since:** 27.1

### `removeNode(`N` node)`

**Returns:** `boolean`

Removes `node` if it is present; all edges incident to `node` will also be removed.
@return `true` if the graph was modified as a result of this call

### `removeEdge(`N` nodeU, `N` nodeV)`

**Returns:** `V`

Removes the edge connecting `nodeU` to `nodeV`, if it is present.
@return the value previously associated with the edge connecting `nodeU` to `nodeV`, or null if there was no such edge.

### `removeEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `V`

Removes the edge connecting `endpoints`, if it is present.

 <p>If this graph is directed, `endpoints` must be ordered.
@return the value previously associated with the edge connecting `endpoints`, or null if
     there was no such edge.
**Since:** 27.1

