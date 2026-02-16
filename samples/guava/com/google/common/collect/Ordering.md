# Class: `Ordering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Ordering`

**Implements:** `java.util.Comparator<T>`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A comparator, with additional methods to support common operations. This is an "enriched" version
 of `Comparator` for pre-Java-8 users, in the same sense that `FluentIterable` is an
 enriched `Iterable` for pre-Java-8 users.

 <h3>Three types of methods</h3>

 Like other fluent types, there are three types of methods present: methods for <i>acquiring</i>,
 <i>chaining</i>, and <i>using</i>.

 <h4>Acquiring</h4>

 <p>The common ways to get an instance of `Ordering` are:

 <ul>
   <li>Subclass it and implement `compare` instead of implementing `Comparator`
       directly
   <li>Pass a <i>pre-existing</i> `Comparator` instance to `from(Comparator)`
   <li>Use the natural ordering, `Ordering.natural`
 </ul>

 <h4>Chaining</h4>

 <p>Then you can use the <i>chaining</i> methods to get an altered version of that `Ordering`, including:

 <ul>
   <li>`reverse`
   <li>`compound(Comparator)`
   <li>`onResultOf(Function)`
   <li>`nullsFirst` / `nullsLast`
 </ul>

 <h4>Using</h4>

 <p>Finally, use the resulting `Ordering` anywhere a `Comparator` is required, or use
 any of its special operations, such as:

 <ul>
   <li>`immutableSortedCopy`
   <li>`isOrdered` / `isStrictlyOrdered`
   <li>`min` / `max`
 </ul>

 <h3>Understanding complex orderings</h3>

 <p>Complex chained orderings like the following example can be challenging to understand.

 <pre>`Ordering<Foo> ordering =
     Ordering.natural()
         .nullsFirst()
         .onResultOf(getBarFunction)
         .nullsLast();
 `</pre>

 Note that each chaining method returns a new ordering instance which is backed by the previous
 instance, but has the chance to act on values <i>before</i> handing off to that backing instance.
 As a result, it usually helps to read chained ordering expressions <i>backwards</i>. For example,
 when `compare` is called on the above ordering:

 <ol>
   <li>First, if only one `Foo` is null, that null value is treated as <i>greater</i>
   <li>Next, non-null `Foo` values are passed to `getBarFunction` (we will be
       comparing `Bar` values from now on)
   <li>Next, if only one `Bar` is null, that null value is treated as <i>lesser</i>
   <li>Finally, natural ordering is used (i.e. the result of `Bar.compareTo(Bar)` is
       returned)
 </ol>

 <p>Alas, `reverse` is a little different. As you read backwards through a chain and
 encounter a call to `reverse`, continue working backwards until a result is determined, and
 then reverse that result.

 <h3>Additional notes</h3>

 <p>Except as noted, the orderings returned by the factory methods of this class are serializable
 if and only if the provided instances that back them are. For example, if `ordering` and
 `function` can themselves be serialized, then `ordering.onResultOf(function)` can as
 well.

 <h3>For Java 8 users</h3>

 <p>If you are using Java 8, this class is now obsolete. Most of its functionality is now provided
 by `java.util.stream.Stream` and by `Comparator` itself, and the rest can now
 be found as static methods in our new `Comparators` class. See each method below for
 further instructions. Whenever possible, you should change any references of type `Ordering` to be of type `Comparator` instead. However, at this time we have no plan to
 <i>deprecate</i> this class.

 <p>Many replacements involve adopting `Stream`, and these changes can sometimes make your
 code verbose. Whenever following this advice, you should check whether `Stream` could be
 adopted more comprehensively in your code; the end result may be quite a bit simpler.

 <h3>See also</h3>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/OrderingExplained">`Ordering`</a>.
**Author:** Jesse Wilson
**Author:** Kevin Bourrillion
**Since:** 2.0

## Fields

### `LEFT_IS_GREATER`

**Type:** `int`

### `RIGHT_IS_GREATER`

**Type:** `int`

## Constructors

### `<init>()`

Constructs a new instance of this class (only invokable by the subclass constructor, typically
 implicit).

