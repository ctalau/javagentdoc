# Class: `AbstractGraphBuilder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.AbstractGraphBuilder`

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A base class for builders that construct graphs with user-defined properties.
**Author:** James Sexton

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

### `<init>(`boolean` directed)`

Creates a new instance with the specified edge directionality.
@param directed if true, creates an instance for graphs whose edges are each directed; if
     false, creates an instance for graphs whose edges are each undirected.

