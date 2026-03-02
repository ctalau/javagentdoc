# Class: `StandardNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardNetwork`

**Extends:** [`com.google.common.graph.AbstractNetwork<N,E>`](./AbstractNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

This class maintains a map of nodes to NetworkConnections. This class also maintains a
 map of edges to reference nodes. The reference node is defined to be the edge's source node on
 directed graphs, and an arbitrary endpoint of the edge on undirected graphs.

 
Collection-returning accessors return unmodifiable views: the view returned will reflect
 changes to the graph (if the graph is mutable) but may not be modified by the user.

 
The time complexity of all collection-returning accessors is O(1), since views are returned.

## Fields

### `isDirected`

**Type:** `boolean`

### `allowsParallelEdges`

**Type:** `boolean`

### `allowsSelfLoops`

**Type:** `boolean`

### `nodeOrder`

**Type:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `edgeOrder`

**Type:** [`com.google.common.graph.ElementOrder<E>`](./ElementOrder.md)

### `nodeConnections`

**Type:** [`com.google.common.graph.MapIteratorCache<N,com.google.common.graph.NetworkConnections<N,E>>`](./MapIteratorCache.md)

### `edgeToReferenceNode`

**Type:** [`com.google.common.graph.MapIteratorCache<E,N>`](./MapIteratorCache.md)

## Constructors

### `<init>(com.google.common.graph.NetworkBuilder<? super N,? super E> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md))

### `<init>(com.google.common.graph.NetworkBuilder<? super N,? super E> builder, java.util.Map<N,com.google.common.graph.NetworkConnections<N,E>> nodeConnections, java.util.Map<E,N> edgeToReferenceNode)`

**Parameters:**
- `builder` ([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md))
- `nodeConnections` (`java.util.Map<N,com.google.common.graph.NetworkConnections<N,E>>`)
- `edgeToReferenceNode` (`java.util.Map<E,N>`)

## Methods

### `nodes()`

**Returns:** `java.util.Set<N>`

### `edges()`

**Returns:** `java.util.Set<E>`

### `isDirected()`

**Returns:** `boolean`

### `allowsParallelEdges()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `edgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<E>`](./ElementOrder.md)

### `incidentEdges(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

### `incidentNodes(E edge)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

**Parameters:**
- `edge` (`E`)

### `adjacentNodes(N node)`

**Returns:** `java.util.Set<N>`

**Parameters:**
- `node` (`N`)

### `edgesConnecting(N nodeU, N nodeV)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `inEdges(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

### `outEdges(N node)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `node` (`N`)

### `predecessors(N node)`

**Returns:** `java.util.Set<N>`

**Parameters:**
- `node` (`N`)

### `successors(N node)`

**Returns:** `java.util.Set<N>`

**Parameters:**
- `node` (`N`)

### `checkedConnections(N node)`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

**Parameters:**
- `node` (`N`)

### `checkedReferenceNode(E edge)`

**Returns:** `N`

**Parameters:**
- `edge` (`E`)

### `containsNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `containsEdge(E edge)`

**Returns:** `boolean`

**Parameters:**
- `edge` (`E`)

