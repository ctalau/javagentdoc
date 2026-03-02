# Class: `Files`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Files`

## Description

java.nio.file.Path users will find similar utilities in MoreFiles and the
 JDK's java.nio.file.Files class.

## Fields

### `FILE_TREE`

**Type:** [`com.google.common.graph.SuccessorsFunction<java.io.File>`](../graph/SuccessorsFunction.md)

## Constructors

### `<init>()`

## Methods

### `newReader(File file, Charset charset)`

**java.nio.file.Path equivalent:** java.nio.file.Files#newBufferedReader(java.nio.file.Path, Charset).

**Parameters:**
- `file` (`java.io.File`): the file to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see StandardCharsets for
       helpful predefined constants

**Returns:** `java.io.BufferedReader`

### `newWriter(File file, Charset charset)`

**java.nio.file.Path equivalent:** java.nio.file.Files#newBufferedWriter(java.nio.file.Path, Charset,
 java.nio.file.OpenOption...).

**Parameters:**
- `file` (`java.io.File`): the file to write to
- `charset` (`java.nio.charset.Charset`): the charset used to encode the output stream; see StandardCharsets for
       helpful predefined constants

**Returns:** `java.io.BufferedWriter`

### `asByteSource(File file)`

**Parameters:**
- `file` (`java.io.File`)

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

### `asByteSink(File file, FileWriteMode[] modes)`

The given modes
 control how the file is opened for writing. When no mode is provided, the file will be
 truncated before writing. When the APPEND mode is provided, writes
 will append to the end of the file without truncating it.

**Parameters:**
- `file` (`java.io.File`)
- `modes` ([`com.google.common.io.FileWriteMode[]`](./FileWriteMode.md))

**Returns:** [`com.google.common.io.ByteSink`](./ByteSink.md)

### `asCharSource(File file, Charset charset)`

**Parameters:**
- `file` (`java.io.File`)
- `charset` (`java.nio.charset.Charset`)

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

### `asCharSink(File file, Charset charset, FileWriteMode[] modes)`

The given modes control how the file is opened for writing. When no mode
 is provided, the file will be truncated before writing. When the APPEND mode is provided, writes will append to the end of the file without truncating it.

**Parameters:**
- `file` (`java.io.File`)
- `charset` (`java.nio.charset.Charset`)
- `modes` ([`com.google.common.io.FileWriteMode[]`](./FileWriteMode.md))

**Returns:** [`com.google.common.io.CharSink`](./CharSink.md)

### `toByteArray(File file)`

**java.nio.file.Path equivalent:** java.nio.file.Files#readAllBytes.

**Parameters:**
- `file` (`java.io.File`): the file to read from

**Returns:** `byte[]`

### `toString(File file, Charset charset)`

**Parameters:**
- `file` (`java.io.File`): the file to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see StandardCharsets for
       helpful predefined constants

**Returns:** `java.lang.String`

### `write(byte[] from, File to)`

**java.nio.file.Path equivalent:** java.nio.file.Files#write(java.nio.file.Path, byte[], java.nio.file.OpenOption...).

**Parameters:**
- `from` (`byte[]`): the bytes to write
- `to` (`java.io.File`): the destination file

**Returns:** `void`

### `write(CharSequence from, File to, Charset charset)`

**Parameters:**
- `from` (`java.lang.CharSequence`): the character sequence to write
- `to` (`java.io.File`): the destination file
- `charset` (`java.nio.charset.Charset`): the charset used to encode the output stream; see StandardCharsets for
       helpful predefined constants

**Returns:** `void`

### `copy(File from, OutputStream to)`

**java.nio.file.Path equivalent:** java.nio.file.Files#copy(java.nio.file.Path, OutputStream).

**Parameters:**
- `from` (`java.io.File`): the source file
- `to` (`java.io.OutputStream`): the output stream

**Returns:** `void`

### `copy(File from, File to)`

Copying is not an atomic operation - in the case of an I/O error, power loss, process
 termination, or other problems, to may not be a complete copy of from. If you
 need to guard against those conditions, you should employ other file-level synchronization.

 
**Warning:** If to represents an existing file, that file will be overwritten
 with the contents of from. If to and from refer to the *same*
 file, the contents of that file will be deleted.

 
