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

### `<init>(EnumMap<K,V> delegate)`

**Parameters:**
- `delegate` (`java.util.EnumMap<K,V>`)

## Methods

### `asImmutable(EnumMap<K,V> map)`

**Parameters:**
- `map` (`java.util.EnumMap<K,V>`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `keyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<K>`](./UnmodifiableIterator.md)

### `keySpliterator()`

**Returns:** `java.util.Spliterator<K>`

### `size()`

**Returns:** `int`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `entryIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator.md)

### `entrySpliterator()`

**Returns:** `java.util.Spliterator<java.util.Map.Entry<K,V>>`

### `forEach(BiConsumer<? super K,? super V> action)`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

**Returns:** `void`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

