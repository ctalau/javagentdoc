# Interface: `Network`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.Network`

**Extends:** [`com.google.common.graph.SuccessorsFunction<N>`](./SuccessorsFunction.md), [`com.google.common.graph.PredecessorsFunction<N>`](./PredecessorsFunction.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

An interface for <a href="https://en.wikipedia.org/wiki/Graph_(discrete_mathematics)">graph</a>-structured data,
 whose edges are unique objects.

 <p>A graph is composed of a set of nodes and a set of edges connecting pairs of nodes.

 <p>There are three primary interfaces provided to represent graphs. In order of increasing
 complexity they are: `Graph`, `ValueGraph`, and `Network`. You should generally
 prefer the simplest interface that satisfies your use case. See the <a href="https://github.com/google/guava/wiki/GraphsExplained#choosing-the-right-graph-type">
 "Choosing the right graph type"</a> section of the Guava User Guide for more details.

 <h3>Capabilities</h3>

 <p>`Network` supports the following use cases (<a href="https://github.com/google/guava/wiki/GraphsExplained#definitions">definitions of
 terms</a>):

 <ul>
   <li>directed graphs
   <li>undirected graphs
   <li>graphs that do/don't allow parallel edges
   <li>graphs that do/don't allow self-loops
   <li>graphs whose nodes/edges are insertion-ordered, sorted, or unordered
   <li>graphs whose edges are unique objects
 </ul>

 <h3>Building a `Network`</h3>

 <p>The implementation classes that `common.graph` provides are not public, by design. To
 create an instance of one of the built-in implementations of `Network`, use the `NetworkBuilder` class:

 <pre>`MutableNetwork<Integer, MyEdge> graph = NetworkBuilder.directed().build();
 `</pre>

 <p>`NetworkBuilder.build()` returns an instance of `MutableNetwork`, which is a
 subtype of `Network` that provides methods for adding and removing nodes and edges. If you
 do not need to mutate a graph (e.g. if you write a method than runs a read-only algorithm on the
 graph), you should use the non-mutating `Network` interface, or an `ImmutableNetwork`.

 <p>You can create an immutable copy of an existing `Network` using `ImmutableNetwork.copyOf(Network)`:

 <pre>`ImmutableNetwork<Integer, MyEdge> immutableGraph = ImmutableNetwork.copyOf(graph);
 `</pre>

 <p>Instances of `ImmutableNetwork` do not implement `MutableNetwork` (obviously!) and
 are contractually guaranteed to be unmodifiable and thread-safe.

 <p>The Guava User Guide has <a href="https://github.com/google/guava/wiki/GraphsExplained#building-graph-instances">more
 information on (and examples of) building graphs</a>.

 <h3>Additional documentation</h3>

 <p>See the Guava User Guide for the `common.graph` package (<a href="https://github.com/google/guava/wiki/GraphsExplained">"Graphs Explained"</a>) for
 additional documentation, including:

 <ul>
   <li><a href="https://github.com/google/guava/wiki/GraphsExplained#equals-hashcode-and-graph-equivalence">
       `equals()`, `hashCode()`, and graph equivalence</a>
   <li><a href="https://github.com/google/guava/wiki/GraphsExplained#synchronization">
       Synchronization policy</a>
   <li><a href="https://github.com/google/guava/wiki/GraphsExplained#notes-for-implementors">Notes
       for implementors</a>
 </ul>
**Author:** James Sexton
**Author:** Joshua O'Madadhain
@param <N> Node parameter type
@param <E> Edge parameter type
**Since:** 20.0

## Methods

### `nodes()`

**Returns:** `java.util.Set<N>`

Returns all nodes in this network, in the order specified by `nodeOrder()`.

### `edges()`

**Returns:** `java.util.Set<E>`

Returns all edges in this network, in the order specified by `edgeOrder()`.

### `asGraph()`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

Returns a live view of this network as a `Graph`. The resulting `Graph` will have
 an edge connecting node A to node B if this `Network` has an edge connecting A to B.

 <p>If this network `allowsParallelEdges() allows parallel edges`, parallel edges will be
 treated as if collapsed into a single edge. For example, the `degree(Object)` of a node
 in the `Graph` view may be less than the degree of the same node in this `Network`.

### `isDirected()`

**Returns:** `boolean`

Returns true if the edges in this network are directed. Directed edges connect a `EndpointPair.source() source node` to a `EndpointPair.target() target node`, while
 undirected edges connect a pair of nodes to each other.

### `allowsParallelEdges()`

**Returns:** `boolean`

Returns true if this network allows parallel edges. Attempting to add a parallel edge to a
 network that does not allow them will throw an `IllegalArgumentException`.

### `allowsSelfLoops()`

**Returns:** `boolean`

Returns true if this network allows self-loops (edges that connect a node to itself).
 Attempting to add a self-loop to a network that does not allow them will throw an `IllegalArgumentException`.

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

Returns the order of iteration for the elements of `nodes()`.

### `edgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<E>`](./ElementOrder.md)

Returns the order of iteration for the elements of `edges()`.

### `adjacentNodes(`N` node)`

**Returns:** `java.util.Set<N>`

Returns the nodes which have an incident edge in common with `node` in this network.

 <p>This is equal to the union of `predecessors(Object)` and `successors(Object)`.
@throws IllegalArgumentException if `node` is not an element of this network

### `predecessors(`N` node)`

**Returns:** `java.util.Set<N>`

Returns all nodes in this network adjacent to `node` which can be reached by traversing
 `node`'s incoming edges <i>against</i> the direction (if any) of the edge.

 <p>In an undirected network, this is equivalent to `adjacentNodes(Object)`.
@throws IllegalArgumentException if `node` is not an element of this network

### `successors(`N` node)`

**Returns:** `java.util.Set<N>`

Returns all nodes in this network adjacent to `node` which can be reached by traversing
 `node`'s outgoing edges in the direction (if any) of the edge.

 <p>In an undirected network, this is equivalent to `adjacentNodes(Object)`.

 <p>This is <i>not</i> the same as "all nodes reachable from `node` by following outgoing
 edges". For that functionality, see `Graphs.reachableNodes(Graph, Object)`.
@throws IllegalArgumentException if `node` is not an element of this network

### `incidentEdges(`N` node)`

**Returns:** `java.util.Set<E>`

Returns the edges whose `incidentNodes(Object) incident nodes` in this network include
 `node`.

 <p>This is equal to the union of `inEdges(Object)` and `outEdges(Object)`.
@throws IllegalArgumentException if `node` is not an element of this network

### `inEdges(`N` node)`

**Returns:** `java.util.Set<E>`

Returns all edges in this network which can be traversed in the direction (if any) of the edge
 to end at `node`.

 <p>In a directed network, an incoming edge's `EndpointPair.target()` equals `node`.

 <p>In an undirected network, this is equivalent to `incidentEdges(Object)`.
@throws IllegalArgumentException if `node` is not an element of this network

### `outEdges(`N` node)`

**Returns:** `java.util.Set<E>`

Returns all edges in this network which can be traversed in the direction (if any) of the edge
 starting from `node`.

 <p>In a directed network, an outgoing edge's `EndpointPair.source()` equals `node`.

 <p>In an undirected network, this is equivalent to `incidentEdges(Object)`.
@throws IllegalArgumentException if `node` is not an element of this network

### `degree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s `incidentEdges(Object) incident edges`, counting
 self-loops twice (equivalently, the number of times an edge touches `node`).

 <p>For directed networks, this is equal to `inDegree(node) + outDegree(node)`.

 <p>For undirected networks, this is equal to `incidentEdges(node).size()` + (number of
 self-loops incident to `node`).

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this network

### `inDegree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s `inEdges(Object) incoming edges` in a directed
 network. In an undirected network, returns the `degree(Object)`.

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this network

### `outDegree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s `outEdges(Object) outgoing edges` in a directed
 network. In an undirected network, returns the `degree(Object)`.

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this network

### `incidentNodes(`E` edge)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

Returns the nodes which are the endpoints of `edge` in this network.
@throws IllegalArgumentException if `edge` is not an element of this network

### `adjacentEdges(`E` edge)`

**Returns:** `java.util.Set<E>`

Returns the edges which have an `incidentNodes(Object) incident node` in common with
 `edge`. An edge is not considered adjacent to itself.
@throws IllegalArgumentException if `edge` is not an element of this network

### `edgesConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Set<E>`

Returns the set of edges that each directly connect `nodeU` to `nodeV`.

 <p>In an undirected network, this is equal to `edgesConnecting(nodeV, nodeU)`.

 <p>The resulting set of edges will be parallel (i.e. have equal `incidentNodes(Object)`). If this network does not `allowsParallelEdges() allow parallel
 edges`, the resulting set will contain at most one edge (equivalent to `edgeConnecting(nodeU, nodeV).asSet()`).
@throws IllegalArgumentException if `nodeU` or `nodeV` is not an element of this
     network

### `edgesConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Set<E>`

Returns the set of edges that each directly connect `endpoints` (in the order, if any,
 specified by `endpoints`).

 <p>The resulting set of edges will be parallel (i.e. have equal `incidentNodes(Object)`). If this network does not `allowsParallelEdges() allow parallel
 edges`, the resulting set will contain at most one edge (equivalent to `edgeConnecting(endpoints).asSet()`).

 <p>If this network is directed, `endpoints` must be ordered.
@throws IllegalArgumentException if either endpoint is not an element of this network
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
**Since:** 27.1

### `edgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Optional<E>`

Returns the single edge that directly connects `nodeU` to `nodeV`, if one is
 present, or `Optional.empty()` if no such edge exists.

 <p>In an undirected network, this is equal to `edgeConnecting(nodeV, nodeU)`.
@throws IllegalArgumentException if there are multiple parallel edges connecting `nodeU`
     to `nodeV`
@throws IllegalArgumentException if `nodeU` or `nodeV` is not an element of this
     network
**Since:** 23.0

### `edgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Optional<E>`

Returns the single edge that directly connects `endpoints` (in the order, if any,
 specified by `endpoints`), if one is present, or `Optional.empty()` if no such edge
 exists.

 <p>If this graph is directed, the endpoints must be ordered.
@throws IllegalArgumentException if there are multiple parallel edges connecting `nodeU`
     to `nodeV`
@throws IllegalArgumentException if either endpoint is not an element of this network
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
**Since:** 27.1

### `edgeConnectingOrNull(`N` nodeU, `N` nodeV)`

**Returns:** `E`

Returns the single edge that directly connects `nodeU` to `nodeV`, if one is
 present, or `null` if no such edge exists.

 <p>In an undirected network, this is equal to `edgeConnectingOrNull(nodeV, nodeU)`.
@throws IllegalArgumentException if there are multiple parallel edges connecting `nodeU`
     to `nodeV`
@throws IllegalArgumentException if `nodeU` or `nodeV` is not an element of this
     network
**Since:** 23.0

### `edgeConnectingOrNull([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `E`

Returns the single edge that directly connects `endpoints` (in the order, if any,
 specified by `endpoints`), if one is present, or `null` if no such edge exists.

 <p>If this graph is directed, the endpoints must be ordered.
@throws IllegalArgumentException if there are multiple parallel edges connecting `nodeU`
     to `nodeV`
@throws IllegalArgumentException if either endpoint is not an element of this network
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
**Since:** 27.1

### `hasEdgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

Returns true if there is an edge that directly connects `nodeU` to `nodeV`. This is
 equivalent to `nodes().contains(nodeU) && successors(nodeU).contains(nodeV)`, and to
 `edgeConnectingOrNull(nodeU, nodeV) != null`.

 <p>In an undirected graph, this is equal to `hasEdgeConnecting(nodeV, nodeU)`.
**Since:** 23.0

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

Returns true if there is an edge that directly connects `endpoints` (in the order, if
 any, specified by `endpoints`).

 <p>Unlike the other `EndpointPair`-accepting methods, this method does not throw if the
 endpoints are unordered and the graph is directed; it simply returns `false`. This is for
 consistency with `Graph.hasEdgeConnecting(EndpointPair)` and `ValueGraph.hasEdgeConnecting(EndpointPair)`.
**Since:** 27.1

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Returns `true` iff `object` is a `Network` that has the same elements and the
 same structural relationships as those in this network.

 <p>Thus, two networks A and B are equal if <b>all</b> of the following are true:

 <ul>
   <li>A and B have equal `isDirected() directedness`.
   <li>A and B have equal `nodes() node sets`.
   <li>A and B have equal `edges() edge sets`.
   <li>Every edge in A and B connects the same nodes in the same direction (if any).
 </ul>

 <p>Network properties besides `isDirected() directedness` do <b>not</b> affect equality.
 For example, two networks may be considered equal even if one allows parallel edges and the
 other doesn't. Additionally, the order in which nodes or edges are added to the network, and
 the order in which they are iterated over, are irrelevant.

 <p>A reference implementation of this is provided by `AbstractNetwork.equals(Object)`.

### `hashCode()`

**Returns:** `int`

Returns the hash code for this network. The hash code of a network is defined as the hash code
 of a map from each of its `edges() edges` to their `incidentNodes(Object) incident nodes`.

 <p>A reference implementation of this is provided by `AbstractNetwork.hashCode()`.