**java.nio.file.Path equivalent:** java.nio.file.Files#copy(java.nio.file.Path, java.nio.file.Path, java.nio.file.CopyOption...).

**Parameters:**
- `from` (`java.io.File`): the source file
- `to` (`java.io.File`): the destination file

**Returns:** `void`

### `copy(File from, Charset charset, Appendable to)`

**Parameters:**
- `from` (`java.io.File`): the source file
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see StandardCharsets for
       helpful predefined constants
- `to` (`java.lang.Appendable`): the appendable object

**Returns:** `void`

### `append(CharSequence from, File to, Charset charset)`

**Parameters:**
- `from` (`java.lang.CharSequence`): the character sequence to append
- `to` (`java.io.File`): the destination file
- `charset` (`java.nio.charset.Charset`): the charset used to encode the output stream; see StandardCharsets for
       helpful predefined constants

**Returns:** `void`

### `equal(File file1, File file2)`

**Parameters:**
- `file1` (`java.io.File`)
- `file2` (`java.io.File`)

**Returns:** `boolean`

### `createTempDir()`

The temporary directory is created with permissions restricted to the current user or, in
 the case of Android, the current app. If that is not possible (as is the case under the very
 old Android Ice Cream Sandwich release), then this method throws an exception instead of
 creating a directory that would be more accessible. (This behavior is new in Guava 32.0.0.
 Previous versions would create a directory that is more accessible, as discussed in [CVE-2020-8908](https://github.com/google/guava/issues/4011).)

 
Use this method instead of File#createTempFile(String, String) when you wish to
 create a directory, not a regular file. A common pitfall is to call createTempFile,
 delete the file and create a directory in its place, but this leads a race condition which can
 be exploited to create security vulnerabilities, especially when executable files are to be
 written into the directory.

 
This method assumes that the temporary volume is writable, has free inodes and free blocks,
 and that it will not be called thousands of times per second.

 
**java.nio.file.Path equivalent:** java.nio.file.Files#createTempDirectory.

**Returns:** `java.io.File`

### `touch(File file)`

**Parameters:**
- `file` (`java.io.File`): the file to create or update

**Returns:** `void`

### `createParentDirs(File file)`

Note that if
 this operation fails it may have succeeded in creating some (but not all) of the necessary
 parent directories.

**Parameters:**
- `file` (`java.io.File`)

**Returns:** `void`

### `move(File from, File to)`

This method can rename a file and/or move it to a
 different directory. In either case to must be the target path for the file itself; not
 just the new name for the file or the path to the new parent directory.

 
**java.nio.file.Path equivalent:** java.nio.file.Files#move.

**Parameters:**
- `from` (`java.io.File`): the source file
- `to` (`java.io.File`): the destination file

**Returns:** `void`

### `readFirstLine(File file, Charset charset)`

The line does not include line-termination characters, but
 does include other leading and trailing whitespace.

**Parameters:**
- `file` (`java.io.File`): the file to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see StandardCharsets for
       helpful predefined constants

**Returns:** `java.lang.String`

### `readLines(File file, Charset charset)`

The lines do not include line-termination characters, but
 do include other leading and trailing whitespace.

 
This method returns a mutable List. For an ImmutableList, use 
 Files.asCharSource(file, charset).readLines().

 
**java.nio.file.Path equivalent:** java.nio.file.Files#readAllLines(java.nio.file.Path, Charset).

**Parameters:**
- `file` (`java.io.File`): the file to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see StandardCharsets for
       helpful predefined constants

**Returns:** `java.util.List<java.lang.String>`

### `readLines(File file, Charset charset, LineProcessor<T> callback)`

**Parameters:**
- `file` (`java.io.File`): the file to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see StandardCharsets for
       helpful predefined constants
- `callback` ([`com.google.common.io.LineProcessor<T>`](./LineProcessor.md)): the LineProcessor to use to handle the lines

**Returns:** `T`

### `readBytes(File file, ByteProcessor<T> processor)`

(If this seems too complicated, maybe you're looking for #toByteArray.)

**Parameters:**
- `file` (`java.io.File`): the file to read
- `processor` ([`com.google.common.io.ByteProcessor<T>`](./ByteProcessor.md)): the object to which the bytes of the file are passed.

**Returns:** `T`

### `hash(File file, HashFunction hashFunction)`

**Parameters:**
- `file` (`java.io.File`): the file to read
- `hashFunction` ([`com.google.common.hash.HashFunction`](../hash/HashFunction.md)): the hash function to use to hash the data

**Returns:** [`com.google.common.hash.HashCode`](../hash/HashCode.md)

### `map(File file)`

Files are mapped from offset 0 to its length.

 
This only works for files ≤ Integer#MAX_VALUE bytes.

**Parameters:**
- `file` (`java.io.File`): the file to map

**Returns:** `java.nio.MappedByteBuffer`

### `map(File file, FileChannel.MapMode mode)`

Files are mapped from offset 0 to its length.

 
This only works for files ≤ Integer#MAX_VALUE bytes.

**Parameters:**
- `file` (`java.io.File`): the file to map
- `mode` (`java.nio.channels.FileChannel.MapMode`): the mode to use when mapping file

**Returns:** `java.nio.MappedByteBuffer`

### `map(File file, FileChannel.MapMode mode, long size)`

Files are mapped from offset 0 to size.

 
If the mode is MapMode#READ_WRITE and the file does not exist, it will be created
 with the requested size. Thus this method is useful for creating memory mapped files
 which do not yet exist.

 
This only works for files ≤ Integer#MAX_VALUE bytes.

**Parameters:**
- `file` (`java.io.File`): the file to map
- `mode` (`java.nio.channels.FileChannel.MapMode`): the mode to use when mapping file
- `size` (`long`)

**Returns:** `java.nio.MappedByteBuffer`

### `mapInternal(File file, FileChannel.MapMode mode, long size)`

**Parameters:**
- `file` (`java.io.File`)
- `mode` (`java.nio.channels.FileChannel.MapMode`)
- `size` (`long`)

**Returns:** `java.nio.MappedByteBuffer`

### `simplifyPath(String pathname)`

The following heuristics are used:

 

   - empty string becomes .
   - . stays as .
   - fold out ./
   - fold out ../ when possible
   - collapse multiple slashes
   - delete trailing slashes (unless the path is just "/")
 


 
These heuristics do not always match the behavior of the filesystem. In particular, consider
 the path a/../b, which simplifyPath will change to b. If a is a
 symlink to x, a/../b may refer to a sibling of x, rather than the
 sibling of a referred to by b.

**Parameters:**
- `pathname` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getFileExtension(String fullName)`

The result does not
 include the '.'.

 
**Note:** This method simply returns everything after the last '.' in the file's
 name as determined by File#getName. It does not account for any filesystem-specific
 behavior that the File API does not already account for. For example, on NTFS it will
 report "txt" as the extension for the filename "foo.exe:.txt" even though NTFS
 will drop the ":.txt" part of the name when the file is actually created on the
 filesystem due to NTFS's [Alternate Data Streams](https://goo.gl/vTpJi4).

**Parameters:**
- `fullName` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getNameWithoutExtension(String file)`

This is
 similar to the basename unix command. The result does not include the '.'.

**Parameters:**
- `file` (`java.lang.String`): The name of the file to trim the extension from. This can be either a fully
       qualified file name (including a path) or just a file name.

**Returns:** `java.lang.String`

### `fileTraverser()`

The returned traverser
 starts from a File and will return all files and directories it encounters.

 
**Warning:** File provides no support for symbolic links, and as such there is no
 way to ensure that a symbolic link to a directory is not followed when traversing the tree. In
 this case, iterables created by this traverser could contain files that are outside of the
 given directory or even be infinite if there is a symbolic link loop.

 
If available, consider using MoreFiles#fileTraverser() instead. It behaves the same
 except that it doesn't follow symbolic links and returns Path instances.

 
If the File passed to one of the Traverser methods does not exist or is not
 a directory, no exception will be thrown and the returned Iterable will contain a
 single element: that file.

 
Example: Files.fileTraverser().depthFirstPreOrder(new File("/")) may return files
 with the following paths: ["/", "/etc", "/etc/config.txt", "/etc/fonts", "/home",
 "/home/alice", ...]

**Returns:** [`com.google.common.graph.Traverser<java.io.File>`](../graph/Traverser.md)

### `isDirectory()`

**Returns:** [`com.google.common.base.Predicate<java.io.File>`](../base/Predicate.md)

### `isFile()`

**Returns:** [`com.google.common.base.Predicate<java.io.File>`](../base/Predicate.md)

