# Class: `TextUtil`

**Package:** [`ro.sync.document`](README.md)

**Fully Qualified Name:** `ro.sync.document.TextUtil`

## Fields

### `c`

**Type:** `org.slf4j.Logger`

### `e`

**Type:** `int`

### `g`

**Type:** `int`

### `b`

**Type:** `int`

### `d`

**Type:** `int`

### `f`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `normalizeAndCollapseWhitespace(java.lang.String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `java.lang.String`

### `normalizeWhitespace(java.lang.StringBuilder arg0)`

**Parameters:**
- `arg0` (`java.lang.StringBuilder`)

**Returns:** `void`

### `getColumnNumber(ro.sync.document.ob arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` (`ro.sync.document.ob`)
- `arg1` (`int`)
- `arg2` (`int`)

**Returns:** `int`

### `getColumnNumber(ro.sync.document.ob arg0, int arg1, int arg2, boolean arg3)`

**Parameters:**
- `arg0` (`ro.sync.document.ob`)
- `arg1` (`int`)
- `arg2` (`int`)
- `arg3` (`boolean`)

**Returns:** `int`

### `getSomeTextConsideringWordBounds(java.lang.String arg0, int arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`int`)

**Returns:** `java.lang.String`

### `getTextWithoutTags(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `normalizeAndCollapseWhitespace(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `computeChNumberAndOffset(int arg0, javax.swing.text.Document arg1, char arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`javax.swing.text.Document`)
- `arg2` (`char`)

**Returns:** `java.util.List`

### `computeNonWSCharCount(javax.swing.text.Document arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` (`javax.swing.text.Document`)
- `arg1` (`int`)
- `arg2` (`int`)

**Returns:** `int`

### `getOffsetAfterChAndOffset(int arg0, int arg1, javax.swing.text.Document arg2, char arg3, boolean arg4)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`javax.swing.text.Document`)
- `arg3` (`char`)
- `arg4` (`boolean`)

**Returns:** `int`

### `getOffsetAfterNonWSChars(int arg0, javax.swing.text.Document arg1, int arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`javax.swing.text.Document`)
- `arg2` (`int`)

**Returns:** `int`

### `eatBackUntilNonWhiteSpace(java.lang.StringBuilder arg0)`

**Parameters:**
- `arg0` (`java.lang.StringBuilder`)

**Returns:** `void`

### `replaceAll(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, ro.sync.syntaxhighlight.marker.TokenMarker arg3, byte arg4)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`ro.sync.syntaxhighlight.marker.TokenMarker`)
- `arg4` (`byte`)

**Returns:** `java.lang.String`

