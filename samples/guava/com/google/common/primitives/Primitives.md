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

### `add(Map<Class<?>,Class<?>> forward, Map<Class<?>,Class<?>> backward, Class<?> key, Class<?> value)`

**Parameters:**
- `forward` (`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`)
- `backward` (`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`)
- `key` (`java.lang.Class<?>`)
- `value` (`java.lang.Class<?>`)

**Returns:** `void`

### `allPrimitiveTypes()`

Note that a
 simpler way to test whether a Class instance is a member of this set is to call Class#isPrimitive.

**Returns:** `java.util.Set<java.lang.Class<?>>`

### `allWrapperTypes()`

**Returns:** `java.util.Set<java.lang.Class<?>>`

### `isWrapperType(Class<?> type)`

**Parameters:**
- `type` (`java.lang.Class<?>`)

**Returns:** `boolean`

### `wrap(Class<T> type)`

Idempotent.

 

```

     wrap(int.class) == Integer.class
     wrap(Integer.class) == Integer.class
     wrap(String.class) == String.class
 
```

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** `java.lang.Class<T>`

### `unwrap(Class<T> type)`

Idempotent.

 

```

     unwrap(Integer.class) == int.class
     unwrap(int.class) == int.class
     unwrap(String.class) == String.class
 
```

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** `java.lang.Class<T>`

