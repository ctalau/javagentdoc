# Class: `ExecutionError`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ExecutionError`

**Extends:** `java.lang.Error`

## Description

{@link Error} variant of {@link java.util.concurrent.ExecutionException}. As with {@code
 ExecutionException}, the error's {@linkplain #getCause() cause} comes from a failed task,
 possibly run in another thread. That cause should itself be an {@code Error}; if not, use {@code
 ExecutionException} or {@link UncheckedExecutionException}. This allows the client code to
 continue to distinguish between exceptions and errors, even when they come from other threads.
@author Chris Povirk
@since 10.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

Creates a new instance with {@code null} as its detail message.

### `<init>(`java.lang.String` message)`

Creates a new instance with the given detail message.

### `<init>(`java.lang.String` message, `java.lang.Error` cause)`

Creates a new instance with the given detail message and cause.

### `<init>(`java.lang.Error` cause)`

Creates a new instance with the given cause.

