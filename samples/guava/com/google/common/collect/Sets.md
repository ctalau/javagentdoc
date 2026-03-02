# Class: `Sets`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Sets`

## Description

Also see this class's counterparts
 Lists, Maps and Queues.

 
See the Guava User Guide article on [Sets](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#sets).

## Constructors

### `<init>()`

## Methods

### `immutableEnumSet(E anElement, E[] otherElements)`

Internally, the returned
 set will be backed by an EnumSet.

 
The iteration order of the returned set follows the enum's iteration order, not the order in
 which the elements are provided to the method.

**Parameters:**
- `anElement` (`E`): one of the elements the set should contain
- `otherElements` (`E[]`): the rest of the elements the set should contain

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `immutableEnumSet(Iterable<E> elements)`

Internally, the returned
 set will be backed by an EnumSet.

 
The iteration order of the returned set follows the enum's iteration order, not the order in
 which the elements appear in the given collection.

**Parameters:**
- `elements` (`java.lang.Iterable<E>`): the elements, all of the same enum type, that the set should contain

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `toImmutableEnumSet()`

Unlike ImmutableSet#toImmutableSet, the
 resulting set will iterate over elements in their enum definition order, not encounter order.

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`

### `newEnumSet(Iterable<E> iterable, Class<E> elementType)`

This method behaves identically to EnumSet#copyOf(Collection), but also
 accepts non-Collection iterables and empty iterables.

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)
- `elementType` (`java.lang.Class<E>`)

**Returns:** `java.util.EnumSet<E>`

### `newHashSet()`

**Note:** if mutability is not required, use ImmutableSet#of() instead. If 
 E is an Enum type, use EnumSet#noneOf instead. Otherwise, strongly consider
 using a LinkedHashSet instead, at the cost of increased memory footprint, to get
 deterministic iteration behavior.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the HashSet constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Returns:** `java.util.HashSet<E>`

### `newHashSet(E[] elements)`

**Note:** if elements are non-null and won't be added or removed after this point, use
 ImmutableSet#of() or ImmutableSet#copyOf(Object[]) instead. If E is an
 Enum type, use EnumSet#of(Enum, Enum[]) instead. Otherwise, strongly consider
 using a LinkedHashSet instead, at the cost of increased memory footprint, to get
 deterministic iteration behavior.

 
This method is just a small convenience, either for newHashSet(asList(...)), or for creating an empty set then calling Collections#addAll.
 This method is not actually very useful and will likely be deprecated in the future.

**Parameters:**
- `elements` (`E[]`)

**Returns:** `java.util.HashSet<E>`

### `newHashSet(Iterable<? extends E> elements)`

A very thin
 convenience for creating an empty set then calling Collection#addAll or Iterables#addAll.

 
**Note:** if mutability is not required and the elements are non-null, use ImmutableSet#copyOf(Iterable) instead. (Or, change elements to be a FluentIterable and call elements.toSet().)

 
**Note:** if E is an Enum type, use #newEnumSet(Iterable, Class)
 instead.

 
**Note:** if elements is a Collection, you don't need this method.
 Instead, use the HashSet constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

 
Overall, this method is not very useful and will likely be deprecated in the future.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** `java.util.HashSet<E>`

### `newHashSet(Iterator<? extends E> elements)`

A very thin
 convenience for creating an empty set and then calling Iterators#addAll.

 
**Note:** if mutability is not required and the elements are non-null, use ImmutableSet#copyOf(Iterator) instead.

 
**Note:** if E is an Enum type, you should create an EnumSet
 instead.

 
Overall, this method is not very useful and will likely be deprecated in the future.

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

**Returns:** `java.util.HashSet<E>`

### `newHashSetWithExpectedSize(int expectedSize)`

Note that this is not what HashSet#HashSet(int) does, but it
 is what most users want and expect it to do.

 
This behavior can't be broadly guaranteed, but has been tested with OpenJDK 1.7 and 1.8.

**Parameters:**
- `expectedSize` (`int`): the number of elements you expect to add to the returned set

**Returns:** `java.util.HashSet<E>`

### `newConcurrentHashSet()`

The set is backed by a ConcurrentHashMap instance, and thus carries the same concurrency guarantees.

 
Unlike HashSet, this class does NOT allow null to be used as an element. The
 set is serializable.

**Returns:** `java.util.Set<E>`

### `newConcurrentHashSet(Iterable<? extends E> elements)`

The set is
 backed by a ConcurrentHashMap instance, and thus carries the same concurrency
 guarantees.

 
Unlike HashSet, this class does NOT allow null to be used as an element. The
 set is serializable.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`): the elements that the set should contain

