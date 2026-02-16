# Class: `Files`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Files`

## Description

Provides utility methods for working with {@linkplain File files}.

 <p>{@link java.nio.file.Path} users will find similar utilities in {@link MoreFiles} and the
 JDK's {@link java.nio.file.Files} class.
@author Chris Nokleberg
@author Colin Decker
@since 1.0

## Fields

### `FILE_TREE`

**Type:** [`com.google.common.graph.SuccessorsFunction<java.io.File>`](../graph/SuccessorsFunction.md)

## Constructors

### `<init>()`

## Methods

### `newReader([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`java.io.BufferedReader`](../../../../java/io/BufferedReader.md)

Returns a buffered reader that reads from a file using the given character set.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#newBufferedReader(java.nio.file.Path, Charset)}.
@param file the file to read from
@param charset the charset used to decode the input stream; see {@link StandardCharsets} for
     helpful predefined constants
@return the buffered reader

### `newWriter([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`java.io.BufferedWriter`](../../../../java/io/BufferedWriter.md)

Returns a buffered writer that writes to a file using the given character set.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#newBufferedWriter(java.nio.file.Path, Charset,
 java.nio.file.OpenOption...)}.
@param file the file to write to
@param charset the charset used to encode the output stream; see {@link StandardCharsets} for
     helpful predefined constants
@return the buffered writer

### `asByteSource([`java.io.File`](../../../../java/io/File.md) file)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a new {@link ByteSource} for reading bytes from the given file.
@since 14.0

### `asByteSink([`java.io.File`](../../../../java/io/File.md) file, [`com.google.common.io.FileWriteMode[]`](./FileWriteMode.md) modes)`

**Returns:** [`com.google.common.io.ByteSink`](./ByteSink.md)

