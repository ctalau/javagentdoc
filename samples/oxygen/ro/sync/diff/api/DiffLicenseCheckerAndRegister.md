# Class: `DiffLicenseCheckerAndRegister`

**Package:** [`ro.sync.diff.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.api.DiffLicenseCheckerAndRegister`

## Fields

### `COMPONENTS_WITH_DIFF_INCLUDED`

**Type:** `java.util.List<java.lang.String>`

### `logger`

**Type:** `org.slf4j.Logger`

### `alternateDiffLicense`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `licenseCheck()`

**Returns:** `void`

### `getLicenseMode()`

**Returns:** [`ro.sync.diff.api.DiffLicenseMode`](./DiffLicenseMode.md)

### `isDiffLicensedByAnotherComponent(java.util.List<java.lang.String> arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.util.List<java.lang.String>`)

### `registerLicenseKey(java.io.Reader arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.io.Reader`)

### `detectDiffModeFromAdditionalLicense(java.lang.String arg0, java.lang.String[] arg1)`

**Returns:** [`ro.sync.diff.api.DiffLicenseMode`](./DiffLicenseMode.md)

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String[]`)

### `registerAlternateLicenseKey(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

