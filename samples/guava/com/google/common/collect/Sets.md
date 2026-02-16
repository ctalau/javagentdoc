# Class: `Sets`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Sets`

## Description

Static utility methods pertaining to `Set` instances. Also see this class's counterparts
 `Lists`, `Maps` and `Queues`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#sets">`Sets`</a>.
**Author:** Kevin Bourrillion
**Author:** Jared Levy
**Author:** Chris Povirk
**Since:** 2.0

## Constructors

### `<init>()`

## Methods

### `immutableEnumSet(`E` anElement, `E[]` otherElements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set instance containing the given enum elements. Internally, the returned
 set will be backed by an `EnumSet`.

 <p>The iteration order of the returned set follows the enum's iteration order, not the order in
 which the elements are provided to the method.
@param anElement one of the elements the set should contain
@param otherElements the rest of the elements the set should contain
@return an immutable set containing those elements, minus duplicates

### `immutableEnumSet(`java.lang.Iterable<E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set instance containing the given enum elements. Internally, the returned
 set will be backed by an `EnumSet`.

 <p>The iteration order of the returned set follows the enum's iteration order, not the order in
 which the elements appear in the given collection.
@param elements the elements, all of the same `enum` type, that the set should contain
@return an immutable set containing those elements, minus duplicates

### `toImmutableEnumSet()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`

Returns a `Collector` that accumulates the input elements into a new `ImmutableSet`
 with an implementation specialized for enums. Unlike `ImmutableSet.toImmutableSet`, the
 resulting set will iterate over elements in their enum definition order, not encounter order.
**Since:** 21.0

### `newEnumSet(`java.lang.Iterable<E>` iterable, `java.lang.Class<E>` elementType)`

**Returns:** `java.util.EnumSet<E>`

Returns a new, <i>mutable</i> `EnumSet` instance containing the given elements in their
 natural order. This method behaves identically to `EnumSet.copyOf(Collection)`, but also
 accepts non-`Collection` iterables and empty iterables.

### `newHashSet()`

**Returns:** `java.util.HashSet<E>`

Creates a <i>mutable</i>, initially empty `HashSet` instance.

 <p><b>Note:</b> if mutability is not required, use `ImmutableSet.of()` instead. If `E` is an `Enum` type, use `EnumSet.noneOf` instead. Otherwise, strongly consider
 using a `LinkedHashSet` instead, at the cost of increased memory footprint, to get
 deterministic iteration behavior.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `HashSet` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

### `newHashSet(`E[]` elements)`

**Returns:** `java.util.HashSet<E>`

Creates a <i>mutable</i> `HashSet` instance initially containing the given elements.

 <p><b>Note:</b> if elements are non-null and won't be added or removed after this point, use
 `ImmutableSet.of()` or `ImmutableSet.copyOf(Object[])` instead. If `E` is an
 `Enum` type, use `EnumSet.of(Enum, Enum[])` instead. Otherwise, strongly consider
 using a `LinkedHashSet` instead, at the cost of increased memory footprint, to get
 deterministic iteration behavior.

 <p>This method is just a small convenience, either for `newHashSet(``Arrays.asList asList``(...))`, or for creating an empty set then calling `Collections.addAll`.
 This method is not actually very useful and will likely be deprecated in the future.

### `newHashSet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.HashSet<E>`

Creates a <i>mutable</i> `HashSet` instance containing the given elements. A very thin
 convenience for creating an empty set then calling `Collection.addAll` or `Iterables.addAll`.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use `ImmutableSet.copyOf(Iterable)` instead. (Or, change `elements` to be a `FluentIterable` and call `elements.toSet()`.)

 <p><b>Note:</b> if `E` is an `Enum` type, use `newEnumSet(Iterable, Class)`
 instead.

 <p><b>Note:</b> if `elements` is a `Collection`, you don't need this method.
 Instead, use the `HashSet` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

 <p>Overall, this method is not very useful and will likely be deprecated in the future.

### `newHashSet(`java.util.Iterator<? extends E>` elements)`

**Returns:** `java.util.HashSet<E>`

