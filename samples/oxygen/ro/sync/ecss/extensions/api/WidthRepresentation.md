# Class: `WidthRepresentation`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.WidthRepresentation`

**Implements:** `java.io.Serializable`

## Description

## Fields

### `serialVersionUID`

**Type:** `long`

### `DEFAULT_WIDTH_REPRESENTATION`

**Type:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](./WidthRepresentation.md)

EXM-32772 KEEP THIS HERE, IMPORTANT FOR BACKWARD COMPATIBILITY.

### `fixedWidthValue`

**Type:** `float`

For instance 2.5. In combination with the fixedWidthUnit represents a width.

### `fixedWidthUnit`

**Type:** `ro.sync.ecss.extensions.api.WidthRepresentation.Unit`

### `relativeWidthValue`

**Type:** `float`

This value can be relative to the parent width, 
 or relative to the other siblings. Ex: 3.2

### `isRelativeToParent`

**Type:** `boolean`

### `align`

**Type:** `java.lang.String`

## Constructors

### `<init>(float fixedWidthValue, WidthRepresentation.Unit fixedWidthUnit, float relativeWidth, boolean isRelativeToParent)`

**Parameters:**
- `fixedWidthValue` (`float`): The fixed width value. Ex: 2.5
- `fixedWidthUnit` (`ro.sync.ecss.extensions.api.WidthRepresentation.Unit`): The unit of fixed width. Defaults to PIXEL.
- `relativeWidth` (`float`): The relative width part. Ex: 0.33
- `isRelativeToParent` (`boolean`): If `true` then the relative width represents
          a percentage of the parent table width, otherwise the relative value
          represent a proportional width which is evaluated taking into account 
          the proportional values of the other columns.    
   
  For example, if there are two columns with 70% and 30% relative widths then
          the table total width will be divided according with this values. 
   
  If the relative widths for the two columns are specified in proportional units and,
          for example, have the values 1 for the first column and 2 for the second column
          then the second column will be twice as large as the first one.

### `<init>(String widthString, boolean acceptPercents)`

Create a ColWidth corresponding to the given width representation.

**Parameters:**
- `widthString` (`java.lang.String`): The string representation of the Width. The 
        representation format must be a sum of terms with the following format: 
        n(*|%|units). If there are more that one terms with the same form (fixed 
        or relative) then corresponding width (fixed or relative) will be reseted.
- `acceptPercents` (`boolean`): If `true` then percentage values are
        accepted

## Methods

### `getFixedWidth()`

**Returns:** `float`

### `getFixedWidthUnit()`

**Returns:** `ro.sync.ecss.extensions.api.WidthRepresentation.Unit`

### `getRelativeWidth()`

**Returns:** `float`

### `isRelativeToParent()`

**Returns:** `boolean`

### `isApplicable()`

**Returns:** `boolean`

### `isSpecified()`

**Returns:** `boolean`

### `getAlign()`

**Returns:** `java.lang.String`

### `setAlign(String align)`

**Parameters:**
- `align` (`java.lang.String`): The align value.

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `getWidthRepresentation()`

**Returns:** `java.lang.String`

