# Class: `Range`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Range`

**Extends:** [`com.google.common.collect.RangeGwtSerializationDependencies`](./RangeGwtSerializationDependencies.md)

**Implements:** [`com.google.common.base.Predicate<C>`](../base/Predicate.md), `java.io.Serializable`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A range (or "interval") defines the <i>boundaries</i> around a contiguous span of values of some
 `Comparable` type; for example, "integers from 1 to 100 inclusive." Note that it is not
 possible to <i>iterate</i> over these contained values. To do so, pass this range instance and an
 appropriate `DiscreteDomain` to `ContiguousSet.create`.

 <h3>Types of ranges</h3>

 <p>Each end of the range may be bounded or unbounded. If bounded, there is an associated
 <i>endpoint</i> value, and the range is considered to be either <i>open</i> (does not include the
 endpoint) or <i>closed</i> (includes the endpoint) on that side. With three possibilities on each
 side, this yields nine basic types of ranges, enumerated below. (Notation: a square bracket
 (`[ ]`) indicates that the range is closed on that side; a parenthesis (`( )`) means
 it is either open or unbounded. The construct `{x | statement`} is read "the set of all
 <i>x</i> such that <i>statement</i>.")

 <blockquote>

 <table>
 <caption>Range Types</caption>
 <tr><th>Notation        <th>Definition               <th>Factory method
 <tr><td>`(a..b)`  <td>`{x | a < x < b`}  <td>`Range.open open`
 <tr><td>`[a..b]`  <td>`{x | a <= x <= b`}<td>`Range.closed closed`
 <tr><td>`(a..b]`  <td>`{x | a < x <= b`} <td>`Range.openClosed openClosed`
 <tr><td>`[a..b)`  <td>`{x | a <= x < b`} <td>`Range.closedOpen closedOpen`
 <tr><td>`(a..+\u221e)` <td>`{x | x > a`}      <td>`Range.greaterThan greaterThan`
 <tr><td>`[a..+\u221e)` <td>`{x | x >= a`}     <td>`Range.atLeast atLeast`
 <tr><td>`(-\u221e..b)` <td>`{x | x < b`}      <td>`Range.lessThan lessThan`
 <tr><td>`(-\u221e..b]` <td>`{x | x <= b`}     <td>`Range.atMost atMost`
 <tr><td>`(-\u221e..+\u221e)`<td>`{x`}              <td>`Range.all all`
 </table>

 </blockquote>

 <p>When both endpoints exist, the upper endpoint may not be less than the lower. The endpoints
 may be equal only if at least one of the bounds is closed:

 <ul>
   <li>`[a..a]` : a singleton range
   <li>`[a..a); (a..a]` : empty ranges; also valid
   <li>`(a..a)` : <b>invalid</b>; an exception will be thrown
 </ul>

 <h3>Warnings</h3>

 <ul>
   <li>Use immutable value types only, if at all possible. If you must use a mutable type, <b>do
       not</b> allow the endpoint instances to mutate after the range is created!
   <li>Your value type's comparison method should be consistent with
       equals if at all possible. Otherwise, be aware that concepts used throughout this
       documentation such as "equal", "same", "unique" and so on actually refer to whether `Comparable.compareTo compareTo` returns zero, not whether `Object.equals equals`
       returns `true`.
   <li>A class which implements `Comparable<UnrelatedType>` is very broken, and will cause
       undefined horrible things to happen in `Range`. For now, the Range API does not
       prevent its use, because this would also rule out all ungenerified (pre-JDK1.5) data types.
       <b>This may change in the future.</b>
 </ul>

 <h3>Other notes</h3>

 <ul>
   <li>All ranges are shallow-immutable.
   <li>Instances of this type are obtained using the static factory methods in this class.
   <li>Ranges are <i>convex</i>: whenever two values are contained, all values in between them
       must also be contained. More formally, for any `c1 <= c2 <= c3` of type `C`,
       `r.contains(c1) && r.contains(c3)` implies `r.contains(c2)`). This means that a
       `Range<Integer>` can never be used to represent, say, "all <i>prime</i> numbers from
       1 to 100."
   <li>When evaluated as a `Predicate`, a range yields the same result as invoking `contains`.
   <li>Terminology note: a range `a` is said to be the <i>maximal</i> range having property
       <i>P</i> if, for all ranges `b` also having property <i>P</i>, `a.encloses(b)`.
       Likewise, `a` is <i>minimal</i> when `b.encloses(a)` for all `b` having
       property <i>P</i>. See, for example, the definition of `intersection intersection`.
   <li>A `Range` is serializable if it has no bounds, or if each bound is serializable.
 </ul>

 <h3>Further reading</h3>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/RangesExplained">`Range`</a>.