Creates a <i>mutable</i> `HashSet` instance containing the given elements. A very thin
 convenience for creating an empty set and then calling `Iterators.addAll`.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use `ImmutableSet.copyOf(Iterator)` instead.

 <p><b>Note:</b> if `E` is an `Enum` type, you should create an `EnumSet`
 instead.

 <p>Overall, this method is not very useful and will likely be deprecated in the future.

### `newHashSetWithExpectedSize(`int` expectedSize)`

**Returns:** `java.util.HashSet<E>`

Returns a new hash set using the smallest initial table size that can hold `expectedSize`
 elements without resizing. Note that this is not what `HashSet.HashSet(int)` does, but it
 is what most users want and expect it to do.

 <p>This behavior can't be broadly guaranteed, but has been tested with OpenJDK 1.7 and 1.8.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty hash set with enough capacity to hold `expectedSize` elements
     without resizing
@throws IllegalArgumentException if `expectedSize` is negative

### `newConcurrentHashSet()`

**Returns:** `java.util.Set<E>`

Creates a thread-safe set backed by a hash map. The set is backed by a `ConcurrentHashMap` instance, and thus carries the same concurrency guarantees.

 <p>Unlike `HashSet`, this class does NOT allow `null` to be used as an element. The
 set is serializable.
@return a new, empty thread-safe `Set`
**Since:** 15.0

### `newConcurrentHashSet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.Set<E>`

Creates a thread-safe set backed by a hash map and containing the given elements. The set is
 backed by a `ConcurrentHashMap` instance, and thus carries the same concurrency
 guarantees.

 <p>Unlike `HashSet`, this class does NOT allow `null` to be used as an element. The
 set is serializable.
@param elements the elements that the set should contain
@return a new thread-safe set containing those elements (minus duplicates)
@throws NullPointerException if `elements` or any of its contents is null
**Since:** 15.0

### `newLinkedHashSet()`

**Returns:** `java.util.LinkedHashSet<E>`

Creates a <i>mutable</i>, empty `LinkedHashSet` instance.

 <p><b>Note:</b> if mutability is not required, use `ImmutableSet.of()` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `LinkedHashSet` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty `LinkedHashSet`

### `newLinkedHashSet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.LinkedHashSet<E>`

Creates a <i>mutable</i> `LinkedHashSet` instance containing the given elements in order.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use `ImmutableSet.copyOf(Iterable)` instead.

 <p><b>Note:</b> if `elements` is a `Collection`, you don't need this method.
 Instead, use the `LinkedHashSet` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

 <p>Overall, this method is not very useful and will likely be deprecated in the future.
@param elements the elements that the set should contain, in order
@return a new `LinkedHashSet` containing those elements (minus duplicates)

### `newLinkedHashSetWithExpectedSize(`int` expectedSize)`

**Returns:** `java.util.LinkedHashSet<E>`

Creates a `LinkedHashSet` instance, with a high enough "initial capacity" that it
 <i>should</i> hold `expectedSize` elements without growth. This behavior cannot be
 broadly guaranteed, but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed
 that the method isn't inadvertently <i>oversizing</i> the returned set.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty `LinkedHashSet` with enough capacity to hold `expectedSize`
     elements without resizing
@throws IllegalArgumentException if `expectedSize` is negative
**Since:** 11.0

### `newTreeSet()`

**Returns:** `java.util.TreeSet<E>`

Creates a <i>mutable</i>, empty `TreeSet` instance sorted by the natural sort ordering of
 its elements.

 <p><b>Note:</b> if mutability is not required, use `ImmutableSortedSet.of()` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `TreeSet` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty `TreeSet`

### `newTreeSet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.TreeSet<E>`

Creates a <i>mutable</i> `TreeSet` instance containing the given elements sorted by their
 natural ordering.

 <p><b>Note:</b> if mutability is not required, use `ImmutableSortedSet.copyOf(Iterable)`
 instead.

 <p><b>Note:</b> If `elements` is a `SortedSet` with an explicit comparator, this
 method has different behavior than `TreeSet.TreeSet(SortedSet)`, which returns a `TreeSet` with that comparator.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `TreeSet` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

 <p>This method is just a small convenience for creating an empty set and then calling `Iterables.addAll`. This method is not very useful and will likely be deprecated in the future.
