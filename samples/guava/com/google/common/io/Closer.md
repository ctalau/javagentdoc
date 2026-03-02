# Class: `Closer`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Closer`

**Implements:** `java.io.Closeable`

## Description

This is intended to approximately emulate the behavior of Java 7's [try-with-resources](http://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html) statement in JDK6-compatible code. Running on Java 7, code using this
 should be approximately equivalent in behavior to the same code written with try-with-resources.
 Running on Java 6, exceptions that cannot be thrown must be logged rather than being added to the
 thrown exception as a suppressed exception.

 
This class is intended to be used in the following pattern:

 

```

 Closer closer = Closer.create();
 try {
   InputStream in = closer.register(openInputStream());
   OutputStream out = closer.register(openOutputStream());
   // do stuff
 } catch (Throwable e) {
   // ensure that any checked exception types other than IOException that could be thrown are
   // provided here, e.g. throw closer.rethrow(e, CheckedException.class);
   throw closer.rethrow(e);
 } finally {
   closer.close();
 }
 
```


 
Note that this try-catch-finally block is not equivalent to a try-catch-finally block using
 try-with-resources. To get the equivalent of that, you must wrap the above code in *another*
 try block in order to catch any exception that may be thrown (including from the call to 
 close()).

 
This pattern ensures the following:

 

   - Each Closeable resource that is successfully registered will be closed later.
   - If a Throwable is thrown in the try block, no exceptions that occur when attempting
       to close resources will be thrown from the finally block. The throwable from the try block
       will be thrown.
   - If no exceptions or errors were thrown in the try block, the *first* exception thrown
       by an attempt to close a resource will be thrown.
   - Any exception caught when attempting to close a resource that is *not* thrown (because
       another exception is already being thrown) is *suppressed*.
 


 
An exception that is suppressed is not thrown. The method of suppression used depends on the
 version of Java the code is running on:

 

   - **Java 7+:** Exceptions are suppressed by adding them to the exception that *will*
       be thrown using Throwable.addSuppressed(Throwable).
   - **Java 6:** Exceptions are suppressed by logging them instead.

## Fields

### `SUPPRESSOR`

**Type:** `com.google.common.io.Closer.Suppressor`

### `suppressor`

**Type:** `com.google.common.io.Closer.Suppressor`

### `stack`

**Type:** `java.util.Deque<java.io.Closeable>`

### `thrown`

**Type:** `java.lang.Throwable`

## Constructors

### `<init>(Closer.Suppressor suppressor)`

**Parameters:**
- `suppressor` (`com.google.common.io.Closer.Suppressor`)

## Methods

### `create()`

**Returns:** [`com.google.common.io.Closer`](./Closer.md)

### `register(C closeable)`

**Parameters:**
- `closeable` (`C`)

**Returns:** `C`

### `rethrow(Throwable e)`

It will be rethrown as is if it is an 
 IOException, RuntimeException or Error. Otherwise, it will be rethrown wrapped
 in a RuntimeException. **Note:** Be sure to declare all of the checked exception
 types your try block can throw when calling an overload of this method so as to avoid losing
 the original exception type.

 
This method always throws, and as such should be called as throw closer.rethrow(e);
 to ensure the compiler knows that it will throw.

**Parameters:**
- `e` (`java.lang.Throwable`)

**Returns:** `java.lang.RuntimeException`

### `rethrow(Throwable e, Class<X> declaredType)`

It will be rethrown as is if it is an 
 IOException, RuntimeException, Error or a checked exception of the given type.
 Otherwise, it will be rethrown wrapped in a RuntimeException. **Note:** Be sure to
 declare all of the checked exception types your try block can throw when calling an overload of
 this method so as to avoid losing the original exception type.

 
This method always throws, and as such should be called as throw closer.rethrow(e,
 ...); to ensure the compiler knows that it will throw.

**Parameters:**
- `e` (`java.lang.Throwable`)
- `declaredType` (`java.lang.Class<X>`)

**Returns:** `java.lang.RuntimeException`

### `rethrow(Throwable e, Class<X1> declaredType1, Class<X2> declaredType2)`

It will be rethrown as is if it is an 
 IOException, RuntimeException, Error or a checked exception of either of the
 given types. Otherwise, it will be rethrown wrapped in a RuntimeException. **Note:**
 Be sure to declare all of the checked exception types your try block can throw when calling an
 overload of this method so as to avoid losing the original exception type.

 
This method always throws, and as such should be called as throw closer.rethrow(e,
 ...); to ensure the compiler knows that it will throw.

**Parameters:**
- `e` (`java.lang.Throwable`)
- `declaredType1` (`java.lang.Class<X1>`)
- `declaredType2` (`java.lang.Class<X2>`)

**Returns:** `java.lang.RuntimeException`

### `close()`

If an
 exception was thrown in the try block and passed to one of the exceptionThrown methods,
 any exceptions thrown when attempting to close a closeable will be suppressed. Otherwise, the
 *first* exception to be thrown from an attempt to close a closeable will be thrown and any
 additional exceptions that are thrown after that will be suppressed.

**Returns:** `void`

