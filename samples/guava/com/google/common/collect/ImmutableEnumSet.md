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

### `<init>(EnumSet<E> delegate)`

**Parameters:**
- `delegate` (`java.util.EnumSet<E>`)

## Methods

### `asImmutable(EnumSet<E> set)`

**Parameters:**
- `set` (`java.util.EnumSet<E>`)

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `isPartialView()`

**Returns:** `boolean`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `forEach(Consumer<? super E> action)`

**Parameters:**
- `action` (`java.util.function.Consumer<? super E>`)

**Returns:** `void`

### `size()`

**Returns:** `int`

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `containsAll(Collection<?> collection)`

**Parameters:**
- `collection` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `isHashCodeFast()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

