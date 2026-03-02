# Class: `ReverseNaturalOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ReverseNaturalOrdering`

**Extends:** [`com.google.common.collect.Ordering<java.lang.Comparable<?>>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Description

## Fields

### `INSTANCE`

**Type:** [`com.google.common.collect.ReverseNaturalOrdering`](./ReverseNaturalOrdering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `compare(java.lang.Comparable<?> left, java.lang.Comparable<?> right)`

**Returns:** `int`

**Parameters:**
- `left` (`java.lang.Comparable<?>`)
- `right` (`java.lang.Comparable<?>`)

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `min(E a, E b)`

**Returns:** `E`

**Parameters:**
- `a` (`E`)
- `b` (`E`)

### `min(E a, E b, E c, E[] rest)`

**Returns:** `E`

**Parameters:**
- `a` (`E`)
- `b` (`E`)
- `c` (`E`)
- `rest` (`E[]`)

### `min(java.util.Iterator<E> iterator)`

**Returns:** `E`

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)

### `min(java.lang.Iterable<E> iterable)`

**Returns:** `E`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

### `max(E a, E b)`

**Returns:** `E`

**Parameters:**
- `a` (`E`)
- `b` (`E`)

### `max(E a, E b, E c, E[] rest)`

**Returns:** `E`

**Parameters:**
- `a` (`E`)
- `b` (`E`)
- `c` (`E`)
- `rest` (`E[]`)

### `max(java.util.Iterator<E> iterator)`

**Returns:** `E`

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)

### `max(java.lang.Iterable<E> iterable)`

**Returns:** `E`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

### `readResolve()`

**Returns:** `java.lang.Object`

### `toString()`

**Returns:** `java.lang.String`

