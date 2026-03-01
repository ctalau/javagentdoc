# Interface: `GlobalOptionsStorage`

**Package:** [`ro.sync.exml.workspace.api.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.options.GlobalOptionsStorage`

## Description

## Methods

### `addGlobalOptionListener([`ro.sync.ecss.extensions.api.OptionListener`](../../../../ecss/extensions/api/OptionListener.md) listener)`

**Returns:** `void`

The listener is notified when the value of its associated option changes.

### `removeGlobalOptionListener([`ro.sync.ecss.extensions.api.OptionListener`](../../../../ecss/extensions/api/OptionListener.md) listener)`

**Returns:** `void`

### `getGlobalObjectProperty(`java.lang.String` key)`

**Returns:** `java.lang.Object`

You can only get values for keys defined in the APIAccessibleOptionTags interface.

### `setGlobalObjectProperty(`java.lang.String` key, `java.lang.Object` value)`

**Returns:** `void`

You can use such methods to overwrite some global preferences in Oxygen with your own values.
 To find the key and value types which needs to be overwritten you can export the application preferences to XML (Options -> Export Global Options).

### `importGlobalOptions(`java.io.File` optionsFile)`

**Returns:** `void`

You can use such methods to overwrite some global preferences in Oxygen with your own values.
 Existing options with keys which are not present in the imported options file will be preserved.

### `importGlobalOptions(`java.io.File` optionsFile, `boolean` preserveExistingOptionKeys)`

**Returns:** `void`

You can use such methods to overwrite some global preferences in Oxygen with your own values.

### `saveGlobalOptions()`

**Returns:** `void`

### `showPreferencesPages(`java.lang.String[]` pagesToShowKeys, `java.lang.String` pageToSelectKey, `boolean` showChildrenOfPages)`

**Returns:** `void`

For the stand-alone application each key corresponds to a `OptionPagePluginExtension` 
 key (returned via the *ro.sync.exml.plugin.option.OptionPagePluginExtension.getKey()* method). 
 For Eclipse the keys are actually the IDs of the corresponding `<page>` elements from `plugin.xml`.

### `serializePersistentObject(`java.lang.Object` persistentObject)`

**Returns:** `java.lang.String`

### `deserializePersistentObject(`java.lang.String` persistentObjectStringRepresentation)`

**Returns:** `java.lang.Object`

