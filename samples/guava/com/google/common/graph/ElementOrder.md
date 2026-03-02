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

### `<init>(com.google.common.graph.ElementOrder.Type type, java.util.Comparator<T> comparator)`

**Parameters:**
- `type` (`com.google.common.graph.ElementOrder.Type`)
- `comparator` (`java.util.Comparator<T>`)

## Methods

### `unordered()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

### `stable()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

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

### `insertion()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

### `natural()`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

### `sorted(java.util.Comparator<S> comparator)`

**Returns:** [`com.google.common.graph.ElementOrder<S>`](./ElementOrder.md)

**Parameters:**
- `comparator` (`java.util.Comparator<S>`)

### `type()`

**Returns:** `com.google.common.graph.ElementOrder.Type`

### `comparator()`

**Returns:** `java.util.Comparator<T>`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `createMap(int expectedSize)`

**Returns:** `java.util.Map<K,V>`

**Parameters:**
- `expectedSize` (`int`)

### `cast()`

**Returns:** [`com.google.common.graph.ElementOrder<T1>`](./ElementOrder.md)

