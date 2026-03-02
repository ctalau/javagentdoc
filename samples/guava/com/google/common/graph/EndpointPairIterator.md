# Class: `EndpointPairIterator`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.EndpointPairIterator`

**Extends:** [`com.google.common.collect.AbstractIterator<com.google.common.graph.EndpointPair<N>>`](../collect/AbstractIterator.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

## Fields

### `graph`

**Type:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

### `nodeIterator`

**Type:** `java.util.Iterator<N>`

### `node`

**Type:** `N`

### `successorIterator`

**Type:** `java.util.Iterator<N>`

## Constructors

### `<init>(BaseGraph<N> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md))

## Methods

### `of(BaseGraph<N> graph)`

**Parameters:**
- `graph` ([`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md))

**Returns:** [`com.google.common.graph.EndpointPairIterator<N>`](./EndpointPairIterator.md)

### `advance()`

Advances #node to the next node
 and updates #successorIterator to iterate through the successors of #node.

**Returns:** `boolean`

