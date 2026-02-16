# Class: `Invokable`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Invokable`

**Implements:** `java.lang.reflect.AnnotatedElement`, `java.lang.reflect.Member`

## Type Parameters

- `T` extends `java.lang.Object`
- `R` extends `java.lang.Object`

## Description

Wrapper around either a {@link Method} or a {@link Constructor}. Convenience API is provided to
 make common reflective operation easier to deal with, such as {@link #isPublic}, {@link #getParameters} etc.

 <p>In addition to convenience methods, {@link TypeToken#method} and {@link TypeToken#constructor}
 will resolve the type parameters of the method or constructor in the context of the owner type,
 which may be a subtype of the declaring class. For example:

 <pre>{@code
 Method getMethod = List.class.getMethod("get", int.class);
 Invokable<List<String>, ?> invokable = new TypeToken<List<String>>() {}.method(getMethod);
 assertEquals(TypeToken.of(String.class), invokable.getReturnType()); // Not Object.class!
 assertEquals(new TypeToken<List<String>>() {}, invokable.getOwnerType());
 }</pre>

 <p><b>Note:</b> earlier versions of this class inherited from {@link java.lang.reflect.AccessibleObject AccessibleObject} and {@link java.lang.reflect.GenericDeclaration GenericDeclaration}. Since version 31.0 that is no longer
 the case. However, most methods from those types are present with the same signature in this
 class.
@param <T> the type that owns this method or constructor.
@param <R> the return type of (or supertype thereof) the method or the declaring type of the
     constructor.
@author Ben Yu
@since 14.0 (no longer implements {@link AccessibleObject} or {@code GenericDeclaration} since
     31.0)

## Fields

### `accessibleObject`

**Type:** `java.lang.reflect.AccessibleObject`

### `member`

**Type:** `java.lang.reflect.Member`

### `ANNOTATED_TYPE_EXISTS`

**Type:** `boolean`

## Constructors

### `<init>([`M`](M.md) member)`

## Methods

### `from(`java.lang.reflect.Method` method)`

**Returns:** [`com.google.common.reflect.Invokable<?,java.lang.Object>`](./Invokable.md)

Returns {@link Invokable} of {@code method}.

### `from(`java.lang.reflect.Constructor<T>` constructor)`

**Returns:** [`com.google.common.reflect.Invokable<T,T>`](./Invokable.md)

Returns {@link Invokable} of {@code constructor}.

### `isAnnotationPresent(`java.lang.Class<? extends java.lang.annotation.Annotation>` annotationClass)`

**Returns:** `boolean`

### `getAnnotation(`java.lang.Class<A>` annotationClass)`

**Returns:** [`A`](A.md)

### `getAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getDeclaredAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getTypeParameters()`

**Returns:** `java.lang.reflect.TypeVariable<?>[]`

See {@link java.lang.reflect.GenericDeclaration#getTypeParameters()}.

### `setAccessible(`boolean` flag)`

**Returns:** `void`

See {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)}.

### `trySetAccessible()`

**Returns:** `boolean`

See {@link java.lang.reflect.AccessibleObject#trySetAccessible()}.

### `isAccessible()`

**Returns:** `boolean`

See {@link java.lang.reflect.AccessibleObject#isAccessible()}.

### `getName()`

**Returns:** `java.lang.String`

### `getModifiers()`

**Returns:** `int`

### `isSynthetic()`

**Returns:** `boolean`

### `isPublic()`

**Returns:** `boolean`

Returns true if the element is public.

### `isProtected()`

**Returns:** `boolean`

Returns true if the element is protected.

### `isPackagePrivate()`

**Returns:** `boolean`

Returns true if the element is package-private.

### `isPrivate()`

**Returns:** `boolean`

Returns true if the element is private.

### `isStatic()`

**Returns:** `boolean`

Returns true if the element is static.

### `isFinal()`

**Returns:** `boolean`

Returns {@code true} if this method is final, per {@code Modifier.isFinal(getModifiers())}.

 <p>Note that a method may still be effectively "final", or non-overridable when it has no
 {@code final} keyword. For example, it could be private, or it could be declared by a final
 class. To tell whether a method is overridable, use {@link Invokable#isOverridable}.

### `isAbstract()`

**Returns:** `boolean`

Returns true if the method is abstract.

### `isNative()`

**Returns:** `boolean`

Returns true if the element is native.

### `isSynchronized()`

**Returns:** `boolean`

Returns true if the method is synchronized.

### `isVolatile()`

**Returns:** `boolean`

Returns true if the field is volatile.

### `isTransient()`

**Returns:** `boolean`

Returns true if the field is transient.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `isOverridable()`

**Returns:** `boolean`

Returns {@code true} if this is an overridable method. Constructors, private, static or final
 methods, or methods declared by final classes are not overridable.

### `isVarArgs()`

**Returns:** `boolean`

Returns {@code true} if this was declared to take a variable number of arguments.

### `invoke([`T`](T.md) receiver, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` args)`

**Returns:** [`R`](R.md)

Invokes with {@code receiver} as 'this' and {@code args} passed to the underlying method and
 returns the return value; or calls the underlying constructor with {@code args} and returns the
 constructed instance.
@throws IllegalAccessException if this {@code Constructor} object enforces Java language access
     control and the underlying method or constructor is inaccessible.
@throws IllegalArgumentException if the number of actual and formal parameters differ; if an
     unwrapping conversion for primitive arguments fails; or if, after possible unwrapping, a
     parameter value cannot be converted to the corresponding formal parameter type by a method
     invocation conversion.
@throws InvocationTargetException if the underlying method or constructor throws an exception.

### `getReturnType()`

**Returns:** [`com.google.common.reflect.TypeToken<? extends R>`](./TypeToken.md)

Returns the return type of this {@code Invokable}.

### `getParameters()`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.Parameter>`](../collect/ImmutableList.md)

Returns all declared parameters of this {@code Invokable}. Note that if this is a constructor
 of a non-static inner class, unlike {@link Constructor#getParameterTypes}, the hidden {@code
 this} parameter of the enclosing class is excluded from the returned parameters.

### `getExceptionTypes()`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? extends java.lang.Throwable>>`](../collect/ImmutableList>.md)

Returns all declared exception types of this {@code Invokable}.

### `returning(`java.lang.Class<R1>` returnType)`

**Returns:** [`com.google.common.reflect.Invokable<T,R1>`](./Invokable.md)

Explicitly specifies the return type of this {@code Invokable}. For example:

 <pre>{@code
 Method factoryMethod = Person.class.getMethod("create");
 Invokable<?, Person> factory = Invokable.of(getNameMethod).returning(Person.class);
 }</pre>

### `returning([`com.google.common.reflect.TypeToken<R1>`](./TypeToken.md) returnType)`

**Returns:** [`com.google.common.reflect.Invokable<T,R1>`](./Invokable.md)

Explicitly specifies the return type of this {@code Invokable}.

### `getDeclaringClass()`

**Returns:** `java.lang.Class<? super T>`

### `getOwnerType()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

Returns the type of {@code T}.

### `invokeInternal(`java.lang.Object` receiver, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` args)`

**Returns:** `java.lang.Object`

### `getGenericParameterTypes()`

**Returns:** `java.lang.reflect.Type[]`

### `getAnnotatedParameterTypes()`

**Returns:** `java.lang.reflect.AnnotatedType[]`

### `getGenericExceptionTypes()`

**Returns:** `java.lang.reflect.Type[]`

This should never return a type that's not a subtype of Throwable.

### `getParameterAnnotations()`

**Returns:** `java.lang.annotation.Annotation[][]`

### `getGenericReturnType()`

**Returns:** `java.lang.reflect.Type`

### `getAnnotatedReturnType()`

**Returns:** `java.lang.reflect.AnnotatedType`

Returns the {@link AnnotatedType} for the return type.
@since 14.0

### `initAnnotatedTypeExists()`

**Returns:** `boolean`

