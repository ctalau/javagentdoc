# Class: `Range`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Range`

**Extends:** [`com.google.common.collect.RangeGwtSerializationDependencies`](./RangeGwtSerializationDependencies.md)

**Implements:** [`com.google.common.base.Predicate<C>`](../base/Predicate.md), `java.io.Serializable`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

To do so, pass this range instance and an
 appropriate DiscreteDomain to ContiguousSet#create.

 Types of ranges

 
Each end of the range may be bounded or unbounded. If bounded, there is an associated
 *endpoint* value, and the range is considered to be either *open* (does not include the
 endpoint) or *closed* (includes the endpoint) on that side. With three possibilities on each
 side, this yields nine basic types of ranges, enumerated below. (Notation: a square bracket
 ([ ]) indicates that the range is closed on that side; a parenthesis (( )) means
 it is either open or unbounded. The construct {x | statement} is read "the set of all
 *x* such that *statement*.")

 

 
 Range Types
 Notation        Definition               Factory method
 (a..b)  {x | a < x < b}  open
 [a..b]  {x | a <= x <= b}closed
 (a..b]  {x | a < x <= b} openClosed
 [a..b)  {x | a <= x < b} closedOpen
 (a..+∞) {x | x > a}      greaterThan
 [a..+∞) {x | x >= a}     atLeast
 (-∞..b) {x | x < b}      lessThan
 (-∞..b] {x | x <= b}     atMost
 (-∞..+∞){x}              all
 

 

 
When both endpoints exist, the upper endpoint may not be less than the lower. The endpoints
 may be equal only if at least one of the bounds is closed:

 

   - [a..a] : a singleton range
   - [a..a); (a..a] : empty ranges; also valid
   - (a..a) : **invalid**; an exception will be thrown
 


 Warnings

 

   - Use immutable value types only, if at all possible. If you must use a mutable type, **do
       not** allow the endpoint instances to mutate after the range is created!
   - Your value type's comparison method should be consistent with
       equals if at all possible. Otherwise, be aware that concepts used throughout this
       documentation such as "equal", "same", "unique" and so on actually refer to whether compareTo returns zero, not whether equals
       returns true.
   - A class which implements Comparable<UnrelatedType> is very broken, and will cause
       undefined horrible things to happen in Range. For now, the Range API does not
       prevent its use, because this would also rule out all ungenerified (pre-JDK1.5) data types.
       **This may change in the future.**
 


 Other notes

 

   - All ranges are shallow-immutable.
   - Instances of this type are obtained using the static factory methods in this class.
   - Ranges are *convex*: whenever two values are contained, all values in between them
       must also be contained. More formally, for any c1 <= c2 <= c3 of type C,
       r.contains(c1) && r.contains(c3) implies r.contains(c2)). This means that a
       Range<Integer> can never be used to represent, say, "all *prime* numbers from
       1 to 100."
   - When evaluated as a Predicate, a range yields the same result as invoking #contains.
   - Terminology note: a range a is said to be the *maximal* range having property
       *P* if, for all ranges b also having property *P*, a.encloses(b).
       Likewise, a is *minimal* when b.encloses(a) for all b having
       property *P*. See, for example, the definition of intersection.
   - A Range is serializable if it has no bounds, or if each bound is serializable.
 


 Further reading

 
