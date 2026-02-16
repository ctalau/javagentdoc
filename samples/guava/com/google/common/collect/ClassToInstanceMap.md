# Interface: `ClassToInstanceMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ClassToInstanceMap`

**Extends:** [`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map,B>.md)

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A map, each entry of which maps a Java <a href="http://tinyurl.com/2cmwkz">raw type</a> to an
 instance of that type. In addition to implementing {@code Map}, the additional type-safe
 operations {@link #putInstance} and {@link #getInstance} are available.

 <p>Like any other {@code Map<Class, Object>}, this map may contain entries for primitive types,
 and a primitive type and its corresponding wrapper type may map to different values.

 <h3>Implementations</h3>

 <ul>
   <li>{@link ImmutableClassToInstanceMap}
   <li>{@link MutableClassToInstanceMap}
 </ul>

 <p>To map a generic type to an instance of that type, use {@link com.google.common.reflect.TypeToInstanceMap} instead.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#classtoinstancemap">{@code
 ClassToInstanceMap}</a>.
@param <B> the common supertype that all values will share. When in doubt, just use {@link Object}, or use {@code @Nullable Object} to allow null values.
@since 2.0

## Methods

### `getInstance(`java.lang.Class<T>` type)`

**Returns:** [`T`](T.md)

Returns the value the specified class is mapped to, or {@code null} if no entry for this class
 is present. This will only return a value that was bound to this specific class, not a value
 that may have been bound to a subtype.

### `putInstance(`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type, [`T`](T.md) value)`

**Returns:** [`T`](T.md)

Maps the specified class to the specified value. Does <i>not</i> associate this value with any
 of the class's supertypes.
@return the value previously associated with this class (possibly {@code null}), or {@code
     null} if there was no previous entry.