## Methods

### `natural()`

**Returns:** [`com.google.common.collect.Ordering<C>`](./Ordering.md)

Returns a serializable ordering that uses the natural order of the values. The ordering throws
 a `NullPointerException` when passed a null parameter.

 <p>The type specification is `<C extends Comparable>`, instead of the technically correct
 `<C extends Comparable<? super C>>`, to support legacy types from before Java 5.

 <p><b>Java 8 users:</b> use `Comparator.naturalOrder` instead.

### `from(`java.util.Comparator<T>` comparator)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

Returns an ordering based on an <i>existing</i> comparator instance. Note that it is
 unnecessary to create a <i>new</i> anonymous inner class implementing `Comparator` just
 to pass it in here. Instead, simply subclass `Ordering` and implement its `compare`
 method directly.

 <p>The returned object is serializable if `comparator` is serializable.

 <p><b>Java 8 users:</b> this class is now obsolete as explained in the class documentation, so
 there is no need to use this method.
@param comparator the comparator that defines the order
@return comparator itself if it is already an `Ordering`; otherwise an ordering that
     wraps that comparator

### `from([`com.google.common.collect.Ordering<T>`](./Ordering.md) ordering)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

Simply returns its argument.
**Deprecated:** no need to use this

### `explicit(`java.util.List<T>` valuesInOrder)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

Returns an ordering that compares objects according to the order in which they appear in the
 given list. Only objects present in the list (according to `Object.equals`) may be
 compared. This comparator imposes a "partial ordering" over the type `T`. Subsequent
 changes to the `valuesInOrder` list will have no effect on the returned comparator. Null
 values in the list are not supported.

 <p>The returned comparator throws a `ClassCastException` when it receives an input
 parameter that isn't among the provided values.

 <p>The generated comparator is serializable if all the provided values are serializable.
@param valuesInOrder the values that the returned comparator will be able to compare, in the
     order the comparator should induce
@return the comparator described above
@throws NullPointerException if any of the provided values is null
@throws IllegalArgumentException if `valuesInOrder` contains any duplicate values
     (according to `Object.equals`)

### `explicit(`T` leastValue, `T[]` remainingValuesInOrder)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

Returns an ordering that compares objects according to the order in which they are given to
 this method. Only objects present in the argument list (according to `Object.equals`) may
 be compared. This comparator imposes a "partial ordering" over the type `T`. Null values
 in the argument list are not supported.

 <p>The returned comparator throws a `ClassCastException` when it receives an input
 parameter that isn't among the provided values.

 <p>The generated comparator is serializable if all the provided values are serializable.
@param leastValue the value which the returned comparator should consider the "least" of all
     values
@param remainingValuesInOrder the rest of the values that the returned comparator will be able
     to compare, in the order the comparator should follow
@return the comparator described above
@throws NullPointerException if any of the provided values is null
@throws IllegalArgumentException if any duplicate values (according to `Object.equals(Object)`) are present among the method arguments

### `allEqual()`

**Returns:** [`com.google.common.collect.Ordering<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](./Ordering.md)

Returns an ordering which treats all values as equal, indicating "no ordering." Passing this
 ordering to any <i>stable</i> sort algorithm results in no change to the order of elements.
 Note especially that `sortedCopy` and `immutableSortedCopy` are stable, and in
 the returned instance these are implemented by simply copying the source list.

 <p>Example:

 <pre>`Ordering.allEqual().nullsLast().sortedCopy(
     asList(t, null, e, s, null, t, null))
 `</pre>

 <p>Assuming `t`, `e` and `s` are non-null, this returns `[t, e, s, t,
 null, null, null]` regardless of the true comparison order of those three values (which might
 not even implement `Comparable` at all).

 <p><b>Warning:</b> by definition, this comparator is not <i>consistent with equals</i> (as
 defined here). Avoid its use in APIs, such as `TreeSet.TreeSet(Comparator)`, where such consistency is expected.

 <p>The returned comparator is serializable.

 <p><b>Java 8 users:</b> Use the lambda expression `(a, b) -> 0` instead (in certain cases
 you may need to cast that to `Comparator<YourType>`).
**Since:** 13.0

### `usingToString()`

**Returns:** [`com.google.common.collect.Ordering<java.lang.Object>`](./Ordering.md)

Returns an ordering that compares objects by the natural ordering of their string
 representations as returned by `toString()`. It does not support null values.

 <p>The comparator is serializable.

 <p><b>Java 8 users:</b> Use `Comparator.comparing(Object::toString)` instead.

### `arbitrary()`

**Returns:** [`com.google.common.collect.Ordering<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](./Ordering.md)

