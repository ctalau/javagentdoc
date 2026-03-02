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

### `parseTrie(CharSequence[] encodedChunks)`

The encoded trie string may be broken into multiple chunks to avoid the
 64k limit on string literal size. In-memory strings can be much larger (2G).

**Parameters:**
- `encodedChunks` (`java.lang.CharSequence[]`)

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

### `parseFullString(String encoded)`

**Parameters:**
- `encoded` (`java.lang.String`)

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

### `doParseTrieToBuilder(Deque<CharSequence> stack, CharSequence encoded, int start, ImmutableMap.Builder<String,PublicSuffixType> builder)`

**Parameters:**
- `stack` (`java.util.Deque<java.lang.CharSequence>`): The prefixes that precede the characters represented by this node. Each entry of
       the stack is in reverse order.
- `encoded` (`java.lang.CharSequence`): The serialized trie.
- `start` (`int`): An index in the encoded serialized trie to begin reading characters from.
- `builder` (`com.google.common.collect.ImmutableMap.Builder<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`): A map builder to which all entries will be added.

**Returns:** `int`

### `reverse(CharSequence s)`

**Parameters:**
- `s` (`java.lang.CharSequence`)

**Returns:** `java.lang.CharSequence`

