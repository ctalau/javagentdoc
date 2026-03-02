# Class: `StandardValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardValueGraph`

**Extends:** [`com.google.common.graph.AbstractValueGraph<N,V>`](./AbstractValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This class maintains a map of nodes to GraphConnections.

 
Collection-returning accessors return unmodifiable views: the view returned will reflect
 changes to the graph (if the graph is mutable) but may not be modified by the user.

 
The time complexity of all collection-returning accessors is O(1), since views are returned.

## Fields

### `isDirected`

**Type:** `boolean`

### `allowsSelfLoops`

**Type:** `boolean`

### `nodeOrder`

**Type:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `nodeConnections`

**Type:** [`com.google.common.graph.MapIteratorCache<N,com.google.common.graph.GraphConnections<N,V>>`](./MapIteratorCache.md)

### `edgeCount`

**Type:** `long`

## Constructors

### `<init>(com.google.common.graph.AbstractGraphBuilder<? super N> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md))

### `<init>(com.google.common.graph.AbstractGraphBuilder<? super N> builder, java.util.Map<N,com.google.common.graph.GraphConnections<N,V>> nodeConnections, long edgeCount)`

**Parameters:**
- `builder` ([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md))
- `nodeConnections` (`java.util.Map<N,com.google.common.graph.GraphConnections<N,V>>`)
- `edgeCount` (`long`)

## Methods

### `nodes()`

**Returns:** `java.util.Set<N>`

### `isDirected()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `adjacentNodes(N node)`

**Returns:** `java.util.Set<N>`

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

### `incidentEdges(N node)`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

**Parameters:**
- `node` (`N`)

### `hasEdgeConnecting(N nodeU, N nodeV)`

**Returns:** `boolean`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `boolean`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `edgeValueOrDefault(N nodeU, N nodeV, V defaultValue)`

**Returns:** `V`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `defaultValue` (`V`)

### `edgeValueOrDefault(com.google.common.graph.EndpointPair<N> endpoints, V defaultValue)`

**Returns:** `V`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `defaultValue` (`V`)

### `edgeCount()`

**Returns:** `long`

### `checkedConnections(N node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

**Parameters:**
- `node` (`N`)

### `containsNode(N node)`

**Returns:** `boolean`

**Parameters:**
- `node` (`N`)

### `hasEdgeConnectingInternal(N nodeU, N nodeV)`

**Returns:** `boolean`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgeValueOrDefaultInternal(N nodeU, N nodeV, V defaultValue)`

**Returns:** `V`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `defaultValue` (`V`)

