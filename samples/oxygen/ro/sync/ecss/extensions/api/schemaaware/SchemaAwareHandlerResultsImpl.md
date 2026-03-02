# Class: `SchemaAwareHandlerResultsImpl`

**Package:** [`ro.sync.ecss.extensions.api.schemaaware`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResultsImpl`

**Implements:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](./SchemaAwareHandlerResult.md)

## Description

## Fields

### `resultsMap`

**Type:** `java.util.HashMap<java.lang.String,java.lang.Object>`

### `operationID`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String operationID)`

**Parameters:**
- `operationID` (`java.lang.String`): One of #TYPE_HANDLE_INSERT_FRAGMENT_OPERATION for insert fragment operation or 
 #TYPE_HANDLE_TYPING_OPERATION for typing operation.

## Methods

### `addResult(java.lang.String resultKey, java.lang.Object resultValue)`

**Returns:** `void`

**Parameters:**
- `resultKey` (`java.lang.String`): The result key. Constants are defined in SchemaAwareHandlerResult}.
- `resultValue` (`java.lang.Object`): The result value.

### `getResult(java.lang.String resultId)`

**Returns:** `java.lang.Object`

**Parameters:**
- `resultId` (`java.lang.String`)

### `getType()`

**Returns:** `java.lang.String`

