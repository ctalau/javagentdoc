# Class: `ComputationException`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ComputationException`

**Extends:** `java.lang.RuntimeException`

## Description

Wraps an exception that occurred during a computation.
@author Bob Lee
@since 2.0
@deprecated This exception is no longer thrown by {@code com.google.common}. Previously, it was
     thrown by {@link MapMaker} computing maps. When support for computing maps was removed from
     {@code MapMaker}, it was added to {@code CacheBuilder}, which throws {@code
     ExecutionException}, {@code UncheckedExecutionException}, and {@code ExecutionError}. Any
     code that is still catching {@code ComputationException} may need to be updated to catch some
     of those types instead. (Note that this type, though deprecated, is not planned to be removed
     from Guava.)

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.lang.Throwable` cause)`

Creates a new instance with the given cause.

