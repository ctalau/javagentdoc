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

### `normalizeAndCollapseWhitespace(`java.lang.String` arg0, `boolean` arg1)`

**Returns:** `java.lang.String`

### `normalizeWhitespace(`java.lang.StringBuilder` arg0)`

**Returns:** `void`

### `getColumnNumber(`ro.sync.document.ob` arg0, `int` arg1, `int` arg2)`

**Returns:** `int`

### `getColumnNumber(`ro.sync.document.ob` arg0, `int` arg1, `int` arg2, `boolean` arg3)`

**Returns:** `int`

### `getSomeTextConsideringWordBounds(`java.lang.String` arg0, `int` arg1)`

**Returns:** `java.lang.String`

### `getTextWithoutTags(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `normalizeAndCollapseWhitespace(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `computeChNumberAndOffset(`int` arg0, `javax.swing.text.Document` arg1, `char` arg2)`

**Returns:** `java.util.List`

### `computeNonWSCharCount(`javax.swing.text.Document` arg0, `int` arg1, `int` arg2)`

**Returns:** `int`

### `getOffsetAfterChAndOffset(`int` arg0, `int` arg1, `javax.swing.text.Document` arg2, `char` arg3, `boolean` arg4)`

**Returns:** `int`

### `getOffsetAfterNonWSChars(`int` arg0, `javax.swing.text.Document` arg1, `int` arg2)`

**Returns:** `int`

### `eatBackUntilNonWhiteSpace(`java.lang.StringBuilder` arg0)`

**Returns:** `void`

### `replaceAll(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `ro.sync.syntaxhighlight.marker.TokenMarker` arg3, `byte` arg4)`

**Returns:** `java.lang.String`

