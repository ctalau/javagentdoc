# Interface: `XMLRefactorUtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util.refactor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.refactor.XMLRefactorUtilAccess`

## Description

## Methods

### `refactorXMLResources(`java.util.Iterator<java.net.URL>` resourcesIterator, `java.util.function.Function<java.net.URL,java.lang.String>` contentProvider, `java.util.function.BiConsumer<java.net.URL,java.lang.String>` contentSaver, `java.lang.String` operationID, `java.util.Map<java.lang.String,java.lang.String>` parameters, [`ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector`](./XMLRefactorProblemCollector.md) problemsCollector)`

**Returns:** `void`

### `refactorXMLResources(`java.util.Iterator<java.net.URL>` resourcesIterator, `java.util.function.Function<java.net.URL,java.lang.String>` contentProvider, `java.util.function.BiConsumer<java.net.URL,java.lang.String>` contentSaver, `java.lang.String` xsltStylesheetContent, [`ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector`](./XMLRefactorProblemCollector.md) problemsCollector)`

**Returns:** `void`

### `listAllAvailableOperations()`

**Returns:** `java.lang.String`

### `listOperationParameters(`java.lang.String` operationID)`

**Returns:** `java.lang.String`