**Author:** Kevin Bourrillion
**Author:** Gregory Kick
**Since:** 10.0

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

### `open(`C` lower, `C` upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values strictly greater than `lower` and strictly less
 than `upper`.
@throws IllegalArgumentException if `lower` is greater than <i>or equal to</i> `upper`
@throws ClassCastException if `lower` and `upper` are not mutually comparable
**Since:** 14.0

### `closed(`C` lower, `C` upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values greater than or equal to `lower` and less than
 or equal to `upper`.
@throws IllegalArgumentException if `lower` is greater than `upper`
@throws ClassCastException if `lower` and `upper` are not mutually comparable
**Since:** 14.0

### `closedOpen(`C` lower, `C` upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values greater than or equal to `lower` and strictly
 less than `upper`.
@throws IllegalArgumentException if `lower` is greater than `upper`
@throws ClassCastException if `lower` and `upper` are not mutually comparable
**Since:** 14.0

### `openClosed(`C` lower, `C` upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values strictly greater than `lower` and less than or
 equal to `upper`.
@throws IllegalArgumentException if `lower` is greater than `upper`
@throws ClassCastException if `lower` and `upper` are not mutually comparable
**Since:** 14.0

### `range(`C` lower, [`com.google.common.collect.BoundType`](./BoundType.md) lowerType, `C` upper, [`com.google.common.collect.BoundType`](./BoundType.md) upperType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains any value from `lower` to `upper`, where each
 endpoint may be either inclusive (closed) or exclusive (open).
@throws IllegalArgumentException if `lower` is greater than `upper`
@throws ClassCastException if `lower` and `upper` are not mutually comparable
**Since:** 14.0

### `lessThan(`C` endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values strictly less than `endpoint`.
**Since:** 14.0

### `atMost(`C` endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values less than or equal to `endpoint`.
**Since:** 14.0

### `upTo(`C` endpoint, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range with no lower bound up to the given endpoint, which may be either inclusive
 (closed) or exclusive (open).
**Since:** 14.0

### `greaterThan(`C` endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values strictly greater than `endpoint`.
**Since:** 14.0

### `atLeast(`C` endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains all values greater than or equal to `endpoint`.
**Since:** 14.0

### `downTo(`C` endpoint, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range from the given endpoint, which may be either inclusive (closed) or exclusive
 (open), with no upper bound.
**Since:** 14.0

### `all()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains every value of type `C`.
**Since:** 14.0

### `singleton(`C` value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range that contains only the given value. The
 returned range is closed on both ends.
**Since:** 14.0

### `encloseAll(`java.lang.Iterable<C>` values)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the minimal range that contains all of the
 given values. The returned range is closed on both ends.
@throws ClassCastException if the values are not mutually comparable
@throws NoSuchElementException if `values` is empty
@throws NullPointerException if any of `values` is null
**Since:** 14.0

### `hasLowerBound()`

**Returns:** `boolean`

Returns `true` if this range has a lower endpoint.

### `lowerEndpoint()`

**Returns:** `C`

Returns the lower endpoint of this range.
@throws IllegalStateException if this range is unbounded below (that is, `hasLowerBound()` returns `false`)