Returns an arbitrary ordering over all objects, for which `compare(a, b) == 0` implies
 `a == b` (identity equality). There is no meaning whatsoever to the order imposed, but it
 is constant for the life of the VM.

 <p>Because the ordering is identity-based, it is not "consistent with `Object.equals(Object)`" as defined by `Comparator`. Use caution when building a `SortedSet` or `SortedMap` from it, as the resulting collection will not behave exactly
 according to spec.

 <p>This ordering is not serializable, as its implementation relies on `System.identityHashCode(Object)`, so its behavior cannot be preserved across serialization.
**Since:** 2.0

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

Returns the reverse of this ordering; the `Ordering` equivalent to `Collections.reverseOrder(Comparator)`.

 <p><b>Java 8 users:</b> Use `thisComparator.reversed()` instead.

### `nullsFirst()`

**Returns:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable S>`](./Ordering.md)

Returns an ordering that treats `null` as less than all other values and uses `this` to compare non-null values.

 <p>The returned object is serializable if this object is serializable.

 <p><b>Java 8 users:</b> Use `Comparator.nullsFirst(thisComparator)` instead.

### `nullsLast()`

**Returns:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable S>`](./Ordering.md)

Returns an ordering that treats `null` as greater than all other values and uses this
 ordering to compare non-null values.

 <p>The returned object is serializable if this object is serializable.

 <p><b>Java 8 users:</b> Use `Comparator.nullsLast(thisComparator)` instead.

### `onResultOf([`com.google.common.base.Function<F,? extends T>`](../base/Function.md) function)`

**Returns:** [`com.google.common.collect.Ordering<F>`](./Ordering.md)

Returns a new ordering on `F` which orders elements by first applying a function to them,
 then comparing those results using `this`. For example, to compare objects by their
 string forms, in a case-insensitive manner, use:

 <pre>`Ordering.from(String.CASE_INSENSITIVE_ORDER)
     .onResultOf(Functions.toStringFunction())
 `</pre>

 <p><b>Java 8 users:</b> Use `Comparator.comparing(function, thisComparator)` instead (you
 can omit the comparator if it is the natural order).

### `onKeys()`

**Returns:** [`com.google.common.collect.Ordering<java.util.Map.Entry<T2,?>>`](./Ordering>.md)

### `compound(`java.util.Comparator<? super U>` secondaryComparator)`

**Returns:** [`com.google.common.collect.Ordering<U>`](./Ordering.md)

Returns an ordering which first uses the ordering `this`, but which in the event of a
 "tie", then delegates to `secondaryComparator`. For example, to sort a bug list first by
 status and second by priority, you might use `byStatus.compound(byPriority)`. For a
 compound ordering with three or more components, simply chain multiple calls to this method.

 <p>An ordering produced by this method, or a chain of calls to this method, is equivalent to
 one created using `Ordering.compound(Iterable)` on the same component comparators.

 <p>The returned object is serializable if this object and `secondaryComparator` are both
 serializable.

 <p><b>Java 8 users:</b> Use `thisComparator.thenComparing(secondaryComparator)` instead.
 Depending on what `secondaryComparator` is, one of the other overloads of `thenComparing` may be even more useful.

### `compound(`java.lang.Iterable<? extends java.util.Comparator<? super T>>` comparators)`

**Returns:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

