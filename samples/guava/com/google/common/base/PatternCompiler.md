# Interface: `PatternCompiler`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.PatternCompiler`

## Description

By default this package uses the 
 java.util.regex library, but an alternate implementation can be supplied using the java.util.ServiceLoader mechanism.

## Methods

### `compile(String pattern)`

**Parameters:**
- `pattern` (`java.lang.String`)

**Returns:** [`com.google.common.base.CommonPattern`](./CommonPattern.md)

### `isPcreLike()`

**Returns:** `boolean`

