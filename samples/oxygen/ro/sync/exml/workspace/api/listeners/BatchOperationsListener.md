# Class: `BatchOperationsListener`

**Package:** [`ro.sync.exml.workspace.api.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.listeners.BatchOperationsListener`

## Description

For example a CMS may automatically check out resources if Oxygen wants to modify them during such operations.

## Constructors

### `<init>()`

## Methods

### `operationAboutToStart(ro.sync.exml.workspace.api.listeners.BatchOperationInfo batchOperationInfo)`

**Returns:** `void`

**Parameters:**
- `batchOperationInfo` ([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md)): Information about the operation that will start.

### `operationFinished(ro.sync.exml.workspace.api.listeners.BatchOperationInfo batchOperationInfo)`

**Returns:** `void`

**Parameters:**
- `batchOperationInfo` ([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md)): Information about the operation that was finished.

### `aboutToModifyResource(ro.sync.exml.workspace.api.listeners.BatchOperationInfo batchOperationInfo, java.net.URL url)`

**Returns:** `void`

This is called after the content from the URL has been read and before it is saved back.

**Parameters:**
- `batchOperationInfo` ([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md)): Information about the current operation.
- `url` (`java.net.URL`): The URL of the resource which will be modified.

### `resourceModified(ro.sync.exml.workspace.api.listeners.BatchOperationInfo batchOperationInfo, java.net.URL url)`

**Returns:** `void`

**Parameters:**
- `batchOperationInfo` ([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md)): Information about the current operation.
- `url` (`java.net.URL`): The URL of the resource which was modified.

