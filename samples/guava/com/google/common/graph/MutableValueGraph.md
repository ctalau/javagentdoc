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

**Nodes must be unique**, just as Map keys must be. They must also be non-null.

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `putEdgeValue(N nodeU, N nodeV, V value)`

If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 
Values do not have to be unique. However, values must be non-null.

 
If nodeU and nodeV are not already present in this graph, this method will
 silently add nodeU and nodeV to the graph.

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `value` (`V`)

**Returns:** `V`

### `putEdgeValue(EndpointPair<N> endpoints, V value)`

If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 
If this graph is directed, endpoints must be ordered.

 
Values do not have to be unique. However, values must be non-null.

 
If either or both endpoints are not already present in this graph, this method will silently
 add each missing endpoint to the graph.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `value` (`V`)

**Returns:** `V`

### `removeNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `removeEdge(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `V`

### `removeEdge(EndpointPair<N> endpoints)`

If this graph is directed, endpoints must be ordered.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `V`

