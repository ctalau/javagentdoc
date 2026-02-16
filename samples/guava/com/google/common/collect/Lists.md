# Class: `Lists`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Lists`

## Description

Static utility methods pertaining to `List` instances. Also see this class's counterparts
 `Sets`, `Maps` and `Queues`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#lists">`Lists`</a>.
**Author:** Kevin Bourrillion
**Author:** Mike Bostock
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

## Methods

### `newArrayList()`

**Returns:** `java.util.ArrayList<E>`

Creates a <i>mutable</i>, empty `ArrayList` instance (for Java 6 and earlier).

 <p><b>Note:</b> if mutability is not required, use `ImmutableList.of()` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `ArrayList` constructor directly, taking
 advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

### `newArrayList(`E[]` elements)`

**Returns:** `java.util.ArrayList<E>`

Creates a <i>mutable</i> `ArrayList` instance containing the given elements.

 <p><b>Note:</b> essentially the only reason to use this method is when you will need to add or
 remove elements later. Otherwise, for non-null elements use `ImmutableList.of()` (for
 varargs) or `ImmutableList.copyOf(Object[])` (for an array) instead. If any elements
 might be null, or you need support for `List.set(int, Object)`, use `Arrays.asList`.

 <p>Note that even when you do need the ability to add or remove, this method provides only a
 tiny bit of syntactic sugar for `newArrayList(``Arrays.asList asList``(...))`, or for creating an empty list then calling `Collections.addAll`. This method is
 not actually very useful and will likely be deprecated in the future.

### `newArrayList(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.ArrayList<E>`

Creates a <i>mutable</i> `ArrayList` instance containing the given elements; a very thin
 shortcut for creating an empty list then calling `Iterables.addAll`.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use `ImmutableList.copyOf(Iterable)` instead. (Or, change `elements` to be a `FluentIterable` and call `elements.toList()`.)

 <p><b>Note:</b> if `elements` is a `Collection`, you don't need this method. Use
 the `ArrayList` constructor directly, taking
 advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

### `newArrayList(`java.util.Iterator<? extends E>` elements)`

**Returns:** `java.util.ArrayList<E>`

Creates a <i>mutable</i> `ArrayList` instance containing the given elements; a very thin
 shortcut for creating an empty list and then calling `Iterators.addAll`.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use `ImmutableList.copyOf(Iterator)` instead.

### `computeArrayListCapacity(`int` arraySize)`

**Returns:** `int`

### `newArrayListWithCapacity(`int` initialArraySize)`

**Returns:** `java.util.ArrayList<E>`

Creates an `ArrayList` instance backed by an array with the specified initial size;
 simply delegates to `ArrayList.ArrayList(int)`.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use `new ``ArrayList.ArrayList(int) ArrayList``<>(int)` directly, taking
 advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>. (Unlike here, there is no risk
 of overload ambiguity, since the `ArrayList` constructors very wisely did not accept
 varargs.)
@param initialArraySize the exact size of the initial backing array for the returned array list
     (`ArrayList` documentation calls this value the "capacity")
@return a new, empty `ArrayList` which is guaranteed not to resize itself unless its size
     reaches `initialArraySize + 1`
@throws IllegalArgumentException if `initialArraySize` is negative

### `newArrayListWithExpectedSize(`int` estimatedSize)`

**Returns:** `java.util.ArrayList<E>`

Creates an `ArrayList` instance to hold `estimatedSize` elements, <i>plus</i> an
 unspecified amount of padding; you almost certainly mean to call `newArrayListWithCapacity` (see that method for further advice on usage).

 <p><b>Note:</b> This method will soon be deprecated. Even in the rare case that you do want
 some amount of padding, it's best if you choose your desired amount explicitly.
@param estimatedSize an estimate of the eventual `List.size()` of the new list
@return a new, empty `ArrayList`, sized appropriately to hold the estimated number of
     elements
@throws IllegalArgumentException if `estimatedSize` is negative

