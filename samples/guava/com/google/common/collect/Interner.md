# Interface: `Interner`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Interner`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Common implementations
 are available from the Interners class.

 
Note that String.intern() has some well-known performance limitations, and should
 generally be avoided. Prefer Interners#newWeakInterner or another Interner
 implementation even for String interning.

## Methods

### `intern(E sample)`

**Returns:** `E`

If two equal inputs are given to this method,
 both calls will return the same instance. That is, intern(a).equals(a) always holds,
 and intern(a) == intern(b) if and only if a.equals(b). Note that 
 intern(a) is permitted to return one instance now and a different instance later if the
 original interned instance was garbage-collected.

 
**Warning:** do not use with mutable objects.

**Parameters:**
- `sample` (`E`)

