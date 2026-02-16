# Interface: `Predicate`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Predicate`

**Extends:** `java.util.function.Predicate<T>`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Legacy version of `java.util.function.Predicate`. Determines a
 true or false value for a given input.

 <p>As this interface extends `java.util.function.Predicate`, an instance of this type may
 be used as a `Predicate` directly. To use a `java.util.function.Predicate` where a
 `com.google.common.base.Predicate` is expected, use the method reference `predicate::test`.

 <p>This interface is now a legacy type. Use `java.util.function.Predicate` (or the
 appropriate primitive specialization such as `IntPredicate`) instead whenever possible.
 Otherwise, at least reduce <i>explicit</i> dependencies on this type by using lambda expressions
 or method references instead of classes, leaving your code easier to migrate in the future.

 <p>The `Predicates` class provides common predicates and related utilities.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/FunctionalExplained">the use of `Predicate`</a>.
**Author:** Kevin Bourrillion
**Since:** 2.0

## Methods

### `apply(`T` input)`

**Returns:** `boolean`

Returns the result of applying this predicate to `input` (Java 8 users, see notes in the
 class documentation above). This method is <i>generally expected</i>, but not absolutely
 required, to have the following properties:

 <ul>
   <li>Its execution does not cause any observable side effects.
   <li>The computation is <i>consistent with equals</i>; that is, `Objects.equal Objects.equal``(a, b)` implies that `predicate.apply(a) ==
       predicate.apply(b))`.
 </ul>
@throws NullPointerException if `input` is null and this predicate does not accept null
     arguments

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Indicates whether another object is equal to this predicate.

 <p>Most implementations will have no reason to override the behavior of `Object.equals`.
 However, an implementation may also choose to return `true` whenever `object` is a
 `Predicate` that it considers <i>interchangeable</i> with this one. "Interchangeable"
 <i>typically</i> means that `this.apply(t) == that.apply(t)` for all `t` of type
 `T`). Note that a `false` result from this method does not imply that the
 predicates are known <i>not</i> to be interchangeable.

### `test(`T` input)`

**Returns:** `boolean`

