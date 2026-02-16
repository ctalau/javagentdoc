# Class: `StandardNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.StandardNetwork`

**Extends:** [`com.google.common.graph.AbstractNetwork<N,E>`](./AbstractNetwork.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

Standard implementation of `Network` that supports the options supplied by `NetworkBuilder`.

 <p>This class maintains a map of nodes to `NetworkConnections`. This class also maintains a
 map of edges to reference nodes. The reference node is defined to be the edge's source node on
 directed graphs, and an arbitrary endpoint of the edge on undirected graphs.

 <p>Collection-returning accessors return unmodifiable views: the view returned will reflect
 changes to the graph (if the graph is mutable) but may not be modified by the user.

 <p>The time complexity of all collection-returning accessors is O(1), since views are returned.
**Author:** James Sexton
**Author:** Joshua O'Madadhain
**Author:** Omar Darwish
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

Constructs a graph with the properties specified in `builder`.

### `<init>([`com.google.common.graph.NetworkBuilder<? super N,? super E>`](./NetworkBuilder.md) builder, `java.util.Map<N,com.google.common.graph.NetworkConnections<N,E>>` nodeConnections, `java.util.Map<E,N>` edgeToReferenceNode)`

Constructs a graph with the properties specified in `builder`, initialized with the given
 node and edge maps.

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

### `incidentEdges(`N` node)`

**Returns:** `java.util.Set<E>`

### `incidentNodes(`E` edge)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `adjacentNodes(`N` node)`

**Returns:** `java.util.Set<N>`

### `edgesConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Set<E>`

### `inEdges(`N` node)`

**Returns:** `java.util.Set<E>`

### `outEdges(`N` node)`

**Returns:** `java.util.Set<E>`

### `predecessors(`N` node)`

**Returns:** `java.util.Set<N>`

### `successors(`N` node)`

**Returns:** `java.util.Set<N>`

### `checkedConnections(`N` node)`

**Returns:** [`com.google.common.graph.NetworkConnections<N,E>`](./NetworkConnections.md)

### `checkedReferenceNode(`E` edge)`

**Returns:** `N`

### `containsNode(`N` node)`

**Returns:** `boolean`

### `containsEdge(`E` edge)`

**Returns:** `boolean`

