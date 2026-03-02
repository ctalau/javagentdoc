# Interface: `MutableGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MutableGraph`

**Extends:** [`com.google.common.graph.Graph<N>`](./Graph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

When mutation is not required, users
 should prefer the Graph interface.

## Methods

### `addNode(N node)`

**Nodes must be unique**, just as Map keys must be. They must also be non-null.

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `putEdge(N nodeU, N nodeV)`

If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 
If nodeU and nodeV are not already present in this graph, this method will
 silently add nodeU and nodeV to the graph.

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `boolean`

### `putEdge(EndpointPair<N> endpoints)`

If this graph is directed, endpoints must be ordered and the added edge will be
 directed; if it is undirected, the added edge will be undirected.

 
If this graph is directed, endpoints must be ordered.

 
If either or both endpoints are not already present in this graph, this method will silently
 add each missing endpoint to the graph.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `boolean`

### `removeNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `removeEdge(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `boolean`

### `removeEdge(EndpointPair<N> endpoints)`

If this graph is directed, endpoints must be ordered.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `boolean`

