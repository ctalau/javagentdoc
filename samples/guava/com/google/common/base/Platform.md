# Class: `Platform`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Platform`

## Description

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

### `patternCompiler`

**Type:** [`com.google.common.base.PatternCompiler`](./PatternCompiler.md)

## Constructors

### `<init>()`

## Methods

### `precomputeCharMatcher(com.google.common.base.CharMatcher matcher)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

**Parameters:**
- `matcher` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))

### `getEnumIfPresent(java.lang.Class<T> enumClass, java.lang.String value)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)
- `value` (`java.lang.String`)

### `formatCompact4Digits(double value)`

**Returns:** `java.lang.String`

**Parameters:**
- `value` (`double`)

### `stringIsNullOrEmpty(java.lang.String string)`

**Returns:** `boolean`

**Parameters:**
- `string` (`java.lang.String`)

### `nullToEmpty(java.lang.String string)`

**Returns:** `java.lang.String`

**Parameters:**
- `string` (`java.lang.String`): the string to test and possibly return

### `emptyToNull(java.lang.String string)`

**Returns:** `java.lang.String`

**Parameters:**
- `string` (`java.lang.String`): the string to test and possibly return

### `compilePattern(java.lang.String pattern)`

**Returns:** [`com.google.common.base.CommonPattern`](./CommonPattern.md)

**Parameters:**
- `pattern` (`java.lang.String`)

### `patternCompilerIsPcreLike()`

**Returns:** `boolean`

### `loadPatternCompiler()`

**Returns:** [`com.google.common.base.PatternCompiler`](./PatternCompiler.md)

### `logPatternCompilerError(java.util.ServiceConfigurationError e)`

**Returns:** `void`

**Parameters:**
- `e` (`java.util.ServiceConfigurationError`)

