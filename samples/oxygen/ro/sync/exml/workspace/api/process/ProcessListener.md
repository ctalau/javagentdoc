# Class: `ProcessListener`

**Package:** [`ro.sync.exml.workspace.api.process`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.process.ProcessListener`

## Description

Listens on an executed process.

## Constructors

### `<init>()`

## Methods

### `newOutputLine(java.lang.String line)`

**Returns:** `void`

**Parameters:**
- `line` (`java.lang.String`): The output line.

### `newErrorLine(java.lang.String line)`

**Returns:** `void`

**Parameters:**
- `line` (`java.lang.String`): The error line.

### `processEnded(int exitCode)`

**Returns:** `void`

**Parameters:**
- `exitCode` (`int`): The exit code of the process.

### `processStarted(java.lang.String processName, java.lang.String fullCommand)`

**Returns:** `void`

**Parameters:**
- `processName` (`java.lang.String`): The name of process.
- `fullCommand` (`java.lang.String`): The full command line.

### `processAboutToStart(java.lang.String processName, java.lang.String fullCommand)`

**Returns:** `void`

**Parameters:**
- `processName` (`java.lang.String`): The name of process.
- `fullCommand` (`java.lang.String`): The full command line.

### `processStarted(java.lang.Process process)`

**Returns:** `void`

**Parameters:**
- `process` (`java.lang.Process`): The process which started

### `processCouldNotStart(java.lang.String message)`

**Returns:** `void`

**Parameters:**
- `message` (`java.lang.String`): The error message.

