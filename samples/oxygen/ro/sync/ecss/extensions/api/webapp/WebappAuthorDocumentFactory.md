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

### `createDITAMapDocumentInfo(`java.net.URL` arg0, `java.io.Reader` arg1, `java.util.List` arg2, `java.util.Map<java.lang.String,?>` arg3)`

**Returns:** [`ro.sync.ecss.webapp.ditamap.DITAMapDocumentModel`](../../../webapp/ditamap/DITAMapDocumentModel.md)

### `createAuthorDocumentInfo(`java.net.URL` arg0, `java.io.Reader` arg1, `java.util.List` arg2, `java.util.Map<java.lang.String,?>` arg3)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createAuthorDocumentInfoInternal(`java.net.URL` arg0, `java.io.Reader` arg1, `ro.sync.ecss.dom.ETagDataRecord` arg2, `java.util.List` arg3, `java.util.Map<java.lang.String,?>` arg4, [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md) arg5)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createAuthorDocumentInfo(`java.lang.String` arg0, `java.util.Map<java.lang.String,?>` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createAuthorDocumentInfoInternal(`java.lang.String` arg0, `java.util.Map<java.lang.String,?>` arg1, [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md) arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `getCmsUrl(`java.net.URL` arg0)`

**Returns:** `java.net.URL`

### `applyReadOnlyStatus(`java.lang.String` arg0, [`ro.sync.exml.workspace.api.editor.ReadOnlyReason`](../../../../exml/workspace/api/editor/ReadOnlyReason.md) arg1, [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md) arg2)`

**Returns:** `void`

### `createAuthorDocumentInfo(`java.lang.String` arg0, `java.io.Reader` arg1, `java.util.Map<java.lang.String,?>` arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `setOptions(`java.io.File` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `getOptionsListeners()`

**Returns:** `java.util.List<ro.sync.options.d>`

### `setFrameworks(`java.io.File` arg0)`

**Returns:** `void`

### `setUserFrameworks(`java.io.File` arg0)`

**Returns:** `void`

### `setPlugins(`java.io.File` arg0)`

**Returns:** `void`

### `setPlugins(`java.io.File` arg0, `java.io.File` arg1)`

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

### `createDITAMapDocumentInfo(`java.lang.String` arg0, `java.io.Reader` arg1, `java.util.Map<java.lang.String,?>` arg2)`

**Returns:** [`ro.sync.ecss.webapp.ditamap.DITAMapDocumentModel`](../../../webapp/ditamap/DITAMapDocumentModel.md)

### `createDITAMapDocumentInfo(`java.lang.String` arg0, `java.util.Map<java.lang.String,?>` arg1)`

**Returns:** [`ro.sync.ecss.webapp.ditamap.DITAMapDocumentModel`](../../../webapp/ditamap/DITAMapDocumentModel.md)

