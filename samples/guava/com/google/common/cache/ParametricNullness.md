# Annotation_type: `ParametricNullness`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.ParametricNullness`

**Implements:** `java.lang.annotation.Annotation`

## Description

Annotates a "top-level" type-variable usage that takes its nullness from the type argument
 supplied by the user of the class. For example, {@code Multiset.Entry.getElement()} returns
 {@code @ParametricNullness E}, which means:

 <ul>
   <li>{@code getElement} on a {@code Multiset.Entry<@NonNull String>} returns {@code @NonNull
       String}.
   <li>{@code getElement} on a {@code Multiset.Entry<@Nullable String>} returns {@code @Nullable
       String}.
 </ul>

 This is the same behavior as type-variable usages have to Kotlin and to the Checker Framework.
 Contrast the method above to:

 <ul>
   <li>methods whose return type is a type variable but which can never return {@code null},
       typically because the type forbids nullable type arguments: For example, {@code
       ImmutableList.get} returns {@code E}, but that value is never {@code null}. (Accordingly,
       {@code ImmutableList} is declared to forbid {@code ImmutableList<@Nullable String>}.)
   <li>methods whose return type is a type variable but which can return {@code null} regardless
       of the type argument supplied by the user of the class: For example, {@code
       ImmutableMap.get} returns {@code @Nullable E} because the method can return {@code null}
       even on an {@code ImmutableMap<K, @NonNull String>}.
 </ul>

 <p>Consumers of this annotation include:

 <ul>
   <li>Kotlin, for which it makes the type-variable usage (a) a Kotlin platform type when the type
       argument is non-nullable and (b) nullable when the type argument is nullable. We use this
       to "undo" {@link ElementTypesAreNonnullByDefault}. It is the best we can do for Kotlin
       under our current constraints.
   <li>NullAway, which will <a href="https://github.com/google/guava/issues/6126#issuecomment-1204399671">treat it
       identically to {@code Nullable} as of version 0.9.9</a>. To treat it that way before then,
       you can set {@code
       -XepOpt:NullAway:CustomNullableAnnotations=com.google.common.base.ParametricNullness,...,com.google.common.util.concurrent.ParametricNullness},
       where the {@code ...} contains the names of all the other {@code ParametricNullness}
       annotations in Guava. Or you might prefer to omit Guava from your {@code AnnotatedPackages}
       list.
   <li><a href="https://developers.google.com/j2objc">J2ObjC</a>
   <li>{@code NullPointerTester}, at least in the Android backport (where the type-use annotations
       {@code NullPointerTester} would need are not available) and in case of <a href="https://bugs.openjdk.java.net/browse/JDK-8202469">JDK-8202469</a>
 </ul>

 <p>This annotation is a temporary hack. We will remove it after we're able to adopt the <a href="https://jspecify.dev/">JSpecify</a> nullness annotations and <a href="https://github.com/google/guava/issues/6126#issuecomment-1203145963">tools no longer need
 it</a>.

