# Class: `ECIDElementsCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.id.ECIDElementsCustomizerDialog`

## Fields

### `listOfElements`

**Type:** `org.eclipse.swt.widgets.List`

### `autoAssignElementIDs`

**Type:** `org.eclipse.swt.widgets.Button`

### `filterIDsOnCopy`

**Type:** `org.eclipse.swt.widgets.Button`

### `idGenerationPatternField`

**Type:** `org.eclipse.swt.widgets.Text`

### `editButton`

**Type:** `org.eclipse.swt.widgets.Button`

### `removeButton`

**Type:** `org.eclipse.swt.widgets.Button`

### `listMessage`

**Type:** `java.lang.String`

### `autoIDElementsInfo`

**Type:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `authorResourceBundle`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md)

### `isDocBook`

**Type:** `boolean`

## Constructors

### `<init>(Shell arg0, String arg1, AuthorResourceBundle arg2, boolean arg3)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Shell`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md))
- `arg3` (`boolean`)

## Methods

### `configureShell(Shell arg0)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Shell`)

**Returns:** `void`

### `createDialogArea(Composite arg0)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)

**Returns:** `org.eclipse.swt.widgets.Control`

### `updateButtonState()`

**Returns:** `void`

### `addNewElement()`

**Returns:** `void`

### `editElement()`

**Returns:** `void`

### `removeElement()`

**Returns:** `void`

### `okPressed()`

**Returns:** `void`

### `showDialog(GenerateIDElementsInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md))

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `getHelpPageID()`

**Returns:** `java.lang.String`

