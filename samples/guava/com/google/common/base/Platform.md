# Class: `Platform`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Platform`

## Description

Methods factored out so that they can be emulated differently in GWT.
**Author:** Jesse Wilson

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

### `patternCompiler`

**Type:** [`com.google.common.base.PatternCompiler`](./PatternCompiler.md)

## Constructors

### `<init>()`

## Methods

### `precomputeCharMatcher([`com.google.common.base.CharMatcher`](./CharMatcher.md) matcher)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `getEnumIfPresent(`java.lang.Class<T>` enumClass, `java.lang.String` value)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `formatCompact4Digits(`double` value)`

**Returns:** `java.lang.String`

### `stringIsNullOrEmpty(`java.lang.String` string)`

**Returns:** `boolean`

### `nullToEmpty(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns the string if it is not null, or an empty string otherwise.
@param string the string to test and possibly return
@return `string` if it is not null; `""` otherwise

### `emptyToNull(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns the string if it is not empty, or a null string otherwise.
@param string the string to test and possibly return
@return `string` if it is not empty; `null` otherwise

### `compilePattern(`java.lang.String` pattern)`

**Returns:** [`com.google.common.base.CommonPattern`](./CommonPattern.md)

### `patternCompilerIsPcreLike()`

**Returns:** `boolean`

### `loadPatternCompiler()`

**Returns:** [`com.google.common.base.PatternCompiler`](./PatternCompiler.md)

### `logPatternCompilerError(`java.util.ServiceConfigurationError` e)`

**Returns:** `void`

