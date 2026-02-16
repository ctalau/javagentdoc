# Class: `UncheckedExecutionException`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.UncheckedExecutionException`

**Extends:** `java.lang.RuntimeException`

## Description

Unchecked variant of {@link java.util.concurrent.ExecutionException}. As with {@code
 ExecutionException}, the exception's {@linkplain #getCause() cause} comes from a failed task,
 possibly run in another thread.

 <p>{@code UncheckedExecutionException} is intended as an alternative to {@code
 ExecutionException} when the exception thrown by a task is an unchecked exception. However, it
 may also wrap a checked exception in some cases.

 <p>When wrapping an {@code Error} from another thread, prefer {@link ExecutionError}. When
 wrapping a checked exception, prefer {@code ExecutionException}.
@author Charles Fry
@since 10.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

Creates a new instance with {@code null} as its detail message.

### `<init>(`java.lang.String` message)`

Creates a new instance with the given detail message.

### `<init>(`java.lang.String` message, `java.lang.Throwable` cause)`

Creates a new instance with the given detail message and cause.

### `<init>(`java.lang.Throwable` cause)`

Creates a new instance with the given cause.

