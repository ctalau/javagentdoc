# Class: `UncaughtExceptionHandlers`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.UncaughtExceptionHandlers`

## Description

## Constructors

### `<init>()`

## Methods

### `systemExit()`

**Returns:** `java.lang.Thread.UncaughtExceptionHandler`

This is particularly useful for the main
 thread, which may start up other, non-daemon threads, but fail to fully initialize the
 application successfully.

 
Example usage:

 

```

 public static void main(String[] args) {
   Thread.currentThread().setUncaughtExceptionHandler(UncaughtExceptionHandlers.systemExit());
   ...
 
```


 
The returned handler logs any exception at severity SEVERE and then shuts down the
 process with an exit status of 1, indicating abnormal termination.

