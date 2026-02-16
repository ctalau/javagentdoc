# Class: `CharEscaperBuilder`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.CharEscaperBuilder`

## Description

Simple helper class to build a "sparse" array of objects based on the indexes that were added to
 it. The array will be from 0 to the maximum index given. All non-set indexes will contain null
 (so it's not really a sparse array, just a pseudo sparse array). The builder can also return a
 CharEscaper based on the generated array.
**Author:** Sven Mawson
**Since:** 15.0

## Fields

### `map`

**Type:** `java.util.Map<java.lang.Character,java.lang.String>`

### `max`

**Type:** `int`

## Constructors

### `<init>()`

Construct a new sparse array builder.

## Methods

### `addEscape(`char` c, `java.lang.String` r)`

**Returns:** [`com.google.common.escape.CharEscaperBuilder`](./CharEscaperBuilder.md)

Add a new mapping from an index to an object to the escaping.

### `addEscapes(`char[]` cs, `java.lang.String` r)`

**Returns:** [`com.google.common.escape.CharEscaperBuilder`](./CharEscaperBuilder.md)

Add multiple mappings at once for a particular index.

### `toArray()`

**Returns:** [`char[] @org.checkerframework.checker.nullness.qual.Nullable []`](../../../../char @org/checkerframework/checker/nullness/qual/Nullable .md)

Convert this builder into an array of char[]s where the maximum index is the value of the
 highest character that has been seen. The array will be sparse in the sense that any unseen
 index will default to null.
@return a "sparse" array that holds the replacement mappings.

### `toEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](./Escaper.md)

Convert this builder into a char escaper which is just a decorator around the underlying array
 of replacement char[]s.
@return an escaper that escapes based on the underlying array.

