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

### `<init>(String patternStr)`

**Parameters:**
- `patternStr` (`java.lang.String`): the pattern string on which to filter file names

### `<init>(Pattern pattern)`

**Parameters:**
- `pattern` (`java.util.regex.Pattern`): the pattern on which to filter file names

## Methods

### `accept(File dir, String fileName)`

**Parameters:**
- `dir` (`java.io.File`)
- `fileName` (`java.lang.String`)

**Returns:** `boolean`

