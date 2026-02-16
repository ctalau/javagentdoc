# Class: `Throwables`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Throwables`

## Description

Static utility methods pertaining to instances of `Throwable`.

 <p>See the Guava User Guide entry on <a href="https://github.com/google/guava/wiki/ThrowablesExplained">Throwables</a>.
**Author:** Kevin Bourrillion
**Author:** Ben Yu
**Since:** 1.0

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

Throws `throwable` if it is an instance of `declaredType`. Example usage:

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
**Since:** 20.0

### `propagateIfInstanceOf(`java.lang.Throwable` throwable, `java.lang.Class<X>` declaredType)`

**Returns:** `void`

Propagates `throwable` exactly as-is, if and only if it is an instance of `declaredType`. Example usage:

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
**Deprecated:** Use `throwIfInstanceOf`, which has the same behavior but rejects `null`.

### `throwIfUnchecked(`java.lang.Throwable` throwable)`

**Returns:** `void`

Throws `throwable` if it is a `RuntimeException` or `Error`. Example usage:

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
**Since:** 20.0

### `propagateIfPossible(`java.lang.Throwable` throwable)`

**Returns:** `void`

Propagates `throwable` exactly as-is, if and only if it is an instance of `RuntimeException` or `Error`.
**Deprecated:** Use `throwIfUnchecked`, which has the same behavior but rejects `null`.

### `propagateIfPossible(`java.lang.Throwable` throwable, `java.lang.Class<X>` declaredType)`

**Returns:** `void`

Propagates `throwable` exactly as-is, if and only if it is an instance of `RuntimeException`, `Error`, or `declaredType`.

 <p><b>Discouraged</b> in favor of calling `throwIfInstanceOf` and `throwIfUnchecked`.
@param throwable the Throwable to possibly propagate
@param declaredType the single checked exception type declared by the calling method

### `propagateIfPossible(`java.lang.Throwable` throwable, `java.lang.Class<X1>` declaredType1, `java.lang.Class<X2>` declaredType2)`

**Returns:** `void`

Propagates `throwable` exactly as-is, if and only if it is an instance of `RuntimeException`, `Error`, `declaredType1`, or `declaredType2`.

 <p><b>Discouraged</b> in favor of calling `throwIfInstanceOf` and `throwIfUnchecked`.
@param throwable the Throwable to possibly propagate
@param declaredType1 any checked exception type declared by the calling method
@param declaredType2 any other checked exception type declared by the calling method

### `propagate(`java.lang.Throwable` throwable)`

**Returns:** `java.lang.RuntimeException`

Propagates `throwable` as-is if it is an instance of `RuntimeException` or `Error`, or else as a last resort, wraps it in a `RuntimeException` and then propagates.

 <p>This method always throws an exception. The `RuntimeException` return type allows
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
**Deprecated:** To preserve behavior, use `throw e` or `throw new RuntimeException(e)`
     directly, or use a combination of `throwIfUnchecked` and `throw new
     RuntimeException(e)`. But consider whether users would be better off if your API threw a
     different type of exception. For background on the deprecation, read <a href="https://goo.gl/Ivn2kc">Why we deprecated `Throwables.propagate`</a>.

### `getRootCause(`java.lang.Throwable` throwable)`

**Returns:** `java.lang.Throwable`

Returns the innermost cause of `throwable`. The first throwable in a chain provides
 context from when the error or exception was initially detected. Example usage:

 <pre>
 assertEquals("Unable to assign a customer id", Throwables.getRootCause(e).getMessage());
 </pre>
@throws IllegalArgumentException if there is a loop in the causal chain

### `getCausalChain(`java.lang.Throwable` throwable)`

**Returns:** `java.util.List<java.lang.Throwable>`

Gets a `Throwable` cause chain as a list. The first entry in the list will be `throwable` followed by its cause hierarchy. Note that this is a snapshot of the cause chain and
 will not reflect any subsequent changes to the cause chain.

 <p>Here's an example of how it can be used to find specific types of exceptions in the cause
 chain:

 <pre>
 Iterables.filter(Throwables.getCausalChain(e), IOException.class));
 </pre>
