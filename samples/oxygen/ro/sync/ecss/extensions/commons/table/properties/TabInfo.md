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

### `<init>(`java.lang.String` key, `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>` properties, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` nodes)`

### `<init>(`java.lang.String` key, `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>` properties, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` nodes, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` fragmentsToInsert, `javax.swing.text.Position[]` offsets)`

### `<init>(`java.lang.String` key, `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>` properties, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` nodes, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` fragmentsToInsert, `javax.swing.text.Position[]` offsets, `java.lang.String` contextInfo)`

## Methods

### `getTabKey()`

**Returns:** `java.lang.String`

If no translation for the tab, then it represents the name
 of the tab.

### `setTabKey(`java.lang.String` tabKey)`

**Returns:** `void`

If no translation for the tab, then it represents the name
 of the tab.

### `getProperties()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `setProperties(`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>` properties)`

**Returns:** `void`

### `getNodes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `setNodes(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` nodes)`

**Returns:** `void`

### `getFragmentsToInsert()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`

### `setFragmentsToInsert(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` fragmentsToInsert)`

**Returns:** `void`

### `getInsertOffsets()`

**Returns:** `javax.swing.text.Position[]`

### `setInsertOffsets(`javax.swing.text.Position[]` positions)`

**Returns:** `void`

### `getContextInfo()`

**Returns:** `java.lang.String`

### `setContextInfo(`java.lang.String` contextInfo)`

**Returns:** `void`

