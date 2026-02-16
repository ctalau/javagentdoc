# Interface: `Multiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Multiset`

**Extends:** `java.util.Collection<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A collection that supports order-independent equality, like `Set`, but may have duplicate
 elements. A multiset is also sometimes called a <i>bag</i>.

 <p>Elements of a multiset that are equal to one another are referred to as <i>occurrences</i> of
 the same single element. The total number of occurrences of an element in a multiset is called
 the <i>count</i> of that element (the terms "frequency" and "multiplicity" are equivalent, but
 not used in this API). Since the count of an element is represented as an `int`, a multiset
 may never contain more than `Integer.MAX_VALUE` occurrences of any one element.

 <p>`Multiset` refines the specifications of several methods from `Collection`. It
 also defines an additional query operation, `count`, which returns the count of an
 element. There are five new bulk-modification operations, for example `add(Object, int)`,
 to add or remove multiple occurrences of an element at once, or to set the count of an element to
 a specific value. These modification operations are optional, but implementations which support
 the standard collection operations `add(Object)` or `remove(Object)` are encouraged
 to implement the related methods as well. Finally, two collection views are provided: `elementSet` contains the distinct elements of the multiset "with duplicates collapsed", and
 `entrySet` is similar but contains `Entry` instances, each providing
 both a distinct element and the count of that element.

 <p>In addition to these required methods, implementations of `Multiset` are expected to
 provide two `static` creation methods: `create()`, returning an empty multiset, and
 `create(Iterable<? extends E>)`, returning a multiset containing the given initial
 elements. This is simply a refinement of `Collection`'s constructor recommendations,
 reflecting the new developments of Java 5.

 <p>As with other collection types, the modification operations are optional, and should throw
 `UnsupportedOperationException` when they are not implemented. Most implementations should
 support either all add operations or none of them, all removal operations or none of them, and if
 and only if all of these are supported, the `setCount` methods as well.

 <p>A multiset uses `Object.equals` to determine whether two instances should be considered
 "the same," <i>unless specified otherwise</i> by the implementation.

 <p><b>Warning:</b> as with normal `Set`s, it is almost always a bad idea to modify an
 element (in a way that affects its `Object.equals` behavior) while it is contained in a
 multiset. Undefined behavior and bugs will result.

 <h3>Implementations</h3>

 <ul>
   <li>`ImmutableMultiset`
   <li>`ImmutableSortedMultiset`
   <li>`HashMultiset`
   <li>`LinkedHashMultiset`
   <li>`TreeMultiset`
   <li>`EnumMultiset`
   <li>`ConcurrentHashMultiset`
 </ul>

 <p>If your values may be zero, negative, or outside the range of an int, you may wish to use
 `com.google.common.util.concurrent.AtomicLongMap` instead. Note, however, that unlike
 `Multiset`, `AtomicLongMap` does not automatically remove zeros.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">`Multiset`</a>.
**Author:** Kevin Bourrillion
**Since:** 2.0

## Methods

### `size()`

**Returns:** `int`

Returns the total number of all occurrences of all elements in this multiset.

 <p><b>Note:</b> this method does not return the number of <i>distinct elements</i> in the
 multiset, which is given by `entrySet().size()`.

### `count(`java.lang.Object` element)`

**Returns:** `int`

Returns the number of occurrences of an element in this multiset (the <i>count</i> of the
 element). Note that for an `Object.equals`-based multiset, this gives the same result as
 `Collections.frequency` (which would presumably perform more poorly).

 <p><b>Note:</b> the utility method `Iterables.frequency` generalizes this operation; it
 correctly delegates to this method when dealing with a multiset, but it can also accept any
 other iterable type.
@param element the element to count occurrences of
@return the number of occurrences of the element in this multiset; possibly zero but never
     negative

### `add(`E` element, `int` occurrences)`

**Returns:** `int`

Adds a number of occurrences of an element to this multiset. Note that if `occurrences ==
 1`, this method has the identical effect to `add(Object)`. This method is functionally
 equivalent (except in the case of overflow) to the call `addAll(Collections.nCopies(element, occurrences))`, which would presumably perform much more
 poorly.
@param element the element to add occurrences of; may be null only if explicitly allowed by the
     implementation
@param occurrences the number of occurrences of the element to add. May be zero, in which case
     no change will be made.
@return the count of the element before the operation; possibly zero
@throws IllegalArgumentException if `occurrences` is negative, or if this operation would
     result in more than `Integer.MAX_VALUE` occurrences of the element
@throws NullPointerException if `element` is null and this implementation does not permit
     null elements. Note that if `occurrences` is zero, the implementation may opt to
     return normally.

### `add(`E` element)`

**Returns:** `boolean`

Adds a single occurrence of the specified element to this multiset.

 <p>This method refines `Collection.add`, which only <i>ensures</i> the presence of the
 element, to further specify that a successful call must always increment the count of the
 element, and the overall size of the collection, by one.

 <p>To both add the element and obtain the previous count of that element, use `add(Object, int) add``(element, 1)` instead.
@param element the element to add one occurrence of; may be null only if explicitly allowed by
     the implementation
@return `true` always, since this call is required to modify the multiset, unlike other
     `Collection` types
@throws NullPointerException if `element` is null and this implementation does not permit
     null elements
@throws IllegalArgumentException if `Integer.MAX_VALUE` occurrences of `element`
     are already contained in this multiset

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

Removes a number of occurrences of the specified element from this multiset. If the multiset
 contains fewer than this number of occurrences to begin with, all occurrences will be removed.
 Note that if `occurrences == 1`, this is functionally equivalent to the call `remove(element)`.
@param element the element to conditionally remove occurrences of
@param occurrences the number of occurrences of the element to remove. May be zero, in which
     case no change will be made.
@return the count of the element before the operation; possibly zero
@throws IllegalArgumentException if `occurrences` is negative

### `remove(`java.lang.Object` element)`

**Returns:** `boolean`

Removes a <i>single</i> occurrence of the specified element from this multiset, if present.

 <p>This method refines `Collection.remove` to further specify that it <b>may not</b>
 throw an exception in response to `element` being null or of the wrong type.

 <p>To both remove the element and obtain the previous count of that element, use `remove(Object, int) remove``(element, 1)` instead.
@param element the element to remove one occurrence of
@return `true` if an occurrence was found and removed

### `setCount(`E` element, `int` count)`

**Returns:** `int`

Adds or removes the necessary occurrences of an element such that the element attains the
 desired count.
@param element the element to add or remove occurrences of; may be null only if explicitly
     allowed by the implementation
@param count the desired count of the element in this multiset
@return the count of the element before the operation; possibly zero
@throws IllegalArgumentException if `count` is negative
@throws NullPointerException if `element` is null and this implementation does not permit
     null elements. Note that if `count` is zero, the implementor may optionally return
     zero instead.

### `setCount(`E` element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

Conditionally sets the count of an element to a new value, as described in `setCount(Object, int)`, provided that the element has the expected current count. If the
 current count is not `oldCount`, no change is made.
@param element the element to conditionally set the count of; may be null only if explicitly
     allowed by the implementation
@param oldCount the expected present count of the element in this multiset
@param newCount the desired count of the element in this multiset
@return `true` if the condition for modification was met. This implies that the multiset
     was indeed modified, unless `oldCount == newCount`.
@throws IllegalArgumentException if `oldCount` or `newCount` is negative
@throws NullPointerException if `element` is null and the implementation does not permit
     null elements. Note that if `oldCount` and `newCount` are both zero, the
     implementor may optionally return `true` instead.

### `elementSet()`

**Returns:** `java.util.Set<E>`

Returns the set of distinct elements contained in this multiset. The element set is backed by
 the same data as the multiset, so any change to either is immediately reflected in the other.
 The order of the elements in the element set is unspecified.

 <p>If the element set supports any removal operations, these necessarily cause <b>all</b>
 occurrences of the removed element(s) to be removed from the multiset. Implementations are not
 expected to support the add operations, although this is possible.

 <p>A common use for the element set is to find the number of distinct elements in the multiset:
 `elementSet().size()`.
@return a view of the set of distinct elements in this multiset

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

Returns a view of the contents of this multiset, grouped into `Multiset.Entry` instances,
 each providing an element of the multiset and the count of that element. This set contains
 exactly one entry for each distinct element in the multiset (thus it always has the same size
 as the `elementSet`). The order of the elements in the element set is unspecified.

 <p>The entry set is backed by the same data as the multiset, so any change to either is
 immediately reflected in the other. However, multiset changes may or may not be reflected in
 any `Entry` instances already retrieved from the entry set (this is
 implementation-dependent). Furthermore, implementations are not required to support
 modifications to the entry set at all, and the `Entry` instances themselves don't even
 have methods for modification. See the specific implementation class for more details on how
 its entry set handles modifications.
@return a set of entries representing the data of this multiset

### `forEachEntry(`java.util.function.ObjIntConsumer<? super E>` action)`

**Returns:** `void`

Runs the specified action for each distinct element in this multiset, and the number of
 occurrences of that element. For some `Multiset` implementations, this may be more
 efficient than iterating over the `entrySet()` either explicitly or with `entrySet().forEach(action)`.
**Since:** 21.0

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Compares the specified object with this multiset for equality. Returns `true` if the
 given object is also a multiset and contains equal elements with equal counts, regardless of
 order.

### `hashCode()`

**Returns:** `int`

Returns the hash code for this multiset. This is defined as the sum of

 <pre>`((element == null) ? 0 : element.hashCode()) ^ count(element)
 `</pre>

 <p>over all distinct elements in the multiset. It follows that a multiset and its entry set
 always have the same hash code.

### `toString()`

**Returns:** `java.lang.String`

{@inheritDoc}

 <p>It is recommended, though not mandatory, that this method return the result of invoking
 `toString` on the `entrySet`, yielding a result such as `[a x 3, c, d x 2,
 e]`.

### `iterator()`

**Returns:** `java.util.Iterator<E>`

{@inheritDoc}

 <p>Elements that occur multiple times in the multiset will appear multiple times in this
 iterator, though not necessarily sequentially.

### `contains(`java.lang.Object` element)`

**Returns:** `boolean`

Determines whether this multiset contains the specified element.

 <p>This method refines `Collection.contains` to further specify that it <b>may not</b>
 throw an exception in response to `element` being null or of the wrong type.
@param element the element to check for
@return `true` if this multiset contains at least one occurrence of the element

### `containsAll(`java.util.Collection<?>` elements)`

**Returns:** `boolean`

Returns `true` if this multiset contains at least one occurrence of each element in the
 specified collection.

 <p>This method refines `Collection.containsAll` to further specify that it <b>may not</b>
 throw an exception in response to any of `elements` being null or of the wrong type.

 <p><b>Note:</b> this method does not take into account the occurrence count of an element in
 the two collections; it may still return `true` even if `elements` contains several
 occurrences of an element and this multiset contains only one. This is no different than any
 other collection type like `List`, but it may be unexpected to the user of a multiset.
@param elements the collection of elements to be checked for containment in this multiset
@return `true` if this multiset contains at least one occurrence of each element
     contained in `elements`
@throws NullPointerException if `elements` is null

### `removeAll(`java.util.Collection<?>` c)`

**Returns:** `boolean`

{@inheritDoc}

 <p><b>Note:</b> This method ignores how often any element might appear in `c`, and only
 cares whether or not an element appears at all. If you wish to remove one occurrence in this
 multiset for every occurrence in `c`, see `Multisets.removeOccurrences(Multiset,
 Multiset)`.

 <p>This method refines `Collection.removeAll` to further specify that it <b>may not</b>
 throw an exception in response to any of `elements` being null or of the wrong type.

### `retainAll(`java.util.Collection<?>` c)`

**Returns:** `boolean`

{@inheritDoc}

 <p><b>Note:</b> This method ignores how often any element might appear in `c`, and only
 cares whether or not an element appears at all. If you wish to remove one occurrence in this
 multiset for every occurrence in `c`, see `Multisets.retainOccurrences(Multiset,
 Multiset)`.

 <p>This method refines `Collection.retainAll` to further specify that it <b>may not</b>
 throw an exception in response to any of `elements` being null or of the wrong type.
**See:** Multisets#retainOccurrences(Multiset, Multiset)

### `forEach(`java.util.function.Consumer<? super E>` action)`

**Returns:** `void`

{@inheritDoc}

 <p>Elements that occur multiple times in the multiset will be passed to the `Consumer`
 correspondingly many times, though not necessarily sequentially.

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

