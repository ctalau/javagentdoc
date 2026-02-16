# Interface: `ValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ValueGraph`

**Extends:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An interface for <a href="https://en.wikipedia.org/wiki/Graph_(discrete_mathematics)">graph</a>-structured data,
 whose edges have associated non-unique values.

 <p>A graph is composed of a set of nodes and a set of edges connecting pairs of nodes.

 <p>There are three primary interfaces provided to represent graphs. In order of increasing
 complexity they are: `Graph`, `ValueGraph`, and `Network`. You should generally
 prefer the simplest interface that satisfies your use case. See the <a href="https://github.com/google/guava/wiki/GraphsExplained#choosing-the-right-graph-type">
 "Choosing the right graph type"</a> section of the Guava User Guide for more details.

 <h3>Capabilities</h3>

 <p>`ValueGraph` supports the following use cases (<a href="https://github.com/google/guava/wiki/GraphsExplained#definitions">definitions of
 terms</a>):

 <ul>
   <li>directed graphs
   <li>undirected graphs
   <li>graphs that do/don't allow self-loops
   <li>graphs whose nodes/edges are insertion-ordered, sorted, or unordered
   <li>graphs whose edges have associated values
 </ul>

 <p>`ValueGraph`, as a subtype of `Graph`, explicitly does not support parallel edges,
 and forbids implementations or extensions with parallel edges. If you need parallel edges, use
 `Network`. (You can use a positive `Integer` edge value as a loose representation of
 edge multiplicity, but the `*degree()` and mutation methods will not reflect your
 interpretation of the edge value as its multiplicity.)

 <h3>Building a `ValueGraph`</h3>

 <p>The implementation classes that `common.graph` provides are not public, by design. To
 create an instance of one of the built-in implementations of `ValueGraph`, use the `ValueGraphBuilder` class:

 <pre>`MutableValueGraph<Integer, Double> graph = ValueGraphBuilder.directed().build();
 `</pre>

 <p>`ValueGraphBuilder.build()` returns an instance of `MutableValueGraph`, which is a
 subtype of `ValueGraph` that provides methods for adding and removing nodes and edges. If
 you do not need to mutate a graph (e.g. if you write a method than runs a read-only algorithm on
 the graph), you should use the non-mutating `ValueGraph` interface, or an `ImmutableValueGraph`.

 <p>You can create an immutable copy of an existing `ValueGraph` using `ImmutableValueGraph.copyOf(ValueGraph)`:

 <pre>`ImmutableValueGraph<Integer, Double> immutableGraph = ImmutableValueGraph.copyOf(graph);
 `</pre>

 <p>Instances of `ImmutableValueGraph` do not implement `MutableValueGraph`
 (obviously!) and are contractually guaranteed to be unmodifiable and thread-safe.

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
@param <V> Value parameter type
**Since:** 20.0

## Methods

### `nodes()`

**Returns:** `java.util.Set<N>`

Returns all nodes in this graph, in the order specified by `nodeOrder()`.

### `edges()`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

Returns all edges in this graph.

### `asGraph()`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

Returns a live view of this graph as a `Graph`. The resulting `Graph` will have an
 edge connecting node A to node B if this `ValueGraph` has an edge connecting A to B.

### `isDirected()`

**Returns:** `boolean`

Returns true if the edges in this graph are directed. Directed edges connect a `EndpointPair.source() source node` to a `EndpointPair.target() target node`, while
 undirected edges connect a pair of nodes to each other.

### `allowsSelfLoops()`

**Returns:** `boolean`

Returns true if this graph allows self-loops (edges that connect a node to itself). Attempting
 to add a self-loop to a graph that does not allow them will throw an `IllegalArgumentException`.

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

Returns the order of iteration for the elements of `nodes()`.

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

Returns an `ElementOrder` that specifies the order of iteration for the elements of
 `edges()`, `adjacentNodes(Object)`, `predecessors(Object)`, `successors(Object)` and `incidentEdges(Object)`.
**Since:** 29.0

### `adjacentNodes(`N` node)`

**Returns:** `java.util.Set<N>`

Returns the nodes which have an incident edge in common with `node` in this graph.

 <p>This is equal to the union of `predecessors(Object)` and `successors(Object)`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `predecessors(`N` node)`

**Returns:** `java.util.Set<N>`

Returns all nodes in this graph adjacent to `node` which can be reached by traversing
 `node`'s incoming edges <i>against</i> the direction (if any) of the edge.

 <p>In an undirected graph, this is equivalent to `adjacentNodes(Object)`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `successors(`N` node)`

**Returns:** `java.util.Set<N>`

Returns all nodes in this graph adjacent to `node` which can be reached by traversing
 `node`'s outgoing edges in the direction (if any) of the edge.

 <p>In an undirected graph, this is equivalent to `adjacentNodes(Object)`.

 <p>This is <i>not</i> the same as "all nodes reachable from `node` by following outgoing
 edges". For that functionality, see `Graphs.reachableNodes(Graph, Object)`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `incidentEdges(`N` node)`

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

