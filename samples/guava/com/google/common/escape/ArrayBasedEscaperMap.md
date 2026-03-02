# Class: `ArrayBasedEscaperMap`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.ArrayBasedEscaperMap`

## Description

This class should be used
 when more than one escaper is created using the same character replacement mapping to allow the
 underlying (implementation specific) data structures to be shared.

 
The size of the data structure used by ArrayBasedCharEscaper and ArrayBasedUnicodeEscaper is
 proportional to the highest valued character that has a replacement. For example a replacement
 map containing the single character '\u1000' will require approximately 16K of memory.
 As such sharing this data structure between escaper instances is the primary goal of this class.

## Fields

### `replacementArray`

**Type:** `char[][]`

### `EMPTY_REPLACEMENT_ARRAY`

**Type:** `char[][]`

## Constructors

### `<init>(char[][] replacementArray)`

**Parameters:**
- `replacementArray` (`char[][]`)

## Methods

### `create(Map<Character,String> replacements)`

**Parameters:**
- `replacements` (`java.util.Map<java.lang.Character,java.lang.String>`): a map of characters to their escaped representations

**Returns:** [`com.google.common.escape.ArrayBasedEscaperMap`](./ArrayBasedEscaperMap.md)

### `getReplacementArray()`

**Returns:** `char[][]`

### `createReplacementArray(Map<Character,String> map)`

**Parameters:**
- `map` (`java.util.Map<java.lang.Character,java.lang.String>`)

**Returns:** `char[][]`

