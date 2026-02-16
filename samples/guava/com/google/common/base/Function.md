# Interface: `Function`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Function`

**Extends:** `java.util.function.Function<F,T>`

## Type Parameters

- `F` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Legacy version of `java.util.function.Function`.

 <p>The `Functions` class provides common functions and related utilities.

 <p>As this interface extends `java.util.function.Function`, an instance of this type can be
 used as a `java.util.function.Function` directly. To use a `java.util.function.Function` in a context where a `com.google.common.base.Function` is
 needed, use `function::apply`.

 <p>This interface is now a legacy type. Use `java.util.function.Function` (or the
 appropriate primitive specialization such as `ToIntFunction`) instead whenever possible.
 Otherwise, at least reduce <i>explicit</i> dependencies on this type by using lambda expressions
 or method references instead of classes, leaving your code easier to migrate in the future.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/FunctionalExplained">the use of `Function`</a>.
**Author:** Kevin Bourrillion
**Since:** 2.0

## Methods

### `apply(`F` input)`

**Returns:** `T`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

<i>May</i> return `true` if `object` is a `Function` that behaves identically
 to this function.

 <p><b>Warning: do not depend</b> on the behavior of this method.

 <p>Historically, `Function` instances in this library have implemented this method to
 recognize certain cases where distinct `Function` instances would in fact behave
 identically. However, as code migrates to `java.util.function`, that behavior will
 disappear. It is best not to depend on it.

