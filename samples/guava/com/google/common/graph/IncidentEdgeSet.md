# Class: `IncidentEdgeSet`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.IncidentEdgeSet`

**Extends:** [`java.util.AbstractSet<com.google.common.graph.EndpointPair<N>>`](../../../../java/util/AbstractSet>.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

Abstract base class for an incident edges set that allows different implementations of {@link AbstractSet#iterator()}.

## Fields

### `node`

**Type:** [`N`](N.md)

### `graph`

**Type:** [`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md)

## Constructors

### `<init>([`com.google.common.graph.BaseGraph<N>`](./BaseGraph.md) graph, [`N`](N.md) node)`

## Methods

### `remove(`java.lang.Object` o)`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `contains(`java.lang.Object` obj)`

**Returns:** `boolean`

