# Interface: `PredecessorsFunction`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.PredecessorsFunction`

## Type Parameters

- `N` extends `java.lang.Object`

## Description

This interface is meant to be used as the type of a parameter to graph algorithms (such as
 topological sort) that only need a way of accessing the predecessors of a node in a graph.

 Usage

 Given an algorithm, for example:

 

```

 public <N> someGraphAlgorithm(N startNode, PredecessorsFunction<N> predecessorsFunction);
 
```


 you will invoke it depending on the graph representation you're using.

 
If you have an instance of one of the primary common.graph types (Graph,
 ValueGraph, and Network):

 

```

 someGraphAlgorithm(startNode, graph);
 
```


 This works because those types each implement PredecessorsFunction. It will also work
 with any other implementation of this interface.

 
If you have your own graph implementation based around a custom node type MyNode,
 which has a method getParents() that retrieves its predecessors in a graph:

 

```

 someGraphAlgorithm(startNode, MyNode::getParents);
 
```


 
If you have some other mechanism for returning the predecessors of a node, or one that doesn't
 return a Iterable<? extends N>, then you can use a lambda to perform a more general
 transformation:

 

```

 someGraphAlgorithm(startNode, node -> ImmutableList.of(node.mother(), node.father()));
 
```


 
Graph algorithms that need additional capabilities (accessing both predecessors and
 successors, iterating over the edges, etc.) should declare their input to be of a type that
 provides those capabilities, such as Graph, ValueGraph, or Network.

 Additional documentation

 
See the Guava User Guide for the common.graph package (["Graphs Explained"](https://github.com/google/guava/wiki/GraphsExplained)) for
 additional documentation, including [notes for
 implementors](https://github.com/google/guava/wiki/GraphsExplained#notes-for-implementors)

## Methods

### `predecessors(N node)`

Some algorithms that operate on a PredecessorsFunction may produce undesired results
 if the returned Iterable contains duplicate elements. Implementations of such
 algorithms should document their behavior in the presence of duplicates.

 
The elements of the returned Iterable must each be:

 

   - Non-null
   - Usable as Map keys (see the Guava User Guide's section on [
       graph elements](https://github.com/google/guava/wiki/GraphsExplained#graph-elements-nodes-and-edges) for details)

**Parameters:**
- `node` (`N`)

**Returns:** `java.lang.Iterable<? extends N>`

