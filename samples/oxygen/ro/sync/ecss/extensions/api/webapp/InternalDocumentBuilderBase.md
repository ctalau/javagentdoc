# Class: `InternalDocumentBuilderBase`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `EXTENSION_TO_CONTENT_TYPE`

**Type:** `com.google.common.collect.ImmutableMap<java.lang.String,java.lang.String>`

### `background`

**Type:** `boolean`

### `systemId`

**Type:** `java.net.URL`

### `sessionAttributes`

**Type:** `java.util.Map<java.lang.String,?>`

### `reader`

**Type:** `java.io.Reader`

### `eTagDataRecord`

**Type:** `ro.sync.ecss.dom.ETagDataRecord`

### `bomBytes`

**Type:** `java.util.List<java.lang.Byte>`

## Constructors

### `<init>()`

## Methods

### `setBackground(`boolean` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setSystemId(`java.net.URL` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setSessionAttributes(`java.util.Map<java.lang.String,?>` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setContent(`java.io.Reader` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setContent(`java.io.Reader` arg0, `java.util.List<java.lang.Byte>` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setContentEtag(`ro.sync.ecss.dom.ETagDataRecord` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `getContentType()`

**Returns:** `java.lang.String`

### `build()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createBuilder()`

**Returns:** `ro.sync.ecss.webapp.c`

### `checkUserLicense([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md) arg0, `ro.sync.ecss.webapp.d.t` arg1)`

**Returns:** `void`

