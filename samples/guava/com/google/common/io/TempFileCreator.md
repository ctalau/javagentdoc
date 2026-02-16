# Class: `TempFileCreator`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.TempFileCreator`

## Description

Creates temporary files and directories whose permissions are restricted to the current user or,
 in the case of Android, the current app. If that is not possible (as is the case under the very
 old Android Ice Cream Sandwich release), then this class throws an exception instead of creating
 a file or directory that would be more accessible.

## Fields

### `INSTANCE`

**Type:** [`com.google.common.io.TempFileCreator`](./TempFileCreator.md)

## Constructors

### `<init>()`

## Methods

### `createTempDir()`

**Returns:** [`java.io.File`](../../../../java/io/File.md)

@throws IllegalStateException if the directory could not be created (to implement the contract
     of {@link Files#createTempDir()}, such as if the system does not support creating temporary
     directories securely

### `createTempFile(`java.lang.String` prefix)`

**Returns:** [`java.io.File`](../../../../java/io/File.md)

### `pickSecureCreator()`

**Returns:** [`com.google.common.io.TempFileCreator`](./TempFileCreator.md)

### `testMakingUserPermissionsFromScratch()`

**Returns:** `void`

Creates the permissions normally used for Windows filesystems, looking up the user afresh, even
 if previous calls have initialized the {@code PermissionSupplier} fields.

 <p>This lets us test the effects of different values of the {@code user.name} system property
 without needing a separate VM or classloader.

