# Class: `Throwables`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Throwables`

## Description

Static utility methods pertaining to instances of {@link Throwable}.

 <p>See the Guava User Guide entry on <a href="https://github.com/google/guava/wiki/ThrowablesExplained">Throwables</a>.
@author Kevin Bourrillion
@author Ben Yu
@since 1.0

## Fields

### `JAVA_LANG_ACCESS_CLASSNAME`

**Type:** `java.lang.String`

JavaLangAccess class name to load using reflection

### `SHARED_SECRETS_CLASSNAME`

**Type:** `java.lang.String`

SharedSecrets class name to load using reflection

### `jla`

**Type:** `java.lang.Object`

Access to some fancy internal JVM internals.

### `getStackTraceElementMethod`

**Type:** `java.lang.reflect.Method`

The "getStackTraceElementMethod" method, only available on some JDKs so we use reflection to
 find it when available. When this is null, use the slow way.

### `getStackTraceDepthMethod`

**Type:** `java.lang.reflect.Method`

The "getStackTraceDepth" method, only available on some JDKs so we use reflection to find it
 when available. When this is null, use the slow way.

## Constructors

### `<init>()`

## Methods

### `throwIfInstanceOf(`java.lang.Throwable` throwable, `java.lang.Class<X>` declaredType)`

**Returns:** `void`

Throws {@code throwable} if it is an instance of {@code declaredType}. Example usage:

 <pre>
 for (Foo foo : foos) {
   try {
     foo.bar();
   } catch (BarException | RuntimeException | Error t) {
     failure = t;
   }
 }
 if (failure != null) {
   throwIfInstanceOf(failure, BarException.class);
   throwIfUnchecked(failure);
   throw new AssertionError(failure);
 }
 </pre>
@since 20.0

### `propagateIfInstanceOf(`java.lang.Throwable` throwable, `java.lang.Class<X>` declaredType)`

**Returns:** `void`

Propagates {@code throwable} exactly as-is, if and only if it is an instance of {@code
 declaredType}. Example usage:

 <pre>
 try {
   someMethodThatCouldThrowAnything();
 } catch (IKnowWhatToDoWithThisException e) {
   handle(e);
 } catch (Throwable t) {
   Throwables.propagateIfInstanceOf(t, IOException.class);
   Throwables.propagateIfInstanceOf(t, SQLException.class);
   throw Throwables.propagate(t);
 }
 </pre>
@deprecated Use {@link #throwIfInstanceOf}, which has the same behavior but rejects {@code
     null}.

### `throwIfUnchecked(`java.lang.Throwable` throwable)`

**Returns:** `void`

Throws {@code throwable} if it is a {@link RuntimeException} or {@link Error}. Example usage:

 <pre>
 for (Foo foo : foos) {
   try {
     foo.bar();
   } catch (RuntimeException | Error t) {
     failure = t;
   }
 }
 if (failure != null) {
   throwIfUnchecked(failure);
   throw new AssertionError(failure);
 }
 </pre>
@since 20.0

### `propagateIfPossible(`java.lang.Throwable` throwable)`

**Returns:** `void`

Propagates {@code throwable} exactly as-is, if and only if it is an instance of {@link RuntimeException} or {@link Error}.
@deprecated Use {@link #throwIfUnchecked}, which has the same behavior but rejects {@code
     null}.

### `propagateIfPossible(`java.lang.Throwable` throwable, `java.lang.Class<X>` declaredType)`

**Returns:** `void`

Propagates {@code throwable} exactly as-is, if and only if it is an instance of {@link RuntimeException}, {@link Error}, or {@code declaredType}.

 <p><b>Discouraged</b> in favor of calling {@link #throwIfInstanceOf} and {@link #throwIfUnchecked}.
@param throwable the Throwable to possibly propagate
@param declaredType the single checked exception type declared by the calling method

### `propagateIfPossible(`java.lang.Throwable` throwable, `java.lang.Class<X1>` declaredType1, `java.lang.Class<X2>` declaredType2)`

**Returns:** `void`

Propagates {@code throwable} exactly as-is, if and only if it is an instance of {@link RuntimeException}, {@link Error}, {@code declaredType1}, or {@code declaredType2}.

 <p><b>Discouraged</b> in favor of calling {@link #throwIfInstanceOf} and {@link #throwIfUnchecked}.
@param throwable the Throwable to possibly propagate
@param declaredType1 any checked exception type declared by the calling method
@param declaredType2 any other checked exception type declared by the calling method

### `propagate(`java.lang.Throwable` throwable)`

**Returns:** `java.lang.RuntimeException`

Propagates {@code throwable} as-is if it is an instance of {@link RuntimeException} or {@link Error}, or else as a last resort, wraps it in a {@code RuntimeException} and then propagates.

 <p>This method always throws an exception. The {@code RuntimeException} return type allows
 client code to signal to the compiler that statements after the call are unreachable. Example
 usage:

 <pre>
 T doSomething() {
   try {
     return someMethodThatCouldThrowAnything();
   } catch (IKnowWhatToDoWithThisException e) {
     return handle(e);
   } catch (Throwable t) {
     throw Throwables.propagate(t);
   }
 }
 </pre>
@param throwable the Throwable to propagate
@return nothing will ever be returned; this return type is only for your convenience, as
     illustrated in the example above
@deprecated To preserve behavior, use {@code throw e} or {@code throw new RuntimeException(e)}
     directly, or use a combination of {@link #throwIfUnchecked} and {@code throw new
     RuntimeException(e)}. But consider whether users would be better off if your API threw a
     different type of exception. For background on the deprecation, read <a href="https://goo.gl/Ivn2kc">Why we deprecated {@code Throwables.propagate}</a>.

### `getRootCause(`java.lang.Throwable` throwable)`

**Returns:** `java.lang.Throwable`

Returns the innermost cause of {@code throwable}. The first throwable in a chain provides
 context from when the error or exception was initially detected. Example usage:

 <pre>
 assertEquals("Unable to assign a customer id", Throwables.getRootCause(e).getMessage());
 </pre>
@throws IllegalArgumentException if there is a loop in the causal chain

### `getCausalChain(`java.lang.Throwable` throwable)`

**Returns:** [`java.util.List<java.lang.Throwable>`](../../../../java/util/List.md)

Gets a {@code Throwable} cause chain as a list. The first entry in the list will be {@code
 throwable} followed by its cause hierarchy. Note that this is a snapshot of the cause chain and
 will not reflect any subsequent changes to the cause chain.

 <p>Here's an example of how it can be used to find specific types of exceptions in the cause
 chain:

 <pre>
 Iterables.filter(Throwables.getCausalChain(e), IOException.class));
 </pre>
@param throwable the non-null {@code Throwable} to extract causes from
@return an unmodifiable list containing the cause chain starting with {@code throwable}
@throws IllegalArgumentException if there is a loop in the causal chain

### `getCauseAs(`java.lang.Throwable` throwable, `java.lang.Class<X>` expectedCauseType)`

**Returns:** [`X`](X.md)

Returns {@code throwable}'s cause, cast to {@code expectedCauseType}.

 <p>Prefer this method instead of manually casting an exception's cause. For example, {@code
 (IOException) e.getCause()} throws a {@link ClassCastException} that discards the original
 exception {@code e} if the cause is not an {@link IOException}, but {@code
 Throwables.getCauseAs(e, IOException.class)} keeps {@code e} as the {@link ClassCastException}'s cause.
