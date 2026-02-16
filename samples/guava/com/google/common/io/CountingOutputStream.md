# Class: `CountingOutputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CountingOutputStream`

**Extends:** `java.io.FilterOutputStream`

## Description

An OutputStream that counts the number of bytes written.
**Author:** Chris Nokleberg
**Since:** 1.0

## Fields

### `count`

**Type:** `long`

## Constructors

### `<init>(`java.io.OutputStream` out)`

Wraps another output stream, counting the number of bytes written.
@param out the output stream to be wrapped

## Methods

### `getCount()`

**Returns:** `long`

Returns the number of bytes written.

### `write(`byte[]` b, `int` off, `int` len)`

**Returns:** `void`

### `write(`int` b)`

**Returns:** `void`

### `close()`

**Returns:** `void`

