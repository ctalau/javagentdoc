# Class: `MoreFiles`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.MoreFiles`

## Description

Static utilities for use with `Path` instances, intended to complement `Files`.

 <p>Many methods provided by Guava's `Files` class for `java.io.File` instances are
 now available via the JDK's `java.nio.file.Files` class for `Path` - check the JDK's
 class if a sibling method from `Files` appears to be missing from this class.
**Since:** 21.0
**Author:** Colin Decker

## Constructors

### `<init>()`

## Methods

### `asByteSource(`java.nio.file.Path` path, `java.nio.file.OpenOption[]` options)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a view of the given `path` as a `ByteSource`.

 <p>Any open options provided are used when opening streams to the file
 and may affect the behavior of the returned source and the streams it provides. See `StandardOpenOption` for the standard options that may be provided. Providing no options is
 equivalent to providing the `StandardOpenOption.READ READ` option.

### `asByteSink(`java.nio.file.Path` path, `java.nio.file.OpenOption[]` options)`

**Returns:** [`com.google.common.io.ByteSink`](./ByteSink.md)

Returns a view of the given `path` as a `ByteSink`.

 <p>Any open options provided are used when opening streams to the file
 and may affect the behavior of the returned sink and the streams it provides. See `StandardOpenOption` for the standard options that may be provided. Providing no options is
 equivalent to providing the `StandardOpenOption.CREATE CREATE`, `StandardOpenOption.TRUNCATE_EXISTING TRUNCATE_EXISTING` and `StandardOpenOption.WRITE WRITE` options.

### `asCharSource(`java.nio.file.Path` path, `java.nio.charset.Charset` charset, `java.nio.file.OpenOption[]` options)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Returns a view of the given `path` as a `CharSource` using the given `charset`.

 <p>Any open options provided are used when opening streams to the file
 and may affect the behavior of the returned source and the streams it provides. See `StandardOpenOption` for the standard options that may be provided. Providing no options is
 equivalent to providing the `StandardOpenOption.READ READ` option.

### `asCharSink(`java.nio.file.Path` path, `java.nio.charset.Charset` charset, `java.nio.file.OpenOption[]` options)`

**Returns:** [`com.google.common.io.CharSink`](./CharSink.md)

Returns a view of the given `path` as a `CharSink` using the given `charset`.

 <p>Any open options provided are used when opening streams to the file
 and may affect the behavior of the returned sink and the streams it provides. See `StandardOpenOption` for the standard options that may be provided. Providing no options is
 equivalent to providing the `StandardOpenOption.CREATE CREATE`, `StandardOpenOption.TRUNCATE_EXISTING TRUNCATE_EXISTING` and `StandardOpenOption.WRITE WRITE` options.

### `listFiles(`java.nio.file.Path` dir)`

**Returns:** [`com.google.common.collect.ImmutableList<java.nio.file.Path>`](../collect/ImmutableList.md)

Returns an immutable list of paths to the files contained in the given directory.
@throws NoSuchFileException if the file does not exist <i>(optional specific exception)</i>
@throws NotDirectoryException if the file could not be opened because it is not a directory
     <i>(optional specific exception)</i>
@throws IOException if an I/O error occurs

### `fileTraverser()`

**Returns:** [`com.google.common.graph.Traverser<java.nio.file.Path>`](../graph/Traverser.md)

Returns a `Traverser` instance for the file and directory tree. The returned traverser
 starts from a `Path` and will return all files and directories it encounters.

 <p>The returned traverser attempts to avoid following symbolic links to directories. However,
 the traverser cannot guarantee that it will not follow symbolic links to directories as it is
 possible for a directory to be replaced with a symbolic link between checking if the file is a
 directory and actually reading the contents of that directory.

 <p>If the `Path` passed to one of the traversal methods does not exist or is not a
 directory, no exception will be thrown and the returned `Iterable` will contain a single
 element: that path.

 <p>`DirectoryIteratorException` may be thrown when iterating `Iterable` instances
 created by this traverser if an `IOException` is thrown by a call to `listFiles(Path)`.

 <p>Example: `MoreFiles.fileTraverser().depthFirstPreOrder(Paths.get("/"))` may return the
 following paths: `["/", "/etc", "/etc/config.txt", "/etc/fonts", "/home", "/home/alice",
 ...]`
**Since:** 23.5

### `fileTreeChildren(`java.nio.file.Path` dir)`

**Returns:** `java.lang.Iterable<java.nio.file.Path>`

### `isDirectory(`java.nio.file.LinkOption[]` options)`

