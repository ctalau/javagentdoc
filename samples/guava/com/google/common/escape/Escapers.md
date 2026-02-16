# Class: `Escapers`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.Escapers`

## Description

Static utility methods pertaining to {@link Escaper} instances.
@author Sven Mawson
@author David Beaumont
@since 15.0

## Fields

### `NULL_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](./Escaper.md)

## Constructors

### `<init>()`

## Methods

### `nullEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](./Escaper.md)

Returns an {@link Escaper} that does no escaping, passing all character data through unchanged.

### `builder()`

**Returns:** [`com.google.common.escape.Escapers.Builder`](Escapers/Builder.md)

Returns a builder for creating simple, fast escapers. A builder instance can be reused and each
 escaper that is created will be a snapshot of the current builder state. Builders are not
 thread safe.

 <p>The initial state of the builder is such that:

 <ul>
   <li>There are no replacement mappings
   <li>{@code safeMin == Character.MIN_VALUE}
   <li>{@code safeMax == Character.MAX_VALUE}
   <li>{@code unsafeReplacement == null}
 </ul>

 <p>For performance reasons escapers created by this builder are not Unicode aware and will not
 validate the well-formedness of their input.

### `asUnicodeEscaper([`com.google.common.escape.Escaper`](./Escaper.md) escaper)`

**Returns:** [`com.google.common.escape.UnicodeEscaper`](./UnicodeEscaper.md)

Returns a {@link UnicodeEscaper} equivalent to the given escaper instance. If the escaper is
 already a UnicodeEscaper then it is simply returned, otherwise it is wrapped in a
 UnicodeEscaper.

 <p>When a {@link CharEscaper} escaper is wrapped by this method it acquires extra behavior with
 respect to the well-formedness of Unicode character sequences and will throw {@link IllegalArgumentException} when given bad input.
@param escaper the instance to be wrapped
@return a UnicodeEscaper with the same behavior as the given instance
@throws NullPointerException if escaper is null
@throws IllegalArgumentException if escaper is not a UnicodeEscaper or a CharEscaper

### `computeReplacement([`com.google.common.escape.CharEscaper`](./CharEscaper.md) escaper, `char` c)`

**Returns:** `java.lang.String`

Returns a string that would replace the given character in the specified escaper, or {@code
 null} if no replacement should be made. This method is intended for use in tests through the
 {@code EscaperAsserts} class; production users of {@link CharEscaper} should limit themselves
 to its public interface.
@param c the character to escape if necessary
@return the replacement string, or {@code null} if no escaping was needed

### `computeReplacement([`com.google.common.escape.UnicodeEscaper`](./UnicodeEscaper.md) escaper, `int` cp)`

**Returns:** `java.lang.String`

Returns a string that would replace the given character in the specified escaper, or {@code
 null} if no replacement should be made. This method is intended for use in tests through the
 {@code EscaperAsserts} class; production users of {@link UnicodeEscaper} should limit
 themselves to its public interface.
@param cp the Unicode code point to escape if necessary
@return the replacement string, or {@code null} if no escaping was needed

### `stringOrNull(`char[]` in)`

**Returns:** `java.lang.String`

### `wrap([`com.google.common.escape.CharEscaper`](./CharEscaper.md) escaper)`

**Returns:** [`com.google.common.escape.UnicodeEscaper`](./UnicodeEscaper.md)

Private helper to wrap a CharEscaper as a UnicodeEscaper.

