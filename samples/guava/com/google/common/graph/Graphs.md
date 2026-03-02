# Class: `Graphs`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.Graphs`

## Description

## Constructors

### `<init>()`

## Methods

### `hasCycle(com.google.common.graph.Graph<N> graph)`

**Returns:** `boolean`

A cycle is defined as a non-empty subset
 of edges in a graph arranged to form a path (a sequence of adjacent outgoing edges) starting
 and ending with the same node.

 
This method will detect any non-empty cycle, including self-loops (a cycle of length 1).

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

### `hasCycle(com.google.common.graph.Network<?,?> network)`

**Returns:** `boolean`

A cycle is defined as a non-empty
 subset of edges in a graph arranged to form a path (a sequence of adjacent outgoing edges)
 starting and ending with the same node.

 
This method will detect any non-empty cycle, including self-loops (a cycle of length 1).

**Parameters:**
- `network` ([`com.google.common.graph.Network<?,?>`](./Network.md))

### `subgraphHasCycle(com.google.common.graph.Graph<N> graph, java.util.Map<java.lang.Object,com.google.common.graph.Graphs.NodeVisitState> visitedNodes, N node, N previousNode)`

**Returns:** `boolean`

If we ever reach a node we've
 already visited (following only outgoing edges and without reusing edges), we know there's a
 cycle in the graph.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))
- `visitedNodes` (`java.util.Map<java.lang.Object,com.google.common.graph.Graphs.NodeVisitState>`)
- `node` (`N`)
- `previousNode` (`N`)

### `canTraverseWithoutReusingEdge(com.google.common.graph.Graph<?> graph, java.lang.Object nextNode, java.lang.Object previousNode)`

**Returns:** `boolean`

In the directed case a cycle
 is always detected before reusing an edge, so no special logic is required. In the undirected
 case, we must take care not to "backtrack" over an edge (i.e. going from A to B and then going
 from B to A).

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<?>`](./Graph.md))
- `nextNode` (`java.lang.Object`)
- `previousNode` (`java.lang.Object`)

### `transitiveClosure(com.google.common.graph.Graph<N> graph)`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

The transitive closure of a graph is another
 graph with an edge connecting node A to node B if node B is reachable from node A.

 
This is a "snapshot" based on the current topology of graph, rather than a live view
 of the transitive closure of graph. In other words, the returned Graph will not
 be updated after modifications to graph.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

### `reachableNodes(com.google.common.graph.Graph<N> graph, N node)`

**Returns:** `java.util.Set<N>`

Node B is defined as reachable
 from node A if there exists a path (a sequence of adjacent outgoing edges) starting at node A
 and ending at node B. Note that a node is always reachable from itself via a zero-length path.

 
This is a "snapshot" based on the current topology of graph, rather than a live view
 of the set of nodes reachable from node. In other words, the returned Set will
 not be updated after modifications to graph.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))
- `node` (`N`)

### `transpose(com.google.common.graph.Graph<N> graph)`

**Returns:** [`com.google.common.graph.Graph<N>`](./Graph.md)

All other
 properties remain intact, and further updates to graph will be reflected in the view.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

### `transpose(com.google.common.graph.ValueGraph<N,V> graph)`

**Returns:** [`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md)

All other
 properties remain intact, and further updates to graph will be reflected in the view.

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

### `transpose(com.google.common.graph.Network<N,E> network)`

**Returns:** [`com.google.common.graph.Network<N,E>`](./Network.md)

All other
 properties remain intact, and further updates to network will be reflected in the view.

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

### `transpose(com.google.common.graph.EndpointPair<N> endpoints)`

**Returns:** [`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md)

**Parameters:**
- `endpoints` ([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md))

### `inducedSubgraph(com.google.common.graph.Graph<N> graph, java.lang.Iterable<? extends N> nodes)`

**Returns:** [`com.google.common.graph.MutableGraph<N>`](./MutableGraph.md)

This subgraph is a new graph
 that contains all of the nodes in nodes, and all of the edges
 from graph for which both nodes are contained by nodes.

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))
- `nodes` (`java.lang.Iterable<? extends N>`)

### `inducedSubgraph(com.google.common.graph.ValueGraph<N,V> graph, java.lang.Iterable<? extends N> nodes)`

**Returns:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

This subgraph is a new graph
 that contains all of the nodes in nodes, and all of the edges
 (and associated edge values) from graph for which both nodes are contained by 
 nodes.

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))
- `nodes` (`java.lang.Iterable<? extends N>`)

### `inducedSubgraph(com.google.common.graph.Network<N,E> network, java.lang.Iterable<? extends N> nodes)`

**Returns:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

This subgraph is a new graph
 that contains all of the nodes in nodes, and all of the edges
 from network for which the incident nodes are
 both contained by nodes.

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))
- `nodes` (`java.lang.Iterable<? extends N>`)

### `copyOf(com.google.common.graph.Graph<N> graph)`

**Returns:** [`com.google.common.graph.MutableGraph<N>`](./MutableGraph.md)

**Parameters:**
- `graph` ([`com.google.common.graph.Graph<N>`](./Graph.md))

### `copyOf(com.google.common.graph.ValueGraph<N,V> graph)`

**Returns:** [`com.google.common.graph.MutableValueGraph<N,V>`](./MutableValueGraph.md)

**Parameters:**
- `graph` ([`com.google.common.graph.ValueGraph<N,V>`](./ValueGraph.md))

### `copyOf(com.google.common.graph.Network<N,E> network)`

**Returns:** [`com.google.common.graph.MutableNetwork<N,E>`](./MutableNetwork.md)

**Parameters:**
- `network` ([`com.google.common.graph.Network<N,E>`](./Network.md))

### `checkNonNegative(int value)`

**Returns:** `int`

**Parameters:**
- `value` (`int`)

### `checkNonNegative(long value)`

**Returns:** `long`

**Parameters:**
- `value` (`long`)

### `checkPositive(int value)`

**Returns:** `int`

**Parameters:**
- `value` (`int`)

### `checkPositive(long value)`

**Returns:** `long`

**Parameters:**
- `value` (`long`)

