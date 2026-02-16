# Interface: `TypeToInstanceMap`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeToInstanceMap`

**Extends:** [`java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map,B>.md)

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A map, each entry of which maps a {@link TypeToken} to an instance of that type. In addition to
 implementing {@code Map}, the additional type-safe operations {@link #putInstance} and {@link #getInstance} are available.

 <p>Generally, implementations don't support {@link #put} and {@link #putAll} because there is no
 way to check an object at runtime to be an instance of a {@link TypeToken}. Instead, caller
 should use the type safe {@link #putInstance}.

 <p>Also, if caller suppresses unchecked warnings and passes in an {@code Iterable<String>} for
 type {@code Iterable<Integer>}, the map won't be able to detect and throw type error.

 <p>Like any other {@code Map<Class, Object>}, this map may contain entries for primitive types,
 and a primitive type and its corresponding wrapper type may map to different values.
@param <B> the common supertype that all entries must share; often this is simply {@link Object}
@author Ben Yu
@since 13.0

## Methods

### `getInstance(`java.lang.Class<T>` type)`

**Returns:** [`T`](T.md)

Returns the value the specified class is mapped to, or {@code null} if no entry for this class
 is present. This will only return a value that was bound to this specific class, not a value
 that may have been bound to a subtype.

 <p>{@code getInstance(Foo.class)} is equivalent to {@code
 getInstance(TypeToken.of(Foo.class))}.

### `getInstance([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md) type)`

**Returns:** [`T`](T.md)

Returns the value the specified type is mapped to, or {@code null} if no entry for this type is
 present. This will only return a value that was bound to this specific type, not a value that
 may have been bound to a subtype.

### `putInstance(`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type, [`T`](T.md) value)`

**Returns:** [`T`](T.md)

Maps the specified class to the specified value. Does <i>not</i> associate this value with any
 of the class's supertypes.

 <p>{@code putInstance(Foo.class, foo)} is equivalent to {@code
 putInstance(TypeToken.of(Foo.class), foo)}.
@return the value previously associated with this class (possibly {@code null}), or {@code
     null} if there was no previous entry.

### `putInstance([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md) type, [`T`](T.md) value)`

**Returns:** [`T`](T.md)

Maps the specified type to the specified value. Does <i>not</i> associate this value with any
 of the type's supertypes.
@return the value previously associated with this type (possibly {@code null}), or {@code null}
     if there was no previous entry.

