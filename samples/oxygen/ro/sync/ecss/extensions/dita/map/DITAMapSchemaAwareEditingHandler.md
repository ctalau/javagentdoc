# Class: `DITAMapSchemaAwareEditingHandler`

**Package:** [`ro.sync.ecss.extensions.dita.map`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.DITAMapSchemaAwareEditingHandler`

**Extends:** [`ro.sync.ecss.extensions.dita.DITASchemaAwareEditingHandler`](../DITASchemaAwareEditingHandler.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `handlePasteFragment(int offset, AuthorDocumentFragment[] fragmentsToInsert, int actionId, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md))
- `actionId` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** `boolean`

### `areTopicRefsPasted(AuthorDocumentFragment[] fragmentsToInsert)`

**Parameters:**
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): Fragments to insert

**Returns:** `boolean`

### `insertFragmentsIfValid(AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, int insertionOffset, AuthorSchemaManager authorSchemaManager)`

**Parameters:**
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): The fragmwnts to insert
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access
- `insertionOffset` (`int`): Insertion offset
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../../api/AuthorSchemaManager.md)): Schema manager

**Returns:** `void`

