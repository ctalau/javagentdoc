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

### `<init>(String operationID)`

**Parameters:**
- `operationID` (`java.lang.String`): One of #TYPE_HANDLE_INSERT_FRAGMENT_OPERATION for insert fragment operation or 
   #TYPE_HANDLE_TYPING_OPERATION for typing operation.

## Methods

### `addResult(String resultKey, Object resultValue)`

**Parameters:**
- `resultKey` (`java.lang.String`): The result key. Constants are defined in SchemaAwareHandlerResult}.
- `resultValue` (`java.lang.Object`): The result value.

**Returns:** `void`

### `getResult(String resultId)`

**Parameters:**
- `resultId` (`java.lang.String`)

**Returns:** `java.lang.Object`

### `getType()`

**Returns:** `java.lang.String`

