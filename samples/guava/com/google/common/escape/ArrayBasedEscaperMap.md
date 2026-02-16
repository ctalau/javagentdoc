# Class: `ArrayBasedEscaperMap`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.ArrayBasedEscaperMap`

## Description

An implementation-specific parameter class suitable for initializing `ArrayBasedCharEscaper` or `ArrayBasedUnicodeEscaper` instances. This class should be used
 when more than one escaper is created using the same character replacement mapping to allow the
 underlying (implementation specific) data structures to be shared.

 <p>The size of the data structure used by ArrayBasedCharEscaper and ArrayBasedUnicodeEscaper is
 proportional to the highest valued character that has a replacement. For example a replacement
 map containing the single character '\u1000' will require approximately 16K of memory.
 As such sharing this data structure between escaper instances is the primary goal of this class.
**Author:** David Beaumont
**Since:** 15.0

## Fields

### `replacementArray`

**Type:** `char[][]`

### `EMPTY_REPLACEMENT_ARRAY`

**Type:** `char[][]`

## Constructors

### `<init>(`char[][]` replacementArray)`

## Methods

### `create(`java.util.Map<java.lang.Character,java.lang.String>` replacements)`

**Returns:** [`com.google.common.escape.ArrayBasedEscaperMap`](./ArrayBasedEscaperMap.md)

Returns a new ArrayBasedEscaperMap for creating ArrayBasedCharEscaper or
 ArrayBasedUnicodeEscaper instances.
@param replacements a map of characters to their escaped representations

### `getReplacementArray()`

**Returns:** `char[][]`

### `createReplacementArray(`java.util.Map<java.lang.Character,java.lang.String>` map)`

**Returns:** `char[][]`

