# Interface: `SAEditorInterface`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.SAEditorInterface`

**Extends:** [`ro.sync.exml.editor.ud`](./ud.md), [`ro.sync.exml.editor.ec`](./ec.md), [`ro.sync.exml.editor.pd`](./pd.md), [`ro.sync.exml.editor.ig`](./ig.md), [`ro.sync.exml.editor.wf`](./wf.md), [`ro.sync.ecss.dita.reference.keyref.c.c`](../../ecss/dita/reference/keyref/c/c.md)

## Methods

### `getEditorManager()`

**Returns:** [`ro.sync.exml.editor.bb`](./bb.md)

### `getParentFrame()`

**Returns:** `java.awt.Frame`

### `getTitle()`

**Returns:** `java.lang.String`

### `setFixedTitle(`java.lang.String` arg0)`

**Returns:** `void`

### `setFixedTooltip(`java.lang.String` arg0)`

**Returns:** `void`

### `getPropertiesMap()`

**Returns:** `java.util.LinkedHashMap`

### `goToNextError()`

**Returns:** `boolean`

### `goToPreviousError()`

**Returns:** `boolean`

### `getCurrentPage()`

**Returns:** [`ro.sync.exml.editor.mb`](./mb.md)

### `getTextPage()`

**Returns:** [`ro.sync.exml.editor.pagetext.g`](pagetext/g.md)

### `getContent()`

**Returns:** `java.lang.String`

### `revert()`

**Returns:** `void`

### `saveDocumentAsURL()`

**Returns:** `void`

### `setContent([`ro.sync.basic.io.NonCloseableReader`](../../basic/io/NonCloseableReader.md) arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

### `addValidationProblemsFilter([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](../workspace/api/editor/validation/ValidationProblemsFilter.md) arg0)`

**Returns:** `void`

### `removeValidationProblemsFilter([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](../workspace/api/editor/validation/ValidationProblemsFilter.md) arg0)`

**Returns:** `void`

### `saveDocumentAs(`java.net.URL` arg0)`

**Returns:** `void`

### `createInputStream()`

**Returns:** `java.io.InputStream`

