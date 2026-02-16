# Class: `TypeParameter`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeParameter`

**Extends:** [`com.google.common.reflect.TypeCapture<T>`](./TypeCapture.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Captures a free type variable that can be used in {@link TypeToken#where}. For example:

 <pre>{@code
 static <T> TypeToken<List<T>> listOf(Class<T> elementType) {
   return new TypeToken<List<T>>() {}
       .where(new TypeParameter<T>() {}, elementType);
 }
 }</pre>
@author Ben Yu
@since 12.0

## Fields

### `typeVariable`

**Type:** `java.lang.reflect.TypeVariable<?>`

## Constructors

### `<init>()`

## Methods

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` o)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

