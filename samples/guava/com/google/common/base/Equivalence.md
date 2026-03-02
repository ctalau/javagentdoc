# Class: `Equivalence`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Equivalence`

**Implements:** `java.util.function.BiPredicate<@org.checkerframework.checker.nullness.qual.Nullable T,@org.checkerframework.checker.nullness.qual.Nullable T>`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Two examples of equivalences are the
 identity equivalence and the "equals" equivalence.

## Constructors

### `<init>()`

## Methods

### `equivalent(T a, T b)`

**Returns:** `boolean`

This method describes an *equivalence relation* on object references, meaning that for
 all references x, y, and z (any of which may be null):

 

   - equivalent(x, x) is true (*reflexive* property)
   - equivalent(x, y) and equivalent(y, x) each return the same result
       (*symmetric* property)
   - If equivalent(x, y) and equivalent(y, z) are both true, then 
       equivalent(x, z) is also true (*transitive* property)
 


 
Note that all calls to equivalent(x, y) are expected to return the same result as
 long as neither x nor y is modified.

**Parameters:**
- `a` (`T`)
- `b` (`T`)

### `test(T t, T u)`

**Returns:** `boolean`

**Parameters:**
- `t` (`T`)
- `u` (`T`)

### `doEquivalent(T a, T b)`

**Returns:** `boolean`

This method should not be called except by #equivalent. When #equivalent
 calls this method, a and b are guaranteed to be distinct, non-null instances.

**Parameters:**
- `a` (`T`)
- `b` (`T`)

### `hash(T t)`

**Returns:** `int`

The hash has the following properties:

 

   - It is *consistent*: for any reference x, multiple invocations of 
       hash(x} consistently return the same value provided x remains unchanged
       according to the definition of the equivalence. The hash need not remain consistent from
       one execution of an application to another execution of the same application.
   - It is *distributable across equivalence*: for any references x and 
       y, if equivalent(x, y), then hash(x) == hash(y). It is *not*
       necessary that the hash be distributable across *inequivalence*. If 
       equivalence(x, y) is false, hash(x) == hash(y) may still be true.
   - hash(null) is 0.

**Parameters:**
- `t` (`T`)

### `doHash(T t)`

**Returns:** `int`

This method should not be called except by #hash. When #hash calls this
 method, t is guaranteed to be non-null.

**Parameters:**
- `t` (`T`)

### `onResultOf(com.google.common.base.Function<? super F,? extends @org.checkerframework.checker.nullness.qual.Nullable T> function)`

**Returns:** [`com.google.common.base.Equivalence<F>`](./Equivalence.md)

That is, for any pair of
 non-null objects x and y, equivalence.onResultOf(function).equivalent(a,
 b) is true if and only if equivalence.equivalent(function.apply(a), function.apply(b))
 is true.

 
For example:

 

```

 Equivalence<Person> SAME_AGE = Equivalence.equals().onResultOf(GET_PERSON_AGE);
 
```


 
function will never be invoked with a null value.

 
Note that function must be consistent according to this equivalence
 relation. That is, invoking Function#apply multiple times for a given value must return
 equivalent results. For example, 
 Equivalence.identity().onResultOf(Functions.toStringFunction()) is broken because it's not
 guaranteed that Object#toString) always returns the same string instance.

**Parameters:**
- `function` ([`com.google.common.base.Function<? super F,? extends @org.checkerframework.checker.nullness.qual.Nullable T>`](./Function.md))

### `wrap(S reference)`

**Returns:** `com.google.common.base.Equivalence.Wrapper<S>`

The returned object is serializable if both this Equivalence and reference
 are serializable (including when reference is null).

**Parameters:**
- `reference` (`S`)

### `pairwise()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Iterable<S>>`](./Equivalence.md)

More
 specifically, two iterables are considered equivalent if they both contain the same number of
 elements, and each pair of corresponding elements is equivalent according to this. Null
 iterables are equivalent to one another.

 
Note that this method performs a similar function for equivalences as com.google.common.collect.Ordering#lexicographical does for orderings.

 
The returned object is serializable if this object is serializable.

### `equivalentTo(T target)`

**Returns:** [`com.google.common.base.Predicate<@org.checkerframework.checker.nullness.qual.Nullable T>`](./Predicate.md)

**Parameters:**
- `target` (`T`)

### `equals()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](./Equivalence.md)

Equivalence#equivalent returns true if both values are null, or if neither
 value is null and Object#equals returns true. Equivalence#hash returns
 0 if passed a null value.

### `identity()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](./Equivalence.md)

Equivalence#equivalent
 returns true if a == b, including in the case that a and b are both null.

