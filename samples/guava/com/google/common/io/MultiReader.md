# Class: `MultiReader`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.MultiReader`

**Extends:** `java.io.Reader`

## Description

A `Reader` that concatenates multiple readers.
**Author:** Bin Zhu
**Since:** 1.0

## Fields

### `it`

**Type:** `java.util.Iterator<? extends com.google.common.io.CharSource>`

### `current`

**Type:** `java.io.Reader`

## Constructors

### `<init>(`java.util.Iterator<? extends com.google.common.io.CharSource>` readers)`

## Methods

### `advance()`

**Returns:** `void`

Closes the current reader and opens the next one, if any.

### `read(`char[]` cbuf, `int` off, `int` len)`

**Returns:** `int`

### `skip(`long` n)`

**Returns:** `long`

### `ready()`

**Returns:** `boolean`

### `close()`

**Returns:** `void`