@param elements the elements that the set should contain
@return a new `TreeSet` containing those elements (minus duplicates)

### `newTreeSet(`java.util.Comparator<? super E>` comparator)`

**Returns:** `java.util.TreeSet<E>`

Creates a <i>mutable</i>, empty `TreeSet` instance with the given comparator.

 <p><b>Note:</b> if mutability is not required, use `ImmutableSortedSet.orderedBy(comparator).build()` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `TreeSet` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>. One caveat to this is that the `TreeSet`
 constructor uses a null `Comparator` to mean "natural ordering," whereas this factory
 rejects null. Clean your code accordingly.
@param comparator the comparator to use to sort the set
@return a new, empty `TreeSet`
@throws NullPointerException if `comparator` is null

### `newIdentityHashSet()`

**Returns:** `java.util.Set<E>`

Creates an empty `Set` that uses identity to determine equality. It compares object
 references, instead of calling `equals`, to determine whether a provided object matches
 an element in the set. For example, `contains` returns `false` when passed an
 object that equals a set member, but isn't the same instance. This behavior is similar to the
 way `IdentityHashMap` handles key lookups.
**Since:** 8.0

### `newCopyOnWriteArraySet()`

**Returns:** `java.util.concurrent.CopyOnWriteArraySet<E>`

Creates an empty `CopyOnWriteArraySet` instance.

 <p><b>Note:</b> if you need an immutable empty `Set`, use `Collections.emptySet`
 instead.
@return a new, empty `CopyOnWriteArraySet`
**Since:** 12.0

### `newCopyOnWriteArraySet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.concurrent.CopyOnWriteArraySet<E>`

Creates a `CopyOnWriteArraySet` instance containing the given elements.
@param elements the elements that the set should contain, in order
@return a new `CopyOnWriteArraySet` containing those elements
**Since:** 12.0

### `complementOf(`java.util.Collection<E>` collection)`

**Returns:** `java.util.EnumSet<E>`

Creates an `EnumSet` consisting of all enum values that are not in the specified
 collection. If the collection is an `EnumSet`, this method has the same behavior as
 `EnumSet.complementOf`. Otherwise, the specified collection must contain at least one
 element, in order to determine the element type. If the collection could be empty, use `complementOf(Collection, Class)` instead of this method.
@param collection the collection whose complement should be stored in the enum set
@return a new, modifiable `EnumSet` containing all values of the enum that aren't present
     in the given collection
@throws IllegalArgumentException if `collection` is not an `EnumSet` instance and
     contains no elements

### `complementOf(`java.util.Collection<E>` collection, `java.lang.Class<E>` type)`

**Returns:** `java.util.EnumSet<E>`

Creates an `EnumSet` consisting of all enum values that are not in the specified
 collection. This is equivalent to `EnumSet.complementOf`, but can act on any input
 collection, as long as the elements are of enum type.
@param collection the collection whose complement should be stored in the `EnumSet`
@param type the type of the elements in the set
@return a new, modifiable `EnumSet` initially containing all the values of the enum not
     present in the given collection

### `makeComplementByHand(`java.util.Collection<E>` collection, `java.lang.Class<E>` type)`

**Returns:** `java.util.EnumSet<E>`

### `newSetFromMap(`java.util.Map<E,java.lang.Boolean>` map)`

**Returns:** `java.util.Set<E>`

Returns a set backed by the specified map. The resulting set displays the same ordering,
 concurrency, and performance characteristics as the backing map. In essence, this factory
 method provides a `Set` implementation corresponding to any `Map` implementation.
 There is no need to use this method on a `Map` implementation that already has a
 corresponding `Set` implementation (such as `java.util.HashMap` or `java.util.TreeMap`).

 <p>Each method invocation on the set returned by this method results in exactly one method
 invocation on the backing map or its `keySet` view, with one exception. The `addAll` method is implemented as a sequence of `put` invocations on the backing map.

 <p>The specified map must be empty at the time this method is invoked, and should not be
 accessed directly after this method returns. These conditions are ensured if the map is created
 empty, passed directly to this method, and no reference to the map is retained, as illustrated
 in the following code fragment:

 <pre>`Set<Object> identityHashSet = Sets.newSetFromMap(
     new IdentityHashMap<Object, Boolean>());
 `</pre>

 <p>The returned set is serializable if the backing map is.
