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

### `<init>(`java.lang.String` message)`

### `<init>(`java.lang.String` message, [`ro.sync.ecss.extensions.api.link.Severity`](./Severity.md) severity, `boolean` presentInplace)`

## Methods

### `getSeverity()`

**Returns:** [`ro.sync.ecss.extensions.api.link.Severity`](./Severity.md)

### `isPresentInplace()`

**Returns:** `boolean`

### `setShortMessage(`java.lang.String` shortMessage)`

**Returns:** `void`

### `getShortMessage()`

**Returns:** `java.lang.String`

