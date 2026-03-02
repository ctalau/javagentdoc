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

**Returns:** `java.util.Set<E>`

For networks without
 parallel edges, this set cannot be of size greater than one.

**Parameters:**
- `node` (`N`)

### `adjacentNode(E edge)`

**Returns:** `N`

In the directed case, edge is assumed to be an outgoing edge.

**Parameters:**
- `edge` (`E`)

### `removeInEdge(E edge, boolean isSelfLoop)`

**Returns:** `N`

Returns the former predecessor node.

 
In the undirected case, returns null if isSelfLoop is true.

**Parameters:**
- `edge` (`E`)
- `isSelfLoop` (`boolean`)

### `removeOutEdge(E edge)`

**Returns:** `N`

Returns the former successor node.

**Parameters:**
- `edge` (`E`)

### `addInEdge(E edge, N node, boolean isSelfLoop)`

**Returns:** `void`

Implicitly adds node as a predecessor.

**Parameters:**
- `edge` (`E`)
- `node` (`N`)
- `isSelfLoop` (`boolean`)

### `addOutEdge(E edge, N node)`

**Returns:** `void`

Implicitly adds node as a successor.

**Parameters:**
- `edge` (`E`)
- `node` (`N`)

