# Interface: `BaseGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.BaseGraph`

**Extends:** [`com.google.common.graph.SuccessorsFunction<N>`](./SuccessorsFunction.md), [`com.google.common.graph.PredecessorsFunction<N>`](./PredecessorsFunction.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A non-public interface for the methods shared between `Graph` and `ValueGraph`.
**Author:** James Sexton
@param <N> Node parameter type

## Methods

### `nodes()`

**Returns:** `java.util.Set<N>`

Returns all nodes in this graph, in the order specified by `nodeOrder()`.

### `edges()`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

Returns all edges in this graph.

### `isDirected()`

**Returns:** `boolean`

Returns true if the edges in this graph are directed. Directed edges connect a `EndpointPair.source() source node` to a `EndpointPair.target() target node`, while
 undirected edges connect a pair of nodes to each other.

### `allowsSelfLoops()`

**Returns:** `boolean`

Returns true if this graph allows self-loops (edges that connect a node to itself). Attempting
 to add a self-loop to a graph that does not allow them will throw an `IllegalArgumentException`.

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

Returns the order of iteration for the elements of `nodes()`.

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

Returns an `ElementOrder` that specifies the order of iteration for the elements of
 `edges()`, `adjacentNodes(Object)`, `predecessors(Object)`, `successors(Object)` and `incidentEdges(Object)`.
**Since:** 29.0

### `adjacentNodes(`N` node)`

**Returns:** `java.util.Set<N>`

Returns the nodes which have an incident edge in common with `node` in this graph.

 <p>This is equal to the union of `predecessors(Object)` and `successors(Object)`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `predecessors(`N` node)`

**Returns:** `java.util.Set<N>`

Returns all nodes in this graph adjacent to `node` which can be reached by traversing
 `node`'s incoming edges <i>against</i> the direction (if any) of the edge.

 <p>In an undirected graph, this is equivalent to `adjacentNodes(Object)`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `successors(`N` node)`

**Returns:** `java.util.Set<N>`

Returns all nodes in this graph adjacent to `node` which can be reached by traversing
 `node`'s outgoing edges in the direction (if any) of the edge.

 <p>In an undirected graph, this is equivalent to `adjacentNodes(Object)`.

 <p>This is <i>not</i> the same as "all nodes reachable from `node` by following outgoing
 edges". For that functionality, see `Graphs.reachableNodes(Graph, Object)`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `incidentEdges(`N` node)`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

Returns the edges in this graph whose endpoints include `node`.

 <p>This is equal to the union of incoming and outgoing edges.
@throws IllegalArgumentException if `node` is not an element of this graph
**Since:** 24.0

### `degree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s incident edges, counting self-loops twice (equivalently,
 the number of times an edge touches `node`).

 <p>For directed graphs, this is equal to `inDegree(node) + outDegree(node)`.

 <p>For undirected graphs, this is equal to `incidentEdges(node).size()` + (number of
 self-loops incident to `node`).

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `inDegree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s incoming edges (equal to `predecessors(node).size()`)
 in a directed graph. In an undirected graph, returns the `degree(Object)`.

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `outDegree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s outgoing edges (equal to `successors(node).size()`)
 in a directed graph. In an undirected graph, returns the `degree(Object)`.

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `hasEdgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

Returns true if there is an edge that directly connects `nodeU` to `nodeV`. This is
 equivalent to `nodes().contains(nodeU) && successors(nodeU).contains(nodeV)`.

 <p>In an undirected graph, this is equal to `hasEdgeConnecting(nodeV, nodeU)`.
**Since:** 23.0

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

Returns true if there is an edge that directly connects `endpoints` (in the order, if
 any, specified by `endpoints`). This is equivalent to `edges().contains(endpoints)`.

 <p>Unlike the other `EndpointPair`-accepting methods, this method does not throw if the
 endpoints are unordered; it simply returns false. This is for consistency with the behavior of
 `Collection.contains(Object)` (which does not generally throw if the object cannot be
 present in the collection), and the desire to have this method's behavior be compatible with
 `edges().contains(endpoints)`.
**Since:** 27.1