Returns a new {@link ByteSink} for writing bytes to the given file. The given {@code modes}
 control how the file is opened for writing. When no mode is provided, the file will be
 truncated before writing. When the {@link FileWriteMode#APPEND APPEND} mode is provided, writes
 will append to the end of the file without truncating it.
@since 14.0

### `asCharSource([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Returns a new {@link CharSource} for reading character data from the given file using the given
 character set.
@since 14.0

### `asCharSink([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset, [`com.google.common.io.FileWriteMode[]`](./FileWriteMode.md) modes)`

**Returns:** [`com.google.common.io.CharSink`](./CharSink.md)

Returns a new {@link CharSink} for writing character data to the given file using the given
 character set. The given {@code modes} control how the file is opened for writing. When no mode
 is provided, the file will be truncated before writing. When the {@link FileWriteMode#APPEND APPEND} mode is provided, writes will append to the end of the file without truncating it.
@since 14.0

### `toByteArray([`java.io.File`](../../../../java/io/File.md) file)`

**Returns:** `byte[]`

Reads all bytes from a file into a byte array.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#readAllBytes}.
@param file the file to read from
@return a byte array containing all the bytes from file
@throws IllegalArgumentException if the file is bigger than the largest possible byte array
     (2^31 - 1)
@throws IOException if an I/O error occurs

### `toString([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** `java.lang.String`

Reads all characters from a file into a {@link String}, using the given character set.
@param file the file to read from
@param charset the charset used to decode the input stream; see {@link StandardCharsets} for
     helpful predefined constants
@return a string containing all the characters from the file
@throws IOException if an I/O error occurs
@deprecated Prefer {@code asCharSource(file, charset).read()}.

### `write(`byte[]` from, [`java.io.File`](../../../../java/io/File.md) to)`

**Returns:** `void`

Overwrites a file with the contents of a byte array.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#write(java.nio.file.Path, byte[], java.nio.file.OpenOption...)}.
@param from the bytes to write
@param to the destination file
@throws IOException if an I/O error occurs

### `write(`java.lang.CharSequence` from, [`java.io.File`](../../../../java/io/File.md) to, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** `void`

Writes a character sequence (such as a string) to a file using the given character set.
@param from the character sequence to write
@param to the destination file
@param charset the charset used to encode the output stream; see {@link StandardCharsets} for
     helpful predefined constants
@throws IOException if an I/O error occurs
@deprecated Prefer {@code asCharSink(to, charset).write(from)}.

### `copy([`java.io.File`](../../../../java/io/File.md) from, [`java.io.OutputStream`](../../../../java/io/OutputStream.md) to)`

**Returns:** `void`

Copies all bytes from a file to an output stream.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#copy(java.nio.file.Path, OutputStream)}.
@param from the source file
@param to the output stream
@throws IOException if an I/O error occurs

### `copy([`java.io.File`](../../../../java/io/File.md) from, [`java.io.File`](../../../../java/io/File.md) to)`

**Returns:** `void`

Copies all the bytes from one file to another.

 <p>Copying is not an atomic operation - in the case of an I/O error, power loss, process
 termination, or other problems, {@code to} may not be a complete copy of {@code from}. If you
 need to guard against those conditions, you should employ other file-level synchronization.

 <p><b>Warning:</b> If {@code to} represents an existing file, that file will be overwritten
 with the contents of {@code from}. If {@code to} and {@code from} refer to the <i>same</i>
 file, the contents of that file will be deleted.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#copy(java.nio.file.Path, java.nio.file.Path, java.nio.file.CopyOption...)}.
@param from the source file
@param to the destination file
@throws IOException if an I/O error occurs
@throws IllegalArgumentException if {@code from.equals(to)}

### `copy([`java.io.File`](../../../../java/io/File.md) from, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset, `java.lang.Appendable` to)`

**Returns:** `void`

Copies all characters from a file to an appendable object, using the given character set.
@param from the source file
@param charset the charset used to decode the input stream; see {@link StandardCharsets} for
     helpful predefined constants
@param to the appendable object
@throws IOException if an I/O error occurs
@deprecated Prefer {@code asCharSource(from, charset).copyTo(to)}.

### `append(`java.lang.CharSequence` from, [`java.io.File`](../../../../java/io/File.md) to, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** `void`

Appends a character sequence (such as a string) to a file using the given character set.
@param from the character sequence to append
@param to the destination file
@param charset the charset used to encode the output stream; see {@link StandardCharsets} for
     helpful predefined constants
@throws IOException if an I/O error occurs
@deprecated Prefer {@code asCharSink(to, charset, FileWriteMode.APPEND).write(from)}. This
     method is scheduled to be removed in October 2019.

### `equal([`java.io.File`](../../../../java/io/File.md) file1, [`java.io.File`](../../../../java/io/File.md) file2)`

**Returns:** `boolean`

Returns true if the given files exist, are not directories, and contain the same bytes.
@throws IOException if an I/O error occurs

### `createTempDir()`

**Returns:** [`java.io.File`](../../../../java/io/File.md)

Atomically creates a new directory somewhere beneath the system's temporary directory (as
 defined by the {@code java.io.tmpdir} system property), and returns its name.

 <p>The temporary directory is created with permissions restricted to the current user or, in
 the case of Android, the current app. If that is not possible (as is the case under the very
 old Android Ice Cream Sandwich release), then this method throws an exception instead of
 creating a directory that would be more accessible. (This behavior is new in Guava 32.0.0.
 Previous versions would create a directory that is more accessible, as discussed in <a href="https://github.com/google/guava/issues/4011">CVE-2020-8908</a>.)

 <p>Use this method instead of {@link File#createTempFile(String, String)} when you wish to
 create a directory, not a regular file. A common pitfall is to call {@code createTempFile},
 delete the file and create a directory in its place, but this leads a race condition which can
 be exploited to create security vulnerabilities, especially when executable files are to be
 written into the directory.

 <p>This method assumes that the temporary volume is writable, has free inodes and free blocks,
 and that it will not be called thousands of times per second.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#createTempDirectory}.
@return the newly-created directory
@throws IllegalStateException if the directory could not be created, such as if the system does
     not support creating temporary directories securely
@deprecated For Android users, see the <a href="https://developer.android.com/training/data-storage" target="_blank">Data and File
     Storage overview</a> to select an appropriate temporary directory (perhaps {@code
     context.getCacheDir()}), and create your own directory under that. (For example, you might
     use {@code new File(context.getCacheDir(), "directoryname").mkdir()}, or, if you need an
     arbitrary number of temporary directories, you might have to generate multiple directory
     names in a loop until {@code mkdir()} returns {@code true}.) For developers on Java 7 or
     later, use {@link java.nio.file.Files#createTempDirectory}, transforming it to a {@link File} using {@link java.nio.file.Path#toFile() toFile()} if needed. To restrict permissions
     as this method does, pass {@code
     PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"))} to your
     call to {@code createTempDirectory}.

### `touch([`java.io.File`](../../../../java/io/File.md) file)`

**Returns:** `void`

Creates an empty file or updates the last updated timestamp on the same as the unix command of
 the same name.
@param file the file to create or update
@throws IOException if an I/O error occurs

### `createParentDirs([`java.io.File`](../../../../java/io/File.md) file)`

**Returns:** `void`

Creates any necessary but nonexistent parent directories of the specified file. Note that if
 this operation fails it may have succeeded in creating some (but not all) of the necessary
 parent directories.
@throws IOException if an I/O error occurs, or if any necessary but nonexistent parent
     directories of the specified file could not be created.
@since 4.0

### `move([`java.io.File`](../../../../java/io/File.md) from, [`java.io.File`](../../../../java/io/File.md) to)`

**Returns:** `void`

Moves a file from one path to another. This method can rename a file and/or move it to a
 different directory. In either case {@code to} must be the target path for the file itself; not
 just the new name for the file or the path to the new parent directory.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#move}.
@param from the source file
@param to the destination file
@throws IOException if an I/O error occurs
@throws IllegalArgumentException if {@code from.equals(to)}

### `readFirstLine([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** `java.lang.String`

Reads the first line from a file. The line does not include line-termination characters, but
 does include other leading and trailing whitespace.
@param file the file to read from
@param charset the charset used to decode the input stream; see {@link StandardCharsets} for
     helpful predefined constants
@return the first line, or null if the file is empty
@throws IOException if an I/O error occurs
@deprecated Prefer {@code asCharSource(file, charset).readFirstLine()}.

### `readLines([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`java.util.List<java.lang.String>`](../../../../java/util/List.md)

Reads all of the lines from a file. The lines do not include line-termination characters, but
 do include other leading and trailing whitespace.

 <p>This method returns a mutable {@code List}. For an {@code ImmutableList}, use {@code
 Files.asCharSource(file, charset).readLines()}.

 <p><b>{@link java.nio.file.Path} equivalent:</b> {@link java.nio.file.Files#readAllLines(java.nio.file.Path, Charset)}.
@param file the file to read from
@param charset the charset used to decode the input stream; see {@link StandardCharsets} for
     helpful predefined constants
@return a mutable {@link List} containing all the lines
@throws IOException if an I/O error occurs

### `readLines([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset, [`com.google.common.io.LineProcessor<T>`](./LineProcessor.md) callback)`

**Returns:** [`T`](T.md)

Streams lines from a {@link File}, stopping when our callback returns false, or we have read
 all of the lines.
@param file the file to read from
@param charset the charset used to decode the input stream; see {@link StandardCharsets} for
     helpful predefined constants
@param callback the {@link LineProcessor} to use to handle the lines
@return the output of processing the lines
@throws IOException if an I/O error occurs
@deprecated Prefer {@code asCharSource(file, charset).readLines(callback)}.

### `readBytes([`java.io.File`](../../../../java/io/File.md) file, [`com.google.common.io.ByteProcessor<T>`](./ByteProcessor.md) processor)`

**Returns:** [`T`](T.md)

Process the bytes of a file.

 <p>(If this seems too complicated, maybe you're looking for {@link #toByteArray}.)
@param file the file to read
@param processor the object to which the bytes of the file are passed.
@return the result of the byte processor
@throws IOException if an I/O error occurs
@deprecated Prefer {@code asByteSource(file).read(processor)}.

### `hash([`java.io.File`](../../../../java/io/File.md) file, [`com.google.common.hash.HashFunction`](../hash/HashFunction.md) hashFunction)`

**Returns:** [`com.google.common.hash.HashCode`](../hash/HashCode.md)

Computes the hash code of the {@code file} using {@code hashFunction}.
@param file the file to read
@param hashFunction the hash function to use to hash the data
@return the {@link HashCode} of all of the bytes in the file
@throws IOException if an I/O error occurs
@since 12.0
@deprecated Prefer {@code asByteSource(file).hash(hashFunction)}.

### `map([`java.io.File`](../../../../java/io/File.md) file)`

**Returns:** [`java.nio.MappedByteBuffer`](../../../../java/nio/MappedByteBuffer.md)

Fully maps a file read-only in to memory as per {@link FileChannel#map(java.nio.channels.FileChannel.MapMode, long, long)}.

 <p>Files are mapped from offset 0 to its length.

 <p>This only works for files \u2264 {@link Integer#MAX_VALUE} bytes.
@param file the file to map
@return a read-only buffer reflecting {@code file}
@throws FileNotFoundException if the {@code file} does not exist
@throws IOException if an I/O error occurs
@see FileChannel#map(MapMode, long, long)
@since 2.0

### `map([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.channels.FileChannel.MapMode`](../../../../java/nio/channels/FileChannel/MapMode.md) mode)`

**Returns:** [`java.nio.MappedByteBuffer`](../../../../java/nio/MappedByteBuffer.md)

Fully maps a file in to memory as per {@link FileChannel#map(java.nio.channels.FileChannel.MapMode, long, long)} using the requested {@link MapMode}.

 <p>Files are mapped from offset 0 to its length.

 <p>This only works for files \u2264 {@link Integer#MAX_VALUE} bytes.
@param file the file to map
@param mode the mode to use when mapping {@code file}
@return a buffer reflecting {@code file}
@throws FileNotFoundException if the {@code file} does not exist
@throws IOException if an I/O error occurs
@see FileChannel#map(MapMode, long, long)
@since 2.0

### `map([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.channels.FileChannel.MapMode`](../../../../java/nio/channels/FileChannel/MapMode.md) mode, `long` size)`

**Returns:** [`java.nio.MappedByteBuffer`](../../../../java/nio/MappedByteBuffer.md)

Maps a file in to memory as per {@link FileChannel#map(java.nio.channels.FileChannel.MapMode,
 long, long)} using the requested {@link MapMode}.

 <p>Files are mapped from offset 0 to {@code size}.

 <p>If the mode is {@link MapMode#READ_WRITE} and the file does not exist, it will be created
 with the requested {@code size}. Thus this method is useful for creating memory mapped files
 which do not yet exist.

 <p>This only works for files \u2264 {@link Integer#MAX_VALUE} bytes.
@param file the file to map
@param mode the mode to use when mapping {@code file}
@return a buffer reflecting {@code file}
@throws IOException if an I/O error occurs
@see FileChannel#map(MapMode, long, long)
@since 2.0

### `mapInternal([`java.io.File`](../../../../java/io/File.md) file, [`java.nio.channels.FileChannel.MapMode`](../../../../java/nio/channels/FileChannel/MapMode.md) mode, `long` size)`

**Returns:** [`java.nio.MappedByteBuffer`](../../../../java/nio/MappedByteBuffer.md)

### `simplifyPath(`java.lang.String` pathname)`

**Returns:** `java.lang.String`

Returns the lexically cleaned form of the path name, <i>usually</i> (but not always) equivalent
 to the original. The following heuristics are used:

 <ul>
   <li>empty string becomes .
   <li>. stays as .
   <li>fold out ./
   <li>fold out ../ when possible
   <li>collapse multiple slashes
   <li>delete trailing slashes (unless the path is just "/")
 </ul>

 <p>These heuristics do not always match the behavior of the filesystem. In particular, consider
 the path {@code a/../b}, which {@code simplifyPath} will change to {@code b}. If {@code a} is a
 symlink to {@code x}, {@code a/../b} may refer to a sibling of {@code x}, rather than the
 sibling of {@code a} referred to by {@code b}.
@since 11.0

### `getFileExtension(`java.lang.String` fullName)`

**Returns:** `java.lang.String`

Returns the <a href="http://en.wikipedia.org/wiki/Filename_extension">file extension</a> for
 the given file name, or the empty string if the file has no extension. The result does not
 include the '{@code .}'.

 <p><b>Note:</b> This method simply returns everything after the last '{@code .}' in the file's
 name as determined by {@link File#getName}. It does not account for any filesystem-specific
 behavior that the {@link File} API does not already account for. For example, on NTFS it will
 report {@code "txt"} as the extension for the filename {@code "foo.exe:.txt"} even though NTFS
 will drop the {@code ":.txt"} part of the name when the file is actually created on the
 filesystem due to NTFS's <a href="https://goo.gl/vTpJi4">Alternate Data Streams</a>.
@since 11.0

### `getNameWithoutExtension(`java.lang.String` file)`

**Returns:** `java.lang.String`

Returns the file name without its <a href="http://en.wikipedia.org/wiki/Filename_extension">file extension</a> or path. This is
 similar to the {@code basename} unix command. The result does not include the '{@code .}'.
@param file The name of the file to trim the extension from. This can be either a fully
     qualified file name (including a path) or just a file name.
@return The file name without its path or extension.
@since 14.0

### `fileTraverser()`

**Returns:** [`com.google.common.graph.Traverser<java.io.File>`](../graph/Traverser.md)

Returns a {@link Traverser} instance for the file and directory tree. The returned traverser
 starts from a {@link File} and will return all files and directories it encounters.

 <p><b>Warning:</b> {@code File} provides no support for symbolic links, and as such there is no
 way to ensure that a symbolic link to a directory is not followed when traversing the tree. In
 this case, iterables created by this traverser could contain files that are outside of the
 given directory or even be infinite if there is a symbolic link loop.

 <p>If available, consider using {@link MoreFiles#fileTraverser()} instead. It behaves the same
 except that it doesn't follow symbolic links and returns {@code Path} instances.

 <p>If the {@link File} passed to one of the {@link Traverser} methods does not exist or is not
 a directory, no exception will be thrown and the returned {@link Iterable} will contain a
 single element: that file.

 <p>Example: {@code Files.fileTraverser().depthFirstPreOrder(new File("/"))} may return files
 with the following paths: {@code ["/", "/etc", "/etc/config.txt", "/etc/fonts", "/home",
 "/home/alice", ...]}
@since 23.5

### `isDirectory()`

**Returns:** [`com.google.common.base.Predicate<java.io.File>`](../base/Predicate.md)

Returns a predicate that returns the result of {@link File#isDirectory} on input files.
@since 15.0

### `isFile()`

**Returns:** [`com.google.common.base.Predicate<java.io.File>`](../base/Predicate.md)

Returns a predicate that returns the result of {@link File#isFile} on input files.
@since 15.0

