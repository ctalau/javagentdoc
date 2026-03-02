# Interface: `SAEditorInterface`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.SAEditorInterface`

**Extends:** `ro.sync.exml.editor.ud`, `ro.sync.exml.editor.ec`, `ro.sync.exml.editor.pd`, `ro.sync.exml.editor.ig`, `ro.sync.exml.editor.wf`, `ro.sync.ecss.dita.reference.keyref.c.c`

## Methods

### `getEditorManager()`

**Returns:** `ro.sync.exml.editor.bb`

### `getParentFrame()`

**Returns:** `java.awt.Frame`

### `getTitle()`

**Returns:** `java.lang.String`

### `setFixedTitle(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setFixedTooltip(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getPropertiesMap()`

**Returns:** `java.util.LinkedHashMap`

### `goToNextError()`

**Returns:** `boolean`

### `goToPreviousError()`

**Returns:** `boolean`

### `getCurrentPage()`

**Returns:** `ro.sync.exml.editor.mb`

### `getTextPage()`

**Returns:** `ro.sync.exml.editor.pagetext.g`

### `getContent()`

**Returns:** `java.lang.String`

### `revert()`

**Returns:** `void`

### `saveDocumentAsURL()`

**Returns:** `void`

### `setContent(ro.sync.basic.io.NonCloseableReader arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`ro.sync.basic.io.NonCloseableReader`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `void`

### `addValidationProblemsFilter(ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](../workspace/api/editor/validation/ValidationProblemsFilter.md))

**Returns:** `void`

### `removeValidationProblemsFilter(ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](../workspace/api/editor/validation/ValidationProblemsFilter.md))

**Returns:** `void`

### `saveDocumentAs(java.net.URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `void`

### `createInputStream()`

**Returns:** `java.io.InputStream`