**Returns:** `java.util.Set<E>`

### `newLinkedHashSet()`

**Note:** if mutability is not required, use ImmutableSet#of() instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the LinkedHashSet constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Returns:** `java.util.LinkedHashSet<E>`

### `newLinkedHashSet(Iterable<? extends E> elements)`

**Note:** if mutability is not required and the elements are non-null, use ImmutableSet#copyOf(Iterable) instead.

 
**Note:** if elements is a Collection, you don't need this method.
 Instead, use the LinkedHashSet constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

 
Overall, this method is not very useful and will likely be deprecated in the future.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`): the elements that the set should contain, in order

**Returns:** `java.util.LinkedHashSet<E>`

### `newLinkedHashSetWithExpectedSize(int expectedSize)`

This behavior cannot be
 broadly guaranteed, but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed
 that the method isn't inadvertently *oversizing* the returned set.

**Parameters:**
- `expectedSize` (`int`): the number of elements you expect to add to the returned set

**Returns:** `java.util.LinkedHashSet<E>`

### `newTreeSet()`

**Note:** if mutability is not required, use ImmutableSortedSet#of() instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the TreeSet constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Returns:** `java.util.TreeSet<E>`

### `newTreeSet(Iterable<? extends E> elements)`

**Note:** if mutability is not required, use ImmutableSortedSet#copyOf(Iterable)
 instead.

 
**Note:** If elements is a SortedSet with an explicit comparator, this
 method has different behavior than TreeSet#TreeSet(SortedSet), which returns a 
 TreeSet with that comparator.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the TreeSet constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

 
This method is just a small convenience for creating an empty set and then calling Iterables#addAll. This method is not very useful and will likely be deprecated in the future.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`): the elements that the set should contain

**Returns:** `java.util.TreeSet<E>`

### `newTreeSet(Comparator<? super E> comparator)`

**Note:** if mutability is not required, use 
 ImmutableSortedSet.orderedBy(comparator).build() instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the TreeSet constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi). One caveat to this is that the TreeSet
 constructor uses a null Comparator to mean "natural ordering," whereas this factory
 rejects null. Clean your code accordingly.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`): the comparator to use to sort the set

**Returns:** `java.util.TreeSet<E>`

### `newIdentityHashSet()`

It compares object
 references, instead of calling equals, to determine whether a provided object matches
 an element in the set. For example, contains returns false when passed an
 object that equals a set member, but isn't the same instance. This behavior is similar to the
 way IdentityHashMap handles key lookups.

**Returns:** `java.util.Set<E>`

### `newCopyOnWriteArraySet()`

**Note:** if you need an immutable empty Set, use Collections#emptySet
 instead.

**Returns:** `java.util.concurrent.CopyOnWriteArraySet<E>`

### `newCopyOnWriteArraySet(Iterable<? extends E> elements)`

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`): the elements that the set should contain, in order

**Returns:** `java.util.concurrent.CopyOnWriteArraySet<E>`

### `complementOf(Collection<E> collection)`

