# Interface: `LabelCSSConstants`

**Package:** [`ro.sync.ecss.css.functions`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.css.functions.LabelCSSConstants`

## Description

## Fields

### `TEXT_PROPERTY`

**Type:** `java.lang.String`

A string value.

### `WIDTH_PROPERTY`

**Type:** `java.lang.String`

An RelativeLength. 
 
 
**Note:** In case you don't have the possibility to build a RelativeLength 
 then you can use the #STYLES_PROPERTY to give the width as a string:
 `
 * {
   width:100px;
 }`

### `TEXT_ALIGN_PROPERTY`

**Type:** `java.lang.String`

A string value: left, right or center.

### `COLOR_PROPERTY`

**Type:** `java.lang.String`

A Color.

### `BACKGROUND_COLOR_PROPERTY`

**Type:** `java.lang.String`

A Color.

### `STYLES_PROPERTY`

**Type:** `java.lang.String`

Example:
 `
 * {
   text-align:right;
   color:red;
 }
 `
 
 The selectors are ignored, all rules are considered to match.
 
You can also specify as CSS something like: 
 `@import 'label_styles.css';`
 Relative imports will be resolved relative to #BASE_SYSTEM_ID. 
 This approach is useful to easily reuse the same styles for more 
 oxy_labels.
 
 **The following properties are handled:**
 

 - font-weight, font-size, font-style, font

 - text-align, text-decoration

 - width

 - color, background-color

### `BASE_SYSTEM_ID`

**Type:** `java.lang.String`

This normally is the system ID of the CSS file in which the oxy_label was 
 encountered.

