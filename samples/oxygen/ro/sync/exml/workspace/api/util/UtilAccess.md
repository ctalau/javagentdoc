# Interface: `UtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.UtilAccess`

## Description

## Methods

### `makeRelative(`java.net.URL` baseURL, `java.net.URL` childURL)`

**Returns:** `java.lang.String`

The query and fragment identifier are preserved if the initial reference contains them.
 

 The child URL is relatively expressed to the base URL. If it is
 not possible, the child URL is returned. 
 

 For example if the base URL is "file://c:/projects/exml/base.prx" and the child
 URL is "file://c:/projects/exml/test/someTest.xml" the result will be: "test/someTest.xml"

### `correctURL(`java.lang.String` url)`

**Returns:** `java.lang.String`

The URL correction takes an URL like:

   http://path to directory/file.xml

 and escapes illegal URL characters like spaces to:

   http://path%20to%20directory/file.xml

### `uncorrectURL(`java.lang.String` url)`

**Returns:** `java.lang.String`

The URL un-correction takes an URL like:

   http://path%20to%20directory/file.xml

 and unescapes it back to:

   http://path to directory/file.xml

### `convertFileToURL(`java.io.File` file)`

**Returns:** `java.net.URL`

The URL correction takes a File like:

   c:\path to directory\file.xml

 and escapes illegal URL characters like spaces to:

   http://path%20to%20directory/file.xml

### `removeUserCredentials(`java.net.URL` url)`

**Returns:** `java.net.URL`

### `locateFile(`java.net.URL` url)`

**Returns:** `java.io.File`

### `getExtension(`java.net.URL` url)`

**Returns:** `java.lang.String`

The extension is lower cased.

### `getFileName(`java.lang.String` urlPath)`

**Returns:** `java.lang.String`

### `isSupportedImageURL(`java.net.URL` url)`

**Returns:** `boolean`

The image extension is used

### `isUnhandledBinaryResourceURL(`java.net.URL` url)`

**Returns:** `boolean`

The resource file extension is checked against a list of binary file patterns configured in the Oxygen options.
 
 For example ZIP-like archives are handled by Oxygen although they are binary.

### `expandEditorVariables(`java.lang.String` pathWithEditorVariables, `java.net.URL` currentEditedURL)`

**Returns:** `java.lang.String`

If there's an external framework associated with the current editor, any $framework, $frameworks,
 $frameworkDir or $frameworksDir variable will be expanded in the context of 
 that framework.
 "ask" and "answer" editor variables are not expanded by default.

### `expandEditorVariables(`java.lang.String` pathWithEditorVariables, `java.net.URL` currentEditedURL, `boolean` expandAskEditorVariables)`

**Returns:** `java.lang.String`

If there's an external framework associated with the current editor, any $framework, $frameworks,
 $frameworkDir or $frameworksDir variable will be expanded in the context of 
 that framework.

### `encrypt(`java.lang.String` toEncrypt)`

**Returns:** `java.lang.String`

The encryption/decryption is application-specific so a string encrypted in one Oxygen installation cannot be decrypted in another.
 You can use this method if you want to store user-specific data on disk with a moderate level of security.

### `decrypt(`java.lang.String` toDecrypt)`

**Returns:** `java.lang.String`

The encryption/decryption is application-specific so a string encrypted in one Oxygen installation cannot be decrypted in another.
 You can use this method if you want to store user-specific data on disk with a moderate level of security.

### `addCustomEditorVariablesResolver([`ro.sync.exml.workspace.api.util.EditorVariablesResolver`](./EditorVariablesResolver.md) resolver)`

**Returns:** `void`

The resolver receives a string which may or may not contain custom editor variables.
 It can either return the unmodified string or a modified version of the string in which certain editor variables have been expanded to certain values.

### `removeCustomEditorVariablesResolver([`ro.sync.exml.workspace.api.util.EditorVariablesResolver`](./EditorVariablesResolver.md) resolver)`

**Returns:** `void`

### `createReader(`java.net.URL` url, `java.lang.String` defaultEncoding)`

**Returns:** `java.io.Reader`

### `createImage(`java.lang.String` imageUrl)`

**Returns:** `java.awt.image.BufferedImage`

### `optimizeImage(`java.net.URL` imageUrl)`

**Returns:** [`ro.sync.exml.workspace.api.util.ImageHolder`](./ImageHolder.md)

In case the image is too large it scales it down to fit a normal page.

### `getContentType(`java.lang.String` systemID)`

**Returns:** `java.lang.String`

The content type is detected from the file extension based on the file extension 
 associations saved in the application preferences.

