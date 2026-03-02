# Class: `Ordering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Ordering`

**Implements:** `java.util.Comparator<T>`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This is an "enriched" version
 of Comparator for pre-Java-8 users, in the same sense that FluentIterable is an
 enriched Iterable for pre-Java-8 users.

 Three types of methods

 Like other fluent types, there are three types of methods present: methods for *acquiring*,
 *chaining*, and *using*.

 Acquiring

 
The common ways to get an instance of Ordering are:

 

   - Subclass it and implement #compare instead of implementing Comparator
       directly
   - Pass a *pre-existing* Comparator instance to #from(Comparator)
   - Use the natural ordering, Ordering#natural
 


 Chaining

 
Then you can use the *chaining* methods to get an altered version of that 
 Ordering, including:

 

   - #reverse
   - #compound(Comparator)
   - #onResultOf(Function)
   - #nullsFirst / #nullsLast
 


 Using

 
Finally, use the resulting Ordering anywhere a Comparator is required, or use
 any of its special operations, such as:

 

   - #immutableSortedCopy
   - #isOrdered / #isStrictlyOrdered
   - #min / #max
 


 Understanding complex orderings

 
Complex chained orderings like the following example can be challenging to understand.

 

```

 Ordering<Foo> ordering =
     Ordering.natural()
         .nullsFirst()
         .onResultOf(getBarFunction)
         .nullsLast();
 
```


 Note that each chaining method returns a new ordering instance which is backed by the previous
 instance, but has the chance to act on values *before* handing off to that backing instance.
 As a result, it usually helps to read chained ordering expressions *backwards*. For example,
 when compare is called on the above ordering:

 

   - First, if only one Foo is null, that null value is treated as *greater*
   - Next, non-null Foo values are passed to getBarFunction (we will be
       comparing Bar values from now on)
   - Next, if only one Bar is null, that null value is treated as *lesser*
   - Finally, natural ordering is used (i.e. the result of Bar.compareTo(Bar) is
       returned)
 


 
Alas, #reverse is a little different. As you read backwards through a chain and
 encounter a call to reverse, continue working backwards until a result is determined, and
 then reverse that result.

 Additional notes

 
Except as noted, the orderings returned by the factory methods of this class are serializable
 if and only if the provided instances that back them are. For example, if ordering and
 function can themselves be serialized, then ordering.onResultOf(function) can as
 well.

 For Java 8 users

 
If you are using Java 8, this class is now obsolete. Most of its functionality is now provided
 by Stream and by Comparator itself, and the rest can now
 be found as static methods in our new Comparators class. See each method below for
 further instructions. Whenever possible, you should change any references of type 
 Ordering to be of type Comparator instead. However, at this time we have no plan to
 *deprecate* this class.

 
Many replacements involve adopting Stream, and these changes can sometimes make your
 code verbose. Whenever following this advice, you should check whether Stream could be
 adopted more comprehensively in your code; the end result may be quite a bit simpler.

 See also

 
