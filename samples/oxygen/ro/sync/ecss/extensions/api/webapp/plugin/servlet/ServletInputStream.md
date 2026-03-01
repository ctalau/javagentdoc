# Class: `ServletInputStream`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletInputStream`

**Extends:** `java.io.InputStream`

## Description

## Constructors

### `<init>()`

## Methods

### `readLine(`byte[]` b, `int` off, `int` len)`

**Returns:** `int`

Starting at an offset, reads bytes into an array, until it reads a
 certain number of bytes or reaches a newline character, which it reads into the array as well.

 

 This method returns -1 if it reaches the end of the input stream before reading the maximum number of bytes.

