# Class: `TempFileCreator`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.TempFileCreator`

## Description

If that is not possible (as is the case under the very
 old Android Ice Cream Sandwich release), then this class throws an exception instead of creating
 a file or directory that would be more accessible.

## Fields

### `INSTANCE`

**Type:** [`com.google.common.io.TempFileCreator`](./TempFileCreator.md)

## Constructors

### `<init>()`

## Methods

### `createTempDir()`

**Returns:** `java.io.File`

### `createTempFile(java.lang.String prefix)`

**Returns:** `java.io.File`

**Parameters:**
- `prefix` (`java.lang.String`)

### `pickSecureCreator()`

**Returns:** [`com.google.common.io.TempFileCreator`](./TempFileCreator.md)

### `testMakingUserPermissionsFromScratch()`

**Returns:** `void`

This lets us test the effects of different values of the user.name system property
 without needing a separate VM or classloader.

