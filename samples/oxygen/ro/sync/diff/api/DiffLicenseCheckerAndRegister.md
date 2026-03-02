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

### `isDiffLicensedByAnotherComponent(List<String> arg0)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.String>`)

**Returns:** `boolean`

### `registerLicenseKey(Reader arg0)`

**Parameters:**
- `arg0` (`java.io.Reader`)

**Returns:** `void`

### `detectDiffModeFromAdditionalLicense(String arg0, String[] arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String[]`)

**Returns:** [`ro.sync.diff.api.DiffLicenseMode`](./DiffLicenseMode.md)

### `registerAlternateLicenseKey(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

