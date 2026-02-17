# Interface: `ValidatorPluginExtension`

**Package:** [`ro.sync.exml.plugin.validator`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.validator.ValidatorPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

## Methods

### `getEngineName()`

**Returns:** `java.lang.String`

The name of the engine is shown to the end user as a possible option 
 when they configure a validation scenario's stage in Oxygen. It must be unique.

### `allowsValidation(`java.lang.String` contentType)`

**Returns:** `boolean`

### `allowsAutomaticValidation()`

**Returns:** `boolean`

If the validation engine is slow or it cannot validate content directly over the Reader provided on the "scan" method, 
 the method should return `false`

### `validate(`java.lang.String` systemID, `java.io.Reader` documentReader, [`ro.sync.exml.plugin.validator.ValidationType`](./ValidationType.md) validationType, [`ro.sync.exml.plugin.validator.ValidationMode`](./ValidationMode.md) mode)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `setSchemaSystemID(`java.lang.String` schemaSystemID)`

**Returns:** `void`

