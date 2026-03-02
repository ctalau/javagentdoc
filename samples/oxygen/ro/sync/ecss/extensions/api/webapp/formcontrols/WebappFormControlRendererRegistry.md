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

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.extensions.api.webapp.formcontrols.WebappFormControlRenderer`](./WebappFormControlRenderer.md))

**Returns:** `void`

### `getRenderer(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../editor/AuthorInplaceContext.md))

**Returns:** [`ro.sync.ecss.extensions.api.webapp.formcontrols.WebappFormControlRenderer`](./WebappFormControlRenderer.md)

### `getHTMLContentCss(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

