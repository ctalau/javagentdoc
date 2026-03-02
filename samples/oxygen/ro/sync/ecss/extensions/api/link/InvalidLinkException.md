# Class: `InvalidLinkException`

**Package:** [`ro.sync.ecss.extensions.api.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.link.InvalidLinkException`

**Extends:** `java.lang.Exception`

## Description

## Fields

### `severity`

**Type:** [`ro.sync.ecss.extensions.api.link.Severity`](./Severity.md)

### `presentInplace`

**Type:** `boolean`

`false` to report the error in the results area of the editor.

### `shortMessage`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String message)`

**Parameters:**
- `message` (`java.lang.String`): Error message.

### `<init>(java.lang.String message, ro.sync.ecss.extensions.api.link.Severity severity, boolean presentInplace)`

**Parameters:**
- `message` (`java.lang.String`): Error message.
- `severity` ([`ro.sync.ecss.extensions.api.link.Severity`](./Severity.md)): A hint about the severity of the exception.
- `presentInplace` (`boolean`): `true` if the error message should be presented right in the document area,
 the same place where the link text should have been presented. `false` to report the error in the results area of the editor.

## Methods

### `getSeverity()`

**Returns:** [`ro.sync.ecss.extensions.api.link.Severity`](./Severity.md)

### `isPresentInplace()`

**Returns:** `boolean`

### `setShortMessage(java.lang.String shortMessage)`

**Returns:** `void`

**Parameters:**
- `shortMessage` (`java.lang.String`): The short message.

### `getShortMessage()`

**Returns:** `java.lang.String`

