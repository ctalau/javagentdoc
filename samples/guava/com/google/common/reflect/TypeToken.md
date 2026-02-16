# Class: `TypeToken`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeToken`

**Extends:** [`com.google.common.reflect.TypeCapture<T>`](./TypeCapture.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

A {@link Type} with generics.

 <p>Operations that are otherwise only available in {@link Class} are implemented to support
 {@code Type}, for example {@link #isSubtypeOf}, {@link #isArray} and {@link #getComponentType}.
 It also provides additional utilities such as {@link #getTypes}, {@link #resolveType}, etc.

 <p>There are three ways to get a {@code TypeToken} instance:

 <ul>
   <li>Wrap a {@code Type} obtained via reflection. For example: {@code
       TypeToken.of(method.getGenericReturnType())}.
   <li>Capture a generic type with a (usually anonymous) subclass. For example:
       <pre>{@code
 new TypeToken<List<String>>() {}
 }</pre>
       <p>Note that it's critical that the actual type argument is carried by a subclass. The
       following code is wrong because it only captures the {@code <T>} type variable of the
       {@code listType()} method signature; while {@code <String>} is lost in erasure:
       <pre>{@code
 class Util {
   static <T> TypeToken<List<T>> listType() {
     return new TypeToken<List<T>>() {};
   }
 }

 TypeToken<List<String>> stringListType = Util.<String>listType();
 }</pre>
   <li>Capture a generic type with a (usually anonymous) subclass and resolve it against a context
       class that knows what the type parameters are. For example:
       <pre>{@code
 abstract class IKnowMyType<T> {
   TypeToken<T> type = new TypeToken<T>(getClass()) {};
 }
 new IKnowMyType<String>() {}.type => String
 }</pre>
 </ul>

 <p>{@code TypeToken} is serializable when no type variable is contained in the type.

 <p>Note to Guice users: {@code TypeToken} is similar to Guice's {@code TypeLiteral} class except
 that it is serializable and offers numerous additional utility methods.
@author Bob Lee
@author Sven Mawson
@author Ben Yu
@since 12.0

## Fields

### `runtimeType`

**Type:** `java.lang.reflect.Type`

### `invariantTypeResolver`

**Type:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

Resolver for resolving parameter and field types with {@link #runtimeType} as context.

### `covariantTypeResolver`

**Type:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

Resolver for resolving covariant types with {@link #runtimeType} as context.

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

Constructs a new type token of {@code T}.

 <p>Clients create an empty anonymous subclass. Doing so embeds the type parameter in the
 anonymous class's type hierarchy so we can reconstitute it at runtime despite erasure.

 <p>For example:

 <pre>{@code
 TypeToken<List<String>> t = new TypeToken<List<String>>() {};
 }</pre>

### `<init>(`java.lang.Class<?>` declaringClass)`

Constructs a new type token of {@code T} while resolving free type variables in the context of
 {@code declaringClass}.

 <p>Clients create an empty anonymous subclass. Doing so embeds the type parameter in the
 anonymous class's type hierarchy so we can reconstitute it at runtime despite erasure.

 <p>For example:

 <pre>{@code
 abstract class IKnowMyType<T> {
   TypeToken<T> getMyType() {
     return new TypeToken<T>(getClass()) {};
   }
 }

 new IKnowMyType<String>() {}.getMyType() => String
 }</pre>

### `<init>(`java.lang.reflect.Type` type)`

## Methods

### `of(`java.lang.Class<T>` type)`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Returns an instance of type token that wraps {@code type}.

### `of(`java.lang.reflect.Type` type)`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

Returns an instance of type token that wraps {@code type}.

### `getRawType()`

**Returns:** `java.lang.Class<? super T>`

Returns the raw type of {@code T}. Formally speaking, if {@code T} is returned by {@link java.lang.reflect.Method#getGenericReturnType}, the raw type is what's returned by {@link java.lang.reflect.Method#getReturnType} of the same method object. Specifically:

 <ul>
   <li>If {@code T} is a {@code Class} itself, {@code T} itself is returned.
   <li>If {@code T} is a {@link ParameterizedType}, the raw type of the parameterized type is
       returned.
   <li>If {@code T} is a {@link GenericArrayType}, the returned type is the corresponding array
       class. For example: {@code List<Integer>[] => List[]}.
   <li>If {@code T} is a type variable or a wildcard type, the raw type of the first upper bound
       is returned. For example: {@code <X extends Foo> => Foo}.
 </ul>

### `getType()`

**Returns:** `java.lang.reflect.Type`

Returns the represented type.

### `where([`com.google.common.reflect.TypeParameter<X>`](./TypeParameter.md) typeParam, [`com.google.common.reflect.TypeToken<X>`](./TypeToken.md) typeArg)`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Returns a new {@code TypeToken} where type variables represented by {@code typeParam} are
 substituted by {@code typeArg}. For example, it can be used to construct {@code Map<K, V>} for
 any {@code K} and {@code V} type:

 <pre>{@code
 static <K, V> TypeToken<Map<K, V>> mapOf(
     TypeToken<K> keyType, TypeToken<V> valueType) {
   return new TypeToken<Map<K, V>>() {}
       .where(new TypeParameter<K>() {}, keyType)
       .where(new TypeParameter<V>() {}, valueType);
 }
 }</pre>
@param <X> The parameter type
@param typeParam the parameter type variable
@param typeArg the actual type to substitute

### `where([`com.google.common.reflect.TypeParameter<X>`](./TypeParameter.md) typeParam, `java.lang.Class<X>` typeArg)`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Returns a new {@code TypeToken} where type variables represented by {@code typeParam} are
 substituted by {@code typeArg}. For example, it can be used to construct {@code Map<K, V>} for
 any {@code K} and {@code V} type:

 <pre>{@code
 static <K, V> TypeToken<Map<K, V>> mapOf(
     Class<K> keyType, Class<V> valueType) {
   return new TypeToken<Map<K, V>>() {}
       .where(new TypeParameter<K>() {}, keyType)
       .where(new TypeParameter<V>() {}, valueType);
 }
 }</pre>
@param <X> The parameter type
@param typeParam the parameter type variable
@param typeArg the actual type to substitute

### `resolveType(`java.lang.reflect.Type` type)`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

Resolves the given {@code type} against the type context represented by this type. For example:

 <pre>{@code
 new TypeToken<List<String>>() {}.resolveType(
     List.class.getMethod("get", int.class).getGenericReturnType())
 => String.class
 }</pre>

### `resolveSupertype(`java.lang.reflect.Type` type)`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

### `getGenericSuperclass()`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

Returns the generic superclass of this type or {@code null} if the type represents {@link Object} or an interface. This method is similar but different from {@link Class#getGenericSuperclass}. For example, {@code new TypeToken<StringArrayList>()
 {}.getGenericSuperclass()} will return {@code new TypeToken<ArrayList<String>>() {}}; while
 {@code StringArrayList.class.getGenericSuperclass()} will return {@code ArrayList<E>}, where
 {@code E} is the type variable declared by class {@code ArrayList}.

 <p>If this type is a type variable or wildcard, its first upper bound is examined and returned
 if the bound is a class or extends from a class. This means that the returned type could be a
 type variable too.

### `boundAsSuperclass(`java.lang.reflect.Type` bound)`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

### `getGenericInterfaces()`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>>`](../collect/ImmutableList>.md)

Returns the generic interfaces that this type directly {@code implements}. This method is
 similar but different from {@link Class#getGenericInterfaces()}. For example, {@code new
 TypeToken<List<String>>() {}.getGenericInterfaces()} will return a list that contains {@code
 new TypeToken<Iterable<String>>() {}}; while {@code List.class.getGenericInterfaces()} will
 return an array that contains {@code Iterable<T>}, where the {@code T} is the type variable
 declared by interface {@code Iterable}.

 <p>If this type is a type variable or wildcard, its upper bounds are examined and those that
 are either an interface or upper-bounded only by interfaces are returned. This means that the
 returned types could include type variables too.

### `boundsAsInterfaces(`java.lang.reflect.Type[]` bounds)`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>>`](../collect/ImmutableList>.md)

### `getTypes()`

**Returns:** [`com.google.common.reflect.TypeToken<T>.TypeSet`](TypeToken/TypeSet.md)

Returns the set of interfaces and classes that this type is or is a subtype of. The returned
 types are parameterized with proper type arguments.

 <p>Subtypes are always listed before supertypes. But the reverse is not true. A type isn't
 necessarily a subtype of all the types following. Order between types without subtype
 relationship is arbitrary and not guaranteed.

 <p>If this type is a type variable or wildcard, upper bounds that are themselves type variables
 aren't included (their super interfaces and superclasses are).

### `getSupertype(`java.lang.Class<? super T>` superclass)`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

Returns the generic form of {@code superclass}. For example, if this is {@code
 ArrayList<String>}, {@code Iterable<String>} is returned given the input {@code
 Iterable.class}.

### `getSubtype(`java.lang.Class<?>` subclass)`

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

Returns subtype of {@code this} with {@code subclass} as the raw class. For example, if this is
 {@code Iterable<String>} and {@code subclass} is {@code List}, {@code List<String>} is
 returned.

### `isSupertypeOf([`com.google.common.reflect.TypeToken<?>`](./TypeToken.md) type)`

**Returns:** `boolean`

Returns true if this type is a supertype of the given {@code type}. "Supertype" is defined
 according to <a href="http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1">the rules for type
 arguments</a> introduced with Java generics.
@since 19.0

### `isSupertypeOf(`java.lang.reflect.Type` type)`

**Returns:** `boolean`

Returns true if this type is a supertype of the given {@code type}. "Supertype" is defined
 according to <a href="http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1">the rules for type
 arguments</a> introduced with Java generics.
@since 19.0

### `isSubtypeOf([`com.google.common.reflect.TypeToken<?>`](./TypeToken.md) type)`

**Returns:** `boolean`

Returns true if this type is a subtype of the given {@code type}. "Subtype" is defined
 according to <a href="http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1">the rules for type
 arguments</a> introduced with Java generics.
@since 19.0

### `isSubtypeOf(`java.lang.reflect.Type` supertype)`

**Returns:** `boolean`

Returns true if this type is a subtype of the given {@code type}. "Subtype" is defined
 according to <a href="http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5.1">the rules for type
 arguments</a> introduced with Java generics.
@since 19.0

### `isArray()`

**Returns:** `boolean`

Returns true if this type is known to be an array type, such as {@code int[]}, {@code T[]},
 {@code <? extends Map<String, Integer>[]>} etc.

### `isPrimitive()`

**Returns:** `boolean`

Returns true if this type is one of the nine primitive types (including {@code void}).
@since 15.0

### `wrap()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Returns the corresponding wrapper type if this is a primitive type; otherwise returns {@code
 this} itself. Idempotent.
@since 15.0

### `isWrapper()`

**Returns:** `boolean`

### `unwrap()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Returns the corresponding primitive type if this is a wrapper type; otherwise returns {@code
 this} itself. Idempotent.
@since 15.0

### `getComponentType()`

**Returns:** [`com.google.common.reflect.TypeToken<?>`](./TypeToken.md)

Returns the array component type if this type represents an array ({@code int[]}, {@code T[]},
 {@code <? extends Map<String, Integer>[]>} etc.), or else {@code null} is returned.

### `method(`java.lang.reflect.Method` method)`

**Returns:** [`com.google.common.reflect.Invokable<T,java.lang.Object>`](./Invokable.md)

Returns the {@link Invokable} for {@code method}, which must be a member of {@code T}.
@since 14.0

### `constructor(`java.lang.reflect.Constructor<?>` constructor)`

**Returns:** [`com.google.common.reflect.Invokable<T,T>`](./Invokable.md)

Returns the {@link Invokable} for {@code constructor}, which must be a member of {@code T}.
@since 14.0

### `equals(`java.lang.Object` o)`

**Returns:** `boolean`

Returns true if {@code o} is another {@code TypeToken} that represents the same {@link Type}.

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

Implemented to support serialization of subclasses.

### `rejectTypeVariables()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Ensures that this type token doesn't contain type variables, which can cause unchecked type
 errors for callers like {@link TypeToInstanceMap}.

### `someRawTypeIsSubclassOf(`java.lang.Class<?>` superclass)`

**Returns:** `boolean`

### `isSubtypeOfParameterizedType(`java.lang.reflect.ParameterizedType` supertype)`

**Returns:** `boolean`

### `isSubtypeOfArrayType(`java.lang.reflect.GenericArrayType` supertype)`

**Returns:** `boolean`

### `isSupertypeOfArray(`java.lang.reflect.GenericArrayType` subtype)`

**Returns:** `boolean`

### `is(`java.lang.reflect.Type` formalType, `java.lang.reflect.TypeVariable<?>` declaration)`

**Returns:** `boolean`

{@code A.is(B)} is defined as {@code Foo<A>.isSubtypeOf(Foo<B>)}.

 <p>Specifically, returns true if any of the following conditions is met:

 <ol>
   <li>'this' and {@code formalType} are equal.
   <li>'this' and {@code formalType} have equal canonical form.
   <li>{@code formalType} is {@code <? extends Foo>} and 'this' is a subtype of {@code Foo}.
   <li>{@code formalType} is {@code <? super Foo>} and 'this' is a supertype of {@code Foo}.
 </ol>

 Note that condition 2 isn't technically accurate under the context of a recursively bounded
 type variables. For example, {@code Enum<? extends Enum<E>>} canonicalizes to {@code Enum<?>}
 where {@code E} is the type variable declared on the {@code Enum} class declaration. It's
 technically <em>not</em> true that {@code Foo<Enum<? extends Enum<E>>>} is a subtype of {@code
 Foo<Enum<?>>} according to JLS. See testRecursiveWildcardSubtypeBug() for a real example.

 <p>It appears that properly handling recursive type bounds in the presence of implicit type
 bounds is not easy. For now we punt, hoping that this defect should rarely cause issues in real
 code.
@param formalType is {@code Foo<formalType>} a supertype of {@code Foo<T>}?
@param declaration The type variable in the context of a parameterized type. Used to infer type
     bound when {@code formalType} is a wildcard with implicit upper bound.

### `canonicalizeTypeArg(`java.lang.reflect.TypeVariable<?>` declaration, `java.lang.reflect.Type` typeArg)`

**Returns:** `java.lang.reflect.Type`

In reflection, {@code Foo<?>.getUpperBounds()[0]} is always {@code Object.class}, even when Foo
 is defined as {@code Foo<T extends String>}. Thus directly calling {@code <?>.is(String.class)}
 will return false. To mitigate, we canonicalize wildcards by enforcing the following
 invariants:

 <ol>
   <li>{@code canonicalize(t)} always produces the equal result for equivalent types. For
       example both {@code Enum<?>} and {@code Enum<? extends Enum<?>>} canonicalize to {@code
       Enum<? extends Enum<E>}.
   <li>{@code canonicalize(t)} produces a "literal" supertype of t. For example: {@code Enum<?
       extends Enum<?>>} canonicalizes to {@code Enum<?>}, which is a supertype (if we disregard
       the upper bound is implicitly an Enum too).
   <li>If {@code canonicalize(A) == canonicalize(B)}, then {@code Foo<A>.isSubtypeOf(Foo<B>)}
       and vice versa. i.e. {@code A.is(B)} and {@code B.is(A)}.
   <li>{@code canonicalize(canonicalize(A)) == canonicalize(A)}.
 </ol>

### `canonicalizeWildcardsInType(`java.lang.reflect.Type` type)`

**Returns:** `java.lang.reflect.Type`

### `canonicalizeWildcardType(`java.lang.reflect.TypeVariable<?>` declaration, `java.lang.reflect.WildcardType` type)`

**Returns:** `java.lang.reflect.WildcardType`

### `canonicalizeWildcardsInParameterizedType(`java.lang.reflect.ParameterizedType` type)`

**Returns:** `java.lang.reflect.ParameterizedType`

### `every(`java.lang.reflect.Type[]` bounds)`

**Returns:** [`com.google.common.reflect.TypeToken.Bounds`](TypeToken/Bounds.md)

### `any(`java.lang.reflect.Type[]` bounds)`

**Returns:** [`com.google.common.reflect.TypeToken.Bounds`](TypeToken/Bounds.md)

### `getRawTypes()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.lang.Class<? super T>>`](../collect/ImmutableSet>.md)

### `isOwnedBySubtypeOf(`java.lang.reflect.Type` supertype)`

**Returns:** `boolean`

### `getOwnerTypeIfPresent()`

**Returns:** `java.lang.reflect.Type`

Returns the owner type of a {@link ParameterizedType} or enclosing class of a {@link Class}, or
 null otherwise.

### `toGenericType(`java.lang.Class<T>` cls)`

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

Returns the type token representing the generic type declaration of {@code cls}. For example:
 {@code TypeToken.getGenericType(Iterable.class)} returns {@code Iterable<T>}.

 <p>If {@code cls} isn't parameterized and isn't a generic array, the type token of the class is
 returned.

### `getCovariantTypeResolver()`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

### `getInvariantTypeResolver()`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

### `getSupertypeFromUpperBounds(`java.lang.Class<? super T>` supertype, `java.lang.reflect.Type[]` upperBounds)`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

### `getSubtypeFromLowerBounds(`java.lang.Class<?>` subclass, `java.lang.reflect.Type[]` lowerBounds)`

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

### `getArraySupertype(`java.lang.Class<? super T>` supertype)`

**Returns:** [`com.google.common.reflect.TypeToken<? super T>`](./TypeToken.md)

### `getArraySubtype(`java.lang.Class<?>` subclass)`

**Returns:** [`com.google.common.reflect.TypeToken<? extends T>`](./TypeToken.md)

### `resolveTypeArgsForSubclass(`java.lang.Class<?>` subclass)`

**Returns:** `java.lang.reflect.Type`

### `newArrayClassOrGenericArrayType(`java.lang.reflect.Type` componentType)`

**Returns:** `java.lang.reflect.Type`

Creates an array class if {@code componentType} is a class, or else, a {@link GenericArrayType}. This is what Java7 does for generic array type parameters.