### `newLinkedList()`

**Returns:** `java.util.LinkedList<E>`

Creates a <i>mutable</i>, empty `LinkedList` instance (for Java 6 and earlier).

 <p><b>Note:</b> if you won't be adding any elements to the list, use `ImmutableList.of()`
 instead.

 <p><b>Performance note:</b> `ArrayList` and `java.util.ArrayDeque` consistently
 outperform `LinkedList` except in certain rare and specific situations. Unless you have
 spent a lot of time benchmarking your specific needs, use one of those instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `LinkedList` constructor directly, taking
 advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

### `newLinkedList(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.LinkedList<E>`

Creates a <i>mutable</i> `LinkedList` instance containing the given elements; a very thin
 shortcut for creating an empty list then calling `Iterables.addAll`.

 <p><b>Note:</b> if mutability is not required and the elements are non-null, use `ImmutableList.copyOf(Iterable)` instead. (Or, change `elements` to be a `FluentIterable` and call `elements.toList()`.)

 <p><b>Performance note:</b> `ArrayList` and `java.util.ArrayDeque` consistently
 outperform `LinkedList` except in certain rare and specific situations. Unless you have
 spent a lot of time benchmarking your specific needs, use one of those instead.

 <p><b>Note:</b> if `elements` is a `Collection`, you don't need this method. Use
 the `LinkedList` constructor directly,
 taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.

### `newCopyOnWriteArrayList()`

**Returns:** `java.util.concurrent.CopyOnWriteArrayList<E>`

Creates an empty `CopyOnWriteArrayList` instance.

 <p><b>Note:</b> if you need an immutable empty `List`, use `Collections.emptyList`
 instead.
@return a new, empty `CopyOnWriteArrayList`
**Since:** 12.0

### `newCopyOnWriteArrayList(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.concurrent.CopyOnWriteArrayList<E>`

Creates a `CopyOnWriteArrayList` instance containing the given elements.
@param elements the elements that the list should contain, in order
@return a new `CopyOnWriteArrayList` containing those elements
**Since:** 12.0

### `asList(`E` first, `E[]` rest)`

**Returns:** `java.util.List<E>`

Returns an unmodifiable list containing the specified first element and backed by the specified
 array of additional elements. Changes to the `rest` array will be reflected in the
 returned list. Unlike `Arrays.asList`, the returned list is unmodifiable.

 <p>This is useful when a varargs method needs to use a signature such as `(Foo firstFoo,
 Foo... moreFoos)`, in order to avoid overload ambiguity or to enforce a minimum argument count.

 <p>The returned list is serializable and implements `RandomAccess`.
@param first the first element
@param rest an array of additional elements, possibly empty
@return an unmodifiable list containing the specified elements

### `asList(`E` first, `E` second, `E[]` rest)`

**Returns:** `java.util.List<E>`

Returns an unmodifiable list containing the specified first and second element, and backed by
 the specified array of additional elements. Changes to the `rest` array will be reflected
 in the returned list. Unlike `Arrays.asList`, the returned list is unmodifiable.

 <p>This is useful when a varargs method needs to use a signature such as `(Foo firstFoo,
 Foo secondFoo, Foo... moreFoos)`, in order to avoid overload ambiguity or to enforce a minimum
 argument count.

 <p>The returned list is serializable and implements `RandomAccess`.
@param first the first element
@param second the second element
@param rest an array of additional elements, possibly empty
@return an unmodifiable list containing the specified elements

### `cartesianProduct(`java.util.List<? extends java.util.List<? extends B>>` lists)`

**Returns:** `java.util.List<java.util.List<B>>`

