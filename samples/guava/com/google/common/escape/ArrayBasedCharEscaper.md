# Class: `ArrayBasedCharEscaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.ArrayBasedCharEscaper`

**Extends:** [`com.google.common.escape.CharEscaper`](./CharEscaper.md)

## Description

A {@link CharEscaper} that uses an array to quickly look up replacement characters for a given
 {@code char} value. An additional safe range is provided that determines whether {@code char}
 values without specific replacements are to be considered safe and left unescaped or should be
 escaped in a general way.

 <p>A good example of usage of this class is for Java source code escaping where the replacement
 array contains information about special ASCII characters such as {@code \\t} and {@code \\n}
 while {@link #escapeUnsafe} is overridden to handle general escaping of the form {@code \\uxxxx}.

 <p>The size of the data structure used by {@link ArrayBasedCharEscaper} is proportional to the
 highest valued character that requires escaping. For example a replacement map containing the
 single character '{@code \}{@code u1000}' will require approximately 16K of memory. If you need
 to create multiple escaper instances that have the same character replacement mapping consider
 using {@link ArrayBasedEscaperMap}.
@author Sven Mawson
@author David Beaumont
@since 15.0

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

### `<init>([`java.util.Map<java.lang.Character,java.lang.String>`](../../../../java/util/Map.md) replacementMap, `char` safeMin, `char` safeMax)`

Creates a new ArrayBasedCharEscaper instance with the given replacement map and specified safe
 range. If {@code safeMax < safeMin} then no characters are considered safe.

 <p>If a character has no mapped replacement then it is checked against the safe range. If it
 lies outside that, then {@link #escapeUnsafe} is called, otherwise no escaping is performed.
@param replacementMap a map of characters to their escaped representations
@param safeMin the lowest character value in the safe range
@param safeMax the highest character value in the safe range

### `<init>([`com.google.common.escape.ArrayBasedEscaperMap`](./ArrayBasedEscaperMap.md) escaperMap, `char` safeMin, `char` safeMax)`

Creates a new ArrayBasedCharEscaper instance with the given replacement map and specified safe
 range. If {@code safeMax < safeMin} then no characters are considered safe. This initializer is
 useful when explicit instances of ArrayBasedEscaperMap are used to allow the sharing of large
 replacement mappings.

 <p>If a character has no mapped replacement then it is checked against the safe range. If it
 lies outside that, then {@link #escapeUnsafe} is called, otherwise no escaping is performed.
@param escaperMap the mapping of characters to be escaped
@param safeMin the lowest character value in the safe range
@param safeMax the highest character value in the safe range

## Methods

### `escape(`java.lang.String` s)`

**Returns:** `java.lang.String`

### `escape(`char` c)`

**Returns:** `char[]`

Escapes a single character using the replacement array and safe range values. If the given
 character does not have an explicit replacement and lies outside the safe range then {@link #escapeUnsafe} is called.
@return the replacement characters, or {@code null} if no escaping was required

### `escapeUnsafe(`char` c)`

**Returns:** `char[]`

Escapes a {@code char} value that has no direct explicit value in the replacement array and
 lies outside the stated safe range. Subclasses should override this method to provide
 generalized escaping for characters.

 <p>Note that arrays returned by this method must not be modified once they have been returned.
 However it is acceptable to return the same array multiple times (even for different input
 characters).
@param c the character to escape
@return the replacement characters, or {@code null} if no escaping was required

