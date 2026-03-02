# Class: `SystemPropertiesLicenseUtil`

**Package:** [`ro.sync.ecss.extensions.api.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.SystemPropertiesLicenseUtil`

## Fields

### `acceptedSystemPropertiesValues`

**Type:** `java.util.List<java.lang.String>`

### `acceptedSystemProperties`

**Type:** `java.util.List<java.lang.String>`

## Constructors

### `<init>()`

## Methods

### `checkExternalLicense(KeyGenerator arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md))

**Returns:** `boolean`

### `getAllowedSystemProperty()`

**Returns:** `java.lang.String`

### `checkIfSystemPropertyIsAccepted(String arg0, KeyGenerator arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md))

**Returns:** `boolean`

### `decodeSystemProperty(String arg0, KeyGenerator arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md))

**Returns:** `java.lang.String`

### `decryptData(String arg0, KeyGenerator arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md))

**Returns:** `byte[]`

