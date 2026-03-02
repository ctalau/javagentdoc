# Class: `Parameter`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Parameter`

**Implements:** `java.lang.reflect.AnnotatedElement`

## Description

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

The field is declared with a type of Object to avoid
 compatibility problems on Android VMs. The corresponding accessor method, however, can have the
 more specific return type as long as users are careful to guard calls to it with version checks
 or reflection: Android VMs ignore the types of elements that aren't used.

## Constructors

### `<init>(com.google.common.reflect.Invokable<?,?> declaration, int position, com.google.common.reflect.TypeToken<?> type, java.lang.annotation.Annotation[] annotations, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object annotatedType)`

**Parameters:**
- `declaration` ([`com.google.common.reflect.Invokable<?,?>`](./Invokable.md))
- `position` (`int`)
- `type` ([`com.google.common.reflect.TypeToken<?>`](./TypeToken.md))
- `annotations` (`java.lang.annotation.Annotation[]`)
- `annotatedType` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`)

## Methods

### `getType()`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

### `getDeclaringInvokable()`

**Returns:** [`com.google.common.reflect.Invokable<?,?>`](./Invokable.md)

### `isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> annotationType)`

**Returns:** `boolean`

**Parameters:**
- `annotationType` (`java.lang.Class<? extends java.lang.annotation.Annotation>`)

### `getAnnotation(java.lang.Class<A> annotationType)`

**Returns:** `A`

**Parameters:**
- `annotationType` (`java.lang.Class<A>`)

### `getAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getAnnotationsByType(java.lang.Class<A> annotationType)`

**Returns:** `A[]`

**Parameters:**
- `annotationType` (`java.lang.Class<A>`)

### `getDeclaredAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getDeclaredAnnotation(java.lang.Class<A> annotationType)`

**Returns:** `A`

**Parameters:**
- `annotationType` (`java.lang.Class<A>`)

### `getDeclaredAnnotationsByType(java.lang.Class<A> annotationType)`

**Returns:** `A[]`

**Parameters:**
- `annotationType` (`java.lang.Class<A>`)

### `getAnnotatedType()`

**Returns:** `java.lang.reflect.AnnotatedType`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

