# Interface: `Supplier`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Supplier`

**Extends:** [`java.util.function.Supplier<T>`](../../../../java/util/function/Supplier.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Legacy version of {@link java.util.function.Supplier java.util.function.Supplier}. Semantically,
 this could be a factory, generator, builder, closure, or something else entirely. No guarantees
 are implied by this interface.

 <p>The {@link Suppliers} class provides common suppliers and related utilities.

 <p>As this interface extends {@code java.util.function.Supplier}, an instance of this type can be
 used as a {@code java.util.function.Supplier} directly. To use a {@code
 java.util.function.Supplier} in a context where a {@code com.google.common.base.Supplier} is
 needed, use {@code supplier::get}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/FunctionalExplained">the use of {@code Function}</a>.
@author Harry Heymann
@since 2.0

## Methods

### `get()`

**Returns:** [`T`](T.md)

Retrieves an instance of the appropriate type. The returned object may or may not be a new
 instance, depending on the implementation.
@return an instance of the appropriate type

