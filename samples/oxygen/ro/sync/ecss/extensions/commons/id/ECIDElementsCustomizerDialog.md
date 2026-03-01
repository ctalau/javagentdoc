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

### `<init>(`org.eclipse.swt.widgets.Shell` arg0, `java.lang.String` arg1, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md) arg2, `boolean` arg3)`

## Methods

### `configureShell(`org.eclipse.swt.widgets.Shell` arg0)`

**Returns:** `void`

### `createDialogArea(`org.eclipse.swt.widgets.Composite` arg0)`

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

### `showDialog([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `getHelpPageID()`

**Returns:** `java.lang.String`

