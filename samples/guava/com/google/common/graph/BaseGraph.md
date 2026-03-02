# Interface: `BaseGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.BaseGraph`

**Extends:** [`com.google.common.graph.SuccessorsFunction<N>`](./SuccessorsFunction.md), [`com.google.common.graph.PredecessorsFunction<N>`](./PredecessorsFunction.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

## Methods

### `nodes()`

**Returns:** `java.util.Set<N>`

### `edges()`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

### `isDirected()`

**Returns:** `boolean`

Directed edges connect a source node to a target node, while
 undirected edges connect a pair of nodes to each other.

### `allowsSelfLoops()`

**Returns:** `boolean`

Attempting
 to add a self-loop to a graph that does not allow them will throw an IllegalArgumentException.

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `adjacentNodes(N node)`

**Returns:** `java.util.Set<N>`

This is equal to the union of #predecessors(Object) and #successors(Object).

**Parameters:**
- `node` (`N`)

### `predecessors(N node)`

**Returns:** `java.util.Set<N>`

In an undirected graph, this is equivalent to #adjacentNodes(Object).

**Parameters:**
- `node` (`N`)

### `successors(N node)`

**Returns:** `java.util.Set<N>`

In an undirected graph, this is equivalent to #adjacentNodes(Object).

 
This is *not* the same as "all nodes reachable from node by following outgoing
 edges". For that functionality, see Graphs#reachableNodes(Graph, Object).

**Parameters:**
- `node` (`N`)

### `incidentEdges(N node)`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

This is equal to the union of incoming and outgoing edges.

**Parameters:**
- `node` (`N`)

### `degree(N node)`

**Returns:** `int`

For directed graphs, this is equal to inDegree(node) + outDegree(node).

 
For undirected graphs, this is equal to incidentEdges(node).size() + (number of
 self-loops incident to node).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

### `inDegree(N node)`

**Returns:** `int`

In an undirected graph, returns the #degree(Object).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

### `outDegree(N node)`

**Returns:** `int`

In an undirected graph, returns the #degree(Object).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

### `hasEdgeConnecting(N nodeU, N nodeV)`

**Returns:** `boolean`

This is
 equivalent to nodes().contains(nodeU) && successors(nodeU).contains(nodeV).

 
In an undirected graph, this is equal to hasEdgeConnecting(nodeV, nodeU).

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `boolean`

This is equivalent to 
 edges().contains(endpoints).

 
Unlike the other EndpointPair-accepting methods, this method does not throw if the
 endpoints are unordered; it simply returns false. This is for consistency with the behavior of
 Collection#contains(Object) (which does not generally throw if the object cannot be
 present in the collection), and the desire to have this method's behavior be compatible with
 edges().contains(endpoints).

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

