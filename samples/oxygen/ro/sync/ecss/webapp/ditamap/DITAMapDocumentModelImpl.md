# Class: `DITAMapDocumentModelImpl`

**Package:** [`ro.sync.ecss.webapp.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.webapp.ditamap.DITAMapDocumentModelImpl`

**Extends:** `ro.sync.ecss.webapp.BaseAuthorDocumentModel`

**Implements:** `ro.sync.ecss.webapp.ditamap.d`, [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md), [`ro.sync.ecss.webapp.ditamap.DITAMapDocumentModel`](./DITAMapDocumentModel.md)

## Fields

### `jwz`

**Type:** `ro.sync.i18n.c`

### `cxz`

**Type:** `ro.sync.ecss.webapp.dita.d`

### `bxz`

**Type:** `java.util.function.Supplier<ro.sync.ecss.dita.map.checker.d.f>`

### `dxz`

**Type:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](../../extensions/api/AuthorExtensionStateListener.md)

## Constructors

### `<init>(j arg0, db arg1, d arg2, ContentCompletionManager arg3, ReviewController arg4, n<AuthorPersistentHighlight> arg5, n<AuthorNode> arg6, AuthorSelectionAndCaretModel arg7, n arg8, WebappActionsManager arg9, t arg10, c arg11, AuthorAccess arg12, cb arg13, k arg14, b arg15, String arg16, j arg17, v arg18, String arg19, AuthorExtensionStateListener arg20)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.j`)
- `arg1` (`ro.sync.exml.editor.xmleditor.db`)
- `arg2` (`ro.sync.exml.editor.k.d`)
- `arg3` ([`ro.sync.ecss.extensions.api.webapp.cc.ContentCompletionManager`](../../extensions/api/webapp/cc/ContentCompletionManager.md))
- `arg4` ([`ro.sync.ecss.extensions.api.webapp.review.ReviewController`](../../extensions/api/webapp/review/ReviewController.md))
- `arg5` (`ro.sync.ecss.webapp.n<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`)
- `arg6` (`ro.sync.ecss.webapp.n<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg7` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../extensions/api/AuthorSelectionAndCaretModel.md))
- `arg8` (`ro.sync.ecss.webapp.formcontrols.n`)
- `arg9` ([`ro.sync.ecss.extensions.api.webapp.WebappActionsManager`](../../extensions/api/webapp/WebappActionsManager.md))
- `arg10` (`ro.sync.ecss.webapp.t`)
- `arg11` (`ro.sync.ecss.component.b.c`)
- `arg12` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))
- `arg13` (`ro.sync.ecss.webapp.cb`)
- `arg14` (`ro.sync.ecss.webapp.d.k`)
- `arg15` (`ro.sync.ecss.webapp.c.b`)
- `arg16` (`java.lang.String`)
- `arg17` (`ro.sync.ecss.webapp.i.j`)
- `arg18` (`ro.sync.ecss.webapp.v`)
- `arg19` (`java.lang.String`)
- `arg20` ([`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](../../extensions/api/AuthorExtensionStateListener.md))

## Methods

### `addLKeyChangedListener()`

**Returns:** `void`

### `fragmentContainsKeyRelatedAttributes(AuthorDocumentFragment arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../extensions/api/node/AuthorDocumentFragment.md))

**Returns:** `boolean`

### `containsKeyAttrs(AuthorNode arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `boolean`

### `nodeContainsKeyRelatedAttributes(AuthorNode arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `boolean`

### `recomputeKeysContext()`

**Returns:** `void`

### `createJSONRenderer(Writer arg0)`

**Parameters:**
- `arg0` (`java.io.Writer`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

### `createDocumentBuilder()`

**Returns:** `ro.sync.ecss.webapp.c`

### `createJSONRendererInternal(Writer arg0)`

**Parameters:**
- `arg0` (`java.io.Writer`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

### `forceFullRendering()`

**Returns:** `void`

### `createRenderer(Writer arg0)`

**Parameters:**
- `arg0` (`java.io.Writer`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

### `createRenderer(Writer arg0, AuthorHighlighter arg1)`

**Parameters:**
- `arg0` (`java.io.Writer`)
- `arg1` ([`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../extensions/api/highlights/AuthorHighlighter.md))

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

### `getTopicrefRenderer()`

**Returns:** `ro.sync.ecss.webapp.dita.d`

### `getDitamapEntryTitle(AuthorElement arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../extensions/api/node/AuthorElement.md))
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `ro.sync.ecss.webapp.dita.DITAMapEntryTitleInfo`

### `getContextKeyManager()`

**Returns:** [`ro.sync.ecss.dita.ContextKeyManager`](../../dita/ContextKeyManager.md)

### `getConditionProcessorProvider()`

**Returns:** `java.util.function.Supplier<ro.sync.ecss.dita.map.checker.d.f>`

### `getTopicrefTitleRendererHelper()`

**Returns:** `ro.sync.ecss.webapp.dita.d`

### `createContextKeyManager(e arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.webapp.access.e`)

**Returns:** [`ro.sync.ecss.dita.ContextKeyManager`](../../dita/ContextKeyManager.md)

### `invalidateTitle(AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../extensions/api/node/AuthorElement.md))

**Returns:** `void`

