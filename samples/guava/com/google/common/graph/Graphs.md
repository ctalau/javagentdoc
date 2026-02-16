# Class: `Graphs`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.Graphs`

## Description

Static utility methods for {@link Graph}, {@link ValueGraph}, and {@link Network} instances.
@author James Sexton
@author Joshua O'Madadhain
@since 20.0

## Constructors

### `<init>()`

## Methods

### `hasCycle([`com.google.common.graph.Graph<N>`](./Graph.md) graph)`

**Returns:** `boolean`

Returns true if {@code graph} has at least one cycle. A cycle is defined as a non-empty subset
 of edges in a graph arranged to form a path (a sequence of adjacent outgoing edges) starting
 and ending with the same node.

 <p>This method will detect any non-empty cycle, including self-loops (a cycle of length 1).

### `hasCycle([`com.google.common.graph.Network<?,?>`](./Network.md) network)`

**Returns:** `boolean`

Returns true if {@code network} has at least one cycle. A cycle is defined as a non-empty
 subset of edges in a graph arranged to form a path (a sequence of adjacent outgoing edges)
 starting and ending with the same node.

 <p>This method will detect any non-empty cycle, including self-loops (a cycle of length 1).

### `subgraphHasCycle([`com.google.common.graph.Graph<N>`](./Graph.md) graph, [`java.util.Map<java.lang.Object,com.google.common.graph.Graphs.NodeVisitState>`](../../../../java/util/Map.md) visitedNodes, [`N`](N.md) node, [`N`](N.md) previousNode)`

**Returns:** `boolean`

Performs a traversal of the nodes reachable from {@code node}. If we ever reach a node we've
 already visited (following only outgoing edges and without reusing edges), we know there's a
 cycle in the graph.

### `canTraverseWithoutReusingEdge([`com.google.common.graph.Graph<?>`](./Graph.md) graph, `java.lang.Object` nextNode, `java.lang.Object` previousNode)`

**Returns:** `boolean`

Determines whether an edge has already been used during traversal. In the directed case a cycle
 is always detected before reusing an edge, so no special logic is required. In the undirected
 case, we must take care not to "backtrack" over an edge (i.e. going from A to B and then going
 from B to A).

### `transitiveClosure([`com.google.common.graph.Graph<N>`](./Graph.md) graph)`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

Returns the transitive closure of {@code graph}. The transitive closure of a graph is another
 graph with an edge connecting node A to node B if node B is {@link #reachableNodes(Graph,
 Object) reachable} from node A.

 <p>This is a "snapshot" based on the current topology of {@code graph}, rather than a live view
 of the transitive closure of {@code graph}. In other words, the returned {@link Graph} will not
 be updated after modifications to {@code graph}.

### `reachableNodes([`com.google.common.graph.Graph<N>`](./Graph.md) graph, [`N`](N.md) node)`

**Returns:** [`java.util.Set<N>`](../../../../java/util/Set.md)

Returns the set of nodes that are reachable from {@code node}. Node B is defined as reachable
 from node A if there exists a path (a sequence of adjacent outgoing edges) starting at node A
 and ending at node B. Note that a node is always reachable from itself via a zero-length path.

 <p>This is a "snapshot" based on the current topology of {@code graph}, rather than a live view
 of the set of nodes reachable from {@code node}. In other words, the returned {@link Set} will
 not be updated after modifications to {@code graph}.
@throws IllegalArgumentException if {@code node} is not present in {@code graph}

### `transpose([`com.google.common.graph.Graph<N>`](./Graph.md) graph)`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

Returns a view of {@code graph} with the direction (if any) of every edge reversed. All other
 properties remain intact, and further updates to {@code graph} will be reflected in the view.

### `transpose([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph)`

**Returns:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

Returns a view of {@code graph} with the direction (if any) of every edge reversed. All other
 properties remain intact, and further updates to {@code graph} will be reflected in the view.

### `transpose([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** [`com.google.common.graph.Network<N,E>`](./Network.md)

Returns a view of {@code network} with the direction (if any) of every edge reversed. All other
 properties remain intact, and further updates to {@code network} will be reflected in the view.

### `transpose([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `inducedSubgraph([`com.google.common.graph.Graph<N>`](./Graph.md) graph, `java.lang.Iterable<? extends N>` nodes)`

**Returns:** [`com.google.common.graph.MutableGraph<N>`](./MutableGraph.md)

Returns the subgraph of {@code graph} induced by {@code nodes}. This subgraph is a new graph
 that contains all of the nodes in {@code nodes}, and all of the {@link Graph#edges() edges}
 from {@code graph} for which both nodes are contained by {@code nodes}.
@throws IllegalArgumentException if any element in {@code nodes} is not a node in the graph

### `inducedSubgraph([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph, `java.lang.Iterable<? extends N>` nodes)`

**Returns:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

Returns the subgraph of {@code graph} induced by {@code nodes}. This subgraph is a new graph
 that contains all of the nodes in {@code nodes}, and all of the {@link Graph#edges() edges}
 (and associated edge values) from {@code graph} for which both nodes are contained by {@code
 nodes}.
@throws IllegalArgumentException if any element in {@code nodes} is not a node in the graph

### `inducedSubgraph([`com.google.common.graph.Network<N,E>`](./Network.md) network, `java.lang.Iterable<? extends N>` nodes)`

**Returns:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

Returns the subgraph of {@code network} induced by {@code nodes}. This subgraph is a new graph
 that contains all of the nodes in {@code nodes}, and all of the {@link Network#edges() edges}
 from {@code network} for which the {@link Network#incidentNodes(Object) incident nodes} are
 both contained by {@code nodes}.
@throws IllegalArgumentException if any element in {@code nodes} is not a node in the graph

### `copyOf([`com.google.common.graph.Graph<N>`](./Graph.md) graph)`

**Returns:** [`com.google.common.graph.MutableGraph<N>`](./MutableGraph.md)

Creates a mutable copy of {@code graph} with the same nodes and edges.

### `copyOf([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md) graph)`

**Returns:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

Creates a mutable copy of {@code graph} with the same nodes, edges, and edge values.

### `copyOf([`com.google.common.graph.Network<N,E>`](./Network.md) network)`

**Returns:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

Creates a mutable copy of {@code network} with the same nodes and edges.

### `checkNonNegative(`int` value)`

**Returns:** `int`

### `checkNonNegative(`long` value)`

**Returns:** `long`

### `checkPositive(`int` value)`

**Returns:** `int`

### `checkPositive(`long` value)`

**Returns:** `long`

