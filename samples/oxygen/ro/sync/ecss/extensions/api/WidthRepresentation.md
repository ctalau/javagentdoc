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

### `<init>(`float` fixedWidthValue, `ro.sync.ecss.extensions.api.WidthRepresentation.Unit` fixedWidthUnit, `float` relativeWidth, `boolean` isRelativeToParent)`

### `<init>(`java.lang.String` widthString, `boolean` acceptPercents)`

Create a ColWidth corresponding to the given width representation.

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

### `setAlign(`java.lang.String` align)`

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `getWidthRepresentation()`

**Returns:** `java.lang.String`

