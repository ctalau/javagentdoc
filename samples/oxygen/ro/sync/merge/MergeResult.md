# Class: `MergeResult`

**Package:** [`ro.sync.merge`](README.md)

**Fully Qualified Name:** `ro.sync.merge.MergeResult`

## Description

## Fields

### `mergedString`

**Type:** `java.lang.String`

### `resultType`

**Type:** `ro.sync.merge.MergeResult.ResultType`

### `mergingOccurred`

**Type:** `boolean`

## Constructors

### `<init>(ro.sync.merge.MergeResult.ResultType resultType, java.lang.String mergedString)`

**Parameters:**
- `resultType` (`ro.sync.merge.MergeResult.ResultType`): The type of the merge result.
- `mergedString` (`java.lang.String`): The merged string.

### `<init>(ro.sync.merge.MergeResult.ResultType resultType, java.lang.String mergedString, java.lang.Boolean mergingOccurred)`

**Parameters:**
- `resultType` (`ro.sync.merge.MergeResult.ResultType`): The type of the merge result.
- `mergedString` (`java.lang.String`): The merged string.
- `mergingOccurred` (`java.lang.Boolean`): Flag telling whether merging occurred or not. 
   If the two left|right files were identical `mergingOccurred` will be false;

### `<init>()`

## Methods

### `mergingOccurred()`

**Returns:** `boolean`

### `getMergedString()`

**Returns:** `java.lang.String`

### `setMergedString(java.lang.String mergedString)`

**Parameters:**
- `mergedString` (`java.lang.String`): The new merged string.

**Returns:** `void`

### `getResultType()`

**Returns:** `ro.sync.merge.MergeResult.ResultType`

### `setResultType(ro.sync.merge.MergeResult.ResultType result)`

**Parameters:**
- `result` (`ro.sync.merge.MergeResult.ResultType`): The new value of the result type.

**Returns:** `void`

