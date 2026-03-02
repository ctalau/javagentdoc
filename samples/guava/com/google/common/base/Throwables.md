# Class: `Throwables`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Throwables`

## Description

See the Guava User Guide entry on [Throwables](https://github.com/google/guava/wiki/ThrowablesExplained).

## Fields

### `JAVA_LANG_ACCESS_CLASSNAME`

**Type:** `java.lang.String`

### `SHARED_SECRETS_CLASSNAME`

**Type:** `java.lang.String`

### `jla`

**Type:** `java.lang.Object`

### `getStackTraceElementMethod`

**Type:** `java.lang.reflect.Method`

When this is null, use the slow way.

### `getStackTraceDepthMethod`

**Type:** `java.lang.reflect.Method`

When this is null, use the slow way.

## Constructors

### `<init>()`

## Methods

### `throwIfInstanceOf(Throwable throwable, Class<X> declaredType)`

Example usage:

 

```

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
 
```

**Parameters:**
- `throwable` (`java.lang.Throwable`)
- `declaredType` (`java.lang.Class<X>`)

**Returns:** `void`

### `propagateIfInstanceOf(Throwable throwable, Class<X> declaredType)`

Example usage:

 

```

 try {
   someMethodThatCouldThrowAnything();
 } catch (IKnowWhatToDoWithThisException e) {
   handle(e);
 } catch (Throwable t) {
   Throwables.propagateIfInstanceOf(t, IOException.class);
   Throwables.propagateIfInstanceOf(t, SQLException.class);
   throw Throwables.propagate(t);
 }
 
```

**Parameters:**
- `throwable` (`java.lang.Throwable`)
- `declaredType` (`java.lang.Class<X>`)

**Returns:** `void`

### `throwIfUnchecked(Throwable throwable)`

Example usage:

 

```

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
 
```

**Parameters:**
- `throwable` (`java.lang.Throwable`)

**Returns:** `void`

### `propagateIfPossible(Throwable throwable)`

**Parameters:**
- `throwable` (`java.lang.Throwable`)

**Returns:** `void`

### `propagateIfPossible(Throwable throwable, Class<X> declaredType)`

**Discouraged** in favor of calling #throwIfInstanceOf and #throwIfUnchecked.

**Parameters:**
- `throwable` (`java.lang.Throwable`): the Throwable to possibly propagate
- `declaredType` (`java.lang.Class<X>`): the single checked exception type declared by the calling method

**Returns:** `void`

### `propagateIfPossible(Throwable throwable, Class<X1> declaredType1, Class<X2> declaredType2)`

**Discouraged** in favor of calling #throwIfInstanceOf and #throwIfUnchecked.

**Parameters:**
- `throwable` (`java.lang.Throwable`): the Throwable to possibly propagate
- `declaredType1` (`java.lang.Class<X1>`): any checked exception type declared by the calling method
- `declaredType2` (`java.lang.Class<X2>`): any other checked exception type declared by the calling method

**Returns:** `void`

### `propagate(Throwable throwable)`

This method always throws an exception. The RuntimeException return type allows
 client code to signal to the compiler that statements after the call are unreachable. Example
 usage:

 

```

 T doSomething() {
   try {
     return someMethodThatCouldThrowAnything();
   } catch (IKnowWhatToDoWithThisException e) {
     return handle(e);
   } catch (Throwable t) {
     throw Throwables.propagate(t);
   }
 }
 
```

**Parameters:**
- `throwable` (`java.lang.Throwable`): the Throwable to propagate

**Returns:** `java.lang.RuntimeException`

### `getRootCause(Throwable throwable)`

The first throwable in a chain provides
 context from when the error or exception was initially detected. Example usage:

 

```

 assertEquals("Unable to assign a customer id", Throwables.getRootCause(e).getMessage());
 
```

**Parameters:**
- `throwable` (`java.lang.Throwable`)

**Returns:** `java.lang.Throwable`

### `getCausalChain(Throwable throwable)`

The first entry in the list will be 
 throwable followed by its cause hierarchy. Note that this is a snapshot of the cause chain and
 will not reflect any subsequent changes to the cause chain.

 
Here's an example of how it can be used to find specific types of exceptions in the cause
 chain:

 

```

 Iterables.filter(Throwables.getCausalChain(e), IOException.class));
 
```

**Parameters:**
- `throwable` (`java.lang.Throwable`): the non-null Throwable to extract causes from

**Returns:** `java.util.List<java.lang.Throwable>`

### `getCauseAs(Throwable throwable, Class<X> expectedCauseType)`

Prefer this method instead of manually casting an exception's cause. For example, 
 (IOException) e.getCause() throws a ClassCastException that discards the original
 exception e if the cause is not an IOException, but 
 Throwables.getCauseAs(e, IOException.class) keeps e as the ClassCastException's cause.

**Parameters:**
- `throwable` (`java.lang.Throwable`)
- `expectedCauseType` (`java.lang.Class<X>`)

**Returns:** `X`

### `getStackTraceAsString(Throwable throwable)`

Note that you probably should not be
 parsing the resulting string; if you need programmatic access to the stack frames, you can call
 Throwable#getStackTrace().

**Parameters:**
- `throwable` (`java.lang.Throwable`)

**Returns:** `java.lang.String`

### `lazyStackTrace(Throwable throwable)`

Here, "slower" and "faster" are defined in
 comparison to the normal way to access the stack trace, throwable.getStackTrace(). Note, however, that this method's special implementation is not
 available for all platforms and configurations. If that implementation is unavailable, this
 method falls back to getStackTrace. Callers that require the special implementation can
 check its availability with #lazyStackTraceIsLazy().

 
The expected (but not guaranteed) performance of the special implementation differs from
 getStackTrace in one main way: The lazyStackTrace call itself returns quickly
 by delaying the per-stack-frame work until each element is accessed. Roughly speaking:

 

   - getStackTrace takes stackSize time to return but then negligible time to
       retrieve each element of the returned list.
   - lazyStackTrace takes negligible time to return but then 1/stackSize time
       to retrieve each element of the returned list (probably slightly more than 
       1/stackSize).
 


 
Note: The special implementation does not respect calls to throwable.setStackTrace. Instead, it always reflects the original stack trace from the
 exception's creation.

**Parameters:**
- `throwable` (`java.lang.Throwable`)

**Returns:** `java.util.List<java.lang.StackTraceElement>`

### `lazyStackTraceIsLazy()`

**Returns:** `boolean`

### `jlaStackTrace(Throwable t)`

**Parameters:**
- `t` (`java.lang.Throwable`)

**Returns:** `java.util.List<java.lang.StackTraceElement>`

### `invokeAccessibleNonThrowingMethod(Method method, Object receiver, Object[] params)`

**Parameters:**
- `method` (`java.lang.reflect.Method`)
- `receiver` (`java.lang.Object`)
- `params` (`java.lang.Object[]`)

**Returns:** `java.lang.Object`

### `getJLA()`

It is not allowed in
 AppEngine, and not present in non-Sun JDKs.

**Returns:** `java.lang.Object`

### `getGetMethod()`

**Returns:** `java.lang.reflect.Method`

### `getSizeMethod(Object jla)`

Tries to test method getStackTraceDepth prior to return it
 (might fail some JDKs).

 
See [Throwables#lazyStackTrace throws
 UnsupportedOperationException](https://github.com/google/guava/issues/2887).

**Parameters:**
- `jla` (`java.lang.Object`)

**Returns:** `java.lang.reflect.Method`

### `getJlaMethod(String name, Class<?>[] parameterTypes)`

**Parameters:**
- `name` (`java.lang.String`)
- `parameterTypes` (`java.lang.Class<?>[]`)

**Returns:** `java.lang.reflect.Method`

