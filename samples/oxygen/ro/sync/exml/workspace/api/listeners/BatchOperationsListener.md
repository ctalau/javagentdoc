# Class: `BatchOperationsListener`

**Package:** [`ro.sync.exml.workspace.api.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.listeners.BatchOperationsListener`

## Description

For example a CMS may automatically check out resources if Oxygen wants to modify them during such operations.

## Constructors

### `<init>()`

## Methods

### `operationAboutToStart([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md) batchOperationInfo)`

**Returns:** `void`

### `operationFinished([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md) batchOperationInfo)`

**Returns:** `void`

### `aboutToModifyResource([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md) batchOperationInfo, `java.net.URL` url)`

**Returns:** `void`

This is called after the content from the URL has been read and before it is saved back.

### `resourceModified([`ro.sync.exml.workspace.api.listeners.BatchOperationInfo`](./BatchOperationInfo.md) batchOperationInfo, `java.net.URL` url)`

**Returns:** `void`

