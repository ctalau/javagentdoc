# Class: `TypeToken`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeToken`

**Extends:** [`com.google.common.reflect.TypeCapture<T>`](./TypeCapture.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Operations that are otherwise only available in Class are implemented to support
 Type, for example #isSubtypeOf, #isArray and #getComponentType.
 It also provides additional utilities such as #getTypes, #resolveType, etc.

 
There are three ways to get a TypeToken instance:

 

   - Wrap a Type obtained via reflection. For example: 
       TypeToken.of(method.getGenericReturnType()).
   - Capture a generic type with a (usually anonymous) subclass. For example:
       

```

 new TypeToken<List<String>>() {}
 
```

       
Note that it's critical that the actual type argument is carried by a subclass. The
       following code is wrong because it only captures the <T> type variable of the
       listType() method signature; while <String> is lost in erasure:
       

```

 class Util {
   static <T> TypeToken<List<T>> listType() {
     return new TypeToken<List<T>>() {};
   }
 }

 TypeToken<List<String>> stringListType = Util.<String>listType();
 
```

   - Capture a generic type with a (usually anonymous) subclass and resolve it against a context
       class that knows what the type parameters are. For example:
       

```

 abstract class IKnowMyType<T> {
   TypeToken<T> type = new TypeToken<T>(getClass()) {};
 }
 new IKnowMyType<String>() {}.type => String
 
```

 


 
TypeToken is serializable when no type variable is contained in the type.

 
Note to Guice users: TypeToken is similar to Guice's TypeLiteral class except
 that it is serializable and offers numerous additional utility methods.

## Fields

### `runtimeType`

**Type:** `java.lang.reflect.Type`

### `invariantTypeResolver`

**Type:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

### `covariantTypeResolver`

**Type:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

Clients create an empty anonymous subclass. Doing so embeds the type parameter in the
 anonymous class's type hierarchy so we can reconstitute it at runtime despite erasure.

 
For example:

 

```

 TypeToken<List<String>> t = new TypeToken<List<String>>() {};
 
```

### `<init>(java.lang.Class<?> declaringClass)`

Clients create an empty anonymous subclass. Doing so embeds the type parameter in the
 anonymous class's type hierarchy so we can reconstitute it at runtime despite erasure.

 
For example:

 

```

 abstract class IKnowMyType<T> {
   TypeToken<T> getMyType() {
     return new TypeToken<T>(getClass()) {};
   }
 }

 new IKnowMyType<String>() {}.getMyType() => String
 
```

**Parameters:**
- `declaringClass` (`java.lang.Class<?>`)

### `<init>(java.lang.reflect.Type type)`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

## Methods

### `of(java.lang.Class<T> type)`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

**Parameters:**
- `type` (`java.lang.Class<T>`)

### `of(java.lang.reflect.Type type)`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

**Parameters:**
- `type` (`java.lang.reflect.Type`)

### `getRawType()`

**Returns:** `java.lang.Class<? super T>`

Formally speaking, if T is returned by java.lang.reflect.Method#getGenericReturnType, the raw type is what's returned by java.lang.reflect.Method#getReturnType of the same method object. Specifically:

 

   - If T is a Class itself, T itself is returned.
   - If T is a ParameterizedType, the raw type of the parameterized type is
       returned.
   - If T is a GenericArrayType, the returned type is the corresponding array
       class. For example: List<Integer>[] => List[].
   - If T is a type variable or a wildcard type, the raw type of the first upper bound
       is returned. For example: <X extends Foo> => Foo.

### `getType()`

**Returns:** `java.lang.reflect.Type`

### `where(com.google.common.reflect.TypeParameter<X> typeParam, com.google.common.reflect.TypeToken<X> typeArg)`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

For example, it can be used to construct Map<K, V> for
 any K and V type:

 

```

 static <K, V> TypeToken<Map<K, V>> mapOf(
     TypeToken<K> keyType, TypeToken<V> valueType) {
   return new TypeToken<Map<K, V>>() {}
       .where(new TypeParameter<K>() {}, keyType)
       .where(new TypeParameter<V>() {}, valueType);
 }
 
```

**Parameters:**
- `typeParam` ([`com.google.common.reflect.TypeParameter<X>`](./TypeParameter.md)): the parameter type variable
- `typeArg` ([`com.google.common.reflect.TypeToken<X>`](./TypeToken.md)): the actual type to substitute

### `where(com.google.common.reflect.TypeParameter<X> typeParam, java.lang.Class<X> typeArg)`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

For example, it can be used to construct Map<K, V> for
 any K and V type:

 

```

 static <K, V> TypeToken<Map<K, V>> mapOf(
     Class<K> keyType, Class<V> valueType) {
   return new TypeToken<Map<K, V>>() {}
       .where(new TypeParameter<K>() {}, keyType)
       .where(new TypeParameter<V>() {}, valueType);
 }
 
```

**Parameters:**
- `typeParam` ([`com.google.common.reflect.TypeParameter<X>`](./TypeParameter.md)): the parameter type variable
- `typeArg` (`java.lang.Class<X>`): the actual type to substitute

### `resolveType(java.lang.reflect.Type type)`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

For example:

 

```

 new TypeToken<List<String>>() {}.resolveType(
     List.class.getMethod("get", int.class).getGenericReturnType())
 => String.class
 
```

**Parameters:**
- `type` (`java.lang.reflect.Type`)

### `resolveSupertype(java.lang.reflect.Type type)`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

**Parameters:**
- `type` (`java.lang.reflect.Type`)

### `getGenericSuperclass()`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

This method is similar but different from Class#getGenericSuperclass. For example, new TypeToken<StringArrayList>()
 {}.getGenericSuperclass() will return new TypeToken<ArrayList<String>>() {}; while
 StringArrayList.class.getGenericSuperclass() will return ArrayList<E>, where
 E is the type variable declared by class ArrayList.

 
If this type is a type variable or wildcard, its first upper bound is examined and returned
 if the bound is a class or extends from a class. This means that the returned type could be a
 type variable too.

### `boundAsSuperclass(java.lang.reflect.Type bound)`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

**Parameters:**
- `bound` (`java.lang.reflect.Type`)

### `getGenericInterfaces()`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>>`](../collect/ImmutableList.md)

This method is
 similar but different from Class#getGenericInterfaces(). For example, new
 TypeToken<List<String>>() {}.getGenericInterfaces() will return a list that contains 
 new TypeToken<Iterable<String>>() {}; while List.class.getGenericInterfaces() will
 return an array that contains Iterable<T>, where the T is the type variable
 declared by interface Iterable.

 
If this type is a type variable or wildcard, its upper bounds are examined and those that
 are either an interface or upper-bounded only by interfaces are returned. This means that the
 returned types could include type variables too.

### `boundsAsInterfaces(java.lang.reflect.Type[] bounds)`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>>`](../collect/ImmutableList.md)

**Parameters:**
- `bounds` (`java.lang.reflect.Type[]`)

### `getTypes()`

**Returns:** [`com.google.common.reflect.TypeToken<T>.TypeSet`](./TypeToken.md)

The returned
 types are parameterized with proper type arguments.

 
Subtypes are always listed before supertypes. But the reverse is not true. A type isn't
 necessarily a subtype of all the types following. Order between types without subtype
 relationship is arbitrary and not guaranteed.

 
If this type is a type variable or wildcard, upper bounds that are themselves type variables
 aren't included (their super interfaces and superclasses are).

### `getSupertype(java.lang.Class<? super T> superclass)`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

For example, if this is 
 ArrayList<String>, Iterable<String> is returned given the input 
 Iterable.class.

**Parameters:**
- `superclass` (`java.lang.Class<? super T>`)

### `getSubtype(java.lang.Class<?> subclass)`

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

For example, if this is
 Iterable<String> and subclass is List, List<String> is
 returned.

**Parameters:**
- `subclass` (`java.lang.Class<?>`)

### `isSupertypeOf(com.google.common.reflect.TypeToken<?> type)`

**Returns:** `boolean`

"Supertype" is defined
 according to [the rules for type
 arguments](http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1) introduced with Java generics.

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<?>`](./TypeToken.md))

### `isSupertypeOf(java.lang.reflect.Type type)`

**Returns:** `boolean`

"Supertype" is defined
 according to [the rules for type
 arguments](http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1) introduced with Java generics.

**Parameters:**
- `type` (`java.lang.reflect.Type`)

### `isSubtypeOf(com.google.common.reflect.TypeToken<?> type)`

**Returns:** `boolean`

"Subtype" is defined
 according to [the rules for type
 arguments](http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1) introduced with Java generics.

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<?>`](./TypeToken.md))

