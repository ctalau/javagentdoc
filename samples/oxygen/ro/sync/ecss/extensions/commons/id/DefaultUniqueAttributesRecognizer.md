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

### `<init>(`java.lang.String` idAttrQname)`

## Methods

### `copyAttributeOnSplit(`java.lang.String` attrQName, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `activated([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `deactivated([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `getDefaultOptions()`

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `getDefaultOptionsXMLResourceName()`

**Returns:** `java.lang.String`

### `isAutoIDGenerationActive()`

**Returns:** `boolean`

### `getGenerateIDAttributeQName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String[]` elemsWithAutoGeneration, `boolean` forceGeneration)`

**Returns:** `java.lang.String`

### `generateUniqueIDFor(`java.lang.String` idGenerationPattern, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `java.lang.String`

### `assignUniqueIDs(`int` startOffset, `int` endOffset, `boolean` forceGeneration)`

**Returns:** `void`

### `generateUniqueIDs([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) currentNode, `int` startSel, `int` endSel, `java.lang.String` idGenerationPattern, `java.lang.String[]` elementsToGenerateFor, `boolean` forceGeneration, `java.util.List<ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer.AttributeSetInfo>` attrsToGenerate)`

**Returns:** `void`

### `generateUniqueIdForNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `java.lang.String` idGenerationPattern, `java.lang.String[]` elementsToGenerateFor, `boolean` forceGeneration)`

**Returns:** `ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer.AttributeSetInfo`

### `setIDs(`java.util.List<ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer.AttributeSetInfo>` idsList)`

**Returns:** `void`

### `getGenerateIDElementsInfo()`

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `process([`ro.sync.ecss.extensions.api.content.ClipboardFragmentInformation`](../../api/content/ClipboardFragmentInformation.md) fragmentInformation)`

**Returns:** `void`

### `preserveIDsWhenPastingBetweenResources(`int` fragmentPurpose)`

**Returns:** `boolean`

### `filterIDAttributes(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` contentNodes)`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

