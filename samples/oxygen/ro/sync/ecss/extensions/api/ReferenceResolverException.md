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

### `<init>(String errorMessage, boolean showInResultsPanel, boolean reportAsError)`

**Parameters:**
- `errorMessage` (`java.lang.String`): The error message.
- `showInResultsPanel` (`boolean`): `true` to also show the message in a results panel.
- `reportAsError` (`boolean`): `true` to report as error, `false` to report as warning.

### `<init>(String shortErrorMessage, String originalErrorMessage, boolean showInResultsPanel, boolean reportAsError)`

**Parameters:**
- `shortErrorMessage` (`java.lang.String`): The short error message. Sometimes the message which 
                       will be presented first time to the user is shorter than the original message.
- `originalErrorMessage` (`java.lang.String`): The exception original message.
- `showInResultsPanel` (`boolean`): `true` to also show the message in a results panel.
- `reportAsError` (`boolean`): `true` to report as error, `false` to report as warning.

## Methods

### `isShowInResultsPanel()`

**Returns:** `boolean`

### `isReportAsError()`

**Returns:** `boolean`

### `setErrorResolver(ReferenceErrorResolver errorResolver)`

**Parameters:**
- `errorResolver` ([`ro.sync.ecss.extensions.api.ReferenceErrorResolver`](./ReferenceErrorResolver.md)): The errorResolver to set.

**Returns:** `void`

### `getErrorResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.ReferenceErrorResolver`](./ReferenceErrorResolver.md)

### `getShortMessage()`

**Returns:** `java.lang.String`