### `lowerBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

Returns the type of this range's lower bound: `BoundType.CLOSED` if the range includes
 its lower endpoint, `BoundType.OPEN` if it does not.
@throws IllegalStateException if this range is unbounded below (that is, `hasLowerBound()` returns `false`)

### `hasUpperBound()`

**Returns:** `boolean`

Returns `true` if this range has an upper endpoint.

### `upperEndpoint()`

**Returns:** `C`

Returns the upper endpoint of this range.
@throws IllegalStateException if this range is unbounded above (that is, `hasUpperBound()` returns `false`)

### `upperBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

Returns the type of this range's upper bound: `BoundType.CLOSED` if the range includes
 its upper endpoint, `BoundType.OPEN` if it does not.
@throws IllegalStateException if this range is unbounded above (that is, `hasUpperBound()` returns `false`)

### `isEmpty()`

**Returns:** `boolean`

Returns `true` if this range is of the form `[v..v)` or `(v..v]`. (This does
 not encompass ranges of the form `(v..v)`, because such ranges are <i>invalid</i> and
 can't be constructed at all.)

 <p>Note that certain discrete ranges such as the integer range `(3..4)` are <b>not</b>
 considered empty, even though they contain no actual values. In these cases, it may be helpful
 to preprocess ranges with `canonical(DiscreteDomain)`.

### `contains(`C` value)`

**Returns:** `boolean`

Returns `true` if `value` is within the bounds of this range. For example, on the
 range `[0..2)`, `contains(1)` returns `true`, while `contains(2)`
 returns `false`.

### `apply(`C` input)`

**Returns:** `boolean`

**Deprecated:** Provided only to satisfy the `Predicate` interface; use `contains`
     instead.

### `containsAll(`java.lang.Iterable<? extends C>` values)`

**Returns:** `boolean`

Returns `true` if every element in `values` is contained in
 this range.

### `encloses([`com.google.common.collect.Range<C>`](./Range.md) other)`

**Returns:** `boolean`

Returns `true` if the bounds of `other` do not extend outside the bounds of this
 range. Examples:

 <ul>
   <li>`[3..6]` encloses `[4..5]`
   <li>`(3..6)` encloses `(3..6)`
   <li>`[3..6]` encloses `[4..4)` (even though the latter is empty)
   <li>`(3..6]` does not enclose `[3..6]`
   <li>`[4..5]` does not enclose `(3..6)` (even though it contains every value
       contained by the latter range)
   <li>`[3..6]` does not enclose `(1..1]` (even though it contains every value
       contained by the latter range)
 </ul>

 <p>Note that if `a.encloses(b)`, then `b.contains(v)` implies `a.contains(v)`, but as the last two examples illustrate, the converse is not always true.

 <p>Being reflexive, antisymmetric and transitive, the `encloses` relation defines a
 <i>partial order</i> over ranges. There exists a unique maximal range
 according to this relation, and also numerous minimal ranges. Enclosure
 also implies connectedness.

### `isConnected([`com.google.common.collect.Range<C>`](./Range.md) other)`

**Returns:** `boolean`

Returns `true` if there exists a (possibly empty) range which is enclosed by both this range and `other`.

 <p>For example,

 <ul>
   <li>`[2, 4)` and `[5, 7)` are not connected
   <li>`[2, 4)` and `[3, 5)` are connected, because both enclose `[3, 4)`
   <li>`[2, 4)` and `[4, 6)` are connected, because both enclose the empty range
       `[4, 4)`
 </ul>

 <p>Note that this range and `other` have a well-defined union and
 intersection (as a single, possibly-empty range) if and only if this
 method returns `true`.

 <p>The connectedness relation is both reflexive and symmetric, but does not form an equivalence relation as it is not transitive.

 <p>Note that certain discrete ranges are not considered connected, even though there are no
 elements "between them." For example, `[3, 5]` is not considered connected to `[6,
 10]`. In these cases, it may be desirable for both input ranges to be preprocessed with `canonical(DiscreteDomain)` before testing for connectedness.

### `intersection([`com.google.common.collect.Range<C>`](./Range.md) connectedRange)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the maximal range enclosed by both this range and `connectedRange`, if such a range exists.

 <p>For example, the intersection of `[1..5]` and `(3..7)` is `(3..5]`. The
 resulting range may be empty; for example, `[1..5)` intersected with `[5..7)`
 yields the empty range `[5..5)`.

 <p>The intersection exists if and only if the two ranges are connected.

 <p>The intersection operation is commutative, associative and idempotent, and its identity
 element is `Range.all`).
