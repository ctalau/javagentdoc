# Interface: `AuthorDiffDirectoriesChangeTrackingMerger`

**Package:** [`ro.sync.diff.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.api.AuthorDiffDirectoriesChangeTrackingMerger`

## Description

All pairs of modified XML files involved in the process are merged by saving the Author mode comparison 
   results as documents with tracked changes that can be later reviewed and accepted / rejected. 
 All the other situations detected are treated based on 2 options applicable to both XML and non-XML files, 
   plus one option applicable to XML files only, plus another option applicable to non-XML files only.

## Fields

### `OPERATION_REPORT_SUBDIRECTORY_NAME`

**Type:** `java.lang.String`

### `OPERATION_REPORT_FILE_NAME`

**Type:** `java.lang.String`

### `BACKUP_DIRECTORY_NAME_SUFFIX`

**Type:** `java.lang.String`

The base directory is backed up either if the output directory is not specified or 
 the base directory itself is also explicitly chosen/specified as the output directory.
 When the backup directory is no longer needed, it can be deleted using the URL of the base directory 
 and this suffix to correctly identify it.

## Methods

### `mergeDirectoriesWithChangeTrackingHighlights(java.net.URL baseDirectoryURL, java.net.URL directoryToMergeWithURL, java.net.URL outputDirectoryURL, ro.sync.diff.api.DiffOptions diffOptions, boolean addFilesOnlyPresentInDirectoryToMergeWith, boolean createChangeTrackingMarkersForAddedXMLFiles, boolean deleteFilesOnlyPresentInBaseDirectory, boolean updateNonXMLFilesFromBaseDirectoryToFileVersionsFromDirectoryToMergeWith)`

Only "file" protocol is supported for all 3 URLs provided. 
 All pairs of modified XML files involved in the process are merged by saving the Author mode 
   comparison results as documents with tracked changes that can be later reviewed and accepted / rejected. 
 All the other situations detected are treated based on 2 options applicable to both XML and non-XML files, 
   plus one option applicable to XML files only, plus another option applicable to non-XML files only. 
 Once the merge operation succeeds, a report file is created. It is named #OPERATION_REPORT_FILE_NAME 
 and is placed in a sub-directory named #OPERATION_REPORT_SUBDIRECTORY_NAME in the output directory. 
 Aside from the fact that the report provides an overview of the merge process, 
   it also provides links to all the files in the resulting output directory.
 You can use the respective links to load these XML files in Author mode in Oxygen 
   to review the tracked changes and accept or reject them.

**Parameters:**
- `baseDirectoryURL` (`java.net.URL`): The URL of the base directory.
- `directoryToMergeWithURL` (`java.net.URL`): The URL of the directory to merge with.
- `outputDirectoryURL` (`java.net.URL`): The URL of the output directory. Can be `null`, 
            in which case the base directory is also considered the output directory.
            Another particular case is when the base directory is explicitly specified as output directory too.
            In both cases, the base directory is automatically backed up.
            The backup copy will have the same parent directory as the base directory and its name will be 
            the name of the base directory suffixed by #BACKUP_DIRECTORY_NAME_SUFFIX.
- `diffOptions` ([`ro.sync.diff.api.DiffOptions`](./DiffOptions.md)): The DiffOptions used to decide which comparing algorithm and which comparing options to use.  
            Can be `null` in which case the comparison algorithm is chosen automatically 
            and the default comparison options are used.
- `addFilesOnlyPresentInDirectoryToMergeWith` (`boolean`): If `true`, all the files only present 
            in the directory to merge with will be added to the output directory.
- `createChangeTrackingMarkersForAddedXMLFiles` (`boolean`): If `true`, all XML files only present 
            in the directory to merge with - that have to be added to the destination/output directory - 
            will contain change tracking markers of type "added content".
            The option is not necessarily intended for the merge process itself, but it is useful 
            if you want to apply various Oxygen transformation scenarios to the resulting output directory.
- `deleteFilesOnlyPresentInBaseDirectory` (`boolean`): If `true`, all the files only present 
            in the base directory will not be added to the output directory.
- `updateNonXMLFilesFromBaseDirectoryToFileVersionsFromDirectoryToMergeWith` (`boolean`): If `true`, 
            all non XML files from the base directory are updated to the versions from the directory to merge with.

**Returns:** `void`

