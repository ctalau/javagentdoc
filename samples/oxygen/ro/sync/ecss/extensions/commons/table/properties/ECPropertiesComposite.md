# Class: `ECPropertiesComposite`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.ECPropertiesComposite`

**Implements:** [`ro.sync.ecss.extensions.commons.table.properties.PropertySelectionController`](./PropertySelectionController.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `propertyPanels`

**Type:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.ECPropertyComposite>`

### `previewsList`

**Type:** `java.util.Map<java.lang.String,ro.sync.ecss.extensions.commons.table.properties.ECPropertiesComposite.PreviewGroup>`

### `groupsList`

**Type:** `java.util.Map<java.lang.String,org.eclipse.swt.widgets.Composite>`

### `images`

**Type:** `java.util.Map<java.net.URL,org.eclipse.swt.graphics.Image>`

### `authorResourceBundle`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)

### `colorThemeUtilities`

**Type:** [`ro.sync.exml.workspace.api.util.ColorThemeUtilities`](../../../../../exml/workspace/api/util/ColorThemeUtilities.md)

## Constructors

### `<init>(org.eclipse.swt.widgets.TabFolder arg0, java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty> arg1, java.lang.String arg2, ro.sync.ecss.extensions.api.AuthorResourceBundle arg3, ro.sync.exml.workspace.api.util.ColorThemeUtilities arg4)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.TabFolder`)
- `arg1` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`)
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md))
- `arg4` ([`ro.sync.exml.workspace.api.util.ColorThemeUtilities`](../../../../../exml/workspace/api/util/ColorThemeUtilities.md))

## Methods

### `getModifiedProperties()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `addGroup(java.lang.String arg0, java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty> arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`)

### `selectionChanged(ro.sync.ecss.extensions.commons.table.properties.TableProperty arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md))
- `arg1` (`java.lang.String`)

