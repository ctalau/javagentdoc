# Class: `WebappAuthorDocumentFactory`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappAuthorDocumentFactory`

**Implements:** [`ro.sync.ecss.extensions.api.webapp.WebappAuthorDocumentFactoryConstants`](./WebappAuthorDocumentFactoryConstants.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `optionsListeners`

**Type:** `java.util.ArrayList<ro.sync.options.d>`

### `initialized`

**Type:** `boolean`

### `initializationFatalError`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `createDITAMapDocumentInfo(URL arg0, Reader arg1, List arg2, Map<String,?> arg3)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.Reader`)
- `arg2` (`java.util.List`)
- `arg3` (`java.util.Map<java.lang.String,?>`)

**Returns:** [`ro.sync.ecss.webapp.ditamap.DITAMapDocumentModel`](../../../webapp/ditamap/DITAMapDocumentModel.md)

### `createAuthorDocumentInfo(URL arg0, Reader arg1, List arg2, Map<String,?> arg3)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.Reader`)
- `arg2` (`java.util.List`)
- `arg3` (`java.util.Map<java.lang.String,?>`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createAuthorDocumentInfoInternal(URL arg0, Reader arg1, ETagDataRecord arg2, List arg3, Map<String,?> arg4, InternalDocumentBuilderBase arg5)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.Reader`)
- `arg2` (`ro.sync.ecss.dom.ETagDataRecord`)
- `arg3` (`java.util.List`)
- `arg4` (`java.util.Map<java.lang.String,?>`)
- `arg5` ([`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md))

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createAuthorDocumentInfo(String arg0, Map<String,?> arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.Map<java.lang.String,?>`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createAuthorDocumentInfoInternal(String arg0, Map<String,?> arg1, InternalDocumentBuilderBase arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.Map<java.lang.String,?>`)
- `arg2` ([`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md))

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `getCmsUrl(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.net.URL`

### `applyReadOnlyStatus(String arg0, ReadOnlyReason arg1, AuthorDocumentModel arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.exml.workspace.api.editor.ReadOnlyReason`](../../../../exml/workspace/api/editor/ReadOnlyReason.md))
- `arg2` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md))

**Returns:** `void`

### `createAuthorDocumentInfo(String arg0, Reader arg1, Map<String,?> arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.io.Reader`)
- `arg2` (`java.util.Map<java.lang.String,?>`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `setOptions(File arg0, String arg1)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `getOptionsListeners()`

**Returns:** `java.util.List<ro.sync.options.d>`

### `setFrameworks(File arg0)`

**Parameters:**
- `arg0` (`java.io.File`)

**Returns:** `void`

### `setUserFrameworks(File arg0)`

**Parameters:**
- `arg0` (`java.io.File`)

**Returns:** `void`

### `setPlugins(File arg0)`

**Parameters:**
- `arg0` (`java.io.File`)

**Returns:** `void`

### `setPlugins(File arg0, File arg1)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.io.File`)

**Returns:** `void`

### `getPluginsJS()`

**Returns:** `java.io.Reader`

### `getPluginsCSS()`

**Returns:** `java.io.Reader`

### `setOverrideOptions()`

**Returns:** `void`

### `init()`

**Returns:** `void`

### `getInitializationFatalError()`

**Returns:** `java.util.Optional<java.lang.String>`

### `initFrameworksSupport()`

**Returns:** `void`

### `registerReferenceCollectorFactory()`

**Returns:** `void`

### `forceJnaLoading()`

**Returns:** `void`

### `initCatalogDebugging()`

**Returns:** `void`

### `setBundleDescriptor()`

**Returns:** `void`

### `dispose()`

**Returns:** `void`

### `initEditorVariables()`

**Returns:** `void`

### `createDITAMapDocumentInfo(String arg0, Reader arg1, Map<String,?> arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.io.Reader`)
- `arg2` (`java.util.Map<java.lang.String,?>`)

**Returns:** [`ro.sync.ecss.webapp.ditamap.DITAMapDocumentModel`](../../../webapp/ditamap/DITAMapDocumentModel.md)

### `createDITAMapDocumentInfo(String arg0, Map<String,?> arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.Map<java.lang.String,?>`)

**Returns:** [`ro.sync.ecss.webapp.ditamap.DITAMapDocumentModel`](../../../webapp/ditamap/DITAMapDocumentModel.md)