If the collection is an EnumSet, this method has the same behavior as
 EnumSet#complementOf. Otherwise, the specified collection must contain at least one
 element, in order to determine the element type. If the collection could be empty, use #complementOf(Collection, Class) instead of this method.

**Parameters:**
- `collection` (`java.util.Collection<E>`): the collection whose complement should be stored in the enum set

**Returns:** `java.util.EnumSet<E>`

### `complementOf(Collection<E> collection, Class<E> type)`

This is equivalent to EnumSet#complementOf, but can act on any input
 collection, as long as the elements are of enum type.

**Parameters:**
- `collection` (`java.util.Collection<E>`): the collection whose complement should be stored in the EnumSet
- `type` (`java.lang.Class<E>`): the type of the elements in the set

**Returns:** `java.util.EnumSet<E>`

### `makeComplementByHand(Collection<E> collection, Class<E> type)`

**Parameters:**
- `collection` (`java.util.Collection<E>`)
- `type` (`java.lang.Class<E>`)

**Returns:** `java.util.EnumSet<E>`

### `newSetFromMap(Map<E,Boolean> map)`

The resulting set displays the same ordering,
 concurrency, and performance characteristics as the backing map. In essence, this factory
 method provides a Set implementation corresponding to any Map implementation.
 There is no need to use this method on a Map implementation that already has a
 corresponding Set implementation (such as java.util.HashMap or java.util.TreeMap).

 
Each method invocation on the set returned by this method results in exactly one method
 invocation on the backing map or its keySet view, with one exception. The 
 addAll method is implemented as a sequence of put invocations on the backing map.

 
The specified map must be empty at the time this method is invoked, and should not be
 accessed directly after this method returns. These conditions are ensured if the map is created
 empty, passed directly to this method, and no reference to the map is retained, as illustrated
 in the following code fragment:

 

```

 Set<Object> identityHashSet = Sets.newSetFromMap(
     new IdentityHashMap<Object, Boolean>());
 
```


 
The returned set is serializable if the backing map is.

**Parameters:**
- `map` (`java.util.Map<E,java.lang.Boolean>`): the backing map

**Returns:** `java.util.Set<E>`

### `union(Set<? extends E> set1, Set<? extends E> set2)`

The returned set contains all
 elements that are contained in either backing set. Iterating over the returned set iterates
 first over all the elements of set1, then over each element of set2, in order,
 that is not contained in set1.

 
Results are undefined if set1 and set2 are sets based on different
 equivalence relations, for example if set1 is a HashSet and set2 is a
 TreeSet or the Map#keySet of an IdentityHashMap.

**Parameters:**
- `set1` (`java.util.Set<? extends E>`)
- `set2` (`java.util.Set<? extends E>`)

**Returns:** `com.google.common.collect.Sets.SetView<E>`

### `intersection(Set<E> set1, Set<?> set2)`

The returned set contains
 all elements that are contained by both backing sets. The iteration order of the returned set
 matches that of set1.

 
Results are undefined if set1 and set2 are sets based on different
 equivalence relations, for example if set1 is a HashSet and set2 is a
 TreeSet or the Map#keySet of an IdentityHashMap.

 
**Note:** The returned view performs slightly better when set1 is the smaller of
 the two sets. If you have reason to believe one of your sets will generally be smaller than the
 other, pass it first. Unfortunately, since this method sets the generic type of the returned
 set based on the type of the first set passed, this could in rare cases force you to make a
 cast, for example:

 

```

 Set<Object> aFewBadObjects = ...
 Set<String> manyBadStrings = ...

 // impossible for a non-String to be in the intersection
 SuppressWarnings("unchecked")
 Set<String> badStrings = (Set) Sets.intersection(
     aFewBadObjects, manyBadStrings);
 
```


 
This is unfortunate, but should come up only very rarely.

**Parameters:**
- `set1` (`java.util.Set<E>`)
- `set2` (`java.util.Set<?>`)

**Returns:** `com.google.common.collect.Sets.SetView<E>`