**Returns:** [`com.google.common.base.Predicate<java.nio.file.Path>`](../base/Predicate.md)

Returns a predicate that returns the result of `java.nio.file.Files.isDirectory(Path,
 LinkOption...)` on input paths with the given link options.

### `isDirectory(`java.nio.file.SecureDirectoryStream<java.nio.file.Path>` dir, `java.nio.file.Path` name, `java.nio.file.LinkOption[]` options)`

**Returns:** `boolean`

Returns whether or not the file with the given name in the given dir is a directory.

### `isRegularFile(`java.nio.file.LinkOption[]` options)`

**Returns:** [`com.google.common.base.Predicate<java.nio.file.Path>`](../base/Predicate.md)

Returns a predicate that returns the result of `java.nio.file.Files.isRegularFile(Path,
 LinkOption...)` on input paths with the given link options.

### `equal(`java.nio.file.Path` path1, `java.nio.file.Path` path2)`

**Returns:** `boolean`

Returns true if the files located by the given paths exist, are not directories, and contain
 the same bytes.
@throws IOException if an I/O error occurs
**Since:** 22.0

### `touch(`java.nio.file.Path` path)`

**Returns:** `void`

Like the unix command of the same name, creates an empty file or updates the last modified
 timestamp of the existing file at the given path to the current system time.

### `createParentDirectories(`java.nio.file.Path` path, `java.nio.file.attribute.FileAttribute<?>[]` attrs)`

**Returns:** `void`

Creates any necessary but nonexistent parent directories of the specified path. Note that if
 this operation fails, it may have succeeded in creating some (but not all) of the necessary
 parent directories. The parent directory is created with the given `attrs`.
@throws IOException if an I/O error occurs, or if any necessary but nonexistent parent
     directories of the specified file could not be created.

### `getFileExtension(`java.nio.file.Path` path)`

**Returns:** `java.lang.String`

Returns the <a href="http://en.wikipedia.org/wiki/Filename_extension">file extension</a> for
 the file at the given path, or the empty string if the file has no extension. The result does
 not include the '`.`'.

 <p><b>Note:</b> This method simply returns everything after the last '`.`' in the file's
 name as determined by `Path.getFileName`. It does not account for any filesystem-specific
 behavior that the `Path` API does not already account for. For example, on NTFS it will
 report `"txt"` as the extension for the filename `"foo.exe:.txt"` even though NTFS
 will drop the `":.txt"` part of the name when the file is actually created on the
 filesystem due to NTFS's <a href="https://goo.gl/vTpJi4">Alternate Data Streams</a>.

### `getNameWithoutExtension(`java.nio.file.Path` path)`

**Returns:** `java.lang.String`

Returns the file name without its <a href="http://en.wikipedia.org/wiki/Filename_extension">file extension</a> or path. This is
 similar to the `basename` unix command. The result does not include the '`.`'.

### `deleteRecursively(`java.nio.file.Path` path, [`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md) options)`

**Returns:** `void`

Deletes the file or directory at the given `path` recursively. Deletes symbolic links,
 not their targets (subject to the caveat below).

 <p>If an I/O exception occurs attempting to read, open or delete any file under the given
 directory, this method skips that file and continues. All such exceptions are collected and,
 after attempting to delete all files, an `IOException` is thrown containing those
 exceptions as suppressed exceptions.

 <h2>Warning: Security of recursive deletes</h2>

 <p>On a file system that supports symbolic links and does <i>not</i> support `SecureDirectoryStream`, it is possible for a recursive delete to delete files and directories
 that are <i>outside</i> the directory being deleted. This can happen if, after checking that a
 file is a directory (and not a symbolic link), that directory is replaced by a symbolic link to
 an outside directory before the call that opens the directory to read its entries.

 <p>By default, this method throws `InsecureRecursiveDeleteException` if it can't
 guarantee the security of recursive deletes. If you wish to allow the recursive deletes anyway,
 pass `RecursiveDeleteOption.ALLOW_INSECURE` to this method to override that behavior.
@throws NoSuchFileException if `path` does not exist <i>(optional specific exception)</i>
@throws InsecureRecursiveDeleteException if the security of recursive deletes can't be
     guaranteed for the file system and `RecursiveDeleteOption.ALLOW_INSECURE` was not
     specified
@throws IOException if `path` or any file in the subtree rooted at it can't be deleted
     for any reason

### `deleteDirectoryContents(`java.nio.file.Path` path, [`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md) options)`

**Returns:** `void`

