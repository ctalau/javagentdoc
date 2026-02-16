# Class: `TrieParser`

**Package:** [`com.google.thirdparty.publicsuffix`](README.md)

**Fully Qualified Name:** `com.google.thirdparty.publicsuffix.TrieParser`

## Description

Parser for a map of reversed domain names stored as a serialized radix tree.

## Fields

### `DIRECT_JOINER`

**Type:** [`com.google.common.base.Joiner`](../../common/base/Joiner.md)

## Constructors

### `<init>()`

## Methods

### `parseTrie(`java.lang.CharSequence[]` encodedChunks)`

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

Parses a serialized trie representation of a map of reversed public suffixes into an immutable
 map of public suffixes. The encoded trie string may be broken into multiple chunks to avoid the
 64k limit on string literal size. In-memory strings can be much larger (2G).

### `parseFullString(`java.lang.String` encoded)`

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap.md)

### `doParseTrieToBuilder(`java.util.Deque<java.lang.CharSequence>` stack, `java.lang.CharSequence` encoded, `int` start, [`com.google.common.collect.ImmutableMap.Builder<java.lang.String,com.google.thirdparty.publicsuffix.PublicSuffixType>`](../../common/collect/ImmutableMap/Builder.md) builder)`

**Returns:** `int`

Parses a trie node and returns the number of characters consumed.
@param stack The prefixes that precede the characters represented by this node. Each entry of
     the stack is in reverse order.
@param encoded The serialized trie.
@param start An index in the encoded serialized trie to begin reading characters from.
@param builder A map builder to which all entries will be added.
@return The number of characters consumed from `encoded`.

### `reverse(`java.lang.CharSequence` s)`

**Returns:** `java.lang.CharSequence`

