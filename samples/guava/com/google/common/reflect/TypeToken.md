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

### `<init>(Class<?> declaringClass)`

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

### `<init>(Type type)`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

## Methods

### `of(Class<T> type)`

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `of(Type type)`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

### `getRawType()`

Formally speaking, if T is returned by java.lang.reflect.Method#getGenericReturnType, the raw type is what's returned by java.lang.reflect.Method#getReturnType of the same method object. Specifically:

 

   - If T is a Class itself, T itself is returned.
   - If T is a ParameterizedType, the raw type of the parameterized type is
       returned.
   - If T is a GenericArrayType, the returned type is the corresponding array
       class. For example: List<Integer>[] => List[].
   - If T is a type variable or a wildcard type, the raw type of the first upper bound
       is returned. For example: <X extends Foo> => Foo.

**Returns:** `java.lang.Class<? super T>`

### `getType()`

**Returns:** `java.lang.reflect.Type`

### `where(TypeParameter<X> typeParam, TypeToken<X> typeArg)`

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

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `where(TypeParameter<X> typeParam, Class<X> typeArg)`

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

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `resolveType(Type type)`

For example:

 

```

 new TypeToken<List<String>>() {}.resolveType(
     List.class.getMethod("get", int.class).getGenericReturnType())
 => String.class
 
```

**Parameters:**
- `type` (`java.lang.reflect.Type`)

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

### `resolveSupertype(Type type)`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

### `getGenericSuperclass()`

This method is similar but different from Class#getGenericSuperclass. For example, new TypeToken<StringArrayList>()
 {}.getGenericSuperclass() will return new TypeToken<ArrayList<String>>() {}; while
 StringArrayList.class.getGenericSuperclass() will return ArrayList<E>, where
 E is the type variable declared by class ArrayList.

 
If this type is a type variable or wildcard, its first upper bound is examined and returned
 if the bound is a class or extends from a class. This means that the returned type could be a
 type variable too.

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

### `boundAsSuperclass(Type bound)`

**Parameters:**
- `bound` (`java.lang.reflect.Type`)

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

### `getGenericInterfaces()`

This method is
 similar but different from Class#getGenericInterfaces(). For example, new
 TypeToken<List<String>>() {}.getGenericInterfaces() will return a list that contains 
 new TypeToken<Iterable<String>>() {}; while List.class.getGenericInterfaces() will
 return an array that contains Iterable<T>, where the T is the type variable
 declared by interface Iterable.

 
If this type is a type variable or wildcard, its upper bounds are examined and those that
 are either an interface or upper-bounded only by interfaces are returned. This means that the
 returned types could include type variables too.

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>>`](../collect/ImmutableList.md)

### `boundsAsInterfaces(Type[] bounds)`

**Parameters:**
- `bounds` (`java.lang.reflect.Type[]`)

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>>`](../collect/ImmutableList.md)

### `getTypes()`

The returned
 types are parameterized with proper type arguments.

 
Subtypes are always listed before supertypes. But the reverse is not true. A type isn't
 necessarily a subtype of all the types following. Order between types without subtype
 relationship is arbitrary and not guaranteed.

 
If this type is a type variable or wildcard, upper bounds that are themselves type variables
 aren't included (their super interfaces and superclasses are).

**Returns:** [`com.google.common.reflect.TypeToken<T>.TypeSet`](./TypeToken.md)

### `getSupertype(Class<? super T> superclass)`

For example, if this is 
 ArrayList<String>, Iterable<String> is returned given the input 
 Iterable.class.

**Parameters:**
- `superclass` (`java.lang.Class<? super T>`)

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

### `getSubtype(Class<?> subclass)`

For example, if this is
 Iterable<String> and subclass is List, List<String> is
 returned.

**Parameters:**
- `subclass` (`java.lang.Class<?>`)

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

### `isSupertypeOf(TypeToken<?> type)`

"Supertype" is defined
 according to [the rules for type
 arguments](http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1) introduced with Java generics.

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<?>`](./TypeToken.md))

**Returns:** `boolean`

### `isSupertypeOf(Type type)`

"Supertype" is defined
 according to [the rules for type
 arguments](http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1) introduced with Java generics.

**Parameters:**
- `type` (`java.lang.reflect.Type`)

**Returns:** `boolean`

### `isSubtypeOf(TypeToken<?> type)`

"Subtype" is defined
 according to [the rules for type
 arguments](http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1) introduced with Java generics.

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<?>`](./TypeToken.md))

**Returns:** `boolean`

### `isSubtypeOf(Type supertype)`

"Subtype" is defined
 according to [the rules for type
 arguments](http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1) introduced with Java generics.

**Parameters:**
- `supertype` (`java.lang.reflect.Type`)

