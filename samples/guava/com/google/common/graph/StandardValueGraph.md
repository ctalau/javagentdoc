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

### `<init>(AbstractGraphBuilder<? super N> builder)`

**Parameters:**
- `builder` ([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md))

### `<init>(AbstractGraphBuilder<? super N> builder, Map<N,GraphConnections<N,V>> nodeConnections, long edgeCount)`

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

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `predecessors(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `successors(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `incidentEdges(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

### `hasEdgeConnecting(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `boolean`

### `hasEdgeConnecting(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `boolean`

### `edgeValueOrDefault(N nodeU, N nodeV, V defaultValue)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `defaultValue` (`V`)

**Returns:** `V`

### `edgeValueOrDefault(EndpointPair<N> endpoints, V defaultValue)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `defaultValue` (`V`)

**Returns:** `V`

### `edgeCount()`

**Returns:** `long`

### `checkedConnections(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

### `containsNode(N node)`

**Parameters:**
- `node` (`N`)

**Returns:** `boolean`

### `hasEdgeConnectingInternal(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `boolean`

### `edgeValueOrDefaultInternal(N nodeU, N nodeV, V defaultValue)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `defaultValue` (`V`)

**Returns:** `V`

