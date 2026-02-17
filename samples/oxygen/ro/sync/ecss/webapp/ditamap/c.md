# Class: `c`

**Package:** [`ro.sync.ecss.webapp.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.webapp.ditamap.c`

**Implements:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](../../extensions/api/webapp/AuthorNodesRenderer.md)

## Fields

### `k`

**Type:** [`ro.sync.ecss.dom.z`](../../dom/z.md)

### `f`

**Type:** [`ro.sync.ecss.extensions.api.webapp.AuthorIdIndex<ro.sync.ecss.extensions.api.node.AuthorNode>`](../../extensions/api/webapp/AuthorIdIndex.md)

### `j`

**Type:** [`ro.sync.ecss.dita.mapeditor.b.o`](../../dita/mapeditor/b/o.md)

### `i`

**Type:** `java.io.Writer`

### `h`

**Type:** [`ro.sync.ecss.g.b`](../../g/b.md)

### `b`

**Type:** [`ro.sync.ecss.webapp.ditamap.d`](./d.md)

### `d`

**Type:** [`ro.sync.ecss.conditions.y`](../../conditions/y.md)

### `e`

**Type:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorNode,java.util.Set<java.lang.String>>`

### `c`

**Type:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)

### `g`

**Type:** [`ro.sync.ecss.dita.map.checker.d.f`](../../dita/map/checker/d/f.md)

## Constructors

### `<init>([`ro.sync.ecss.extensions.api.webapp.AuthorIdIndex<ro.sync.ecss.extensions.api.node.AuthorNode>`](../../extensions/api/webapp/AuthorIdIndex.md) arg0, [`ro.sync.ecss.extensions.api.webapp.AuthorIdIndex<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`](../../extensions/api/webapp/AuthorIdIndex.md) arg1, [`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../extensions/api/node/AuthorDocument.md) arg2, `java.io.Writer` arg3, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md) arg4, [`ro.sync.ecss.webapp.ditamap.d`](./d.md) arg5, [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) arg6, [`ro.sync.exml.editor.xmleditor.db`](../../../exml/editor/xmleditor/db.md) arg7, `java.lang.String` arg8, [`ro.sync.ecss.dita.map.checker.d.f`](../../dita/map/checker/d/f.md) arg9)`

## Methods

### `render()`

**Returns:** `void`

### `renderNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) arg0)`

**Returns:** `void`

### `b([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) arg0)`

**Returns:** [`ro.sync.ecss.webapp.ditamap.DITAMapNode`](./DITAMapNode.md)

### `g([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) arg0)`

**Returns:** `boolean`

### `f([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) arg0)`

**Returns:** `java.util.List<ro.sync.ecss.webapp.ditamap.DITAMapNode>`

### `d([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../extensions/api/node/AuthorElement.md) arg0)`

**Returns:** [`ro.sync.ecss.webapp.ditamap.DITAMapNode._b`](DITAMapNode/_b.md)

### `c([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../extensions/api/node/AuthorElement.md) arg0)`

**Returns:** [`ro.sync.ecss.dita.HrefInfo`](../../dita/HrefInfo.md)

### `e([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../extensions/api/node/AuthorElement.md) arg0, [`ro.sync.ecss.dita.HrefInfo`](../../dita/HrefInfo.md) arg1)`

**Returns:** `java.lang.String`

### `getRenderedContentType()`

**Returns:** `java.lang.String`

