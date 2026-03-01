# Class: `ReferenceResolverException`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.ReferenceResolverException`

**Extends:** `java.lang.RuntimeException`

## Description

## Fields

### `showInResultsPanel`

**Type:** `boolean`

### `reportAsError`

**Type:** `boolean`

### `errorResolver`

**Type:** [`ro.sync.ecss.extensions.api.ReferenceErrorResolver`](./ReferenceErrorResolver.md)

### `shortMessage`

**Type:** `java.lang.String`

Sometimes the message which will be presented first 
 time to the user is shorter than the original message.

## Constructors

### `<init>(`java.lang.String` errorMessage, `boolean` showInResultsPanel, `boolean` reportAsError)`

### `<init>(`java.lang.String` shortErrorMessage, `java.lang.String` originalErrorMessage, `boolean` showInResultsPanel, `boolean` reportAsError)`

## Methods

### `isShowInResultsPanel()`

**Returns:** `boolean`

### `isReportAsError()`

**Returns:** `boolean`

### `setErrorResolver([`ro.sync.ecss.extensions.api.ReferenceErrorResolver`](./ReferenceErrorResolver.md) errorResolver)`

**Returns:** `void`

### `getErrorResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.ReferenceErrorResolver`](./ReferenceErrorResolver.md)

### `getShortMessage()`

**Returns:** `java.lang.String`

