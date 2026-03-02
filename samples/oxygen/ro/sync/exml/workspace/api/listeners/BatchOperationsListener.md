# Class: `BatchOperationsListener`

**Package:** [`ro.sync.exml.workspace.api.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.listeners.BatchOperationsListener`

## Description

For example a CMS may automatically check out resources if Oxygen wants to modify them during such operations.

## Constructors

### `<init>()`

## Methods

### `operationAboutToStart(BatchOperationInfo batchOperationInfo)`

**Parameters:**
- `batchOperationInfo` ([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md)): Information about the operation that will start.

**Returns:** `void`

### `operationFinished(BatchOperationInfo batchOperationInfo)`

**Parameters:**
- `batchOperationInfo` ([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md)): Information about the operation that was finished.

**Returns:** `void`

### `aboutToModifyResource(BatchOperationInfo batchOperationInfo, URL url)`

This is called after the content from the URL has been read and before it is saved back.

**Parameters:**
- `batchOperationInfo` ([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md)): Information about the current operation.
- `url` (`java.net.URL`): The URL of the resource which will be modified.

**Returns:** `void`

### `resourceModified(BatchOperationInfo batchOperationInfo, URL url)`

**Parameters:**
- `batchOperationInfo` ([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md)): Information about the current operation.
- `url` (`java.net.URL`): The URL of the resource which was modified.

**Returns:** `void`

