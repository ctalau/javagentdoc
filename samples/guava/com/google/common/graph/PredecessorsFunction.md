# Interface: `PredecessorsFunction`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.PredecessorsFunction`

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A functional interface for <a href="https://en.wikipedia.org/wiki/Graph_(discrete_mathematics)">graph</a>-structured data.

 <p>This interface is meant to be used as the type of a parameter to graph algorithms (such as
 topological sort) that only need a way of accessing the predecessors of a node in a graph.

 <h3>Usage</h3>

 Given an algorithm, for example:

 <pre>`public <N> someGraphAlgorithm(N startNode, PredecessorsFunction<N> predecessorsFunction);
 `</pre>

 you will invoke it depending on the graph representation you're using.

 <p>If you have an instance of one of the primary `common.graph` types (`Graph`,
 `ValueGraph`, and `Network`):

 <pre>`someGraphAlgorithm(startNode, graph);
 `</pre>

 This works because those types each implement `PredecessorsFunction`. It will also work
 with any other implementation of this interface.

 <p>If you have your own graph implementation based around a custom node type `MyNode`,
 which has a method `getParents()` that retrieves its predecessors in a graph:

 <pre>`someGraphAlgorithm(startNode, MyNode::getParents);
 `</pre>

 <p>If you have some other mechanism for returning the predecessors of a node, or one that doesn't
 return a `Iterable<? extends N>`, then you can use a lambda to perform a more general
 transformation:

 <pre>`someGraphAlgorithm(startNode, node -> ImmutableList.of(node.mother(), node.father()));
 `</pre>

 <p>Graph algorithms that need additional capabilities (accessing both predecessors and
 successors, iterating over the edges, etc.) should declare their input to be of a type that
 provides those capabilities, such as `Graph`, `ValueGraph`, or `Network`.

 <h3>Additional documentation</h3>

 <p>See the Guava User Guide for the `common.graph` package (<a href="https://github.com/google/guava/wiki/GraphsExplained">"Graphs Explained"</a>) for
 additional documentation, including <a href="https://github.com/google/guava/wiki/GraphsExplained#notes-for-implementors">notes for
 implementors</a>
**Author:** Joshua O'Madadhain
**Author:** Jens Nyman
@param <N> Node parameter type
**Since:** 23.0

## Methods

### `predecessors(`N` node)`

**Returns:** `java.lang.Iterable<? extends N>`

Returns all nodes in this graph adjacent to `node` which can be reached by traversing
 `node`'s incoming edges <i>against</i> the direction (if any) of the edge.

 <p>Some algorithms that operate on a `PredecessorsFunction` may produce undesired results
 if the returned `Iterable` contains duplicate elements. Implementations of such
 algorithms should document their behavior in the presence of duplicates.

 <p>The elements of the returned `Iterable` must each be:

 <ul>
   <li>Non-null
   <li>Usable as `Map` keys (see the Guava User Guide's section on <a href="https://github.com/google/guava/wiki/GraphsExplained#graph-elements-nodes-and-edges">
       graph elements</a> for details)
 </ul>
@throws IllegalArgumentException if `node` is not an element of this graph

