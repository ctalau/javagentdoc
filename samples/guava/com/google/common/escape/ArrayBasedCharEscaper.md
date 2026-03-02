# Class: `ArrayBasedCharEscaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.ArrayBasedCharEscaper`

**Extends:** [`com.google.common.escape.CharEscaper`](./CharEscaper.md)

## Description

An additional safe range is provided that determines whether char
 values without specific replacements are to be considered safe and left unescaped or should be
 escaped in a general way.

 
A good example of usage of this class is for Java source code escaping where the replacement
 array contains information about special ASCII characters such as \\t and \\n
 while #escapeUnsafe is overridden to handle general escaping of the form \\uxxxx.

 
The size of the data structure used by ArrayBasedCharEscaper is proportional to the
 highest valued character that requires escaping. For example a replacement map containing the
 single character '\u1000' will require approximately 16K of memory. If you need
 to create multiple escaper instances that have the same character replacement mapping consider
 using ArrayBasedEscaperMap.

## Fields

### `replacements`

**Type:** `char[][]`

### `replacementsLength`

**Type:** `int`

### `safeMin`

**Type:** `char`

### `safeMax`

**Type:** `char`

## Constructors

### `<init>(java.util.Map<java.lang.Character,java.lang.String> replacementMap, char safeMin, char safeMax)`

If safeMax < safeMin then no characters are considered safe.

 
If a character has no mapped replacement then it is checked against the safe range. If it
 lies outside that, then #escapeUnsafe is called, otherwise no escaping is performed.

**Parameters:**
- `replacementMap` (`java.util.Map<java.lang.Character,java.lang.String>`): a map of characters to their escaped representations
- `safeMin` (`char`): the lowest character value in the safe range
- `safeMax` (`char`): the highest character value in the safe range

### `<init>(com.google.common.escape.ArrayBasedEscaperMap escaperMap, char safeMin, char safeMax)`

If safeMax < safeMin then no characters are considered safe. This initializer is
 useful when explicit instances of ArrayBasedEscaperMap are used to allow the sharing of large
 replacement mappings.

 
If a character has no mapped replacement then it is checked against the safe range. If it
 lies outside that, then #escapeUnsafe is called, otherwise no escaping is performed.

**Parameters:**
- `escaperMap` ([`com.google.common.escape.ArrayBasedEscaperMap`](./ArrayBasedEscaperMap.md)): the mapping of characters to be escaped
- `safeMin` (`char`): the lowest character value in the safe range
- `safeMax` (`char`): the highest character value in the safe range

## Methods

### `escape(java.lang.String s)`

**Returns:** `java.lang.String`

**Parameters:**
- `s` (`java.lang.String`)

### `escape(char c)`

**Returns:** `char[]`

If the given
 character does not have an explicit replacement and lies outside the safe range then #escapeUnsafe is called.

**Parameters:**
- `c` (`char`)

### `escapeUnsafe(char c)`

**Returns:** `char[]`

Subclasses should override this method to provide
 generalized escaping for characters.

 
Note that arrays returned by this method must not be modified once they have been returned.
 However it is acceptable to return the same array multiple times (even for different input
 characters).

**Parameters:**
- `c` (`char`): the character to escape

