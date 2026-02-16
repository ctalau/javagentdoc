# Class: `PatternFilenameFilter`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.PatternFilenameFilter`

**Implements:** [`java.io.FilenameFilter`](../../../../java/io/FilenameFilter.md)

## Description

File name filter that only accepts files matching a regular expression. This class is thread-safe
 and immutable.
@author Apple Chow
@since 1.0

## Fields

### `pattern`

**Type:** [`java.util.regex.Pattern`](../../../../java/util/regex/Pattern.md)

## Constructors

### `<init>(`java.lang.String` patternStr)`

Constructs a pattern file name filter object.
@param patternStr the pattern string on which to filter file names
@throws PatternSyntaxException if pattern compilation fails (runtime)

### `<init>([`java.util.regex.Pattern`](../../../../java/util/regex/Pattern.md) pattern)`

Constructs a pattern file name filter object.
@param pattern the pattern on which to filter file names

## Methods

### `accept([`java.io.File`](../../../../java/io/File.md) dir, `java.lang.String` fileName)`

**Returns:** `boolean`

