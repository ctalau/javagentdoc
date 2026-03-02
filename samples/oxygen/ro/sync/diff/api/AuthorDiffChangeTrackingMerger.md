# Interface: `AuthorDiffChangeTrackingMerger`

**Package:** [`ro.sync.diff.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.api.AuthorDiffChangeTrackingMerger`

## Description

Access to the resulting document is provided through a Reader for its content.

## Methods

### `getMergeResultsReader(java.net.URL baseDocSysID, java.io.Reader baseDocReader, java.net.URL docToMergeWithSysID, java.io.Reader docToMergeWithReader, ro.sync.diff.api.DiffOptions diffOptions)`

**Returns:** `java.io.Reader`

**Parameters:**
- `baseDocSysID` (`java.net.URL`): The system ID of the base document.

                        Can be `null`, but only in case of **baseDocReader** provided.
- `baseDocReader` (`java.io.Reader`): The Reader for the base document.

                        If `null` and **baseDocSysID** provided, 
                        the reader will be created internally.

                        If both **baseDocReader** and **baseDocSysID** are `null`,  
                        a DiffException is thrown.
- `docToMergeWithSysID` (`java.net.URL`): The system ID of the document to merge with.

                               Can be `null`, but only in case of **docToMergeWithReader** provided.
- `docToMergeWithReader` (`java.io.Reader`): The Reader for the document to merge with.

                               If `null` and **docToMergeWithSysID** provided, 
                               the reader will be created internally.

                               If both **docToMergeWithReader** and **docToMergeWithSysID** 
                               are `null`, a DiffException is thrown.
- `diffOptions` ([`ro.sync.diff.api.DiffOptions`](./DiffOptions.md)): The DiffOptions used to decide which comparing algorithm and which comparing options to use.
  
                        Can be `null` in which case the comparison algorithm is chosen automatically 
                      and the default comparison options are used.

### `setNameOfAuthorOfChangeTrackingMarkers(java.lang.String authorName)`

**Returns:** `void`

This name will be post-fixed with the " [Auto Merger]" construct, in order to make a clear 
 association between the author and an imposed/fixed color used for highlighting track changes 
 when loading the merged document in Oxygen.

**Parameters:**
- `authorName` (`java.lang.String`): The name of the author of the change tracking markers created in the merged document.
                   Can be `null`, in which case the default name "Auto Merger" is used.

