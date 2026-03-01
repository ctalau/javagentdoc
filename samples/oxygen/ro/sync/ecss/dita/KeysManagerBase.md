# Interface: `KeysManagerBase`

**Package:** [`ro.sync.ecss.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dita.KeysManagerBase`

## Methods

### `getKeys(`java.net.URL` arg0)`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getEnumerationDefs(`java.net.URL` arg0)`

**Returns:** `java.util.LinkedHashSet<ro.sync.exml.workspace.api.editor.page.ditamap.keys.EnumerationDefInfo>`

### `getURLKeyScopeContexts(`java.net.URL` arg0)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

### `getKeyDefinitionForTarget(`java.net.URL` arg0, `java.net.URL` arg1)`

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

### `getKeyDefinitionForKeyName(`java.net.URL` arg0, `java.lang.String` arg1)`

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

### `getCopyToMapping(`java.net.URL` arg0)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.net.URL>`

### `getReltableRelationships(`java.net.URL` arg0)`

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.reltable.RelLink>`

