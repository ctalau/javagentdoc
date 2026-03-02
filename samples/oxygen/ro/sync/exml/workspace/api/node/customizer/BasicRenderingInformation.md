# Class: `BasicRenderingInformation`

**Package:** [`ro.sync.exml.workspace.api.node.customizer`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.node.customizer.BasicRenderingInformation`

## Description

## Fields

### `renderedText`

**Type:** `java.lang.String`

If `null` the default text value will be used for rendering.

### `tooltipText`

**Type:** `java.lang.String`

### `iconPath`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `setRenderedText(java.lang.String renderedText)`

**Returns:** `void`

If the rendered text is `null` then the default node rendering will be used.

**Parameters:**
- `renderedText` (`java.lang.String`): The rendered text, usually the node name. If `null` the default text will be used for rendering.

### `setTooltipText(java.lang.String tooltipText)`

**Returns:** `void`

If the tooltip text is `null` then the default tooltip text will be used for the node.

**Parameters:**
- `tooltipText` (`java.lang.String`): The tooltip text which will appear in the tooltip associated with the node.
 If `null` the default tooltip text will be used for the node.

### `setIconPath(java.lang.String iconPath)`

**Returns:** `void`

The path can be an icon file path, the string representation of an icon URL 
 or can contain editor variables as defined in the EditorVariables class.
 The editor variables will be expanded at runtime.
 If the icon path is `null` the default icon will be used for the node.
 


 If the custom used images are located in the same **jar** file as the XMLNodeRendererCustomizer
 then you can use as the return value for this function the following code sequence:
 


 `
 this.getClass().getResource("/images/Icon.gif").toExternalForm();
 `
 


 The previous sequence assumes that *Icon.gif* icon image is located in the *images* folder inside
 your **jar** file.

**Parameters:**
- `iconPath` (`java.lang.String`): The path of the icon. If `null` the default icon will be used for the node.

### `getRenderedText()`

**Returns:** `java.lang.String`

### `getTooltipText()`

**Returns:** `java.lang.String`

### `getIconPath()`

**Returns:** `java.lang.String`

The path can be an icon file path, the string representation of an icon URL 
 or can contain editor variables as defined in the EditorVariables class.
 The editor variables will be expanded at runtime.

