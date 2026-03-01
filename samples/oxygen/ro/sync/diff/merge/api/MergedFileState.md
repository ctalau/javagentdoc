# Interface: `MergedFileState`

**Package:** [`ro.sync.diff.merge.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.merge.api.MergedFileState`

## Description

The file location is child of the the directory containing the personal changes
 (the directory specified in the **personalModifiedFilesDir** parameter of 
 DiffAndMergeTools#openMergeApplication(java.io.File, java.io.File, java.io.File, java.util.Map)) .

## Methods

### `getFile()`

**Returns:** `java.io.File`

### `getFileModifiedStatus()`

**Returns:** `ro.sync.diff.merge.api.MergedFileState.MergeStatus`

