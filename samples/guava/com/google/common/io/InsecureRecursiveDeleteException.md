# Class: `InsecureRecursiveDeleteException`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.InsecureRecursiveDeleteException`

**Extends:** `java.nio.file.FileSystemException`

## Description

Exception indicating that a recursive delete can't be performed because the file system does not
 have the support necessary to guarantee that it is not vulnerable to race conditions that would
 allow it to delete files and directories outside of the directory being deleted (i.e., `SecureDirectoryStream` is not supported).

 <p>`RecursiveDeleteOption.ALLOW_INSECURE` can be used to force the recursive delete method
 to proceed anyway.
**Since:** 21.0
**Author:** Colin Decker

## Constructors

### `<init>(`java.lang.String` file)`

