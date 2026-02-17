# Class: `DITAMapDocumentModelImpl`

**Package:** [`ro.sync.ecss.webapp.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.webapp.ditamap.DITAMapDocumentModelImpl`

**Extends:** [`ro.sync.ecss.webapp.BaseAuthorDocumentModel`](../BaseAuthorDocumentModel.md)

**Implements:** [`ro.sync.ecss.webapp.ditamap.d`](./d.md), [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md), [`ro.sync.ecss.webapp.ditamap.DITAMapDocumentModel`](./DITAMapDocumentModel.md)

## Fields

### `jwz`

**Type:** [`ro.sync.i18n.c`](../../../i18n/c.md)

### `cxz`

**Type:** [`ro.sync.ecss.webapp.dita.d`](../dita/d.md)

### `bxz`

**Type:** `java.util.function.Supplier<ro.sync.ecss.dita.map.checker.d.f>`

### `dxz`

**Type:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](../../extensions/api/AuthorExtensionStateListener.md)

## Constructors

### `<init>([`ro.sync.ecss.g.j`](../../g/j.md) arg0, [`ro.sync.exml.editor.xmleditor.db`](../../../exml/editor/xmleditor/db.md) arg1, [`ro.sync.exml.editor.k.d`](../../../exml/editor/k/d.md) arg2, [`ro.sync.ecss.extensions.api.webapp.cc.ContentCompletionManager`](../../extensions/api/webapp/cc/ContentCompletionManager.md) arg3, [`ro.sync.ecss.extensions.api.webapp.review.ReviewController`](../../extensions/api/webapp/review/ReviewController.md) arg4, [`ro.sync.ecss.webapp.n<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`](../n.md) arg5, [`ro.sync.ecss.webapp.n<ro.sync.ecss.extensions.api.node.AuthorNode>`](../n.md) arg6, [`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../extensions/api/AuthorSelectionAndCaretModel.md) arg7, [`ro.sync.ecss.webapp.formcontrols.n`](../formcontrols/n.md) arg8, [`ro.sync.ecss.extensions.api.webapp.WebappActionsManager`](../../extensions/api/webapp/WebappActionsManager.md) arg9, [`ro.sync.ecss.webapp.t`](../t.md) arg10, [`ro.sync.ecss.component.b.c`](../../component/b/c.md) arg11, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md) arg12, [`ro.sync.ecss.webapp.cb`](../cb.md) arg13, [`ro.sync.ecss.webapp.d.k`](../d/k.md) arg14, [`ro.sync.ecss.webapp.c.b`](../c/b.md) arg15, `java.lang.String` arg16, [`ro.sync.ecss.webapp.i.j`](../i/j.md) arg17, [`ro.sync.ecss.webapp.v`](../v.md) arg18, `java.lang.String` arg19, [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](../../extensions/api/AuthorExtensionStateListener.md) arg20)`

## Methods

### `addLKeyChangedListener()`

**Returns:** `void`

### `fragmentContainsKeyRelatedAttributes([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../extensions/api/node/AuthorDocumentFragment.md) arg0)`

**Returns:** `boolean`

### `containsKeyAttrs([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) arg0)`

**Returns:** `boolean`

### `nodeContainsKeyRelatedAttributes([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) arg0)`

**Returns:** `boolean`

### `recomputeKeysContext()`

**Returns:** `void`

### `createJSONRenderer(`java.io.Writer` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

### `createDocumentBuilder()`

**Returns:** [`ro.sync.ecss.webapp.c`](../c.md)

### `createJSONRendererInternal(`java.io.Writer` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

### `forceFullRendering()`

**Returns:** `void`

### `createRenderer(`java.io.Writer` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

### `createRenderer(`java.io.Writer` arg0, [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../extensions/api/highlights/AuthorHighlighter.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

### `getTopicrefRenderer()`

**Returns:** [`ro.sync.ecss.webapp.dita.d`](../dita/d.md)

### `getDitamapEntryTitle([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../extensions/api/node/AuthorElement.md) arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** [`ro.sync.ecss.webapp.dita.DITAMapEntryTitleInfo`](../dita/DITAMapEntryTitleInfo.md)

### `getContextKeyManager()`

**Returns:** [`ro.sync.ecss.dita.ContextKeyManager`](../../dita/ContextKeyManager.md)

### `getConditionProcessorProvider()`

**Returns:** `java.util.function.Supplier<ro.sync.ecss.dita.map.checker.d.f>`

### `getTopicrefTitleRendererHelper()`

**Returns:** [`ro.sync.ecss.webapp.dita.d`](../dita/d.md)

### `createContextKeyManager([`ro.sync.ecss.webapp.access.e`](../access/e.md) arg0)`

**Returns:** [`ro.sync.ecss.dita.ContextKeyManager`](../../dita/ContextKeyManager.md)

### `invalidateTitle([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../extensions/api/node/AuthorElement.md) arg0)`

**Returns:** `void`

