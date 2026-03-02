# Interface: `Multimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Multimap`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

You can visualize the contents of a multimap either as a
 map from keys to *nonempty* collections of values:

 

   - a → 1, 2
   - b → 3
 


 ... or as a single "flattened" collection of key-value pairs:

 

   - a → 1
   - a → 2
   - b → 3
 


 
**Important:** although the first interpretation resembles how most multimaps are
 *implemented*, the design of the Multimap API is based on the *second* form.
 So, using the multimap shown above as an example, the #size is 3, not 2,
 and the #values collection is [1, 2, 3], not [[1, 2], [3]]. For those
 times when the first style is more useful, use the multimap's #asMap view (or create a
 Map<K, Collection<V>> in the first place).

 Example

 
The following code:

 

```

 ListMultimap<String, String> multimap = ArrayListMultimap.create();
 for (President pres : US_PRESIDENTS_IN_ORDER) {
   multimap.put(pres.firstName(), pres.lastName());
 }
 for (String firstName : multimap.keySet()) {
   List<String> lastNames = multimap.get(firstName);
   out.println(firstName + ": " + lastNames);
 }
 
```


 ... produces output such as:

 

```

 Zachary: [Taylor]
 John: [Adams, Adams, Tyler, Kennedy]  // Remember, Quincy!
 George: [Washington, Bush, Bush]
 Grover: [Cleveland, Cleveland]        // Two, non-consecutive terms, rep'ing NJ!
 ...
 
```


 Views

 
Much of the power of the multimap API comes from the *view collections* it provides.
 These always reflect the latest state of the multimap itself. When they support modification, the
 changes are *write-through* (they automatically update the backing multimap). These view
 collections are:

 

   - #asMap, mentioned above
   - #keys, #keySet, #values, #entries, which are similar to the
       corresponding view collections of Map
   - and, notably, even the collection returned by get(key) is an active view of
       the values corresponding to key
 


 
The collections returned by the replaceValues and removeAll methods, which contain values that have just been removed from the multimap, are
 naturally *not* views.

 Subinterfaces

 
Instead of using the Multimap interface directly, prefer the subinterfaces ListMultimap and SetMultimap. These take their names from the fact that the collections
 they return from get behave like (and, of course, implement) List and Set, respectively.

 
For example, the "presidents" code snippet above used a ListMultimap; if it had used a
 SetMultimap instead, two presidents would have vanished, and last names might or might
 not appear in chronological order.

 
**Warning:** instances of type Multimap may not implement Object#equals in
 the way you expect. Multimaps containing the same key-value pairs, even in the same order, may or
 may not be equal and may or may not have the same hashCode. The recommended subinterfaces
 provide much stronger guarantees.

 Comparison to a map of collections

 
Multimaps are commonly used in places where a Map<K, Collection<V>> would otherwise
 have appeared. The differences include:

 

   - There is no need to populate an empty collection before adding an entry with put.
   - get never returns null, only an empty collection.
   - A key is contained in the multimap if and only if it maps to at least one value. Any
       operation that causes a key to have zero associated values has the effect of
       *removing* that key from the multimap.
   - The total entry count is available as #size.
   - Many complex operations become easier; for example, 
       Collections.min(multimap.values()) finds the smallest value across all keys.
 


 Implementations

 

   - ImmutableListMultimap
   - ImmutableSetMultimap
   - Configure your own mutable multimap with MultimapBuilder
   - LinkedListMultimap (for one unusual kind of mutable Multimap)
 


 Guava contains a number of other multimap implementations, such as ArrayListMultimap. In
 new code, we recommend using MultimapBuilder instead: It provides better control of how
 keys and values are stored.

 Other Notes

 
As with Map, the behavior of a Multimap is not specified if key objects
 already present in the multimap change in a manner that affects equals comparisons. Use
 caution if mutable objects are used as keys in a Multimap.

 
All methods that modify the multimap are optional. The view collections returned by the
 multimap may or may not be modifiable. Any modification method that is not supported will throw
 UnsupportedOperationException.

 
