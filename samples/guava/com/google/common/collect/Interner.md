# Interface: `Interner`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Interner`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Provides similar behavior to `String.intern` for any immutable type. Common implementations
 are available from the `Interners` class.

 <p>Note that `String.intern()` has some well-known performance limitations, and should
 generally be avoided. Prefer `Interners.newWeakInterner` or another `Interner`
 implementation even for `String` interning.
**Author:** Kevin Bourrillion
**Since:** 3.0

## Methods

### `intern(`E` sample)`

**Returns:** `E`

Chooses and returns the representative instance for any of a collection of instances that are
 equal to each other. If two equal inputs are given to this method,
 both calls will return the same instance. That is, `intern(a).equals(a)` always holds,
 and `intern(a) == intern(b)` if and only if `a.equals(b)`. Note that `intern(a)` is permitted to return one instance now and a different instance later if the
 original interned instance was garbage-collected.

 <p><b>Warning:</b> do not use with mutable objects.
@throws NullPointerException if `sample` is null