Returns the edges in this graph whose endpoints include `node`.

 <p>This is equal to the union of incoming and outgoing edges.
@throws IllegalArgumentException if `node` is not an element of this graph
**Since:** 24.0

### `degree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s incident edges, counting self-loops twice (equivalently,
 the number of times an edge touches `node`).

 <p>For directed graphs, this is equal to `inDegree(node) + outDegree(node)`.

 <p>For undirected graphs, this is equal to `incidentEdges(node).size()` + (number of
 self-loops incident to `node`).

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `inDegree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s incoming edges (equal to `predecessors(node).size()`)
 in a directed graph. In an undirected graph, returns the `degree(Object)`.

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `outDegree(`N` node)`

**Returns:** `int`

Returns the count of `node`'s outgoing edges (equal to `successors(node).size()`)
 in a directed graph. In an undirected graph, returns the `degree(Object)`.

 <p>If the count is greater than `Integer.MAX_VALUE`, returns `Integer.MAX_VALUE`.
@throws IllegalArgumentException if `node` is not an element of this graph

### `hasEdgeConnecting(`N` nodeU, `N` nodeV)`

**Returns:** `boolean`

Returns true if there is an edge that directly connects `nodeU` to `nodeV`. This is
 equivalent to `nodes().contains(nodeU) && successors(nodeU).contains(nodeV)`.

 <p>In an undirected graph, this is equal to `hasEdgeConnecting(nodeV, nodeU)`.
**Since:** 23.0

### `hasEdgeConnecting([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

Returns true if there is an edge that directly connects `endpoints` (in the order, if
 any, specified by `endpoints`). This is equivalent to `edges().contains(endpoints)`.

 <p>Unlike the other `EndpointPair`-accepting methods, this method does not throw if the
 endpoints are unordered and the graph is directed; it simply returns `false`. This is for
 consistency with the behavior of `Collection.contains(Object)` (which does not generally
 throw if the object cannot be present in the collection), and the desire to have this method's
 behavior be compatible with `edges().contains(endpoints)`.
**Since:** 27.1

### `edgeValue(`N` nodeU, `N` nodeV)`

**Returns:** `java.util.Optional<V>`

Returns the value of the edge that connects `nodeU` to `nodeV` (in the order, if
 any, specified by `endpoints`), if one is present; otherwise, returns `Optional.empty()`.
@throws IllegalArgumentException if `nodeU` or `nodeV` is not an element of this
     graph
**Since:** 23.0 (since 20.0 with return type `V`)

### `edgeValue([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `java.util.Optional<V>`

Returns the value of the edge that connects `endpoints` (in the order, if any, specified
 by `endpoints`), if one is present; otherwise, returns `Optional.empty()`.

 <p>If this graph is directed, the endpoints must be ordered.
@throws IllegalArgumentException if either endpoint is not an element of this graph
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
**Since:** 27.1

### `edgeValueOrDefault(`N` nodeU, `N` nodeV, `V` defaultValue)`

**Returns:** `V`

Returns the value of the edge that connects `nodeU` to `nodeV`, if one is present;
 otherwise, returns `defaultValue`.

 <p>In an undirected graph, this is equal to `edgeValueOrDefault(nodeV, nodeU,
 defaultValue)`.
@throws IllegalArgumentException if `nodeU` or `nodeV` is not an element of this
     graph

### `edgeValueOrDefault([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, `V` defaultValue)`

**Returns:** `V`

Returns the value of the edge that connects `endpoints` (in the order, if any, specified
 by `endpoints`), if one is present; otherwise, returns `defaultValue`.

 <p>If this graph is directed, the endpoints must be ordered.
@throws IllegalArgumentException if either endpoint is not an element of this graph
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
**Since:** 27.1

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Returns `true` iff `object` is a `ValueGraph` that has the same elements and
 the same structural relationships as those in this graph.

 <p>Thus, two value graphs A and B are equal if <b>all</b> of the following are true:

 <ul>
   <li>A and B have equal `isDirected() directedness`.
   <li>A and B have equal `nodes() node sets`.
   <li>A and B have equal `edges() edge sets`.
   <li>The `edgeValue(Object, Object) value` of a given edge is the same in both A and B.
 </ul>

 <p>Graph properties besides `isDirected() directedness` do <b>not</b> affect equality.
 For example, two graphs may be considered equal even if one allows self-loops and the other
 doesn't. Additionally, the order in which nodes or edges are added to the graph, and the order
 in which they are iterated over, are irrelevant.

 <p>A reference implementation of this is provided by `AbstractValueGraph.equals(Object)`.

### `hashCode()`

**Returns:** `int`

Returns the hash code for this graph. The hash code of a graph is defined as the hash code of a
 map from each of its `edges() edges` to the associated `edgeValue(Object, Object) edge value`.

 <p>A reference implementation of this is provided by `AbstractValueGraph.hashCode()`.

