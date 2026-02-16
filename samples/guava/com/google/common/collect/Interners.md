# Class: `Interners`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Interners`

## Description

Contains static methods pertaining to instances of {@link Interner}.
@author Kevin Bourrillion
@since 3.0

## Constructors

### `<init>()`

## Methods

### `newBuilder()`

**Returns:** [`com.google.common.collect.Interners.InternerBuilder`](Interners/InternerBuilder.md)

Returns a fresh {@link InternerBuilder} instance.

### `newStrongInterner()`

**Returns:** [`com.google.common.collect.Interner<E>`](./Interner.md)

Returns a new thread-safe interner which retains a strong reference to each instance it has
 interned, thus preventing these instances from being garbage-collected. If this retention is
 acceptable, this implementation may perform better than {@link #newWeakInterner}.

### `newWeakInterner()`

**Returns:** [`com.google.common.collect.Interner<E>`](./Interner.md)

Returns a new thread-safe interner which retains a weak reference to each instance it has
 interned, and so does not prevent these instances from being garbage-collected. This most
 likely does not perform as well as {@link #newStrongInterner}, but is the best alternative when
 the memory usage of that implementation is unacceptable.

### `asFunction([`com.google.common.collect.Interner<E>`](./Interner.md) interner)`

**Returns:** [`com.google.common.base.Function<E,E>`](../base/Function.md)

Returns a function that delegates to the {@link Interner#intern} method of the given interner.
@since 8.0

