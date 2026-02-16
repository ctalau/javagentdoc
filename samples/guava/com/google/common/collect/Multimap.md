# Interface: `Multimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Multimap`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A collection that maps keys to values, similar to `Map`, but in which each key may be
 associated with <i>multiple</i> values. You can visualize the contents of a multimap either as a
 map from keys to <i>nonempty</i> collections of values:

 <ul>
   <li>a \u2192 1, 2
   <li>b \u2192 3
 </ul>

 ... or as a single "flattened" collection of key-value pairs:

 <ul>
   <li>a \u2192 1
   <li>a \u2192 2
   <li>b \u2192 3
 </ul>

 <p><b>Important:</b> although the first interpretation resembles how most multimaps are
 <i>implemented</i>, the design of the `Multimap` API is based on the <i>second</i> form.
 So, using the multimap shown above as an example, the `size` is `3`, not `2`,
 and the `values` collection is `[1, 2, 3]`, not `[[1, 2], [3]]`. For those
 times when the first style is more useful, use the multimap's `asMap` view (or create a
 `Map<K, Collection<V>>` in the first place).

 <h3>Example</h3>

 <p>The following code:

 <pre>`ListMultimap<String, String> multimap = ArrayListMultimap.create();
 for (President pres : US_PRESIDENTS_IN_ORDER) {
   multimap.put(pres.firstName(), pres.lastName());
 `
 for (String firstName : multimap.keySet()) {
   List<String> lastNames = multimap.get(firstName);
   out.println(firstName + ": " + lastNames);
 }
 }</pre>

 ... produces output such as:

 <pre>`Zachary: [Taylor]
 John: [Adams, Adams, Tyler, Kennedy]  // Remember, Quincy!
 George: [Washington, Bush, Bush]
 Grover: [Cleveland, Cleveland]        // Two, non-consecutive terms, rep'ing NJ!
 ...
 `</pre>

 <h3>Views</h3>

 <p>Much of the power of the multimap API comes from the <i>view collections</i> it provides.
 These always reflect the latest state of the multimap itself. When they support modification, the
 changes are <i>write-through</i> (they automatically update the backing multimap). These view
 collections are:

 <ul>
   <li>`asMap`, mentioned above
   <li>`keys`, `keySet`, `values`, `entries`, which are similar to the
       corresponding view collections of `Map`
   <li>and, notably, even the collection returned by `get get(key)` is an active view of
       the values corresponding to `key`
 </ul>

 <p>The collections returned by the `replaceValues replaceValues` and `removeAll removeAll` methods, which contain values that have just been removed from the multimap, are
 naturally <i>not</i> views.

 <h3>Subinterfaces</h3>

 <p>Instead of using the `Multimap` interface directly, prefer the subinterfaces `ListMultimap` and `SetMultimap`. These take their names from the fact that the collections
 they return from `get` behave like (and, of course, implement) `List` and `Set`, respectively.

 <p>For example, the "presidents" code snippet above used a `ListMultimap`; if it had used a
 `SetMultimap` instead, two presidents would have vanished, and last names might or might
 not appear in chronological order.

 <p><b>Warning:</b> instances of type `Multimap` may not implement `Object.equals` in
 the way you expect. Multimaps containing the same key-value pairs, even in the same order, may or
 may not be equal and may or may not have the same `hashCode`. The recommended subinterfaces
 provide much stronger guarantees.

 <h3>Comparison to a map of collections</h3>

 <p>Multimaps are commonly used in places where a `Map<K, Collection<V>>` would otherwise
 have appeared. The differences include:

 <ul>
   <li>There is no need to populate an empty collection before adding an entry with `put put`.
   <li>`get` never returns `null`, only an empty collection.
   <li>A key is contained in the multimap if and only if it maps to at least one value. Any
       operation that causes a key to have zero associated values has the effect of
       <i>removing</i> that key from the multimap.
   <li>The total entry count is available as `size`.
   <li>Many complex operations become easier; for example, `Collections.min(multimap.values())` finds the smallest value across all keys.
 </ul>

 <h3>Implementations</h3>

 <ul>
   <li>`ImmutableListMultimap`
   <li>`ImmutableSetMultimap`
   <li>Configure your own mutable multimap with `MultimapBuilder`
   <li>`LinkedListMultimap` (for one unusual kind of mutable `Multimap`)
 </ul>

 Guava contains a number of other multimap implementations, such as `ArrayListMultimap`. In
 new code, we recommend using `MultimapBuilder` instead: It provides better control of how
 keys and values are stored.

 <h3>Other Notes</h3>

 <p>As with `Map`, the behavior of a `Multimap` is not specified if key objects
 already present in the multimap change in a manner that affects `equals` comparisons. Use
 caution if mutable objects are used as keys in a `Multimap`.

 <p>All methods that modify the multimap are optional. The view collections returned by the
 multimap may or may not be modifiable. Any modification method that is not supported will throw
 `UnsupportedOperationException`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap">`Multimap`</a>.
**Author:** Jared Levy
**Since:** 2.0

## Methods

### `size()`

**Returns:** `int`

Returns the number of key-value pairs in this multimap.

 <p><b>Note:</b> this method does not return the number of <i>distinct keys</i> in the multimap,
 which is given by `keySet().size()` or `asMap().size()`. See the opening section of
 the `Multimap` class documentation for clarification.

### `isEmpty()`

**Returns:** `boolean`

Returns `true` if this multimap contains no key-value pairs. Equivalent to `size()
 == 0`, but can in some cases be more efficient.

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

Returns `true` if this multimap contains at least one key-value pair with the key `key`.

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

Returns `true` if this multimap contains at least one key-value pair with the value
 `value`.

### `containsEntry(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

