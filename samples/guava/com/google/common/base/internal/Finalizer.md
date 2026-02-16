# Class: `Finalizer`

**Package:** [`com.google.common.base.internal`](README.md)

**Fully Qualified Name:** `com.google.common.base.internal.Finalizer`

**Implements:** `java.lang.Runnable`

## Description

Thread that finalizes referents. All references should implement `com.google.common.base.FinalizableReference`.

 <p>While this class is public, we consider it to be *internal* and not part of our published API.
 It is public so we can access it reflectively across class loaders in secure environments.

 <p>This class can't depend on other Guava code. If we were to load this class in the same class
 loader as the rest of Guava, this thread would keep an indirect strong reference to the class
 loader and prevent it from being garbage collected. This poses a problem for environments where
 you want to throw away the class loader. For example, dynamically reloading a web application or
 unloading an OSGi bundle.

 <p>`com.google.common.base.FinalizableReferenceQueue` loads this class in its own class
 loader. That way, this class doesn't prevent the main class loader from getting garbage
 collected, and this class can detect when the main class loader has been garbage collected and
 stop itself.

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

### `FINALIZABLE_REFERENCE`

**Type:** `java.lang.String`

Name of FinalizableReference.class.

### `finalizableReferenceClassReference`

**Type:** `java.lang.ref.WeakReference<java.lang.Class<?>>`

### `frqReference`

**Type:** `java.lang.ref.PhantomReference<java.lang.Object>`

### `queue`

**Type:** `java.lang.ref.ReferenceQueue<java.lang.Object>`

### `bigThreadConstructor`

**Type:** `java.lang.reflect.Constructor<java.lang.Thread>`

### `inheritableThreadLocals`

**Type:** `java.lang.reflect.Field`

## Constructors

### `<init>(`java.lang.Class<?>` finalizableReferenceClass, `java.lang.ref.ReferenceQueue<java.lang.Object>` queue, `java.lang.ref.PhantomReference<java.lang.Object>` frqReference)`

Constructs a new finalizer thread.

## Methods

### `startFinalizer(`java.lang.Class<?>` finalizableReferenceClass, `java.lang.ref.ReferenceQueue<java.lang.Object>` queue, `java.lang.ref.PhantomReference<java.lang.Object>` frqReference)`

**Returns:** `void`

Starts the Finalizer thread. FinalizableReferenceQueue calls this method reflectively.
@param finalizableReferenceClass FinalizableReference.class.
@param queue a reference queue that the thread will poll.
@param frqReference a phantom reference to the FinalizableReferenceQueue, which will be queued
     either when the FinalizableReferenceQueue is no longer referenced anywhere, or when its
     close() method is called.

### `run()`

**Returns:** `void`

Loops continuously, pulling references off the queue and cleaning them up.

### `cleanUp(`java.lang.ref.Reference<?>` firstReference)`

**Returns:** `boolean`

Cleans up the given reference and any other references already in the queue. Catches and logs
 all throwables.
@return true if the caller should continue to wait for more references to be added to the
     queue, false if the associated FinalizableReferenceQueue is no longer referenced.

### `finalizeReference(`java.lang.ref.Reference<?>` reference, `java.lang.reflect.Method` finalizeReferentMethod)`

**Returns:** `boolean`

Cleans up the given reference. Catches and logs all throwables.
@return true if the caller should continue to clean up references from the queue, false if the
     associated FinalizableReferenceQueue is no longer referenced.

### `getFinalizeReferentMethod()`

**Returns:** `java.lang.reflect.Method`

Looks up FinalizableReference.finalizeReferent() method.

### `getInheritableThreadLocalsField()`

**Returns:** `java.lang.reflect.Field`

### `getBigThreadConstructor()`

**Returns:** `java.lang.reflect.Constructor<java.lang.Thread>`

