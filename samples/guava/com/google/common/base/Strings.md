# Class: `Strings`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Strings`

## Description

Static utility methods pertaining to {@code String} or {@code CharSequence} instances.
@author Kevin Bourrillion
@since 3.0

## Constructors

### `<init>()`

## Methods

### `nullToEmpty(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns the given string if it is non-null; the empty string otherwise.
@param string the string to test and possibly return
@return {@code string} itself if it is non-null; {@code ""} if it is null

### `emptyToNull(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns the given string if it is nonempty; {@code null} otherwise.
@param string the string to test and possibly return
@return {@code string} itself if it is nonempty; {@code null} if it is empty or null

### `isNullOrEmpty(`java.lang.String` string)`

**Returns:** `boolean`

Returns {@code true} if the given string is null or is the empty string.

 <p>Consider normalizing your string references with {@link #nullToEmpty}. If you do, you can
 use {@link String#isEmpty()} instead of this method, and you won't need special null-safe forms
 of methods like {@link String#toUpperCase} either. Or, if you'd like to normalize "in the other
 direction," converting empty strings to {@code null}, you can use {@link #emptyToNull}.
@param string a string reference to check
@return {@code true} if the string is null or is the empty string

### `padStart(`java.lang.String` string, `int` minLength, `char` padChar)`

**Returns:** `java.lang.String`

Returns a string, of length at least {@code minLength}, consisting of {@code string} prepended
 with as many copies of {@code padChar} as are necessary to reach that length. For example,

 <ul>
   <li>{@code padStart("7", 3, '0')} returns {@code "007"}
   <li>{@code padStart("2010", 3, '0')} returns {@code "2010"}
 </ul>

 <p>See {@link java.util.Formatter} for a richer set of formatting capabilities.
@param string the string which should appear at the end of the result
@param minLength the minimum length the resulting string must have. Can be zero or negative, in
     which case the input string is always returned.
@param padChar the character to insert at the beginning of the result until the minimum length
     is reached
@return the padded string

### `padEnd(`java.lang.String` string, `int` minLength, `char` padChar)`

**Returns:** `java.lang.String`

Returns a string, of length at least {@code minLength}, consisting of {@code string} appended
 with as many copies of {@code padChar} as are necessary to reach that length. For example,

 <ul>
   <li>{@code padEnd("4.", 5, '0')} returns {@code "4.000"}
   <li>{@code padEnd("2010", 3, '!')} returns {@code "2010"}
 </ul>

 <p>See {@link java.util.Formatter} for a richer set of formatting capabilities.
@param string the string which should appear at the beginning of the result
@param minLength the minimum length the resulting string must have. Can be zero or negative, in
     which case the input string is always returned.
@param padChar the character to append to the end of the result until the minimum length is
     reached
@return the padded string

### `repeat(`java.lang.String` string, `int` count)`

**Returns:** `java.lang.String`

Returns a string consisting of a specific number of concatenated copies of an input string. For
 example, {@code repeat("hey", 3)} returns the string {@code "heyheyhey"}.

 <p><b>Java 11+ users:</b> use {@code string.repeat(count)} instead.
@param string any non-null string
@param count the number of times to repeat it; a nonnegative integer
@return a string containing {@code string} repeated {@code count} times (the empty string if
     {@code count} is zero)
@throws IllegalArgumentException if {@code count} is negative

### `commonPrefix(`java.lang.CharSequence` a, `java.lang.CharSequence` b)`

**Returns:** `java.lang.String`

Returns the longest string {@code prefix} such that {@code a.toString().startsWith(prefix) &&
 b.toString().startsWith(prefix)}, taking care not to split surrogate pairs. If {@code a} and
 {@code b} have no common prefix, returns the empty string.
@since 11.0

### `commonSuffix(`java.lang.CharSequence` a, `java.lang.CharSequence` b)`

**Returns:** `java.lang.String`

Returns the longest string {@code suffix} such that {@code a.toString().endsWith(suffix) &&
 b.toString().endsWith(suffix)}, taking care not to split surrogate pairs. If {@code a} and
 {@code b} have no common suffix, returns the empty string.
@since 11.0

### `validSurrogatePairAt(`java.lang.CharSequence` string, `int` index)`

**Returns:** `boolean`

True when a valid surrogate pair starts at the given {@code index} in the given {@code string}.
 Out-of-range indexes return false.

### `lenientFormat(`java.lang.String` template, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` args)`

**Returns:** `java.lang.String`

Returns the given {@code template} string with each occurrence of {@code "%s"} replaced with
 the corresponding argument value from {@code args}; or, if the placeholder and argument counts
 do not match, returns a best-effort form of that string. Will not throw an exception under
 normal conditions.

 <p><b>Note:</b> For most string-formatting needs, use {@link String#format String.format},
 {@link java.io.PrintWriter#format PrintWriter.format}, and related methods. These support the
 full range of <a href="https://docs.oracle.com/javase/9/docs/api/java/util/Formatter.html#syntax">format
 specifiers</a>, and alert you to usage errors by throwing {@link java.util.IllegalFormatException}.

 <p>In certain cases, such as outputting debugging information or constructing a message to be
 used for another unchecked exception, an exception during string formatting would serve little
 purpose except to supplant the real information you were trying to provide. These are the cases
 this method is made for; it instead generates a best-effort string with all supplied argument
 values present. This method is also useful in environments such as GWT where {@code
 String.format} is not available. As an example, method implementations of the {@link Preconditions} class use this formatter, for both of the reasons just discussed.

 <p><b>Warning:</b> Only the exact two-character placeholder sequence {@code "%s"} is
 recognized.
@param template a string containing zero or more {@code "%s"} placeholder sequences. {@code
     null} is treated as the four-character string {@code "null"}.
@param args the arguments to be substituted into the message template. The first argument
     specified is substituted for the first occurrence of {@code "%s"} in the template, and so
     forth. A {@code null} argument is converted to the four-character string {@code "null"};
     non-null values are converted to strings using {@link Object#toString()}.
@since 25.1

### `lenientToString(`java.lang.Object` o)`

**Returns:** `java.lang.String`

