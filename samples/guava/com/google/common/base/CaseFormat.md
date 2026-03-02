# Enum: `CaseFormat`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.CaseFormat`

## Description

Behavior is undefined for
 non-ASCII input.

## Fields

### `wordBoundary`

**Type:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `wordSeparator`

**Type:** `java.lang.String`

## Constructors

### `<init>(CharMatcher wordBoundary, String wordSeparator)`

**Parameters:**
- `wordBoundary` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))
- `wordSeparator` (`java.lang.String`)

## Methods

### `values()`

**Returns:** [`com.google.common.base.CaseFormat[]`](./CaseFormat.md)

### `valueOf(String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** [`com.google.common.base.CaseFormat`](./CaseFormat.md)

### `to(CaseFormat format, String str)`

A
 "best effort" approach is taken; if str does not conform to the assumed format, then
 the behavior of this method is undefined but we make a reasonable effort at converting anyway.

**Parameters:**
- `format` ([`com.google.common.base.CaseFormat`](./CaseFormat.md))
- `str` (`java.lang.String`)

**Returns:** `java.lang.String`

### `convert(CaseFormat format, String s)`

**Parameters:**
- `format` ([`com.google.common.base.CaseFormat`](./CaseFormat.md))
- `s` (`java.lang.String`)

**Returns:** `java.lang.String`

### `converterTo(CaseFormat targetFormat)`

**Parameters:**
- `targetFormat` ([`com.google.common.base.CaseFormat`](./CaseFormat.md))

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.String>`](./Converter.md)

### `normalizeWord(String word)`

**Parameters:**
- `word` (`java.lang.String`)

**Returns:** `java.lang.String`

### `normalizeFirstWord(String word)`

**Parameters:**
- `word` (`java.lang.String`)

**Returns:** `java.lang.String`

### `firstCharOnlyToUpper(String word)`

**Parameters:**
- `word` (`java.lang.String`)

**Returns:** `java.lang.String`

