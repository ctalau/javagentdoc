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

**Returns:** [`com.google.common.collect.Interner<E>`](./Interner.md)

If this retention is
 acceptable, this implementation may perform better than #newWeakInterner.

### `newWeakInterner()`

**Returns:** [`com.google.common.collect.Interner<E>`](./Interner.md)

This most
 likely does not perform as well as #newStrongInterner, but is the best alternative when
 the memory usage of that implementation is unacceptable.

### `asFunction(com.google.common.collect.Interner<E> interner)`

**Returns:** [`com.google.common.base.Function<E,E>`](../base/Function.md)

**Parameters:**
- `interner` ([`com.google.common.collect.Interner<E>`](./Interner.md))

