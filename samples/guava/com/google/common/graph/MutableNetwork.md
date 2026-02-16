# Interface: `MutableNetwork`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MutableNetwork`

**Extends:** [`com.google.common.graph.Network<N,E>`](./Network.md)

## Type Parameters

- `N` extends `java.lang.Object`
- `E` extends `java.lang.Object`

## Description

A subinterface of {@link Network} which adds mutation methods. When mutation is not required,
 users should prefer the {@link Network} interface.
@author James Sexton
@author Joshua O'Madadhain
@param <N> Node parameter type
@param <E> Edge parameter type
@since 20.0

## Methods

### `addNode([`N`](N.md) node)`

**Returns:** `boolean`

Adds {@code node} if it is not already present.

 <p><b>Nodes must be unique</b>, just as {@code Map} keys must be. They must also be non-null.
@return {@code true} if the network was modified as a result of this call

### `addEdge([`N`](N.md) nodeU, [`N`](N.md) nodeV, [`E`](E.md) edge)`

**Returns:** `boolean`

Adds {@code edge} connecting {@code nodeU} to {@code nodeV}.

 <p>If the graph is directed, {@code edge} will be directed in this graph; otherwise, it will be
 undirected.

 <p><b>{@code edge} must be unique to this graph</b>, just as a {@code Map} key must be. It must
 also be non-null.

 <p>If {@code nodeU} and {@code nodeV} are not already present in this graph, this method will
 silently {@link #addNode(Object) add} {@code nodeU} and {@code nodeV} to the graph.

 <p>If {@code edge} already connects {@code nodeU} to {@code nodeV} (in the specified order if
 this network {@link #isDirected()}, else in any order), then this method will have no effect.
@return {@code true} if the network was modified as a result of this call
@throws IllegalArgumentException if {@code edge} already exists in the graph and does not
     connect {@code nodeU} to {@code nodeV}
@throws IllegalArgumentException if the introduction of the edge would violate {@link #allowsParallelEdges()} or {@link #allowsSelfLoops()}

### `addEdge([`com.google.common.graph.EndpointPair<N>`](./EndpointPair.md) endpoints, [`E`](E.md) edge)`

**Returns:** `boolean`

Adds {@code edge} connecting {@code endpoints}. In an undirected network, {@code edge} will
 also connect {@code nodeV} to {@code nodeU}.

 <p>If this graph is directed, {@code edge} will be directed in this graph; if it is undirected,
 {@code edge} will be undirected in this graph.

 <p>If this graph is directed, {@code endpoints} must be ordered.

 <p><b>{@code edge} must be unique to this graph</b>, just as a {@code Map} key must be. It must
 also be non-null.

 <p>If either or both endpoints are not already present in this graph, this method will silently
 {@link #addNode(Object) add} each missing endpoint to the graph.

 <p>If {@code edge} already connects an endpoint pair equal to {@code endpoints}, then this
 method will have no effect.
@return {@code true} if the network was modified as a result of this call
@throws IllegalArgumentException if {@code edge} already exists in the graph and connects some
     other endpoint pair that is not equal to {@code endpoints}
@throws IllegalArgumentException if the introduction of the edge would violate {@link #allowsParallelEdges()} or {@link #allowsSelfLoops()}
@throws IllegalArgumentException if the endpoints are unordered and the graph is directed
@since 27.1

### `removeNode([`N`](N.md) node)`

**Returns:** `boolean`

Removes {@code node} if it is present; all edges incident to {@code node} will also be removed.
@return {@code true} if the network was modified as a result of this call

### `removeEdge([`E`](E.md) edge)`

**Returns:** `boolean`

Removes {@code edge} from this network, if it is present.
@return {@code true} if the network was modified as a result of this call

