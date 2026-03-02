# Class: `PatternFilenameFilter`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.PatternFilenameFilter`

**Implements:** `java.io.FilenameFilter`

## Description

This class is thread-safe
 and immutable.

## Fields

### `pattern`

**Type:** `java.util.regex.Pattern`

## Constructors

### `<init>(java.lang.String patternStr)`

**Parameters:**
- `patternStr` (`java.lang.String`): the pattern string on which to filter file names

### `<init>(java.util.regex.Pattern pattern)`

**Parameters:**
- `pattern` (`java.util.regex.Pattern`): the pattern on which to filter file names

## Methods

### `accept(java.io.File dir, java.lang.String fileName)`

**Returns:** `boolean`

**Parameters:**
- `dir` (`java.io.File`)
- `fileName` (`java.lang.String`)