See the Guava User Guide article on [Ordering](https://github.com/google/guava/wiki/OrderingExplained).

## Fields

### `LEFT_IS_GREATER`

**Type:** `int`

### `RIGHT_IS_GREATER`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `natural()`

**Returns:** [`com.google.common.collect.Ordering<C>`](./Ordering.md)

The ordering throws
 a NullPointerException when passed a null parameter.

 
The type specification is <C extends Comparable>, instead of the technically correct
 <C extends Comparable<? super C>>, to support legacy types from before Java 5.

 
**Java 8 users:** use Comparator#naturalOrder instead.

### `from(java.util.Comparator<T> comparator)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

Note that it is
 unnecessary to create a *new* anonymous inner class implementing Comparator just
 to pass it in here. Instead, simply subclass Ordering and implement its compare
 method directly.

 
The returned object is serializable if comparator is serializable.

 
**Java 8 users:** this class is now obsolete as explained in the class documentation, so
 there is no need to use this method.

**Parameters:**
- `comparator` (`java.util.Comparator<T>`): the comparator that defines the order

### `from(com.google.common.collect.Ordering<T> ordering)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Parameters:**
- `ordering` ([`com.google.common.collect.Ordering<T>`](./Ordering.md))

### `explicit(java.util.List<T> valuesInOrder)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

Only objects present in the list (according to Object#equals) may be
 compared. This comparator imposes a "partial ordering" over the type T. Subsequent
 changes to the valuesInOrder list will have no effect on the returned comparator. Null
 values in the list are not supported.

 
The returned comparator throws a ClassCastException when it receives an input
 parameter that isn't among the provided values.

 
The generated comparator is serializable if all the provided values are serializable.

**Parameters:**
- `valuesInOrder` (`java.util.List<T>`): the values that the returned comparator will be able to compare, in the
     order the comparator should induce

### `explicit(T leastValue, T[] remainingValuesInOrder)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

Only objects present in the argument list (according to Object#equals) may
 be compared. This comparator imposes a "partial ordering" over the type T. Null values
 in the argument list are not supported.

 
The returned comparator throws a ClassCastException when it receives an input
 parameter that isn't among the provided values.

 
The generated comparator is serializable if all the provided values are serializable.

**Parameters:**
- `leastValue` (`T`): the value which the returned comparator should consider the "least" of all
     values
- `remainingValuesInOrder` (`T[]`): the rest of the values that the returned comparator will be able
     to compare, in the order the comparator should follow

### `allEqual()`

**Returns:** [`com.google.common.collect.Ordering<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](./Ordering.md)

Note especially that #sortedCopy and #immutableSortedCopy are stable, and in
 the returned instance these are implemented by simply copying the source list.

 
Example:

 

```

 Ordering.allEqual().nullsLast().sortedCopy(
     asList(t, null, e, s, null, t, null))
 
```


 
Assuming t, e and s are non-null, this returns [t, e, s, t,
 null, null, null] regardless of the true comparison order of those three values (which might
 not even implement Comparable at all).

 
**Warning:** by definition, this comparator is not *consistent with equals* (as
 defined here). Avoid its use in APIs, such as TreeSet#TreeSet(Comparator), where such consistency is expected.

 
The returned comparator is serializable.

 
**Java 8 users:** Use the lambda expression (a, b) -> 0 instead (in certain cases
 you may need to cast that to Comparator<YourType>).

### `usingToString()`

**Returns:** [`com.google.common.collect.Ordering<java.lang.Object>`](./Ordering.md)

It does not support null values.

 
The comparator is serializable.

 
**Java 8 users:** Use Comparator.comparing(Object::toString) instead.

### `arbitrary()`

**Returns:** [`com.google.common.collect.Ordering<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](./Ordering.md)

There is no meaning whatsoever to the order imposed, but it
 is constant for the life of the VM.

 
Because the ordering is identity-based, it is not "consistent with Object#equals(Object)" as defined by Comparator. Use caution when building a SortedSet or SortedMap from it, as the resulting collection will not behave exactly
 according to spec.

 
This ordering is not serializable, as its implementation relies on System#identityHashCode(Object), so its behavior cannot be preserved across serialization.

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

**Java 8 users:** Use thisComparator.reversed() instead.

### `nullsFirst()`

**Returns:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable S>`](./Ordering.md)

The returned object is serializable if this object is serializable.

 
**Java 8 users:** Use Comparator.nullsFirst(thisComparator) instead.

### `nullsLast()`

**Returns:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable S>`](./Ordering.md)

The returned object is serializable if this object is serializable.

 
**Java 8 users:** Use Comparator.nullsLast(thisComparator) instead.

### `onResultOf(com.google.common.base.Function<F,? extends T> function)`

**Returns:** [`com.google.common.collect.Ordering<F>`](./Ordering.md)

For example, to compare objects by their
 string forms, in a case-insensitive manner, use:

 

```

 Ordering.from(String.CASE_INSENSITIVE_ORDER)
     .onResultOf(Functions.toStringFunction())
 
```


 
**Java 8 users:** Use Comparator.comparing(function, thisComparator) instead (you
 can omit the comparator if it is the natural order).

**Parameters:**
- `function` ([`com.google.common.base.Function<F,? extends T>`](../base/Function.md))

### `onKeys()`

**Returns:** [`com.google.common.collect.Ordering<java.util.Map.Entry<T2,?>>`](./Ordering.md)

### `compound(java.util.Comparator<? super U> secondaryComparator)`

**Returns:** [`com.google.common.collect.Ordering<U>`](./Ordering.md)

For example, to sort a bug list first by
 status and second by priority, you might use byStatus.compound(byPriority). For a
 compound ordering with three or more components, simply chain multiple calls to this method.

 
An ordering produced by this method, or a chain of calls to this method, is equivalent to
 one created using Ordering#compound(Iterable) on the same component comparators.

 
The returned object is serializable if this object and secondaryComparator are both
 serializable.

 
**Java 8 users:** Use thisComparator.thenComparing(secondaryComparator) instead.
 Depending on what secondaryComparator is, one of the other overloads of 
 thenComparing may be even more useful.

**Parameters:**
- `secondaryComparator` (`java.util.Comparator<? super U>`)

### `compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> comparators)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

The
 returned ordering is based on the state of the comparators iterable at the time it was
 provided to this method.

 
The returned ordering is equivalent to that produced using 
 Ordering.from(comp1).compound(comp2).compound(comp3) . . ..

 
The returned object is serializable if each of the comparators is serializable.

 
**Warning:** Supplying an argument with undefined iteration order, such as a HashSet, will produce non-deterministic results.

 
**Java 8 users:** Use a chain of calls to Comparator#thenComparing(Comparator),
 or comparatorCollection.stream().reduce(Comparator::thenComparing).get() (if the
 collection might be empty, also provide a default comparator as the identity parameter
 to reduce).

**Parameters:**
- `comparators` (`java.lang.Iterable<? extends java.util.Comparator<? super T>>`): the comparators to try in order

### `lexicographical()`

**Returns:** [`com.google.common.collect.Ordering<java.lang.Iterable<S>>`](./Ordering.md)

If the end of one iterable is reached,
 but not the other, the shorter iterable is considered to be less than the longer one. For
 example, a lexicographical natural ordering over integers considers [] < [1] < [1, 1] <
 [1, 2] < [2].

 
Note that ordering.lexicographical().reverse() is not equivalent to 
 ordering.reverse().lexicographical() (consider how each would order [1] and [1,
 1]).

 
**Java 8 users:** Use Comparators#lexicographical(Comparator) instead.

### `compare(T left, T right)`

**Returns:** `int`

**Parameters:**
- `left` (`T`)
- `right` (`T`)

### `min(java.util.Iterator<E> iterator)`

**Returns:** `E`

If there are multiple
 least values, the first of those is returned. The iterator will be left exhausted: its 
 hasNext() method will return false.

 
**Java 8 users:** Use Streams.stream(iterator).min(thisComparator).get() instead
 (but note that it does not guarantee which tied minimum element is returned).

**Parameters:**
- `iterator` (`java.util.Iterator<E>`): the iterator whose minimum element is to be determined

### `min(java.lang.Iterable<E> iterable)`

**Returns:** `E`

If there are multiple
 least values, the first of those is returned.

 
**Java 8 users:** If iterable is a Collection, use 
 Collections.min(collection, thisComparator) instead. Otherwise, use 
 Streams.stream(iterable).min(thisComparator).get() instead. Note that these alternatives do
 not guarantee which tied minimum element is returned.

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`): the iterable whose minimum element is to be determined

### `min(E a, E b)`

**Returns:** `E`

If the values compare as 0,
 the first is returned.

 
**Implementation note:** this method is invoked by the default implementations of the
 other min overloads, so overriding it will affect their behavior.

 
**Note:** Consider using Comparators.min(a, b, thisComparator) instead. If 
 thisComparator is Ordering#natural, then use Comparators.min(a, b).

**Parameters:**
- `a` (`E`): value to compare, returned if less than or equal to b.
- `b` (`E`): value to compare.

### `min(E a, E b, E c, E[] rest)`

**Returns:** `E`

If there are multiple
 least values, the first of those is returned.

 
**Java 8 users:** Use Collections.min(Arrays.asList(a, b, c...), thisComparator)
 instead (but note that it does not guarantee which tied minimum element is returned).

**Parameters:**
- `a` (`E`): value to compare, returned if less than or equal to the rest.
- `b` (`E`): value to compare
- `c` (`E`): value to compare
- `rest` (`E[]`): values to compare

### `max(java.util.Iterator<E> iterator)`

**Returns:** `E`

If there are multiple
 greatest values, the first of those is returned. The iterator will be left exhausted: its
 hasNext() method will return false.

 
**Java 8 users:** Use Streams.stream(iterator).max(thisComparator).get() instead
 (but note that it does not guarantee which tied maximum element is returned).

**Parameters:**
- `iterator` (`java.util.Iterator<E>`): the iterator whose maximum element is to be determined

### `max(java.lang.Iterable<E> iterable)`

**Returns:** `E`

If there are multiple
 greatest values, the first of those is returned.

 
**Java 8 users:** If iterable is a Collection, use 
 Collections.max(collection, thisComparator) instead. Otherwise, use 
 Streams.stream(iterable).max(thisComparator).get() instead. Note that these alternatives do
 not guarantee which tied maximum element is returned.

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`): the iterable whose maximum element is to be determined

### `max(E a, E b)`

**Returns:** `E`

If the values compare as 0,
 the first is returned.

 
**Implementation note:** this method is invoked by the default implementations of the
 other max overloads, so overriding it will affect their behavior.

 
**Note:** Consider using Comparators.max(a, b, thisComparator) instead. If 
 thisComparator is Ordering#natural, then use Comparators.max(a, b).

**Parameters:**
- `a` (`E`): value to compare, returned if greater than or equal to b.
- `b` (`E`): value to compare.

### `max(E a, E b, E c, E[] rest)`

**Returns:** `E`

If there are multiple
 greatest values, the first of those is returned.

 
**Java 8 users:** Use Collections.max(Arrays.asList(a, b, c...), thisComparator)
 instead (but note that it does not guarantee which tied maximum element is returned).

**Parameters:**
- `a` (`E`): value to compare, returned if greater than or equal to the rest.
- `b` (`E`): value to compare
- `c` (`E`): value to compare
- `rest` (`E[]`): values to compare

### `leastOf(java.lang.Iterable<E> iterable, int k)`

**Returns:** `java.util.List<E>`

If there are fewer than k elements present, all will be
 included.

 
The implementation does not necessarily use a *stable* sorting algorithm; when multiple
 elements are equivalent, it is undefined which will come first.

 
**Java 8 users:** Use Streams.stream(iterable).collect(Comparators.least(k,
 thisComparator)) instead.

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)
- `k` (`int`)

