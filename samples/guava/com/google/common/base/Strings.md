# Class: `Strings`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Strings`

## Description

Static utility methods pertaining to `String` or `CharSequence` instances.
**Author:** Kevin Bourrillion
**Since:** 3.0

## Constructors

### `<init>()`

## Methods

### `nullToEmpty(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns the given string if it is non-null; the empty string otherwise.
@param string the string to test and possibly return
@return `string` itself if it is non-null; `""` if it is null

### `emptyToNull(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns the given string if it is nonempty; `null` otherwise.
@param string the string to test and possibly return
@return `string` itself if it is nonempty; `null` if it is empty or null

### `isNullOrEmpty(`java.lang.String` string)`

**Returns:** `boolean`

Returns `true` if the given string is null or is the empty string.

 <p>Consider normalizing your string references with `nullToEmpty`. If you do, you can
 use `String.isEmpty()` instead of this method, and you won't need special null-safe forms
 of methods like `String.toUpperCase` either. Or, if you'd like to normalize "in the other
 direction," converting empty strings to `null`, you can use `emptyToNull`.
@param string a string reference to check
@return `true` if the string is null or is the empty string

### `padStart(`java.lang.String` string, `int` minLength, `char` padChar)`

**Returns:** `java.lang.String`

Returns a string, of length at least `minLength`, consisting of `string` prepended
 with as many copies of `padChar` as are necessary to reach that length. For example,

 <ul>
   <li>`padStart("7", 3, '0')` returns `"007"`
   <li>`padStart("2010", 3, '0')` returns `"2010"`
 </ul>

 <p>See `java.util.Formatter` for a richer set of formatting capabilities.
@param string the string which should appear at the end of the result
@param minLength the minimum length the resulting string must have. Can be zero or negative, in
     which case the input string is always returned.
@param padChar the character to insert at the beginning of the result until the minimum length
     is reached
@return the padded string

### `padEnd(`java.lang.String` string, `int` minLength, `char` padChar)`

**Returns:** `java.lang.String`

Returns a string, of length at least `minLength`, consisting of `string` appended
 with as many copies of `padChar` as are necessary to reach that length. For example,

 <ul>
   <li>`padEnd("4.", 5, '0')` returns `"4.000"`
   <li>`padEnd("2010", 3, '!')` returns `"2010"`
 </ul>

 <p>See `java.util.Formatter` for a richer set of formatting capabilities.
@param string the string which should appear at the beginning of the result
@param minLength the minimum length the resulting string must have. Can be zero or negative, in
     which case the input string is always returned.
@param padChar the character to append to the end of the result until the minimum length is
     reached
@return the padded string

### `repeat(`java.lang.String` string, `int` count)`

**Returns:** `java.lang.String`

Returns a string consisting of a specific number of concatenated copies of an input string. For
 example, `repeat("hey", 3)` returns the string `"heyheyhey"`.

 <p><b>Java 11+ users:</b> use `string.repeat(count)` instead.
@param string any non-null string
@param count the number of times to repeat it; a nonnegative integer
@return a string containing `string` repeated `count` times (the empty string if
     `count` is zero)
@throws IllegalArgumentException if `count` is negative

### `commonPrefix(`java.lang.CharSequence` a, `java.lang.CharSequence` b)`

**Returns:** `java.lang.String`

Returns the longest string `prefix` such that `a.toString().startsWith(prefix) &&
 b.toString().startsWith(prefix)`, taking care not to split surrogate pairs. If `a` and
 `b` have no common prefix, returns the empty string.
**Since:** 11.0

### `commonSuffix(`java.lang.CharSequence` a, `java.lang.CharSequence` b)`

**Returns:** `java.lang.String`

Returns the longest string `suffix` such that `a.toString().endsWith(suffix) &&
 b.toString().endsWith(suffix)`, taking care not to split surrogate pairs. If `a` and
 `b` have no common suffix, returns the empty string.
**Since:** 11.0

### `validSurrogatePairAt(`java.lang.CharSequence` string, `int` index)`

**Returns:** `boolean`

True when a valid surrogate pair starts at the given `index` in the given `string`.
 Out-of-range indexes return false.

### `lenientFormat(`java.lang.String` template, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` args)`

**Returns:** `java.lang.String`

Returns the given `template` string with each occurrence of `"%s"` replaced with
 the corresponding argument value from `args`; or, if the placeholder and argument counts
 do not match, returns a best-effort form of that string. Will not throw an exception under
 normal conditions.

 <p><b>Note:</b> For most string-formatting needs, use `String.format String.format`,
 `java.io.PrintWriter.format PrintWriter.format`, and related methods. These support the
 full range of <a href="https://docs.oracle.com/javase/9/docs/api/java/util/Formatter.html#syntax">format
 specifiers</a>, and alert you to usage errors by throwing `java.util.IllegalFormatException`.

 <p>In certain cases, such as outputting debugging information or constructing a message to be
 used for another unchecked exception, an exception during string formatting would serve little
 purpose except to supplant the real information you were trying to provide. These are the cases
 this method is made for; it instead generates a best-effort string with all supplied argument
 values present. This method is also useful in environments such as GWT where `String.format` is not available. As an example, method implementations of the `Preconditions` class use this formatter, for both of the reasons just discussed.

 <p><b>Warning:</b> Only the exact two-character placeholder sequence `"%s"` is
 recognized.
@param template a string containing zero or more `"%s"` placeholder sequences. `null` is treated as the four-character string `"null"`.
@param args the arguments to be substituted into the message template. The first argument
     specified is substituted for the first occurrence of `"%s"` in the template, and so
     forth. A `null` argument is converted to the four-character string `"null"`;
     non-null values are converted to strings using `Object.toString()`.
**Since:** 25.1

### `lenientToString(`java.lang.Object` o)`

**Returns:** `java.lang.String`

