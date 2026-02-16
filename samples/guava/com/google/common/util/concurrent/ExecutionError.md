# Class: `ExecutionError`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ExecutionError`

**Extends:** `java.lang.Error`

## Description

`Error` variant of `java.util.concurrent.ExecutionException`. As with `ExecutionException`, the error's cause comes from a failed task,
 possibly run in another thread. That cause should itself be an `Error`; if not, use `ExecutionException` or `UncheckedExecutionException`. This allows the client code to
 continue to distinguish between exceptions and errors, even when they come from other threads.
**Author:** Chris Povirk
**Since:** 10.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

Creates a new instance with `null` as its detail message.

### `<init>(`java.lang.String` message)`

Creates a new instance with the given detail message.

### `<init>(`java.lang.String` message, `java.lang.Error` cause)`

Creates a new instance with the given detail message and cause.

### `<init>(`java.lang.Error` cause)`

Creates a new instance with the given cause.

