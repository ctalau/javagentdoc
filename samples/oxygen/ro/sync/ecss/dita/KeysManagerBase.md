# Interface: `KeysManagerBase`

**Package:** [`ro.sync.ecss.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dita.KeysManagerBase`

## Methods

### `getKeys(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getEnumerationDefs(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.LinkedHashSet<ro.sync.exml.workspace.api.editor.page.ditamap.keys.EnumerationDefInfo>`

### `getURLKeyScopeContexts(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

### `getKeyDefinitionForTarget(URL arg0, URL arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

### `getKeyDefinitionForKeyName(URL arg0, String arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

### `getCopyToMapping(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.net.URL>`

### `getReltableRelationships(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.reltable.RelLink>`

