# Class: `ImmutableEnumMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableEnumMap`

**Extends:** `com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K,V>`

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.Object`

## Description

## Fields

### `delegate`

**Type:** `java.util.EnumMap<K,V>`

## Constructors

### `<init>(java.util.EnumMap<K,V> delegate)`

**Parameters:**
- `delegate` (`java.util.EnumMap<K,V>`)

## Methods

### `asImmutable(java.util.EnumMap<K,V> map)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Parameters:**
- `map` (`java.util.EnumMap<K,V>`)

### `keyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<K>`](./UnmodifiableIterator.md)

### `keySpliterator()`

**Returns:** `java.util.Spliterator<K>`

### `size()`

**Returns:** `int`

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `entryIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator.md)

### `entrySpliterator()`

**Returns:** `java.util.Spliterator<java.util.Map.Entry<K,V>>`

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

