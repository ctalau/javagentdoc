# Class: `MoreFiles`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.MoreFiles`

## Description

Many methods provided by Guava's Files class for java.io.File instances are
 now available via the JDK's java.nio.file.Files class for Path - check the JDK's
 class if a sibling method from Files appears to be missing from this class.

## Constructors

### `<init>()`

## Methods

### `asByteSource(Path path, OpenOption[] options)`

Any open options provided are used when opening streams to the file
 and may affect the behavior of the returned source and the streams it provides. See StandardOpenOption for the standard options that may be provided. Providing no options is
 equivalent to providing the READ option.

**Parameters:**
- `path` (`java.nio.file.Path`)
- `options` (`java.nio.file.OpenOption[]`)

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

### `asByteSink(Path path, OpenOption[] options)`

Any open options provided are used when opening streams to the file
 and may affect the behavior of the returned sink and the streams it provides. See StandardOpenOption for the standard options that may be provided. Providing no options is
 equivalent to providing the CREATE, TRUNCATE_EXISTING and WRITE options.

**Parameters:**
- `path` (`java.nio.file.Path`)
- `options` (`java.nio.file.OpenOption[]`)

**Returns:** [`com.google.common.io.ByteSink`](./ByteSink.md)

### `asCharSource(Path path, Charset charset, OpenOption[] options)`

Any open options provided are used when opening streams to the file
 and may affect the behavior of the returned source and the streams it provides. See StandardOpenOption for the standard options that may be provided. Providing no options is
 equivalent to providing the READ option.

**Parameters:**
- `path` (`java.nio.file.Path`)
- `charset` (`java.nio.charset.Charset`)
- `options` (`java.nio.file.OpenOption[]`)

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

### `asCharSink(Path path, Charset charset, OpenOption[] options)`

Any open options provided are used when opening streams to the file
 and may affect the behavior of the returned sink and the streams it provides. See StandardOpenOption for the standard options that may be provided. Providing no options is
 equivalent to providing the CREATE, TRUNCATE_EXISTING and WRITE options.

**Parameters:**
- `path` (`java.nio.file.Path`)
- `charset` (`java.nio.charset.Charset`)
- `options` (`java.nio.file.OpenOption[]`)

**Returns:** [`com.google.common.io.CharSink`](./CharSink.md)

### `listFiles(Path dir)`

**Parameters:**
- `dir` (`java.nio.file.Path`)

**Returns:** [`com.google.common.collect.ImmutableList<java.nio.file.Path>`](../collect/ImmutableList.md)

### `fileTraverser()`

The returned traverser
 starts from a Path and will return all files and directories it encounters.

 
The returned traverser attempts to avoid following symbolic links to directories. However,
 the traverser cannot guarantee that it will not follow symbolic links to directories as it is
 possible for a directory to be replaced with a symbolic link between checking if the file is a
 directory and actually reading the contents of that directory.

 
If the Path passed to one of the traversal methods does not exist or is not a
 directory, no exception will be thrown and the returned Iterable will contain a single
 element: that path.

 
DirectoryIteratorException may be thrown when iterating Iterable instances
 created by this traverser if an IOException is thrown by a call to #listFiles(Path).

 
Example: MoreFiles.fileTraverser().depthFirstPreOrder(Paths.get("/")) may return the
 following paths: ["/", "/etc", "/etc/config.txt", "/etc/fonts", "/home", "/home/alice",
 ...]

**Returns:** [`com.google.common.graph.Traverser<java.nio.file.Path>`](../graph/Traverser.md)

### `fileTreeChildren(Path dir)`

**Parameters:**
- `dir` (`java.nio.file.Path`)

**Returns:** `java.lang.Iterable<java.nio.file.Path>`

### `isDirectory(LinkOption[] options)`

**Parameters:**
- `options` (`java.nio.file.LinkOption[]`)

