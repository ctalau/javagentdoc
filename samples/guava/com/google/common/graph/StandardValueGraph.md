# Class: `StandardValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardValueGraph`

**Extends:** [`com.google.common.graph.AbstractValueGraph<N,V>`](./AbstractValueGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Standard implementation of {@link ValueGraph} that supports the options supplied by {@link AbstractGraphBuilder}.

 <p>This class maintains a map of nodes to {@link GraphConnections}.

 <p>Collection-returning accessors return unmodifiable views: the view returned will reflect
 changes to the graph (if the graph is mutable) but may not be modified by the user.

 <p>The time complexity of all collection-returning accessors is O(1), since views are returned.
@author James Sexton
@author Joshua O'Madadhain
@author Omar Darwish
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

Constructs a graph with the properties specified in {@code builder}.

### `<init>([`com.google.common.graph.AbstractGraphBuilder<? super N>`](./AbstractGraphBuilder.md) builder, [`java.util.Map<N,com.google.common.graph.GraphConnections<N,V>>`](../../../../java/util/Map>.md) nodeConnections, `long` edgeCount)`

Constructs a graph with the properties specified in {@code builder}, initialized with the given
 node map.

## Methods

### `nodes()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `isDirected()`

**Returns:** `boolean`

### `allowsSelfLoops()`

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `adjacentNodes([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `predecessors([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `incidentEdges([`N`](N.md) node)`

**Returns:** [`java.util.Set<com.google.common.graph.EndpointPair<N>>`](../../../../java/util/Set>.md)

### `hasEdgeConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** `boolean`

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

### `edgeValueOrDefault([`N`](N.md) nodeU, [`N`](N.md) nodeV, [`V`](V.md) defaultValue)`

**Returns:** [`V`](V.md)

### `edgeValueOrDefault([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, [`V`](V.md) defaultValue)`

**Returns:** [`V`](V.md)

### `edgeCount()`

**Returns:** `long`

### `checkedConnections([`N`](N.md) node)`

**Returns:** [`com.google.common.graph.GraphConnections<N,V>`](./GraphConnections.md)

### `containsNode([`N`](N.md) node)`

**Returns:** `boolean`

### `hasEdgeConnectingInternal([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** `boolean`

### `edgeValueOrDefaultInternal([`N`](N.md) nodeU, [`N`](N.md) nodeV, [`V`](V.md) defaultValue)`

**Returns:** [`V`](V.md)

