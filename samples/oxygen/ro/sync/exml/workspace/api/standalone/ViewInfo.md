# Class: `ViewInfo`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ViewInfo`

## Description

## Fields

### `viewID`

**Type:** `java.lang.String`

### `component`

**Type:** `javax.swing.JComponent`

### `title`

**Type:** `java.lang.String`

### `icon`

**Type:** `javax.swing.Icon`

### `isCustomized`

**Type:** `boolean`

## Constructors

### `<init>(String viewID, JComponent component, String title, Icon icon)`

**Parameters:**
- `viewID` (`java.lang.String`): The unique view ID
- `component` (`javax.swing.JComponent`): The component which will be placed inside
- `title` (`java.lang.String`): Title for the view
- `icon` (`javax.swing.Icon`): The view's icon

## Methods

### `getViewID()`

**Returns:** `java.lang.String`

### `getComponent()`

**Returns:** `javax.swing.JComponent`

### `getTitle()`

**Returns:** `java.lang.String`

### `setComponent(JComponent component)`

**Parameters:**
- `component` (`javax.swing.JComponent`): The component to set.

**Returns:** `void`

### `setTitle(String title)`

**Parameters:**
- `title` (`java.lang.String`): The title to set.

**Returns:** `void`

### `getIcon()`

**Returns:** `javax.swing.Icon`

### `setIcon(Icon icon)`

**Parameters:**
- `icon` (`javax.swing.Icon`): The icon to set.

**Returns:** `void`

### `isCustomized()`

**Returns:** `boolean`

