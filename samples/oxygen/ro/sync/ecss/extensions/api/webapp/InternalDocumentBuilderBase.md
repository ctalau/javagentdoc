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

### `setBackground(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setSystemId(java.net.URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setSessionAttributes(java.util.Map<java.lang.String,?> arg0)`

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,?>`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setContent(java.io.Reader arg0)`

**Parameters:**
- `arg0` (`java.io.Reader`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setContent(java.io.Reader arg0, java.util.List<java.lang.Byte> arg1)`

**Parameters:**
- `arg0` (`java.io.Reader`)
- `arg1` (`java.util.List<java.lang.Byte>`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `setContentEtag(ro.sync.ecss.dom.ETagDataRecord arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.dom.ETagDataRecord`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

### `getContentType()`

**Returns:** `java.lang.String`

### `build()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createBuilder()`

**Returns:** `ro.sync.ecss.webapp.c`

### `checkUserLicense(ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel arg0, ro.sync.ecss.webapp.d.t arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md))
- `arg1` (`ro.sync.ecss.webapp.d.t`)

**Returns:** `void`

