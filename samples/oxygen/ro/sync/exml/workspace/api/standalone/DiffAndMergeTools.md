# Interface: `DiffAndMergeTools`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.DiffAndMergeTools`

## Description

## Methods

### `openDiffFilesApplication(java.lang.String leftLabelText, java.net.URL leftURL, java.lang.String rightLabelText, java.net.URL rightURL)`

The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

**Parameters:**
- `leftLabelText` (`java.lang.String`): The left - side label text. When `null`, 
   the leftURL value is presented in the files comparison tool. When specified, it is presented instead of the leftURL value.
- `leftURL` (`java.net.URL`): The left-side URL to diff. Can be `null`.
- `rightLabelText` (`java.lang.String`): The right - side label text. When `null`, 
   the rightURL value is presented in the files comparison tool. When specified, it is presented instead of the rightURL value.
- `rightURL` (`java.net.URL`): The right-side URL to diff. Can be `null`.

**Returns:** `java.lang.Object`

### `openDiffFilesApplication(java.net.URL leftURL, java.net.URL rightURL)`

The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

**Parameters:**
- `leftURL` (`java.net.URL`): The left-side URL to diff. Can be `null`.
- `rightURL` (`java.net.URL`): The right-side URL to diff. Can be `null`.

**Returns:** `java.lang.Object`

### `openDiffFilesApplication(java.net.URL leftURL, java.net.URL rightURL, java.net.URL ancestorURL)`

If the ancestor URL is specified the comparison will be performed in three-way mode. The left
 and right URLs will be compared relatively to the ancestor (base) URL.
 If the ancestor URL is `null` the comparison will be performed in two-way mode.
  
 The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

**Parameters:**
- `leftURL` (`java.net.URL`): The left-side URL to diff. Can be `null`.
- `rightURL` (`java.net.URL`): The right-side URL to diff. Can be `null`.
- `ancestorURL` (`java.net.URL`): The ancestor (base) URL to diff. Can be `null`.

**Returns:** `java.lang.Object`

### `openDiffFilesApplication(java.lang.String leftLabelText, java.net.URL leftURL, java.lang.String rightLabelText, java.net.URL rightURL, java.net.URL ancestorURL, boolean showAncestorURLPanel)`

If the ancestor URL is specified the comparison will be performed in three-way mode. The left
 and right URLs will be compared relatively to the ancestor (base) URL.
 If the ancestor URL is `null` the comparison will be performed in two-way mode.
  
 The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

**Parameters:**
- `leftLabelText` (`java.lang.String`): The left - side label text. When `null`, 
   the leftURL value is presented in the files comparison tool. When specified, it is presented instead of the leftURL value.
- `leftURL` (`java.net.URL`): The left-side URL to diff. Can be `null`.
- `rightLabelText` (`java.lang.String`): The right - side label text. When `null`, 
   the rightURL value is presented in the files comparison tool. When specified, it is presented instead of the rightURL value.
- `rightURL` (`java.net.URL`): The right-side URL to diff. Can be `null`.
- `ancestorURL` (`java.net.URL`): The ancestor (base) URL to diff. Can be `null`.
- `showAncestorURLPanel` (`boolean`): True if should show the ancestor url panel in a three way comparison

**Returns:** `java.lang.Object`

### `openMergeApplication(java.io.File baseDir, java.io.File personalModifiedFilesDir, java.io.File externalModifiedFilesDir, java.util.Map<java.lang.String,java.lang.String> mergeOptions)`

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

**Parameters:**
- `baseDir` (`java.io.File`): The directory containing initial, unaltered files.
- `personalModifiedFilesDir` (`java.io.File`): The directory containing the files modified by you. 
   These files are modified during the merging.
- `externalModifiedFilesDir` (`java.io.File`): The directory containing the files modified by others.
- `mergeOptions` (`java.util.Map<java.lang.String,java.lang.String>`): The options used in the merge operation. The keys that can be used in this map 
   are found in MergeFilesOptionsConstants.

**Returns:** `java.util.List<ro.sync.diff.merge.api.MergedFileState>`

