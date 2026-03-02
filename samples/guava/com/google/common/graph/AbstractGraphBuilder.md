# Class: `AbstractGraphBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractGraphBuilder`

## Type Parameters

- `N` extends `java.lang.Object`

## Description

## Fields

### `directed`

**Type:** `boolean`

### `allowsSelfLoops`

**Type:** `boolean`

### `nodeOrder`

**Type:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `incidentEdgeOrder`

**Type:** [`com.google.common.graph.ElementOrder<N>`](./ElementOrder.md)

### `expectedNodeCount`

**Type:** [`com.google.common.base.Optional<java.lang.Integer>`](../base/Optional.md)

## Constructors

### `<init>(boolean directed)`

**Parameters:**
- `directed` (`boolean`): if true, creates an instance for graphs whose edges are each directed; if
     false, creates an instance for graphs whose edges are each undirected.

