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

### `<init>(NetworkBuilder<? super N,? super E> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md))

### `<init>(NetworkBuilder<? super N,? super E> builder, Map<N,NetworkConnections<N,E>> nodeConnections, Map<E,N> edgeToReferenceNode)`

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

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

### `incidentNodes(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `adjacentNodes(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `edgesConnecting(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `java.util.Set<E>`

### `inEdges(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

### `outEdges(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<E>`

### `predecessors(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `successors(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `checkedConnections(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

### `checkedReferenceNode(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** `N`

### `containsNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `containsEdge(E edge)`

**Parameters:**
- `edge` (`E`)

**Returns:** `boolean`

