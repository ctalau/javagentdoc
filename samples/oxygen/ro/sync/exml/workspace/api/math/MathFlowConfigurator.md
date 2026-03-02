# Interface: `MathFlowConfigurator`

**Package:** [`ro.sync.exml.workspace.api.math`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.math.MathFlowConfigurator`

## Description

## Methods

### `setMathFlowFixedLicenseKeyForEditor(java.lang.String fixedKey)`

**Parameters:**
- `fixedKey` (`java.lang.String`): The fixed key. The key needs to be obtained from MathFlow:
   
   http://dessci.com/
   
   and has the following format:
   
   MFSCKKK-KKKKKK-KKKKK
   
   If no editor key will be given then MathFlow will be used neither for editing nor for rendering.

**Returns:** `void`

### `setMathFlowFixedLicenseKeyForComposer(java.lang.String fixedKey)`

**Parameters:**
- `fixedKey` (`java.lang.String`): The fixed key. The key needs to be obtained from MathFlow:
   
   http://dessci.com/
   
   and has the following format:
   
   MFSEKKK-KKKKKK-KKKKK
   
   If no composer key will be given then the fallback for rendering will be the Apache JEuclid library.

**Returns:** `void`

### `setMathFlowFixedLicenseFile(java.io.File licenseFile)`

**Parameters:**
- `licenseFile` (`java.io.File`): The path to the MathFlow license file.
   If the file contains both a license for the composer and for the editor, then both rendering and editing is supported.
   If the file contains a license only for the editor, rendering will be done using the open source JEuclid library.

**Returns:** `void`

### `setMathFlowInstallationFolder(java.io.File installationFolder)`

**Parameters:**
- `installationFolder` (`java.io.File`): The MathFlow installation folder

**Returns:** `void`

