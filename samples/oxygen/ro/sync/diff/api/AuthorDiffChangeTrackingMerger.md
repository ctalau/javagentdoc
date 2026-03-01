# Interface: `AuthorDiffChangeTrackingMerger`

**Package:** [`ro.sync.diff.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.api.AuthorDiffChangeTrackingMerger`

## Description

Access to the resulting document is provided through a Reader for its content.

## Methods

### `getMergeResultsReader(`java.net.URL` baseDocSysID, `java.io.Reader` baseDocReader, `java.net.URL` docToMergeWithSysID, `java.io.Reader` docToMergeWithReader, [`ro.sync.diff.api.DiffOptions`](./DiffOptions.md) diffOptions)`

**Returns:** `java.io.Reader`

### `setNameOfAuthorOfChangeTrackingMarkers(`java.lang.String` authorName)`

**Returns:** `void`

This name will be post-fixed with the " [Auto Merger]" construct, in order to make a clear 
 association between the author and an imposed/fixed color used for highlighting track changes 
 when loading the merged document in Oxygen.

