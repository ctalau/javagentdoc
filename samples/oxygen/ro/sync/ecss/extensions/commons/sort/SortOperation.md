# Class: `SortOperation`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.SortOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Fields

### `SORTING_SUPPORT_PAGE_ID`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

### `COLUMN`

**Type:** `java.lang.String`

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)

### `sortInformation`

**Type:** [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md)

### `selElementsString`

**Type:** `java.lang.String`

### `allElementsString`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.ArgumentsMap arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getSortInformation(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1, java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation> arg2, int[] arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `arg2` (`java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`)
- `arg3` (`int[]`)

**Returns:** [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md)

### `createNodesComparator(java.util.Locale arg0, ro.sync.ecss.extensions.api.AuthorOperationException[] arg1)`

**Parameters:**
- `arg0` (`java.util.Locale`)
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md))

**Returns:** `java.util.Comparator<ro.sync.ecss.extensions.commons.sort.SortOperation.SortableFragment>`

### `createLocale(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.util.Locale`

### `canBeSorted(ro.sync.ecss.extensions.api.node.AuthorElement arg0, int[] arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `arg1` (`int[]`)

**Returns:** `void`

### `getSelectedNonIgnoredChildrenInterval(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `int[]`

### `forceSortAll()`

**Returns:** `boolean`

### `getSelectionElementsIndices(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg1` (`int`)
- `arg2` (`int`)

**Returns:** `int[]`

### `getNonIgnoredChildren(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `getSortParent(int arg0, ro.sync.ecss.extensions.api.AuthorAccess arg1)`

**Parameters:**
- `arg0` (`int`)
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `isIgnored(ro.sync.ecss.extensions.api.node.AuthorNode arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getSortKeysValues(ro.sync.ecss.extensions.api.node.AuthorNode arg0, ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `arg1` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md))

**Returns:** `java.lang.String[]`

### `getSortCriteria(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getTextContentToSort(ro.sync.ecss.extensions.api.node.AuthorNode arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `getHelpPageID()`

**Returns:** `java.lang.String`

