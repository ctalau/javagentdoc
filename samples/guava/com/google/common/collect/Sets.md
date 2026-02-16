# Class: `Sets`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Sets`

## Description

Static utility methods pertaining to {@link Set} instances. Also see this class's counterparts
 {@link Lists}, {@link Maps} and {@link Queues}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#sets">{@code Sets}</a>.
@author Kevin Bourrillion
@author Jared Levy
@author Chris Povirk
@since 2.0

## Constructors

### `<init>()`

## Methods

### `immutableEnumSet([`E`](E.md) anElement, [`E[]`](E.md) otherElements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set instance containing the given enum elements. Internally, the returned
 set will be backed by an {@link EnumSet}.

 <p>The iteration order of the returned set follows the enum's iteration order, not the order in
 which the elements are provided to the method.
@param anElement one of the elements the set should contain
@param otherElements the rest of the elements the set should contain
@return an immutable set containing those elements, minus duplicates

### `immutableEnumSet(`java.lang.Iterable<E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set instance containing the given enum elements. Internally, the returned
 set will be backed by an {@link EnumSet}.

 <p>The iteration order of the returned set follows the enum's iteration order, not the order in
 which the elements appear in the given collection.
@param elements the elements, all of the same {@code enum} type, that the set should contain
@return an immutable set containing those elements, minus duplicates

