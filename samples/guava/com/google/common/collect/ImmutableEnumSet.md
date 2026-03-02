# Class: `ImmutableEnumSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableEnumSet`

**Extends:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

## Type Parameters

- `E` extends `java.lang.Enum<E>`

## Description

## Fields

### `delegate`

**Type:** `java.util.EnumSet<E>`

### `hashCode`

**Type:** `int`

## Constructors

### `<init>(java.util.EnumSet<E> delegate)`

**Parameters:**
- `delegate` (`java.util.EnumSet<E>`)

## Methods

### `asImmutable(java.util.EnumSet<E> set)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

**Parameters:**
- `set` (`java.util.EnumSet<E>`)

### `isPartialView()`

**Returns:** `boolean`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `forEach(java.util.function.Consumer<? super E> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.Consumer<? super E>`)

### `size()`

**Returns:** `int`

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `containsAll(java.util.Collection<?> collection)`

**Returns:** `boolean`

**Parameters:**
- `collection` (`java.util.Collection<?>`)

### `isEmpty()`

**Returns:** `boolean`

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `isHashCodeFast()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

