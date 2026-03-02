# Class: `SearchParams`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.SearchParams`

## Description

## Fields

### `fileNameWildcard`

**Type:** `java.lang.String`

### `searchString`

**Type:** `java.lang.String`

### `caseSensitive`

**Type:** `boolean`

### `regexp`

**Type:** `boolean`

### `xpathExpression`

**Type:** `java.lang.String`

### `maxMatches`

**Type:** `int`

## Constructors

### `<init>(java.lang.String fileNameWildcard, java.lang.String searchString, java.lang.String xpathExpression, boolean caseSensitive, boolean regexp, int maxMatches)`

**Parameters:**
- `fileNameWildcard` (`java.lang.String`): The file name wildcard
- `searchString` (`java.lang.String`): Search string
- `xpathExpression` (`java.lang.String`): Filter xpath expression
- `caseSensitive` (`boolean`): Case sensitive
- `regexp` (`boolean`): Regexp enabled
- `maxMatches` (`int`): Maximum matches.

## Methods

### `getSearchString()`

**Returns:** `java.lang.String`

### `isRegexp()`

**Returns:** `boolean`

### `isCaseSensitive()`

**Returns:** `boolean`

### `getMaxMatches()`

**Returns:** `int`

### `getFileNameWildcard()`

**Returns:** `java.lang.String`

### `getXpathExpression()`

**Returns:** `java.lang.String`

