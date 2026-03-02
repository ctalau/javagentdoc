# Class: `TableProperty`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.TableProperty`

## Description

It contains the name of the property,
 possible values, icons for the values, current set value of the property,
 the group that contains it, the type of GUI elements that will be used to
 present the property in the "Table properties" dialog.

## Fields

### `propertyName`

**Type:** `java.lang.String`

If it is a attribute, it will be the qualified name.

### `propertyRenderString`

**Type:** `java.lang.String`

### `values`

**Type:** `java.util.List<java.lang.String>`

### `icons`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

### `currentValue`

**Type:** `java.lang.String`

### `oldValue`

**Type:** `java.lang.String`

If the property current value was never modified,
 the oldValue is null.

### `isAttr`

**Type:** `boolean`

### `isActive`

**Type:** `boolean`

### `parentGroup`

**Type:** `java.lang.String`

### `guiType`

**Type:** [`ro.sync.ecss.extensions.commons.table.properties.GuiElements`](./GuiElements.md)

## Constructors

### `<init>(java.lang.String propertyName, java.lang.String propertyRenderString, java.util.List<java.lang.String> propertyValues, java.lang.String currentValue)`

**Parameters:**
- `propertyName` (`java.lang.String`): The qName of the current attribute.
- `propertyRenderString` (`java.lang.String`): The string that will be presented in the SATablePropertiesCustomizerDialog. It
                            can be different from the attribute name or it can be even the same.
- `propertyValues` (`java.util.List<java.lang.String>`): The list with the attribute's possible values.
- `currentValue` (`java.lang.String`): The current of the attribute.

### `<init>(java.lang.String propertyName, java.lang.String propertyRenderString, java.util.List<java.lang.String> propertyValues, java.lang.String currentValue, boolean isAttribute)`

**Parameters:**
- `propertyName` (`java.lang.String`): The qName of the current attribute.
- `propertyRenderString` (`java.lang.String`): The string that will be presented in the SATablePropertiesCustomizerDialog. It
                            can be different from the attribute name or it can be even the same.
- `propertyValues` (`java.util.List<java.lang.String>`): The list with the attribute's possible values.
- `currentValue` (`java.lang.String`): The current of the attribute.
- `isAttribute` (`boolean`): `true` if the current property represents an attribute.

### `<init>(java.lang.String propertyName, java.lang.String propertyRenderString, java.util.List<java.lang.String> propertyValues, java.lang.String currentValue, boolean isAttribute, boolean isActive)`

**Parameters:**
- `propertyName` (`java.lang.String`): The qName of the current attribute.
- `propertyRenderString` (`java.lang.String`): The string that will be presented in the SATablePropertiesCustomizerDialog. It
                                can be different from the attribute name or it can be even the same.
- `propertyValues` (`java.util.List<java.lang.String>`): The list with the attribute's possible values.
- `currentValue` (`java.lang.String`): The current of the attribute.
- `isAttribute` (`boolean`): `true` if the current property represents an attribute.
- `isActive` (`boolean`): `true` if the combobox corresponding to the current property is enabled,
                                `false` otherwise.

### `<init>(java.lang.String propertyName, java.lang.String propertyRenderString, java.util.List<java.lang.String> propertyValues, java.lang.String currentValue, java.lang.String parentGroup, ro.sync.ecss.extensions.commons.table.properties.GuiElements guiType, java.util.Map<java.lang.String,java.lang.String> icons, boolean isAttribute, boolean isActive)`

**Parameters:**
- `propertyName` (`java.lang.String`): The qName of the current attribute.
- `propertyRenderString` (`java.lang.String`): The string that will be presented in the SATablePropertiesCustomizerDialog. It
                                can be different from the attribute name or it can be even the same.
- `propertyValues` (`java.util.List<java.lang.String>`): The list with the attribute's possible values.
- `currentValue` (`java.lang.String`): The current of the attribute.
- `parentGroup` (`java.lang.String`): The group name that will include the current property.
- `guiType` ([`ro.sync.ecss.extensions.commons.table.properties.GuiElements`](./GuiElements.md)): The type of GUI element that will be used to represent the values for the current property.
                                If is one of GuiElements#COMBOBOX, GuiElements#RADIO_BUTTONS.
                                The default is GuiElements#COMBOBOX. If this parameter is set to `null`, the element that
                                will be used is GuiElements#COMBOBOX.
- `icons` (`java.util.Map<java.lang.String,java.lang.String>`): The list of icons. An icon for every value. If empty icon corresponds to a value, the icon will be null
- `isAttribute` (`boolean`): `true` if the current property represents an attribute.
- `isActive` (`boolean`): `true` if the combobox corresponding to the current property is enabled,
                                `false` otherwise.

## Methods

### `getAttributeName()`

**Returns:** `java.lang.String`

### `getAttributeRenderString()`

**Returns:** `java.lang.String`

### `getValues()`

**Returns:** `java.util.List<java.lang.String>`

### `getCurrentValue()`

**Returns:** `java.lang.String`

### `setCurrentValue(java.lang.String currentValue)`

**Parameters:**
- `currentValue` (`java.lang.String`): The new value to set.

**Returns:** `void`

### `getParentGroup()`

**Returns:** `java.lang.String`

### `setParentGroup(java.lang.String parentGroup)`

**Parameters:**
- `parentGroup` (`java.lang.String`): The group that includes the current property.

**Returns:** `void`

### `isAttribute()`

**Returns:** `boolean`

### `equals(java.lang.Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `getOldValue()`

**Returns:** `java.lang.String`

### `setOldValue(java.lang.String oldValue)`

It should be correlated with setting 
 a new  value.

**Parameters:**
- `oldValue` (`java.lang.String`): The old value to set.

**Returns:** `void`

### `isActive()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setValues(java.util.List<java.lang.String> values)`

**Parameters:**
- `values` (`java.util.List<java.lang.String>`): Values for the current property.

**Returns:** `void`

### `setGuiType(ro.sync.ecss.extensions.commons.table.properties.GuiElements guiType)`

**Parameters:**
- `guiType` ([`ro.sync.ecss.extensions.commons.table.properties.GuiElements`](./GuiElements.md)): The new type GUI elements which will be used to present the values 
   for the property.

**Returns:** `void`

### `getGuiType()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.GuiElements`](./GuiElements.md)

### `getIcons()`

If the list contains null objects,
 then an empty icon should be used.

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `setIcons(java.util.Map<java.lang.String,java.lang.String> icons)`

**Parameters:**
- `icons` (`java.util.Map<java.lang.String,java.lang.String>`): The icons to set.

**Returns:** `void`