@param map the backing map
@return the set backed by the map
@throws IllegalArgumentException if `map` is not empty
**Deprecated:**Use `Collections.newSetFromMap` instead.

### `union(`java.util.Set<? extends E>` set1, `java.util.Set<? extends E>` set2)`

**Returns:** [`com.google.common.collect.Sets.SetView<E>`](Sets/SetView.md)

Returns an unmodifiable <b>view</b> of the union of two sets. The returned set contains all
 elements that are contained in either backing set. Iterating over the returned set iterates
 first over all the elements of `set1`, then over each element of `set2`, in order,
 that is not contained in `set1`.

 <p>Results are undefined if `set1` and `set2` are sets based on different
 equivalence relations, for example if `set1` is a `HashSet` and `set2` is a
 `TreeSet` or the `Map.keySet` of an `IdentityHashMap`.

### `intersection(`java.util.Set<E>` set1, `java.util.Set<?>` set2)`

**Returns:** [`com.google.common.collect.Sets.SetView<E>`](Sets/SetView.md)

Returns an unmodifiable <b>view</b> of the intersection of two sets. The returned set contains
 all elements that are contained by both backing sets. The iteration order of the returned set
 matches that of `set1`.

 <p>Results are undefined if `set1` and `set2` are sets based on different
 equivalence relations, for example if `set1` is a `HashSet` and `set2` is a
 `TreeSet` or the `Map.keySet` of an `IdentityHashMap`.

 <p><b>Note:</b> The returned view performs slightly better when `set1` is the smaller of
 the two sets. If you have reason to believe one of your sets will generally be smaller than the
 other, pass it first. Unfortunately, since this method sets the generic type of the returned
 set based on the type of the first set passed, this could in rare cases force you to make a
 cast, for example:

 <pre>`Set<Object> aFewBadObjects = ...
 Set<String> manyBadStrings = ...

 // impossible for a non-String to be in the intersection
 SuppressWarnings("unchecked")
 Set<String> badStrings = (Set) Sets.intersection(
     aFewBadObjects, manyBadStrings);
 `</pre>

 <p>This is unfortunate, but should come up only very rarely.

### `difference(`java.util.Set<E>` set1, `java.util.Set<?>` set2)`

**Returns:** [`com.google.common.collect.Sets.SetView<E>`](Sets/SetView.md)

Returns an unmodifiable <b>view</b> of the difference of two sets. The returned set contains
 all elements that are contained by `set1` and not contained by `set2`. `set2`
 may also contain elements not present in `set1`; these are simply ignored. The iteration
 order of the returned set matches that of `set1`.

 <p>Results are undefined if `set1` and `set2` are sets based on different
 equivalence relations, for example if `set1` is a `HashSet` and `set2` is a
 `TreeSet` or the `Map.keySet` of an `IdentityHashMap`.

### `symmetricDifference(`java.util.Set<? extends E>` set1, `java.util.Set<? extends E>` set2)`

**Returns:** [`com.google.common.collect.Sets.SetView<E>`](Sets/SetView.md)

Returns an unmodifiable <b>view</b> of the symmetric difference of two sets. The returned set
 contains all elements that are contained in either `set1` or `set2` but not in
 both. The iteration order of the returned set is undefined.

 <p>Results are undefined if `set1` and `set2` are sets based on different
 equivalence relations, for example if `set1` is a `HashSet` and `set2` is a
 `TreeSet` or the `Map.keySet` of an `IdentityHashMap`.
**Since:** 3.0

### `filter(`java.util.Set<E>` unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** `java.util.Set<E>`

