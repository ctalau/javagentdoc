# Class: `ArrayBasedUnicodeEscaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.ArrayBasedUnicodeEscaper`

**Extends:** [`com.google.common.escape.UnicodeEscaper`](./UnicodeEscaper.md)

## Description

An additional safe range is provided that determines whether code points without
 specific replacements are to be considered safe and left unescaped or should be escaped in a
 general way.

 
A good example of usage of this class is for HTML escaping where the replacement array
 contains information about the named HTML entities such as &amp; and &quot; while
 #escapeUnsafe is overridden to handle general escaping of the form &#NNNNN;.

 
The size of the data structure used by ArrayBasedUnicodeEscaper is proportional to the
 highest valued code point that requires escaping. For example a replacement map containing the
 single character '\u1000' will require approximately 16K of memory. If you need
 to create multiple escaper instances that have the same character replacement mapping consider
 using ArrayBasedEscaperMap.

## Fields

### `replacements`

**Type:** `char[][]`

### `replacementsLength`

**Type:** `int`

### `safeMin`

**Type:** `int`

### `safeMax`

**Type:** `int`

### `safeMinChar`

**Type:** `char`

### `safeMaxChar`

**Type:** `char`

## Constructors

### `<init>(Map<Character,String> replacementMap, int safeMin, int safeMax, lang@Nullable String unsafeReplacement)`

If safeMax < safeMin then no code points are considered safe.

 
If a code point has no mapped replacement then it is checked against the safe range. If it
 lies outside that, then #escapeUnsafe is called, otherwise no escaping is performed.

**Parameters:**
- `replacementMap` (`java.util.Map<java.lang.Character,java.lang.String>`): a map of characters to their escaped representations
- `safeMin` (`int`): the lowest character value in the safe range
- `safeMax` (`int`): the highest character value in the safe range
- `unsafeReplacement` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable String`): the default replacement for unsafe characters or null if no default
       replacement is required

### `<init>(ArrayBasedEscaperMap escaperMap, int safeMin, int safeMax, lang@Nullable String unsafeReplacement)`

If safeMax < safeMin then no code points are considered safe. This
 initializer is useful when explicit instances of ArrayBasedEscaperMap are used to allow the
 sharing of large replacement mappings.

 
If a code point has no mapped replacement then it is checked against the safe range. If it
 lies outside that, then #escapeUnsafe is called, otherwise no escaping is performed.

**Parameters:**
- `escaperMap` ([`com.google.common.escape.ArrayBasedEscaperMap`](./ArrayBasedEscaperMap.md)): the map of replacements
- `safeMin` (`int`): the lowest character value in the safe range
- `safeMax` (`int`): the highest character value in the safe range
- `unsafeReplacement` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable String`): the default replacement for unsafe characters or null if no default
       replacement is required

## Methods

### `escape(String s)`

**Parameters:**
- `s` (`java.lang.String`)

**Returns:** `java.lang.String`

### `escape(int cp)`

If the
 given character does not have an explicit replacement and lies outside the safe range then
 #escapeUnsafe is called.

**Parameters:**
- `cp` (`int`)

**Returns:** `char[]`

### `nextEscapeIndex(CharSequence csq, int index, int end)`

**Parameters:**
- `csq` (`java.lang.CharSequence`)
- `index` (`int`)
- `end` (`int`)

**Returns:** `int`

### `escapeUnsafe(int cp)`

Subclasses should override this method to provide generalized
 escaping for code points if required.

 
Note that arrays returned by this method must not be modified once they have been returned.
 However it is acceptable to return the same array multiple times (even for different input
 characters).

**Parameters:**
- `cp` (`int`): the Unicode code point to escape

**Returns:** `char[]`