### `difference(Set<E> set1, Set<?> set2)`

The returned set contains
 all elements that are contained by set1 and not contained by set2. set2
 may also contain elements not present in set1; these are simply ignored. The iteration
 order of the returned set matches that of set1.

 
Results are undefined if set1 and set2 are sets based on different
 equivalence relations, for example if set1 is a HashSet and set2 is a
 TreeSet or the Map#keySet of an IdentityHashMap.

**Parameters:**
- `set1` (`java.util.Set<E>`)
- `set2` (`java.util.Set<?>`)

**Returns:** `com.google.common.collect.Sets.SetView<E>`

### `symmetricDifference(Set<? extends E> set1, Set<? extends E> set2)`

The returned set
 contains all elements that are contained in either set1 or set2 but not in
 both. The iteration order of the returned set is undefined.

 
Results are undefined if set1 and set2 are sets based on different
 equivalence relations, for example if set1 is a HashSet and set2 is a
 TreeSet or the Map#keySet of an IdentityHashMap.

**Parameters:**
- `set1` (`java.util.Set<? extends E>`)
- `set2` (`java.util.Set<? extends E>`)

**Returns:** `com.google.common.collect.Sets.SetView<E>`

### `filter(Set<E> unfiltered, Predicate<? super E> predicate)`

The returned set is a live
 view of unfiltered; changes to one affect the other.

 
The resulting set's iterator does not support remove(), but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's 
 add() and addAll() methods throw an IllegalArgumentException. When methods
 such as removeAll() and clear() are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 
The returned set isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered set's methods, such as size(), iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 *not* needed, it may be faster to copy Iterables.filter(unfiltered, predicate) and
 use the copy.

 
