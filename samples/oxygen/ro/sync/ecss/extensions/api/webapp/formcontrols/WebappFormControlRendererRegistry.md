# Class: `WebappFormControlRendererRegistry`

**Package:** [`ro.sync.ecss.extensions.api.webapp.formcontrols`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.formcontrols.WebappFormControlRendererRegistry`

## Fields

### `renderers`

**Type:** `java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.webapp.formcontrols.WebappFormControlRenderer>`

### `customRenderers`

**Type:** `java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.webapp.formcontrols.WebappFormControlRenderer>`

## Constructors

### `<init>()`

## Methods

### `registerRenderer(java.lang.String arg0, ro.sync.ecss.extensions.api.webapp.formcontrols.WebappFormControlRenderer arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.extensions.api.webapp.formcontrols.WebappFormControlRenderer`](./WebappFormControlRenderer.md))

### `getRenderer(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.formcontrols.WebappFormControlRenderer`](./WebappFormControlRenderer.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../editor/AuthorInplaceContext.md))

### `getHTMLContentCss(java.lang.String arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)

