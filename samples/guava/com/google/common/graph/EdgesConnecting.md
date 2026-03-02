# Class: `EdgesConnecting`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.EdgesConnecting`

**Extends:** `java.util.AbstractSet<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

The #nodeToOutEdge map means this class only works on networks without parallel edges.
 See MultiEdgesConnecting for a class that works with parallel edges.

## Fields

### `nodeToOutEdge`

**Type:** `java.util.Map<?,E>`

### `targetNode`

**Type:** `java.lang.Object`

## Constructors

### `<init>(Map<?,E> nodeToEdgeMap, Object targetNode)`

**Parameters:**
- `nodeToEdgeMap` (`java.util.Map<?,E>`)
- `targetNode` (`java.lang.Object`)

## Methods

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](../collect/UnmodifiableIterator.md)

### `size()`

**Returns:** `int`

### `contains(Object edge)`

**Parameters:**
- `edge` (`java.lang.Object`)

**Returns:** `boolean`

### `getConnectingEdge()`

**Returns:** `E`

