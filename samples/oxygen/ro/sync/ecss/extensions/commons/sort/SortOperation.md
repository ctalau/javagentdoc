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

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `getSortInformation(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1, java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation> arg2, int[] arg3)`

**Returns:** [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `arg2` (`java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`)
- `arg3` (`int[]`)

### `createNodesComparator(java.util.Locale arg0, ro.sync.ecss.extensions.api.AuthorOperationException[] arg1)`

**Returns:** `java.util.Comparator<ro.sync.ecss.extensions.commons.sort.SortOperation.SortableFragment>`

**Parameters:**
- `arg0` (`java.util.Locale`)
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md))

### `createLocale(java.lang.String arg0)`

**Returns:** `java.util.Locale`

**Parameters:**
- `arg0` (`java.lang.String`)

### `canBeSorted(ro.sync.ecss.extensions.api.node.AuthorElement arg0, int[] arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `arg1` (`int[]`)

### `getSelectedNonIgnoredChildrenInterval(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Returns:** `int[]`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

### `forceSortAll()`

**Returns:** `boolean`

### `getSelectionElementsIndices(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg0, int arg1, int arg2)`

**Returns:** `int[]`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg1` (`int`)
- `arg2` (`int`)

### `getNonIgnoredChildren(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

### `getSortParent(int arg0, ro.sync.ecss.extensions.api.AuthorAccess arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

**Parameters:**
- `arg0` (`int`)
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

### `isIgnored(ro.sync.ecss.extensions.api.node.AuthorNode arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `getSortKeysValues(ro.sync.ecss.extensions.api.node.AuthorNode arg0, ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation arg1)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `arg1` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md))

### `getSortCriteria(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getTextContentToSort(ro.sync.ecss.extensions.api.node.AuthorNode arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `getHelpPageID()`

**Returns:** `java.lang.String`

