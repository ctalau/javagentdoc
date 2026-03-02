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

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

### `normalizeWhitespace(java.lang.StringBuilder arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.StringBuilder`)

### `getColumnNumber(ro.sync.document.ob arg0, int arg1, int arg2)`

**Returns:** `int`

**Parameters:**
- `arg0` (`ro.sync.document.ob`)
- `arg1` (`int`)
- `arg2` (`int`)

### `getColumnNumber(ro.sync.document.ob arg0, int arg1, int arg2, boolean arg3)`

**Returns:** `int`

**Parameters:**
- `arg0` (`ro.sync.document.ob`)
- `arg1` (`int`)
- `arg2` (`int`)
- `arg3` (`boolean`)

### `getSomeTextConsideringWordBounds(java.lang.String arg0, int arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`int`)

### `getTextWithoutTags(java.lang.String arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)

### `normalizeAndCollapseWhitespace(java.lang.String arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)

### `computeChNumberAndOffset(int arg0, javax.swing.text.Document arg1, char arg2)`

**Returns:** `java.util.List`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`javax.swing.text.Document`)
- `arg2` (`char`)

### `computeNonWSCharCount(javax.swing.text.Document arg0, int arg1, int arg2)`

**Returns:** `int`

**Parameters:**
- `arg0` (`javax.swing.text.Document`)
- `arg1` (`int`)
- `arg2` (`int`)

### `getOffsetAfterChAndOffset(int arg0, int arg1, javax.swing.text.Document arg2, char arg3, boolean arg4)`

**Returns:** `int`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`javax.swing.text.Document`)
- `arg3` (`char`)
- `arg4` (`boolean`)

### `getOffsetAfterNonWSChars(int arg0, javax.swing.text.Document arg1, int arg2)`

**Returns:** `int`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`javax.swing.text.Document`)
- `arg2` (`int`)

### `eatBackUntilNonWhiteSpace(java.lang.StringBuilder arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.StringBuilder`)

### `replaceAll(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, ro.sync.syntaxhighlight.marker.TokenMarker arg3, byte arg4)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`ro.sync.syntaxhighlight.marker.TokenMarker`)
- `arg4` (`byte`)

