# Class: `DiffInfo`

**Package:** [`ro.sync.diff.factory`](README.md)

**Fully Qualified Name:** `ro.sync.diff.factory.DiffInfo`

**Implements:** `ro.sync.options.PersistentObject`

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `algorithm`

**Type:** `int`

### `algorithm3Way`

**Type:** `int`

### `ignorePI`

**Type:** `boolean`

### `ignoreComments`

**Type:** `boolean`

### `ignoreCDATA`

**Type:** `boolean`

### `ignoreWhitespaces`

**Type:** `boolean`

### `ignoreDOCTYPE`

**Type:** `boolean`

### `ignoreText`

**Type:** `boolean`

### `ignoreAttributesOrder`

**Type:** `boolean`

### `ignorePrefixes`

**Type:** `boolean`

### `ignoreNamespaces`

**Type:** `boolean`

### `ignoreNamespaceDeclarations`

**Type:** `boolean`

### `mergeAdjacentDifferences`

**Type:** `boolean`

### `markEndTagsAsDifferent`

**Type:** `boolean`

### `maxNoOfDiffs`

**Type:** `int`

### `maxNoOfDiffs3Way`

**Type:** `int`

### `ignoreEntities`

**Type:** `boolean`

### `ignoreStateOfEmptyElements`

**Type:** `boolean`

### `ignoreNodesByXPath`

**Type:** `boolean`

### `defaultXPath`

**Type:** `java.lang.String`

## Constructors

### `<init>(`int` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5, `boolean` arg6, `boolean` arg7, `boolean` arg8, `boolean` arg9, `boolean` arg10, `boolean` arg11, `boolean` arg12, `boolean` arg13, `boolean` arg14, `ro.sync.diff.factory.DiffInfo._b` arg15, `boolean` arg16, `java.lang.String` arg17)`

### `<init>(`int` arg0, `int` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5, `boolean` arg6, `boolean` arg7, `boolean` arg8, `boolean` arg9, `boolean` arg10, `boolean` arg11, `boolean` arg12, `boolean` arg13, `boolean` arg14, `boolean` arg15, `ro.sync.diff.factory.DiffInfo._b` arg16, `ro.sync.diff.factory.DiffInfo._b` arg17, `boolean` arg18, `java.lang.String` arg19)`

### `<init>([`ro.sync.diff.api.DiffOptions`](../api/DiffOptions.md) arg0)`

### `<init>()`

## Methods

### `getThreeWayAlgorithm(`int` arg0)`

**Returns:** `int`

### `clone()`

**Returns:** `java.lang.Object`

### `toString()`

**Returns:** `java.lang.String`

### `getAsDiffOptions(`boolean` arg0)`

**Returns:** [`ro.sync.diff.api.DiffOptions`](../api/DiffOptions.md)

### `checkValid()`

**Returns:** `void`

### `getNotPersistentFieldNames()`

**Returns:** `java.lang.String[]`

