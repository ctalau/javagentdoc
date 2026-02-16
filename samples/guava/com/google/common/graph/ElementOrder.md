# Class: `ElementOrder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ElementOrder`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Used to represent the order of elements in a data structure that supports different options for
 iteration order guarantees.

 <p>Example usage:

 <pre>{@code
 MutableGraph<Integer> graph =
     GraphBuilder.directed().nodeOrder(ElementOrder.<Integer>natural()).build();
 }</pre>
@author Joshua O'Madadhain
@since 20.0

## Fields

### `type`

**Type:** [`com.google.common.graph.ElementOrder.Type`](ElementOrder/Type.md)

### `comparator`

**Type:** [`java.util.Comparator<T>`](../../../../java/util/Comparator.md)

## Constructors

### `<init>([`com.google.common.graph.ElementOrder.Type`](ElementOrder/Type.md) type, [`java.util.Comparator<T>`](../../../../java/util/Comparator.md) comparator)`

## Methods

### `unordered()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that no ordering is guaranteed.

### `stable()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that ordering is guaranteed to be always be the same across
 iterations, and across releases. Some methods may have stronger guarantees.

 <p>This instance is only useful in combination with {@code incidentEdgeOrder}, e.g. {@code
 graphBuilder.incidentEdgeOrder(ElementOrder.stable())}.

 <h3>In combination with {@code incidentEdgeOrder}</h3>

 <p>{@code incidentEdgeOrder(ElementOrder.stable())} guarantees the ordering of the returned
 collections of the following methods:

 <ul>
   <li>For {@link Graph} and {@link ValueGraph}:
       <ul>
         <li>{@code edges()}: Stable order
         <li>{@code adjacentNodes(node)}: Connecting edge insertion order
         <li>{@code predecessors(node)}: Connecting edge insertion order
         <li>{@code successors(node)}: Connecting edge insertion order
         <li>{@code incidentEdges(node)}: Edge insertion order
       </ul>
   <li>For {@link Network}:
       <ul>
         <li>{@code adjacentNodes(node)}: Stable order
         <li>{@code predecessors(node)}: Connecting edge insertion order
         <li>{@code successors(node)}: Connecting edge insertion order
         <li>{@code incidentEdges(node)}: Stable order
         <li>{@code inEdges(node)}: Edge insertion order
         <li>{@code outEdges(node)}: Edge insertion order
         <li>{@code adjacentEdges(edge)}: Stable order
         <li>{@code edgesConnecting(nodeU, nodeV)}: Edge insertion order
       </ul>
 </ul>
@since 29.0

### `insertion()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that insertion ordering is guaranteed.

### `natural()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that the natural ordering of the elements is guaranteed.

### `sorted([`java.util.Comparator<S>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that the ordering of the elements is guaranteed to be
 determined by {@code comparator}.

### `type()`

**Returns:** [`com.google.common.graph.ElementOrder.Type`](ElementOrder/Type.md)

Returns the type of ordering used.

### `comparator()`

**Returns:** [`java.util.Comparator<T>`](../../../../java/util/Comparator.md)

Returns the {@link Comparator} used.
@throws UnsupportedOperationException if comparator is not defined

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `createMap(`int` expectedSize)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Returns an empty mutable map whose keys will respect this {@link ElementOrder}.

### `cast()`

**Returns:** [`com.google.common.graph.ElementOrder<T1>`](./ElementOrder.md)

