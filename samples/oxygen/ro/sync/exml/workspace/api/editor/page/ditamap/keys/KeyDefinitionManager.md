# Class: `KeyDefinitionManager`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionManager`

## Description

This is implemented on the API side.

## Constructors

### `<init>()`

## Methods

### `getContextKeyDefinitions()`

This method might be asked quite often so it could be cached on the implementor's side.

**Returns:** `java.util.List<ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo>`

### `getContextKeyDefinitions(java.net.URL originatorURL)`

This method might be asked quite often so it could be cached on the implementor's side.

**Parameters:**
- `originatorURL` (`java.net.URL`): The DITA topic or map for which the keys are requested to resolve something (either a clicked keyref or a conkeyref).

**Returns:** `java.util.List<ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo>`

### `getContextKeyDefinitionsMap(java.net.URL originatorURL)`

This method might be asked quite often so it could be cached on the implementor's side.

**Parameters:**
- `originatorURL` (`java.net.URL`): The DITA topic or map for which the keys are requested to resolve something (either a clicked keyref or a conkeyref).

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo>`

### `getEnumerationDefinitions(java.net.URL originatorURL)`

These are used to control the values allowed for certain attributes.
 The set can be `null`.
 
 This method might be asked quite often so it could be cached on the implementor's side.

**Parameters:**
- `originatorURL` (`java.net.URL`): The DITA topic or map for which the keys are requested to resolve something 
   (when editing a keyref attribute or using the "Edit Profiling Attributes" dialog).

**Returns:** `java.util.LinkedHashSet<ro.sync.exml.workspace.api.editor.page.ditamap.keys.EnumerationDefInfo>`

### `getURLKeyScopeContexts(java.net.URL originatorURL)`

A key scope context is a stack of collected key scope values. As a key scope set on a topicref 
 may have multiple values, the stack contains sets of keyscope values.

**Parameters:**
- `originatorURL` (`java.net.URL`): The context URL.

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

### `getKeyDefinitionForTarget(java.net.URL originatorURL, java.net.URL targetURL)`

This method may be asked when Oxygen's "Paste as content key reference" action is used or 
 when dropping URLs in the editing area.
 If it returns `null`, Oxygen will ask for all keys using the "getContextKeyDefinitions" method and find the key itself.

**Parameters:**
- `originatorURL` (`java.net.URL`): The DITA topic or map for which the keys are requested to resolve something (either a clicked keyref or a conkeyref).
- `targetURL` (`java.net.URL`): The URL for which we want to know the key which is bound to it.

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo`](./KeyDefinitionInfo.md)

### `getKeyDefinitionForKeyName(java.net.URL originatorURL, java.lang.String keyName)`

If it returns `null`, Oxygen will ask for all keys using the "getContextKeyDefinitions" method and find the key itself.

**Parameters:**
- `originatorURL` (`java.net.URL`): The current DITA topic or map.
- `keyName` (`java.lang.String`): The key name for which we request the key definition.

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo`](./KeyDefinitionInfo.md)

### `isPassKeyTargetReferencesThroughXMLCatalogMappings()`

The default implementation returns `true`.

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

