# Class: `Range`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Range`

**Extends:** [`com.google.common.collect.RangeGwtSerializationDependencies`](./RangeGwtSerializationDependencies.md)

**Implements:** [`com.google.common.base.Predicate<C>`](../base/Predicate.md), [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A range (or "interval") defines the <i>boundaries</i> around a contiguous span of values of some
 {@code Comparable} type; for example, "integers from 1 to 100 inclusive." Note that it is not
 possible to <i>iterate</i> over these contained values. To do so, pass this range instance and an
 appropriate {@link DiscreteDomain} to {@link ContiguousSet#create}.

 <h3>Types of ranges</h3>

 <p>Each end of the range may be bounded or unbounded. If bounded, there is an associated
 <i>endpoint</i> value, and the range is considered to be either <i>open</i> (does not include the
 endpoint) or <i>closed</i> (includes the endpoint) on that side. With three possibilities on each
 side, this yields nine basic types of ranges, enumerated below. (Notation: a square bracket
 ({@code [ ]}) indicates that the range is closed on that side; a parenthesis ({@code ( )}) means
 it is either open or unbounded. The construct {@code {x | statement}} is read "the set of all
 <i>x</i> such that <i>statement</i>.")

 <blockquote>

 <table>
 <caption>Range Types</caption>
 <tr><th>Notation        <th>Definition               <th>Factory method
 <tr><td>{@code (a..b)}  <td>{@code {x | a < x < b}}  <td>{@link Range#open open}
 <tr><td>{@code [a..b]}  <td>{@code {x | a <= x <= b}}<td>{@link Range#closed closed}
 <tr><td>{@code (a..b]}  <td>{@code {x | a < x <= b}} <td>{@link Range#openClosed openClosed}
 <tr><td>{@code [a..b)}  <td>{@code {x | a <= x < b}} <td>{@link Range#closedOpen closedOpen}
 <tr><td>{@code (a..+\u221e)} <td>{@code {x | x > a}}      <td>{@link Range#greaterThan greaterThan}
 <tr><td>{@code [a..+\u221e)} <td>{@code {x | x >= a}}     <td>{@link Range#atLeast atLeast}
 <tr><td>{@code (-\u221e..b)} <td>{@code {x | x < b}}      <td>{@link Range#lessThan lessThan}
 <tr><td>{@code (-\u221e..b]} <td>{@code {x | x <= b}}     <td>{@link Range#atMost atMost}
 <tr><td>{@code (-\u221e..+\u221e)}<td>{@code {x}}              <td>{@link Range#all all}
 </table>

 </blockquote>

 <p>When both endpoints exist, the upper endpoint may not be less than the lower. The endpoints
 may be equal only if at least one of the bounds is closed:

 <ul>
   <li>{@code [a..a]} : a singleton range
   <li>{@code [a..a); (a..a]} : {@linkplain #isEmpty empty} ranges; also valid
   <li>{@code (a..a)} : <b>invalid</b>; an exception will be thrown
 </ul>

 <h3>Warnings</h3>

 <ul>
   <li>Use immutable value types only, if at all possible. If you must use a mutable type, <b>do
       not</b> allow the endpoint instances to mutate after the range is created!
   <li>Your value type's comparison method should be {@linkplain Comparable consistent with
       equals} if at all possible. Otherwise, be aware that concepts used throughout this
       documentation such as "equal", "same", "unique" and so on actually refer to whether {@link Comparable#compareTo compareTo} returns zero, not whether {@link Object#equals equals}
       returns {@code true}.
   <li>A class which implements {@code Comparable<UnrelatedType>} is very broken, and will cause
       undefined horrible things to happen in {@code Range}. For now, the Range API does not
       prevent its use, because this would also rule out all ungenerified (pre-JDK1.5) data types.
       <b>This may change in the future.</b>
 </ul>

 <h3>Other notes</h3>

 <ul>
   <li>All ranges are shallow-immutable.
   <li>Instances of this type are obtained using the static factory methods in this class.
   <li>Ranges are <i>convex</i>: whenever two values are contained, all values in between them
       must also be contained. More formally, for any {@code c1 <= c2 <= c3} of type {@code C},
       {@code r.contains(c1) && r.contains(c3)} implies {@code r.contains(c2)}). This means that a
       {@code Range<Integer>} can never be used to represent, say, "all <i>prime</i> numbers from
       1 to 100."
   <li>When evaluated as a {@link Predicate}, a range yields the same result as invoking {@link #contains}.
   <li>Terminology note: a range {@code a} is said to be the <i>maximal</i> range having property
       <i>P</i> if, for all ranges {@code b} also having property <i>P</i>, {@code a.encloses(b)}.
       Likewise, {@code a} is <i>minimal</i> when {@code b.encloses(a)} for all {@code b} having
       property <i>P</i>. See, for example, the definition of {@link #intersection intersection}.
   <li>A {@code Range} is serializable if it has no bounds, or if each bound is serializable.
 </ul>

 <h3>Further reading</h3>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/RangesExplained">{@code Range}</a>.
@author Kevin Bourrillion
@author Gregory Kick
@since 10.0

## Fields

### `ALL`

**Type:** [`com.google.common.collect.Range<java.lang.Comparable>`](./Range.md)

### `lowerBound`

**Type:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `upperBound`

**Type:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.Cut<C>`](./Cut.md) lowerBound, [`com.google.common.collect.Cut<C>`](./Cut.md) upperBound)`

## Methods

### `lowerBoundFn()`

**Returns:** [`com.google.common.base.Function<com.google.common.collect.Range<C>,com.google.common.collect.Cut<C>>`](../base/Function,com/google/common/collect/Cut>.md)

### `upperBoundFn()`

**Returns:** [`com.google.common.base.Function<com.google.common.collect.Range<C>,com.google.common.collect.Cut<C>>`](../base/Function,com/google/common/collect/Cut>.md)

### `rangeLexOrdering()`

**Returns:** [`com.google.common.collect.Ordering<com.google.common.collect.Range<C>>`](./Ordering>.md)

### `create([`com.google.common.collect.Cut<C>`](./Cut.md) lowerBound, [`com.google.common.collect.Cut<C>`](./Cut.md) upperBound)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `open([`C`](C.md) lower, [`C`](C.md) upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values strictly greater than {@code lower} and strictly less
 than {@code upper}.
@throws IllegalArgumentException if {@code lower} is greater than <i>or equal to</i> {@code
     upper}
@throws ClassCastException if {@code lower} and {@code upper} are not mutually comparable
@since 14.0

### `closed([`C`](C.md) lower, [`C`](C.md) upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values greater than or equal to {@code lower} and less than
 or equal to {@code upper}.
@throws IllegalArgumentException if {@code lower} is greater than {@code upper}
@throws ClassCastException if {@code lower} and {@code upper} are not mutually comparable
@since 14.0

### `closedOpen([`C`](C.md) lower, [`C`](C.md) upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values greater than or equal to {@code lower} and strictly
 less than {@code upper}.
@throws IllegalArgumentException if {@code lower} is greater than {@code upper}
@throws ClassCastException if {@code lower} and {@code upper} are not mutually comparable
@since 14.0

### `openClosed([`C`](C.md) lower, [`C`](C.md) upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values strictly greater than {@code lower} and less than or
 equal to {@code upper}.
@throws IllegalArgumentException if {@code lower} is greater than {@code upper}
@throws ClassCastException if {@code lower} and {@code upper} are not mutually comparable
@since 14.0

### `range([`C`](C.md) lower, [`com.google.common.collect.BoundType`](./BoundType.md) lowerType, [`C`](C.md) upper, [`com.google.common.collect.BoundType`](./BoundType.md) upperType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains any value from {@code lower} to {@code upper}, where each
 endpoint may be either inclusive (closed) or exclusive (open).
@throws IllegalArgumentException if {@code lower} is greater than {@code upper}
@throws ClassCastException if {@code lower} and {@code upper} are not mutually comparable
@since 14.0

### `lessThan([`C`](C.md) endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values strictly less than {@code endpoint}.
@since 14.0

### `atMost([`C`](C.md) endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values less than or equal to {@code endpoint}.
@since 14.0

### `upTo([`C`](C.md) endpoint, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range with no lower bound up to the given endpoint, which may be either inclusive
 (closed) or exclusive (open).
@since 14.0

### `greaterThan([`C`](C.md) endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values strictly greater than {@code endpoint}.
@since 14.0

### `atLeast([`C`](C.md) endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values greater than or equal to {@code endpoint}.
@since 14.0

### `downTo([`C`](C.md) endpoint, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range from the given endpoint, which may be either inclusive (closed) or exclusive
 (open), with no upper bound.
@since 14.0

### `all()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains every value of type {@code C}.
@since 14.0

### `singleton([`C`](C.md) value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that {@linkplain Range#contains(Comparable) contains} only the given value. The
 returned range is {@linkplain BoundType#CLOSED closed} on both ends.
@since 14.0

### `encloseAll(`java.lang.Iterable<C>` values)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the minimal range that {@linkplain Range#contains(Comparable) contains} all of the
 given values. The returned range is {@linkplain BoundType#CLOSED closed} on both ends.
@throws ClassCastException if the values are not mutually comparable
@throws NoSuchElementException if {@code values} is empty
@throws NullPointerException if any of {@code values} is null
@since 14.0

### `hasLowerBound()`

**Returns:** `boolean`

Returns {@code true} if this range has a lower endpoint.

### `lowerEndpoint()`

**Returns:** [`C`](C.md)

Returns the lower endpoint of this range.
@throws IllegalStateException if this range is unbounded below (that is, {@link #hasLowerBound()} returns {@code false})

### `lowerBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

Returns the type of this range's lower bound: {@link BoundType#CLOSED} if the range includes
 its lower endpoint, {@link BoundType#OPEN} if it does not.
@throws IllegalStateException if this range is unbounded below (that is, {@link #hasLowerBound()} returns {@code false})

### `hasUpperBound()`

**Returns:** `boolean`

Returns {@code true} if this range has an upper endpoint.

### `upperEndpoint()`

**Returns:** [`C`](C.md)

Returns the upper endpoint of this range.
@throws IllegalStateException if this range is unbounded above (that is, {@link #hasUpperBound()} returns {@code false})

### `upperBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

Returns the type of this range's upper bound: {@link BoundType#CLOSED} if the range includes
 its upper endpoint, {@link BoundType#OPEN} if it does not.
@throws IllegalStateException if this range is unbounded above (that is, {@link #hasUpperBound()} returns {@code false})

### `isEmpty()`

**Returns:** `boolean`

Returns {@code true} if this range is of the form {@code [v..v)} or {@code (v..v]}. (This does
 not encompass ranges of the form {@code (v..v)}, because such ranges are <i>invalid</i> and
 can't be constructed at all.)

 <p>Note that certain discrete ranges such as the integer range {@code (3..4)} are <b>not</b>
 considered empty, even though they contain no actual values. In these cases, it may be helpful
 to preprocess ranges with {@link #canonical(DiscreteDomain)}.

### `contains([`C`](C.md) value)`

**Returns:** `boolean`

Returns {@code true} if {@code value} is within the bounds of this range. For example, on the
 range {@code [0..2)}, {@code contains(1)} returns {@code true}, while {@code contains(2)}
 returns {@code false}.

### `apply([`C`](C.md) input)`

**Returns:** `boolean`

@deprecated Provided only to satisfy the {@link Predicate} interface; use {@link #contains}
     instead.

### `containsAll(`java.lang.Iterable<? extends C>` values)`

**Returns:** `boolean`

Returns {@code true} if every element in {@code values} is {@linkplain #contains contained} in
 this range.

### `encloses([`com.google.common.collect.Range<C>`](./Range.md) other)`

**Returns:** `boolean`

Returns {@code true} if the bounds of {@code other} do not extend outside the bounds of this
 range. Examples:

 <ul>
   <li>{@code [3..6]} encloses {@code [4..5]}
   <li>{@code (3..6)} encloses {@code (3..6)}
   <li>{@code [3..6]} encloses {@code [4..4)} (even though the latter is empty)
   <li>{@code (3..6]} does not enclose {@code [3..6]}
   <li>{@code [4..5]} does not enclose {@code (3..6)} (even though it contains every value
       contained by the latter range)
   <li>{@code [3..6]} does not enclose {@code (1..1]} (even though it contains every value
       contained by the latter range)
 </ul>

 <p>Note that if {@code a.encloses(b)}, then {@code b.contains(v)} implies {@code
 a.contains(v)}, but as the last two examples illustrate, the converse is not always true.

 <p>Being reflexive, antisymmetric and transitive, the {@code encloses} relation defines a
 <i>partial order</i> over ranges. There exists a unique {@linkplain Range#all maximal} range
 according to this relation, and also numerous {@linkplain #isEmpty minimal} ranges. Enclosure
 also implies {@linkplain #isConnected connectedness}.

### `isConnected([`com.google.common.collect.Range<C>`](./Range.md) other)`

**Returns:** `boolean`

Returns {@code true} if there exists a (possibly empty) range which is {@linkplain #encloses enclosed} by both this range and {@code other}.

 <p>For example,

 <ul>
   <li>{@code [2, 4)} and {@code [5, 7)} are not connected
   <li>{@code [2, 4)} and {@code [3, 5)} are connected, because both enclose {@code [3, 4)}
   <li>{@code [2, 4)} and {@code [4, 6)} are connected, because both enclose the empty range
       {@code [4, 4)}
 </ul>

 <p>Note that this range and {@code other} have a well-defined {@linkplain #span union} and
 {@linkplain #intersection intersection} (as a single, possibly-empty range) if and only if this
 method returns {@code true}.

 <p>The connectedness relation is both reflexive and symmetric, but does not form an {@linkplain Equivalence equivalence relation} as it is not transitive.

 <p>Note that certain discrete ranges are not considered connected, even though there are no
 elements "between them." For example, {@code [3, 5]} is not considered connected to {@code [6,
 10]}. In these cases, it may be desirable for both input ranges to be preprocessed with {@link #canonical(DiscreteDomain)} before testing for connectedness.

### `intersection([`com.google.common.collect.Range<C>`](./Range.md) connectedRange)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the maximal range {@linkplain #encloses enclosed} by both this range and {@code
 connectedRange}, if such a range exists.

 <p>For example, the intersection of {@code [1..5]} and {@code (3..7)} is {@code (3..5]}. The
 resulting range may be empty; for example, {@code [1..5)} intersected with {@code [5..7)}
 yields the empty range {@code [5..5)}.

 <p>The intersection exists if and only if the two ranges are {@linkplain #isConnected connected}.

 <p>The intersection operation is commutative, associative and idempotent, and its identity
 element is {@link Range#all}).
@throws IllegalArgumentException if {@code isConnected(connectedRange)} is {@code false}

### `gap([`com.google.common.collect.Range<C>`](./Range.md) otherRange)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the maximal range lying between this range and {@code otherRange}, if such a range
 exists. The resulting range may be empty if the two ranges are adjacent but non-overlapping.

 <p>For example, the gap of {@code [1..5]} and {@code (7..10)} is {@code (5..7]}. The resulting
 range may be empty; for example, the gap between {@code [1..5)} {@code [5..7)} yields the empty
 range {@code [5..5)}.

 <p>The gap exists if and only if the two ranges are either disconnected or immediately adjacent
 (any intersection must be an empty range).

 <p>The gap operation is commutative.
@throws IllegalArgumentException if this range and {@code otherRange} have a nonempty
     intersection
@since 27.0

### `span([`com.google.common.collect.Range<C>`](./Range.md) other)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the minimal range that {@linkplain #encloses encloses} both this range and {@code
 other}. For example, the span of {@code [1..3]} and {@code (5..7)} is {@code [1..7)}.

 <p><i>If</i> the input ranges are {@linkplain #isConnected connected}, the returned range can
 also be called their <i>union</i>. If they are not, note that the span might contain values
 that are not contained in either input range.

 <p>Like {@link #intersection(Range) intersection}, this operation is commutative, associative
 and idempotent. Unlike it, it is always well-defined for any two input ranges.

### `canonical([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the canonical form of this range in the given domain. The canonical form has the
 following properties:

 <ul>
   <li>equivalence: {@code a.canonical().contains(v) == a.contains(v)} for all {@code v} (in
       other words, {@code ContiguousSet.create(a.canonical(domain), domain).equals(
       ContiguousSet.create(a, domain))}
   <li>uniqueness: unless {@code a.isEmpty()}, {@code ContiguousSet.create(a,
       domain).equals(ContiguousSet.create(b, domain))} implies {@code
       a.canonical(domain).equals(b.canonical(domain))}
   <li>idempotence: {@code a.canonical(domain).canonical(domain).equals(a.canonical(domain))}
 </ul>

 <p>Furthermore, this method guarantees that the range returned will be one of the following
 canonical forms:

 <ul>
   <li>[start..end)
   <li>[start..+\u221e)
   <li>(-\u221e..end) (only if type {@code C} is unbounded below)
   <li>(-\u221e..+\u221e) (only if type {@code C} is unbounded below)
 </ul>

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Returns {@code true} if {@code object} is a range having the same endpoints and bound types as
 this range. Note that discrete ranges such as {@code (1..4)} and {@code [2..3]} are <b>not</b>
 equal to one another, despite the fact that they each contain precisely the same set of values.
 Similarly, empty ranges are not equal unless they have exactly the same representation, so
 {@code [3..3)}, {@code (3..3]}, {@code (4..4]} are all unequal.

### `hashCode()`

**Returns:** `int`

Returns a hash code for this range.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this range, such as {@code "[3..5)"} (other examples are
 listed in the class documentation).

### `toString([`com.google.common.collect.Cut<?>`](./Cut.md) lowerBound, [`com.google.common.collect.Cut<?>`](./Cut.md) upperBound)`

**Returns:** `java.lang.String`

### `readResolve()`

**Returns:** `java.lang.Object`

### `compareOrThrow(`java.lang.Comparable` left, `java.lang.Comparable` right)`

**Returns:** `int`

