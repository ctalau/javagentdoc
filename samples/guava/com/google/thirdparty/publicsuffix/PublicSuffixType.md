# Enum: `PublicSuffixType`

**Package:** [`com.google.thirdparty.publicsuffix`](README.md)

**Fully Qualified Name:** `com.google.thirdparty.publicsuffix.PublicSuffixType`

## Description

For access to public-suffix information, use com.google.common.net.InternetDomainName.**

 
Specifies the type of a top-level domain definition.

## Fields

### `innerNodeCode`

**Type:** `char`

### `leafNodeCode`

**Type:** `char`

## Constructors

### `<init>(char innerNodeCode, char leafNodeCode)`

**Parameters:**
- `innerNodeCode` (`char`)
- `leafNodeCode` (`char`)

## Methods

### `values()`

**Returns:** [`com.google.thirdparty.publicsuffix.PublicSuffixType[]`](./PublicSuffixType.md)

### `valueOf(String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** [`com.google.thirdparty.publicsuffix.PublicSuffixType`](./PublicSuffixType.md)

### `getLeafNodeCode()`

**Returns:** `char`

### `getInnerNodeCode()`

**Returns:** `char`

### `fromCode(char code)`

**Parameters:**
- `code` (`char`)

**Returns:** [`com.google.thirdparty.publicsuffix.PublicSuffixType`](./PublicSuffixType.md)