See the Guava User Guide article on [Multimap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap).

## Methods

### `size()`

**Returns:** `int`

**Note:** this method does not return the number of *distinct keys* in the multimap,
 which is given by keySet().size() or asMap().size(). See the opening section of
 the Multimap class documentation for clarification.

### `isEmpty()`

**Returns:** `boolean`

Equivalent to size()
 == 0, but can in some cases be more efficient.

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `containsEntry(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `put(K key, V value)`

**Returns:** `boolean`

Some multimap implementations allow duplicate key-value pairs, in which case put
 always adds a new key-value pair and increases the multimap size by 1. Other implementations
 prohibit duplicates, and storing a key-value pair that's already in the multimap has no effect.

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `remove(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

If multiple key-value pairs in the multimap fit this description,
 which one is removed is unspecified.

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `putAll(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `boolean`

Equivalent to (but expected to be more efficient than):

 

```

 for (V value : values) {
   put(key, value);
 }
 
```


 
In particular, this is a no-op if values is empty.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `putAll(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Returns:** `boolean`

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.Collection<V>`

If values is empty, this is equivalent to removeAll(key).

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.Collection<V>`

Once this method returns, key will not be mapped to any values, so it will not
 appear in #keySet(), #asMap(), or any other views.

**Parameters:**
- `key` (`java.lang.Object`)

### `clear()`

**Returns:** `void`

### `get(K key)`

**Returns:** `java.util.Collection<V>`

Note that when containsKey(key) is false, this returns an empty collection, not 
 null.

 
Changes to the returned collection will update the underlying multimap, and vice versa.

**Parameters:**
- `key` (`K`)

### `keySet()`

**Returns:** `java.util.Set<K>`

Note that the
 key set contains a key if and only if this multimap maps that key to at least one value.

 
Changes to the returned set will update the underlying multimap, and vice versa. However,
 *adding* to the returned set is not possible.

### `keys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

This collection has the same size as this multimap, and
 keys().count(k) == get(k).size() for all k.

 
Changes to the returned multiset will update the underlying multimap, and vice versa.
 However, *adding* to the returned collection is not possible.

### `values()`

**Returns:** `java.util.Collection<V>`

Changes to the returned collection will update the underlying multimap, and vice versa.
 However, *adding* to the returned collection is not possible.

### `entries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

Changes to the returned collection or the entries it contains will update the underlying
 multimap, and vice versa. However, *adding* to the returned collection is not possible.

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

If an ordering is
 specified by the Multimap implementation, actions will be performed in the order of
 iteration of #entries(). Exceptions thrown by the action are relayed to the caller.

 
To loop over all keys and their associated value collections, write 
 Multimaps.asMap(multimap).forEach((key, valueCollection) -> action()).

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

Note that this.asMap().get(k) is equivalent
 to this.get(k) only when k is a key contained in the multimap; otherwise it
 returns null as opposed to an empty collection.

 
Changes to the returned map or the collections that serve as its values will update the
 underlying multimap, and vice versa. The map does not support put or putAll,
 nor do its entries support setValue.

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

Two multimaps are equal when
 their map views, as returned by #asMap, are also equal.

 
In general, two multimaps with identical key-value mappings may or may not be equal,
 depending on the implementation. For example, two SetMultimap instances with the same
 key-value mappings are equal, but equality of two ListMultimap instances depends on the
 ordering of the values for each key.

 
A non-empty SetMultimap cannot be equal to a non-empty ListMultimap, since
 their #asMap views contain unequal collections as values. However, any two empty
 multimaps are equal, because they both have empty #asMap views.

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

The hash code of a multimap is defined as the hash code of the map view, as returned by
 Multimap#asMap.

 
In general, two multimaps with identical key-value mappings may or may not have the same
 hash codes, depending on the implementation. For example, two SetMultimap instances
 with the same key-value mappings will have the same hashCode, but the hashCode
 of ListMultimap instances depends on the ordering of the values for each key.

