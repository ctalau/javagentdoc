# Class: `MultiEdgesConnecting`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MultiEdgesConnecting`

**Extends:** [`java.util.AbstractSet<E>`](../../../../java/util/AbstractSet.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A class to represent the set of edges connecting an (implicit) origin node to a target node.

 <p>The {@link #outEdgeToNode} map allows this class to work on networks with parallel edges. See
 {@link EdgesConnecting} for a class that is more efficient but forbids parallel edges.
@author James Sexton
@param <E> Edge parameter type

## Fields

### `outEdgeToNode`

**Type:** [`java.util.Map<E,?>`](../../../../java/util/Map.md)

### `targetNode`

**Type:** `java.lang.Object`

## Constructors

### `<init>([`java.util.Map<E,?>`](../../../../java/util/Map.md) outEdgeToNode, `java.lang.Object` targetNode)`

## Methods

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](../collect/UnmodifiableIterator.md)

### `contains(`java.lang.Object` edge)`

**Returns:** `boolean`

