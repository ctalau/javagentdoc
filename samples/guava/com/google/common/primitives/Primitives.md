# Class: `Primitives`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Primitives`

## Description

## Fields

### `PRIMITIVE_TO_WRAPPER_TYPE`

**Type:** `java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`

### `WRAPPER_TO_PRIMITIVE_TYPE`

**Type:** `java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`

## Constructors

### `<init>()`

## Methods

### `add(java.util.Map<java.lang.Class<?>,java.lang.Class<?>> forward, java.util.Map<java.lang.Class<?>,java.lang.Class<?>> backward, java.lang.Class<?> key, java.lang.Class<?> value)`

**Returns:** `void`

**Parameters:**
- `forward` (`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`)
- `backward` (`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`)
- `key` (`java.lang.Class<?>`)
- `value` (`java.lang.Class<?>`)

### `allPrimitiveTypes()`

**Returns:** `java.util.Set<java.lang.Class<?>>`

Note that a
 simpler way to test whether a Class instance is a member of this set is to call Class#isPrimitive.

### `allWrapperTypes()`

**Returns:** `java.util.Set<java.lang.Class<?>>`

### `isWrapperType(java.lang.Class<?> type)`

**Returns:** `boolean`

**Parameters:**
- `type` (`java.lang.Class<?>`)

### `wrap(java.lang.Class<T> type)`

**Returns:** `java.lang.Class<T>`

Idempotent.

 

```

     wrap(int.class) == Integer.class
     wrap(Integer.class) == Integer.class
     wrap(String.class) == String.class
 
```

**Parameters:**
- `type` (`java.lang.Class<T>`)

### `unwrap(java.lang.Class<T> type)`

**Returns:** `java.lang.Class<T>`

Idempotent.

 

```

     unwrap(Integer.class) == int.class
     unwrap(int.class) == int.class
     unwrap(String.class) == String.class
 
```

**Parameters:**
- `type` (`java.lang.Class<T>`)

