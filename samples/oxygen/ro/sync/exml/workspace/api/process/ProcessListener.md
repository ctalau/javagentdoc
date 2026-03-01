# Class: `ProcessListener`

**Package:** [`ro.sync.exml.workspace.api.process`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.process.ProcessListener`

## Description

Listens on an executed process.

## Constructors

### `<init>()`

## Methods

### `newOutputLine(`java.lang.String` line)`

**Returns:** `void`

### `newErrorLine(`java.lang.String` line)`

**Returns:** `void`

### `processEnded(`int` exitCode)`

**Returns:** `void`

### `processStarted(`java.lang.String` processName, `java.lang.String` fullCommand)`

**Returns:** `void`

### `processAboutToStart(`java.lang.String` processName, `java.lang.String` fullCommand)`

**Returns:** `void`

### `processStarted(`java.lang.Process` process)`

**Returns:** `void`

### `processCouldNotStart(`java.lang.String` message)`

**Returns:** `void`