Deletes all files within the directory at the given `path` recursively. Does not delete the directory itself. Deletes symbolic links, not their targets
 (subject to the caveat below). If `path` itself is a symbolic link to a directory, that
 link is followed and the contents of the directory it targets are deleted.

 <p>If an I/O exception occurs attempting to read, open or delete any file under the given
 directory, this method skips that file and continues. All such exceptions are collected and,
 after attempting to delete all files, an `IOException` is thrown containing those
 exceptions as suppressed exceptions.

 <h2>Warning: Security of recursive deletes</h2>

 <p>On a file system that supports symbolic links and does <i>not</i> support `SecureDirectoryStream`, it is possible for a recursive delete to delete files and directories
 that are <i>outside</i> the directory being deleted. This can happen if, after checking that a
 file is a directory (and not a symbolic link), that directory is replaced by a symbolic link to
 an outside directory before the call that opens the directory to read its entries.

 <p>By default, this method throws `InsecureRecursiveDeleteException` if it can't
 guarantee the security of recursive deletes. If you wish to allow the recursive deletes anyway,
 pass `RecursiveDeleteOption.ALLOW_INSECURE` to this method to override that behavior.
@throws NoSuchFileException if `path` does not exist <i>(optional specific exception)</i>
@throws NotDirectoryException if the file at `path` is not a directory <i>(optional
     specific exception)</i>
@throws InsecureRecursiveDeleteException if the security of recursive deletes can't be
     guaranteed for the file system and `RecursiveDeleteOption.ALLOW_INSECURE` was not
     specified
@throws IOException if one or more files can't be deleted for any reason

### `deleteRecursivelySecure(`java.nio.file.SecureDirectoryStream<java.nio.file.Path>` dir, `java.nio.file.Path` path)`

**Returns:** `java.util.Collection<java.io.IOException>`

Secure recursive delete using `SecureDirectoryStream`. Returns a collection of exceptions
 that occurred or null if no exceptions were thrown.

### `deleteDirectoryContentsSecure(`java.nio.file.SecureDirectoryStream<java.nio.file.Path>` dir)`

**Returns:** `java.util.Collection<java.io.IOException>`

Secure method for deleting the contents of a directory using `SecureDirectoryStream`.
 Returns a collection of exceptions that occurred or null if no exceptions were thrown.

### `deleteRecursivelyInsecure(`java.nio.file.Path` path)`

**Returns:** `java.util.Collection<java.io.IOException>`

Insecure recursive delete for file systems that don't support `SecureDirectoryStream`.
 Returns a collection of exceptions that occurred or null if no exceptions were thrown.

### `deleteDirectoryContentsInsecure(`java.nio.file.DirectoryStream<java.nio.file.Path>` dir)`

**Returns:** `java.util.Collection<java.io.IOException>`

Simple, insecure method for deleting the contents of a directory for file systems that don't
 support `SecureDirectoryStream`. Returns a collection of exceptions that occurred or null
 if no exceptions were thrown.

### `getParentPath(`java.nio.file.Path` path)`

**Returns:** `java.nio.file.Path`

Returns a path to the parent directory of the given path. If the path actually has a parent
 path, this is simple. Otherwise, we need to do some trickier things. Returns null if the path
 is a root or is the empty path.

### `checkAllowsInsecure(`java.nio.file.Path` path, [`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md) options)`

**Returns:** `void`

Checks that the given options allow an insecure delete, throwing an exception if not.

### `addException(`java.util.Collection<java.io.IOException>` exceptions, `java.io.IOException` e)`

**Returns:** `java.util.Collection<java.io.IOException>`

Adds the given exception to the given collection, creating the collection if it's null. Returns
 the collection.

### `concat(`java.util.Collection<java.io.IOException>` exceptions, `java.util.Collection<java.io.IOException>` other)`

**Returns:** `java.util.Collection<java.io.IOException>`

Concatenates the contents of the two given collections of exceptions. If either collection is
 null, the other collection is returned. Otherwise, the elements of `other` are added to
 `exceptions` and `exceptions` is returned.

### `throwDeleteFailed(`java.nio.file.Path` path, `java.util.Collection<java.io.IOException>` exceptions)`

**Returns:** `void`

Throws an exception indicating that one or more files couldn't be deleted when deleting `path` or its contents.

 <p>If there is only one exception in the collection, and it is a `NoSuchFileException`
 thrown because `path` itself didn't exist, then throws that exception. Otherwise, the
 thrown exception contains all the exceptions in the given collection as suppressed exceptions.

### `pathNotFound(`java.nio.file.Path` path, `java.util.Collection<java.io.IOException>` exceptions)`

**Returns:** `java.nio.file.NoSuchFileException`