See the Guava User Guide article on [Range](https://github.com/google/guava/wiki/RangesExplained).

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

### `<init>(com.google.common.collect.Cut<C> lowerBound, com.google.common.collect.Cut<C> upperBound)`

**Parameters:**
- `lowerBound` ([`com.google.common.collect.Cut<C>`](./Cut.md))
- `upperBound` ([`com.google.common.collect.Cut<C>`](./Cut.md))

## Methods

### `lowerBoundFn()`

**Returns:** [`com.google.common.base.Function<com.google.common.collect.Range<C>,com.google.common.collect.Cut<C>>`](../base/Function.md)

### `upperBoundFn()`

**Returns:** [`com.google.common.base.Function<com.google.common.collect.Range<C>,com.google.common.collect.Cut<C>>`](../base/Function.md)

### `rangeLexOrdering()`

**Returns:** [`com.google.common.collect.Ordering<com.google.common.collect.Range<C>>`](./Ordering.md)

### `create(com.google.common.collect.Cut<C> lowerBound, com.google.common.collect.Cut<C> upperBound)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `lowerBound` ([`com.google.common.collect.Cut<C>`](./Cut.md))
- `upperBound` ([`com.google.common.collect.Cut<C>`](./Cut.md))

### `open(C lower, C upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `lower` (`C`)
- `upper` (`C`)

### `closed(C lower, C upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `lower` (`C`)
- `upper` (`C`)

### `closedOpen(C lower, C upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `lower` (`C`)
- `upper` (`C`)

### `openClosed(C lower, C upper)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `lower` (`C`)
- `upper` (`C`)

### `range(C lower, com.google.common.collect.BoundType lowerType, C upper, com.google.common.collect.BoundType upperType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `lower` (`C`)
- `lowerType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upper` (`C`)
- `upperType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `lessThan(C endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `endpoint` (`C`)

### `atMost(C endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `endpoint` (`C`)

### `upTo(C endpoint, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `endpoint` (`C`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `greaterThan(C endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `endpoint` (`C`)

### `atLeast(C endpoint)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `endpoint` (`C`)

### `downTo(C endpoint, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `endpoint` (`C`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `all()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `singleton(C value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

The
 returned range is closed on both ends.

**Parameters:**
- `value` (`C`)

### `encloseAll(java.lang.Iterable<C> values)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

The returned range is closed on both ends.

**Parameters:**
- `values` (`java.lang.Iterable<C>`)

### `hasLowerBound()`

**Returns:** `boolean`

### `lowerEndpoint()`

**Returns:** `C`

### `lowerBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `hasUpperBound()`

**Returns:** `boolean`

### `upperEndpoint()`

**Returns:** `C`

### `upperBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `isEmpty()`

**Returns:** `boolean`

(This does
 not encompass ranges of the form (v..v), because such ranges are *invalid* and
 can't be constructed at all.)

 
Note that certain discrete ranges such as the integer range (3..4) are **not**
 considered empty, even though they contain no actual values. In these cases, it may be helpful
 to preprocess ranges with #canonical(DiscreteDomain).

### `contains(C value)`

**Returns:** `boolean`

For example, on the
 range [0..2), contains(1) returns true, while contains(2)
 returns false.

**Parameters:**
- `value` (`C`)

### `apply(C input)`

**Returns:** `boolean`

**Parameters:**
- `input` (`C`)

### `containsAll(java.lang.Iterable<? extends C> values)`

**Returns:** `boolean`

**Parameters:**
- `values` (`java.lang.Iterable<? extends C>`)

### `encloses(com.google.common.collect.Range<C> other)`

**Returns:** `boolean`

Examples:

 

   - [3..6] encloses [4..5]
   - (3..6) encloses (3..6)
   - [3..6] encloses [4..4) (even though the latter is empty)
   - (3..6] does not enclose [3..6]
   - [4..5] does not enclose (3..6) (even though it contains every value
       contained by the latter range)
   - [3..6] does not enclose (1..1] (even though it contains every value
       contained by the latter range)
 


 
Note that if a.encloses(b), then b.contains(v) implies 
 a.contains(v), but as the last two examples illustrate, the converse is not always true.

 
Being reflexive, antisymmetric and transitive, the encloses relation defines a
 *partial order* over ranges. There exists a unique maximal range
 according to this relation, and also numerous minimal ranges. Enclosure
 also implies connectedness.

**Parameters:**
- `other` ([`com.google.common.collect.Range<C>`](./Range.md))

### `isConnected(com.google.common.collect.Range<C> other)`

**Returns:** `boolean`

For example,

 

   - [2, 4) and [5, 7) are not connected
   - [2, 4) and [3, 5) are connected, because both enclose [3, 4)
   - [2, 4) and [4, 6) are connected, because both enclose the empty range
       [4, 4)
 


 
Note that this range and other have a well-defined union and
 intersection (as a single, possibly-empty range) if and only if this
 method returns true.

 
The connectedness relation is both reflexive and symmetric, but does not form an equivalence relation as it is not transitive.

 
Note that certain discrete ranges are not considered connected, even though there are no
 elements "between them." For example, [3, 5] is not considered connected to [6,
 10]. In these cases, it may be desirable for both input ranges to be preprocessed with #canonical(DiscreteDomain) before testing for connectedness.

**Parameters:**
- `other` ([`com.google.common.collect.Range<C>`](./Range.md))

### `intersection(com.google.common.collect.Range<C> connectedRange)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

For example, the intersection of [1..5] and (3..7) is (3..5]. The
 resulting range may be empty; for example, [1..5) intersected with [5..7)
 yields the empty range [5..5).

 
The intersection exists if and only if the two ranges are connected.

 
The intersection operation is commutative, associative and idempotent, and its identity
 element is Range#all).

**Parameters:**
- `connectedRange` ([`com.google.common.collect.Range<C>`](./Range.md))

### `gap(com.google.common.collect.Range<C> otherRange)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

The resulting range may be empty if the two ranges are adjacent but non-overlapping.

 
For example, the gap of [1..5] and (7..10) is (5..7]. The resulting
 range may be empty; for example, the gap between [1..5) [5..7) yields the empty
 range [5..5).

 
The gap exists if and only if the two ranges are either disconnected or immediately adjacent
 (any intersection must be an empty range).

 
The gap operation is commutative.

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

### `span(com.google.common.collect.Range<C> other)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

For example, the span of [1..3] and (5..7) is [1..7).

 
*If* the input ranges are connected, the returned range can
 also be called their *union*. If they are not, note that the span might contain values
 that are not contained in either input range.

 
Like intersection, this operation is commutative, associative
 and idempotent. Unlike it, it is always well-defined for any two input ranges.

**Parameters:**
- `other` ([`com.google.common.collect.Range<C>`](./Range.md))

### `canonical(com.google.common.collect.DiscreteDomain<C> domain)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

The canonical form has the
 following properties:

 

   - equivalence: a.canonical().contains(v) == a.contains(v) for all v (in
       other words, ContiguousSet.create(a.canonical(domain), domain).equals(
       ContiguousSet.create(a, domain))
   - uniqueness: unless a.isEmpty(), ContiguousSet.create(a,
       domain).equals(ContiguousSet.create(b, domain)) implies 
       a.canonical(domain).equals(b.canonical(domain))
   - idempotence: a.canonical(domain).canonical(domain).equals(a.canonical(domain))
 


 
Furthermore, this method guarantees that the range returned will be one of the following
 canonical forms:

 

   - [start..end)
   - [start..+∞)
   - (-∞..end) (only if type C is unbounded below)
   - (-∞..+∞) (only if type C is unbounded below)

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

### `equals(java.lang.Object object)`

**Returns:** `boolean`

Note that discrete ranges such as (1..4) and [2..3] are **not**
 equal to one another, despite the fact that they each contain precisely the same set of values.
 Similarly, empty ranges are not equal unless they have exactly the same representation, so
 [3..3), (3..3], (4..4] are all unequal.

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `toString(com.google.common.collect.Cut<?> lowerBound, com.google.common.collect.Cut<?> upperBound)`

**Returns:** `java.lang.String`

**Parameters:**
- `lowerBound` ([`com.google.common.collect.Cut<?>`](./Cut.md))
- `upperBound` ([`com.google.common.collect.Cut<?>`](./Cut.md))

### `readResolve()`

**Returns:** `java.lang.Object`

### `compareOrThrow(java.lang.Comparable left, java.lang.Comparable right)`

**Returns:** `int`

**Parameters:**
- `left` (`java.lang.Comparable`)
- `right` (`java.lang.Comparable`)

