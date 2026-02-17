# Class: `KeyDefinitionManager`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionManager`

## Description

This is implemented on the API side.

## Constructors

### `<init>()`

## Methods

### `getContextKeyDefinitions()`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo>`

This method might be asked quite often so it could be cached on the implementor's side.

### `getContextKeyDefinitions(`java.net.URL` originatorURL)`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo>`

This method might be asked quite often so it could be cached on the implementor's side.

### `getContextKeyDefinitionsMap(`java.net.URL` originatorURL)`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo>`

This method might be asked quite often so it could be cached on the implementor's side.

### `getEnumerationDefinitions(`java.net.URL` originatorURL)`

**Returns:** `java.util.LinkedHashSet<ro.sync.exml.workspace.api.editor.page.ditamap.keys.EnumerationDefInfo>`

These are used to control the values allowed for certain attributes.
 The set can be `null`.
 
 This method might be asked quite often so it could be cached on the implementor's side.

### `getURLKeyScopeContexts(`java.net.URL` originatorURL)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

A key scope context is a stack of collected key scope values. As a key scope set on a topicref 
 may have multiple values, the stack contains sets of keyscope values.

### `getKeyDefinitionForTarget(`java.net.URL` originatorURL, `java.net.URL` targetURL)`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo`](./KeyDefinitionInfo.md)

This method may be asked when Oxygen's "Paste as content key reference" action is used or 
 when dropping URLs in the editing area.
 If it returns `null`, Oxygen will ask for all keys using the "getContextKeyDefinitions" method and find the key itself.

### `getKeyDefinitionForKeyName(`java.net.URL` originatorURL, `java.lang.String` keyName)`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo`](./KeyDefinitionInfo.md)

If it returns `null`, Oxygen will ask for all keys using the "getContextKeyDefinitions" method and find the key itself.

### `isPassKeyTargetReferencesThroughXMLCatalogMappings()`

**Returns:** `boolean`

The default implementation returns `true`.

### `getDescription()`

**Returns:** `java.lang.String`

