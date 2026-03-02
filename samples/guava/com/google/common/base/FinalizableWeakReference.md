# Class: `FinalizableWeakReference`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FinalizableWeakReference`

**Extends:** `java.lang.ref.WeakReference<T>`

**Implements:** [`com.google.common.base.FinalizableReference`](./FinalizableReference.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

This is a simpler alternative to using a ReferenceQueue.

## Constructors

### `<init>(T referent, FinalizableReferenceQueue queue)`

**Parameters:**
- `referent` (`T`): to weakly reference
- `queue` ([`com.google.common.base.FinalizableReferenceQueue`](./FinalizableReferenceQueue.md)): that should finalize the referent

