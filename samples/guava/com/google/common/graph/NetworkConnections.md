# Interface: `NetworkConnections`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.NetworkConnections`

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

## Methods

### `adjacentNodes()`

**Returns:** `java.util.Set<N>`

### `predecessors()`

**Returns:** `java.util.Set<N>`

### `successors()`

**Returns:** `java.util.Set<N>`

### `incidentEdges()`

**Returns:** `java.util.Set<E>`

### `inEdges()`

**Returns:** `java.util.Set<E>`

### `outEdges()`

**Returns:** `java.util.Set<E>`

### `edgesConnecting(N node)`

For networks without
 parallel edges, this set cannot be of size greater than one.

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

### `adjacentNode(E edge)`

In the directed case, edge is assumed to be an outgoing edge.

**Parameters:**
- `edge` (`E`)

**Returns:** `N`

### `removeInEdge(E edge, boolean isSelfLoop)`

Returns the former predecessor node.

 
In the undirected case, returns null if isSelfLoop is true.

**Parameters:**
- `edge` (`E`)
- `isSelfLoop` (`boolean`)

**Returns:** `N`

### `removeOutEdge(E edge)`

Returns the former successor node.

**Parameters:**
- `edge` (`E`)

**Returns:** `N`

### `addInEdge(E edge, N node, boolean isSelfLoop)`

Implicitly adds node as a predecessor.

**Parameters:**
- `edge` (`E`)
- `node` (`N`)
- `isSelfLoop` (`boolean`)

**Returns:** `void`

### `addOutEdge(E edge, N node)`

Implicitly adds node as a successor.

**Parameters:**
- `edge` (`E`)
- `node` (`N`)

**Returns:** `void`

