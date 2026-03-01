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

### `<init>(`java.lang.String` arg0, `java.lang.String` arg1)`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) arg1)`

**Returns:** `void`

### `getSortInformation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) arg1, `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>` arg2, `int[]` arg3)`

**Returns:** [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md)

### `createNodesComparator(`java.util.Locale` arg0, [`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md) arg1)`

**Returns:** `java.util.Comparator<ro.sync.ecss.extensions.commons.sort.SortOperation.SortableFragment>`

### `createLocale(`java.lang.String` arg0)`

**Returns:** `java.util.Locale`

### `canBeSorted([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) arg0, `int[]` arg1)`

**Returns:** `void`

### `getSelectedNonIgnoredChildrenInterval([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) arg0)`

**Returns:** `int[]`

### `forceSortAll()`

**Returns:** `boolean`

### `getSelectionElementsIndices(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg0, `int` arg1, `int` arg2)`

**Returns:** `int[]`

### `getNonIgnoredChildren([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `getSortParent(`int` arg0, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `isIgnored([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) arg0)`

**Returns:** `boolean`

### `getSortKeysValues([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) arg0, [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md) arg1)`

**Returns:** `java.lang.String[]`

### `getSortCriteria([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getTextContentToSort([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) arg0)`

**Returns:** `java.lang.String`

### `getHelpPageID()`

**Returns:** `java.lang.String`