**Returns:** [`com.google.common.base.Predicate<java.nio.file.Path>`](../base/Predicate.md)

### `isDirectory(SecureDirectoryStream<Path> dir, Path name, LinkOption[] options)`

**Parameters:**
- `dir` (`java.nio.file.SecureDirectoryStream<java.nio.file.Path>`)
- `name` (`java.nio.file.Path`)
- `options` (`java.nio.file.LinkOption[]`)

**Returns:** `boolean`

### `isRegularFile(LinkOption[] options)`

**Parameters:**
- `options` (`java.nio.file.LinkOption[]`)

**Returns:** [`com.google.common.base.Predicate<java.nio.file.Path>`](../base/Predicate.md)

### `equal(Path path1, Path path2)`

**Parameters:**
- `path1` (`java.nio.file.Path`)
- `path2` (`java.nio.file.Path`)

**Returns:** `boolean`

### `touch(Path path)`

**Parameters:**
- `path` (`java.nio.file.Path`)

**Returns:** `void`

### `createParentDirectories(Path path, FileAttribute<?>[] attrs)`

Note that if
 this operation fails, it may have succeeded in creating some (but not all) of the necessary
 parent directories. The parent directory is created with the given attrs.

**Parameters:**
- `path` (`java.nio.file.Path`)
- `attrs` (`java.nio.file.attribute.FileAttribute<?>[]`)

**Returns:** `void`

### `getFileExtension(Path path)`

The result does
 not include the '.'.

 
**Note:** This method simply returns everything after the last '.' in the file's
 name as determined by Path#getFileName. It does not account for any filesystem-specific
 behavior that the Path API does not already account for. For example, on NTFS it will
 report "txt" as the extension for the filename "foo.exe:.txt" even though NTFS
 will drop the ":.txt" part of the name when the file is actually created on the
 filesystem due to NTFS's [Alternate Data Streams](https://goo.gl/vTpJi4).

**Parameters:**
- `path` (`java.nio.file.Path`)

**Returns:** `java.lang.String`

### `getNameWithoutExtension(Path path)`

This is
 similar to the basename unix command. The result does not include the '.'.

**Parameters:**
- `path` (`java.nio.file.Path`)

**Returns:** `java.lang.String`

### `deleteRecursively(Path path, RecursiveDeleteOption[] options)`

Deletes symbolic links,
 not their targets (subject to the caveat below).

 
If an I/O exception occurs attempting to read, open or delete any file under the given
 directory, this method skips that file and continues. All such exceptions are collected and,
 after attempting to delete all files, an IOException is thrown containing those
 exceptions as suppressed exceptions.

 Warning: Security of recursive deletes

 
On a file system that supports symbolic links and does *not* support SecureDirectoryStream, it is possible for a recursive delete to delete files and directories
 that are *outside* the directory being deleted. This can happen if, after checking that a
 file is a directory (and not a symbolic link), that directory is replaced by a symbolic link to
 an outside directory before the call that opens the directory to read its entries.

 
By default, this method throws InsecureRecursiveDeleteException if it can't
 guarantee the security of recursive deletes. If you wish to allow the recursive deletes anyway,
 pass RecursiveDeleteOption#ALLOW_INSECURE to this method to override that behavior.

**Parameters:**
- `path` (`java.nio.file.Path`)
- `options` ([`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md))

**Returns:** `void`

### `deleteDirectoryContents(Path path, RecursiveDeleteOption[] options)`

Does not delete the directory itself. Deletes symbolic links, not their targets
 (subject to the caveat below). If path itself is a symbolic link to a directory, that
 link is followed and the contents of the directory it targets are deleted.

 
If an I/O exception occurs attempting to read, open or delete any file under the given
 directory, this method skips that file and continues. All such exceptions are collected and,
 after attempting to delete all files, an IOException is thrown containing those
 exceptions as suppressed exceptions.

 Warning: Security of recursive deletes

 
On a file system that supports symbolic links and does *not* support SecureDirectoryStream, it is possible for a recursive delete to delete files and directories
 that are *outside* the directory being deleted. This can happen if, after checking that a
 file is a directory (and not a symbolic link), that directory is replaced by a symbolic link to
 an outside directory before the call that opens the directory to read its entries.

 
By default, this method throws InsecureRecursiveDeleteException if it can't
 guarantee the security of recursive deletes. If you wish to allow the recursive deletes anyway,
 pass RecursiveDeleteOption#ALLOW_INSECURE to this method to override that behavior.

**Parameters:**
- `path` (`java.nio.file.Path`)
- `options` ([`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md))

