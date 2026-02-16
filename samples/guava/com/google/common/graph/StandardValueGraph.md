# Class: `StandardValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardValueGraph`

**Extends:** [`com.google.common.graph.AbstractValueGraph<N,V>`](./AbstractValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Standard implementation of `ValueGraph` that supports the options supplied by `AbstractGraphBuilder`.

 <p>This class maintains a map of nodes to `GraphConnections`.

 <p>Collection-returning accessors return unmodifiable views: the view returned will reflect
 changes to the graph (if the graph is mutable) but may not be modified by the user.

 <p>The time complexity of all collection-returning accessors is O(1), since views are returned.
**Author:** James Sexton
**Author:** Joshua O'Madadhain
**Author:** Omar Darwish
@param <N> Node parameter type
@param <V> Value parameter type

## Fields

### `isDirected`

**Type:** `boolean`

### `allowsSelfLoops`

**Type:** `boolean`

### `nodeOrder`

**Type:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `nodeConnections`

**Type:** [`com.google.common.graph.MapIteratorCache<N,com.google.common.graph.GraphConnections<N,V>>`](./MapIteratorCache>.md)

### `edgeCount`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md) builder)`

Constructs a graph with the properties specified in `builder`.

### `<init>([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md) builder, `java.util.Map<N,com.google.common.graph.GraphConnections<N,V>>` nodeConnections, `long` edgeCount)`

Constructs a graph with the properties specified in `builder`, initialized with the given
 node map.

## Methods

### `nodes()`

**Returns:** `java.util.Set<N>`

### `isDirected()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `adjacentNodes(`N` node)`

**Returns:** `java.util.Set<N>`

### `predecessors(`N` node)`

**Returns:** `java.util.Set<N>`

### `successors(`N` node)`

**Returns:** `java.util.Set<N>`

### `incidentEdges(`N` node)`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

### `hasEdgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `edgeValueOrDefault(`N` nodeU, `N` nodeV, `V` defaultValue)`

**Returns:** `V`

### `edgeValueOrDefault([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, `V` defaultValue)`

**Returns:** `V`

### `edgeCount()`

**Returns:** `long`

### `checkedConnections(`N` node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

### `containsNode(`N` node)`

**Returns:** `boolean`

### `hasEdgeConnectingInternal(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

### `edgeValueOrDefaultInternal(`N` nodeU, `N` nodeV, `V` defaultValue)`

**Returns:** `V`

