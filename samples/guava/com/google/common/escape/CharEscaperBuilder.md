# Class: `CharEscaperBuilder`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.CharEscaperBuilder`

## Description

The array will be from 0 to the maximum index given. All non-set indexes will contain null
 (so it's not really a sparse array, just a pseudo sparse array). The builder can also return a
 CharEscaper based on the generated array.

## Fields

### `map`

**Type:** `java.util.Map<java.lang.Character,java.lang.String>`

### `max`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `addEscape(char c, String r)`

**Parameters:**
- `c` (`char`)
- `r` (`java.lang.String`)

**Returns:** [`com.google.common.escape.CharEscaperBuilder`](./CharEscaperBuilder.md)

### `addEscapes(char[] cs, String r)`

**Parameters:**
- `cs` (`char[]`)
- `r` (`java.lang.String`)

**Returns:** [`com.google.common.escape.CharEscaperBuilder`](./CharEscaperBuilder.md)

### `toArray()`

The array will be sparse in the sense that any unseen
 index will default to null.

**Returns:** `char[] @org.checkerframework.checker.nullness.qual.Nullable []`

### `toEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](./Escaper.md)