Returns an ordering which tries each given comparator in order until a non-zero result is
 found, returning that result, and returning zero only if all comparators return zero. The
 returned ordering is based on the state of the `comparators` iterable at the time it was
 provided to this method.

 <p>The returned ordering is equivalent to that produced using `Ordering.from(comp1).compound(comp2).compound(comp3) . . .`.

 <p>The returned object is serializable if each of the `comparators` is serializable.

 <p><b>Warning:</b> Supplying an argument with undefined iteration order, such as a `HashSet`, will produce non-deterministic results.

 <p><b>Java 8 users:</b> Use a chain of calls to `Comparator.thenComparing(Comparator)`,
 or `comparatorCollection.stream().reduce(Comparator::thenComparing).get()` (if the
 collection might be empty, also provide a default comparator as the `identity` parameter
 to `reduce`).
@param comparators the comparators to try in order

### `lexicographical()`

**Returns:** [`com.google.common.collect.Ordering<java.lang.Iterable<S>>`](./Ordering>.md)

Returns a new ordering which sorts iterables by comparing corresponding elements pairwise until
 a nonzero result is found; imposes "dictionary order". If the end of one iterable is reached,
 but not the other, the shorter iterable is considered to be less than the longer one. For
 example, a lexicographical natural ordering over integers considers `[] < [1] < [1, 1] <
 [1, 2] < [2]`.

 <p>Note that `ordering.lexicographical().reverse()` is not equivalent to `ordering.reverse().lexicographical()` (consider how each would order `[1]` and `[1,
 1]`).

 <p><b>Java 8 users:</b> Use `Comparators.lexicographical(Comparator)` instead.
**Since:** 2.0

### `compare(`T` left, `T` right)`

**Returns:** `int`

### `min(`java.util.Iterator<E>` iterator)`

**Returns:** `E`

Returns the least of the specified values according to this ordering. If there are multiple
 least values, the first of those is returned. The iterator will be left exhausted: its `hasNext()` method will return `false`.

 <p><b>Java 8 users:</b> Use `Streams.stream(iterator).min(thisComparator).get()` instead
 (but note that it does not guarantee which tied minimum element is returned).
@param iterator the iterator whose minimum element is to be determined
@throws NoSuchElementException if `iterator` is empty
@throws ClassCastException if the parameters are not <i>mutually comparable</i> under this
     ordering.
**Since:** 11.0

### `min(`java.lang.Iterable<E>` iterable)`

**Returns:** `E`

Returns the least of the specified values according to this ordering. If there are multiple
 least values, the first of those is returned.

 <p><b>Java 8 users:</b> If `iterable` is a `Collection`, use `Collections.min(collection, thisComparator)` instead. Otherwise, use `Streams.stream(iterable).min(thisComparator).get()` instead. Note that these alternatives do
 not guarantee which tied minimum element is returned.
@param iterable the iterable whose minimum element is to be determined
@throws NoSuchElementException if `iterable` is empty
@throws ClassCastException if the parameters are not <i>mutually comparable</i> under this
     ordering.

### `min(`E` a, `E` b)`

**Returns:** `E`

Returns the lesser of the two values according to this ordering. If the values compare as 0,
 the first is returned.

 <p><b>Implementation note:</b> this method is invoked by the default implementations of the
 other `min` overloads, so overriding it will affect their behavior.

 <p><b>Note:</b> Consider using `Comparators.min(a, b, thisComparator)` instead. If `thisComparator` is `Ordering.natural`, then use `Comparators.min(a, b)`.
@param a value to compare, returned if less than or equal to b.
@param b value to compare.
@throws ClassCastException if the parameters are not <i>mutually comparable</i> under this
     ordering.

### `min(`E` a, `E` b, `E` c, `E[]` rest)`

**Returns:** `E`

Returns the least of the specified values according to this ordering. If there are multiple
 least values, the first of those is returned.

 <p><b>Java 8 users:</b> Use `Collections.min(Arrays.asList(a, b, c...), thisComparator)`
 instead (but note that it does not guarantee which tied minimum element is returned).
@param a value to compare, returned if less than or equal to the rest.
@param b value to compare
@param c value to compare
@param rest values to compare
@throws ClassCastException if the parameters are not <i>mutually comparable</i> under this
     ordering.

### `max(`java.util.Iterator<E>` iterator)`

**Returns:** `E`

