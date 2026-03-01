# Class: `SAIDElementsCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.id.SAIDElementsCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.ui.OKCancelDialog`](../ui/OKCancelDialog.md)

## Description

It will
 be also used when the IDs are generated manually.
 
 It is used on standalone implementation.

## Fields

### `listModel`

**Type:** `javax.swing.DefaultListModel`

### `listOfElements`

**Type:** `javax.swing.JList`

### `autoAssignElementIDs`

**Type:** `javax.swing.JCheckBox`

### `listPanel`

**Type:** `javax.swing.JPanel`

### `addButton`

**Type:** `javax.swing.JButton`

### `editButton`

**Type:** `javax.swing.JButton`

### `removeButton`

**Type:** `javax.swing.JButton`

### `listMessage`

**Type:** `java.lang.String`

### `idGenerationPatternField`

**Type:** `javax.swing.JTextField`

### `filterIDsOnCopy`

**Type:** `javax.swing.JCheckBox`

### `authorResourceBundle`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md)

## Constructors

### `<init>(`java.awt.Frame` parentFrame, `java.lang.String` listMessage, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md) authorResourceBundle)`

### `<init>(`java.awt.Frame` parentFrame, `java.lang.String` listMessage, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md) authorResourceBundle, `boolean` isDocBook)`

## Methods

### `updateButtonState()`

**Returns:** `void`

### `addNewElement()`

**Returns:** `void`

### `editElement()`

**Returns:** `void`

### `removeElement()`

**Returns:** `void`

### `showDialog([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md) autoIDElementsInfo)`

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

