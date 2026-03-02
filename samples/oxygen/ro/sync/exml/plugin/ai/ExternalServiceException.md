# Class: `ExternalServiceException`

**Package:** [`ro.sync.exml.plugin.ai`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.ai.ExternalServiceException`

**Extends:** `java.lang.Exception`

## Description

This exception is typically used when an error arises during the execution of a tool (external AI function),
 such as failures in making external API calls, issues in processing data, or errors in service communication.
 
 

 This class includes an isFatal flag to indicate whether the error is severe enough to stop further AI interactions or other functions executions.

## Fields

### `isFatal`

**Type:** `boolean`

If false, it means the error is non-fatal and 
 the system can recover or continue executing other AI tasks.

## Constructors

### `<init>(java.lang.String message, boolean isFatal)`

**Parameters:**
- `message` (`java.lang.String`): the detail message explaining the cause of the exception.
- `isFatal` (`boolean`): a flag indicating if the exception is fatal and should stop further execution.

### `<init>(java.lang.String message, java.lang.Throwable cause, boolean isFatal)`

**Parameters:**
- `message` (`java.lang.String`): the detail message explaining the cause of the exception.
- `cause` (`java.lang.Throwable`): the cause of the exception (a Throwable object).
- `isFatal` (`boolean`): a flag indicating if the exception is fatal and should stop further execution.

## Methods

### `isFatal()`

**Returns:** `boolean`

If true, it indicates that the error is critical and further interaction with the AI or 
 further tool executions should be halted. If false, it means the error is non-fatal and 
 the system can recover or continue executing other tasks.

