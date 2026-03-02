# Class: `ExpandableTopicrefCounter`

**Package:** [`ro.sync.ecss.dita.topic.ref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dita.topic.ref.ExpandableTopicrefCounter`

## Description

## Fields

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md)

## Constructors

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md)): The author access.

## Methods

### `getNumberOfReferencesToExpand()`

**Returns:** `int`

### `countExpandedReferences()`

**Returns:** `long`

### `countExpandableReferences()`

**Returns:** `long`

### `createDitaMapRefResolver(ro.sync.ecss.extensions.api.ExtensionsBundle extensionsBundle)`

**Parameters:**
- `extensionsBundle` ([`ro.sync.ecss.extensions.api.ExtensionsBundle`](../../../extensions/api/ExtensionsBundle.md)): The extensions bundle.

**Returns:** [`ro.sync.ecss.extensions.api.DITAMapReferencesResolver`](../../../extensions/api/DITAMapReferencesResolver.md)

### `getTopicRefsLimit()`

**Returns:** `int`