@throws IllegalArgumentException if `isConnected(connectedRange)` is `false`

### `gap([`com.google.common.collect.Range<C>`](./Range.md) otherRange)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the maximal range lying between this range and `otherRange`, if such a range
 exists. The resulting range may be empty if the two ranges are adjacent but non-overlapping.

 <p>For example, the gap of `[1..5]` and `(7..10)` is `(5..7]`. The resulting
 range may be empty; for example, the gap between `[1..5)` `[5..7)` yields the empty
 range `[5..5)`.

 <p>The gap exists if and only if the two ranges are either disconnected or immediately adjacent
 (any intersection must be an empty range).

 <p>The gap operation is commutative.
@throws IllegalArgumentException if this range and `otherRange` have a nonempty
     intersection
**Since:** 27.0

### `span([`com.google.common.collect.Range<C>`](./Range.md) other)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the minimal range that encloses both this range and `other`. For example, the span of `[1..3]` and `(5..7)` is `[1..7)`.

 <p><i>If</i> the input ranges are connected, the returned range can
 also be called their <i>union</i>. If they are not, note that the span might contain values
 that are not contained in either input range.

 <p>Like `intersection(Range) intersection`, this operation is commutative, associative
 and idempotent. Unlike it, it is always well-defined for any two input ranges.

### `canonical([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the canonical form of this range in the given domain. The canonical form has the
 following properties:

 <ul>
   <li>equivalence: `a.canonical().contains(v) == a.contains(v)` for all `v` (in
       other words, `ContiguousSet.create(a.canonical(domain), domain).equals(
       ContiguousSet.create(a, domain))`
   <li>uniqueness: unless `a.isEmpty()`, `ContiguousSet.create(a,
       domain).equals(ContiguousSet.create(b, domain))` implies `a.canonical(domain).equals(b.canonical(domain))`
   <li>idempotence: `a.canonical(domain).canonical(domain).equals(a.canonical(domain))`
 </ul>

 <p>Furthermore, this method guarantees that the range returned will be one of the following
 canonical forms:

 <ul>
   <li>[start..end)
   <li>[start..+\u221e)
   <li>(-\u221e..end) (only if type `C` is unbounded below)
   <li>(-\u221e..+\u221e) (only if type `C` is unbounded below)
 </ul>

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Returns `true` if `object` is a range having the same endpoints and bound types as
 this range. Note that discrete ranges such as `(1..4)` and `[2..3]` are <b>not</b>
 equal to one another, despite the fact that they each contain precisely the same set of values.
 Similarly, empty ranges are not equal unless they have exactly the same representation, so
 `[3..3)`, `(3..3]`, `(4..4]` are all unequal.

### `hashCode()`

**Returns:** `int`

Returns a hash code for this range.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this range, such as `"[3..5)"` (other examples are
 listed in the class documentation).

### `toString([`com.google.common.collect.Cut<?>`](./Cut.md) lowerBound, [`com.google.common.collect.Cut<?>`](./Cut.md) upperBound)`

**Returns:** `java.lang.String`

### `readResolve()`

**Returns:** `java.lang.Object`

### `compareOrThrow(`java.lang.Comparable` left, `java.lang.Comparable` right)`

**Returns:** `int`

