# Interface: `Supplier`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Supplier`

**Extends:** `java.util.function.Supplier<T>`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Legacy version of `java.util.function.Supplier`. Semantically,
 this could be a factory, generator, builder, closure, or something else entirely. No guarantees
 are implied by this interface.

 <p>The `Suppliers` class provides common suppliers and related utilities.

 <p>As this interface extends `java.util.function.Supplier`, an instance of this type can be
 used as a `java.util.function.Supplier` directly. To use a `java.util.function.Supplier` in a context where a `com.google.common.base.Supplier` is
 needed, use `supplier::get`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/FunctionalExplained">the use of `Function`</a>.
**Author:** Harry Heymann
**Since:** 2.0

## Methods

### `get()`

**Returns:** `T`

Retrieves an instance of the appropriate type. The returned object may or may not be a new
 instance, depending on the implementation.
@return an instance of the appropriate type