**Returns:** `boolean`

### `isArray()`

**Returns:** `boolean`

### `isPrimitive()`

**Returns:** `boolean`

### `wrap()`

Idempotent.

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `isWrapper()`

**Returns:** `boolean`

### `unwrap()`

Idempotent.

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `getComponentType()`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

### `method(Method method)`

**Parameters:**
- `method` (`java.lang.reflect.Method`)

**Returns:** [`com.google.common.reflect.Invokable<T,java.lang.Object>`](./Invokable.md)

### `constructor(Constructor<?> constructor)`

**Parameters:**
- `constructor` (`java.lang.reflect.Constructor<?>`)

**Returns:** [`com.google.common.reflect.Invokable<T,T>`](./Invokable.md)

### `equals(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `rejectTypeVariables()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `someRawTypeIsSubclassOf(Class<?> superclass)`

**Parameters:**
- `superclass` (`java.lang.Class<?>`)

**Returns:** `boolean`

### `isSubtypeOfParameterizedType(ParameterizedType supertype)`

**Parameters:**
- `supertype` (`java.lang.reflect.ParameterizedType`)

**Returns:** `boolean`

### `isSubtypeOfArrayType(GenericArrayType supertype)`

**Parameters:**
- `supertype` (`java.lang.reflect.GenericArrayType`)

**Returns:** `boolean`

### `isSupertypeOfArray(GenericArrayType subtype)`

**Parameters:**
- `subtype` (`java.lang.reflect.GenericArrayType`)

**Returns:** `boolean`

### `is(Type formalType, TypeVariable<?> declaration)`

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

**Returns:** `boolean`

### `canonicalizeTypeArg(TypeVariable<?> declaration, Type typeArg)`

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

**Returns:** `java.lang.reflect.Type`

### `canonicalizeWildcardsInType(Type type)`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

**Returns:** `java.lang.reflect.Type`

### `canonicalizeWildcardType(TypeVariable<?> declaration, WildcardType type)`

**Parameters:**
- `declaration` (`java.lang.reflect.TypeVariable<?>`)
- `type` (`java.lang.reflect.WildcardType`)

**Returns:** `java.lang.reflect.WildcardType`

### `canonicalizeWildcardsInParameterizedType(ParameterizedType type)`

**Parameters:**
- `type` (`java.lang.reflect.ParameterizedType`)

**Returns:** `java.lang.reflect.ParameterizedType`

### `every(Type[] bounds)`

**Parameters:**
- `bounds` (`java.lang.reflect.Type[]`)

**Returns:** `com.google.common.reflect.TypeToken.Bounds`

### `any(Type[] bounds)`

**Parameters:**
- `bounds` (`java.lang.reflect.Type[]`)

**Returns:** `com.google.common.reflect.TypeToken.Bounds`

### `getRawTypes()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.lang.Class<? super T>>`](../collect/ImmutableSet.md)

### `isOwnedBySubtypeOf(Type supertype)`

**Parameters:**
- `supertype` (`java.lang.reflect.Type`)

**Returns:** `boolean`

### `getOwnerTypeIfPresent()`

**Returns:** `java.lang.reflect.Type`

### `toGenericType(Class<T> cls)`

For example:
 TypeToken.getGenericType(Iterable.class) returns Iterable<T>.

 
If cls isn't parameterized and isn't a generic array, the type token of the class is
 returned.

**Parameters:**
- `cls` (`java.lang.Class<T>`)

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

### `getCovariantTypeResolver()`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

### `getInvariantTypeResolver()`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

### `getSupertypeFromUpperBounds(Class<? super T> supertype, Type[] upperBounds)`

**Parameters:**
- `supertype` (`java.lang.Class<? super T>`)
- `upperBounds` (`java.lang.reflect.Type[]`)

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

### `getSubtypeFromLowerBounds(Class<?> subclass, Type[] lowerBounds)`

**Parameters:**
- `subclass` (`java.lang.Class<?>`)
- `lowerBounds` (`java.lang.reflect.Type[]`)

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

### `getArraySupertype(Class<? super T> supertype)`

**Parameters:**
- `supertype` (`java.lang.Class<? super T>`)

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

### `getArraySubtype(Class<?> subclass)`

**Parameters:**
- `subclass` (`java.lang.Class<?>`)

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

### `resolveTypeArgsForSubclass(Class<?> subclass)`

**Parameters:**
- `subclass` (`java.lang.Class<?>`)

**Returns:** `java.lang.reflect.Type`

### `newArrayClassOrGenericArrayType(Type componentType)`

This is what Java7 does for generic array type parameters.

**Parameters:**
- `componentType` (`java.lang.reflect.Type`)

**Returns:** `java.lang.reflect.Type`

