# Class: `Lists`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Lists`

## Description

Also see this class's counterparts
 Sets, Maps and Queues.

 
See the Guava User Guide article on [Lists](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#lists).

## Constructors

### `<init>()`

## Methods

### `newArrayList()`

**Returns:** `java.util.ArrayList<E>`

**Note:** if mutability is not required, use ImmutableList#of() instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the ArrayList constructor directly, taking
 advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

### `newArrayList(E[] elements)`

**Returns:** `java.util.ArrayList<E>`

**Note:** essentially the only reason to use this method is when you will need to add or
 remove elements later. Otherwise, for non-null elements use ImmutableList#of() (for
 varargs) or ImmutableList#copyOf(Object[]) (for an array) instead. If any elements
 might be null, or you need support for List#set(int, Object), use Arrays#asList.

 
Note that even when you do need the ability to add or remove, this method provides only a
 tiny bit of syntactic sugar for newArrayList(asList
 (...)), or for creating an empty list then calling Collections#addAll. This method is
 not actually very useful and will likely be deprecated in the future.

**Parameters:**
- `elements` (`E[]`)

### `newArrayList(java.lang.Iterable<? extends E> elements)`

**Returns:** `java.util.ArrayList<E>`

**Note:** if mutability is not required and the elements are non-null, use ImmutableList#copyOf(Iterable) instead. (Or, change elements to be a FluentIterable and call elements.toList().)

 
**Note:** if elements is a Collection, you don't need this method. Use
 the ArrayList constructor directly, taking
 advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

### `newArrayList(java.util.Iterator<? extends E> elements)`

**Returns:** `java.util.ArrayList<E>`

**Note:** if mutability is not required and the elements are non-null, use ImmutableList#copyOf(Iterator) instead.

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

### `computeArrayListCapacity(int arraySize)`

**Returns:** `int`

**Parameters:**
- `arraySize` (`int`)

### `newArrayListWithCapacity(int initialArraySize)`

**Returns:** `java.util.ArrayList<E>`

**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use new ArrayList<>(int) directly, taking
 advantage of ["diamond" syntax](http://goo.gl/iz2Wi). (Unlike here, there is no risk
 of overload ambiguity, since the ArrayList constructors very wisely did not accept
 varargs.)

**Parameters:**
- `initialArraySize` (`int`): the exact size of the initial backing array for the returned array list
     (ArrayList documentation calls this value the "capacity")

### `newArrayListWithExpectedSize(int estimatedSize)`

**Returns:** `java.util.ArrayList<E>`

**Note:** This method will soon be deprecated. Even in the rare case that you do want
 some amount of padding, it's best if you choose your desired amount explicitly.

**Parameters:**
- `estimatedSize` (`int`): an estimate of the eventual List#size() of the new list

### `newLinkedList()`

**Returns:** `java.util.LinkedList<E>`

**Note:** if you won't be adding any elements to the list, use ImmutableList#of()
 instead.

 
**Performance note:** ArrayList and java.util.ArrayDeque consistently
 outperform LinkedList except in certain rare and specific situations. Unless you have
 spent a lot of time benchmarking your specific needs, use one of those instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the LinkedList constructor directly, taking
 advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

### `newLinkedList(java.lang.Iterable<? extends E> elements)`

**Returns:** `java.util.LinkedList<E>`

**Note:** if mutability is not required and the elements are non-null, use ImmutableList#copyOf(Iterable) instead. (Or, change elements to be a FluentIterable and call elements.toList().)

 
**Performance note:** ArrayList and java.util.ArrayDeque consistently
 outperform LinkedList except in certain rare and specific situations. Unless you have
 spent a lot of time benchmarking your specific needs, use one of those instead.

 
**Note:** if elements is a Collection, you don't need this method. Use
 the LinkedList constructor directly,
 taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

### `newCopyOnWriteArrayList()`

**Returns:** `java.util.concurrent.CopyOnWriteArrayList<E>`

**Note:** if you need an immutable empty List, use Collections#emptyList
 instead.

### `newCopyOnWriteArrayList(java.lang.Iterable<? extends E> elements)`

