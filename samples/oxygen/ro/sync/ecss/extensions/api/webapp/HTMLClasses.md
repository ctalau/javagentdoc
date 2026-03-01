# Interface: `HTMLClasses`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.HTMLClasses`

## Description

## Fields

### `MARKER`

**Type:** `java.lang.String`

### `IMAGE_WRAPPER`

**Type:** `java.lang.String`

### `DOCUMENT`

**Type:** `java.lang.String`

### `PRIORITY_BOOST`

**Type:** `java.lang.String`

### `SENTINEL_MARKER_DISPLAY_PREFIX`

**Type:** `java.lang.String`

### `SENTINEL_MARKER`

**Type:** `java.lang.String`

### `IMAGE_MARKER`

**Type:** `java.lang.String`

### `START_SENTINEL_MARKER`

**Type:** `java.lang.String`

### `END_SENTINEL_MARKER`

**Type:** `java.lang.String`

### `SENTINEL`

**Type:** `java.lang.String`

### `SENTINEL_DISPLAY_PREFIX`

**Type:** `java.lang.String`

### `EMPTY_PLACEHOLDER`

**Type:** `java.lang.String`

### `STATIC_CONTENT`

**Type:** `java.lang.String`

### `LABEL`

**Type:** `java.lang.CharSequence`

### `LABEL_WIDTH_SPECIFIED`

**Type:** `java.lang.String`

### `OXY_COLLAPSE_TEXT`

**Type:** `java.lang.String`

### `OXY_QUICK_UP_DOWN`

**Type:** `java.lang.String`

### `FOLDABLE`

**Type:** `java.lang.String`

### `FOLDED_BY_DEFAULT`

**Type:** `java.lang.String`

### `TABLE_CONTAINER`

**Type:** `java.lang.String`

These elements are usually div-s
 and have an HTML <table> element as a child.

### `GHOST_MARKER`

**Type:** `java.lang.String`

In Author mode, we do not strike-through that sentinel. In the HTML rendering we do not render a span around that
 sentinel.
 
 
The only exception happens when a marker contains only such sentinels. These markers are called ghost markers 
 because they are present in the markers model but are not serialized in XML. 
 
 
 When we render the HTML, we generate a span for these markers and add this class to make sure that they will 
 not show a visual strike-through.

### `FILTERED`

**Type:** `java.lang.String`

### `MARKER_PSEUDO_ELEMENT_OUTSIDE`

**Type:** `java.lang.String`

