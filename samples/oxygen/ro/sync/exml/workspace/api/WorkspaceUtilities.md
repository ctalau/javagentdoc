# Interface: `WorkspaceUtilities`

**Package:** [`ro.sync.exml.workspace.api`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.WorkspaceUtilities`

**Extends:** [`ro.sync.exml.workspace.api.util.ColorThemeUtilities`](util/ColorThemeUtilities.md), [`ro.sync.exml.workspace.api.application.ApplicationInformationAccess`](application/ApplicationInformationAccess.md)

## Description

## Methods

### `getParentFrame()`

**Returns:** `java.lang.Object`

### `chooseFile(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr, `boolean` openForSave)`

**Returns:** `java.io.File`

### `chooseFile(`java.io.File` currentFileContext, `java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr, `boolean` usedForSave)`

**Returns:** `java.io.File`

### `chooseFile(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr)`

**Returns:** `java.io.File`

### `chooseFiles(`java.io.File` currentFileContext, `java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr)`

**Returns:** `java.io.File[]`

### `chooseDirectory()`

**Returns:** `java.io.File`

### `chooseDirectory(`java.io.File` startingDir)`

**Returns:** `java.io.File`

Available for the stand-alone oXygen and the Eclipse plugin.

### `chooseURL(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr)`

**Returns:** `java.net.URL`

### `chooseURL(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr, `java.lang.String` initialURL)`

**Returns:** `java.net.URL`

### `chooseURL(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr, `java.lang.String` initialURL, `java.lang.String` urlLabel, `java.lang.String` okLabel)`

**Returns:** `java.net.URL`

### `chooseURLPath(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr)`

**Returns:** `java.lang.String`

If the user sets a 
 relative path in the chooser, that path will be returned.

### `chooseURLPath(`java.lang.String` title, `java.lang.String[]` allowedExtensions, `java.lang.String` filterDescr, `java.lang.String` initialURL)`

**Returns:** `java.lang.String`

If the user sets a 
 relative path in the chooser, that path will be returned.

### `showWarningDialog(`java.lang.String` title, `java.lang.String` message, `java.lang.String[]` buttonNames, `int[]` buttonIds)`

**Returns:** `int`

### `showWarningDialog(`java.lang.String` title, `java.lang.String` message, `java.lang.String[]` buttonNames, `int[]` buttonIds, `int` initialSelectedIndex)`

**Returns:** `int`

### `showConfirmDialog(`java.lang.String` title, `java.lang.String` message, `java.lang.String[]` buttonNames, `int[]` buttonIds)`

**Returns:** `int`

### `showConfirmDialog(`java.lang.String` title, `java.lang.String` message, `java.lang.String[]` buttonNames, `int[]` buttonIds, `int` initialSelectedIndex)`

**Returns:** `int`

### `showErrorMessage(`java.lang.String` message)`

**Returns:** `void`

### `showErrorMessage(`java.lang.String` message, `java.lang.Throwable` exception)`

**Returns:** `void`

### `showWarningMessage(`java.lang.String` message)`

**Returns:** `void`

### `showInformationMessage(`java.lang.String` message)`

**Returns:** `void`

### `showStatusMessage(`java.lang.String` statusMessage)`

**Returns:** `void`

### `showStatusMessage(`java.lang.String` statusMessage, [`ro.sync.exml.workspace.api.OperationStatus`](./OperationStatus.md) status)`

**Returns:** `void`

### `openInExternalApplication(`java.net.URL` url, `boolean` preferAssociatedApplication)`

**Returns:** `void`

### `openInExternalApplication(`java.net.URL` url, `boolean` preferAssociatedApplication, `java.lang.String` mediaType)`

**Returns:** `void`

### `openInExternalApplication(`java.lang.String` url, `boolean` preferAssociatedApplication, `java.lang.String` mediaType)`

**Returns:** `void`

### `createJavaProcess(`java.lang.String` additionalJavaArguments, `java.lang.String[]` classpath, `java.lang.String` mainClass, `java.lang.String` additionalArguments, `java.util.Map<java.lang.String,java.lang.String>` environmentalVariables, `java.io.File` startDirectory, [`ro.sync.exml.workspace.api.process.ProcessListener`](process/ProcessListener.md) processListener)`

**Returns:** [`ro.sync.exml.workspace.api.process.ProcessController`](process/ProcessController.md)

It also sets on the Java process the Oxygen HTTP proxy configuration.

### `startProcess(`java.lang.String` name, `java.io.File` workingDirectory, `java.lang.String` cmdLine, `boolean` showConsole)`

**Returns:** `void`

If the process is already running, it will not be started again.
 **Does not wait for the process to finish.**

### `createProcess([`ro.sync.exml.workspace.api.process.ProcessListener`](process/ProcessListener.md) processListener, `java.lang.String` name, `java.io.File` workingDirectory, `java.lang.String` cmdLine, `boolean` showConsole)`

**Returns:** [`ro.sync.exml.workspace.api.process.ProcessController`](process/ProcessController.md)

### `clearImageCache()`

**Returns:** `void`

You can use the ImageUtilities API to clear the image cache.

### `getDataSourceAccess()`

**Returns:** [`ro.sync.exml.workspace.api.options.DataSourceAccess`](options/DataSourceAccess.md)

### `getImageUtilities()`

**Returns:** [`ro.sync.exml.workspace.api.images.ImageUtilities`](images/ImageUtilities.md)

### `getTemplateManager()`

**Returns:** [`ro.sync.exml.workspace.api.templates.TemplateManager`](templates/TemplateManager.md)

