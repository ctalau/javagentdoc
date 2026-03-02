# Interface: `ClassToInstanceMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ClassToInstanceMap`

**Extends:** `java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

In addition to implementing Map, the additional type-safe
 operations #putInstance and #getInstance are available.

 
Like any other Map<Class, Object>, this map may contain entries for primitive types,
 and a primitive type and its corresponding wrapper type may map to different values.

 Implementations

 

   - ImmutableClassToInstanceMap
   - MutableClassToInstanceMap
 


 
To map a generic type to an instance of that type, use com.google.common.reflect.TypeToInstanceMap instead.

 
See the Guava User Guide article on [
 ClassToInstanceMap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#classtoinstancemap).

## Methods

### `getInstance(Class<T> type)`

This will only return a value that was bound to this specific class, not a value
 that may have been bound to a subtype.

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** `T`

### `putInstance(Class<@NonNull T> type, T value)`

Does *not* associate this value with any
 of the class's supertypes.

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`)
- `value` (`T`)

**Returns:** `T`

