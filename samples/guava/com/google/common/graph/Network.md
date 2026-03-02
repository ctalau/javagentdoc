# Interface: `Network`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.Network`

**Extends:** [`com.google.common.graph.SuccessorsFunction<N>`](./SuccessorsFunction.md), [`com.google.common.graph.PredecessorsFunction<N>`](./PredecessorsFunction.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A graph is composed of a set of nodes and a set of edges connecting pairs of nodes.

 
There are three primary interfaces provided to represent graphs. In order of increasing
 complexity they are: Graph, ValueGraph, and Network. You should generally
 prefer the simplest interface that satisfies your use case. See the [
 "Choosing the right graph type"](https://github.com/google/guava/wiki/GraphsExplained#choosing-the-right-graph-type) section of the Guava User Guide for more details.

 Capabilities

 
Network supports the following use cases ([definitions of
 terms](https://github.com/google/guava/wiki/GraphsExplained#definitions)):

 

   - directed graphs
   - undirected graphs
   - graphs that do/don't allow parallel edges
   - graphs that do/don't allow self-loops
   - graphs whose nodes/edges are insertion-ordered, sorted, or unordered
   - graphs whose edges are unique objects
 


 Building a Network

 
The implementation classes that common.graph provides are not public, by design. To
 create an instance of one of the built-in implementations of Network, use the NetworkBuilder class:

 

```

 MutableNetwork<Integer, MyEdge> graph = NetworkBuilder.directed().build();
 
```


 
NetworkBuilder#build() returns an instance of MutableNetwork, which is a
 subtype of Network that provides methods for adding and removing nodes and edges. If you
 do not need to mutate a graph (e.g. if you write a method than runs a read-only algorithm on the
 graph), you should use the non-mutating Network interface, or an ImmutableNetwork.

 
You can create an immutable copy of an existing Network using ImmutableNetwork#copyOf(Network):

 

```

 ImmutableNetwork<Integer, MyEdge> immutableGraph = ImmutableNetwork.copyOf(graph);
 
```


 
Instances of ImmutableNetwork do not implement MutableNetwork (obviously!) and
 are contractually guaranteed to be unmodifiable and thread-safe.

 
The Guava User Guide has [more
 information on (and examples of) building graphs](https://github.com/google/guava/wiki/GraphsExplained#building-graph-instances).

 Additional documentation

 
See the Guava User Guide for the common.graph package (["Graphs Explained"](https://github.com/google/guava/wiki/GraphsExplained)) for
 additional documentation, including:

 

   - [
       equals(), hashCode(), and graph equivalence](https://github.com/google/guava/wiki/GraphsExplained#equals-hashcode-and-graph-equivalence)
   - [
       Synchronization policy](https://github.com/google/guava/wiki/GraphsExplained#synchronization)
   - [Notes
       for implementors](https://github.com/google/guava/wiki/GraphsExplained#notes-for-implementors)

## Methods

### `nodes()`

**Returns:** `java.util.Set<N>`

### `edges()`

**Returns:** `java.util.Set<E>`

### `asGraph()`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

The resulting Graph will have
 an edge connecting node A to node B if this Network has an edge connecting A to B.

 
If this network allows parallel edges, parallel edges will be
 treated as if collapsed into a single edge. For example, the #degree(Object) of a node
 in the Graph view may be less than the degree of the same node in this Network.

### `isDirected()`

**Returns:** `boolean`

Directed edges connect a source node to a target node, while
 undirected edges connect a pair of nodes to each other.

### `allowsParallelEdges()`

**Returns:** `boolean`

Attempting to add a parallel edge to a
 network that does not allow them will throw an IllegalArgumentException.

### `allowsSelfLoops()`

**Returns:** `boolean`

Attempting to add a self-loop to a network that does not allow them will throw an IllegalArgumentException.

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `edgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<E>`](./ElementOrder.md)

### `adjacentNodes(N node)`

**Returns:** `java.util.Set<N>`

This is equal to the union of #predecessors(Object) and #successors(Object).

**Parameters:**
- `node` (`N`)

### `predecessors(N node)`

**Returns:** `java.util.Set<N>`

In an undirected network, this is equivalent to #adjacentNodes(Object).

**Parameters:**
- `node` (`N`)

### `successors(N node)`

**Returns:** `java.util.Set<N>`

In an undirected network, this is equivalent to #adjacentNodes(Object).

 
This is *not* the same as "all nodes reachable from node by following outgoing
 edges". For that functionality, see Graphs#reachableNodes(Graph, Object).

**Parameters:**
- `node` (`N`)

### `incidentEdges(N node)`

**Returns:** `java.util.Set<E>`

This is equal to the union of #inEdges(Object) and #outEdges(Object).

**Parameters:**
- `node` (`N`)

### `inEdges(N node)`

**Returns:** `java.util.Set<E>`

In a directed network, an incoming edge's EndpointPair#target() equals node.

 
In an undirected network, this is equivalent to #incidentEdges(Object).

**Parameters:**
- `node` (`N`)

### `outEdges(N node)`

**Returns:** `java.util.Set<E>`

In a directed network, an outgoing edge's EndpointPair#source() equals node.

 
In an undirected network, this is equivalent to #incidentEdges(Object).

**Parameters:**
- `node` (`N`)

### `degree(N node)`

**Returns:** `int`

For directed networks, this is equal to inDegree(node) + outDegree(node).

 
For undirected networks, this is equal to incidentEdges(node).size() + (number of
 self-loops incident to node).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

### `inDegree(N node)`

**Returns:** `int`

In an undirected network, returns the #degree(Object).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

### `outDegree(N node)`

**Returns:** `int`

In an undirected network, returns the #degree(Object).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

### `incidentNodes(E edge)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

**Parameters:**
- `edge` (`E`)

### `adjacentEdges(E edge)`

**Returns:** `java.util.Set<E>`

An edge is not considered adjacent to itself.

**Parameters:**
- `edge` (`E`)

### `edgesConnecting(N nodeU, N nodeV)`

**Returns:** `java.util.Set<E>`

In an undirected network, this is equal to edgesConnecting(nodeV, nodeU).

 
The resulting set of edges will be parallel (i.e. have equal #incidentNodes(Object)). If this network does not allow parallel
 edges, the resulting set will contain at most one edge (equivalent to 
 edgeConnecting(nodeU, nodeV).asSet()).

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgesConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `java.util.Set<E>`

The resulting set of edges will be parallel (i.e. have equal #incidentNodes(Object)). If this network does not allow parallel
 edges, the resulting set will contain at most one edge (equivalent to 
 edgeConnecting(endpoints).asSet()).

 
If this network is directed, endpoints must be ordered.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `edgeConnecting(N nodeU, N nodeV)`

**Returns:** `java.util.Optional<E>`

In an undirected network, this is equal to edgeConnecting(nodeV, nodeU).

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgeConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `java.util.Optional<E>`

If this graph is directed, the endpoints must be ordered.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `edgeConnectingOrNull(N nodeU, N nodeV)`

**Returns:** `E`

In an undirected network, this is equal to edgeConnectingOrNull(nodeV, nodeU).

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `E`

If this graph is directed, the endpoints must be ordered.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `hasEdgeConnecting(N nodeU, N nodeV)`

**Returns:** `boolean`

This is
 equivalent to nodes().contains(nodeU) && successors(nodeU).contains(nodeV), and to
 edgeConnectingOrNull(nodeU, nodeV) != null.

 
In an undirected graph, this is equal to hasEdgeConnecting(nodeV, nodeU).

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

### `hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** `boolean`

Unlike the other EndpointPair-accepting methods, this method does not throw if the
 endpoints are unordered and the graph is directed; it simply returns false. This is for
 consistency with Graph#hasEdgeConnecting(EndpointPair) and ValueGraph#hasEdgeConnecting(EndpointPair).

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `equals(java.lang.Object object)`

**Returns:** `boolean`

Thus, two networks A and B are equal if **all** of the following are true:

 

   - A and B have equal directedness.
   - A and B have equal node sets.
   - A and B have equal edge sets.
   - Every edge in A and B connects the same nodes in the same direction (if any).
 


 
Network properties besides directedness do **not** affect equality.
 For example, two networks may be considered equal even if one allows parallel edges and the
 other doesn't. Additionally, the order in which nodes or edges are added to the network, and
 the order in which they are iterated over, are irrelevant.

 
A reference implementation of this is provided by AbstractNetwork#equals(Object).

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

The hash code of a network is defined as the hash code
 of a map from each of its edges to their incident nodes.

 
A reference implementation of this is provided by AbstractNetwork#hashCode().

