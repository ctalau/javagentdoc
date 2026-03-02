# Interface: `UniqueAttributesProcessor`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.UniqueAttributesProcessor`

## Description

## Methods

### `copyAttributeOnSplit(java.lang.String attrQName, ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `attrQName` (`java.lang.String`): The attribute qualified name.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element.

**Returns:** `boolean`

### `assignUniqueIDs(int startOffset, int endOffset, boolean forceGeneration)`

**Parameters:**
- `startOffset` (`int`): Start offset.
- `endOffset` (`int`): End offset.
- `forceGeneration` (`boolean`): `true` to generate ID even if the ID generation pattern list
                          does not match.

**Returns:** `void`