@param throwable the non-null `Throwable` to extract causes from
@return an unmodifiable list containing the cause chain starting with `throwable`
@throws IllegalArgumentException if there is a loop in the causal chain

### `getCauseAs(`java.lang.Throwable` throwable, `java.lang.Class<X>` expectedCauseType)`

**Returns:** `X`

Returns `throwable`'s cause, cast to `expectedCauseType`.

 <p>Prefer this method instead of manually casting an exception's cause. For example, `(IOException) e.getCause()` throws a `ClassCastException` that discards the original
 exception `e` if the cause is not an `IOException`, but `Throwables.getCauseAs(e, IOException.class)` keeps `e` as the `ClassCastException`'s cause.
@throws ClassCastException if the cause cannot be cast to the expected type. The `ClassCastException`'s cause is `throwable`.
**Since:** 22.0

### `getStackTraceAsString(`java.lang.Throwable` throwable)`

**Returns:** `java.lang.String`

Returns a string containing the result of `Throwable.toString() toString()`, followed by
 the full, recursive stack trace of `throwable`. Note that you probably should not be
 parsing the resulting string; if you need programmatic access to the stack frames, you can call
 `Throwable.getStackTrace()`.

### `lazyStackTrace(`java.lang.Throwable` throwable)`

**Returns:** `java.util.List<java.lang.StackTraceElement>`

Returns the stack trace of `throwable`, possibly providing slower iteration over the full
 trace but faster iteration over parts of the trace. Here, "slower" and "faster" are defined in
 comparison to the normal way to access the stack trace, `Throwable.getStackTrace() throwable.getStackTrace()`. Note, however, that this method's special implementation is not
 available for all platforms and configurations. If that implementation is unavailable, this
 method falls back to `getStackTrace`. Callers that require the special implementation can
 check its availability with `lazyStackTraceIsLazy()`.

 <p>The expected (but not guaranteed) performance of the special implementation differs from
 `getStackTrace` in one main way: The `lazyStackTrace` call itself returns quickly
 by delaying the per-stack-frame work until each element is accessed. Roughly speaking:

 <ul>
   <li>`getStackTrace` takes `stackSize` time to return but then negligible time to
       retrieve each element of the returned list.
   <li>`lazyStackTrace` takes negligible time to return but then `1/stackSize` time
       to retrieve each element of the returned list (probably slightly more than `1/stackSize`).
 </ul>

 <p>Note: The special implementation does not respect calls to `Throwable.setStackTrace throwable.setStackTrace`. Instead, it always reflects the original stack trace from the
 exception's creation.
**Since:** 19.0
**Deprecated:** This method is equivalent to `Throwable.getStackTrace()` on JDK versions past
     JDK 8 and on all Android versions. Use `Throwable.getStackTrace()` directly, or where
     possible use the `java.lang.StackWalker.walk` method introduced in JDK 9.

### `lazyStackTraceIsLazy()`

**Returns:** `boolean`

Returns whether `lazyStackTrace` will use the special implementation described in its
 documentation.
**Since:** 19.0
**Deprecated:** This method always returns false on JDK versions past JDK 8 and on all Android
     versions.

### `jlaStackTrace(`java.lang.Throwable` t)`

**Returns:** `java.util.List<java.lang.StackTraceElement>`

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
 cannot be found (it is only to be found in fairly recent JDKs). Tries to test method `sun.misc.JavaLangAccess.getStackTraceDepth(Throwable) getStackTraceDepth` prior to return it
 (might fail some JDKs).

 <p>See <a href="https://github.com/google/guava/issues/2887">Throwables#lazyStackTrace throws
 UnsupportedOperationException</a>.

### `getJlaMethod(`java.lang.String` name, `java.lang.Class<?>[]` parameterTypes)`

**Returns:** `java.lang.reflect.Method`