Returns `true` if this multimap contains at least one key-value pair with the key `key` and the value `value`.

### `put(`K` key, `V` value)`

**Returns:** `boolean`

Stores a key-value pair in this multimap.

 <p>Some multimap implementations allow duplicate key-value pairs, in which case `put`
 always adds a new key-value pair and increases the multimap size by 1. Other implementations
 prohibit duplicates, and storing a key-value pair that's already in the multimap has no effect.
@return `true` if the method increased the size of the multimap, or `false` if the
     multimap already contained the key-value pair and doesn't allow duplicates

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

Removes a single key-value pair with the key `key` and the value `value` from this
 multimap, if such exists. If multiple key-value pairs in the multimap fit this description,
 which one is removed is unspecified.
@return `true` if the multimap changed

### `putAll(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `boolean`

Stores a key-value pair in this multimap for each of `values`, all using the same key,
 `key`. Equivalent to (but expected to be more efficient than):

 <pre>`for (V value : values) {
   put(key, value);
 `
 }</pre>

 <p>In particular, this is a no-op if `values` is empty.
@return `true` if the multimap changed

### `putAll([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** `boolean`

Stores all key-value pairs of `multimap` in this multimap, in the order returned by
 `multimap.entries()`.
@return `true` if the multimap changed

### `replaceValues(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `java.util.Collection<V>`

Stores a collection of values with the same key, replacing any existing values for that key.

 <p>If `values` is empty, this is equivalent to `removeAll(Object) removeAll(key)`.
@return the collection of replaced values, or an empty collection if no values were previously
     associated with the key. The collection <i>may</i> be modifiable, but updating it will have
     no effect on the multimap.

### `removeAll(`java.lang.Object` key)`

**Returns:** `java.util.Collection<V>`

Removes all values associated with the key `key`.

 <p>Once this method returns, `key` will not be mapped to any values, so it will not
 appear in `keySet()`, `asMap()`, or any other views.
@return the values that were removed (possibly empty). The returned collection <i>may</i> be
     modifiable, but updating it will have no effect on the multimap.

### `clear()`

**Returns:** `void`

Removes all key-value pairs from the multimap, leaving it empty.

### `get(`K` key)`

**Returns:** `java.util.Collection<V>`

Returns a view collection of the values associated with `key` in this multimap, if any.
 Note that when `containsKey(key)` is false, this returns an empty collection, not `null`.

 <p>Changes to the returned collection will update the underlying multimap, and vice versa.

### `keySet()`

**Returns:** `java.util.Set<K>`

Returns a view collection of all <i>distinct</i> keys contained in this multimap. Note that the
 key set contains a key if and only if this multimap maps that key to at least one value.

 <p>Changes to the returned set will update the underlying multimap, and vice versa. However,
 <i>adding</i> to the returned set is not possible.

### `keys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

Returns a view collection containing the key from each key-value pair in this multimap,
 <i>without</i> collapsing duplicates. This collection has the same size as this multimap, and
 `keys().count(k) == get(k).size()` for all `k`.

 <p>Changes to the returned multiset will update the underlying multimap, and vice versa.
 However, <i>adding</i> to the returned collection is not possible.

### `values()`

**Returns:** `java.util.Collection<V>`

Returns a view collection containing the <i>value</i> from each key-value pair contained in
 this multimap, without collapsing duplicates (so `values().size() == size()`).

 <p>Changes to the returned collection will update the underlying multimap, and vice versa.
 However, <i>adding</i> to the returned collection is not possible.

### `entries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

Returns a view collection of all key-value pairs contained in this multimap, as `Entry`
 instances.

 <p>Changes to the returned collection or the entries it contains will update the underlying
 multimap, and vice versa. However, <i>adding</i> to the returned collection is not possible.

### `forEach(`java.util.function.BiConsumer<? super K,? super V>` action)`

**Returns:** `void`

Performs the given action for all key-value pairs contained in this multimap. If an ordering is
 specified by the `Multimap` implementation, actions will be performed in the order of
 iteration of `entries()`. Exceptions thrown by the action are relayed to the caller.

 <p>To loop over all keys and their associated value collections, write `Multimaps.asMap(multimap).forEach((key, valueCollection) -> action())`.
**Since:** 21.0

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

Returns a view of this multimap as a `Map` from each distinct key to the nonempty
 collection of that key's associated values. Note that `this.asMap().get(k)` is equivalent
 to `this.get(k)` only when `k` is a key contained in the multimap; otherwise it
 returns `null` as opposed to an empty collection.

 <p>Changes to the returned map or the collections that serve as its values will update the
 underlying multimap, and vice versa. The map does not support `put` or `putAll`,
 nor do its entries support `Entry.setValue setValue`.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Compares the specified object with this multimap for equality. Two multimaps are equal when
 their map views, as returned by `asMap`, are also equal.

 <p>In general, two multimaps with identical key-value mappings may or may not be equal,
 depending on the implementation. For example, two `SetMultimap` instances with the same
 key-value mappings are equal, but equality of two `ListMultimap` instances depends on the
 ordering of the values for each key.

 <p>A non-empty `SetMultimap` cannot be equal to a non-empty `ListMultimap`, since
 their `asMap` views contain unequal collections as values. However, any two empty
 multimaps are equal, because they both have empty `asMap` views.

### `hashCode()`

**Returns:** `int`

Returns the hash code for this multimap.

 <p>The hash code of a multimap is defined as the hash code of the map view, as returned by
 `Multimap.asMap`.

 <p>In general, two multimaps with identical key-value mappings may or may not have the same
 hash codes, depending on the implementation. For example, two `SetMultimap` instances
 with the same key-value mappings will have the same `hashCode`, but the `hashCode`
 of `ListMultimap` instances depends on the ordering of the values for each key.

