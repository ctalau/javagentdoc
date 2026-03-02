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

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

**Parameters:**
- `arg0` (`boolean`)

### `setSystemId(java.net.URL arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

**Parameters:**
- `arg0` (`java.net.URL`)

### `setSessionAttributes(java.util.Map<java.lang.String,?> arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,?>`)

### `setContent(java.io.Reader arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

**Parameters:**
- `arg0` (`java.io.Reader`)

### `setContent(java.io.Reader arg0, java.util.List<java.lang.Byte> arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

**Parameters:**
- `arg0` (`java.io.Reader`)
- `arg1` (`java.util.List<java.lang.Byte>`)

### `setContentEtag(ro.sync.ecss.dom.ETagDataRecord arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.InternalDocumentBuilderBase`](./InternalDocumentBuilderBase.md)

**Parameters:**
- `arg0` (`ro.sync.ecss.dom.ETagDataRecord`)

### `getContentType()`

**Returns:** `java.lang.String`

### `build()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md)

### `createBuilder()`

**Returns:** `ro.sync.ecss.webapp.c`

### `checkUserLicense(ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel arg0, ro.sync.ecss.webapp.d.t arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](./AuthorDocumentModel.md))
- `arg1` (`ro.sync.ecss.webapp.d.t`)

