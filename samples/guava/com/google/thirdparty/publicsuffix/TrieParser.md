# Class: `TrieParser`

**Package:** [`com.google.thirdparty.publicsuffix`](README.md)

**Fully Qualified Name:** `com.google.thirdparty.publicsuffix.TrieParser`

## Description

## Fields

### `DIRECT_JOINER`

**Type:** [`com.google.common.base.Joiner`](../../common/base/Joiner.md)

## Constructors

### `<init>()`

## Methods

### `parseTrie(java.lang.CharSequence[] encodedChunks)`

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

The encoded trie string may be broken into multiple chunks to avoid the
 64k limit on string literal size. In-memory strings can be much larger (2G).

**Parameters:**
- `encodedChunks` (`java.lang.CharSequence[]`)

### `parseFullString(java.lang.String encoded)`

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

**Parameters:**
- `encoded` (`java.lang.String`)

### `doParseTrieToBuilder(java.util.Deque<java.lang.CharSequence> stack, java.lang.CharSequence encoded, int start, com.google.common.collect.ImmutableMap.Builder<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType> builder)`

**Returns:** `int`

**Parameters:**
- `stack` (`java.util.Deque<java.lang.CharSequence>`): The prefixes that precede the characters represented by this node. Each entry of
     the stack is in reverse order.
- `encoded` (`java.lang.CharSequence`): The serialized trie.
- `start` (`int`): An index in the encoded serialized trie to begin reading characters from.
- `builder` (`com.google.common.collect.ImmutableMap.Builder<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`): A map builder to which all entries will be added.

### `reverse(java.lang.CharSequence s)`

**Returns:** `java.lang.CharSequence`

**Parameters:**
- `s` (`java.lang.CharSequence`)

