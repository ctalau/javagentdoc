# Class: `ElementOrder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ElementOrder`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Used to represent the order of elements in a data structure that supports different options for
 iteration order guarantees.

 <p>Example usage:

 <pre>`MutableGraph<Integer> graph =
     GraphBuilder.directed().nodeOrder(ElementOrder.<Integer>natural()).build();
 `</pre>
**Author:** Joshua O'Madadhain
**Since:** 20.0

## Fields

### `type`

**Type:** [`com.google.common.graph.ElementOrder.Type`](ElementOrder/Type.md)

### `comparator`

**Type:** `java.util.Comparator<T>`

## Constructors

### `<init>([`com.google.common.graph.ElementOrder.Type`](ElementOrder/Type.md) type, `java.util.Comparator<T>` comparator)`

## Methods

### `unordered()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that no ordering is guaranteed.

### `stable()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that ordering is guaranteed to be always be the same across
 iterations, and across releases. Some methods may have stronger guarantees.

 <p>This instance is only useful in combination with `incidentEdgeOrder`, e.g. `graphBuilder.incidentEdgeOrder(ElementOrder.stable())`.

 <h3>In combination with `incidentEdgeOrder`</h3>

 <p>`incidentEdgeOrder(ElementOrder.stable())` guarantees the ordering of the returned
 collections of the following methods:

 <ul>
   <li>For `Graph` and `ValueGraph`:
       <ul>
         <li>`edges()`: Stable order
         <li>`adjacentNodes(node)`: Connecting edge insertion order
         <li>`predecessors(node)`: Connecting edge insertion order
         <li>`successors(node)`: Connecting edge insertion order
         <li>`incidentEdges(node)`: Edge insertion order
       </ul>
   <li>For `Network`:
       <ul>
         <li>`adjacentNodes(node)`: Stable order
         <li>`predecessors(node)`: Connecting edge insertion order
         <li>`successors(node)`: Connecting edge insertion order
         <li>`incidentEdges(node)`: Stable order
         <li>`inEdges(node)`: Edge insertion order
         <li>`outEdges(node)`: Edge insertion order
         <li>`adjacentEdges(edge)`: Stable order
         <li>`edgesConnecting(nodeU, nodeV)`: Edge insertion order
       </ul>
 </ul>
**Since:** 29.0

### `insertion()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that insertion ordering is guaranteed.

### `natural()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that the natural ordering of the elements is guaranteed.

### `sorted(`java.util.Comparator<S>` comparator)`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

Returns an instance which specifies that the ordering of the elements is guaranteed to be
 determined by `comparator`.

### `type()`

**Returns:** [`com.google.common.graph.ElementOrder.Type`](ElementOrder/Type.md)

Returns the type of ordering used.

### `comparator()`

**Returns:** `java.util.Comparator<T>`

Returns the `Comparator` used.
@throws UnsupportedOperationException if comparator is not defined

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `createMap(`int` expectedSize)`

**Returns:** `java.util.Map<K,V>`

Returns an empty mutable map whose keys will respect this `ElementOrder`.

### `cast()`

**Returns:** [`com.google.common.graph.ElementOrder<T1>`](./ElementOrder.md)