**Returns:** `java.util.concurrent.CopyOnWriteArrayList<E>`

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`): the elements that the list should contain, in order

### `asList(E first, E[] rest)`

**Returns:** `java.util.List<E>`

Changes to the rest array will be reflected in the
 returned list. Unlike Arrays#asList, the returned list is unmodifiable.

 
This is useful when a varargs method needs to use a signature such as (Foo firstFoo,
 Foo... moreFoos), in order to avoid overload ambiguity or to enforce a minimum argument count.

 
The returned list is serializable and implements RandomAccess.

**Parameters:**
- `first` (`E`): the first element
- `rest` (`E[]`): an array of additional elements, possibly empty

### `asList(E first, E second, E[] rest)`

**Returns:** `java.util.List<E>`

Changes to the rest array will be reflected
 in the returned list. Unlike Arrays#asList, the returned list is unmodifiable.

 
This is useful when a varargs method needs to use a signature such as (Foo firstFoo,
 Foo secondFoo, Foo... moreFoos), in order to avoid overload ambiguity or to enforce a minimum
 argument count.

 
The returned list is serializable and implements RandomAccess.

**Parameters:**
- `first` (`E`): the first element
- `second` (`E`): the second element
- `rest` (`E[]`): an array of additional elements, possibly empty

### `cartesianProduct(java.util.List<? extends java.util.List<? extends B>> lists)`

**Returns:** `java.util.List<java.util.List<B>>`

For example:

 

```

 Lists.cartesianProduct(ImmutableList.of(
     ImmutableList.of(1, 2),
     ImmutableList.of("A", "B", "C")))
 
```


 
returns a list containing six lists in the following order:

 

   - ImmutableList.of(1, "A")
   - ImmutableList.of(1, "B")
   - ImmutableList.of(1, "C")
   - ImmutableList.of(2, "A")
   - ImmutableList.of(2, "B")
   - ImmutableList.of(2, "C")
 


 
The result is guaranteed to be in the "traditional", lexicographical order for Cartesian
 products that you would get from nesting for loops:

 

```

 for (B b0 : lists.get(0)) {
   for (B b1 : lists.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   }
 }
 
```


 
Note that if any input list is empty, the Cartesian product will also be empty. If no lists
 at all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 
*Performance notes:* while the cartesian product of lists of size m, n, p is a
 list of size m x n x p, its actual memory consumption is much smaller. When the
 cartesian product is constructed, the input lists are merely copied. Only as the resulting list
 is iterated are the individual lists created, and these are not retained after iteration.

**Parameters:**
- `lists` (`java.util.List<? extends java.util.List<? extends B>>`): the lists to choose elements from, in the order that the elements chosen from
     those lists should appear in the resulting lists

### `cartesianProduct(java.util.List<? extends B>[] lists)`

**Returns:** `java.util.List<java.util.List<B>>`

For example:

 

```

 Lists.cartesianProduct(ImmutableList.of(
     ImmutableList.of(1, 2),
     ImmutableList.of("A", "B", "C")))
 
```


 
returns a list containing six lists in the following order:

 

   - ImmutableList.of(1, "A")
   - ImmutableList.of(1, "B")
   - ImmutableList.of(1, "C")
   - ImmutableList.of(2, "A")
   - ImmutableList.of(2, "B")
   - ImmutableList.of(2, "C")
 


 
The result is guaranteed to be in the "traditional", lexicographical order for Cartesian
 products that you would get from nesting for loops:

 

```

 for (B b0 : lists.get(0)) {
   for (B b1 : lists.get(1)) {
     ...
     ImmutableList<B> tuple = ImmutableList.of(b0, b1, ...);
     // operate on tuple
   }
 }
 
