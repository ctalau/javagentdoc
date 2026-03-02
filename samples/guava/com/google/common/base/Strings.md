# Class: `Strings`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Strings`

## Description

## Constructors

### `<init>()`

## Methods

### `nullToEmpty(java.lang.String string)`

**Returns:** `java.lang.String`

**Parameters:**
- `string` (`java.lang.String`): the string to test and possibly return

### `emptyToNull(java.lang.String string)`

**Returns:** `java.lang.String`

**Parameters:**
- `string` (`java.lang.String`): the string to test and possibly return

### `isNullOrEmpty(java.lang.String string)`

**Returns:** `boolean`

Consider normalizing your string references with #nullToEmpty. If you do, you can
 use String#isEmpty() instead of this method, and you won't need special null-safe forms
 of methods like String#toUpperCase either. Or, if you'd like to normalize "in the other
 direction," converting empty strings to null, you can use #emptyToNull.

**Parameters:**
- `string` (`java.lang.String`): a string reference to check

### `padStart(java.lang.String string, int minLength, char padChar)`

**Returns:** `java.lang.String`

For example,

 

   - padStart("7", 3, '0') returns "007"
   - padStart("2010", 3, '0') returns "2010"
 


 
See java.util.Formatter for a richer set of formatting capabilities.

**Parameters:**
- `string` (`java.lang.String`): the string which should appear at the end of the result
- `minLength` (`int`): the minimum length the resulting string must have. Can be zero or negative, in
     which case the input string is always returned.
- `padChar` (`char`): the character to insert at the beginning of the result until the minimum length
     is reached

### `padEnd(java.lang.String string, int minLength, char padChar)`

**Returns:** `java.lang.String`

For example,

 

   - padEnd("4.", 5, '0') returns "4.000"
   - padEnd("2010", 3, '!') returns "2010"
 


 
See java.util.Formatter for a richer set of formatting capabilities.

**Parameters:**
- `string` (`java.lang.String`): the string which should appear at the beginning of the result
- `minLength` (`int`): the minimum length the resulting string must have. Can be zero or negative, in
     which case the input string is always returned.
- `padChar` (`char`): the character to append to the end of the result until the minimum length is
     reached

### `repeat(java.lang.String string, int count)`

**Returns:** `java.lang.String`

For
 example, repeat("hey", 3) returns the string "heyheyhey".

 
**Java 11+ users:** use string.repeat(count) instead.

**Parameters:**
- `string` (`java.lang.String`): any non-null string
- `count` (`int`): the number of times to repeat it; a nonnegative integer

### `commonPrefix(java.lang.CharSequence a, java.lang.CharSequence b)`

**Returns:** `java.lang.String`

If a and
 b have no common prefix, returns the empty string.

**Parameters:**
- `a` (`java.lang.CharSequence`)
- `b` (`java.lang.CharSequence`)

### `commonSuffix(java.lang.CharSequence a, java.lang.CharSequence b)`

**Returns:** `java.lang.String`

If a and
 b have no common suffix, returns the empty string.

**Parameters:**
- `a` (`java.lang.CharSequence`)
- `b` (`java.lang.CharSequence`)

### `validSurrogatePairAt(java.lang.CharSequence string, int index)`

**Returns:** `boolean`

Out-of-range indexes return false.

**Parameters:**
- `string` (`java.lang.CharSequence`)
- `index` (`int`)

### `lenientFormat(java.lang.String template, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] args)`

**Returns:** `java.lang.String`

Will not throw an exception under
 normal conditions.

 
**Note:** For most string-formatting needs, use String.format,
 PrintWriter.format, and related methods. These support the
 full range of [format
 specifiers](https://docs.oracle.com/javase/9/docs/api/java/util/Formatter.html#syntax), and alert you to usage errors by throwing java.util.IllegalFormatException.

 
In certain cases, such as outputting debugging information or constructing a message to be
 used for another unchecked exception, an exception during string formatting would serve little
 purpose except to supplant the real information you were trying to provide. These are the cases
 this method is made for; it instead generates a best-effort string with all supplied argument
 values present. This method is also useful in environments such as GWT where 
 String.format is not available. As an example, method implementations of the Preconditions class use this formatter, for both of the reasons just discussed.

 
**Warning:** Only the exact two-character placeholder sequence "%s" is
 recognized.

**Parameters:**
- `template` (`java.lang.String`): a string containing zero or more "%s" placeholder sequences. 
     null is treated as the four-character string "null".
- `args` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`): the arguments to be substituted into the message template. The first argument
     specified is substituted for the first occurrence of "%s" in the template, and so
     forth. A null argument is converted to the four-character string "null";
     non-null values are converted to strings using Object#toString().

### `lenientToString(java.lang.Object o)`

**Returns:** `java.lang.String`

**Parameters:**
- `o` (`java.lang.Object`)