### `toImmutableEnumSet()`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} that accumulates the input elements into a new {@code ImmutableSet}
 with an implementation specialized for enums. Unlike {@link ImmutableSet#toImmutableSet}, the
 resulting set will iterate over elements in their enum definition order, not encounter order.
@since 21.0

### `newEnumSet(`java.lang.Iterable<E>` iterable, `java.lang.Class<E>` elementType)`

**Returns:** [`java.util.EnumSet<E>`](../../../../java/util/EnumSet.md)

Returns a new, <i>mutable</i> {@code EnumSet} instance containing the given elements in their
 natural order. This method behaves identically to {@link EnumSet#copyOf(Collection)}, but also
 accepts non-{@code Collection} iterables and empty iterables.

### `newHashSet()`

**Returns:** [`java.util.HashSet<E>`](../../../../java/util/HashSet.md)

Creates a <i>mutable</i>, initially empty {@code HashSet} instance.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableSet#of()} instead. If {@code
 E} is an {@link Enum} type, use {@link EnumSet#noneOf} instead. Otherwise, strongly consider
 using a {@code LinkedHashSet} instead, at the cost of increased memory footprint, to get
 deterministic iteration behavior.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code HashSet} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

### `newHashSet([`E[]`](E.md) elements)`

**Returns:** [`java.util.HashSet<E>`](../../../../java/util/HashSet.md)

Creates a <i>mutable</i> {@code HashSet} instance initially containing the given elements.

 <p><b>Note:</b> if elements are non-null and won't be added or removed after this point, use
 {@link ImmutableSet#of()} or {@link ImmutableSet#copyOf(Object[])} instead. If {@code E} is an
 {@link Enum} type, use {@link EnumSet#of(Enum, Enum[])} instead. Otherwise, strongly consider
 using a {@code LinkedHashSet} instead, at the cost of increased memory footprint, to get
 deterministic iteration behavior.

 <p>This method is just a small convenience, either for {@code newHashSet(}{@link Arrays#asList asList}{@code (...))}, or for creating an empty set then calling {@link Collections#addAll}.
 This method is not actually very useful and will likely be deprecated in the future.

### `newHashSet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.HashSet<E>`](../../../../java/util/HashSet.md)

Creates a <i>mutable</i> {@code HashSet} instance containing the given elements. A very thin
 convenience for creating an empty set then calling {@link Collection#addAll} or {@link Iterables#addAll}.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use {@link ImmutableSet#copyOf(Iterable)} instead. (Or, change {@code elements} to be a {@link FluentIterable} and call {@code elements.toSet()}.)

 <p><b>Note:</b> if {@code E} is an {@link Enum} type, use {@link #newEnumSet(Iterable, Class)}
 instead.

 <p><b>Note:</b> if {@code elements} is a {@link Collection}, you don't need this method.
 Instead, use the {@code HashSet} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

 <p>Overall, this method is not very useful and will likely be deprecated in the future.

### `newHashSet([`java.util.Iterator<? extends E>`](../../../../java/util/Iterator.md) elements)`

**Returns:** [`java.util.HashSet<E>`](../../../../java/util/HashSet.md)

Creates a <i>mutable</i> {@code HashSet} instance containing the given elements. A very thin
 convenience for creating an empty set and then calling {@link Iterators#addAll}.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use {@link ImmutableSet#copyOf(Iterator)} instead.

 <p><b>Note:</b> if {@code E} is an {@link Enum} type, you should create an {@link EnumSet}
 instead.

 <p>Overall, this method is not very useful and will likely be deprecated in the future.

### `newHashSetWithExpectedSize(`int` expectedSize)`

**Returns:** [`java.util.HashSet<E>`](../../../../java/util/HashSet.md)

Returns a new hash set using the smallest initial table size that can hold {@code expectedSize}
 elements without resizing. Note that this is not what {@link HashSet#HashSet(int)} does, but it
 is what most users want and expect it to do.

 <p>This behavior can't be broadly guaranteed, but has been tested with OpenJDK 1.7 and 1.8.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty hash set with enough capacity to hold {@code expectedSize} elements
     without resizing
@throws IllegalArgumentException if {@code expectedSize} is negative

### `newConcurrentHashSet()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

Creates a thread-safe set backed by a hash map. The set is backed by a {@link ConcurrentHashMap} instance, and thus carries the same concurrency guarantees.

 <p>Unlike {@code HashSet}, this class does NOT allow {@code null} to be used as an element. The
 set is serializable.
@return a new, empty thread-safe {@code Set}
@since 15.0

### `newConcurrentHashSet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

Creates a thread-safe set backed by a hash map and containing the given elements. The set is
 backed by a {@link ConcurrentHashMap} instance, and thus carries the same concurrency
 guarantees.

 <p>Unlike {@code HashSet}, this class does NOT allow {@code null} to be used as an element. The
 set is serializable.
@param elements the elements that the set should contain
@return a new thread-safe set containing those elements (minus duplicates)
@throws NullPointerException if {@code elements} or any of its contents is null
@since 15.0

### `newLinkedHashSet()`

**Returns:** [`java.util.LinkedHashSet<E>`](../../../../java/util/LinkedHashSet.md)

Creates a <i>mutable</i>, empty {@code LinkedHashSet} instance.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableSet#of()} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code LinkedHashSet} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty {@code LinkedHashSet}

### `newLinkedHashSet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.LinkedHashSet<E>`](../../../../java/util/LinkedHashSet.md)

Creates a <i>mutable</i> {@code LinkedHashSet} instance containing the given elements in order.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use {@link ImmutableSet#copyOf(Iterable)} instead.

 <p><b>Note:</b> if {@code elements} is a {@link Collection}, you don't need this method.
 Instead, use the {@code LinkedHashSet} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

 <p>Overall, this method is not very useful and will likely be deprecated in the future.
@param elements the elements that the set should contain, in order
@return a new {@code LinkedHashSet} containing those elements (minus duplicates)

### `newLinkedHashSetWithExpectedSize(`int` expectedSize)`

**Returns:** [`java.util.LinkedHashSet<E>`](../../../../java/util/LinkedHashSet.md)

Creates a {@code LinkedHashSet} instance, with a high enough "initial capacity" that it
 <i>should</i> hold {@code expectedSize} elements without growth. This behavior cannot be
 broadly guaranteed, but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed
 that the method isn't inadvertently <i>oversizing</i> the returned set.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty {@code LinkedHashSet} with enough capacity to hold {@code expectedSize}
     elements without resizing
@throws IllegalArgumentException if {@code expectedSize} is negative
@since 11.0

### `newTreeSet()`

**Returns:** [`java.util.TreeSet<E>`](../../../../java/util/TreeSet.md)

Creates a <i>mutable</i>, empty {@code TreeSet} instance sorted by the natural sort ordering of
 its elements.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableSortedSet#of()} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code TreeSet} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty {@code TreeSet}

### `newTreeSet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.TreeSet<E>`](../../../../java/util/TreeSet.md)

Creates a <i>mutable</i> {@code TreeSet} instance containing the given elements sorted by their
 natural ordering.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableSortedSet#copyOf(Iterable)}
 instead.

 <p><b>Note:</b> If {@code elements} is a {@code SortedSet} with an explicit comparator, this
 method has different behavior than {@link TreeSet#TreeSet(SortedSet)}, which returns a {@code
 TreeSet} with that comparator.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code TreeSet} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

 <p>This method is just a small convenience for creating an empty set and then calling {@link Iterables#addAll}. This method is not very useful and will likely be deprecated in the future.
@param elements the elements that the set should contain
@return a new {@code TreeSet} containing those elements (minus duplicates)

### `newTreeSet([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`java.util.TreeSet<E>`](../../../../java/util/TreeSet.md)

Creates a <i>mutable</i>, empty {@code TreeSet} instance with the given comparator.

 <p><b>Note:</b> if mutability is not required, use {@code
 ImmutableSortedSet.orderedBy(comparator).build()} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code TreeSet} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>. One caveat to this is that the {@code TreeSet}
 constructor uses a null {@code Comparator} to mean "natural ordering," whereas this factory
 rejects null. Clean your code accordingly.
@param comparator the comparator to use to sort the set
@return a new, empty {@code TreeSet}
@throws NullPointerException if {@code comparator} is null

### `newIdentityHashSet()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

Creates an empty {@code Set} that uses identity to determine equality. It compares object
 references, instead of calling {@code equals}, to determine whether a provided object matches
 an element in the set. For example, {@code contains} returns {@code false} when passed an
 object that equals a set member, but isn't the same instance. This behavior is similar to the
 way {@code IdentityHashMap} handles key lookups.
@since 8.0

### `newCopyOnWriteArraySet()`

**Returns:** [`java.util.concurrent.CopyOnWriteArraySet<E>`](../../../../java/util/concurrent/CopyOnWriteArraySet.md)

Creates an empty {@code CopyOnWriteArraySet} instance.

 <p><b>Note:</b> if you need an immutable empty {@link Set}, use {@link Collections#emptySet}
 instead.
@return a new, empty {@code CopyOnWriteArraySet}
@since 12.0

### `newCopyOnWriteArraySet(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.concurrent.CopyOnWriteArraySet<E>`](../../../../java/util/concurrent/CopyOnWriteArraySet.md)

Creates a {@code CopyOnWriteArraySet} instance containing the given elements.
@param elements the elements that the set should contain, in order
@return a new {@code CopyOnWriteArraySet} containing those elements
@since 12.0

### `complementOf([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.EnumSet<E>`](../../../../java/util/EnumSet.md)

Creates an {@code EnumSet} consisting of all enum values that are not in the specified
 collection. If the collection is an {@link EnumSet}, this method has the same behavior as
 {@link EnumSet#complementOf}. Otherwise, the specified collection must contain at least one
 element, in order to determine the element type. If the collection could be empty, use {@link #complementOf(Collection, Class)} instead of this method.
@param collection the collection whose complement should be stored in the enum set
@return a new, modifiable {@code EnumSet} containing all values of the enum that aren't present
     in the given collection
@throws IllegalArgumentException if {@code collection} is not an {@code EnumSet} instance and
     contains no elements

### `complementOf([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection, `java.lang.Class<E>` type)`

**Returns:** [`java.util.EnumSet<E>`](../../../../java/util/EnumSet.md)

Creates an {@code EnumSet} consisting of all enum values that are not in the specified
 collection. This is equivalent to {@link EnumSet#complementOf}, but can act on any input
 collection, as long as the elements are of enum type.
@param collection the collection whose complement should be stored in the {@code EnumSet}
@param type the type of the elements in the set
@return a new, modifiable {@code EnumSet} initially containing all the values of the enum not
     present in the given collection

### `makeComplementByHand([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection, `java.lang.Class<E>` type)`

**Returns:** [`java.util.EnumSet<E>`](../../../../java/util/EnumSet.md)

### `newSetFromMap([`java.util.Map<E,java.lang.Boolean>`](../../../../java/util/Map.md) map)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

Returns a set backed by the specified map. The resulting set displays the same ordering,
 concurrency, and performance characteristics as the backing map. In essence, this factory
 method provides a {@link Set} implementation corresponding to any {@link Map} implementation.
 There is no need to use this method on a {@link Map} implementation that already has a
 corresponding {@link Set} implementation (such as {@link java.util.HashMap} or {@link java.util.TreeMap}).

 <p>Each method invocation on the set returned by this method results in exactly one method
 invocation on the backing map or its {@code keySet} view, with one exception. The {@code
 addAll} method is implemented as a sequence of {@code put} invocations on the backing map.

 <p>The specified map must be empty at the time this method is invoked, and should not be
 accessed directly after this method returns. These conditions are ensured if the map is created
 empty, passed directly to this method, and no reference to the map is retained, as illustrated
 in the following code fragment:

 <pre>{@code
 Set<Object> identityHashSet = Sets.newSetFromMap(
     new IdentityHashMap<Object, Boolean>());
 }</pre>

 <p>The returned set is serializable if the backing map is.
@param map the backing map
@return the set backed by the map
@throws IllegalArgumentException if {@code map} is not empty
@deprecated Use {@link Collections#newSetFromMap} instead.

### `union([`java.util.Set<? extends E>`](../../../../java/util/Set.md) set1, [`java.util.Set<? extends E>`](../../../../java/util/Set.md) set2)`

**Returns:** [`com.google.common.collect.Sets.SetView<E>`](Sets/SetView.md)

Returns an unmodifiable <b>view</b> of the union of two sets. The returned set contains all
 elements that are contained in either backing set. Iterating over the returned set iterates
 first over all the elements of {@code set1}, then over each element of {@code set2}, in order,
 that is not contained in {@code set1}.

 <p>Results are undefined if {@code set1} and {@code set2} are sets based on different
 equivalence relations, for example if {@code set1} is a {@link HashSet} and {@code set2} is a
 {@link TreeSet} or the {@link Map#keySet} of an {@code IdentityHashMap}.

### `intersection([`java.util.Set<E>`](../../../../java/util/Set.md) set1, [`java.util.Set<?>`](../../../../java/util/Set.md) set2)`

**Returns:** [`com.google.common.collect.Sets.SetView<E>`](Sets/SetView.md)

Returns an unmodifiable <b>view</b> of the intersection of two sets. The returned set contains
 all elements that are contained by both backing sets. The iteration order of the returned set
 matches that of {@code set1}.

 <p>Results are undefined if {@code set1} and {@code set2} are sets based on different
 equivalence relations, for example if {@code set1} is a {@link HashSet} and {@code set2} is a
 {@link TreeSet} or the {@link Map#keySet} of an {@code IdentityHashMap}.

 <p><b>Note:</b> The returned view performs slightly better when {@code set1} is the smaller of
 the two sets. If you have reason to believe one of your sets will generally be smaller than the
 other, pass it first. Unfortunately, since this method sets the generic type of the returned
 set based on the type of the first set passed, this could in rare cases force you to make a
 cast, for example:

 <pre>{@code
 Set<Object> aFewBadObjects = ...
 Set<String> manyBadStrings = ...

 // impossible for a non-String to be in the intersection
 SuppressWarnings("unchecked")
 Set<String> badStrings = (Set) Sets.intersection(
     aFewBadObjects, manyBadStrings);
 }</pre>

 <p>This is unfortunate, but should come up only very rarely.

### `difference([`java.util.Set<E>`](../../../../java/util/Set.md) set1, [`java.util.Set<?>`](../../../../java/util/Set.md) set2)`

**Returns:** [`com.google.common.collect.Sets.SetView<E>`](Sets/SetView.md)

Returns an unmodifiable <b>view</b> of the difference of two sets. The returned set contains
 all elements that are contained by {@code set1} and not contained by {@code set2}. {@code set2}
 may also contain elements not present in {@code set1}; these are simply ignored. The iteration
 order of the returned set matches that of {@code set1}.

 <p>Results are undefined if {@code set1} and {@code set2} are sets based on different
 equivalence relations, for example if {@code set1} is a {@link HashSet} and {@code set2} is a
 {@link TreeSet} or the {@link Map#keySet} of an {@code IdentityHashMap}.

### `symmetricDifference([`java.util.Set<? extends E>`](../../../../java/util/Set.md) set1, [`java.util.Set<? extends E>`](../../../../java/util/Set.md) set2)`

**Returns:** [`com.google.common.collect.Sets.SetView<E>`](Sets/SetView.md)

Returns an unmodifiable <b>view</b> of the symmetric difference of two sets. The returned set
 contains all elements that are contained in either {@code set1} or {@code set2} but not in
 both. The iteration order of the returned set is undefined.

 <p>Results are undefined if {@code set1} and {@code set2} are sets based on different
 equivalence relations, for example if {@code set1} is a {@link HashSet} and {@code set2} is a
 {@link TreeSet} or the {@link Map#keySet} of an {@code IdentityHashMap}.
@since 3.0

### `filter([`java.util.Set<E>`](../../../../java/util/Set.md) unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

Returns the elements of {@code unfiltered} that satisfy a predicate. The returned set is a live
 view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting set's iterator does not support {@code remove()}, but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's {@code
 add()} and {@code addAll()} methods throw an {@link IllegalArgumentException}. When methods
 such as {@code removeAll()} and {@code clear()} are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 <p>The returned set isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered set's methods, such as {@code size()}, iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy {@code Iterables.filter(unfiltered, predicate)} and
 use the copy.

 <p><b>Warning:</b> {@code predicate} must be <i>consistent with equals</i>, as documented at
 {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals. (See {@link Iterables#filter(Iterable, Class)} for related functionality.)

 <p><b>Java 8 users:</b> many use cases for this method are better addressed by {@link java.util.stream.Stream#filter}. This method is not being deprecated, but we gently encourage
 you to migrate to streams.

### `filter([`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md) unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

Returns the elements of a {@code SortedSet}, {@code unfiltered}, that satisfy a predicate. The
 returned set is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting set's iterator does not support {@code remove()}, but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's {@code
 add()} and {@code addAll()} methods throw an {@link IllegalArgumentException}. When methods
 such as {@code removeAll()} and {@code clear()} are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 <p>The returned set isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered set's methods, such as {@code size()}, iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy {@code Iterables.filter(unfiltered, predicate)} and
 use the copy.

 <p><b>Warning:</b> {@code predicate} must be <i>consistent with equals</i>, as documented at
 {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals. (See {@link Iterables#filter(Iterable, Class)} for related functionality.)
@since 11.0

### `filter([`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md) unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

Returns the elements of a {@code NavigableSet}, {@code unfiltered}, that satisfy a predicate.
 The returned set is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting set's iterator does not support {@code remove()}, but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's {@code
 add()} and {@code addAll()} methods throw an {@link IllegalArgumentException}. When methods
 such as {@code removeAll()} and {@code clear()} are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 <p>The returned set isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered set's methods, such as {@code size()}, iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy {@code Iterables.filter(unfiltered, predicate)} and
 use the copy.

 <p><b>Warning:</b> {@code predicate} must be <i>consistent with equals</i>, as documented at
 {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals. (See {@link Iterables#filter(Iterable, Class)} for related functionality.)
@since 14.0

### `cartesianProduct([`java.util.List<? extends java.util.Set<? extends B>>`](../../../../java/util/List>.md) sets)`

**Returns:** [`java.util.Set<java.util.List<B>>`](../../../../java/util/Set>.md)

Returns every possible list that can be formed by choosing one element from each of the given
 sets in order; the "n-ary <a href="http://en.wikipedia.org/wiki/Cartesian_product">Cartesian
 product</a>" of the sets. For example:

 <pre>{@code
 Sets.cartesianProduct(ImmutableList.of(
     ImmutableSet.of(1, 2),
     ImmutableSet.of("A", "B", "C")))
 }</pre>

 <p>returns a set containing six lists:

 <ul>
   <li>{@code ImmutableList.of(1, "A")}
   <li>{@code ImmutableList.of(1, "B")}
   <li>{@code ImmutableList.of(1, "C")}
   <li>{@code ImmutableList.of(2, "A")}
   <li>{@code ImmutableList.of(2, "B")}
   <li>{@code ImmutableList.of(2, "C")}
 </ul>

 <p>The result is guaranteed to be in the "traditional", lexicographical order for Cartesian
 products that you would get from nesting for loops:

 <pre>{@code
 for (B b0 : sets.get(0)) {
   for (B b1 : sets.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   }
 }
 }</pre>

 <p>Note that if any input set is empty, the Cartesian product will also be empty. If no sets at
 all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 <p><i>Performance notes:</i> while the cartesian product of sets of size {@code m, n, p} is a
 set of size {@code m x n x p}, its actual memory consumption is much smaller. When the
 cartesian set is constructed, the input sets are merely copied. Only as the resulting set is
 iterated are the individual lists created, and these are not retained after iteration.
@param sets the sets to choose elements from, in the order that the elements chosen from those
     sets should appear in the resulting lists
@param <B> any common base class shared by all axes (often just {@link Object})
@return the Cartesian product, as an immutable set containing immutable lists
@throws NullPointerException if {@code sets}, any one of the {@code sets}, or any element of a
     provided set is null
@throws IllegalArgumentException if the cartesian product size exceeds the {@code int} range
@since 2.0

### `cartesianProduct([`java.util.Set<? extends B>[]`](../../../../java/util/Set.md) sets)`

**Returns:** [`java.util.Set<java.util.List<B>>`](../../../../java/util/Set>.md)

Returns every possible list that can be formed by choosing one element from each of the given
 sets in order; the "n-ary <a href="http://en.wikipedia.org/wiki/Cartesian_product">Cartesian
 product</a>" of the sets. For example:

 <pre>{@code
 Sets.cartesianProduct(
     ImmutableSet.of(1, 2),
     ImmutableSet.of("A", "B", "C"))
 }</pre>

 <p>returns a set containing six lists:

 <ul>
   <li>{@code ImmutableList.of(1, "A")}
   <li>{@code ImmutableList.of(1, "B")}
   <li>{@code ImmutableList.of(1, "C")}
   <li>{@code ImmutableList.of(2, "A")}
   <li>{@code ImmutableList.of(2, "B")}
   <li>{@code ImmutableList.of(2, "C")}
 </ul>

 <p>The result is guaranteed to be in the "traditional", lexicographical order for Cartesian
 products that you would get from nesting for loops:

 <pre>{@code
 for (B b0 : sets.get(0)) {
   for (B b1 : sets.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   }
 }
 }</pre>

 <p>Note that if any input set is empty, the Cartesian product will also be empty. If no sets at
 all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 <p><i>Performance notes:</i> while the cartesian product of sets of size {@code m, n, p} is a
 set of size {@code m x n x p}, its actual memory consumption is much smaller. When the
 cartesian set is constructed, the input sets are merely copied. Only as the resulting set is
 iterated are the individual lists created, and these are not retained after iteration.
@param sets the sets to choose elements from, in the order that the elements chosen from those
     sets should appear in the resulting lists
@param <B> any common base class shared by all axes (often just {@link Object})
@return the Cartesian product, as an immutable set containing immutable lists
@throws NullPointerException if {@code sets}, any one of the {@code sets}, or any element of a
     provided set is null
@throws IllegalArgumentException if the cartesian product size exceeds the {@code int} range
@since 2.0

### `powerSet([`java.util.Set<E>`](../../../../java/util/Set.md) set)`

**Returns:** [`java.util.Set<java.util.Set<E>>`](../../../../java/util/Set>.md)

Returns the set of all possible subsets of {@code set}. For example, {@code
 powerSet(ImmutableSet.of(1, 2))} returns the set {@code {{}, {1}, {2}, {1, 2}}}.

 <p>Elements appear in these subsets in the same iteration order as they appeared in the input
 set. The order in which these subsets appear in the outer set is undefined. Note that the power
 set of the empty set is not the empty set, but a one-element set containing the empty set.

 <p>The returned set and its constituent sets use {@code equals} to decide whether two elements
 are identical, even if the input set uses a different concept of equivalence.

 <p><i>Performance notes:</i> while the power set of a set with size {@code n} is of size {@code
 2^n}, its memory usage is only {@code O(n)}. When the power set is constructed, the input set
 is merely copied. Only as the power set is iterated are the individual subsets created, and
 these subsets themselves occupy only a small constant amount of memory.
@param set the set of elements to construct a power set from
@return the power set, as an immutable set of immutable sets
@throws IllegalArgumentException if {@code set} has more than 30 unique elements (causing the
     power set size to exceed the {@code int} range)
@throws NullPointerException if {@code set} is or contains {@code null}
@see <a href="http://en.wikipedia.org/wiki/Power_set">Power set article at Wikipedia</a>
@since 4.0

### `combinations([`java.util.Set<E>`](../../../../java/util/Set.md) set, `int` size)`

**Returns:** [`java.util.Set<java.util.Set<E>>`](../../../../java/util/Set>.md)

Returns the set of all subsets of {@code set} of size {@code size}. For example, {@code
 combinations(ImmutableSet.of(1, 2, 3), 2)} returns the set {@code {{1, 2}, {1, 3}, {2, 3}}}.

 <p>Elements appear in these subsets in the same iteration order as they appeared in the input
 set. The order in which these subsets appear in the outer set is undefined.

 <p>The returned set and its constituent sets use {@code equals} to decide whether two elements
 are identical, even if the input set uses a different concept of equivalence.

 <p><i>Performance notes:</i> the memory usage of the returned set is only {@code O(n)}. When
 the result set is constructed, the input set is merely copied. Only as the result set is
 iterated are the individual subsets created. Each of these subsets occupies an additional O(n)
 memory but only for as long as the user retains a reference to it. That is, the set returned by
 {@code combinations} does not retain the individual subsets.
@param set the set of elements to take combinations of
@param size the number of elements per combination
@return the set of all combinations of {@code size} elements from {@code set}
@throws IllegalArgumentException if {@code size} is not between 0 and {@code set.size()}
     inclusive
@throws NullPointerException if {@code set} is or contains {@code null}
@since 23.0

### `hashCodeImpl([`java.util.Set<?>`](../../../../java/util/Set.md) s)`

**Returns:** `int`

An implementation for {@link Set#hashCode()}.

### `equalsImpl([`java.util.Set<?>`](../../../../java/util/Set.md) s, `java.lang.Object` object)`

**Returns:** `boolean`

An implementation for {@link Set#equals(Object)}.

### `unmodifiableNavigableSet([`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md) set)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

Returns an unmodifiable view of the specified navigable set. This method allows modules to
 provide users with "read-only" access to internal navigable sets. Query operations on the
 returned set "read through" to the specified set, and attempts to modify the returned set,
 whether direct or via its collection views, result in an {@code UnsupportedOperationException}.

 <p>The returned navigable set will be serializable if the specified navigable set is
 serializable.

 <p><b>Java 8 users and later:</b> Prefer {@link Collections#unmodifiableNavigableSet}.
@param set the navigable set for which an unmodifiable view is to be returned
@return an unmodifiable view of the specified navigable set
@since 12.0

### `synchronizedNavigableSet([`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md) navigableSet)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

Returns a synchronized (thread-safe) navigable set backed by the specified navigable set. In
 order to guarantee serial access, it is critical that <b>all</b> access to the backing
 navigable set is accomplished through the returned navigable set (or its views).

 <p>It is imperative that the user manually synchronize on the returned sorted set when
 iterating over it or any of its {@code descendingSet}, {@code subSet}, {@code headSet}, or
 {@code tailSet} views.

 <pre>{@code
 NavigableSet<E> set = synchronizedNavigableSet(new TreeSet<E>());
  ...
 synchronized (set) {
   // Must be in the synchronized block
   Iterator<E> it = set.iterator();
   while (it.hasNext()) {
     foo(it.next());
   }
 }
 }</pre>

 <p>or:

 <pre>{@code
 NavigableSet<E> set = synchronizedNavigableSet(new TreeSet<E>());
 NavigableSet<E> set2 = set.descendingSet().headSet(foo);
  ...
 synchronized (set) { // Note: set, not set2!!!
   // Must be in the synchronized block
   Iterator<E> it = set2.descendingIterator();
   while (it.hasNext())
     foo(it.next());
   }
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned navigable set will be serializable if the specified navigable set is
 serializable.

 <p><b>Java 8 users and later:</b> Prefer {@link Collections#synchronizedNavigableSet}.
@param navigableSet the navigable set to be "wrapped" in a synchronized navigable set.
@return a synchronized view of the specified navigable set.
@since 13.0

### `removeAllImpl([`java.util.Set<?>`](../../../../java/util/Set.md) set, [`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** `boolean`

Remove each element in an iterable from a set.

### `removeAllImpl([`java.util.Set<?>`](../../../../java/util/Set.md) set, [`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

### `subSet([`java.util.NavigableSet<K>`](../../../../java/util/NavigableSet.md) set, [`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** [`java.util.NavigableSet<K>`](../../../../java/util/NavigableSet.md)

Returns a view of the portion of {@code set} whose elements are contained by {@code range}.

 <p>This method delegates to the appropriate methods of {@link NavigableSet} (namely {@link NavigableSet#subSet(Object, boolean, Object, boolean) subSet()}, {@link NavigableSet#tailSet(Object, boolean) tailSet()}, and {@link NavigableSet#headSet(Object,
 boolean) headSet()}) to actually construct the view. Consult these methods for a full
 description of the returned view's behavior.

 <p><b>Warning:</b> {@code Range}s always represent a range of values using the values' natural
 ordering. {@code NavigableSet} on the other hand can specify a custom ordering via a {@link Comparator}, which can violate the natural ordering. Using this method (or in general using
 {@code Range}) with unnaturally-ordered sets can lead to unexpected and undefined behavior.
@since 20.0

