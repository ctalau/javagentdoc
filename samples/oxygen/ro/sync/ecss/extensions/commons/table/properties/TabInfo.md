# Class: `TabInfo`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.TabInfo`

## Description

## Fields

### `tabKey`

**Type:** `java.lang.String`

If no translation for the tab, then it represents the name
 of the tab.

### `properties`

**Type:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `nodes`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `fragmentsToInsert`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`

### `insertOffsets`

**Type:** `javax.swing.text.Position[]`

### `contextInfo`

**Type:** `java.lang.String`

For example for "Row(s)"
 tab, if one row is edited, it will be "The current row is edited".

## Constructors

### `<init>(java.lang.String key, java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty> properties, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodes)`

**Parameters:**
- `key` (`java.lang.String`): The tab key name. If no translation for the tab, then it represents the name
   of the tab.
- `properties` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`): The list with the properties which will be presented in the current tab.
- `nodes` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The nodes whose properties will be edited.

### `<init>(java.lang.String key, java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty> properties, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodes, java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragmentsToInsert, javax.swing.text.Position[] offsets)`

**Parameters:**
- `key` (`java.lang.String`): The tab key name. If no translation for the tab, then it represents the name
   of the tab.
- `properties` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`): The list with the properties which will be presented in the current tab.
- `nodes` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The nodes whose properties will be edited.
- `fragmentsToInsert` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`): The list of AuthorDocumentFragments to be inserted.
- `offsets` (`javax.swing.text.Position[]`): The offsets where the new fragments will be inserted.

### `<init>(java.lang.String key, java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty> properties, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodes, java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragmentsToInsert, javax.swing.text.Position[] offsets, java.lang.String contextInfo)`

**Parameters:**
- `key` (`java.lang.String`): The tab key name. If no translation for the tab, 
                              then it represents the name of the tab.
- `properties` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`): The list with the properties which will be presented in the current tab.
- `nodes` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The nodes whose properties will be edited.
- `fragmentsToInsert` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`): The fragments to be inserted.
- `offsets` (`javax.swing.text.Position[]`): The offsets where the new fragments will be inserted.
- `contextInfo` (`java.lang.String`): The context information of the current tab. If no context information, then it will be `null`.

## Methods

### `getTabKey()`

If no translation for the tab, then it represents the name
 of the tab.

**Returns:** `java.lang.String`

### `setTabKey(java.lang.String tabKey)`

If no translation for the tab, then it represents the name
 of the tab.

**Parameters:**
- `tabKey` (`java.lang.String`): The new tab Key.

**Returns:** `void`

### `getProperties()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `setProperties(java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty> properties)`

**Parameters:**
- `properties` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`): The new properties to set.

**Returns:** `void`

### `getNodes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `setNodes(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodes)`

**Parameters:**
- `nodes` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The new list of nodes to set.

**Returns:** `void`

### `getFragmentsToInsert()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`

### `setFragmentsToInsert(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragmentsToInsert)`

**Parameters:**
- `fragmentsToInsert` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`): The fragments which will be inserted in the document.

**Returns:** `void`

### `getInsertOffsets()`

**Returns:** `javax.swing.text.Position[]`

### `setInsertOffsets(javax.swing.text.Position[] positions)`

**Parameters:**
- `positions` (`javax.swing.text.Position[]`): The position where the fragments will be inserted.

**Returns:** `void`

### `getContextInfo()`

**Returns:** `java.lang.String`

### `setContextInfo(java.lang.String contextInfo)`

**Parameters:**
- `contextInfo` (`java.lang.String`): The context information to set.

**Returns:** `void`

