# Enum: `PublicSuffixType`

**Package:** [`com.google.thirdparty.publicsuffix`](README.md)

**Fully Qualified Name:** `com.google.thirdparty.publicsuffix.PublicSuffixType`

## Description

<b>Do not use this class directly. For access to public-suffix information, use `com.google.common.net.InternetDomainName`.</b>

 <p>Specifies the type of a top-level domain definition.
**Since:** 23.3

## Fields

### `innerNodeCode`

**Type:** `char`

The character used for an inner node in the trie encoding

### `leafNodeCode`

**Type:** `char`

The character used for a leaf node in the trie encoding

## Constructors

### `<init>(`char` innerNodeCode, `char` leafNodeCode)`

## Methods

### `values()`

**Returns:** [`com.google.thirdparty.publicsuffix.PublicSuffixType[]`](./PublicSuffixType.md)

### `valueOf(`java.lang.String` name)`

**Returns:** [`com.google.thirdparty.publicsuffix.PublicSuffixType`](./PublicSuffixType.md)

### `getLeafNodeCode()`

**Returns:** `char`

### `getInnerNodeCode()`

**Returns:** `char`

### `fromCode(`char` code)`

**Returns:** [`com.google.thirdparty.publicsuffix.PublicSuffixType`](./PublicSuffixType.md)

Returns a PublicSuffixType of the right type according to the given code

