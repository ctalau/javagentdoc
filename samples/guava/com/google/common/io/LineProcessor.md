# Interface: `LineProcessor`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LineProcessor`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A callback to be used with the streaming `readLines` methods.

 <p>`processLine` will be called for each line that is read, and should return `false` when you want to stop processing.
**Author:** Miles Barr
**Since:** 1.0

## Methods

### `processLine(`java.lang.String` line)`

**Returns:** `boolean`

This method will be called once for each line.
@param line the line read from the input, without delimiter
@return true to continue processing, false to stop

### `getResult()`

**Returns:** `T`

Return the result of processing all the lines.

