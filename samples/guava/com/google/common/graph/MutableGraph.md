# Interface: `MutableGraph`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MutableGraph`

**Extends:** [`com.google.common.graph.Graph<N>`](./Graph.md)

## Type Parameters

- `N` extends `java.lang.Object`

## Description

A subinterface of {@link Graph} which adds mutation methods. When mutation is not required, users
 should prefer the {@link Graph} interface.
@author James Sexton
@author Joshua O'Madadhain
@param <N> Node parameter type
@since 20.0

## Methods

### `addNode([`N`](N.md) node)`

**Returns:** `boolean`

Adds {@code node} if it is not already present.

 <p><b>Nodes must be unique</b>, just as {@code Map} keys must be. They must also be non-null.
@return {@code true} if the graph was modified as a result of this call

### `putEdge([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** `boolean`

Adds an edge connecting {@code nodeU} to {@code nodeV} if one is not already present.

 <p>If the graph is directed, the resultant edge will be directed; otherwise, it will be
 undirected.

 <p>If {@code nodeU} and {@code nodeV} are not already present in this graph, this method will
 silently {@link #addNode(Object) add} {@code nodeU} and {@code nodeV} to the graph.
@return {@code true} if the graph was modified as a result of this call
@throws IllegalArgumentException if the introduction of the edge would violate {@link #allowsSelfLoops()}

### `putEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

Adds an edge connecting {@code endpoints} (in the order, if any, specified by {@code
 endpoints}) if one is not already present.

 <p>If this graph is directed, {@code endpoints} must be ordered and the added edge will be
 directed; if it is undirected, the added edge will be undirected.

 <p>If this graph is directed, {@code endpoints} must be ordered.

 <p>If either or both endpoints are not already present in this graph, this method will silently
 {@link #addNode(Object) add} each missing endpoint to the graph.
@return {@code true} if the graph was modified as a result of this call
@throws IllegalArgumentException if the introduction of the edge would violate {@link #allowsSelfLoops()}
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
@since 27.1

### `removeNode([`N`](N.md) node)`

**Returns:** `boolean`

Removes {@code node} if it is present; all edges incident to {@code node} will also be removed.
@return {@code true} if the graph was modified as a result of this call

### `removeEdge([`N`](N.md) nodeU, [`N`](N.md) nodeV)`

**Returns:** `boolean`

Removes the edge connecting {@code nodeU} to {@code nodeV}, if it is present.
@return {@code true} if the graph was modified as a result of this call

### `removeEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints)`

**Returns:** `boolean`

Removes the edge connecting {@code endpoints}, if it is present.

 <p>If this graph is directed, {@code endpoints} must be ordered.
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
@return {@code true} if the graph was modified as a result of this call
@since 27.1

