# Interface: `MutableValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MutableValueGraph`

**Extends:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

When mutation is not required,
 users should prefer the ValueGraph interface.

## Methods

### `addNode(N node)`

**Returns:** `boolean`

**Nodes must be unique**, just as Map keys must be. They must also be non-null.

**Parameters:**
- `node` (`N`)

### `putEdgeValue(N nodeU, N nodeV, V value)`

**Returns:** `V`

If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 
Values do not have to be unique. However, values must be non-null.

 
If nodeU and nodeV are not already present in this graph, this method will
 silently add nodeU and nodeV to the graph.

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `value` (`V`)

### `putEdgeValue(com.google.common.graph.EndpointPair<N> endpoints, V value)`

**Returns:** `V`

If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 
If this graph is directed, endpoints must be ordered.

 
Values do not have to be unique. However, values must be non-null.

 
If either or both endpoints are not already present in this graph, this method will silently
 add each missing endpoint to the graph.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `value` (`V`)

### `removeNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `removeEdge(N nodeU, N nodeV)`

**Returns:** `V`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `removeEdge(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `V`

If this graph is directed, endpoints must be ordered.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

