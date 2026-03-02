# Class: `UncheckedExecutionException`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.UncheckedExecutionException`

**Extends:** `java.lang.RuntimeException`

## Description

As with 
 ExecutionException, the exception's cause comes from a failed task,
 possibly run in another thread.

 
UncheckedExecutionException is intended as an alternative to 
 ExecutionException when the exception thrown by a task is an unchecked exception. However, it
 may also wrap a checked exception in some cases.

 
When wrapping an Error from another thread, prefer ExecutionError. When
 wrapping a checked exception, prefer ExecutionException.

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

### `<init>(String message)`

**Parameters:**
- `message` (`java.lang.String`)

### `<init>(String message, Throwable cause)`

**Parameters:**
- `message` (`java.lang.String`)
- `cause` (`java.lang.Throwable`)

### `<init>(Throwable cause)`

**Parameters:**
- `cause` (`java.lang.Throwable`)

