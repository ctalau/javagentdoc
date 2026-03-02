# Class: `ExecutionError`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ExecutionError`

**Extends:** `java.lang.Error`

## Description

As with 
 ExecutionException, the error's cause comes from a failed task,
 possibly run in another thread. That cause should itself be an Error; if not, use 
 ExecutionException or UncheckedExecutionException. This allows the client code to
 continue to distinguish between exceptions and errors, even when they come from other threads.

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

### `<init>(String message)`

**Parameters:**
- `message` (`java.lang.String`)

### `<init>(String message, Error cause)`

**Parameters:**
- `message` (`java.lang.String`)
- `cause` (`java.lang.Error`)

### `<init>(Error cause)`

**Parameters:**
- `cause` (`java.lang.Error`)