Returns every possible list that can be formed by choosing one element from each of the given
 lists in order; the "n-ary <a href="http://en.wikipedia.org/wiki/Cartesian_product">Cartesian
 product</a>" of the lists. For example:

 <pre>`Lists.cartesianProduct(ImmutableList.of(
     ImmutableList.of(1, 2),
     ImmutableList.of("A", "B", "C")))
 `</pre>

 <p>returns a list containing six lists in the following order:

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

 <pre>`for (B b0 : lists.get(0)) {
   for (B b1 : lists.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   `
 }
 }</pre>

 <p>Note that if any input list is empty, the Cartesian product will also be empty. If no lists
 at all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 <p><i>Performance notes:</i> while the cartesian product of lists of size `m, n, p` is a
 list of size `m x n x p`, its actual memory consumption is much smaller. When the
 cartesian product is constructed, the input lists are merely copied. Only as the resulting list
 is iterated are the individual lists created, and these are not retained after iteration.
@param lists the lists to choose elements from, in the order that the elements chosen from
     those lists should appear in the resulting lists
@param <B> any common base class shared by all axes (often just `Object`)
@return the Cartesian product, as an immutable list containing immutable lists
@throws IllegalArgumentException if the size of the cartesian product would be greater than
     `Integer.MAX_VALUE`
@throws NullPointerException if `lists`, any one of the `lists`, or any element of
     a provided list is null
**Since:** 19.0

### `cartesianProduct(`java.util.List<? extends B>[]` lists)`

**Returns:** `java.util.List<java.util.List<B>>`

Returns every possible list that can be formed by choosing one element from each of the given
 lists in order; the "n-ary <a href="http://en.wikipedia.org/wiki/Cartesian_product">Cartesian
 product</a>" of the lists. For example:

 <pre>`Lists.cartesianProduct(ImmutableList.of(
     ImmutableList.of(1, 2),
     ImmutableList.of("A", "B", "C")))
 `</pre>

 <p>returns a list containing six lists in the following order:

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

 <pre>`for (B b0 : lists.get(0)) {
   for (B b1 : lists.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   `
 }
 }</pre>

 <p>Note that if any input list is empty, the Cartesian product will also be empty. If no lists
 at all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 <p><i>Performance notes:</i> while the cartesian product of lists of size `m, n, p` is a
 list of size `m x n x p`, its actual memory consumption is much smaller. When the
 cartesian product is constructed, the input lists are merely copied. Only as the resulting list
 is iterated are the individual lists created, and these are not retained after iteration.
@param lists the lists to choose elements from, in the order that the elements chosen from
     those lists should appear in the resulting lists
@param <B> any common base class shared by all axes (often just `Object`)
@return the Cartesian product, as an immutable list containing immutable lists
@throws IllegalArgumentException if the size of the cartesian product would be greater than
     `Integer.MAX_VALUE`
@throws NullPointerException if `lists`, any one of the `lists`, or any element of
     a provided list is null
**Since:** 19.0

### `transform(`java.util.List<F>` fromList, [`com.google.common.base.Function<? super F,? extends T>`](../base/Function.md) function)`

**Returns:** `java.util.List<T>`

Returns a list that applies `function` to each element of `fromList`. The returned
 list is a transformed view of `fromList`; changes to `fromList` will be reflected
 in the returned list and vice versa.

 <p>Since functions are not reversible, the transform is one-way and new items cannot be stored
 in the returned list. The `add`, `addAll` and `set` methods are unsupported
 in the returned list.

 <p>The function is applied lazily, invoked when needed. This is necessary for the returned list
 to be a view, but it means that the function will be applied many times for bulk operations
 like `List.contains` and `List.hashCode`. For this to perform well, `function` should be fast. To avoid lazy evaluation when the returned list doesn't need to be a
 view, copy the returned list into a new list of your choosing.

 <p>If `fromList` implements `RandomAccess`, so will the returned list. The returned
 list is threadsafe if the supplied list and function are.

 <p>If only a `Collection` or `Iterable` input is available, use `Collections2.transform` or `Iterables.transform`.

 <p><b>Note:</b> serializing the returned list is implemented by serializing `fromList`,
 its contents, and `function` -- <i>not</i> by serializing the transformed values. This
 can lead to surprising behavior, so serializing the returned list is <b>not recommended</b>.
 Instead, copy the list using `ImmutableList.copyOf(Collection)` (for example), then
 serialize the copy. Other methods similar to this do not implement serialization at all for
 this reason.

 <p><b>Java 8 users:</b> many use cases for this method are better addressed by `java.util.stream.Stream.map`. This method is not being deprecated, but we gently encourage you
 to migrate to streams.

