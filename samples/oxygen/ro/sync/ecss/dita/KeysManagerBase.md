# Interface: `KeysManagerBase`

**Package:** [`ro.sync.ecss.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dita.KeysManagerBase`

## Methods

### `getKeys(java.net.URL arg0)`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `getEnumerationDefs(java.net.URL arg0)`

**Returns:** `java.util.LinkedHashSet<ro.sync.exml.workspace.api.editor.page.ditamap.keys.EnumerationDefInfo>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `getURLKeyScopeContexts(java.net.URL arg0)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `getKeyDefinitionForTarget(java.net.URL arg0, java.net.URL arg1)`

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

### `getKeyDefinitionForKeyName(java.net.URL arg0, java.lang.String arg1)`

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

### `getCopyToMapping(java.net.URL arg0)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.net.URL>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `getReltableRelationships(java.net.URL arg0)`

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.reltable.RelLink>`

**Parameters:**
- `arg0` (`java.net.URL`)

