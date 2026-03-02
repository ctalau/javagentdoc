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

### `<init>(com.google.common.base.CharMatcher wordBoundary, java.lang.String wordSeparator)`

**Parameters:**
- `wordBoundary` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))
- `wordSeparator` (`java.lang.String`)

## Methods

### `values()`

**Returns:** [`com.google.common.base.CaseFormat[]`](./CaseFormat.md)

### `valueOf(java.lang.String name)`

**Returns:** [`com.google.common.base.CaseFormat`](./CaseFormat.md)

**Parameters:**
- `name` (`java.lang.String`)

### `to(com.google.common.base.CaseFormat format, java.lang.String str)`

**Returns:** `java.lang.String`

A
 "best effort" approach is taken; if str does not conform to the assumed format, then
 the behavior of this method is undefined but we make a reasonable effort at converting anyway.

**Parameters:**
- `format` ([`com.google.common.base.CaseFormat`](./CaseFormat.md))
- `str` (`java.lang.String`)

### `convert(com.google.common.base.CaseFormat format, java.lang.String s)`

**Returns:** `java.lang.String`

**Parameters:**
- `format` ([`com.google.common.base.CaseFormat`](./CaseFormat.md))
- `s` (`java.lang.String`)

### `converterTo(com.google.common.base.CaseFormat targetFormat)`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.String>`](./Converter.md)

**Parameters:**
- `targetFormat` ([`com.google.common.base.CaseFormat`](./CaseFormat.md))

### `normalizeWord(java.lang.String word)`

**Returns:** `java.lang.String`

**Parameters:**
- `word` (`java.lang.String`)

### `normalizeFirstWord(java.lang.String word)`

**Returns:** `java.lang.String`

**Parameters:**
- `word` (`java.lang.String`)

### `firstCharOnlyToUpper(java.lang.String word)`

**Returns:** `java.lang.String`

**Parameters:**
- `word` (`java.lang.String`)

