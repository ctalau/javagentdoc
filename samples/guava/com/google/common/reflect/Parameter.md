# Class: `Parameter`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Parameter`

**Implements:** `java.lang.reflect.AnnotatedElement`

## Description

Represents a method or constructor parameter.
@author Ben Yu
@since 14.0

## Fields

### `declaration`

**Type:** [`com.google.common.reflect.Invokable<?,?>`](./Invokable.md)

### `position`

**Type:** `int`

### `type`

**Type:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

### `annotations`

**Type:** [`com.google.common.collect.ImmutableList<java.lang.annotation.Annotation>`](../collect/ImmutableList.md)

### `annotatedType`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

An {@code AnnotatedType} instance, or {@code null} under Android VMs (possible only when using
 the Android flavor of Guava). The field is declared with a type of {@code Object} to avoid
 compatibility problems on Android VMs. The corresponding accessor method, however, can have the
 more specific return type as long as users are careful to guard calls to it with version checks
 or reflection: Android VMs ignore the types of elements that aren't used.

## Constructors

### `<init>([`com.google.common.reflect.Invokable<?,?>`](./Invokable.md) declaration, `int` position, [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md) type, `java.lang.annotation.Annotation[]` annotations, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object` annotatedType)`

## Methods

### `getType()`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

Returns the type of the parameter.

### `getDeclaringInvokable()`

**Returns:** [`com.google.common.reflect.Invokable<?,?>`](./Invokable.md)

Returns the {@link Invokable} that declares this parameter.

### `isAnnotationPresent(`java.lang.Class<? extends java.lang.annotation.Annotation>` annotationType)`

**Returns:** `boolean`

### `getAnnotation(`java.lang.Class<A>` annotationType)`

**Returns:** [`A`](A.md)

### `getAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getAnnotationsByType(`java.lang.Class<A>` annotationType)`

**Returns:** [`A[]`](A.md)

@since 18.0

### `getDeclaredAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

@since 18.0

### `getDeclaredAnnotation(`java.lang.Class<A>` annotationType)`

**Returns:** [`A`](A.md)

@since 18.0

### `getDeclaredAnnotationsByType(`java.lang.Class<A>` annotationType)`

**Returns:** [`A[]`](A.md)

@since 18.0

### `getAnnotatedType()`

**Returns:** `java.lang.reflect.AnnotatedType`

Returns the {@link AnnotatedType} of the parameter.
@since 25.1 for guava-jre

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

