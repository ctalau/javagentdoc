# Interface: `MutableNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MutableNetwork`

**Extends:** [`com.google.common.graph.Network<N,E>`](./Network.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

When mutation is not required,
 users should prefer the Network interface.

## Methods

### `addNode(N node)`

**Nodes must be unique**, just as Map keys must be. They must also be non-null.

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `addEdge(N nodeU, N nodeV, E edge)`

If the graph is directed, edge will be directed in this graph; otherwise, it will be
 undirected.

 
**edge must be unique to this graph**, just as a Map key must be. It must
 also be non-null.

 
If nodeU and nodeV are not already present in this graph, this method will
 silently add nodeU and nodeV to the graph.

 
If edge already connects nodeU to nodeV (in the specified order if
 this network #isDirected(), else in any order), then this method will have no effect.

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `edge` (`E`)

**Returns:** `boolean`

### `addEdge(EndpointPair<N> endpoints, E edge)`

In an undirected network, edge will
 also connect nodeV to nodeU.

 
If this graph is directed, edge will be directed in this graph; if it is undirected,
 edge will be undirected in this graph.

 
If this graph is directed, endpoints must be ordered.

 
**edge must be unique to this graph**, just as a Map key must be. It must
 also be non-null.

 
If either or both endpoints are not already present in this graph, this method will silently
 add each missing endpoint to the graph.

 
If edge already connects an endpoint pair equal to endpoints, then this
 method will have no effect.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `edge` (`E`)

**Returns:** `boolean`

### `removeNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `removeEdge(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** `boolean`

