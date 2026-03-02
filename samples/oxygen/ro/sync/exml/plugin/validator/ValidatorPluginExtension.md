# Interface: `ValidatorPluginExtension`

**Package:** [`ro.sync.exml.plugin.validator`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.validator.ValidatorPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

## Methods

### `getEngineName()`

The name of the engine is shown to the end user as a possible option 
 when they configure a validation scenario's stage in Oxygen. It must be unique.

**Returns:** `java.lang.String`

### `allowsValidation(String contentType)`

**Parameters:**
- `contentType` (`java.lang.String`): Current document content type: ro.sync.basic.contenttypes.ContentTypes

**Returns:** `boolean`

### `allowsAutomaticValidation()`

If the validation engine is slow or it cannot validate content directly over the Reader provided on the "scan" method, 
 the method should return `false`

**Returns:** `boolean`

### `validate(String systemID, Reader documentReader, ValidationType validationType, ValidationMode mode)`

**Parameters:**
- `systemID` (`java.lang.String`): The systemID of the document to be checked.
- `documentReader` (`java.io.Reader`): The reader of the document.
- `validationType` ([`ro.sync.exml.plugin.validator.ValidationType`](./ValidationType.md)): Indicates the type of validation to be performed 
   usually depending on what action was initiated by the end user from the application.
- `mode` ([`ro.sync.exml.plugin.validator.ValidationMode`](./ValidationMode.md)): Current validation mode: automatic or manual.

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `setSchemaSystemID(String schemaSystemID)`

**Parameters:**
- `schemaSystemID` (`java.lang.String`): The schema system ID

**Returns:** `void`

