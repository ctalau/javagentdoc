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

### `<init>(`java.lang.String` propertyName, `java.lang.String` propertyRenderString, `java.util.List<java.lang.String>` propertyValues, `java.lang.String` currentValue)`

### `<init>(`java.lang.String` propertyName, `java.lang.String` propertyRenderString, `java.util.List<java.lang.String>` propertyValues, `java.lang.String` currentValue, `boolean` isAttribute)`

### `<init>(`java.lang.String` propertyName, `java.lang.String` propertyRenderString, `java.util.List<java.lang.String>` propertyValues, `java.lang.String` currentValue, `boolean` isAttribute, `boolean` isActive)`

### `<init>(`java.lang.String` propertyName, `java.lang.String` propertyRenderString, `java.util.List<java.lang.String>` propertyValues, `java.lang.String` currentValue, `java.lang.String` parentGroup, [`ro.sync.ecss.extensions.commons.table.properties.GuiElements`](./GuiElements.md) guiType, `java.util.Map<java.lang.String,java.lang.String>` icons, `boolean` isAttribute, `boolean` isActive)`

## Methods

### `getAttributeName()`

**Returns:** `java.lang.String`

### `getAttributeRenderString()`

**Returns:** `java.lang.String`

### `getValues()`

**Returns:** `java.util.List<java.lang.String>`

### `getCurrentValue()`

**Returns:** `java.lang.String`

### `setCurrentValue(`java.lang.String` currentValue)`

**Returns:** `void`

### `getParentGroup()`

**Returns:** `java.lang.String`

### `setParentGroup(`java.lang.String` parentGroup)`

**Returns:** `void`

### `isAttribute()`

**Returns:** `boolean`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `getOldValue()`

**Returns:** `java.lang.String`

### `setOldValue(`java.lang.String` oldValue)`

**Returns:** `void`

It should be correlated with setting 
 a new  value.

### `isActive()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setValues(`java.util.List<java.lang.String>` values)`

**Returns:** `void`

### `setGuiType([`ro.sync.ecss.extensions.commons.table.properties.GuiElements`](./GuiElements.md) guiType)`

**Returns:** `void`

### `getGuiType()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.GuiElements`](./GuiElements.md)

### `getIcons()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

If the list contains null objects,
 then an empty icon should be used.

### `setIcons(`java.util.Map<java.lang.String,java.lang.String>` icons)`

**Returns:** `void`

