# Interface: `IAuthorExtensionAction`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`

## Description

These actions are 
 configured in the associated document type of the current document.

## Fields

### `ACTION_ID`

**Type:** `java.lang.String`

### `ACTION_NAME`

**Type:** `java.lang.String`

### `SMALL_ICON_PATH`

**Type:** `java.lang.String`

Can contain editor variables.

### `LARGE_ICON_PATH`

**Type:** `java.lang.String`

can contain editor variables.

### `DESCRIPTION`

**Type:** `java.lang.String`

## Methods

### `getValue(java.lang.String property)`

**Returns:** `java.lang.Object`

**Parameters:**
- `property` (`java.lang.String`): The property to get the value.

### `performAction()`

**Returns:** `void`

### `performAction(int imposedActionOffset)`

**Returns:** `void`

**Parameters:**
- `imposedActionOffset` (`int`): The imposed offset where the action should take place.

