# Class: `EdgesConnecting`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.EdgesConnecting`

**Extends:** [`java.util.AbstractSet<E>`](../../../../java/util/AbstractSet.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A class to represent the set of edges connecting an (implicit) origin node to a target node.

 <p>The {@link #nodeToOutEdge} map means this class only works on networks without parallel edges.
 See {@link MultiEdgesConnecting} for a class that works with parallel edges.
@author James Sexton
@param <E> Edge parameter type

## Fields

### `nodeToOutEdge`

**Type:** [`java.util.Map<?,E>`](../../../../java/util/Map.md)

### `targetNode`

**Type:** `java.lang.Object`

## Constructors

### `<init>([`java.util.Map<?,E>`](../../../../java/util/Map.md) nodeToEdgeMap, `java.lang.Object` targetNode)`

## Methods

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](../collect/UnmodifiableIterator.md)

### `size()`

**Returns:** `int`

### `contains(`java.lang.Object` edge)`

**Returns:** `boolean`

### `getConnectingEdge()`

**Returns:** [`E`](E.md)

