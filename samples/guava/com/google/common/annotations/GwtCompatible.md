# Annotation_type: `GwtCompatible`

**Package:** [`com.google.common.annotations`](README.md)

**Fully Qualified Name:** `com.google.common.annotations.GwtCompatible`

**Implements:** `java.lang.annotation.Annotation`

## Description

When applied to a method,
 the return type of the method is GWT compatible. It's useful to indicate that an instance created
 by factory methods has a GWT serializable type. In the following example,

 

```

 @GwtCompatible
 class Lists {
   ...
   @GwtCompatible(serializable = true)
   static <E> List<E> newArrayList(E... elements) {
     ...
   }
 }
 
```


 
The return value of Lists.newArrayList(E[]) has GWT serializable type. It is also
 useful in specifying contracts of interface methods. In the following example,

 

```

 @GwtCompatible
 interface ListFactory {
   ...
   @GwtCompatible(serializable = true)
   <E> List<E> newArrayList(E... elements);
 }
 
```


 
The newArrayList(E[]) method of all implementations of ListFactory is expected
 to return a value with a GWT serializable type.

 
Note that a GwtCompatible type may have some GwtIncompatible methods.

## Methods

### `serializable()`

**Returns:** `boolean`

### `emulated()`

The emulated source (also known as
 super-source) is different from the implementation used by the JVM.

**Returns:** `boolean`

