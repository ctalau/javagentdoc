# Class: `DefaultUniqueAttributesRecognizer`

**Package:** [`ro.sync.ecss.extensions.commons.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer`

**Implements:** [`ro.sync.ecss.extensions.api.UniqueAttributesRecognizer`](../../api/UniqueAttributesRecognizer.md), [`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](../../api/content/ClipboardFragmentProcessor.md)

## Description

## Fields

### `idAttrQname`

**Type:** `java.lang.String`

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)

### `defaultOptions`

**Type:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

### `<init>(java.lang.String idAttrQname)`

**Parameters:**
- `idAttrQname` (`java.lang.String`): The ID attribute qname

## Methods

### `copyAttributeOnSplit(java.lang.String attrQName, ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `boolean`

**Parameters:**
- `attrQName` (`java.lang.String`)
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

### `activated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

### `getDefaultOptions()`

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `getDefaultOptionsXMLResourceName()`

**Returns:** `java.lang.String`

### `isAutoIDGenerationActive()`

**Returns:** `boolean`

### `getGenerateIDAttributeQName(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String[] elemsWithAutoGeneration, boolean forceGeneration)`

**Returns:** `java.lang.String`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The current element.
- `elemsWithAutoGeneration` (`java.lang.String[]`): The array of elements for which generation is activated
- `forceGeneration` (`boolean`): Force ID generation if there is no selection.

### `generateUniqueIDFor(java.lang.String idGenerationPattern, ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `java.lang.String`

**Parameters:**
- `idGenerationPattern` (`java.lang.String`): The pattern for id generation.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element

### `assignUniqueIDs(int startOffset, int endOffset, boolean forceGeneration)`

**Returns:** `void`

**Parameters:**
- `startOffset` (`int`)
- `endOffset` (`int`)
- `forceGeneration` (`boolean`)

### `generateUniqueIDs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode currentNode, int startSel, int endSel, java.lang.String idGenerationPattern, java.lang.String[] elementsToGenerateFor, boolean forceGeneration, java.util.List<ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer.AttributeSetInfo> attrsToGenerate)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The current node.
- `startSel` (`int`): The start offset limit
- `endSel` (`int`): The end offset limit.
- `idGenerationPattern` (`java.lang.String`): The pattern for id generation .
- `elementsToGenerateFor` (`java.lang.String[]`): The elements for which IDs must be generated.
- `forceGeneration` (`boolean`): `true` to generate ID even if the ID generation pattern list
                        does not match.
- `attrsToGenerate` (`java.util.List<ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer.AttributeSetInfo>`): Collector for the generated attributes

### `generateUniqueIdForNode(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String idGenerationPattern, java.lang.String[] elementsToGenerateFor, boolean forceGeneration)`

**Returns:** `ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer.AttributeSetInfo`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `idGenerationPattern` (`java.lang.String`): The pattern for id generation .
- `elementsToGenerateFor` (`java.lang.String[]`): The elements for which IDs must be generated.
- `forceGeneration` (`boolean`): `true` to generate ID even if the ID generation pattern list
                                 does not match.

### `setIDs(java.util.List<ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer.AttributeSetInfo> idsList)`

**Returns:** `void`

**Parameters:**
- `idsList` (`java.util.List<ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer.AttributeSetInfo>`): The list with ID attributes to be set.

### `getGenerateIDElementsInfo()`

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `process(ro.sync.ecss.extensions.api.content.ClipboardFragmentInformation fragmentInformation)`

**Returns:** `void`

**Parameters:**
- `fragmentInformation` ([`ro.sync.ecss.extensions.api.content.ClipboardFragmentInformation`](../../api/content/ClipboardFragmentInformation.md))

### `preserveIDsWhenPastingBetweenResources(int fragmentPurpose)`

**Returns:** `boolean`

**Parameters:**
- `fragmentPurpose` (`int`): The fragment purpose. On of the AuthorSchemaAwareEditingHandler purposes.

### `filterIDAttributes(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> contentNodes)`

**Returns:** `void`

**Parameters:**
- `contentNodes` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): The nodes.

### `getDescription()`

**Returns:** `java.lang.String`

