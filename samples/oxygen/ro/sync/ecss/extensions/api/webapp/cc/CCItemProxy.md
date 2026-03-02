# Class: `CCItemProxy`

**Package:** [`ro.sync.ecss.extensions.api.webapp.cc`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`

**Implements:** [`ro.sync.ecss.contentcompletion.ccitems.AuthorCCItemTypes`](../../../../contentcompletion/ccitems/AuthorCCItemTypes.md)

## Description

The item has a type, a name and a path for an icon to be displayed to the 
 user that makes the selection.

## Fields

### `NORMAL_SORT_PRIORITY`

**Type:** `int`

### `SPLIT_ITEM_PRIORITY`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `getDisplayName()`

**Returns:** `java.lang.String`

### `getIconPath()`

**Returns:** `java.lang.String`

### `getType()`

**Returns:** `int`

### `getDescription()`

**Returns:** `java.lang.String`

### `getActionId()`

**Returns:** `java.lang.String`

### `getAlias()`

**Returns:** `java.lang.String`

### `isUseActionName()`

**Returns:** `boolean`

### `getSortPriority()`

By default it is #NORMAL_SORT_PRIORITY for all 
 items except for "Split"-type entries which have a priority of #SPLIT_ITEM_PRIORITY.

**Returns:** `int`

### `getElementProxy()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)