**Returns:** `void`

### `deleteRecursivelySecure(SecureDirectoryStream<Path> dir, Path path)`

Returns a collection of exceptions
 that occurred or null if no exceptions were thrown.

**Parameters:**
- `dir` (`java.nio.file.SecureDirectoryStream<java.nio.file.Path>`)
- `path` (`java.nio.file.Path`)

**Returns:** `java.util.Collection<java.io.IOException>`

### `deleteDirectoryContentsSecure(SecureDirectoryStream<Path> dir)`

Returns a collection of exceptions that occurred or null if no exceptions were thrown.

**Parameters:**
- `dir` (`java.nio.file.SecureDirectoryStream<java.nio.file.Path>`)

**Returns:** `java.util.Collection<java.io.IOException>`

### `deleteRecursivelyInsecure(Path path)`

Returns a collection of exceptions that occurred or null if no exceptions were thrown.

**Parameters:**
- `path` (`java.nio.file.Path`)

**Returns:** `java.util.Collection<java.io.IOException>`

### `deleteDirectoryContentsInsecure(DirectoryStream<Path> dir)`

Returns a collection of exceptions that occurred or null
 if no exceptions were thrown.

**Parameters:**
- `dir` (`java.nio.file.DirectoryStream<java.nio.file.Path>`)

**Returns:** `java.util.Collection<java.io.IOException>`

### `getParentPath(Path path)`

If the path actually has a parent
 path, this is simple. Otherwise, we need to do some trickier things. Returns null if the path
 is a root or is the empty path.

**Parameters:**
- `path` (`java.nio.file.Path`)

**Returns:** `java.nio.file.Path`

### `checkAllowsInsecure(Path path, RecursiveDeleteOption[] options)`

**Parameters:**
- `path` (`java.nio.file.Path`)
- `options` ([`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md))

**Returns:** `void`

### `addException(Collection<IOException> exceptions, IOException e)`

Returns
 the collection.

**Parameters:**
- `exceptions` (`java.util.Collection<java.io.IOException>`)
- `e` (`java.io.IOException`)

**Returns:** `java.util.Collection<java.io.IOException>`

### `concat(Collection<IOException> exceptions, Collection<IOException> other)`

If either collection is
 null, the other collection is returned. Otherwise, the elements of other are added to
 exceptions and exceptions is returned.

**Parameters:**
- `exceptions` (`java.util.Collection<java.io.IOException>`)
- `other` (`java.util.Collection<java.io.IOException>`)

**Returns:** `java.util.Collection<java.io.IOException>`

### `throwDeleteFailed(Path path, Collection<IOException> exceptions)`

If there is only one exception in the collection, and it is a NoSuchFileException
 thrown because path itself didn't exist, then throws that exception. Otherwise, the
 thrown exception contains all the exceptions in the given collection as suppressed exceptions.

**Parameters:**
- `path` (`java.nio.file.Path`)
- `exceptions` (`java.util.Collection<java.io.IOException>`)

**Returns:** `void`

### `pathNotFound(Path path, Collection<IOException> exceptions)`

**Parameters:**
- `path` (`java.nio.file.Path`)
- `exceptions` (`java.util.Collection<java.io.IOException>`)

**Returns:** `java.nio.file.NoSuchFileException`