Returns the greatest of the specified values according to this ordering. If there are multiple
 greatest values, the first of those is returned. The iterator will be left exhausted: its
 `hasNext()` method will return `false`.

 <p><b>Java 8 users:</b> Use `Streams.stream(iterator).max(thisComparator).get()` instead
 (but note that it does not guarantee which tied maximum element is returned).
@param iterator the iterator whose maximum element is to be determined
@throws NoSuchElementException if `iterator` is empty
@throws ClassCastException if the parameters are not <i>mutually comparable</i> under this
     ordering.
**Since:** 11.0

### `max(`java.lang.Iterable<E>` iterable)`

**Returns:** `E`

Returns the greatest of the specified values according to this ordering. If there are multiple
 greatest values, the first of those is returned.

 <p><b>Java 8 users:</b> If `iterable` is a `Collection`, use `Collections.max(collection, thisComparator)` instead. Otherwise, use `Streams.stream(iterable).max(thisComparator).get()` instead. Note that these alternatives do
 not guarantee which tied maximum element is returned.
@param iterable the iterable whose maximum element is to be determined
@throws NoSuchElementException if `iterable` is empty
@throws ClassCastException if the parameters are not <i>mutually comparable</i> under this
     ordering.

### `max(`E` a, `E` b)`

**Returns:** `E`

Returns the greater of the two values according to this ordering. If the values compare as 0,
 the first is returned.

 <p><b>Implementation note:</b> this method is invoked by the default implementations of the
 other `max` overloads, so overriding it will affect their behavior.

 <p><b>Note:</b> Consider using `Comparators.max(a, b, thisComparator)` instead. If `thisComparator` is `Ordering.natural`, then use `Comparators.max(a, b)`.
@param a value to compare, returned if greater than or equal to b.
@param b value to compare.
@throws ClassCastException if the parameters are not <i>mutually comparable</i> under this
     ordering.

### `max(`E` a, `E` b, `E` c, `E[]` rest)`

**Returns:** `E`

Returns the greatest of the specified values according to this ordering. If there are multiple
 greatest values, the first of those is returned.

 <p><b>Java 8 users:</b> Use `Collections.max(Arrays.asList(a, b, c...), thisComparator)`
 instead (but note that it does not guarantee which tied maximum element is returned).
@param a value to compare, returned if greater than or equal to the rest.
@param b value to compare
@param c value to compare
@param rest values to compare
@throws ClassCastException if the parameters are not <i>mutually comparable</i> under this
     ordering.

### `leastOf(`java.lang.Iterable<E>` iterable, `int` k)`

**Returns:** `java.util.List<E>`

Returns the `k` least elements of the given iterable according to this ordering, in order
 from least to greatest. If there are fewer than `k` elements present, all will be
 included.

 <p>The implementation does not necessarily use a <i>stable</i> sorting algorithm; when multiple
 elements are equivalent, it is undefined which will come first.

 <p><b>Java 8 users:</b> Use `Streams.stream(iterable).collect(Comparators.least(k,
 thisComparator))` instead.
@return an immutable `RandomAccess` list of the `k` least elements in ascending
     order
@throws IllegalArgumentException if `k` is negative
**Since:** 8.0

### `leastOf(`java.util.Iterator<E>` iterator, `int` k)`

**Returns:** `java.util.List<E>`

Returns the `k` least elements from the given iterator according to this ordering, in
 order from least to greatest. If there are fewer than `k` elements present, all will be
 included.

 <p>The implementation does not necessarily use a <i>stable</i> sorting algorithm; when multiple
 elements are equivalent, it is undefined which will come first.

 <p><b>Java 8 users:</b> Use `Streams.stream(iterator).collect(Comparators.least(k,
 thisComparator))` instead.
@return an immutable `RandomAccess` list of the `k` least elements in ascending
     order
@throws IllegalArgumentException if `k` is negative
**Since:** 14.0

### `greatestOf(`java.lang.Iterable<E>` iterable, `int` k)`

**Returns:** `java.util.List<E>`

