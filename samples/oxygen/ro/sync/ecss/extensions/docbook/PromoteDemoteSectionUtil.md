# Class: `PromoteDemoteSectionUtil`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil`

## Description

## Fields

### `NESTED_SECTION_ELEMENT_NO_5`

**Type:** `java.lang.String`

### `NESTED_SECTION_NAME`

**Type:** `java.lang.String`

### `SECTION_NAME`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

### `DOCBOOK5_NAMESPACE`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `processPromoteDemote([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote` action)`

**Returns:** `void`

### `getSectionNodeToProcess([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)

### `getInsertionOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) sectionNodeToProcess, `ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote` action)`

**Returns:** `int`

### `getInsertionOffsetForPromote([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) sectionNodeToProcess)`

**Returns:** `int`

### `getInsertionOffsetForDemote([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) sectionNodeToProcess)`

**Returns:** `int`

### `changeSectNodeName([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) authorElement, `ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote` action)`

**Returns:** `void`

### `nodeContainsSect5Element([`ro.sync.ecss.extensions.api.AuthorElementBaseInterface`](../api/AuthorElementBaseInterface.md) sectionElement)`

**Returns:** `boolean`

