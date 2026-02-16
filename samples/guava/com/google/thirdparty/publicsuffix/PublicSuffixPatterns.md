# Class: `PublicSuffixPatterns`

**Package:** [`com.google.thirdparty.publicsuffix`](README.md)

**Fully Qualified Name:** `com.google.thirdparty.publicsuffix.PublicSuffixPatterns`

## Description

<b>Do not use this class directly. For access to public-suffix information, use `com.google.common.net.InternetDomainName`.</b>

 <p>A generated static class containing public members which provide domain name patterns used in
 determining whether a given domain name is an effective top-level domain (public suffix).

 <p>Because this class is used in GWT, the data members are stored in a space-efficient manner.
 See `TrieParser`.
**Since:** 16.0

## Fields

### `EXACT`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

If a hostname is contained as a key in this map, it is a public suffix.

### `UNDER`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

If a hostname is not a key in the EXCLUDE map, and if removing its leftmost component results
 in a name which is a key in this map, it is a public suffix.

### `EXCLUDED`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

The elements in this map would pass the UNDER test, but are known not to be public suffixes and
 are thus excluded from consideration. Since it refers to elements in UNDER of the same type,
 the type is actually not important here. The map is simply used for consistency reasons.

## Constructors

### `<init>()`

