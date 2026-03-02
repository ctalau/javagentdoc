# Interface: `DITAMapReferencesResolver`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DITAMapReferencesResolver`

**Extends:** [`ro.sync.ecss.extensions.api.ValidatingAuthorReferenceResolver`](./ValidatingAuthorReferenceResolver.md)

## Description

## Fields

### `EXPAND_PSEUDO_CLASS`

**Type:** `java.lang.String`

## Methods

### `setResolveAllTopicReferences(boolean resolveAllTopicRefs)`

**Returns:** `void`

**Parameters:**
- `resolveAllTopicRefs` (`boolean`): If true, will resolve both map references and topic references.
 If false, will resolve only map references, defaults to false

### `setExpandMapReferences(boolean isExpandMapRefs)`

**Returns:** `void`

**Parameters:**
- `isExpandMapRefs` (`boolean`): `true` to expand the references.

### `getGrammarCache()`

**Returns:** `java.lang.Object`

### `setGrammarCache(java.lang.Object grammarCache)`

**Returns:** `void`

**Parameters:**
- `grammarCache` (`java.lang.Object`): The grammar cache to be used.

