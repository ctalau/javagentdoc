# Annotation_type: `ParametricNullness`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.ParametricNullness`

**Implements:** `java.lang.annotation.Annotation`

## Description

For example, Multiset.Entry.getElement() returns
 @ParametricNullness E, which means:

 

   - getElement on a Multiset.Entry<@NonNull String> returns @NonNull
       String.
   - getElement on a Multiset.Entry<@Nullable String> returns @Nullable
       String.
 


 This is the same behavior as type-variable usages have to Kotlin and to the Checker Framework.
 Contrast the method above to:

 

   - methods whose return type is a type variable but which can never return null,
       typically because the type forbids nullable type arguments: For example, 
       ImmutableList.get returns E, but that value is never null. (Accordingly,
       ImmutableList is declared to forbid ImmutableList<@Nullable String>.)
   - methods whose return type is a type variable but which can return null regardless
       of the type argument supplied by the user of the class: For example, 
       ImmutableMap.get returns @Nullable E because the method can return null
       even on an ImmutableMap<K, @NonNull String>.
 


 
Consumers of this annotation include:

 

   - Kotlin, for which it makes the type-variable usage (a) a Kotlin platform type when the type
       argument is non-nullable and (b) nullable when the type argument is nullable. We use this
       to "undo" ElementTypesAreNonnullByDefault. It is the best we can do for Kotlin
       under our current constraints.
   - NullAway, which will [treat it
       identically to Nullable as of version 0.9.9](https://github.com/google/guava/issues/6126#issuecomment-1204399671). To treat it that way before then,
       you can set 
       -XepOpt:NullAway:CustomNullableAnnotations=com.google.common.base.ParametricNullness,...,com.google.common.util.concurrent.ParametricNullness,
       where the ... contains the names of all the other ParametricNullness
       annotations in Guava. Or you might prefer to omit Guava from your AnnotatedPackages
       list.
   - [J2ObjC](https://developers.google.com/j2objc)
   - NullPointerTester, at least in the Android backport (where the type-use annotations
       NullPointerTester would need are not available) and in case of [JDK-8202469](https://bugs.openjdk.java.net/browse/JDK-8202469)
 


 
This annotation is a temporary hack. We will remove it after we're able to adopt the [JSpecify](https://jspecify.dev/) nullness annotations and [tools no longer need
 it](https://github.com/google/guava/issues/6126#issuecomment-1203145963).

