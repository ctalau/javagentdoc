# Class: `StandardNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardNetwork`

**Extends:** [`com.google.common.graph.AbstractNetwork<N,E>`](./AbstractNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

Standard implementation of {@link Network} that supports the options supplied by {@link NetworkBuilder}.

 <p>This class maintains a map of nodes to {@link NetworkConnections}. This class also maintains a
 map of edges to reference nodes. The reference node is defined to be the edge's source node on
 directed graphs, and an arbitrary endpoint of the edge on undirected graphs.

 <p>Collection-returning accessors return unmodifiable views: the view returned will reflect
 changes to the graph (if the graph is mutable) but may not be modified by the user.

 <p>The time complexity of all collection-returning accessors is O(1), since views are returned.
@author James Sexton
@author Joshua O'Madadhain
@author Omar Darwish
@param <N> Node parameter type
@param <E> Edge parameter type

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

**Type:** [`com.google.common.graph.MapIteratorCache<N,com.google.common.graph.NetworkConnections<N,E>>`](./MapIteratorCache>.md)

### `edgeToReferenceNode`

**Type:** [`com.google.common.graph.MapIteratorCache<E,N>`](./MapIteratorCache.md)

## Constructors

### `<init>([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md) builder)`

Constructs a graph with the properties specified in {@code builder}.

### `<init>([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md) builder, [`java.util.Map<N,com.google.common.graph.NetworkConnections<N,E>>`](../../../../java/util/Map>.md) nodeConnections, [`java.util.Map<E,N>`](../../../../java/util/Map.md) edgeToReferenceNode)`

Constructs a graph with the properties specified in {@code builder}, initialized with the given
 node and edge maps.

## Methods

### `nodes()`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `edges()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

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

### `incidentEdges([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `incidentNodes([`E`](E.md) edge)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `adjacentNodes([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `edgesConnecting([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `inEdges([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `outEdges([`N`](N.md) node)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `predecessors([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `successors([`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

### `checkedConnections([`N`](N.md) node)`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

### `checkedReferenceNode([`E`](E.md) edge)`

**Returns:** [`N`](N.md)

### `containsNode([`N`](N.md) node)`

**Returns:** `boolean`

### `containsEdge([`E`](E.md) edge)`

**Returns:** `boolean`