### `openPreviewDialog(java.lang.String title, java.lang.String previewButtonName, java.util.LinkedHashMap<java.net.URL,java.net.URL> resourcesMap)`

The resources are presented in the order in which they are placed in the map.

**Parameters:**
- `title` (`java.lang.String`): The dialog title. If `null` it defaults to "Preview"
- `previewButtonName` (`java.lang.String`): The preview button name. If `null` it defaults to "Update".
- `resourcesMap` (`java.util.LinkedHashMap<java.net.URL,java.net.URL>`): A map between an URL containing the initial content and an URL containing the modified content.

**Returns:** `java.util.List<java.net.URL>`

### `openPreviewDialog(java.lang.String title, java.lang.String previewButtonName, java.lang.String operationDescriptionLabelText, java.lang.String leftSideLabelText, java.lang.String rightSideLabelText, java.util.LinkedHashMap<java.net.URL,java.net.URL> resourcesMap)`

The resources are presented in the order in which they are placed in the map.

**Parameters:**
- `title` (`java.lang.String`): The dialog title. If `null` it defaults to "Preview"
- `previewButtonName` (`java.lang.String`): The preview button name. If `null` it defaults to "Update".
- `operationDescriptionLabelText` (`java.lang.String`): The text of the label that describes the operation for which the 'preview changes' 
                                        dialog is displayed. If `null` it defaults to "Changes to be performed".
- `leftSideLabelText` (`java.lang.String`): The text of the label that describes the left side of the diff panel.
                             If `null` it defaults to "Current".
- `rightSideLabelText` (`java.lang.String`): The text of the label that describes the right side of the diff panel.
                             If `null` it defaults to "Proposed changes".
- `resourcesMap` (`java.util.LinkedHashMap<java.net.URL,java.net.URL>`): A map between an URL containing the initial content and an URL containing the modified content.

**Returns:** `java.util.List<java.net.URL>`

### `openMergeApplication(java.lang.String dialogTitle, java.lang.String applyButtonText, boolean applyAllChangesInitialy, java.lang.String leftLabelText, java.net.URL leftURL, boolean leftURLEditable, boolean leftURLModified, java.lang.String rightLabelText, java.net.URL rightURL, boolean rightEditorEditable, boolean rightURLModified, java.net.URL ancestorURL)`

The tool is presented in a modal dialog.
 The content in the right part is read only and can be merged to the left part.  
 
 If the ancestor URL is specified the comparison will be performed in three-way mode. The left
 and right URLs will be compared relatively to the ancestor (base) URL.
 If the ancestor URL is `null` the comparison will be performed in two-way mode.
  
 The comparison will begin automatically and the content types for the URLs will be auto-detected.
 
 This works only when the API is used in the standalone version of Oxygen.

**Parameters:**
- `dialogTitle` (`java.lang.String`): The title of the dialog. By default it is named "Merge"
- `applyButtonText` (`java.lang.String`): The text for the "Apply" button, by default it is "Apply".
- `applyAllChangesInitialy` (`boolean`): `true` to apply all changes from the not editable to the editable panel if Apply is pressed just after the dialog is opened.
- `leftLabelText` (`java.lang.String`): The left - side label text. When `null`, 
   the leftURL value is presented in the files comparison tool. When specified, it is presented instead of the leftURL value.
- `leftURL` (`java.net.URL`): The left-side URL to diff. Can be `null`.
- `leftURLEditable` (`boolean`): `true` if the left editor is editable.
- `leftURLModified` (`boolean`): `true` to assume the left URL modified from the very beginning.
- `rightLabelText` (`java.lang.String`): The right - side label text. When `null`, 
   the rightURL value is presented in the files comparison tool. When specified, it is presented instead of the rightURL value.
- `rightURL` (`java.net.URL`): The right-side URL to diff. Can be `null`.
- `rightEditorEditable` (`boolean`): `true` if the right editor is editable.
- `rightURLModified` (`boolean`): `true` to assume the right URL modified from the very beginning.
- `ancestorURL` (`java.net.URL`): The ancestor (base) URL to diff. Can be `null`.

**Returns:** `boolean`

