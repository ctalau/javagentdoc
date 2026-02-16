# Class: `EndpointPairIterator`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.EndpointPairIterator`

**Extends:** [`com.google.common.collect.AbstractIterator<com.google.common.graph.EndpointPair<N>>`](../collect/AbstractIterator>.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A class to facilitate the set returned by {@link Graph#edges()}.
@author James Sexton

## Fields

### `graph`

**Type:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

### `nodeIterator`

**Type:** [`java.util.Iterator<N>`](../../../../java/util/Iterator.md)

### `node`

**Type:** [`N`](N.md)

### `successorIterator`

**Type:** [`java.util.Iterator<N>`](../../../../java/util/Iterator.md)

## Constructors

### `<init>([`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md) graph)`

## Methods

### `of([`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md) graph)`

**Returns:** [`com.google.common.graph.EndpointPairIterator<N>`](./EndpointPairIterator.md)

### `advance()`

**Returns:** `boolean`

Called after {@link #successorIterator} is exhausted. Advances {@link #node} to the next node
 and updates {@link #successorIterator} to iterate through the successors of {@link #node}.

