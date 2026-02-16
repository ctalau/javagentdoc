# Class: `Comparators`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Comparators`

## Description

Provides static methods for working with `Comparator` instances. For many other helpful
 comparator utilities, see either `Comparator` itself (for Java 8 or later), or `com.google.common.collect.Ordering` (otherwise).

 <h3>Relationship to `Ordering`</h3>

 <p>In light of the significant enhancements to `Comparator` in Java 8, the overwhelming
 majority of usages of `Ordering` can be written using only built-in JDK APIs. This class is
 intended to "fill the gap" and provide those features of `Ordering` not already provided by
 the JDK.
**Since:** 21.0
**Author:** Louis Wasserman

## Constructors

### `<init>()`

## Methods

### `lexicographical(`java.util.Comparator<T>` comparator)`

**Returns:** `java.util.Comparator<java.lang.Iterable<S>>`

Returns a new comparator which sorts iterables by comparing corresponding elements pairwise
 until a nonzero result is found; imposes "dictionary order." If the end of one iterable is
 reached, but not the other, the shorter iterable is considered to be less than the longer one.
 For example, a lexicographical natural ordering over integers considers `[] < [1] < [1,
 1] < [1, 2] < [2]`.

 <p>Note that `Collections.reverseOrder(lexicographical(comparator))` is not equivalent to
 `lexicographical(Collections.reverseOrder(comparator))` (consider how each would order
 `[1]` and `[1, 1]`).

### `isInOrder(`java.lang.Iterable<? extends T>` iterable, `java.util.Comparator<T>` comparator)`

**Returns:** `boolean`

Returns `true` if each element in `iterable` after the first is greater than or
 equal to the element that preceded it, according to the specified comparator. Note that this is
 always true when the iterable has fewer than two elements.

### `isInStrictOrder(`java.lang.Iterable<? extends T>` iterable, `java.util.Comparator<T>` comparator)`

**Returns:** `boolean`

Returns `true` if each element in `iterable` after the first is <i>strictly</i>
 greater than the element that preceded it, according to the specified comparator. Note that
 this is always true when the iterable has fewer than two elements.

### `least(`int` k, `java.util.Comparator<? super T>` comparator)`

**Returns:** `java.util.stream.Collector<T,?,java.util.List<T>>`

Returns a `Collector` that returns the `k` smallest (relative to the specified
 `Comparator`) input elements, in ascending order, as an unmodifiable `List`. Ties
 are broken arbitrarily.

 <p>For example:

 <pre>`Stream.of("foo", "quux", "banana", "elephant")
     .collect(least(2, comparingInt(String::length)))
 // returns {"foo", "quux"`
 }</pre>

 <p>This `Collector` uses O(k) memory and takes expected time O(n) (worst-case O(n log
 k)), as opposed to e.g. `Stream.sorted(comparator).limit(k)`, which currently takes O(n
 log n) time and O(n) space.
@throws IllegalArgumentException if `k < 0`
**Since:** 22.0

### `greatest(`int` k, `java.util.Comparator<? super T>` comparator)`

**Returns:** `java.util.stream.Collector<T,?,java.util.List<T>>`

Returns a `Collector` that returns the `k` greatest (relative to the specified
 `Comparator`) input elements, in descending order, as an unmodifiable `List`. Ties
 are broken arbitrarily.

 <p>For example:

 <pre>`Stream.of("foo", "quux", "banana", "elephant")
     .collect(greatest(2, comparingInt(String::length)))
 // returns {"elephant", "banana"`
 }</pre>

 <p>This `Collector` uses O(k) memory and takes expected time O(n) (worst-case O(n log
 k)), as opposed to e.g. `Stream.sorted(comparator.reversed()).limit(k)`, which currently
 takes O(n log n) time and O(n) space.
@throws IllegalArgumentException if `k < 0`
**Since:** 22.0

### `emptiesFirst(`java.util.Comparator<? super T>` valueComparator)`

**Returns:** `java.util.Comparator<java.util.Optional<T>>`

Returns a comparator of `Optional` values which treats `Optional.empty` as less
 than all other values, and orders the rest using `valueComparator` on the contained
 value.
**Since:** 22.0

### `emptiesLast(`java.util.Comparator<? super T>` valueComparator)`

**Returns:** `java.util.Comparator<java.util.Optional<T>>`

Returns a comparator of `Optional` values which treats `Optional.empty` as greater
 than all other values, and orders the rest using `valueComparator` on the contained
 value.
**Since:** 22.0

### `min(`T` a, `T` b)`

**Returns:** `T`

Returns the minimum of the two values. If the values compare as 0, the first is returned.

 <p>The recommended solution for finding the `minimum` of some values depends on the type
 of your data and the number of elements you have. Read more in the Guava User Guide article on
 <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#comparators">`Comparators`</a>.
@param a first value to compare, returned if less than or equal to b.
@param b second value to compare.
@throws ClassCastException if the parameters are not <i>mutually comparable</i>.
**Since:** 30.0

### `min(`T` a, `T` b, `java.util.Comparator<T>` comparator)`

**Returns:** `T`

Returns the minimum of the two values, according to the given comparator. If the values compare
 as equal, the first is returned.

 <p>The recommended solution for finding the `minimum` of some values depends on the type
 of your data and the number of elements you have. Read more in the Guava User Guide article on
 <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#comparators">`Comparators`</a>.
@param a first value to compare, returned if less than or equal to b
@param b second value to compare.
@throws ClassCastException if the parameters are not <i>mutually comparable</i> using the given
     comparator.
**Since:** 30.0

### `max(`T` a, `T` b)`

**Returns:** `T`

Returns the maximum of the two values. If the values compare as 0, the first is returned.

 <p>The recommended solution for finding the `maximum` of some values depends on the type
 of your data and the number of elements you have. Read more in the Guava User Guide article on
 <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#comparators">`Comparators`</a>.
@param a first value to compare, returned if greater than or equal to b.
@param b second value to compare.
@throws ClassCastException if the parameters are not <i>mutually comparable</i>.
**Since:** 30.0

### `max(`T` a, `T` b, `java.util.Comparator<T>` comparator)`

**Returns:** `T`

Returns the maximum of the two values, according to the given comparator. If the values compare
 as equal, the first is returned.

 <p>The recommended solution for finding the `maximum` of some values depends on the type
 of your data and the number of elements you have. Read more in the Guava User Guide article on
 <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#comparators">`Comparators`</a>.
@param a first value to compare, returned if greater than or equal to b.
@param b second value to compare.
@throws ClassCastException if the parameters are not <i>mutually comparable</i> using the given
     comparator.
**Since:** 30.0

