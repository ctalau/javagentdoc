# Interface: `Predicate`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Predicate`

**Extends:** `java.util.function.Predicate<T>`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Determines a
 true or false value for a given input.

 
As this interface extends java.util.function.Predicate, an instance of this type may
 be used as a Predicate directly. To use a java.util.function.Predicate where a
 com.google.common.base.Predicate is expected, use the method reference 
 predicate::test.

 
This interface is now a legacy type. Use java.util.function.Predicate (or the
 appropriate primitive specialization such as IntPredicate) instead whenever possible.
 Otherwise, at least reduce *explicit* dependencies on this type by using lambda expressions
 or method references instead of classes, leaving your code easier to migrate in the future.

 
The Predicates class provides common predicates and related utilities.

 
See the Guava User Guide article on [the use of Predicate](https://github.com/google/guava/wiki/FunctionalExplained).

## Methods

### `apply(T input)`

This method is *generally expected*, but not absolutely
 required, to have the following properties:

 

   - Its execution does not cause any observable side effects.
   - The computation is *consistent with equals*; that is, Objects.equal(a, b) implies that predicate.apply(a) ==
       predicate.apply(b)).

**Parameters:**
- `input` (`T`)

**Returns:** `boolean`

### `equals(Object object)`

Most implementations will have no reason to override the behavior of Object#equals.
 However, an implementation may also choose to return true whenever object is a
 Predicate that it considers *interchangeable* with this one. "Interchangeable"
 *typically* means that this.apply(t) == that.apply(t) for all t of type
 T). Note that a false result from this method does not imply that the
 predicates are known *not* to be interchangeable.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `test(T input)`

**Parameters:**
- `input` (`T`)

**Returns:** `boolean`