### `leastOf(java.util.Iterator<E> iterator, int k)`

**Returns:** `java.util.List<E>`

If there are fewer than k elements present, all will be
 included.

 
The implementation does not necessarily use a *stable* sorting algorithm; when multiple
 elements are equivalent, it is undefined which will come first.

 
**Java 8 users:** Use Streams.stream(iterator).collect(Comparators.least(k,
 thisComparator)) instead.

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)
- `k` (`int`)

### `greatestOf(java.lang.Iterable<E> iterable, int k)`

**Returns:** `java.util.List<E>`

If there are fewer than k elements present, all will be
 included.

 
The implementation does not necessarily use a *stable* sorting algorithm; when multiple
 elements are equivalent, it is undefined which will come first.

 
**Java 8 users:** Use Streams.stream(iterable).collect(Comparators.greatest(k,
 thisComparator)) instead.

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)
- `k` (`int`)

### `greatestOf(java.util.Iterator<E> iterator, int k)`

**Returns:** `java.util.List<E>`

If there are fewer than k elements present, all will be
 included.

 
The implementation does not necessarily use a *stable* sorting algorithm; when multiple
 elements are equivalent, it is undefined which will come first.

 
**Java 8 users:** Use Streams.stream(iterator).collect(Comparators.greatest(k,
 thisComparator)) instead.

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)
- `k` (`int`)

