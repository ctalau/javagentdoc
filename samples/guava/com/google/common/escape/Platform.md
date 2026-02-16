# Class: `Platform`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.Platform`

## Description

Methods factored out so that they can be emulated differently in GWT.
@author Jesse Wilson

## Fields

### `DEST_TL`

**Type:** `java.lang.ThreadLocal<char[]>`

A thread-local destination buffer to keep us from creating new buffers. The starting size is
 1024 characters. If we grow past this we don't put it back in the threadlocal, we just keep
 going and grow as needed.

## Constructors

### `<init>()`

## Methods

### `charBufferFromThreadLocal()`

**Returns:** `char[]`

Returns a thread-local 1024-char array.

