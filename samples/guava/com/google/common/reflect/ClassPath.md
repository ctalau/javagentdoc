# Class: `ClassPath`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.ClassPath`

## Description

Scans the source of a {@link ClassLoader} and finds all loadable classes and resources.

 <h2>Prefer <a href="https://github.com/classgraph/classgraph/wiki">ClassGraph</a> over {@code
 ClassPath}</h2>

 <p>We recommend using <a href="https://github.com/classgraph/classgraph/wiki">ClassGraph</a>
 instead of {@code ClassPath}. ClassGraph improves upon {@code ClassPath} in several ways,
 including addressing many of its limitations. Limitations of {@code ClassPath} include:

 <ul>
   <li>It looks only for files and JARs in URLs available from {@link URLClassLoader} instances or
       the {@linkplain ClassLoader#getSystemClassLoader() system class loader}. This means it does
       not look for classes in the <i>module path</i>.
   <li>It understands only {@code file:} URLs. This means that it does not understand <a href="https://openjdk.java.net/jeps/220">{@code jrt:/} URLs</a>, among <a href="https://github.com/classgraph/classgraph/wiki/Classpath-specification-mechanisms">others</a>.
   <li>It does not know how to look for classes when running under an Android VM. (ClassGraph does
       not support this directly, either, but ClassGraph documents how to <a href="https://github.com/classgraph/classgraph/wiki/Build-Time-Scanning">perform build-time
       classpath scanning and make the results available to an Android app</a>.)
   <li>Like all of Guava, it is not tested under Windows. We have gotten <a href="https://github.com/google/guava/issues/2130">a report of a specific bug under
       Windows</a>.
   <li>It <a href="https://github.com/google/guava/issues/2712">returns only one resource for a
       given path</a>, even if resources with that path appear in multiple jars or directories.
   <li>It assumes that <a href="https://github.com/google/guava/issues/3349">any class with a
       {@code $} in its name is a nested class</a>.
 </ul>

 <h2>{@code ClassPath} and symlinks</h2>

 <p>In the case of directory classloaders, symlinks are supported but cycles are not traversed.
 This guarantees discovery of each <em>unique</em> loadable resource. However, not all possible
 aliases for resources on cyclic paths will be listed.
@author Ben Yu
@since 14.0

## Fields

### `logger`

**Type:** [`java.util.logging.Logger`](../../../../java/util/logging/Logger.md)

### `CLASS_PATH_ATTRIBUTE_SEPARATOR`

**Type:** [`com.google.common.base.Splitter`](../base/Splitter.md)

Separator for the Class-Path manifest attribute value in jar files.

### `CLASS_FILE_NAME_EXTENSION`

**Type:** `java.lang.String`

### `resources`

**Type:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo>`](../collect/ImmutableSet.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo>`](../collect/ImmutableSet.md) resources)`

## Methods

### `from(`java.lang.ClassLoader` classloader)`

**Returns:** [`com.google.common.reflect.ClassPath`](./ClassPath.md)

Returns a {@code ClassPath} representing all classes and resources loadable from {@code
 classloader} and its ancestor class loaders.

 <p><b>Warning:</b> {@code ClassPath} can find classes and resources only from:

 <ul>
   <li>{@link URLClassLoader} instances' {@code file:} URLs
   <li>the {@linkplain ClassLoader#getSystemClassLoader() system class loader}. To search the
       system class loader even when it is not a {@link URLClassLoader} (as in Java 9), {@code
       ClassPath} searches the files from the {@code java.class.path} system property.
 </ul>
@throws IOException if the attempt to read class path resources (jar files or directories)
     failed.

### `getResources()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo>`](../collect/ImmutableSet.md)

Returns all resources loadable from the current class path, including the class files of all
 loadable classes but excluding the "META-INF/MANIFEST.MF" file.

### `getAllClasses()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo>`](../collect/ImmutableSet.md)

Returns all classes loadable from the current class path.
@since 16.0

### `getTopLevelClasses()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo>`](../collect/ImmutableSet.md)

Returns all top level classes loadable from the current class path. Note that "top-level-ness"
 is determined heuristically by class name (see {@link ClassInfo#isTopLevel}).

### `getTopLevelClasses(`java.lang.String` packageName)`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo>`](../collect/ImmutableSet.md)

Returns all top level classes whose package name is {@code packageName}.

### `getTopLevelClassesRecursive(`java.lang.String` packageName)`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo>`](../collect/ImmutableSet.md)

Returns all top level classes whose package name is {@code packageName} or starts with {@code
 packageName} followed by a '.'.

### `locationsFrom(`java.lang.ClassLoader` classloader)`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.LocationInfo>`](../collect/ImmutableSet.md)

Returns all locations that {@code classloader} and parent loaders load classes and resources
 from. Callers can {@linkplain LocationInfo#scanResources scan} individual locations selectively
 or even in parallel.

### `getClassPathFromManifest([`java.io.File`](../../../../java/io/File.md) jarFile, [`java.util.jar.Manifest`](../../../../java/util/jar/Manifest.md) manifest)`

**Returns:** [`com.google.common.collect.ImmutableSet<java.io.File>`](../collect/ImmutableSet.md)

Returns the class path URIs specified by the {@code Class-Path} manifest attribute, according
 to <a href="http://docs.oracle.com/javase/8/docs/technotes/guides/jar/jar.html#Main_Attributes">JAR
 File Specification</a>. If {@code manifest} is null, it means the jar file has no manifest, and
 an empty set will be returned.

### `getClassPathEntries(`java.lang.ClassLoader` classloader)`

**Returns:** [`com.google.common.collect.ImmutableMap<java.io.File,java.lang.ClassLoader>`](../collect/ImmutableMap.md)

### `getClassLoaderUrls(`java.lang.ClassLoader` classloader)`

**Returns:** [`com.google.common.collect.ImmutableList<java.net.URL>`](../collect/ImmutableList.md)

### `parseJavaClassPath()`

**Returns:** [`com.google.common.collect.ImmutableList<java.net.URL>`](../collect/ImmutableList.md)

Returns the URLs in the class path specified by the {@code java.class.path} {@linkplain System#getProperty system property}.

### `getClassPathEntry([`java.io.File`](../../../../java/io/File.md) jarFile, `java.lang.String` path)`

**Returns:** [`java.net.URL`](../../../../java/net/URL.md)

Returns the absolute uri of the Class-Path entry value as specified in <a href="http://docs.oracle.com/javase/8/docs/technotes/guides/jar/jar.html#Main_Attributes">JAR
 File Specification</a>. Even though the specification only talks about relative urls, absolute
 urls are actually supported too (for example, in Maven surefire plugin).

### `getClassName(`java.lang.String` filename)`

**Returns:** `java.lang.String`

### `toFile([`java.net.URL`](../../../../java/net/URL.md) url)`

**Returns:** [`java.io.File`](../../../../java/io/File.md)

