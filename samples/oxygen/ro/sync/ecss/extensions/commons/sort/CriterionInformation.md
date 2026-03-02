# Class: `CriterionInformation`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.CriterionInformation`

## Description

## Fields

### `keyIndex`

**Type:** `int`

For example the index of a table column inside the row element.

### `type`

**Type:** `java.lang.String`

One of #TYPE_TEXT, #TYPE_DATE or #TYPE_NUMERIC.

### `order`

**Type:** `java.lang.String`

One of #ORDER_ASCENDING or #ORDER_DESCENDING.

### `displayName`

**Type:** `java.lang.String`

For a table column this can be the text from the corresponding table head cell.

### `isInitiallyEnabled`

**Type:** `boolean`

## Constructors

### `<init>(int keyIndex, java.lang.String type, java.lang.String order, java.lang.String displayName)`

**Parameters:**
- `keyIndex` (`int`): The index in its parent of the element that corresponds to the sorting key.
- `type` (`java.lang.String`): The sorting type. One of TYPE#TEXT, TYPE#NUMERIC or TYPE#DATE.
- `order` (`java.lang.String`): The sorting order. One of ORDER#ASCENDING or ORDER#DESCENDING.
- `displayName` (`java.lang.String`): The key display name. For a table column it can be the text from the corresponding table header cell.

### `<init>(int keyIndex, java.lang.String type, java.lang.String order, java.lang.String displayName, boolean isInitiallyEnabled)`

**Parameters:**
- `keyIndex` (`int`): The index in its parent of the element that corresponds to the sorting key.
- `type` (`java.lang.String`): The sorting type. One of TYPE#TEXT, TYPE#NUMERIC or TYPE#DATE.
- `order` (`java.lang.String`): The sorting order. One of ORDER#ASCENDING or ORDER#DESCENDING.
- `displayName` (`java.lang.String`): The key display name. For a table column it can be the text from the corresponding table header cell.
- `isInitiallyEnabled` (`boolean`): `true` if this criterion should be initially enabled.

### `<init>(int keyIndex, java.lang.String displayName)`

**Parameters:**
- `keyIndex` (`int`): The index in its parent of the element that corresponds to the sorting key.
- `displayName` (`java.lang.String`): The key display name. For a table column it can be the text from the corresponding table header cell.

## Methods

### `getDisplayName()`

**Returns:** `java.lang.String`

### `getKeyIndex()`

**Returns:** `int`

### `getType()`

**Returns:** `java.lang.String`

### `getOrder()`

**Returns:** `java.lang.String`

### `isInitiallySelected()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

