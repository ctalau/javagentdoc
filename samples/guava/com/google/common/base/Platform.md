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

### `precomputeCharMatcher(CharMatcher matcher)`

**Parameters:**
- `matcher` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `getEnumIfPresent(Class<T> enumClass, String value)`

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)
- `value` (`java.lang.String`)

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `formatCompact4Digits(double value)`

**Parameters:**
- `value` (`double`)

**Returns:** `java.lang.String`

### `stringIsNullOrEmpty(String string)`

**Parameters:**
- `string` (`java.lang.String`)

**Returns:** `boolean`

### `nullToEmpty(String string)`

**Parameters:**
- `string` (`java.lang.String`): the string to test and possibly return

**Returns:** `java.lang.String`

### `emptyToNull(String string)`

**Parameters:**
- `string` (`java.lang.String`): the string to test and possibly return

**Returns:** `java.lang.String`

### `compilePattern(String pattern)`

**Parameters:**
- `pattern` (`java.lang.String`)

**Returns:** [`com.google.common.base.CommonPattern`](./CommonPattern.md)

### `patternCompilerIsPcreLike()`

**Returns:** `boolean`

### `loadPatternCompiler()`

**Returns:** [`com.google.common.base.PatternCompiler`](./PatternCompiler.md)

### `logPatternCompilerError(ServiceConfigurationError e)`

**Parameters:**
- `e` (`java.util.ServiceConfigurationError`)

**Returns:** `void`

