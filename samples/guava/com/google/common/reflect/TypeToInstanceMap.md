# Interface: `TypeToInstanceMap`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeToInstanceMap`

**Extends:** `java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

In addition to
 implementing Map, the additional type-safe operations #putInstance and #getInstance are available.

 
Generally, implementations don't support #put and #putAll because there is no
 way to check an object at runtime to be an instance of a TypeToken. Instead, caller
 should use the type safe #putInstance.

 
Also, if caller suppresses unchecked warnings and passes in an Iterable<String> for
 type Iterable<Integer>, the map won't be able to detect and throw type error.

 
Like any other Map<Class, Object>, this map may contain entries for primitive types,
 and a primitive type and its corresponding wrapper type may map to different values.

## Methods

### `getInstance(Class<T> type)`

This will only return a value that was bound to this specific class, not a value
 that may have been bound to a subtype.

 
getInstance(Foo.class) is equivalent to 
 getInstance(TypeToken.of(Foo.class)).

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** `T`

### `getInstance(TypeToken<T> type)`

This will only return a value that was bound to this specific type, not a value that
 may have been bound to a subtype.

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

**Returns:** `T`

### `putInstance(Class<@NonNull T> type, T value)`

Does *not* associate this value with any
 of the class's supertypes.

 
putInstance(Foo.class, foo) is equivalent to 
 putInstance(TypeToken.of(Foo.class), foo).

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`)
- `value` (`T`)

**Returns:** `T`

### `putInstance(TypeToken<@NonNull T> type, T value)`

Does *not* associate this value with any
 of the type's supertypes.

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md))
- `value` (`T`)

**Returns:** `T`

