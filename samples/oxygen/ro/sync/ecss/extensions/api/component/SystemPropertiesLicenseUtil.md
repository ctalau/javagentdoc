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

### `checkExternalLicense(ro.sync.ecss.extensions.api.component.KeyGenerator arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md))

**Returns:** `boolean`

### `getAllowedSystemProperty()`

**Returns:** `java.lang.String`

### `checkIfSystemPropertyIsAccepted(java.lang.String arg0, ro.sync.ecss.extensions.api.component.KeyGenerator arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md))

**Returns:** `boolean`

### `decodeSystemProperty(java.lang.String arg0, ro.sync.ecss.extensions.api.component.KeyGenerator arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md))

**Returns:** `java.lang.String`

### `decryptData(java.lang.String arg0, ro.sync.ecss.extensions.api.component.KeyGenerator arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md))

**Returns:** `byte[]`

