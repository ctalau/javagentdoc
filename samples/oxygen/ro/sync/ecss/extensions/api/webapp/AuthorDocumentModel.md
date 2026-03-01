# Interface: `AuthorDocumentModel`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`

**Extends:** `java.io.Serializable`

## Methods

### `getAuthorDocumentController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../AuthorDocumentController.md)

### `createRenderer(`java.io.Writer` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](./AuthorNodesRenderer.md)

### `createRenderer(`java.io.Writer` arg0, [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../highlights/AuthorHighlighter.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorNodesRenderer`](./AuthorNodesRenderer.md)

### `createReader()`

**Returns:** `java.io.Reader`

### `getNodeIndexer()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorIdIndex<ro.sync.ecss.extensions.api.node.AuthorNode>`](./AuthorIdIndex.md)

### `getMarkersIndexer()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.AuthorIdIndex<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`](./AuthorIdIndex.md)

### `getCssContent()`

**Returns:** `java.lang.String`

### `getFloatingToolbarsJsonContent()`

**Returns:** `java.lang.String`

### `getProfilingConditionAttributesManager()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.profiling.ProfilingConditionAttributesManager`](profiling/ProfilingConditionAttributesManager.md)

### `getReviewController()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.review.ReviewController`](review/ReviewController.md)

### `getAttributesManager()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.attributes.AttributesManager`](attributes/AttributesManager.md)

### `getContentCompletionManager()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.cc.ContentCompletionManager`](cc/ContentCompletionManager.md)

### `getSelectionModel()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../AuthorSelectionAndCaretModel.md)

### `getValidationTask()`

**Returns:** `java.util.concurrent.Callable<java.util.List<ro.sync.document.DocumentPositionedInfo>>`

### `getEncoding()`

**Returns:** `java.lang.String`

### `getActionsManager()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebappActionsManager`](./WebappActionsManager.md)

### `getEditingHelper()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.formcontrols.FormControlEditingHelper`](formcontrols/FormControlEditingHelper.md)

### `getActionsSupport()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebappAuthorSchemaAwareActionsHandler`](./WebappAuthorSchemaAwareActionsHandler.md)

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)

### `getMessageProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebappMessagesProvider`](./WebappMessagesProvider.md)

### `getDocumentTypeId()`

**Returns:** `java.lang.String`

### `getValidationScenarios()`

**Returns:** `java.util.List<ro.sync.exml.editor.scenario.BaseScenario>`

### `getDocTypeProvider()`

**Returns:** `ro.sync.exml.editor.xmleditor.db`

### `getDPILocation([`ro.sync.document.DocumentPositionedInfo`](../../../../document/DocumentPositionedInfo.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.DPILocation`](./DPILocation.md)

### `dispose()`

**Returns:** `void`

### `getFindReplaceSupport()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.findreplace.FindReplaceSupport`](findreplace/FindReplaceSupport.md)

### `getWSEditor()`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../../../../exml/workspace/api/editor/WSEditor.md)

### `getUserId()`

**Returns:** `java.lang.String`

### `setUserId(`java.lang.String` arg0)`

**Returns:** `void`

### `getLicenseeId()`

**Returns:** `java.lang.String`

### `getLockManager()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebappLockManager`](./WebappLockManager.md)

### `getSpellchecker()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebappSpellchecker`](./WebappSpellchecker.md)

### `getQuickFixExecutor()`

**Returns:** `ro.sync.quickfix.QuickFixExecutor`

### `getDocumentValidator()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebappDocumentValidator`](./WebappDocumentValidator.md)

