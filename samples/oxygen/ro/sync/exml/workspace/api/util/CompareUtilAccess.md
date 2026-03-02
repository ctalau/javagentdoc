# Interface: `CompareUtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.CompareUtilAccess`

## Description

## Methods

### `threeWayAutoMerge(java.lang.String ancestor, java.lang.String left, java.lang.String right, ro.sync.merge.MergeConflictResolutionMethods conflictResolutionMethod)`

**Parameters:**
- `ancestor` (`java.lang.String`): The original file string which has been modified into left and right.
- `left` (`java.lang.String`): The left version of the file string, the one with "our" changes.
- `right` (`java.lang.String`): The right version of the file string, the one with "others" changes.
- `conflictResolutionMethod` ([`ro.sync.merge.MergeConflictResolutionMethods`](../../../../merge/MergeConflictResolutionMethods.md)): The conflict resolution method to use.

**Returns:** [`ro.sync.merge.MergeResult`](../../../../merge/MergeResult.md)

### `createDiffPerformer()`

**Returns:** [`ro.sync.diff.api.DifferencePerformer`](../../../../diff/api/DifferencePerformer.md)

### `createAuthorDiffPerformer()`

**Returns:** [`ro.sync.diff.api.AuthorDifferencePerformer`](../../../../diff/api/AuthorDifferencePerformer.md)

