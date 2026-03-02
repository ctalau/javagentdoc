# Interface: `ProcessController`

**Package:** [`ro.sync.exml.workspace.api.process`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.process.ProcessController`

## Description

Can be used to start or stop it.

## Methods

### `start()`

This method blocks until the process ends.

**Returns:** `void`

### `stop()`

Will also kill sub-processes.

**Returns:** `void`

### `sendMessage(java.lang.String message)`

The message will be sent  "UTF-8" encoded via the java.lang.Process.getOutputStream().

**Parameters:**
- `message` (`java.lang.String`): The message.

**Returns:** `void`

