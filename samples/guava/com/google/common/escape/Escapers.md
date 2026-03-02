# Class: `Escapers`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.Escapers`

## Description

## Fields

### `NULL_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](./Escaper.md)

## Constructors

### `<init>()`

## Methods

### `nullEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](./Escaper.md)

### `builder()`

**Returns:** `com.google.common.escape.Escapers.Builder`

A builder instance can be reused and each
 escaper that is created will be a snapshot of the current builder state. Builders are not
 thread safe.

 
The initial state of the builder is such that:

 

   - There are no replacement mappings
   - safeMin == Character.MIN_VALUE
   - safeMax == Character.MAX_VALUE
   - unsafeReplacement == null
 


 
For performance reasons escapers created by this builder are not Unicode aware and will not
 validate the well-formedness of their input.

### `asUnicodeEscaper(com.google.common.escape.Escaper escaper)`

**Returns:** [`com.google.common.escape.UnicodeEscaper`](./UnicodeEscaper.md)

If the escaper is
 already a UnicodeEscaper then it is simply returned, otherwise it is wrapped in a
 UnicodeEscaper.

 
When a CharEscaper escaper is wrapped by this method it acquires extra behavior with
 respect to the well-formedness of Unicode character sequences and will throw IllegalArgumentException when given bad input.

**Parameters:**
- `escaper` ([`com.google.common.escape.Escaper`](./Escaper.md)): the instance to be wrapped

### `computeReplacement(com.google.common.escape.CharEscaper escaper, char c)`

**Returns:** `java.lang.String`

This method is intended for use in tests through the
 EscaperAsserts class; production users of CharEscaper should limit themselves
 to its public interface.

**Parameters:**
- `escaper` ([`com.google.common.escape.CharEscaper`](./CharEscaper.md))
- `c` (`char`): the character to escape if necessary

### `computeReplacement(com.google.common.escape.UnicodeEscaper escaper, int cp)`

**Returns:** `java.lang.String`

This method is intended for use in tests through the
 EscaperAsserts class; production users of UnicodeEscaper should limit
 themselves to its public interface.

**Parameters:**
- `escaper` ([`com.google.common.escape.UnicodeEscaper`](./UnicodeEscaper.md))
- `cp` (`int`): the Unicode code point to escape if necessary

### `stringOrNull(char[] in)`

**Returns:** `java.lang.String`

**Parameters:**
- `in` (`char[]`)

### `wrap(com.google.common.escape.CharEscaper escaper)`

**Returns:** [`com.google.common.escape.UnicodeEscaper`](./UnicodeEscaper.md)

**Parameters:**
- `escaper` ([`com.google.common.escape.CharEscaper`](./CharEscaper.md))

