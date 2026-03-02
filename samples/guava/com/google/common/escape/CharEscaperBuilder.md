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

### `addEscape(char c, java.lang.String r)`

**Returns:** [`com.google.common.escape.CharEscaperBuilder`](./CharEscaperBuilder.md)

**Parameters:**
- `c` (`char`)
- `r` (`java.lang.String`)

### `addEscapes(char[] cs, java.lang.String r)`

**Returns:** [`com.google.common.escape.CharEscaperBuilder`](./CharEscaperBuilder.md)

**Parameters:**
- `cs` (`char[]`)
- `r` (`java.lang.String`)

### `toArray()`

**Returns:** `char[] @org.checkerframework.checker.nullness.qual.Nullable []`

The array will be sparse in the sense that any unseen
 index will default to null.

### `toEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](./Escaper.md)

