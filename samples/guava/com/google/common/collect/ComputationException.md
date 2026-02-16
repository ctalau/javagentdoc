# Class: `ComputationException`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ComputationException`

**Extends:** `java.lang.RuntimeException`

## Description

Wraps an exception that occurred during a computation.
**Author:** Bob Lee
**Since:** 2.0
**Deprecated:**This exception is no longer thrown by `com.google.common`. Previously, it was
     thrown by `MapMaker` computing maps. When support for computing maps was removed from
     `MapMaker`, it was added to `CacheBuilder`, which throws `ExecutionException`, `UncheckedExecutionException`, and `ExecutionError`. Any
     code that is still catching `ComputationException` may need to be updated to catch some
     of those types instead. (Note that this type, though deprecated, is not planned to be removed
     from Guava.)

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.lang.Throwable` cause)`

Creates a new instance with the given cause.

