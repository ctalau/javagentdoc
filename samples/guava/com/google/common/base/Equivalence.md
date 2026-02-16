# Class: `Equivalence`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Equivalence`

**Implements:** `java.util.function.BiPredicate<@org.checkerframework.checker.nullness.qual.Nullable T,@org.checkerframework.checker.nullness.qual.Nullable T>`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

A strategy for determining whether two instances are considered equivalent, and for computing
 hash codes in a manner consistent with that equivalence. Two examples of equivalences are the
 identity equivalence and the "equals" equivalence.
**Author:** Bob Lee
**Author:** Ben Yu
**Author:** Gregory Kick
**Since:** 10.0 (<a href="https://github.com/google/guava/wiki/Compatibility">mostly
     source-compatible</a> since 4.0)

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `equivalent(`T` a, `T` b)`

**Returns:** `boolean`

Returns `true` if the given objects are considered equivalent.

 <p>This method describes an <i>equivalence relation</i> on object references, meaning that for
 all references `x`, `y`, and `z` (any of which may be null):

 <ul>
   <li>`equivalent(x, x)` is true (<i>reflexive</i> property)
   <li>`equivalent(x, y)` and `equivalent(y, x)` each return the same result
       (<i>symmetric</i> property)
   <li>If `equivalent(x, y)` and `equivalent(y, z)` are both true, then `equivalent(x, z)` is also true (<i>transitive</i> property)
 </ul>

 <p>Note that all calls to `equivalent(x, y)` are expected to return the same result as
 long as neither `x` nor `y` is modified.

### `test(`T` t, `T` u)`

**Returns:** `boolean`

**Deprecated:**Provided only to satisfy the `BiPredicate` interface; use `equivalent`
     instead.
**Since:** 21.0

### `doEquivalent(`T` a, `T` b)`

**Returns:** `boolean`

Implemented by the user to determine whether `a` and `b` are considered equivalent,
 subject to the requirements specified in `equivalent`.

 <p>This method should not be called except by `equivalent`. When `equivalent`
 calls this method, `a` and `b` are guaranteed to be distinct, non-null instances.
**Since:** 10.0 (previously, subclasses would override equivalent())

### `hash(`T` t)`

**Returns:** `int`

Returns a hash code for `t`.

 <p>The `hash` has the following properties:

 <ul>
   <li>It is <i>consistent</i>: for any reference `x`, multiple invocations of `hash(x`} consistently return the same value provided `x` remains unchanged
       according to the definition of the equivalence. The hash need not remain consistent from
       one execution of an application to another execution of the same application.
   <li>It is <i>distributable across equivalence</i>: for any references `x` and `y`, if `equivalent(x, y)`, then `hash(x) == hash(y)`. It is <i>not</i>
       necessary that the hash be distributable across <i>inequivalence</i>. If `equivalence(x, y)` is false, `hash(x) == hash(y)` may still be true.
   <li>`hash(null)` is `0`.
 </ul>

### `doHash(`T` t)`

**Returns:** `int`

Implemented by the user to return a hash code for `t`, subject to the requirements
 specified in `hash`.

 <p>This method should not be called except by `hash`. When `hash` calls this
 method, `t` is guaranteed to be non-null.
**Since:** 10.0 (previously, subclasses would override hash())

### `onResultOf([`com.google.common.base.Function<? super F,? extends @org.checkerframework.checker.nullness.qual.Nullable T>`](./Function.md) function)`

**Returns:** [`com.google.common.base.Equivalence<F>`](./Equivalence.md)

Returns a new equivalence relation for `F` which evaluates equivalence by first applying
 `function` to the argument, then evaluating using `this`. That is, for any pair of
 non-null objects `x` and `y`, `equivalence.onResultOf(function).equivalent(a,
 b)` is true if and only if `equivalence.equivalent(function.apply(a), function.apply(b))`
 is true.

 <p>For example:

 <pre>`Equivalence<Person> SAME_AGE = Equivalence.equals().onResultOf(GET_PERSON_AGE);
 `</pre>

 <p>`function` will never be invoked with a null value.

 <p>Note that `function` must be consistent according to `this` equivalence
 relation. That is, invoking `Function.apply` multiple times for a given value must return
 equivalent results. For example, `Equivalence.identity().onResultOf(Functions.toStringFunction())` is broken because it's not
 guaranteed that `Object.toString`) always returns the same string instance.
**Since:** 10.0

### `wrap(`S` reference)`

**Returns:** [`com.google.common.base.Equivalence.Wrapper<S>`](Equivalence/Wrapper.md)

Returns a wrapper of `reference` that implements `Wrapper.equals(Object) Object.equals()` such that `wrap(a).equals(wrap(b))` if and only if `equivalent(a,
 b)`.

 <p>The returned object is serializable if both this `Equivalence` and `reference`
 are serializable (including when `reference` is null).
**Since:** 10.0

### `pairwise()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Iterable<S>>`](./Equivalence>.md)

Returns an equivalence over iterables based on the equivalence of their elements. More
 specifically, two iterables are considered equivalent if they both contain the same number of
 elements, and each pair of corresponding elements is equivalent according to `this`. Null
 iterables are equivalent to one another.

 <p>Note that this method performs a similar function for equivalences as `com.google.common.collect.Ordering.lexicographical` does for orderings.

 <p>The returned object is serializable if this object is serializable.
**Since:** 10.0

### `equivalentTo(`T` target)`

**Returns:** [`com.google.common.base.Predicate<@org.checkerframework.checker.nullness.qual.Nullable T>`](./Predicate.md)

Returns a predicate that evaluates to true if and only if the input is equivalent to `target` according to this equivalence relation.
**Since:** 10.0

### `equals()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](./Equivalence.md)

Returns an equivalence that delegates to `Object.equals` and `Object.hashCode`.
 `Equivalence.equivalent` returns `true` if both values are null, or if neither
 value is null and `Object.equals` returns `true`. `Equivalence.hash` returns
 `0` if passed a null value.
**Since:** 13.0
**Since:** 8.0 (in Equivalences with null-friendly behavior)
**Since:** 4.0 (in Equivalences)

### `identity()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](./Equivalence.md)

Returns an equivalence that uses `==` to compare values and `System.identityHashCode(Object)` to compute the hash code. `Equivalence.equivalent`
 returns `true` if `a == b`, including in the case that a and b are both null.
**Since:** 13.0
**Since:** 4.0 (in Equivalences)

