# Interface: `GlobalOptionsStorage`

**Package:** [`ro.sync.exml.workspace.api.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.options.GlobalOptionsStorage`

## Description

## Methods

### `addGlobalOptionListener(OptionListener listener)`

The listener is notified when the value of its associated option changes.

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.OptionListener`](../../../../ecss/extensions/api/OptionListener.md)): The OptionListener to be added.

**Returns:** `void`

### `removeGlobalOptionListener(OptionListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.OptionListener`](../../../../ecss/extensions/api/OptionListener.md)): The OptionListener to be removed.

**Returns:** `void`

### `getGlobalObjectProperty(String key)`

You can only get values for keys defined in the APIAccessibleOptionTags interface.

**Parameters:**
- `key` (`java.lang.String`): The key that uniquely identifies an option.

**Returns:** `java.lang.Object`

### `setGlobalObjectProperty(String key, Object value)`

You can use such methods to overwrite some global preferences in Oxygen with your own values.
 To find the key and value types which needs to be overwritten you can export the application preferences to XML (Options -> Export Global Options).

**Parameters:**
- `key` (`java.lang.String`): The key of the option whose value is to be modified.
- `value` (`java.lang.Object`): The new value of the option.

**Returns:** `void`

### `importGlobalOptions(File optionsFile)`

You can use such methods to overwrite some global preferences in Oxygen with your own values.
 Existing options with keys which are not present in the imported options file will be preserved.

**Parameters:**
- `optionsFile` (`java.io.File`): The file containing the XML options exported from an Oxygen installation.

**Returns:** `void`

### `importGlobalOptions(File optionsFile, boolean preserveExistingOptionKeys)`

You can use such methods to overwrite some global preferences in Oxygen with your own values.

**Parameters:**
- `optionsFile` (`java.io.File`): The file containing the XML options exported from an Oxygen installation.
- `preserveExistingOptionKeys` (`boolean`): If `true` existing options with keys which are not present in the imported options file will be preserved.
   Otherwise the existing options with keys which are not present in the imported options file are reset to default.

**Returns:** `void`

### `saveGlobalOptions()`

**Returns:** `void`

### `showPreferencesPages(String[] pagesToShowKeys, String pageToSelectKey, boolean showChildrenOfPages)`

For the stand-alone application each key corresponds to a `OptionPagePluginExtension` 
 key (returned via the *ro.sync.exml.plugin.option.OptionPagePluginExtension.getKey()* method). 
 For Eclipse the keys are actually the IDs of the corresponding `<page>` elements from `plugin.xml`.

**Parameters:**
- `pagesToShowKeys` (`java.lang.String[]`): The keys of the option pages to be shown in the table of contents.
- `pageToSelectKey` (`java.lang.String`): The key of the page to be selected in the table of contents.
- `showChildrenOfPages` (`boolean`): `True` to also show the children of the option pages in 
   the table of contents, `false` not to show them.

**Returns:** `void`

### `serializePersistentObject(Object persistentObject)`

**Parameters:**
- `persistentObject` (`java.lang.Object`): The persistent object. It must be an instance of ro.sync.options.PersistentObject

**Returns:** `java.lang.String`

### `deserializePersistentObject(String persistentObjectStringRepresentation)`

**Parameters:**
- `persistentObjectStringRepresentation` (`java.lang.String`): The XML representation of the object.

**Returns:** `java.lang.Object`

