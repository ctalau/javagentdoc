# Class: `Invokable`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Invokable`

**Implements:** `java.lang.reflect.AnnotatedElement`, `java.lang.reflect.Member`

## Type Parameters

- `T` extends `java.lang.Object`
- `R` extends `java.lang.Object`

## Description

Convenience API is provided to
 make common reflective operation easier to deal with, such as #isPublic, #getParameters etc.

 
In addition to convenience methods, TypeToken#method and TypeToken#constructor
 will resolve the type parameters of the method or constructor in the context of the owner type,
 which may be a subtype of the declaring class. For example:

 

```

 Method getMethod = List.class.getMethod("get", int.class);
 Invokable<List<String>, ?> invokable = new TypeToken<List<String>>() {}.method(getMethod);
 assertEquals(TypeToken.of(String.class), invokable.getReturnType()); // Not Object.class!
 assertEquals(new TypeToken<List<String>>() {}, invokable.getOwnerType());
 
```


 
**Note:** earlier versions of this class inherited from AccessibleObject and GenericDeclaration. Since version 31.0 that is no longer
 the case. However, most methods from those types are present with the same signature in this
 class.

## Fields

### `accessibleObject`

**Type:** `java.lang.reflect.AccessibleObject`

### `member`

**Type:** `java.lang.reflect.Member`

### `ANNOTATED_TYPE_EXISTS`

**Type:** `boolean`

## Constructors

### `<init>(M member)`

**Parameters:**
- `member` (`M`)

## Methods

### `from(java.lang.reflect.Method method)`

**Returns:** [`com.google.common.reflect.Invokable<?,java.lang.Object>`](./Invokable.md)

**Parameters:**
- `method` (`java.lang.reflect.Method`)

### `from(java.lang.reflect.Constructor<T> constructor)`

**Returns:** [`com.google.common.reflect.Invokable<T,T>`](./Invokable.md)

**Parameters:**
- `constructor` (`java.lang.reflect.Constructor<T>`)

### `isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> annotationClass)`

**Returns:** `boolean`

**Parameters:**
- `annotationClass` (`java.lang.Class<? extends java.lang.annotation.Annotation>`)

### `getAnnotation(java.lang.Class<A> annotationClass)`

**Returns:** `A`

**Parameters:**
- `annotationClass` (`java.lang.Class<A>`)

### `getAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getDeclaredAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getTypeParameters()`

**Returns:** `java.lang.reflect.TypeVariable<?>[]`

### `setAccessible(boolean flag)`

**Returns:** `void`

**Parameters:**
- `flag` (`boolean`)

### `trySetAccessible()`

**Returns:** `boolean`

### `isAccessible()`

**Returns:** `boolean`

### `getName()`

**Returns:** `java.lang.String`

### `getModifiers()`

**Returns:** `int`

### `isSynthetic()`

**Returns:** `boolean`

### `isPublic()`

**Returns:** `boolean`

### `isProtected()`

**Returns:** `boolean`

### `isPackagePrivate()`

**Returns:** `boolean`

### `isPrivate()`

**Returns:** `boolean`

### `isStatic()`

**Returns:** `boolean`

### `isFinal()`

**Returns:** `boolean`

Note that a method may still be effectively "final", or non-overridable when it has no
 final keyword. For example, it could be private, or it could be declared by a final
 class. To tell whether a method is overridable, use Invokable#isOverridable.

### `isAbstract()`

**Returns:** `boolean`

### `isNative()`

**Returns:** `boolean`

### `isSynchronized()`

**Returns:** `boolean`

### `isVolatile()`

**Returns:** `boolean`

### `isTransient()`

**Returns:** `boolean`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `isOverridable()`

**Returns:** `boolean`

Constructors, private, static or final
 methods, or methods declared by final classes are not overridable.

### `isVarArgs()`

**Returns:** `boolean`

### `invoke(T receiver, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] args)`

**Returns:** `R`

**Parameters:**
- `receiver` (`T`)
- `args` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `getReturnType()`

**Returns:** [`com.google.common.reflect.TypeToken<? extends R>`](./TypeToken.md)

### `getParameters()`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.Parameter>`](../collect/ImmutableList.md)

Note that if this is a constructor
 of a non-static inner class, unlike Constructor#getParameterTypes, the hidden 
 this parameter of the enclosing class is excluded from the returned parameters.

### `getExceptionTypes()`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? extends java.lang.Throwable>>`](../collect/ImmutableList.md)

### `returning(java.lang.Class<R1> returnType)`

**Returns:** [`com.google.common.reflect.Invokable<T,R1>`](./Invokable.md)

For example:

 

```

 Method factoryMethod = Person.class.getMethod("create");
 Invokable<?, Person> factory = Invokable.of(getNameMethod).returning(Person.class);
 
```

**Parameters:**
- `returnType` (`java.lang.Class<R1>`)

### `returning(com.google.common.reflect.TypeToken<R1> returnType)`

**Returns:** [`com.google.common.reflect.Invokable<T,R1>`](./Invokable.md)

**Parameters:**
- `returnType` ([`com.google.common.reflect.TypeToken<R1>`](./TypeToken.md))

### `getDeclaringClass()`

**Returns:** `java.lang.Class<? super T>`

### `getOwnerType()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `invokeInternal(java.lang.Object receiver, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] args)`

**Returns:** `java.lang.Object`

**Parameters:**
- `receiver` (`java.lang.Object`)
- `args` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `getGenericParameterTypes()`

**Returns:** `java.lang.reflect.Type[]`

### `getAnnotatedParameterTypes()`

**Returns:** `java.lang.reflect.AnnotatedType[]`

### `getGenericExceptionTypes()`

**Returns:** `java.lang.reflect.Type[]`

### `getParameterAnnotations()`

**Returns:** `java.lang.annotation.Annotation[][]`

### `getGenericReturnType()`

**Returns:** `java.lang.reflect.Type`

### `getAnnotatedReturnType()`

**Returns:** `java.lang.reflect.AnnotatedType`

### `initAnnotatedTypeExists()`

**Returns:** `boolean`

