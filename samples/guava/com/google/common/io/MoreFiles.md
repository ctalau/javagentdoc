# Class: `MoreFiles`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.MoreFiles`

## Description

Static utilities for use with {@link Path} instances, intended to complement {@link Files}.

 <p>Many methods provided by Guava's {@code Files} class for {@link java.io.File} instances are
 now available via the JDK's {@link java.nio.file.Files} class for {@code Path} - check the JDK's
 class if a sibling method from {@code Files} appears to be missing from this class.
@since 21.0
@author Colin Decker

## Constructors

### `<init>()`

## Methods

### `asByteSource([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`java.nio.file.OpenOption[]`](../../../../java/nio/file/OpenOption.md) options)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a view of the given {@code path} as a {@link ByteSource}.

 <p>Any {@linkplain OpenOption open options} provided are used when opening streams to the file
 and may affect the behavior of the returned source and the streams it provides. See {@link StandardOpenOption} for the standard options that may be provided. Providing no options is
 equivalent to providing the {@link StandardOpenOption#READ READ} option.

### `asByteSink([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`java.nio.file.OpenOption[]`](../../../../java/nio/file/OpenOption.md) options)`

**Returns:** [`com.google.common.io.ByteSink`](./ByteSink.md)

Returns a view of the given {@code path} as a {@link ByteSink}.

 <p>Any {@linkplain OpenOption open options} provided are used when opening streams to the file
 and may affect the behavior of the returned sink and the streams it provides. See {@link StandardOpenOption} for the standard options that may be provided. Providing no options is
 equivalent to providing the {@link StandardOpenOption#CREATE CREATE}, {@link StandardOpenOption#TRUNCATE_EXISTING TRUNCATE_EXISTING} and {@link StandardOpenOption#WRITE WRITE} options.

### `asCharSource([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset, [`java.nio.file.OpenOption[]`](../../../../java/nio/file/OpenOption.md) options)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Returns a view of the given {@code path} as a {@link CharSource} using the given {@code
 charset}.

 <p>Any {@linkplain OpenOption open options} provided are used when opening streams to the file
 and may affect the behavior of the returned source and the streams it provides. See {@link StandardOpenOption} for the standard options that may be provided. Providing no options is
 equivalent to providing the {@link StandardOpenOption#READ READ} option.

### `asCharSink([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset, [`java.nio.file.OpenOption[]`](../../../../java/nio/file/OpenOption.md) options)`

**Returns:** [`com.google.common.io.CharSink`](./CharSink.md)

Returns a view of the given {@code path} as a {@link CharSink} using the given {@code charset}.

 <p>Any {@linkplain OpenOption open options} provided are used when opening streams to the file
 and may affect the behavior of the returned sink and the streams it provides. See {@link StandardOpenOption} for the standard options that may be provided. Providing no options is
 equivalent to providing the {@link StandardOpenOption#CREATE CREATE}, {@link StandardOpenOption#TRUNCATE_EXISTING TRUNCATE_EXISTING} and {@link StandardOpenOption#WRITE WRITE} options.

### `listFiles([`java.nio.file.Path`](../../../../java/nio/file/Path.md) dir)`

**Returns:** [`com.google.common.collect.ImmutableList<java.nio.file.Path>`](../collect/ImmutableList.md)

Returns an immutable list of paths to the files contained in the given directory.
@throws NoSuchFileException if the file does not exist <i>(optional specific exception)</i>
@throws NotDirectoryException if the file could not be opened because it is not a directory
     <i>(optional specific exception)</i>
@throws IOException if an I/O error occurs

### `fileTraverser()`

**Returns:** [`com.google.common.graph.Traverser<java.nio.file.Path>`](../graph/Traverser.md)

Returns a {@link Traverser} instance for the file and directory tree. The returned traverser
 starts from a {@link Path} and will return all files and directories it encounters.

 <p>The returned traverser attempts to avoid following symbolic links to directories. However,
 the traverser cannot guarantee that it will not follow symbolic links to directories as it is
 possible for a directory to be replaced with a symbolic link between checking if the file is a
 directory and actually reading the contents of that directory.

 <p>If the {@link Path} passed to one of the traversal methods does not exist or is not a
 directory, no exception will be thrown and the returned {@link Iterable} will contain a single
 element: that path.

 <p>{@link DirectoryIteratorException} may be thrown when iterating {@link Iterable} instances
 created by this traverser if an {@link IOException} is thrown by a call to {@link #listFiles(Path)}.

 <p>Example: {@code MoreFiles.fileTraverser().depthFirstPreOrder(Paths.get("/"))} may return the
 following paths: {@code ["/", "/etc", "/etc/config.txt", "/etc/fonts", "/home", "/home/alice",
 ...]}
@since 23.5

### `fileTreeChildren([`java.nio.file.Path`](../../../../java/nio/file/Path.md) dir)`

**Returns:** `java.lang.Iterable<java.nio.file.Path>`

### `isDirectory([`java.nio.file.LinkOption[]`](../../../../java/nio/file/LinkOption.md) options)`

**Returns:** [`com.google.common.base.Predicate<java.nio.file.Path>`](../base/Predicate.md)

Returns a predicate that returns the result of {@link java.nio.file.Files#isDirectory(Path,
 LinkOption...)} on input paths with the given link options.

### `isDirectory([`java.nio.file.SecureDirectoryStream<java.nio.file.Path>`](../../../../java/nio/file/SecureDirectoryStream.md) dir, [`java.nio.file.Path`](../../../../java/nio/file/Path.md) name, [`java.nio.file.LinkOption[]`](../../../../java/nio/file/LinkOption.md) options)`

**Returns:** `boolean`

Returns whether or not the file with the given name in the given dir is a directory.

### `isRegularFile([`java.nio.file.LinkOption[]`](../../../../java/nio/file/LinkOption.md) options)`

**Returns:** [`com.google.common.base.Predicate<java.nio.file.Path>`](../base/Predicate.md)

Returns a predicate that returns the result of {@link java.nio.file.Files#isRegularFile(Path,
 LinkOption...)} on input paths with the given link options.

### `equal([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path1, [`java.nio.file.Path`](../../../../java/nio/file/Path.md) path2)`

**Returns:** `boolean`

Returns true if the files located by the given paths exist, are not directories, and contain
 the same bytes.
@throws IOException if an I/O error occurs
@since 22.0

### `touch([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path)`

**Returns:** `void`

Like the unix command of the same name, creates an empty file or updates the last modified
 timestamp of the existing file at the given path to the current system time.

### `createParentDirectories([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`java.nio.file.attribute.FileAttribute<?>[]`](../../../../java/nio/file/attribute/FileAttribute.md) attrs)`

**Returns:** `void`

Creates any necessary but nonexistent parent directories of the specified path. Note that if
 this operation fails, it may have succeeded in creating some (but not all) of the necessary
 parent directories. The parent directory is created with the given {@code attrs}.
@throws IOException if an I/O error occurs, or if any necessary but nonexistent parent
     directories of the specified file could not be created.

### `getFileExtension([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path)`

**Returns:** `java.lang.String`

Returns the <a href="http://en.wikipedia.org/wiki/Filename_extension">file extension</a> for
 the file at the given path, or the empty string if the file has no extension. The result does
 not include the '{@code .}'.

 <p><b>Note:</b> This method simply returns everything after the last '{@code .}' in the file's
 name as determined by {@link Path#getFileName}. It does not account for any filesystem-specific
 behavior that the {@link Path} API does not already account for. For example, on NTFS it will
 report {@code "txt"} as the extension for the filename {@code "foo.exe:.txt"} even though NTFS
 will drop the {@code ":.txt"} part of the name when the file is actually created on the
 filesystem due to NTFS's <a href="https://goo.gl/vTpJi4">Alternate Data Streams</a>.

### `getNameWithoutExtension([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path)`

**Returns:** `java.lang.String`

Returns the file name without its <a href="http://en.wikipedia.org/wiki/Filename_extension">file extension</a> or path. This is
 similar to the {@code basename} unix command. The result does not include the '{@code .}'.

### `deleteRecursively([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md) options)`

**Returns:** `void`

Deletes the file or directory at the given {@code path} recursively. Deletes symbolic links,
 not their targets (subject to the caveat below).

 <p>If an I/O exception occurs attempting to read, open or delete any file under the given
 directory, this method skips that file and continues. All such exceptions are collected and,
 after attempting to delete all files, an {@code IOException} is thrown containing those
 exceptions as {@linkplain Throwable#getSuppressed() suppressed exceptions}.

 <h2>Warning: Security of recursive deletes</h2>

 <p>On a file system that supports symbolic links and does <i>not</i> support {@link SecureDirectoryStream}, it is possible for a recursive delete to delete files and directories
 that are <i>outside</i> the directory being deleted. This can happen if, after checking that a
 file is a directory (and not a symbolic link), that directory is replaced by a symbolic link to
 an outside directory before the call that opens the directory to read its entries.

 <p>By default, this method throws {@link InsecureRecursiveDeleteException} if it can't
 guarantee the security of recursive deletes. If you wish to allow the recursive deletes anyway,
 pass {@link RecursiveDeleteOption#ALLOW_INSECURE} to this method to override that behavior.
@throws NoSuchFileException if {@code path} does not exist <i>(optional specific exception)</i>
@throws InsecureRecursiveDeleteException if the security of recursive deletes can't be
     guaranteed for the file system and {@link RecursiveDeleteOption#ALLOW_INSECURE} was not
     specified
@throws IOException if {@code path} or any file in the subtree rooted at it can't be deleted
     for any reason

### `deleteDirectoryContents([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md) options)`

**Returns:** `void`

Deletes all files within the directory at the given {@code path} {@linkplain #deleteRecursively recursively}. Does not delete the directory itself. Deletes symbolic links, not their targets
 (subject to the caveat below). If {@code path} itself is a symbolic link to a directory, that
 link is followed and the contents of the directory it targets are deleted.

 <p>If an I/O exception occurs attempting to read, open or delete any file under the given
 directory, this method skips that file and continues. All such exceptions are collected and,
 after attempting to delete all files, an {@code IOException} is thrown containing those
 exceptions as {@linkplain Throwable#getSuppressed() suppressed exceptions}.

 <h2>Warning: Security of recursive deletes</h2>

 <p>On a file system that supports symbolic links and does <i>not</i> support {@link SecureDirectoryStream}, it is possible for a recursive delete to delete files and directories
 that are <i>outside</i> the directory being deleted. This can happen if, after checking that a
 file is a directory (and not a symbolic link), that directory is replaced by a symbolic link to
 an outside directory before the call that opens the directory to read its entries.

 <p>By default, this method throws {@link InsecureRecursiveDeleteException} if it can't
 guarantee the security of recursive deletes. If you wish to allow the recursive deletes anyway,
 pass {@link RecursiveDeleteOption#ALLOW_INSECURE} to this method to override that behavior.
@throws NoSuchFileException if {@code path} does not exist <i>(optional specific exception)</i>
@throws NotDirectoryException if the file at {@code path} is not a directory <i>(optional
     specific exception)</i>
@throws InsecureRecursiveDeleteException if the security of recursive deletes can't be
     guaranteed for the file system and {@link RecursiveDeleteOption#ALLOW_INSECURE} was not
     specified
@throws IOException if one or more files can't be deleted for any reason

### `deleteRecursivelySecure([`java.nio.file.SecureDirectoryStream<java.nio.file.Path>`](../../../../java/nio/file/SecureDirectoryStream.md) dir, [`java.nio.file.Path`](../../../../java/nio/file/Path.md) path)`

**Returns:** [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md)

Secure recursive delete using {@code SecureDirectoryStream}. Returns a collection of exceptions
 that occurred or null if no exceptions were thrown.

### `deleteDirectoryContentsSecure([`java.nio.file.SecureDirectoryStream<java.nio.file.Path>`](../../../../java/nio/file/SecureDirectoryStream.md) dir)`

**Returns:** [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md)

Secure method for deleting the contents of a directory using {@code SecureDirectoryStream}.
 Returns a collection of exceptions that occurred or null if no exceptions were thrown.

### `deleteRecursivelyInsecure([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path)`

**Returns:** [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md)

Insecure recursive delete for file systems that don't support {@code SecureDirectoryStream}.
 Returns a collection of exceptions that occurred or null if no exceptions were thrown.

### `deleteDirectoryContentsInsecure([`java.nio.file.DirectoryStream<java.nio.file.Path>`](../../../../java/nio/file/DirectoryStream.md) dir)`

**Returns:** [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md)

Simple, insecure method for deleting the contents of a directory for file systems that don't
 support {@code SecureDirectoryStream}. Returns a collection of exceptions that occurred or null
 if no exceptions were thrown.

### `getParentPath([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path)`

**Returns:** [`java.nio.file.Path`](../../../../java/nio/file/Path.md)

Returns a path to the parent directory of the given path. If the path actually has a parent
 path, this is simple. Otherwise, we need to do some trickier things. Returns null if the path
 is a root or is the empty path.

### `checkAllowsInsecure([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`com.google.common.io.RecursiveDeleteOption[]`](./RecursiveDeleteOption.md) options)`

**Returns:** `void`

Checks that the given options allow an insecure delete, throwing an exception if not.

### `addException([`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md) exceptions, [`java.io.IOException`](../../../../java/io/IOException.md) e)`

**Returns:** [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md)

Adds the given exception to the given collection, creating the collection if it's null. Returns
 the collection.

### `concat([`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md) exceptions, [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md) other)`

**Returns:** [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md)

Concatenates the contents of the two given collections of exceptions. If either collection is
 null, the other collection is returned. Otherwise, the elements of {@code other} are added to
 {@code exceptions} and {@code exceptions} is returned.

### `throwDeleteFailed([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md) exceptions)`

**Returns:** `void`

Throws an exception indicating that one or more files couldn't be deleted when deleting {@code
 path} or its contents.

 <p>If there is only one exception in the collection, and it is a {@link NoSuchFileException}
 thrown because {@code path} itself didn't exist, then throws that exception. Otherwise, the
 thrown exception contains all the exceptions in the given collection as suppressed exceptions.

### `pathNotFound([`java.nio.file.Path`](../../../../java/nio/file/Path.md) path, [`java.util.Collection<java.io.IOException>`](../../../../java/util/Collection.md) exceptions)`

**Returns:** [`java.nio.file.NoSuchFileException`](../../../../java/nio/file/NoSuchFileException.md)

