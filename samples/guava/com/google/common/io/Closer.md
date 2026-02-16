# Class: `Closer`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Closer`

**Implements:** [`java.io.Closeable`](../../../../java/io/Closeable.md)

## Description

A {@link Closeable} that collects {@code Closeable} resources and closes them all when it is
 {@linkplain #close closed}. This is intended to approximately emulate the behavior of Java 7's <a href="http://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html">try-with-resources</a> statement in JDK6-compatible code. Running on Java 7, code using this
 should be approximately equivalent in behavior to the same code written with try-with-resources.
 Running on Java 6, exceptions that cannot be thrown must be logged rather than being added to the
 thrown exception as a suppressed exception.

 <p>This class is intended to be used in the following pattern:

 <pre>{@code
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
 }</pre>

 <p>Note that this try-catch-finally block is not equivalent to a try-catch-finally block using
 try-with-resources. To get the equivalent of that, you must wrap the above code in <i>another</i>
 try block in order to catch any exception that may be thrown (including from the call to {@code
 close()}).

 <p>This pattern ensures the following:

 <ul>
   <li>Each {@code Closeable} resource that is successfully registered will be closed later.
   <li>If a {@code Throwable} is thrown in the try block, no exceptions that occur when attempting
       to close resources will be thrown from the finally block. The throwable from the try block
       will be thrown.
   <li>If no exceptions or errors were thrown in the try block, the <i>first</i> exception thrown
       by an attempt to close a resource will be thrown.
   <li>Any exception caught when attempting to close a resource that is <i>not</i> thrown (because
       another exception is already being thrown) is <i>suppressed</i>.
 </ul>

 <p>An exception that is suppressed is not thrown. The method of suppression used depends on the
 version of Java the code is running on:

 <ul>
   <li><b>Java 7+:</b> Exceptions are suppressed by adding them to the exception that <i>will</i>
       be thrown using {@code Throwable.addSuppressed(Throwable)}.
   <li><b>Java 6:</b> Exceptions are suppressed by logging them instead.
 </ul>
@author Colin Decker
@since 14.0

## Fields

### `SUPPRESSOR`

**Type:** [`com.google.common.io.Closer.Suppressor`](Closer/Suppressor.md)

The suppressor implementation to use for the current Java version.

### `suppressor`

**Type:** [`com.google.common.io.Closer.Suppressor`](Closer/Suppressor.md)

### `stack`

**Type:** [`java.util.Deque<java.io.Closeable>`](../../../../java/util/Deque.md)

### `thrown`

**Type:** `java.lang.Throwable`

## Constructors

### `<init>([`com.google.common.io.Closer.Suppressor`](Closer/Suppressor.md) suppressor)`

## Methods

### `create()`

**Returns:** [`com.google.common.io.Closer`](./Closer.md)

Creates a new {@link Closer}.

### `register([`C`](C.md) closeable)`

**Returns:** [`C`](C.md)

Registers the given {@code closeable} to be closed when this {@code Closer} is {@linkplain #close closed}.
@return the given {@code closeable}

### `rethrow(`java.lang.Throwable` e)`

**Returns:** `java.lang.RuntimeException`

Stores the given throwable and rethrows it. It will be rethrown as is if it is an {@code
 IOException}, {@code RuntimeException} or {@code Error}. Otherwise, it will be rethrown wrapped
 in a {@code RuntimeException}. <b>Note:</b> Be sure to declare all of the checked exception
 types your try block can throw when calling an overload of this method so as to avoid losing
 the original exception type.

 <p>This method always throws, and as such should be called as {@code throw closer.rethrow(e);}
 to ensure the compiler knows that it will throw.
@return this method does not return; it always throws
@throws IOException when the given throwable is an IOException

### `rethrow(`java.lang.Throwable` e, `java.lang.Class<X>` declaredType)`

**Returns:** `java.lang.RuntimeException`

Stores the given throwable and rethrows it. It will be rethrown as is if it is an {@code
 IOException}, {@code RuntimeException}, {@code Error} or a checked exception of the given type.
 Otherwise, it will be rethrown wrapped in a {@code RuntimeException}. <b>Note:</b> Be sure to
 declare all of the checked exception types your try block can throw when calling an overload of
 this method so as to avoid losing the original exception type.

 <p>This method always throws, and as such should be called as {@code throw closer.rethrow(e,
 ...);} to ensure the compiler knows that it will throw.
@return this method does not return; it always throws
@throws IOException when the given throwable is an IOException
@throws X when the given throwable is of the declared type X

### `rethrow(`java.lang.Throwable` e, `java.lang.Class<X1>` declaredType1, `java.lang.Class<X2>` declaredType2)`

**Returns:** `java.lang.RuntimeException`

Stores the given throwable and rethrows it. It will be rethrown as is if it is an {@code
 IOException}, {@code RuntimeException}, {@code Error} or a checked exception of either of the
 given types. Otherwise, it will be rethrown wrapped in a {@code RuntimeException}. <b>Note:</b>
 Be sure to declare all of the checked exception types your try block can throw when calling an
 overload of this method so as to avoid losing the original exception type.

 <p>This method always throws, and as such should be called as {@code throw closer.rethrow(e,
 ...);} to ensure the compiler knows that it will throw.
@return this method does not return; it always throws
@throws IOException when the given throwable is an IOException
@throws X1 when the given throwable is of the declared type X1
@throws X2 when the given throwable is of the declared type X2

### `close()`

**Returns:** `void`

Closes all {@code Closeable} instances that have been added to this {@code Closer}. If an
 exception was thrown in the try block and passed to one of the {@code exceptionThrown} methods,
 any exceptions thrown when attempting to close a closeable will be suppressed. Otherwise, the
 <i>first</i> exception to be thrown from an attempt to close a closeable will be thrown and any
 additional exceptions that are thrown after that will be suppressed.

