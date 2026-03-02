# Class: `ProcessListener`

**Package:** [`ro.sync.exml.workspace.api.process`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.process.ProcessListener`

## Description

Listens on an executed process.

## Constructors

### `<init>()`

## Methods

### `newOutputLine(String line)`

**Parameters:**
- `line` (`java.lang.String`): The output line.

**Returns:** `void`

### `newErrorLine(String line)`

**Parameters:**
- `line` (`java.lang.String`): The error line.

**Returns:** `void`

### `processEnded(int exitCode)`

**Parameters:**
- `exitCode` (`int`): The exit code of the process.

**Returns:** `void`

### `processStarted(String processName, String fullCommand)`

**Parameters:**
- `processName` (`java.lang.String`): The name of process.
- `fullCommand` (`java.lang.String`): The full command line.

**Returns:** `void`

### `processAboutToStart(String processName, String fullCommand)`

**Parameters:**
- `processName` (`java.lang.String`): The name of process.
- `fullCommand` (`java.lang.String`): The full command line.

**Returns:** `void`

### `processStarted(Process process)`

**Parameters:**
- `process` (`java.lang.Process`): The process which started

**Returns:** `void`

### `processCouldNotStart(String message)`

**Parameters:**
- `message` (`java.lang.String`): The error message.

**Returns:** `void`

