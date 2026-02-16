# Class: `ArrayBasedUnicodeEscaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.ArrayBasedUnicodeEscaper`

**Extends:** [`com.google.common.escape.UnicodeEscaper`](./UnicodeEscaper.md)

## Description

A {@link UnicodeEscaper} that uses an array to quickly look up replacement characters for a given
 code point. An additional safe range is provided that determines whether code points without
 specific replacements are to be considered safe and left unescaped or should be escaped in a
 general way.

 <p>A good example of usage of this class is for HTML escaping where the replacement array
 contains information about the named HTML entities such as {@code &amp;} and {@code &quot;} while
 {@link #escapeUnsafe} is overridden to handle general escaping of the form {@code &#NNNNN;}.

 <p>The size of the data structure used by {@link ArrayBasedUnicodeEscaper} is proportional to the
 highest valued code point that requires escaping. For example a replacement map containing the
 single character '{@code \}{@code u1000}' will require approximately 16K of memory. If you need
 to create multiple escaper instances that have the same character replacement mapping consider
 using {@link ArrayBasedEscaperMap}.
@author David Beaumont
@since 15.0

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

### `<init>([`java.util.Map<java.lang.Character,java.lang.String>`](../../../../java/util/Map.md) replacementMap, `int` safeMin, `int` safeMax, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable String` unsafeReplacement)`

Creates a new ArrayBasedUnicodeEscaper instance with the given replacement map and specified
 safe range. If {@code safeMax < safeMin} then no code points are considered safe.

 <p>If a code point has no mapped replacement then it is checked against the safe range. If it
 lies outside that, then {@link #escapeUnsafe} is called, otherwise no escaping is performed.
@param replacementMap a map of characters to their escaped representations
@param safeMin the lowest character value in the safe range
@param safeMax the highest character value in the safe range
@param unsafeReplacement the default replacement for unsafe characters or null if no default
     replacement is required

### `<init>([`com.google.common.escape.ArrayBasedEscaperMap`](./ArrayBasedEscaperMap.md) escaperMap, `int` safeMin, `int` safeMax, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable String` unsafeReplacement)`

Creates a new ArrayBasedUnicodeEscaper instance with the given replacement map and specified
 safe range. If {@code safeMax < safeMin} then no code points are considered safe. This
 initializer is useful when explicit instances of ArrayBasedEscaperMap are used to allow the
 sharing of large replacement mappings.

 <p>If a code point has no mapped replacement then it is checked against the safe range. If it
 lies outside that, then {@link #escapeUnsafe} is called, otherwise no escaping is performed.
@param escaperMap the map of replacements
@param safeMin the lowest character value in the safe range
@param safeMax the highest character value in the safe range
@param unsafeReplacement the default replacement for unsafe characters or null if no default
     replacement is required

## Methods

### `escape(`java.lang.String` s)`

**Returns:** `java.lang.String`

### `escape(`int` cp)`

**Returns:** `char[]`

Escapes a single Unicode code point using the replacement array and safe range values. If the
 given character does not have an explicit replacement and lies outside the safe range then
 {@link #escapeUnsafe} is called.
@return the replacement characters, or {@code null} if no escaping was required

### `nextEscapeIndex(`java.lang.CharSequence` csq, `int` index, `int` end)`

**Returns:** `int`

### `escapeUnsafe(`int` cp)`

**Returns:** `char[]`

Escapes a code point that has no direct explicit value in the replacement array and lies
 outside the stated safe range. Subclasses should override this method to provide generalized
 escaping for code points if required.

 <p>Note that arrays returned by this method must not be modified once they have been returned.
 However it is acceptable to return the same array multiple times (even for different input
 characters).
@param cp the Unicode code point to escape
@return the replacement characters, or {@code null} if no escaping was required