Returns the `k` greatest elements of the given iterable according to this ordering, in
 order from greatest to least. If there are fewer than `k` elements present, all will be
 included.

 <p>The implementation does not necessarily use a <i>stable</i> sorting algorithm; when multiple
 elements are equivalent, it is undefined which will come first.

 <p><b>Java 8 users:</b> Use `Streams.stream(iterable).collect(Comparators.greatest(k,
 thisComparator))` instead.
@return an immutable `RandomAccess` list of the `k` greatest elements in
     <i>descending order</i>
@throws IllegalArgumentException if `k` is negative
**Since:** 8.0

### `greatestOf(`java.util.Iterator<E>` iterator, `int` k)`

**Returns:** `java.util.List<E>`

Returns the `k` greatest elements from the given iterator according to this ordering, in
 order from greatest to least. If there are fewer than `k` elements present, all will be
 included.

 <p>The implementation does not necessarily use a <i>stable</i> sorting algorithm; when multiple
 elements are equivalent, it is undefined which will come first.

 <p><b>Java 8 users:</b> Use `Streams.stream(iterator).collect(Comparators.greatest(k,
 thisComparator))` instead.
@return an immutable `RandomAccess` list of the `k` greatest elements in
     <i>descending order</i>
@throws IllegalArgumentException if `k` is negative
**Since:** 14.0

### `sortedCopy(`java.lang.Iterable<E>` elements)`

**Returns:** `java.util.List<E>`

Returns a <b>mutable</b> list containing `elements` sorted by this ordering; use this
 only when the resulting list may need further modification, or may contain `null`. The
 input is not modified. The returned list is serializable and has random access.

 <p>Unlike `Sets.newTreeSet(Iterable)`, this method does not discard elements that are
 duplicates according to the comparator. The sort performed is <i>stable</i>, meaning that such
 elements will appear in the returned list in the same order they appeared in `elements`.

 <p><b>Performance note:</b> According to our
 benchmarking
 on Open JDK 7, `immutableSortedCopy` generally performs better (in both time and space)
 than this method, and this method in turn generally performs better than copying the list and
 calling `Collections.sort(List)`.

### `immutableSortedCopy(`java.lang.Iterable<E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an <b>immutable</b> list containing `elements` sorted by this ordering. The input
 is not modified.

 <p>Unlike `Sets.newTreeSet(Iterable)`, this method does not discard elements that are
 duplicates according to the comparator. The sort performed is <i>stable</i>, meaning that such
 elements will appear in the returned list in the same order they appeared in `elements`.

 <p><b>Performance note:</b> According to our
 benchmarking
 on Open JDK 7, this method is the most efficient way to make a sorted copy of a collection.
@throws NullPointerException if any element of `elements` is `null`
**Since:** 3.0

### `isOrdered(`java.lang.Iterable<? extends T>` iterable)`

**Returns:** `boolean`

Returns `true` if each element in `iterable` after the first is greater than or
 equal to the element that preceded it, according to this ordering. Note that this is always
 true when the iterable has fewer than two elements.

 <p><b>Java 8 users:</b> Use the equivalent `Comparators.isInOrder(Iterable, Comparator)`
 instead, since the rest of `Ordering` is mostly obsolete (as explained in the class
 documentation).

### `isStrictlyOrdered(`java.lang.Iterable<? extends T>` iterable)`

**Returns:** `boolean`

Returns `true` if each element in `iterable` after the first is <i>strictly</i>
 greater than the element that preceded it, according to this ordering. Note that this is always
 true when the iterable has fewer than two elements.

 <p><b>Java 8 users:</b> Use the equivalent `Comparators.isInStrictOrder(Iterable,
 Comparator)` instead, since the rest of `Ordering` is mostly obsolete (as explained in
 the class documentation).

### `binarySearch(`java.util.List<? extends T>` sortedList, `T` key)`

**Returns:** `int`

`Collections.binarySearch(List, Object, Comparator) Searches` `sortedList` for
 `key` using the binary search algorithm. The list must be sorted using this ordering.
@param sortedList the list to be searched
@param key the key to be searched for
**Deprecated:** Use `Collections.binarySearch(List, Object, Comparator)` directly.

