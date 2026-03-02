# Class: `Platform`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.Platform`

## Description

## Fields

### `DEST_TL`

**Type:** `java.lang.ThreadLocal<char[]>`

The starting size is
 1024 characters. If we grow past this we don't put it back in the threadlocal, we just keep
 going and grow as needed.

## Constructors

### `<init>()`

## Methods

### `charBufferFromThreadLocal()`

**Returns:** `char[]`

