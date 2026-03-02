# Class: `TypeParameter`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeParameter`

**Extends:** [`com.google.common.reflect.TypeCapture<T>`](./TypeCapture.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

For example:

 

```

 static <T> TypeToken<List<T>> listOf(Class<T> elementType) {
   return new TypeToken<List<T>>() {}
       .where(new TypeParameter<T>() {}, elementType);
 }
 
```

## Fields

### `typeVariable`

**Type:** `java.lang.reflect.TypeVariable<?>`

## Constructors

### `<init>()`

## Methods

### `hashCode()`

**Returns:** `int`

### `equals(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

