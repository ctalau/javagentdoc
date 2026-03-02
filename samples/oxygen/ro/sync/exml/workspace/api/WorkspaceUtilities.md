# Interface: `WorkspaceUtilities`

**Package:** [`ro.sync.exml.workspace.api`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.WorkspaceUtilities`

**Extends:** [`ro.sync.exml.workspace.api.util.ColorThemeUtilities`](util/ColorThemeUtilities.md), [`ro.sync.exml.workspace.api.application.ApplicationInformationAccess`](application/ApplicationInformationAccess.md)

## Description

## Methods

### `getParentFrame()`

**Returns:** `java.lang.Object`

### `chooseFile(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr, boolean openForSave)`

**Returns:** `java.io.File`

**Parameters:**
- `title` (`java.lang.String`): The file chooser title.
- `allowedExtensions` (`java.lang.String[]`): Allowed file extensions. Can be `null` if you want all
                          files filter. Example:  new String[] {"xml", "dita"}.
- `filterDescr` (`java.lang.String`): Description for the file filter.
- `openForSave` (`boolean`): `true` when the file chooser is used for saving,
                          `false` if it is used for opening an existing file.

### `chooseFile(java.io.File currentFileContext, java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr, boolean usedForSave)`

**Returns:** `java.io.File`

**Parameters:**
- `currentFileContext` (`java.io.File`): The file which will be selected in the file chooser.
                                If it is a directory, it will be used as a default directory.
                                If it is a file (even non-existing) and the file chooser is shown 
                                for a save operation its name will also be selected in the chooser.
                                Can be set `null` in order to use the default behavior.
- `title` (`java.lang.String`): The file chooser title.
- `allowedExtensions` (`java.lang.String[]`): Allowed file extensions. Can be `null` if you want all
                          files filter. Example:  new String[] {"xml", "dita"}.
- `filterDescr` (`java.lang.String`): Description for the file filter.
- `usedForSave` (`boolean`): `true` when the file chooser is used for saving,
                          `false` if it is used for opening an existing file.

### `chooseFile(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr)`

**Returns:** `java.io.File`

**Parameters:**
- `title` (`java.lang.String`): The file chooser title.
- `allowedExtensions` (`java.lang.String[]`): Allowed file extensions. Can be `null` if you want all
                          files filter. Example:  new String[] {"xml", "dita"}.
- `filterDescr` (`java.lang.String`): Description for the file filter.

### `chooseFiles(java.io.File currentFileContext, java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr)`

**Returns:** `java.io.File[]`

**Parameters:**
- `currentFileContext` (`java.io.File`): The file which will be selected in the file chooser.
                                If it is a directory, it will be used as a default directory.
                                If it is a file (even non-existing) and the file chooser is shown 
                                for a save operation its name will also be selected in the chooser.
                                Can be set `null` in order to use the default behavior.
- `title` (`java.lang.String`): The file chooser title.
- `allowedExtensions` (`java.lang.String[]`): Allowed file extensions. Can be `null` if you want all
                          files filter. Example:  new String[] {"xml", "dita"}.
- `filterDescr` (`java.lang.String`): Description for the file filter.

### `chooseDirectory()`

**Returns:** `java.io.File`

### `chooseDirectory(java.io.File startingDir)`

**Returns:** `java.io.File`

Available for the stand-alone oXygen and the Eclipse plugin.

**Parameters:**
- `startingDir` (`java.io.File`): The starting directory. May be `null`.

### `chooseURL(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr)`

**Returns:** `java.net.URL`

**Parameters:**
- `title` (`java.lang.String`): The chooser dialog title.
- `allowedExtensions` (`java.lang.String[]`): Allowed extensions.
- `filterDescr` (`java.lang.String`): Description for the filter.

### `chooseURL(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr, java.lang.String initialURL)`

**Returns:** `java.net.URL`

**Parameters:**
- `title` (`java.lang.String`): The chooser dialog title.
- `allowedExtensions` (`java.lang.String[]`): Allowed extensions.
- `filterDescr` (`java.lang.String`): Description for the filter.
- `initialURL` (`java.lang.String`): Default value for the URL (given as string). Can be `null`.

### `chooseURL(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr, java.lang.String initialURL, java.lang.String urlLabel, java.lang.String okLabel)`

**Returns:** `java.net.URL`

**Parameters:**
- `title` (`java.lang.String`): The chooser dialog title.
- `allowedExtensions` (`java.lang.String[]`): Allowed extensions.
- `filterDescr` (`java.lang.String`): Description for the filter.
- `initialURL` (`java.lang.String`): Default value for the URL (given as string). Can be `null`.
- `urlLabel` (`java.lang.String`): The label used for describing the URL field. If `null`, the value will be: "URL:".
- `okLabel` (`java.lang.String`): The label of the "OK" button. If `null` the value will be "OK".

### `chooseURLPath(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr)`

**Returns:** `java.lang.String`

If the user sets a 
 relative path in the chooser, that path will be returned.

**Parameters:**
- `title` (`java.lang.String`): The chooser dialog title.
- `allowedExtensions` (`java.lang.String[]`): Allowed extensions.
- `filterDescr` (`java.lang.String`): Description for the filter.

### `chooseURLPath(java.lang.String title, java.lang.String[] allowedExtensions, java.lang.String filterDescr, java.lang.String initialURL)`

**Returns:** `java.lang.String`

If the user sets a 
 relative path in the chooser, that path will be returned.

**Parameters:**
- `title` (`java.lang.String`): The chooser dialog title.
- `allowedExtensions` (`java.lang.String[]`): Allowed extensions.
- `filterDescr` (`java.lang.String`): Description for the filter.
- `initialURL` (`java.lang.String`): The initial URL to set in the field.

### `showWarningDialog(java.lang.String title, java.lang.String message, java.lang.String[] buttonNames, int[] buttonIds)`

**Returns:** `int`

**Parameters:**
- `title` (`java.lang.String`): The dialog title.
- `message` (`java.lang.String`): The message to be presented to the user.
- `buttonNames` (`java.lang.String[]`): The names of the buttons representing the choices in the dialog.
- `buttonIds` (`int[]`): The id for each button. Used to identify which button was pressed.
 All Ids must be greater or equal to 0.

### `showWarningDialog(java.lang.String title, java.lang.String message, java.lang.String[] buttonNames, int[] buttonIds, int initialSelectedIndex)`

**Returns:** `int`

**Parameters:**
- `title` (`java.lang.String`): The dialog title.
- `message` (`java.lang.String`): The message to be presented to the user.
- `buttonNames` (`java.lang.String[]`): The names of the buttons representing the choices in the dialog.
- `buttonIds` (`int[]`): The id for each button. Used to identify which button was pressed.
- `initialSelectedIndex` (`int`): The index of the initial selected button. 0 based.
 All Ids must be greater or equal to 0.

### `showConfirmDialog(java.lang.String title, java.lang.String message, java.lang.String[] buttonNames, int[] buttonIds)`

**Returns:** `int`

**Parameters:**
- `title` (`java.lang.String`): The dialog title.
- `message` (`java.lang.String`): The message to be presented to the user.
- `buttonNames` (`java.lang.String[]`): The names of the buttons representing the choices in the dialog.
- `buttonIds` (`int[]`): The id for each button. Used to identify which button was pressed.
 All Ids must be greater or equal to 0.

### `showConfirmDialog(java.lang.String title, java.lang.String message, java.lang.String[] buttonNames, int[] buttonIds, int initialSelectedIndex)`

**Returns:** `int`

**Parameters:**
- `title` (`java.lang.String`): The dialog title.
- `message` (`java.lang.String`): The message to be presented to the user.
- `buttonNames` (`java.lang.String[]`): The names of the buttons representing the choices in the dialog.
- `buttonIds` (`int[]`): The id for each button. Used to identify which button was pressed.
- `initialSelectedIndex` (`int`): The index of the initial selected button. 0 based.
 All Ids must be greater or equal to 0.

### `showErrorMessage(java.lang.String message)`

**Returns:** `void`

**Parameters:**
- `message` (`java.lang.String`): The error message.

### `showErrorMessage(java.lang.String message, java.lang.Throwable exception)`

**Returns:** `void`

**Parameters:**
- `message` (`java.lang.String`): The error message.
- `exception` (`java.lang.Throwable`): An exception for which the stack trace will be shown when the "More details" link is clicked.
 In more recent application versions due to security related decisions the exception stack trace is no longer shown.

### `showWarningMessage(java.lang.String message)`

**Returns:** `void`

**Parameters:**
- `message` (`java.lang.String`): The warning message.

### `showInformationMessage(java.lang.String message)`

**Returns:** `void`

**Parameters:**
- `message` (`java.lang.String`): The information message.

### `showStatusMessage(java.lang.String statusMessage)`

**Returns:** `void`

**Parameters:**
- `statusMessage` (`java.lang.String`): The status message

### `showStatusMessage(java.lang.String statusMessage, ro.sync.exml.workspace.api.OperationStatus status)`

**Returns:** `void`

**Parameters:**
- `statusMessage` (`java.lang.String`): The message.
- `status` ([`ro.sync.exml.workspace.api.OperationStatus`](./OperationStatus.md)): The status that gives the color.

### `openInExternalApplication(java.net.URL url, boolean preferAssociatedApplication)`

**Returns:** `void`

**Parameters:**
- `url` (`java.net.URL`): The URL to open.
- `preferAssociatedApplication` (`boolean`): If true will prefer the system associated application and if this fails, open in the browser
 if false will open in the browser.

### `openInExternalApplication(java.net.URL url, boolean preferAssociatedApplication, java.lang.String mediaType)`

**Returns:** `void`

**Parameters:**
- `url` (`java.net.URL`): The URL to open.
- `preferAssociatedApplication` (`boolean`): If true will prefer the system associated application and if this fails, open in the browser
 if false will open in the browser.
- `mediaType` (`java.lang.String`): The media type of the URL to open.

### `openInExternalApplication(java.lang.String url, boolean preferAssociatedApplication, java.lang.String mediaType)`

**Returns:** `void`

**Parameters:**
- `url` (`java.lang.String`): The URL to open.
- `preferAssociatedApplication` (`boolean`): If `true`, it will prefer the system associated application
                                          and if this fails, it will open in the browser. If `false`
                                          the resource will be opened in the browser.
- `mediaType` (`java.lang.String`): The media type of the URL to open.

### `createJavaProcess(java.lang.String additionalJavaArguments, java.lang.String[] classpath, java.lang.String mainClass, java.lang.String additionalArguments, java.util.Map<java.lang.String,java.lang.String> environmentalVariables, java.io.File startDirectory, ro.sync.exml.workspace.api.process.ProcessListener processListener)`

**Returns:** [`ro.sync.exml.workspace.api.process.ProcessController`](process/ProcessController.md)

It also sets on the Java process the Oxygen HTTP proxy configuration.

**Parameters:**
- `additionalJavaArguments` (`java.lang.String`): Additional Java arguments like "-Xmx256m"
- `classpath` (`java.lang.String[]`): The classpath.
- `mainClass` (`java.lang.String`): The main class
- `additionalArguments` (`java.lang.String`): The additional process arguments
- `environmentalVariables` (`java.util.Map<java.lang.String,java.lang.String>`): Additional environmental variables. Can be `null`
- `startDirectory` (`java.io.File`): The directory where the process should start.  Can be `null`
- `processListener` ([`ro.sync.exml.workspace.api.process.ProcessListener`](process/ProcessListener.md)): The process listener.  Can be `null`

### `startProcess(java.lang.String name, java.io.File workingDirectory, java.lang.String cmdLine, boolean showConsole)`

**Returns:** `void`

If the process is already running, it will not be started again.
 **Does not wait for the process to finish.**

**Parameters:**
- `name` (`java.lang.String`): The name of the process.
- `workingDirectory` (`java.io.File`): The directory where the process is started.
- `cmdLine` (`java.lang.String`): The command line to be executed. Can contain editor variables.
- `showConsole` (`boolean`): `True` to show the console.

### `createProcess(ro.sync.exml.workspace.api.process.ProcessListener processListener, java.lang.String name, java.io.File workingDirectory, java.lang.String cmdLine, boolean showConsole)`

**Returns:** [`ro.sync.exml.workspace.api.process.ProcessController`](process/ProcessController.md)

**Parameters:**
- `processListener` ([`ro.sync.exml.workspace.api.process.ProcessListener`](process/ProcessListener.md)): The process handler
- `name` (`java.lang.String`): The name of the process.
- `workingDirectory` (`java.io.File`): The directory where the process is started.
- `cmdLine` (`java.lang.String`): The command line to be executed. Can contain editor variables.
- `showConsole` (`boolean`): `True` to show the console.

### `clearImageCache()`

**Returns:** `void`

You can use the ImageUtilities API to clear the image cache.

### `getDataSourceAccess()`

**Returns:** [`ro.sync.exml.workspace.api.options.DataSourceAccess`](options/DataSourceAccess.md)

### `getImageUtilities()`

**Returns:** [`ro.sync.exml.workspace.api.images.ImageUtilities`](images/ImageUtilities.md)

### `getTemplateManager()`

**Returns:** [`ro.sync.exml.workspace.api.templates.TemplateManager`](templates/TemplateManager.md)

