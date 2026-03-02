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

**Parameters:**
- `resolveAllTopicRefs` (`boolean`): If true, will resolve both map references and topic references.
   If false, will resolve only map references, defaults to false

**Returns:** `void`

### `setExpandMapReferences(boolean isExpandMapRefs)`

**Parameters:**
- `isExpandMapRefs` (`boolean`): `true` to expand the references.

**Returns:** `void`

### `getGrammarCache()`

**Returns:** `java.lang.Object`

### `setGrammarCache(java.lang.Object grammarCache)`

**Parameters:**
- `grammarCache` (`java.lang.Object`): The grammar cache to be used.

**Returns:** `void`

