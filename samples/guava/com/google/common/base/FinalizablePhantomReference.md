# Class: `FinalizablePhantomReference`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FinalizablePhantomReference`

**Extends:** `java.lang.ref.PhantomReference<T>`

**Implements:** [`com.google.common.base.FinalizableReference`](./FinalizableReference.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Phantom reference with a {@code finalizeReferent()} method which a background thread invokes
 after the garbage collector reclaims the referent. This is a simpler alternative to using a
 {@link ReferenceQueue}.

 <p>Unlike a normal phantom reference, this reference will be cleared automatically.
@author Bob Lee
@since 2.0

## Constructors

### `<init>([`T`](T.md) referent, [`com.google.common.base.FinalizableReferenceQueue`](./FinalizableReferenceQueue.md) queue)`

Constructs a new finalizable phantom reference.
@param referent to phantom reference
@param queue that should finalize the referent

