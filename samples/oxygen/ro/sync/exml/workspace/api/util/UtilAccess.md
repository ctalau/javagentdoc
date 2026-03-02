# Interface: `UtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.UtilAccess`

## Description

## Methods

### `makeRelative(java.net.URL baseURL, java.net.URL childURL)`

**Returns:** `java.lang.String`

The query and fragment identifier are preserved if the initial reference contains them.
 

 The child URL is relatively expressed to the base URL. If it is
 not possible, the child URL is returned. 
 

 For example if the base URL is "file://c:/projects/exml/base.prx" and the child
 URL is "file://c:/projects/exml/test/someTest.xml" the result will be: "test/someTest.xml"

**Parameters:**
- `baseURL` (`java.net.URL`): The base URL.
- `childURL` (`java.net.URL`): The child URL.

### `correctURL(java.lang.String url)`

**Returns:** `java.lang.String`

The URL correction takes an URL like:

   http://path to directory/file.xml

 and escapes illegal URL characters like spaces to:

   http://path%20to%20directory/file.xml

**Parameters:**
- `url` (`java.lang.String`): The URL to be corrected.

### `uncorrectURL(java.lang.String url)`

**Returns:** `java.lang.String`

The URL un-correction takes an URL like:

   http://path%20to%20directory/file.xml

 and unescapes it back to:

   http://path to directory/file.xml

**Parameters:**
- `url` (`java.lang.String`): The URL to be corrected.

### `convertFileToURL(java.io.File file)`

**Returns:** `java.net.URL`

The URL correction takes a File like:

   c:\path to directory\file.xml

 and escapes illegal URL characters like spaces to:

   http://path%20to%20directory/file.xml

**Parameters:**
- `file` (`java.io.File`): The File to be corrected.

### `removeUserCredentials(java.net.URL url)`

**Returns:** `java.net.URL`

**Parameters:**
- `url` (`java.net.URL`): The URL from which the user credentials will be removed.

### `locateFile(java.net.URL url)`

**Returns:** `java.io.File`

**Parameters:**
- `url` (`java.net.URL`): The URL to be checked.

### `getExtension(java.net.URL url)`

**Returns:** `java.lang.String`

The extension is lower cased.

**Parameters:**
- `url` (`java.net.URL`): The URL to extract the extension for.

### `getFileName(java.lang.String urlPath)`

**Returns:** `java.lang.String`

**Parameters:**
- `urlPath` (`java.lang.String`): An URL path

### `isSupportedImageURL(java.net.URL url)`

**Returns:** `boolean`

The image extension is used

**Parameters:**
- `url` (`java.net.URL`): The URL

### `isUnhandledBinaryResourceURL(java.net.URL url)`

**Returns:** `boolean`

The resource file extension is checked against a list of binary file patterns configured in the Oxygen options.
 
 For example ZIP-like archives are handled by Oxygen although they are binary.

**Parameters:**
- `url` (`java.net.URL`): The URL

### `expandEditorVariables(java.lang.String pathWithEditorVariables, java.net.URL currentEditedURL)`

**Returns:** `java.lang.String`

If there's an external framework associated with the current editor, any $framework, $frameworks,
 $frameworkDir or $frameworksDir variable will be expanded in the context of 
 that framework.
 "ask" and "answer" editor variables are not expanded by default.

**Parameters:**
- `pathWithEditorVariables` (`java.lang.String`): The path containing editor variables
- `currentEditedURL` (`java.net.URL`): The current edited URL. Can be `null` but it may be necessary to expand editor variables like "${cfd}".

### `expandEditorVariables(java.lang.String pathWithEditorVariables, java.net.URL currentEditedURL, boolean expandAskEditorVariables)`

**Returns:** `java.lang.String`

If there's an external framework associated with the current editor, any $framework, $frameworks,
 $frameworkDir or $frameworksDir variable will be expanded in the context of 
 that framework.

**Parameters:**
- `pathWithEditorVariables` (`java.lang.String`): The path containing editor variables
- `currentEditedURL` (`java.net.URL`): The current edited URL. Can be `null` but it may be necessary to expand editor variables like "${cfd}".
- `expandAskEditorVariables` (`boolean`): `true` to also expand "ask" and "answer" editor variables.

### `encrypt(java.lang.String toEncrypt)`

**Returns:** `java.lang.String`

The encryption/decryption is application-specific so a string encrypted in one Oxygen installation cannot be decrypted in another.
 You can use this method if you want to store user-specific data on disk with a moderate level of security.

**Parameters:**
- `toEncrypt` (`java.lang.String`): The string to encrypt.

### `decrypt(java.lang.String toDecrypt)`

**Returns:** `java.lang.String`

The encryption/decryption is application-specific so a string encrypted in one Oxygen installation cannot be decrypted in another.
 You can use this method if you want to store user-specific data on disk with a moderate level of security.

**Parameters:**
- `toDecrypt` (`java.lang.String`): The string to decrypt.

### `addCustomEditorVariablesResolver(ro.sync.exml.workspace.api.util.EditorVariablesResolver resolver)`

**Returns:** `void`

The resolver receives a string which may or may not contain custom editor variables.
 It can either return the unmodified string or a modified version of the string in which certain editor variables have been expanded to certain values.

**Parameters:**
- `resolver` ([`ro.sync.exml.workspace.api.util.EditorVariablesResolver`](./EditorVariablesResolver.md)): The resolver.

### `removeCustomEditorVariablesResolver(ro.sync.exml.workspace.api.util.EditorVariablesResolver resolver)`

**Returns:** `void`

**Parameters:**
- `resolver` ([`ro.sync.exml.workspace.api.util.EditorVariablesResolver`](./EditorVariablesResolver.md)): The resolver to remove.

### `createReader(java.net.URL url, java.lang.String defaultEncoding)`

**Returns:** `java.io.Reader`

**Parameters:**
- `url` (`java.net.URL`): The URL to be opened.
- `defaultEncoding` (`java.lang.String`): The encoding to be used when all other ways of detecting it returned 
 null. This is used instead of creating the input stream reader with no encoding arguments. This 
 is a JAVA encoding.

### `createImage(java.lang.String imageUrl)`

**Returns:** `java.awt.image.BufferedImage`

**Parameters:**
- `imageUrl` (`java.lang.String`): The URL of the image for which to return the buffered image.

### `optimizeImage(java.net.URL imageUrl)`

**Returns:** [`ro.sync.exml.workspace.api.util.ImageHolder`](./ImageHolder.md)

In case the image is too large it scales it down to fit a normal page.

**Parameters:**
- `imageUrl` (`java.net.URL`): The image URL.

### `getContentType(java.lang.String systemID)`

**Returns:** `java.lang.String`

The content type is detected from the file extension based on the file extension 
 associations saved in the application preferences.

**Parameters:**
- `systemID` (`java.lang.String`): The systemID to get the content type for.

