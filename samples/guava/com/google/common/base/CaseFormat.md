# Enum: `CaseFormat`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.CaseFormat`

## Description

Utility class for converting between various ASCII case formats. Behavior is undefined for
 non-ASCII input.
@author Mike Bostock
@since 1.0

## Fields

### `wordBoundary`

**Type:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `wordSeparator`

**Type:** `java.lang.String`

## Constructors

### `<init>([`com.google.common.base.CharMatcher`](./CharMatcher.md) wordBoundary, `java.lang.String` wordSeparator)`

## Methods

### `values()`

**Returns:** [`com.google.common.base.CaseFormat[]`](./CaseFormat.md)

### `valueOf(`java.lang.String` name)`

**Returns:** [`com.google.common.base.CaseFormat`](./CaseFormat.md)

### `to([`com.google.common.base.CaseFormat`](./CaseFormat.md) format, `java.lang.String` str)`

**Returns:** `java.lang.String`

Converts the specified {@code String str} from this format to the specified {@code format}. A
 "best effort" approach is taken; if {@code str} does not conform to the assumed format, then
 the behavior of this method is undefined but we make a reasonable effort at converting anyway.

### `convert([`com.google.common.base.CaseFormat`](./CaseFormat.md) format, `java.lang.String` s)`

**Returns:** `java.lang.String`

Enum values can override for performance reasons.

### `converterTo([`com.google.common.base.CaseFormat`](./CaseFormat.md) targetFormat)`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.String>`](./Converter.md)

Returns a serializable {@code Converter} that converts strings from this format to {@code
 targetFormat}.
@since 16.0

### `normalizeWord(`java.lang.String` word)`

**Returns:** `java.lang.String`

### `normalizeFirstWord(`java.lang.String` word)`

**Returns:** `java.lang.String`

### `firstCharOnlyToUpper(`java.lang.String` word)`

**Returns:** `java.lang.String`

