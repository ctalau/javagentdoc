# Interface: `ProcessController`

**Package:** [`ro.sync.exml.workspace.api.process`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.process.ProcessController`

## Description

Can be used to start or stop it.

## Methods

### `start()`

**Returns:** `void`

This method blocks until the process ends.

### `stop()`

**Returns:** `void`

Will also kill sub-processes.

### `sendMessage(java.lang.String message)`

**Returns:** `void`

The message will be sent  "UTF-8" encoded via the java.lang.Process.getOutputStream().

**Parameters:**
- `message` (`java.lang.String`): The message.

