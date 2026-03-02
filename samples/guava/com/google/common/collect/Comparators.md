# Class: `Comparators`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Comparators`

## Description

For many other helpful
 comparator utilities, see either Comparator itself (for Java 8 or later), or 
 com.google.common.collect.Ordering (otherwise).

 Relationship to Ordering

 
In light of the significant enhancements to Comparator in Java 8, the overwhelming
 majority of usages of Ordering can be written using only built-in JDK APIs. This class is
 intended to "fill the gap" and provide those features of Ordering not already provided by
 the JDK.

## Constructors

### `<init>()`

## Methods

### `lexicographical(Comparator<T> comparator)`

For example, a lexicographical natural ordering over integers considers [] < [1] < [1,
 1] < [1, 2] < [2].

 
Note that Collections.reverseOrder(lexicographical(comparator)) is not equivalent to
 lexicographical(Collections.reverseOrder(comparator)) (consider how each would order
 [1] and [1, 1]).

**Parameters:**
- `comparator` (`java.util.Comparator<T>`)

**Returns:** `java.util.Comparator<java.lang.Iterable<S>>`

### `isInOrder(Iterable<? extends T> iterable, Comparator<T> comparator)`

Note that this is
 always true when the iterable has fewer than two elements.

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)
- `comparator` (`java.util.Comparator<T>`)

**Returns:** `boolean`

### `isInStrictOrder(Iterable<? extends T> iterable, Comparator<T> comparator)`

Note that
 this is always true when the iterable has fewer than two elements.

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)
- `comparator` (`java.util.Comparator<T>`)

**Returns:** `boolean`

### `least(int k, Comparator<? super T> comparator)`

Ties
 are broken arbitrarily.

 
For example:

 

```

 Stream.of("foo", "quux", "banana", "elephant")
     .collect(least(2, comparingInt(String::length)))
 // returns {"foo", "quux"}
 
```


 
This Collector uses O(k) memory and takes expected time O(n) (worst-case O(n log
 k)), as opposed to e.g. Stream.sorted(comparator).limit(k), which currently takes O(n
 log n) time and O(n) space.

**Parameters:**
- `k` (`int`)
- `comparator` (`java.util.Comparator<? super T>`)

**Returns:** `java.util.stream.Collector<T,?,java.util.List<T>>`

### `greatest(int k, Comparator<? super T> comparator)`

Ties
 are broken arbitrarily.

 
For example:

 

```

 Stream.of("foo", "quux", "banana", "elephant")
     .collect(greatest(2, comparingInt(String::length)))
 // returns {"elephant", "banana"}
 
```


 
This Collector uses O(k) memory and takes expected time O(n) (worst-case O(n log
 k)), as opposed to e.g. Stream.sorted(comparator.reversed()).limit(k), which currently
 takes O(n log n) time and O(n) space.

**Parameters:**
- `k` (`int`)
- `comparator` (`java.util.Comparator<? super T>`)

**Returns:** `java.util.stream.Collector<T,?,java.util.List<T>>`

### `emptiesFirst(Comparator<? super T> valueComparator)`

**Parameters:**
- `valueComparator` (`java.util.Comparator<? super T>`)

**Returns:** `java.util.Comparator<java.util.Optional<T>>`

### `emptiesLast(Comparator<? super T> valueComparator)`

**Parameters:**
- `valueComparator` (`java.util.Comparator<? super T>`)

**Returns:** `java.util.Comparator<java.util.Optional<T>>`

### `min(T a, T b)`

If the values compare as 0, the first is returned.

 
The recommended solution for finding the minimum of some values depends on the type
 of your data and the number of elements you have. Read more in the Guava User Guide article on
 [
 Comparators](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#comparators).

**Parameters:**
- `a` (`T`): first value to compare, returned if less than or equal to b.
- `b` (`T`): second value to compare.

**Returns:** `T`

### `min(T a, T b, Comparator<T> comparator)`

If the values compare
 as equal, the first is returned.

 
The recommended solution for finding the minimum of some values depends on the type
 of your data and the number of elements you have. Read more in the Guava User Guide article on
 [
 Comparators](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#comparators).

**Parameters:**
- `a` (`T`): first value to compare, returned if less than or equal to b
- `b` (`T`): second value to compare.
- `comparator` (`java.util.Comparator<T>`)

**Returns:** `T`

### `max(T a, T b)`

If the values compare as 0, the first is returned.

 
The recommended solution for finding the maximum of some values depends on the type
 of your data and the number of elements you have. Read more in the Guava User Guide article on
 [
 Comparators](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#comparators).

**Parameters:**
- `a` (`T`): first value to compare, returned if greater than or equal to b.
- `b` (`T`): second value to compare.

**Returns:** `T`

### `max(T a, T b, Comparator<T> comparator)`

If the values compare
 as equal, the first is returned.

 
The recommended solution for finding the maximum of some values depends on the type
 of your data and the number of elements you have. Read more in the Guava User Guide article on
 [
 Comparators](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#comparators).

**Parameters:**
- `a` (`T`): first value to compare, returned if greater than or equal to b.
- `b` (`T`): second value to compare.
- `comparator` (`java.util.Comparator<T>`)

**Returns:** `T`

