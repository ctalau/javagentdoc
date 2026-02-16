# Class: `FinalizableWeakReference`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FinalizableWeakReference`

**Extends:** `java.lang.ref.WeakReference<T>`

**Implements:** [`com.google.common.base.FinalizableReference`](./FinalizableReference.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Weak reference with a {@code finalizeReferent()} method which a background thread invokes after
 the garbage collector reclaims the referent. This is a simpler alternative to using a {@link ReferenceQueue}.
@author Bob Lee
@since 2.0

## Constructors

### `<init>([`T`](T.md) referent, [`com.google.common.base.FinalizableReferenceQueue`](./FinalizableReferenceQueue.md) queue)`

Constructs a new finalizable weak reference.
@param referent to weakly reference
@param queue that should finalize the referent

