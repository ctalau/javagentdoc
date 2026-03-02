# Interface: `XMLRefactorUtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util.refactor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.refactor.XMLRefactorUtilAccess`

## Description

## Methods

### `refactorXMLResources(Iterator<URL> resourcesIterator, Function<URL,String> contentProvider, BiConsumer<URL,String> contentSaver, String operationID, Map<String,String> parameters, XMLRefactorProblemCollector problemsCollector)`

**Parameters:**
- `resourcesIterator` (`java.util.Iterator<java.net.URL>`): Iterator over the resources which need to be validated. Never `null`.
- `contentProvider` (`java.util.function.Function<java.net.URL,java.lang.String>`): Provides content to validate for a certain URL. Never `null`.
- `contentSaver` (`java.util.function.BiConsumer<java.net.URL,java.lang.String>`): Used to save the refactored content back. Never `null`.
- `operationID` (`java.lang.String`): Operation ID. Never `null`.
- `parameters` (`java.util.Map<java.lang.String,java.lang.String>`): Parameters map. Can be `null`
- `problemsCollector` ([`ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector`](./XMLRefactorProblemCollector.md)): The problems collector. Never `null`.

**Returns:** `void`

### `refactorXMLResources(Iterator<URL> resourcesIterator, Function<URL,String> contentProvider, BiConsumer<URL,String> contentSaver, String xsltStylesheetContent, XMLRefactorProblemCollector problemsCollector)`

**Parameters:**
- `resourcesIterator` (`java.util.Iterator<java.net.URL>`): Iterator over the resources which need to be validated. Never `null`.
- `contentProvider` (`java.util.function.Function<java.net.URL,java.lang.String>`): Provides content to validate for a certain URL. Never `null`.
- `contentSaver` (`java.util.function.BiConsumer<java.net.URL,java.lang.String>`): Used to save the refactored content back. Never `null`.
- `xsltStylesheetContent` (`java.lang.String`): The XSLT stylesheet input source. Never `null`.
- `problemsCollector` ([`ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector`](./XMLRefactorProblemCollector.md)): The problems collector.  Never `null`.

**Returns:** `void`

### `listAllAvailableOperations()`

**Returns:** `java.lang.String`

### `listOperationParameters(String operationID)`

**Parameters:**
- `operationID` (`java.lang.String`): The operation ID

**Returns:** `java.lang.String`