**Warning:** predicate must be *consistent with equals*, as documented at
 Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals. (See Iterables#filter(Iterable, Class) for related functionality.)

 
**Java 8 users:** many use cases for this method are better addressed by java.util.stream.Stream#filter. This method is not being deprecated, but we gently encourage
 you to migrate to streams.

**Parameters:**
- `unfiltered` (`java.util.Set<E>`)
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

**Returns:** `java.util.Set<E>`

### `filter(SortedSet<E> unfiltered, Predicate<? super E> predicate)`

The
 returned set is a live view of unfiltered; changes to one affect the other.

 
The resulting set's iterator does not support remove(), but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's 
 add() and addAll() methods throw an IllegalArgumentException. When methods
 such as removeAll() and clear() are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 
The returned set isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered set's methods, such as size(), iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 *not* needed, it may be faster to copy Iterables.filter(unfiltered, predicate) and
 use the copy.

 
**Warning:** predicate must be *consistent with equals*, as documented at
 Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals. (See Iterables#filter(Iterable, Class) for related functionality.)

**Parameters:**
- `unfiltered` (`java.util.SortedSet<E>`)
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

**Returns:** `java.util.SortedSet<E>`

### `filter(NavigableSet<E> unfiltered, Predicate<? super E> predicate)`

The returned set is a live view of unfiltered; changes to one affect the other.

 
The resulting set's iterator does not support remove(), but all other set methods
 are supported. When given an element that doesn't satisfy the predicate, the set's 
 add() and addAll() methods throw an IllegalArgumentException. When methods
 such as removeAll() and clear() are called on the filtered set, only elements
 that satisfy the filter will be removed from the underlying set.

 
The returned set isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered set's methods, such as size(), iterate across every element in
 the underlying set and determine which elements satisfy the filter. When a live view is
 *not* needed, it may be faster to copy Iterables.filter(unfiltered, predicate) and
 use the copy.

 
**Warning:** predicate must be *consistent with equals*, as documented at
 Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals. (See Iterables#filter(Iterable, Class) for related functionality.)

**Parameters:**
- `unfiltered` (`java.util.NavigableSet<E>`)
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

**Returns:** `java.util.NavigableSet<E>`

### `cartesianProduct(List<? extends Set<? extends B>> sets)`

For example:

 

```

 Sets.cartesianProduct(ImmutableList.of(
     ImmutableSet.of(1, 2),
     ImmutableSet.of("A", "B", "C")))
 
```


 
returns a set containing six lists:

 

   - ImmutableList.of(1, "A")
   - ImmutableList.of(1, "B")
   - ImmutableList.of(1, "C")
   - ImmutableList.of(2, "A")
   - ImmutableList.of(2, "B")
   - ImmutableList.of(2, "C")
 


 
The result is guaranteed to be in the "traditional", lexicographical order for Cartesian
 products that you would get from nesting for loops:

 

```

 for (B b0 : sets.get(0)) {
   for (B b1 : sets.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   }
 }
 
```


 
Note that if any input set is empty, the Cartesian product will also be empty. If no sets at
 all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 
*Performance notes:* while the cartesian product of sets of size m, n, p is a
 set of size m x n x p, its actual memory consumption is much smaller. When the
 cartesian set is constructed, the input sets are merely copied. Only as the resulting set is
 iterated are the individual lists created, and these are not retained after iteration.

**Parameters:**
- `sets` (`java.util.List<? extends java.util.Set<? extends B>>`): the sets to choose elements from, in the order that the elements chosen from those
       sets should appear in the resulting lists

**Returns:** `java.util.Set<java.util.List<B>>`

### `cartesianProduct(Set<? extends B>[] sets)`

For example:

 

```

 Sets.cartesianProduct(
     ImmutableSet.of(1, 2),
     ImmutableSet.of("A", "B", "C"))
 
```


 
returns a set containing six lists:

 

   - ImmutableList.of(1, "A")
   - ImmutableList.of(1, "B")
   - ImmutableList.of(1, "C")
   - ImmutableList.of(2, "A")
   - ImmutableList.of(2, "B")
   - ImmutableList.of(2, "C")
 


 
The result is guaranteed to be in the "traditional", lexicographical order for Cartesian
 products that you would get from nesting for loops:

 

```

 for (B b0 : sets.get(0)) {
   for (B b1 : sets.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   }
 }
 
```


 
Note that if any input set is empty, the Cartesian product will also be empty. If no sets at
 all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 
*Performance notes:* while the cartesian product of sets of size m, n, p is a
 set of size m x n x p, its actual memory consumption is much smaller. When the
 cartesian set is constructed, the input sets are merely copied. Only as the resulting set is
 iterated are the individual lists created, and these are not retained after iteration.

**Parameters:**
- `sets` (`java.util.Set<? extends B>[]`): the sets to choose elements from, in the order that the elements chosen from those
       sets should appear in the resulting lists

**Returns:** `java.util.Set<java.util.List<B>>`

### `powerSet(Set<E> set)`

For example, 
 powerSet(ImmutableSet.of(1, 2)) returns the set {{}, {1}, {2}, {1, 2}}.

 
Elements appear in these subsets in the same iteration order as they appeared in the input
 set. The order in which these subsets appear in the outer set is undefined. Note that the power
 set of the empty set is not the empty set, but a one-element set containing the empty set.

 
The returned set and its constituent sets use equals to decide whether two elements
 are identical, even if the input set uses a different concept of equivalence.

 
*Performance notes:* while the power set of a set with size n is of size 
 2^n, its memory usage is only O(n). When the power set is constructed, the input set
 is merely copied. Only as the power set is iterated are the individual subsets created, and
 these subsets themselves occupy only a small constant amount of memory.

**Parameters:**
- `set` (`java.util.Set<E>`): the set of elements to construct a power set from

**Returns:** `java.util.Set<java.util.Set<E>>`

### `combinations(Set<E> set, int size)`

For example, 
 combinations(ImmutableSet.of(1, 2, 3), 2) returns the set {{1, 2}, {1, 3}, {2, 3}}.

 
Elements appear in these subsets in the same iteration order as they appeared in the input
 set. The order in which these subsets appear in the outer set is undefined.

 
The returned set and its constituent sets use equals to decide whether two elements
 are identical, even if the input set uses a different concept of equivalence.

 
*Performance notes:* the memory usage of the returned set is only O(n). When
 the result set is constructed, the input set is merely copied. Only as the result set is
 iterated are the individual subsets created. Each of these subsets occupies an additional O(n)
 memory but only for as long as the user retains a reference to it. That is, the set returned by
 combinations does not retain the individual subsets.

**Parameters:**
- `set` (`java.util.Set<E>`): the set of elements to take combinations of
- `size` (`int`): the number of elements per combination

**Returns:** `java.util.Set<java.util.Set<E>>`

### `hashCodeImpl(Set<?> s)`

**Parameters:**
- `s` (`java.util.Set<?>`)

**Returns:** `int`

### `equalsImpl(Set<?> s, Object object)`

**Parameters:**
- `s` (`java.util.Set<?>`)
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `unmodifiableNavigableSet(NavigableSet<E> set)`

This method allows modules to
 provide users with "read-only" access to internal navigable sets. Query operations on the
 returned set "read through" to the specified set, and attempts to modify the returned set,
 whether direct or via its collection views, result in an UnsupportedOperationException.

 
The returned navigable set will be serializable if the specified navigable set is
 serializable.

 
**Java 8 users and later:** Prefer Collections#unmodifiableNavigableSet.

**Parameters:**
- `set` (`java.util.NavigableSet<E>`): the navigable set for which an unmodifiable view is to be returned

**Returns:** `java.util.NavigableSet<E>`

### `synchronizedNavigableSet(NavigableSet<E> navigableSet)`

In
 order to guarantee serial access, it is critical that **all** access to the backing
 navigable set is accomplished through the returned navigable set (or its views).

 
It is imperative that the user manually synchronize on the returned sorted set when
 iterating over it or any of its descendingSet, subSet, headSet, or
 tailSet views.

 

```

 NavigableSet<E> set = synchronizedNavigableSet(new TreeSet<E>());
  ...
 synchronized (set) {
   // Must be in the synchronized block
   Iterator<E> it = set.iterator();
   while (it.hasNext()) {
     foo(it.next());
   }
 }
 
```


 
or:

 

```

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
```


 
Failure to follow this advice may result in non-deterministic behavior.

 
The returned navigable set will be serializable if the specified navigable set is
 serializable.

 
**Java 8 users and later:** Prefer Collections#synchronizedNavigableSet.

**Parameters:**
- `navigableSet` (`java.util.NavigableSet<E>`): the navigable set to be "wrapped" in a synchronized navigable set.

**Returns:** `java.util.NavigableSet<E>`

### `removeAllImpl(Set<?> set, Iterator<?> iterator)`

**Parameters:**
- `set` (`java.util.Set<?>`)
- `iterator` (`java.util.Iterator<?>`)

**Returns:** `boolean`

### `removeAllImpl(Set<?> set, Collection<?> collection)`

**Parameters:**
- `set` (`java.util.Set<?>`)
- `collection` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `subSet(NavigableSet<K> set, Range<K> range)`

This method delegates to the appropriate methods of NavigableSet (namely subSet(), tailSet(), and headSet()) to actually construct the view. Consult these methods for a full
 description of the returned view's behavior.

 
**Warning:** Ranges always represent a range of values using the values' natural
 ordering. NavigableSet on the other hand can specify a custom ordering via a Comparator, which can violate the natural ordering. Using this method (or in general using
 Range) with unnaturally-ordered sets can lead to unexpected and undefined behavior.

**Parameters:**
- `set` (`java.util.NavigableSet<K>`)
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))

**Returns:** `java.util.NavigableSet<K>`