### `isSubtypeOf(java.lang.reflect.Type supertype)`

**Returns:** `boolean`

"Subtype" is defined
 according to [the rules for type
 arguments](http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1) introduced with Java generics.

**Parameters:**
- `supertype` (`java.lang.reflect.Type`)

### `isArray()`

**Returns:** `boolean`

### `isPrimitive()`

**Returns:** `boolean`

### `wrap()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Idempotent.

### `isWrapper()`

**Returns:** `boolean`

### `unwrap()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Idempotent.

### `getComponentType()`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

### `method(java.lang.reflect.Method method)`

**Returns:** [`com.google.common.reflect.Invokable<T,java.lang.Object>`](./Invokable.md)

**Parameters:**
- `method` (`java.lang.reflect.Method`)

### `constructor(java.lang.reflect.Constructor<?> constructor)`

**Returns:** [`com.google.common.reflect.Invokable<T,T>`](./Invokable.md)

**Parameters:**
- `constructor` (`java.lang.reflect.Constructor<?>`)

### `equals(java.lang.Object o)`

**Returns:** `boolean`

**Parameters:**
- `o` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `rejectTypeVariables()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `someRawTypeIsSubclassOf(java.lang.Class<?> superclass)`

**Returns:** `boolean`

**Parameters:**
- `superclass` (`java.lang.Class<?>`)

### `isSubtypeOfParameterizedType(java.lang.reflect.ParameterizedType supertype)`

**Returns:** `boolean`

**Parameters:**
- `supertype` (`java.lang.reflect.ParameterizedType`)

### `isSubtypeOfArrayType(java.lang.reflect.GenericArrayType supertype)`

**Returns:** `boolean`

**Parameters:**
- `supertype` (`java.lang.reflect.GenericArrayType`)

### `isSupertypeOfArray(java.lang.reflect.GenericArrayType subtype)`

**Returns:** `boolean`

**Parameters:**
- `subtype` (`java.lang.reflect.GenericArrayType`)

### `is(java.lang.reflect.Type formalType, java.lang.reflect.TypeVariable<?> declaration)`

**Returns:** `boolean`

Specifically, returns true if any of the following conditions is met:

 

   - 'this' and formalType are equal.
   - 'this' and formalType have equal canonical form.
   - formalType is <? extends Foo> and 'this' is a subtype of Foo.
   - formalType is <? super Foo> and 'this' is a supertype of Foo.
 


 Note that condition 2 isn't technically accurate under the context of a recursively bounded
 type variables. For example, Enum<? extends Enum<E>> canonicalizes to Enum<?>
 where E is the type variable declared on the Enum class declaration. It's
 technically *not* true that Foo<Enum<? extends Enum<E>>> is a subtype of 
 Foo<Enum<?>> according to JLS. See testRecursiveWildcardSubtypeBug() for a real example.

 
It appears that properly handling recursive type bounds in the presence of implicit type
 bounds is not easy. For now we punt, hoping that this defect should rarely cause issues in real
 code.

**Parameters:**
- `formalType` (`java.lang.reflect.Type`): is Foo<formalType> a supertype of Foo<T>?
- `declaration` (`java.lang.reflect.TypeVariable<?>`): The type variable in the context of a parameterized type. Used to infer type
     bound when formalType is a wildcard with implicit upper bound.

### `canonicalizeTypeArg(java.lang.reflect.TypeVariable<?> declaration, java.lang.reflect.Type typeArg)`

**Returns:** `java.lang.reflect.Type`

Thus directly calling <?>.is(String.class)
 will return false. To mitigate, we canonicalize wildcards by enforcing the following
 invariants:

 

   - canonicalize(t) always produces the equal result for equivalent types. For
       example both Enum<?> and Enum<? extends Enum<?>> canonicalize to 
       Enum<? extends Enum<E>.
   - canonicalize(t) produces a "literal" supertype of t. For example: Enum<?
       extends Enum<?>> canonicalizes to Enum<?>, which is a supertype (if we disregard
       the upper bound is implicitly an Enum too).
   - If canonicalize(A) == canonicalize(B), then Foo<A>.isSubtypeOf(Foo<B>)
       and vice versa. i.e. A.is(B) and B.is(A).
   - canonicalize(canonicalize(A)) == canonicalize(A).

**Parameters:**
- `declaration` (`java.lang.reflect.TypeVariable<?>`)
- `typeArg` (`java.lang.reflect.Type`)

### `canonicalizeWildcardsInType(java.lang.reflect.Type type)`

**Returns:** `java.lang.reflect.Type`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

### `canonicalizeWildcardType(java.lang.reflect.TypeVariable<?> declaration, java.lang.reflect.WildcardType type)`

**Returns:** `java.lang.reflect.WildcardType`

**Parameters:**
- `declaration` (`java.lang.reflect.TypeVariable<?>`)
- `type` (`java.lang.reflect.WildcardType`)

### `canonicalizeWildcardsInParameterizedType(java.lang.reflect.ParameterizedType type)`

**Returns:** `java.lang.reflect.ParameterizedType`

**Parameters:**
- `type` (`java.lang.reflect.ParameterizedType`)

### `every(java.lang.reflect.Type[] bounds)`

**Returns:** `com.google.common.reflect.TypeToken.Bounds`

**Parameters:**
- `bounds` (`java.lang.reflect.Type[]`)

### `any(java.lang.reflect.Type[] bounds)`

**Returns:** `com.google.common.reflect.TypeToken.Bounds`

**Parameters:**
- `bounds` (`java.lang.reflect.Type[]`)

### `getRawTypes()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.lang.Class<? super T>>`](../collect/ImmutableSet.md)

### `isOwnedBySubtypeOf(java.lang.reflect.Type supertype)`

**Returns:** `boolean`

**Parameters:**
- `supertype` (`java.lang.reflect.Type`)

### `getOwnerTypeIfPresent()`

**Returns:** `java.lang.reflect.Type`

### `toGenericType(java.lang.Class<T> cls)`

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

For example:
 TypeToken.getGenericType(Iterable.class) returns Iterable<T>.

 
If cls isn't parameterized and isn't a generic array, the type token of the class is
 returned.

**Parameters:**
- `cls` (`java.lang.Class<T>`)

### `getCovariantTypeResolver()`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

### `getInvariantTypeResolver()`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

### `getSupertypeFromUpperBounds(java.lang.Class<? super T> supertype, java.lang.reflect.Type[] upperBounds)`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

**Parameters:**
- `supertype` (`java.lang.Class<? super T>`)
- `upperBounds` (`java.lang.reflect.Type[]`)

### `getSubtypeFromLowerBounds(java.lang.Class<?> subclass, java.lang.reflect.Type[] lowerBounds)`

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

**Parameters:**
- `subclass` (`java.lang.Class<?>`)
- `lowerBounds` (`java.lang.reflect.Type[]`)

### `getArraySupertype(java.lang.Class<? super T> supertype)`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

**Parameters:**
- `supertype` (`java.lang.Class<? super T>`)

### `getArraySubtype(java.lang.Class<?> subclass)`

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

**Parameters:**
- `subclass` (`java.lang.Class<?>`)

### `resolveTypeArgsForSubclass(java.lang.Class<?> subclass)`

**Returns:** `java.lang.reflect.Type`

**Parameters:**
- `subclass` (`java.lang.Class<?>`)

### `newArrayClassOrGenericArrayType(java.lang.reflect.Type componentType)`

**Returns:** `java.lang.reflect.Type`

This is what Java7 does for generic array type parameters.

**Parameters:**
- `componentType` (`java.lang.reflect.Type`)