### `sortedCopy(java.lang.Iterable<E> elements)`

**Returns:** `java.util.List<E>`

The
 input is not modified. The returned list is serializable and has random access.

 
Unlike Sets#newTreeSet(Iterable), this method does not discard elements that are
 duplicates according to the comparator. The sort performed is *stable*, meaning that such
 elements will appear in the returned list in the same order they appeared in elements.

 
**Performance note:** According to our
 benchmarking
 on Open JDK 7, #immutableSortedCopy generally performs better (in both time and space)
 than this method, and this method in turn generally performs better than copying the list and
 calling Collections#sort(List).

**Parameters:**
- `elements` (`java.lang.Iterable<E>`)

### `immutableSortedCopy(java.lang.Iterable<E> elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

The input
 is not modified.

 
Unlike Sets#newTreeSet(Iterable), this method does not discard elements that are
 duplicates according to the comparator. The sort performed is *stable*, meaning that such
 elements will appear in the returned list in the same order they appeared in elements.

 
**Performance note:** According to our
 benchmarking
 on Open JDK 7, this method is the most efficient way to make a sorted copy of a collection.

**Parameters:**
- `elements` (`java.lang.Iterable<E>`)

### `isOrdered(java.lang.Iterable<? extends T> iterable)`

**Returns:** `boolean`

Note that this is always
 true when the iterable has fewer than two elements.

 
**Java 8 users:** Use the equivalent Comparators#isInOrder(Iterable, Comparator)
 instead, since the rest of Ordering is mostly obsolete (as explained in the class
 documentation).

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)

### `isStrictlyOrdered(java.lang.Iterable<? extends T> iterable)`

**Returns:** `boolean`

Note that this is always
 true when the iterable has fewer than two elements.

 
**Java 8 users:** Use the equivalent Comparators#isInStrictOrder(Iterable,
 Comparator) instead, since the rest of Ordering is mostly obsolete (as explained in
 the class documentation).

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)

### `binarySearch(java.util.List<? extends T> sortedList, T key)`

**Returns:** `int`

The list must be sorted using this ordering.

**Parameters:**
- `sortedList` (`java.util.List<? extends T>`): the list to be searched
- `key` (`T`): the key to be searched for

