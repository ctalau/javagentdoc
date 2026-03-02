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

### `processPromoteDemote(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote action)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `action` (`ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote`): The promote/demote action.

### `getSectionNodeToProcess(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.

### `getInsertionOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement sectionNodeToProcess, ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote action)`

**Returns:** `int`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `sectionNodeToProcess` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The section node that should be promoted/demoted.
- `action` (`ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote`): The promote/demote action.

### `getInsertionOffsetForPromote(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement sectionNodeToProcess)`

**Returns:** `int`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `sectionNodeToProcess` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The section node that should be promoted.

### `getInsertionOffsetForDemote(ro.sync.ecss.extensions.api.node.AuthorElement sectionNodeToProcess)`

**Returns:** `int`

**Parameters:**
- `sectionNodeToProcess` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The section node that should be demoted.

### `changeSectNodeName(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement authorElement, ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote action)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `authorElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The current author element.
- `action` (`ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote`): The promote/demote action.

### `nodeContainsSect5Element(ro.sync.ecss.extensions.api.AuthorElementBaseInterface sectionElement)`

**Returns:** `boolean`

**Parameters:**
- `sectionElement` ([`ro.sync.ecss.extensions.api.AuthorElementBaseInterface`](../api/AuthorElementBaseInterface.md)): The sect node.

