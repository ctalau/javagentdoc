# Interface: `WebappActionsManager`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappActionsManager`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorExtensionActionProvider`](../AuthorExtensionActionProvider.md)

## Description

## Methods

### `invokeOperation(String operationClassName, Map<String,Object> args, int imposedOffset)`

**Parameters:**
- `operationClassName` (`java.lang.String`): The name of the class that implements the operation.
- `args` (`java.util.Map<java.lang.String,java.lang.Object>`): The arguments in a representation that mimics JSON: JSON string
   maps to Java String, and JSON object maps to Java Map.
- `imposedOffset` (`int`): The offset where the action is to be executed. -1 if
   the action is to be executed for the current selection.

**Returns:** `void`

### `getExtensionActionsConfiguration()`

**Returns:** `java.util.Map<java.lang.String,java.lang.Object>`

