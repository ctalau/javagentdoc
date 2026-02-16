# Class: `MultiEdgesConnecting`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MultiEdgesConnecting`

**Extends:** `java.util.AbstractSet<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A class to represent the set of edges connecting an (implicit) origin node to a target node.

 <p>The `outEdgeToNode` map allows this class to work on networks with parallel edges. See
 `EdgesConnecting` for a class that is more efficient but forbids parallel edges.
**Author:** James Sexton
@param <E> Edge parameter type

## Fields

### `outEdgeToNode`

**Type:** `java.util.Map<E,?>`

### `targetNode`

**Type:** `java.lang.Object`

## Constructors

### `<init>(`java.util.Map<E,?>` outEdgeToNode, `java.lang.Object` targetNode)`

## Methods

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](../collect/UnmodifiableIterator.md)

### `contains(`java.lang.Object` edge)`

**Returns:** `boolean`

