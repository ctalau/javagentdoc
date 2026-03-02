# Class: `ECPropertyComposite`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.ECPropertyComposite`

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `propertyValuesCombo`

**Type:** `org.eclipse.jface.viewers.ComboViewer`

### `radioButtons`

**Type:** `java.util.List<org.eclipse.swt.widgets.Button>`

### `tableProperty`

**Type:** [`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md)

### `currentlySelectedValue`

**Type:** `java.lang.String`

### `controller`

**Type:** [`ro.sync.ecss.extensions.commons.table.properties.PropertySelectionController`](./PropertySelectionController.md)

## Constructors

### `<init>(org.eclipse.swt.widgets.Composite arg0, ro.sync.ecss.extensions.commons.table.properties.TableProperty arg1, ro.sync.ecss.extensions.api.AuthorResourceBundle arg2, ro.sync.ecss.extensions.commons.table.properties.PropertySelectionController arg3, boolean arg4)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)
- `arg1` ([`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md))
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md))
- `arg3` ([`ro.sync.ecss.extensions.commons.table.properties.PropertySelectionController`](./PropertySelectionController.md))
- `arg4` (`boolean`)

## Methods

### `getModifiedProperty()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md)

### `getTableProperty()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md)

### `getCurrentlySelectedValue()`

**Returns:** `java.lang.String`

### `comboSelectionChanged()`

**Returns:** `void`

### `radioSelectionChanged(org.eclipse.swt.widgets.Button arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Button`)