Returns the elements of `unfiltered` that satisfy a predicate. The returned set is a live
 view of `unfiltered`; changes to one affect the other.

 <p>The resulting set's iterator does not support `remove()`, but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's `add()` and `addAll()` methods throw an `IllegalArgumentException`. When methods
 such as `removeAll()` and `clear()` are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 <p>The returned set isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered set's methods, such as `size()`, iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy `Iterables.filter(unfiltered, predicate)` and
 use the copy.

 <p><b>Warning:</b> `predicate` must be <i>consistent with equals</i>, as documented at
 `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals. (See `Iterables.filter(Iterable, Class)` for related functionality.)

 <p><b>Java 8 users:</b> many use cases for this method are better addressed by `java.util.stream.Stream.filter`. This method is not being deprecated, but we gently encourage
 you to migrate to streams.

### `filter(`java.util.SortedSet<E>` unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** `java.util.SortedSet<E>`

Returns the elements of a `SortedSet`, `unfiltered`, that satisfy a predicate. The
 returned set is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting set's iterator does not support `remove()`, but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's `add()` and `addAll()` methods throw an `IllegalArgumentException`. When methods
 such as `removeAll()` and `clear()` are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 <p>The returned set isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered set's methods, such as `size()`, iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy `Iterables.filter(unfiltered, predicate)` and
 use the copy.

 <p><b>Warning:</b> `predicate` must be <i>consistent with equals</i>, as documented at
 `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals. (See `Iterables.filter(Iterable, Class)` for related functionality.)
**Since:** 11.0

### `filter(`java.util.NavigableSet<E>` unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** `java.util.NavigableSet<E>`

Returns the elements of a `NavigableSet`, `unfiltered`, that satisfy a predicate.
 The returned set is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting set's iterator does not support `remove()`, but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's `add()` and `addAll()` methods throw an `IllegalArgumentException`. When methods
 such as `removeAll()` and `clear()` are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 <p>The returned set isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered set's methods, such as `size()`, iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy `Iterables.filter(unfiltered, predicate)` and
 use the copy.

 <p><b>Warning:</b> `predicate` must be <i>consistent with equals</i>, as documented at
 `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals. (See `Iterables.filter(Iterable, Class)` for related functionality.)
**Since:** 14.0

### `cartesianProduct(`java.util.List<? extends java.util.Set<? extends B>>` sets)`

**Returns:** `java.util.Set<java.util.List<B>>`

Returns every possible list that can be formed by choosing one element from each of the given
 sets in order; the "n-ary <a href="http://en.wikipedia.org/wiki/Cartesian_product">Cartesian
 product</a>" of the sets. For example:

 <pre>`Sets.cartesianProduct(ImmutableList.of(
     ImmutableSet.of(1, 2),
     ImmutableSet.of("A", "B", "C")))
 `</pre>

 <p>returns a set containing six lists:

 <ul>
   <li>`ImmutableList.of(1, "A")`
   <li>`ImmutableList.of(1, "B")`
   <li>`ImmutableList.of(1, "C")`
   <li>`ImmutableList.of(2, "A")`
   <li>`ImmutableList.of(2, "B")`
   <li>`ImmutableList.of(2, "C")`
 </ul>

 <p>The result is guaranteed to be in the "traditional", lexicographical order for Cartesian
 products that you would get from nesting for loops:

 <pre>`for (B b0 : sets.get(0)) {
   for (B b1 : sets.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   `
 }
 }</pre>

 <p>Note that if any input set is empty, the Cartesian product will also be empty. If no sets at
 all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 <p><i>Performance notes:</i> while the cartesian product of sets of size `m, n, p` is a
 set of size `m x n x p`, its actual memory consumption is much smaller. When the
 cartesian set is constructed, the input sets are merely copied. Only as the resulting set is
 iterated are the individual lists created, and these are not retained after iteration.
@param sets the sets to choose elements from, in the order that the elements chosen from those
     sets should appear in the resulting lists
@param <B> any common base class shared by all axes (often just `Object`)
@return the Cartesian product, as an immutable set containing immutable lists
@throws NullPointerException if `sets`, any one of the `sets`, or any element of a
     provided set is null
@throws IllegalArgumentException if the cartesian product size exceeds the `int` range
**Since:** 2.0

### `cartesianProduct(`java.util.Set<? extends B>[]` sets)`

**Returns:** `java.util.Set<java.util.List<B>>`

Returns every possible list that can be formed by choosing one element from each of the given
 sets in order; the "n-ary <a href="http://en.wikipedia.org/wiki/Cartesian_product">Cartesian
 product</a>" of the sets. For example:

 <pre>`Sets.cartesianProduct(
     ImmutableSet.of(1, 2),
     ImmutableSet.of("A", "B", "C"))
 `</pre>

 <p>returns a set containing six lists:

 <ul>
   <li>`ImmutableList.of(1, "A")`
   <li>`ImmutableList.of(1, "B")`
   <li>`ImmutableList.of(1, "C")`
   <li>`ImmutableList.of(2, "A")`
   <li>`ImmutableList.of(2, "B")`
   <li>`ImmutableList.of(2, "C")`
 </ul>

 <p>The result is guaranteed to be in the "traditional", lexicographical order for Cartesian
 products that you would get from nesting for loops:

 <pre>`for (B b0 : sets.get(0)) {
   for (B b1 : sets.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   `
 }
 }</pre>

 <p>Note that if any input set is empty, the Cartesian product will also be empty. If no sets at
 all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 <p><i>Performance notes:</i> while the cartesian product of sets of size `m, n, p` is a
 set of size `m x n x p`, its actual memory consumption is much smaller. When the
 cartesian set is constructed, the input sets are merely copied. Only as the resulting set is
 iterated are the individual lists created, and these are not retained after iteration.
@param sets the sets to choose elements from, in the order that the elements chosen from those
     sets should appear in the resulting lists
@param <B> any common base class shared by all axes (often just `Object`)
@return the Cartesian product, as an immutable set containing immutable lists
@throws NullPointerException if `sets`, any one of the `sets`, or any element of a
     provided set is null
@throws IllegalArgumentException if the cartesian product size exceeds the `int` range
**Since:** 2.0

### `powerSet(`java.util.Set<E>` set)`

**Returns:** `java.util.Set<java.util.Set<E>>`

Returns the set of all possible subsets of `set`. For example, `powerSet(ImmutableSet.of(1, 2))` returns the set `{{`, {1}, {2}, {1, 2}}}.

 <p>Elements appear in these subsets in the same iteration order as they appeared in the input
 set. The order in which these subsets appear in the outer set is undefined. Note that the power
 set of the empty set is not the empty set, but a one-element set containing the empty set.

 <p>The returned set and its constituent sets use `equals` to decide whether two elements
 are identical, even if the input set uses a different concept of equivalence.

 <p><i>Performance notes:</i> while the power set of a set with size `n` is of size `2^n`, its memory usage is only `O(n)`. When the power set is constructed, the input set
 is merely copied. Only as the power set is iterated are the individual subsets created, and
 these subsets themselves occupy only a small constant amount of memory.
@param set the set of elements to construct a power set from
@return the power set, as an immutable set of immutable sets
@throws IllegalArgumentException if `set` has more than 30 unique elements (causing the
     power set size to exceed the `int` range)
@throws NullPointerException if `set` is or contains `null`
**See:** <a href="http://en.wikipedia.org/wiki/Power_set">Power set article at Wikipedia</a>
**Since:** 4.0

### `combinations(`java.util.Set<E>` set, `int` size)`

**Returns:** `java.util.Set<java.util.Set<E>>`

Returns the set of all subsets of `set` of size `size`. For example, `combinations(ImmutableSet.of(1, 2, 3), 2)` returns the set `{{1, 2`, {1, 3}, {2, 3}}}.

 <p>Elements appear in these subsets in the same iteration order as they appeared in the input
 set. The order in which these subsets appear in the outer set is undefined.

 <p>The returned set and its constituent sets use `equals` to decide whether two elements
 are identical, even if the input set uses a different concept of equivalence.

 <p><i>Performance notes:</i> the memory usage of the returned set is only `O(n)`. When
 the result set is constructed, the input set is merely copied. Only as the result set is
 iterated are the individual subsets created. Each of these subsets occupies an additional O(n)
 memory but only for as long as the user retains a reference to it. That is, the set returned by
 `combinations` does not retain the individual subsets.
@param set the set of elements to take combinations of
@param size the number of elements per combination
@return the set of all combinations of `size` elements from `set`
@throws IllegalArgumentException if `size` is not between 0 and `set.size()`
     inclusive
@throws NullPointerException if `set` is or contains `null`
**Since:** 23.0

### `hashCodeImpl(`java.util.Set<?>` s)`

**Returns:** `int`

An implementation for `Set.hashCode()`.

### `equalsImpl(`java.util.Set<?>` s, `java.lang.Object` object)`

**Returns:** `boolean`

An implementation for `Set.equals(Object)`.

### `unmodifiableNavigableSet(`java.util.NavigableSet<E>` set)`

**Returns:** `java.util.NavigableSet<E>`

Returns an unmodifiable view of the specified navigable set. This method allows modules to
 provide users with "read-only" access to internal navigable sets. Query operations on the
 returned set "read through" to the specified set, and attempts to modify the returned set,
 whether direct or via its collection views, result in an `UnsupportedOperationException`.

 <p>The returned navigable set will be serializable if the specified navigable set is
 serializable.

 <p><b>Java 8 users and later:</b> Prefer `Collections.unmodifiableNavigableSet`.
@param set the navigable set for which an unmodifiable view is to be returned
@return an unmodifiable view of the specified navigable set
**Since:** 12.0

### `synchronizedNavigableSet(`java.util.NavigableSet<E>` navigableSet)`

**Returns:** `java.util.NavigableSet<E>`

Returns a synchronized (thread-safe) navigable set backed by the specified navigable set. In
 order to guarantee serial access, it is critical that <b>all</b> access to the backing
 navigable set is accomplished through the returned navigable set (or its views).

 <p>It is imperative that the user manually synchronize on the returned sorted set when
 iterating over it or any of its `descendingSet`, `subSet`, `headSet`, or
 `tailSet` views.

 <pre>`NavigableSet<E> set = synchronizedNavigableSet(new TreeSet<E>());
  ...
 synchronized (set) {
   // Must be in the synchronized block
   Iterator<E> it = set.iterator();
   while (it.hasNext()) {
     foo(it.next());
   `
 }
 }</pre>

 <p>or:

 <pre>`NavigableSet<E> set = synchronizedNavigableSet(new TreeSet<E>());
 NavigableSet<E> set2 = set.descendingSet().headSet(foo);
  ...
 synchronized (set) { // Note: set, not set2!!!
   // Must be in the synchronized block
   Iterator<E> it = set2.descendingIterator();
   while (it.hasNext())
     foo(it.next());
   `
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned navigable set will be serializable if the specified navigable set is
 serializable.

 <p><b>Java 8 users and later:</b> Prefer `Collections.synchronizedNavigableSet`.
@param navigableSet the navigable set to be "wrapped" in a synchronized navigable set.
@return a synchronized view of the specified navigable set.
**Since:** 13.0

### `removeAllImpl(`java.util.Set<?>` set, `java.util.Iterator<?>` iterator)`

**Returns:** `boolean`

Remove each element in an iterable from a set.

### `removeAllImpl(`java.util.Set<?>` set, `java.util.Collection<?>` collection)`

**Returns:** `boolean`

### `subSet(`java.util.NavigableSet<K>` set, [`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** `java.util.NavigableSet<K>`

Returns a view of the portion of `set` whose elements are contained by `range`.

 <p>This method delegates to the appropriate methods of `NavigableSet` (namely `NavigableSet.subSet(Object, boolean, Object, boolean) subSet()`, `NavigableSet.tailSet(Object, boolean) tailSet()`, and `NavigableSet.headSet(Object,
 boolean) headSet()`) to actually construct the view. Consult these methods for a full
 description of the returned view's behavior.

 <p><b>Warning:</b> `Range`s always represent a range of values using the values' natural
 ordering. `NavigableSet` on the other hand can specify a custom ordering via a `Comparator`, which can violate the natural ordering. Using this method (or in general using
 `Range`) with unnaturally-ordered sets can lead to unexpected and undefined behavior.
**Since:** 20.0

