# Interface: `ValueGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ValueGraph`

**Extends:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A graph is composed of a set of nodes and a set of edges connecting pairs of nodes.

 
There are three primary interfaces provided to represent graphs. In order of increasing
 complexity they are: Graph, ValueGraph, and Network. You should generally
 prefer the simplest interface that satisfies your use case. See the [
 "Choosing the right graph type"](https://github.com/google/guava/wiki/GraphsExplained#choosing-the-right-graph-type) section of the Guava User Guide for more details.

 Capabilities

 
ValueGraph supports the following use cases ([definitions of
 terms](https://github.com/google/guava/wiki/GraphsExplained#definitions)):

 

   - directed graphs
   - undirected graphs
   - graphs that do/don't allow self-loops
   - graphs whose nodes/edges are insertion-ordered, sorted, or unordered
   - graphs whose edges have associated values
 


 
ValueGraph, as a subtype of Graph, explicitly does not support parallel edges,
 and forbids implementations or extensions with parallel edges. If you need parallel edges, use
 Network. (You can use a positive Integer edge value as a loose representation of
 edge multiplicity, but the *degree() and mutation methods will not reflect your
 interpretation of the edge value as its multiplicity.)

 Building a ValueGraph

 
The implementation classes that common.graph provides are not public, by design. To
 create an instance of one of the built-in implementations of ValueGraph, use the ValueGraphBuilder class:

 

```

 MutableValueGraph<Integer, Double> graph = ValueGraphBuilder.directed().build();
 
```


 
ValueGraphBuilder#build() returns an instance of MutableValueGraph, which is a
 subtype of ValueGraph that provides methods for adding and removing nodes and edges. If
 you do not need to mutate a graph (e.g. if you write a method than runs a read-only algorithm on
 the graph), you should use the non-mutating ValueGraph interface, or an ImmutableValueGraph.

 
You can create an immutable copy of an existing ValueGraph using ImmutableValueGraph#copyOf(ValueGraph):

 

```

 ImmutableValueGraph<Integer, Double> immutableGraph = ImmutableValueGraph.copyOf(graph);
 
```


 
Instances of ImmutableValueGraph do not implement MutableValueGraph
 (obviously!) and are contractually guaranteed to be unmodifiable and thread-safe.

 
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

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

### `asGraph()`

The resulting Graph will have an
 edge connecting node A to node B if this ValueGraph has an edge connecting A to B.

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

### `isDirected()`

Directed edges connect a source node to a target node, while
 undirected edges connect a pair of nodes to each other.

**Returns:** `boolean`

### `allowsSelfLoops()`

Attempting
 to add a self-loop to a graph that does not allow them will throw an IllegalArgumentException.

**Returns:** `boolean`

### `nodeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `incidentEdgeOrder()`

**Returns:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `adjacentNodes(N node)`

This is equal to the union of #predecessors(Object) and #successors(Object).

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `predecessors(N node)`

In an undirected graph, this is equivalent to #adjacentNodes(Object).

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `successors(N node)`

In an undirected graph, this is equivalent to #adjacentNodes(Object).

 
This is *not* the same as "all nodes reachable from node by following outgoing
 edges". For that functionality, see Graphs#reachableNodes(Graph, Object).

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `incidentEdges(N node)`

This is equal to the union of incoming and outgoing edges.

**Parameters:**
- `node` (`N`)

**Returns:** `java.util.Set<com.google.common.graph.EndpointPair<N>>`

### `degree(N node)`

For directed graphs, this is equal to inDegree(node) + outDegree(node).

 
For undirected graphs, this is equal to incidentEdges(node).size() + (number of
 self-loops incident to node).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

**Returns:** `int`

### `inDegree(N node)`

In an undirected graph, returns the #degree(Object).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

**Returns:** `int`

### `outDegree(N node)`

In an undirected graph, returns the #degree(Object).

 
If the count is greater than Integer.MAX_VALUE, returns Integer.MAX_VALUE.

**Parameters:**
- `node` (`N`)

**Returns:** `int`

### `hasEdgeConnecting(N nodeU, N nodeV)`

This is
 equivalent to nodes().contains(nodeU) && successors(nodeU).contains(nodeV).

 
In an undirected graph, this is equal to hasEdgeConnecting(nodeV, nodeU).

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `boolean`

### `hasEdgeConnecting(EndpointPair<N> endpoints)`

This is equivalent to 
 edges().contains(endpoints).

 
Unlike the other EndpointPair-accepting methods, this method does not throw if the
 endpoints are unordered and the graph is directed; it simply returns false. This is for
 consistency with the behavior of Collection#contains(Object) (which does not generally
 throw if the object cannot be present in the collection), and the desire to have this method's
 behavior be compatible with edges().contains(endpoints).

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `boolean`

### `edgeValue(N nodeU, N nodeV)`

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)

**Returns:** `java.util.Optional<V>`

### `edgeValue(EndpointPair<N> endpoints)`

If this graph is directed, the endpoints must be ordered.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** `java.util.Optional<V>`

### `edgeValueOrDefault(N nodeU, N nodeV, V defaultValue)`

In an undirected graph, this is equal to edgeValueOrDefault(nodeV, nodeU,
 defaultValue).

**Parameters:**
- `nodeU` (`N`)
- `nodeV` (`N`)
- `defaultValue` (`V`)

**Returns:** `V`

### `edgeValueOrDefault(EndpointPair<N> endpoints, V defaultValue)`

If this graph is directed, the endpoints must be ordered.

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))
- `defaultValue` (`V`)

**Returns:** `V`

### `equals(Object object)`

Thus, two value graphs A and B are equal if **all** of the following are true:

 

   - A and B have equal directedness.
   - A and B have equal node sets.
   - A and B have equal edge sets.
   - The value of a given edge is the same in both A and B.
 


 
Graph properties besides directedness do **not** affect equality.
 For example, two graphs may be considered equal even if one allows self-loops and the other
 doesn't. Additionally, the order in which nodes or edges are added to the graph, and the order
 in which they are iterated over, are irrelevant.

 
A reference implementation of this is provided by AbstractValueGraph#equals(Object).

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

The hash code of a graph is defined as the hash code of a
 map from each of its edges to the associated edge value.

 
A reference implementation of this is provided by AbstractValueGraph#hashCode().

**Returns:** `int`

