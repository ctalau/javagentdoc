# Class: `CountingInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CountingInputStream`

**Extends:** `java.io.FilterInputStream`

## Description

An `InputStream` that counts the number of bytes read.
**Author:** Chris Nokleberg
**Since:** 1.0

## Fields

### `count`

**Type:** `long`

### `mark`

**Type:** `long`

## Constructors

### `<init>(`java.io.InputStream` in)`

Wraps another input stream, counting the number of bytes read.
@param in the input stream to be wrapped

## Methods

### `getCount()`

**Returns:** `long`

Returns the number of bytes read.

### `read()`

**Returns:** `int`

### `read(`byte[]` b, `int` off, `int` len)`

**Returns:** `int`

### `skip(`long` n)`

**Returns:** `long`

### `mark(`int` readlimit)`

**Returns:** `void`

### `reset()`

**Returns:** `void`

