# Interface: `LineProcessor`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LineProcessor`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

#processLine will be called for each line that is read, and should return 
 false when you want to stop processing.

## Methods

### `processLine(java.lang.String line)`

**Returns:** `boolean`

**Parameters:**
- `line` (`java.lang.String`): the line read from the input, without delimiter

### `getResult()`

**Returns:** `T`

