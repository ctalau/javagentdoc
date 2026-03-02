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

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `action` (`ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote`): The promote/demote action.

**Returns:** `void`

### `getSectionNodeToProcess(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)

### `getInsertionOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement sectionNodeToProcess, ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote action)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `sectionNodeToProcess` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The section node that should be promoted/demoted.
- `action` (`ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote`): The promote/demote action.

**Returns:** `int`

### `getInsertionOffsetForPromote(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement sectionNodeToProcess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `sectionNodeToProcess` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The section node that should be promoted.

**Returns:** `int`

### `getInsertionOffsetForDemote(ro.sync.ecss.extensions.api.node.AuthorElement sectionNodeToProcess)`

**Parameters:**
- `sectionNodeToProcess` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The section node that should be demoted.

**Returns:** `int`

### `changeSectNodeName(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement authorElement, ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote action)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `authorElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The current author element.
- `action` (`ro.sync.ecss.extensions.docbook.PromoteDemoteSectionUtil.PromoteDemote`): The promote/demote action.

**Returns:** `void`

### `nodeContainsSect5Element(ro.sync.ecss.extensions.api.AuthorElementBaseInterface sectionElement)`

**Parameters:**
- `sectionElement` ([`ro.sync.ecss.extensions.api.AuthorElementBaseInterface`](../api/AuthorElementBaseInterface.md)): The sect node.

**Returns:** `boolean`