@throws ClassCastException if the cause cannot be cast to the expected type. The {@code
     ClassCastException}'s cause is {@code throwable}.
@since 22.0

### `getStackTraceAsString(`java.lang.Throwable` throwable)`

**Returns:** `java.lang.String`

Returns a string containing the result of {@link Throwable#toString() toString()}, followed by
 the full, recursive stack trace of {@code throwable}. Note that you probably should not be
 parsing the resulting string; if you need programmatic access to the stack frames, you can call
 {@link Throwable#getStackTrace()}.

### `lazyStackTrace(`java.lang.Throwable` throwable)`

**Returns:** [`java.util.List<java.lang.StackTraceElement>`](../../../../java/util/List.md)

Returns the stack trace of {@code throwable}, possibly providing slower iteration over the full
 trace but faster iteration over parts of the trace. Here, "slower" and "faster" are defined in
 comparison to the normal way to access the stack trace, {@link Throwable#getStackTrace() throwable.getStackTrace()}. Note, however, that this method's special implementation is not
 available for all platforms and configurations. If that implementation is unavailable, this
 method falls back to {@code getStackTrace}. Callers that require the special implementation can
 check its availability with {@link #lazyStackTraceIsLazy()}.

 <p>The expected (but not guaranteed) performance of the special implementation differs from
 {@code getStackTrace} in one main way: The {@code lazyStackTrace} call itself returns quickly
 by delaying the per-stack-frame work until each element is accessed. Roughly speaking:

 <ul>
   <li>{@code getStackTrace} takes {@code stackSize} time to return but then negligible time to
       retrieve each element of the returned list.
   <li>{@code lazyStackTrace} takes negligible time to return but then {@code 1/stackSize} time
       to retrieve each element of the returned list (probably slightly more than {@code
       1/stackSize}).
 </ul>

 <p>Note: The special implementation does not respect calls to {@link Throwable#setStackTrace throwable.setStackTrace}. Instead, it always reflects the original stack trace from the
 exception's creation.
@since 19.0
@deprecated This method is equivalent to {@link Throwable#getStackTrace()} on JDK versions past
     JDK 8 and on all Android versions. Use {@link Throwable#getStackTrace()} directly, or where
     possible use the {@code java.lang.StackWalker.walk} method introduced in JDK 9.

### `lazyStackTraceIsLazy()`

**Returns:** `boolean`

Returns whether {@link #lazyStackTrace} will use the special implementation described in its
 documentation.
@since 19.0
@deprecated This method always returns false on JDK versions past JDK 8 and on all Android
     versions.

### `jlaStackTrace(`java.lang.Throwable` t)`

**Returns:** [`java.util.List<java.lang.StackTraceElement>`](../../../../java/util/List.md)

### `invokeAccessibleNonThrowingMethod(`java.lang.reflect.Method` method, `java.lang.Object` receiver, `java.lang.Object[]` params)`

**Returns:** `java.lang.Object`

### `getJLA()`

**Returns:** `java.lang.Object`

Returns the JavaLangAccess class that is present in all Sun JDKs. It is not allowed in
 AppEngine, and not present in non-Sun JDKs.

### `getGetMethod()`

**Returns:** `java.lang.reflect.Method`

Returns the Method that can be used to resolve an individual StackTraceElement, or null if that
 method cannot be found (it is only to be found in fairly recent JDKs).

### `getSizeMethod(`java.lang.Object` jla)`

**Returns:** `java.lang.reflect.Method`

Returns the Method that can be used to return the size of a stack, or null if that method
 cannot be found (it is only to be found in fairly recent JDKs). Tries to test method {@link sun.misc.JavaLangAccess#getStackTraceDepth(Throwable) getStackTraceDepth} prior to return it
 (might fail some JDKs).

 <p>See <a href="https://github.com/google/guava/issues/2887">Throwables#lazyStackTrace throws
 UnsupportedOperationException</a>.

### `getJlaMethod(`java.lang.String` name, `java.lang.Class<?>[]` parameterTypes)`

**Returns:** `java.lang.reflect.Method`