### `partition(`java.util.List<T>` list, `int` size)`

**Returns:** `java.util.List<java.util.List<T>>`

Returns consecutive int) sublists of a list, each of the same
 size (the final list may be smaller). For example, partitioning a list containing `[a, b,
 c, d, e]` with a partition size of 3 yields `[[a, b, c], [d, e]]` -- an outer list
 containing two inner lists of three and two elements, all in the original order.

 <p>The outer list is unmodifiable, but reflects the latest state of the source list. The inner
 lists are sublist views of the original list, produced on demand using `List.subList(int,
 int)`, and are subject to all the usual caveats about modification as explained in that API.
@param list the list to return consecutive sublists of
@param size the desired size of each sublist (the last may be smaller)
@return a list of consecutive sublists
@throws IllegalArgumentException if `partitionSize` is nonpositive

### `charactersOf(`java.lang.String` string)`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.Character>`](./ImmutableList.md)

Returns a view of the specified string as an immutable list of `Character` values.
**Since:** 7.0

### `charactersOf(`java.lang.CharSequence` sequence)`

**Returns:** `java.util.List<java.lang.Character>`

Returns a view of the specified `CharSequence` as a `List<Character>`, viewing
 `sequence` as a sequence of Unicode code units. The view does not support any
 modification operations, but reflects any changes to the underlying character sequence.
@param sequence the character sequence to view as a `List` of characters
@return an `List<Character>` view of the character sequence
**Since:** 7.0

### `reverse(`java.util.List<T>` list)`

**Returns:** `java.util.List<T>`

Returns a reversed view of the specified list. For example, `Lists.reverse(Arrays.asList(1, 2, 3))` returns a list containing `3, 2, 1`. The returned
 list is backed by this list, so changes in the returned list are reflected in this list, and
 vice-versa. The returned list supports all of the optional list operations supported by this
 list.

 <p>The returned list is random-access if the specified list is random access.
**Since:** 7.0

### `hashCodeImpl(`java.util.List<?>` list)`

**Returns:** `int`

An implementation of `List.hashCode()`.

### `equalsImpl(`java.util.List<?>` thisList, `java.lang.Object` other)`

**Returns:** `boolean`

An implementation of `List.equals(Object)`.

### `addAllImpl(`java.util.List<E>` list, `int` index, `java.lang.Iterable<? extends E>` elements)`

**Returns:** `boolean`

An implementation of `List.addAll(int, Collection)`.

### `indexOfImpl(`java.util.List<?>` list, `java.lang.Object` element)`

**Returns:** `int`

An implementation of `List.indexOf(Object)`.

### `indexOfRandomAccess(`java.util.List<?>` list, `java.lang.Object` element)`

**Returns:** `int`

### `lastIndexOfImpl(`java.util.List<?>` list, `java.lang.Object` element)`

**Returns:** `int`

An implementation of `List.lastIndexOf(Object)`.

### `lastIndexOfRandomAccess(`java.util.List<?>` list, `java.lang.Object` element)`

**Returns:** `int`

### `listIteratorImpl(`java.util.List<E>` list, `int` index)`

**Returns:** `java.util.ListIterator<E>`

Returns an implementation of `List.listIterator(int)`.

### `subListImpl(`java.util.List<E>` list, `int` fromIndex, `int` toIndex)`

**Returns:** `java.util.List<E>`

An implementation of `List.subList(int, int)`.

### `cast(`java.lang.Iterable<T>` iterable)`

**Returns:** `java.util.List<T>`

Used to avoid http://bugs.sun.com/view_bug.do?bug_id=6558557