```


 
Note that if any input list is empty, the Cartesian product will also be empty. If no lists
 at all are provided (an empty list), the resulting Cartesian product has one element, an empty
 list (counter-intuitive, but mathematically consistent).

 
*Performance notes:* while the cartesian product of lists of size m, n, p is a
 list of size m x n x p, its actual memory consumption is much smaller. When the
 cartesian product is constructed, the input lists are merely copied. Only as the resulting list
 is iterated are the individual lists created, and these are not retained after iteration.

**Parameters:**
- `lists` (`java.util.List<? extends B>[]`): the lists to choose elements from, in the order that the elements chosen from
     those lists should appear in the resulting lists

### `transform(java.util.List<F> fromList, com.google.common.base.Function<? super F,? extends T> function)`

**Returns:** `java.util.List<T>`

The returned
 list is a transformed view of fromList; changes to fromList will be reflected
 in the returned list and vice versa.

 
Since functions are not reversible, the transform is one-way and new items cannot be stored
 in the returned list. The add, addAll and set methods are unsupported
 in the returned list.

 
The function is applied lazily, invoked when needed. This is necessary for the returned list
 to be a view, but it means that the function will be applied many times for bulk operations
 like List#contains and List#hashCode. For this to perform well, 
 function should be fast. To avoid lazy evaluation when the returned list doesn't need to be a
 view, copy the returned list into a new list of your choosing.

 
If fromList implements RandomAccess, so will the returned list. The returned
 list is threadsafe if the supplied list and function are.

 
If only a Collection or Iterable input is available, use Collections2#transform or Iterables#transform.

 
**Note:** serializing the returned list is implemented by serializing fromList,
 its contents, and function -- *not* by serializing the transformed values. This
 can lead to surprising behavior, so serializing the returned list is **not recommended**.
 Instead, copy the list using ImmutableList#copyOf(Collection) (for example), then
 serialize the copy. Other methods similar to this do not implement serialization at all for
 this reason.

 
**Java 8 users:** many use cases for this method are better addressed by java.util.stream.Stream#map. This method is not being deprecated, but we gently encourage you
 to migrate to streams.

**Parameters:**
- `fromList` (`java.util.List<F>`)
- `function` ([`com.google.common.base.Function<? super F,? extends T>`](../base/Function.md))

### `partition(java.util.List<T> list, int size)`

**Returns:** `java.util.List<java.util.List<T>>`

For example, partitioning a list containing [a, b,
 c, d, e] with a partition size of 3 yields [[a, b, c], [d, e]] -- an outer list
 containing two inner lists of three and two elements, all in the original order.

 
The outer list is unmodifiable, but reflects the latest state of the source list. The inner
 lists are sublist views of the original list, produced on demand using List#subList(int,
 int), and are subject to all the usual caveats about modification as explained in that API.

**Parameters:**
- `list` (`java.util.List<T>`): the list to return consecutive sublists of
- `size` (`int`): the desired size of each sublist (the last may be smaller)

### `charactersOf(java.lang.String string)`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.Character>`](./ImmutableList.md)

**Parameters:**
- `string` (`java.lang.String`)

### `charactersOf(java.lang.CharSequence sequence)`

**Returns:** `java.util.List<java.lang.Character>`

The view does not support any
 modification operations, but reflects any changes to the underlying character sequence.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to view as a List of characters

### `reverse(java.util.List<T> list)`

**Returns:** `java.util.List<T>`

For example, 
 Lists.reverse(Arrays.asList(1, 2, 3)) returns a list containing 3, 2, 1. The returned
 list is backed by this list, so changes in the returned list are reflected in this list, and
 vice-versa. The returned list supports all of the optional list operations supported by this
 list.

 
The returned list is random-access if the specified list is random access.

**Parameters:**
- `list` (`java.util.List<T>`)

### `hashCodeImpl(java.util.List<?> list)`

**Returns:** `int`

**Parameters:**
- `list` (`java.util.List<?>`)

### `equalsImpl(java.util.List<?> thisList, java.lang.Object other)`

**Returns:** `boolean`

**Parameters:**
- `thisList` (`java.util.List<?>`)
- `other` (`java.lang.Object`)

### `addAllImpl(java.util.List<E> list, int index, java.lang.Iterable<? extends E> elements)`

**Returns:** `boolean`

**Parameters:**
- `list` (`java.util.List<E>`)
- `index` (`int`)
- `elements` (`java.lang.Iterable<? extends E>`)

### `indexOfImpl(java.util.List<?> list, java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `list` (`java.util.List<?>`)
- `element` (`java.lang.Object`)

### `indexOfRandomAccess(java.util.List<?> list, java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `list` (`java.util.List<?>`)
- `element` (`java.lang.Object`)

### `lastIndexOfImpl(java.util.List<?> list, java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `list` (`java.util.List<?>`)
- `element` (`java.lang.Object`)

### `lastIndexOfRandomAccess(java.util.List<?> list, java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `list` (`java.util.List<?>`)
- `element` (`java.lang.Object`)

### `listIteratorImpl(java.util.List<E> list, int index)`

**Returns:** `java.util.ListIterator<E>`

**Parameters:**
- `list` (`java.util.List<E>`)
- `index` (`int`)

### `subListImpl(java.util.List<E> list, int fromIndex, int toIndex)`

**Returns:** `java.util.List<E>`

**Parameters:**
- `list` (`java.util.List<E>`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `cast(java.lang.Iterable<T> iterable)`

**Returns:** `java.util.List<T>`

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

