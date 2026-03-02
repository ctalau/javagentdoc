# Class: `FinalizablePhantomReference`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FinalizablePhantomReference`

**Extends:** `java.lang.ref.PhantomReference<T>`

**Implements:** [`com.google.common.base.FinalizableReference`](./FinalizableReference.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

This is a simpler alternative to using a
 ReferenceQueue.

 
Unlike a normal phantom reference, this reference will be cleared automatically.

## Constructors

### `<init>(T referent, com.google.common.base.FinalizableReferenceQueue queue)`

**Parameters:**
- `referent` (`T`): to phantom reference
- `queue` ([`com.google.common.base.FinalizableReferenceQueue`](./FinalizableReferenceQueue.md)): that should finalize the referent

