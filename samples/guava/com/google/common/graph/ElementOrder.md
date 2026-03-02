# Class: `ElementOrder`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.ElementOrder`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Example usage:

 

```

 MutableGraph<Integer> graph =
     GraphBuilder.directed().nodeOrder(ElementOrder.<Integer>natural()).build();
 
```

## Fields

### `type`

**Type:** `com.google.common.graph.ElementOrder.Type`

### `comparator`

**Type:** `java.util.Comparator<T>`

## Constructors

### `<init>(ElementOrder.Type type, Comparator<T> comparator)`

**Parameters:**
- `type` (`com.google.common.graph.ElementOrder.Type`)
- `comparator` (`java.util.Comparator<T>`)

## Methods

### `unordered()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

### `stable()`

Some methods may have stronger guarantees.

 
This instance is only useful in combination with incidentEdgeOrder, e.g. 
 graphBuilder.incidentEdgeOrder(ElementOrder.stable()).

 In combination with incidentEdgeOrder

 
incidentEdgeOrder(ElementOrder.stable()) guarantees the ordering of the returned
 collections of the following methods:

 

   - For Graph and ValueGraph:
       

         - edges(): Stable order
         - adjacentNodes(node): Connecting edge insertion order
         - predecessors(node): Connecting edge insertion order
         - successors(node): Connecting edge insertion order
         - incidentEdges(node): Edge insertion order
       

   - For Network:
       

         - adjacentNodes(node): Stable order
         - predecessors(node): Connecting edge insertion order
         - successors(node): Connecting edge insertion order
         - incidentEdges(node): Stable order
         - inEdges(node): Edge insertion order
         - outEdges(node): Edge insertion order
         - adjacentEdges(edge): Stable order
         - edgesConnecting(nodeU, nodeV): Edge insertion order

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

### `insertion()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

### `natural()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

### `sorted(Comparator<S> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<S>`)

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

### `type()`

**Returns:** `com.google.common.graph.ElementOrder.Type`

### `comparator()`

**Returns:** `java.util.Comparator<T>`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `createMap(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `java.util.Map<K,V>`

### `cast()`

**Returns:** [`com.google.common.graph.ElementOrder<T1>`](./ElementOrder.md)

