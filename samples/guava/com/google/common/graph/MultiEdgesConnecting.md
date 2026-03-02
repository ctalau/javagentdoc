# Class: `MultiEdgesConnecting`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MultiEdgesConnecting`

**Extends:** `java.util.AbstractSet<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

The #outEdgeToNode map allows this class to work on networks with parallel edges. See
 EdgesConnecting for a class that is more efficient but forbids parallel edges.

## Fields

### `outEdgeToNode`

**Type:** `java.util.Map<E,?>`

### `targetNode`

**Type:** `java.lang.Object`

## Constructors

### `<init>(Map<E,?> outEdgeToNode, Object targetNode)`

**Parameters:**
- `outEdgeToNode` (`java.util.Map<E,?>`)
- `targetNode` (`java.lang.Object`)

## Methods

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](../collect/UnmodifiableIterator.md)

### `contains(Object edge)`

**Parameters:**
- `edge` (`java.lang.Object`)

**Returns:** `boolean`

