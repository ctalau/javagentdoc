# Annotation_type: `GwtCompatible`

**Package:** [`com.google.common.annotations`](README.md)

**Fully Qualified Name:** `com.google.common.annotations.GwtCompatible`

**Implements:** `java.lang.annotation.Annotation`

## Description

The presence of this annotation on a type indicates that the type may be used with the <a href="http://code.google.com/webtoolkit/">Google Web Toolkit</a> (GWT). When applied to a method,
 the return type of the method is GWT compatible. It's useful to indicate that an instance created
 by factory methods has a GWT serializable type. In the following example,

 <pre>
 @GwtCompatible
 class Lists {
   ...
   @GwtCompatible(serializable = true)
   static <E> List<E> newArrayList(E... elements) {
     ...
   }
 }
 </pre>

 <p>The return value of `Lists.newArrayList(E[])` has GWT serializable type. It is also
 useful in specifying contracts of interface methods. In the following example,

 <pre>
 @GwtCompatible
 interface ListFactory {
   ...
   @GwtCompatible(serializable = true)
   <E> List<E> newArrayList(E... elements);
 }
 </pre>

 <p>The `newArrayList(E[])` method of all implementations of `ListFactory` is expected
 to return a value with a GWT serializable type.

 <p>Note that a `GwtCompatible` type may have some `GwtIncompatible` methods.
**Author:** Charles Fry
**Author:** Hayward Chan

## Methods

### `serializable()`

**Returns:** `boolean`

When `true`, the annotated type or the type of the method return value is GWT
 serializable.
**See:** <a href="http://code.google.com/webtoolkit/doc/latest/DevGuideServerCommunication.html#DevGuideSerializableTypes">
     Documentation about GWT serialization</a>

### `emulated()`

**Returns:** `boolean`

When `true`, the annotated type is emulated in GWT. The emulated source (also known as
 super-source) is different from the implementation used by the JVM.
**See:** <a href="http://code.google.com/webtoolkit/doc/latest/DevGuideOrganizingProjects.html#DevGuideModules">
     Documentation about GWT emulated source</a>

