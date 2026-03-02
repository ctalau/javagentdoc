# Class: `ClassPath`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.ClassPath`

## Description

Prefer [ClassGraph](https://github.com/classgraph/classgraph/wiki) over 
 ClassPath

 
We recommend using [ClassGraph](https://github.com/classgraph/classgraph/wiki)
 instead of ClassPath. ClassGraph improves upon ClassPath in several ways,
 including addressing many of its limitations. Limitations of ClassPath include:

 

   - It looks only for files and JARs in URLs available from URLClassLoader instances or
       the system class loader. This means it does
       not look for classes in the *module path*.
   - It understands only file: URLs. This means that it does not understand [jrt:/ URLs](https://openjdk.java.net/jeps/220), among [others](https://github.com/classgraph/classgraph/wiki/Classpath-specification-mechanisms).
   - It does not know how to look for classes when running under an Android VM. (ClassGraph does
       not support this directly, either, but ClassGraph documents how to [perform build-time
       classpath scanning and make the results available to an Android app](https://github.com/classgraph/classgraph/wiki/Build-Time-Scanning).)
   - Like all of Guava, it is not tested under Windows. We have gotten [a report of a specific bug under
       Windows](https://github.com/google/guava/issues/2130).
   - It [returns only one resource for a
       given path](https://github.com/google/guava/issues/2712), even if resources with that path appear in multiple jars or directories.
   - It assumes that [any class with a
       $ in its name is a nested class](https://github.com/google/guava/issues/3349).
 


 ClassPath and symlinks

 
In the case of directory classloaders, symlinks are supported but cycles are not traversed.
 This guarantees discovery of each *unique* loadable resource. However, not all possible
 aliases for resources on cyclic paths will be listed.

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

### `CLASS_PATH_ATTRIBUTE_SEPARATOR`

**Type:** [`com.google.common.base.Splitter`](../base/Splitter.md)

### `CLASS_FILE_NAME_EXTENSION`

**Type:** `java.lang.String`

### `resources`

**Type:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo>`](../collect/ImmutableSet.md)

## Constructors

### `<init>(ImmutableSet<ClassPath.ResourceInfo> resources)`

**Parameters:**
- `resources` ([`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo>`](../collect/ImmutableSet.md))

## Methods

### `from(ClassLoader classloader)`

**Warning:** ClassPath can find classes and resources only from:

 

   - URLClassLoader instances' file: URLs
   - the system class loader. To search the
       system class loader even when it is not a URLClassLoader (as in Java 9), 
       ClassPath searches the files from the java.class.path system property.

**Parameters:**
- `classloader` (`java.lang.ClassLoader`)

**Returns:** [`com.google.common.reflect.ClassPath`](./ClassPath.md)

### `getResources()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo>`](../collect/ImmutableSet.md)

### `getAllClasses()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo>`](../collect/ImmutableSet.md)

### `getTopLevelClasses()`

Note that "top-level-ness"
 is determined heuristically by class name (see ClassInfo#isTopLevel).

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo>`](../collect/ImmutableSet.md)

### `getTopLevelClasses(String packageName)`

**Parameters:**
- `packageName` (`java.lang.String`)

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo>`](../collect/ImmutableSet.md)

### `getTopLevelClassesRecursive(String packageName)`

**Parameters:**
- `packageName` (`java.lang.String`)

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo>`](../collect/ImmutableSet.md)

### `locationsFrom(ClassLoader classloader)`

Callers can scan individual locations selectively
 or even in parallel.

**Parameters:**
- `classloader` (`java.lang.ClassLoader`)

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.LocationInfo>`](../collect/ImmutableSet.md)

### `getClassPathFromManifest(File jarFile, Manifest manifest)`

If manifest is null, it means the jar file has no manifest, and
 an empty set will be returned.

**Parameters:**
- `jarFile` (`java.io.File`)
- `manifest` (`java.util.jar.Manifest`)

**Returns:** [`com.google.common.collect.ImmutableSet<java.io.File>`](../collect/ImmutableSet.md)

### `getClassPathEntries(ClassLoader classloader)`

**Parameters:**
- `classloader` (`java.lang.ClassLoader`)

**Returns:** [`com.google.common.collect.ImmutableMap<java.io.File,java.lang.ClassLoader>`](../collect/ImmutableMap.md)

### `getClassLoaderUrls(ClassLoader classloader)`

**Parameters:**
- `classloader` (`java.lang.ClassLoader`)

**Returns:** [`com.google.common.collect.ImmutableList<java.net.URL>`](../collect/ImmutableList.md)

### `parseJavaClassPath()`

**Returns:** [`com.google.common.collect.ImmutableList<java.net.URL>`](../collect/ImmutableList.md)

### `getClassPathEntry(File jarFile, String path)`

Even though the specification only talks about relative urls, absolute
 urls are actually supported too (for example, in Maven surefire plugin).

**Parameters:**
- `jarFile` (`java.io.File`)
- `path` (`java.lang.String`)

**Returns:** `java.net.URL`

### `getClassName(String filename)`

**Parameters:**
- `filename` (`java.lang.String`)

**Returns:** `java.lang.String`

### `toFile(URL url)`

**Parameters:**
- `url` (`java.net.URL`)

**Returns:** `java.io.File`

