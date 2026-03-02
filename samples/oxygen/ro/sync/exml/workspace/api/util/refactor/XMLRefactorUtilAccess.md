# Interface: `XMLRefactorUtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util.refactor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.refactor.XMLRefactorUtilAccess`

## Description

## Methods

### `refactorXMLResources(java.util.Iterator<java.net.URL> resourcesIterator, java.util.function.Function<java.net.URL,java.lang.String> contentProvider, java.util.function.BiConsumer<java.net.URL,java.lang.String> contentSaver, java.lang.String operationID, java.util.Map<java.lang.String,java.lang.String> parameters, ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector problemsCollector)`

**Returns:** `void`

**Parameters:**
- `resourcesIterator` (`java.util.Iterator<java.net.URL>`): Iterator over the resources which need to be validated. Never `null`.
- `contentProvider` (`java.util.function.Function<java.net.URL,java.lang.String>`): Provides content to validate for a certain URL. Never `null`.
- `contentSaver` (`java.util.function.BiConsumer<java.net.URL,java.lang.String>`): Used to save the refactored content back. Never `null`.
- `operationID` (`java.lang.String`): Operation ID. Never `null`.
- `parameters` (`java.util.Map<java.lang.String,java.lang.String>`): Parameters map. Can be `null`
- `problemsCollector` ([`ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector`](./XMLRefactorProblemCollector.md)): The problems collector. Never `null`.

### `refactorXMLResources(java.util.Iterator<java.net.URL> resourcesIterator, java.util.function.Function<java.net.URL,java.lang.String> contentProvider, java.util.function.BiConsumer<java.net.URL,java.lang.String> contentSaver, java.lang.String xsltStylesheetContent, ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector problemsCollector)`

**Returns:** `void`

**Parameters:**
- `resourcesIterator` (`java.util.Iterator<java.net.URL>`): Iterator over the resources which need to be validated. Never `null`.
- `contentProvider` (`java.util.function.Function<java.net.URL,java.lang.String>`): Provides content to validate for a certain URL. Never `null`.
- `contentSaver` (`java.util.function.BiConsumer<java.net.URL,java.lang.String>`): Used to save the refactored content back. Never `null`.
- `xsltStylesheetContent` (`java.lang.String`): The XSLT stylesheet input source. Never `null`.
- `problemsCollector` ([`ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector`](./XMLRefactorProblemCollector.md)): The problems collector.  Never `null`.

### `listAllAvailableOperations()`

**Returns:** `java.lang.String`

### `listOperationParameters(java.lang.String operationID)`

**Returns:** `java.lang.String`

**Parameters:**
- `operationID` (`java.lang.String`): The operation ID

