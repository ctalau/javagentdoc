# Interface: `DiffAndMergeTools`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.DiffAndMergeTools`

## Description

## Methods

### `openDiffFilesApplication(`java.lang.String` leftLabelText, `java.net.URL` leftURL, `java.lang.String` rightLabelText, `java.net.URL` rightURL)`

**Returns:** `java.lang.Object`

The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

### `openDiffFilesApplication(`java.net.URL` leftURL, `java.net.URL` rightURL)`

**Returns:** `java.lang.Object`

The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

### `openDiffFilesApplication(`java.net.URL` leftURL, `java.net.URL` rightURL, `java.net.URL` ancestorURL)`

**Returns:** `java.lang.Object`

If the ancestor URL is specified the comparison will be performed in three-way mode. The left
 and right URLs will be compared relatively to the ancestor (base) URL.
 If the ancestor URL is `null` the comparison will be performed in two-way mode.
  
 The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

### `openDiffFilesApplication(`java.lang.String` leftLabelText, `java.net.URL` leftURL, `java.lang.String` rightLabelText, `java.net.URL` rightURL, `java.net.URL` ancestorURL, `boolean` showAncestorURLPanel)`

**Returns:** `java.lang.Object`

If the ancestor URL is specified the comparison will be performed in three-way mode. The left
 and right URLs will be compared relatively to the ancestor (base) URL.
 If the ancestor URL is `null` the comparison will be performed in two-way mode.
  
 The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

### `openMergeApplication(`java.io.File` baseDir, `java.io.File` personalModifiedFilesDir, `java.io.File` externalModifiedFilesDir, `java.util.Map<java.lang.String,java.lang.String>` mergeOptions)`

**Returns:** `java.util.List<ro.sync.diff.merge.api.MergedFileState>`

These differences are obtained as a result of a three-way 
 comparison between:
 

 - **the base files** - the ones located in the **baseDir** directory. 
 These are the initial files, before any changes were made by your or by others.

 - **the personal modified files** - the ones located in the **personalModifiedFilesDir** directory.
 These are actually the base files after they were modified by you. These files will be opened in the left side of the comparison tool.

 OBS: The files are modified during the merging.
 

 - **the external modified files** - the ones located in the **externalModifiedFilesDir** directory.
 These are actually the base files after they were modified by others. These files will be opened in the right side of the comparison tool.

 These files are not touched by the merging.
 

 

 For example, let's say that both **baseDir** and **personalModifiedFilesDir** contain a file named `flowers.dita`, 
 but the file is missing from the **externalModifiedFilesDir** folder. 
 This means that the dialog will present a delete file modification. If you accepted this modification, the `flowers.dita`
 file from the **personalModifiedFilesDir** directory will be removed. When closing the dialog by pressing "OK",
 this method will return a list containing a single MergedFileState object, with MergeStatus#DELETED state, 
 pointing to the `flowers.dita` file from **personalModifiedFilesDir**.

### `openPreviewDialog(`java.lang.String` title, `java.lang.String` previewButtonName, `java.util.LinkedHashMap<java.net.URL,java.net.URL>` resourcesMap)`

**Returns:** `java.util.List<java.net.URL>`

The resources are presented in the order in which they are placed in the map.

### `openPreviewDialog(`java.lang.String` title, `java.lang.String` previewButtonName, `java.lang.String` operationDescriptionLabelText, `java.lang.String` leftSideLabelText, `java.lang.String` rightSideLabelText, `java.util.LinkedHashMap<java.net.URL,java.net.URL>` resourcesMap)`

**Returns:** `java.util.List<java.net.URL>`

The resources are presented in the order in which they are placed in the map.

### `openMergeApplication(`java.lang.String` dialogTitle, `java.lang.String` applyButtonText, `boolean` applyAllChangesInitialy, `java.lang.String` leftLabelText, `java.net.URL` leftURL, `boolean` leftURLEditable, `boolean` leftURLModified, `java.lang.String` rightLabelText, `java.net.URL` rightURL, `boolean` rightEditorEditable, `boolean` rightURLModified, `java.net.URL` ancestorURL)`

**Returns:** `boolean`

The tool is presented in a modal dialog.
 The content in the right part is read only and can be merged to the left part.  
 
 If the ancestor URL is specified the comparison will be performed in three-way mode. The left
 and right URLs will be compared relatively to the ancestor (base) URL.
 If the ancestor URL is `null` the comparison will be performed in two-way mode.
  
 The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

