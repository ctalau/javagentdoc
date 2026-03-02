# Class: `Graphs`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.Graphs`

## Description

## Constructors

### `<init>()`

## Methods

### `hasCycle(Graph<N> graph)`

A cycle is defined as a non-empty subset
 of edges in a graph arranged to form a path (a sequence of adjacent outgoing edges) starting
 and ending with the same node.

 
This method will detect any non-empty cycle, including self-loops (a cycle of length 1).

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

**Returns:** `boolean`

### `hasCycle(Network<?,?> network)`

A cycle is defined as a non-empty
 subset of edges in a graph arranged to form a path (a sequence of adjacent outgoing edges)
 starting and ending with the same node.

 
This method will detect any non-empty cycle, including self-loops (a cycle of length 1).

**Parameters:**
- `network` ([`com.google.common.graph.Network<?,?>`](./Network.md))

**Returns:** `boolean`

### `subgraphHasCycle(Graph<N> graph, Map<Object,Graphs.NodeVisitState> visitedNodes, N node, N previousNode)`

If we ever reach a node we've
 already visited (following only outgoing edges and without reusing edges), we know there's a
 cycle in the graph.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))
- `visitedNodes` (`java.util.Map<java.lang.Object,com.google.common.graph.Graphs.NodeVisitState>`)
- `node` (`N`)
- `previousNode` (`N`)

**Returns:** `boolean`

### `canTraverseWithoutReusingEdge(Graph<?> graph, Object nextNode, Object previousNode)`

In the directed case a cycle
 is always detected before reusing an edge, so no special logic is required. In the undirected
 case, we must take care not to "backtrack" over an edge (i.e. going from A to B and then going
 from B to A).

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<?>`](./Graph.md))
- `nextNode` (`java.lang.Object`)
- `previousNode` (`java.lang.Object`)

**Returns:** `boolean`

### `transitiveClosure(Graph<N> graph)`

The transitive closure of a graph is another
 graph with an edge connecting node A to node B if node B is reachable from node A.

 
This is a "snapshot" based on the current topology of graph, rather than a live view
 of the transitive closure of graph. In other words, the returned Graph will not
 be updated after modifications to graph.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

### `reachableNodes(Graph<N> graph, N node)`

Node B is defined as reachable
 from node A if there exists a path (a sequence of adjacent outgoing edges) starting at node A
 and ending at node B. Note that a node is always reachable from itself via a zero-length path.

 
This is a "snapshot" based on the current topology of graph, rather than a live view
 of the set of nodes reachable from node. In other words, the returned Set will
 not be updated after modifications to graph.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))
- `node` (`N`)

**Returns:** `java.util.Set<N>`

### `transpose(Graph<N> graph)`

All other
 properties remain intact, and further updates to graph will be reflected in the view.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

### `transpose(ValueGraph<N,V> graph)`

All other
 properties remain intact, and further updates to graph will be reflected in the view.

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

**Returns:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

### `transpose(Network<N,E> network)`

All other
 properties remain intact, and further updates to network will be reflected in the view.

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

**Returns:** [`com.google.common.graph.Network<N,E>`](./Network.md)

### `transpose(EndpointPair<N> endpoints)`

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

### `inducedSubgraph(Graph<N> graph, Iterable<? extends N> nodes)`

This subgraph is a new graph
 that contains all of the nodes in nodes, and all of the edges
 from graph for which both nodes are contained by nodes.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))
- `nodes` (`java.lang.Iterable<? extends N>`)

**Returns:** [`com.google.common.graph.MutableGraph<N>`](./MutableGraph.md)

### `inducedSubgraph(ValueGraph<N,V> graph, Iterable<? extends N> nodes)`

This subgraph is a new graph
 that contains all of the nodes in nodes, and all of the edges
 (and associated edge values) from graph for which both nodes are contained by 
 nodes.

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))
- `nodes` (`java.lang.Iterable<? extends N>`)

**Returns:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

### `inducedSubgraph(Network<N,E> network, Iterable<? extends N> nodes)`

This subgraph is a new graph
 that contains all of the nodes in nodes, and all of the edges
 from network for which the incident nodes are
 both contained by nodes.

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))
- `nodes` (`java.lang.Iterable<? extends N>`)

**Returns:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

### `copyOf(Graph<N> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

**Returns:** [`com.google.common.graph.MutableGraph<N>`](./MutableGraph.md)

### `copyOf(ValueGraph<N,V> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

**Returns:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

### `copyOf(Network<N,E> network)`

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

**Returns:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

### `checkNonNegative(int value)`

**Parameters:**
- `value` (`int`)

**Returns:** `int`

### `checkNonNegative(long value)`

**Parameters:**
- `value` (`long`)

**Returns:** `long`

### `checkPositive(int value)`

**Parameters:**
- `value` (`int`)

**Returns:** `int`

### `checkPositive(long value)`

**Parameters:**
- `value` (`long`)

**Returns:** `long`

