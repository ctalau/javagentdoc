# Class: `ImmutableMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMultimap`

**Extends:** [`com.google.common.collect.BaseImmutableMultimap<K,V>`](./BaseImmutableMultimap.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A `Multimap` whose contents will never change, with many other important properties
 detailed at `ImmutableCollection`.

 <p><b>Warning:</b> avoid <i>direct</i> usage of `ImmutableMultimap` as a type (as with
 `Multimap` itself). Prefer subtypes such as `ImmutableSetMultimap` or `ImmutableListMultimap`, which have well-defined `equals` semantics, thus avoiding a common
 source of bugs and confusion.

 <p><b>Note:</b> every `ImmutableMultimap` offers an `inverse` view, so there is no
 need for a distinct `ImmutableBiMultimap` type.

 <p><a id="iteration"></a>

 <p><b>Key-grouped iteration.</b> All view collections follow the same iteration order. In all
 current implementations, the iteration order always keeps multiple entries with the same key
 together. Any creation method that would customarily respect insertion order (such as `copyOf(Multimap)`) instead preserves key-grouped order by inserting entries for an existing key
 immediately after the last entry having that key.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**Author:** Jared Levy
**Since:** 2.0

## Fields

### `map`

**Type:** [`com.google.common.collect.ImmutableMap<K,? extends com.google.common.collect.ImmutableCollection<V>>`](./ImmutableMap>.md)

### `size`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.ImmutableMap<K,? extends com.google.common.collect.ImmutableCollection<V>>`](./ImmutableMap>.md) map, `int` size)`

## Methods

### `of()`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Returns an empty multimap.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`K` k1, `V` v1)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Returns an immutable multimap containing a single entry.

### `of(`K` k1, `V` v1, `K` k2, `V` v2)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Returns an immutable multimap containing the given entries, in order.

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Returns an immutable multimap containing the given entries, in the "key-grouped" insertion
 order described in the <a href="#iteration">class documentation</a>.

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Returns an immutable multimap containing the given entries, in the "key-grouped" insertion
 order described in the <a href="#iteration">class documentation</a>.

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Returns an immutable multimap containing the given entries, in the "key-grouped" insertion
 order described in the <a href="#iteration">class documentation</a>.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableMultimap.Builder<K,V>`](ImmutableMultimap/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the `Builder` constructor.

### `copyOf([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Returns an immutable multimap containing the same mappings as `multimap`, in the
 "key-grouped" iteration order described in the class documentation.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if any key or value in `multimap` is null

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Returns an immutable multimap containing the specified entries. The returned multimap iterates
 over keys in the order they were first encountered in the input, and the values for each key
 are iterated in the order they were encountered.
@throws NullPointerException if any key, value, or entry is null
**Since:** 19.0

### `removeAll(`java.lang.Object` key)`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `replaceValues(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `clear()`

**Returns:** `void`

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `get(`K` key)`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

Returns an immutable collection of the values for the given key. If no mappings in the multimap
 have the provided key, an empty immutable collection is returned. The values are in the same
 order as the parameters used to build this multimap.

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableMultimap<V,K>`](./ImmutableMultimap.md)

Returns an immutable multimap which is the inverse of this one. For every key-value mapping in
 the original, the result will have a mapping with key and value reversed.
**Since:** 11.0

### `put(`K` key, `V` value)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `putAll(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `putAll([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `isPartialView()`

**Returns:** `boolean`

Returns `true` if this immutable multimap's implementation contains references to
 user-created objects that aren't accessible via this multimap's methods. This is generally used
 to determine whether `copyOf` implementations should make an explicit copy to avoid
 memory leaks.

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `keySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

Returns an immutable set of the distinct keys in this multimap, in the same order as they
 appear in this multimap.

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `asMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<K,java.util.Collection<V>>`](./ImmutableMap>.md)

Returns an immutable map that associates each key with its corresponding values in the
 multimap. Keys and values appear in the same order as in this multimap.

### `createAsMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `entries()`

**Returns:** [`com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K,V>>`](./ImmutableCollection>.md)

Returns an immutable collection of all key-value pairs in the multimap.

### `createEntries()`

**Returns:** [`com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K,V>>`](./ImmutableCollection>.md)

### `entryIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator>.md)

### `entrySpliterator()`

**Returns:** `java.util.Spliterator<java.util.Map.Entry<K,V>>`

### `forEach(`java.util.function.BiConsumer<? super K,? super V>` action)`

**Returns:** `void`

### `keys()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<K>`](./ImmutableMultiset.md)

Returns an immutable multiset containing all the keys in this multimap, in the same order and
 with the same frequencies as they appear in this multimap; to get only a single occurrence of
 each key, use `keySet`.

### `createKeys()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<K>`](./ImmutableMultiset.md)

### `values()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

Returns an immutable collection of the values in this multimap. Its iterator traverses the
 values for the first key, the values for the second key, and so on.

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `valueIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<V>`](./UnmodifiableIterator.md)

