# Class: `Interners`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Interners`

## Description

## Constructors

### `<init>()`

## Methods

### `newBuilder()`

**Returns:** `com.google.common.collect.Interners.InternerBuilder`

### `newStrongInterner()`

If this retention is
 acceptable, this implementation may perform better than #newWeakInterner.

**Returns:** [`com.google.common.collect.Interner<E>`](./Interner.md)

### `newWeakInterner()`

This most
 likely does not perform as well as #newStrongInterner, but is the best alternative when
 the memory usage of that implementation is unacceptable.

**Returns:** [`com.google.common.collect.Interner<E>`](./Interner.md)

### `asFunction(Interner<E> interner)`

**Parameters:**
- `interner` ([`com.google.common.collect.Interner<E>`](./Interner.md))

**Returns:** [`com.google.common.base.Function<E,E>`](../base/Function.md)

