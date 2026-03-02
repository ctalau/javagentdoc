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

### `from(Method method)`

**Parameters:**
- `method` (`java.lang.reflect.Method`)

**Returns:** [`com.google.common.reflect.Invokable<?,java.lang.Object>`](./Invokable.md)

### `from(Constructor<T> constructor)`

**Parameters:**
- `constructor` (`java.lang.reflect.Constructor<T>`)

**Returns:** [`com.google.common.reflect.Invokable<T,T>`](./Invokable.md)

### `isAnnotationPresent(Class<? extends Annotation> annotationClass)`

**Parameters:**
- `annotationClass` (`java.lang.Class<? extends java.lang.annotation.Annotation>`)

**Returns:** `boolean`

### `getAnnotation(Class<A> annotationClass)`

**Parameters:**
- `annotationClass` (`java.lang.Class<A>`)

**Returns:** `A`

### `getAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getDeclaredAnnotations()`

**Returns:** `java.lang.annotation.Annotation[]`

### `getTypeParameters()`

**Returns:** `java.lang.reflect.TypeVariable<?>[]`

### `setAccessible(boolean flag)`

**Parameters:**
- `flag` (`boolean`)

**Returns:** `void`

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

Note that a method may still be effectively "final", or non-overridable when it has no
 final keyword. For example, it could be private, or it could be declared by a final
 class. To tell whether a method is overridable, use Invokable#isOverridable.

**Returns:** `boolean`

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

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `isOverridable()`

Constructors, private, static or final
 methods, or methods declared by final classes are not overridable.

**Returns:** `boolean`

### `isVarArgs()`

**Returns:** `boolean`

### `invoke(T receiver, lang@Nullable Object[] args)`

**Parameters:**
- `receiver` (`T`)
- `args` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `R`

### `getReturnType()`

**Returns:** [`com.google.common.reflect.TypeToken<? extends R>`](./TypeToken.md)

### `getParameters()`

Note that if this is a constructor
 of a non-static inner class, unlike Constructor#getParameterTypes, the hidden 
 this parameter of the enclosing class is excluded from the returned parameters.

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.Parameter>`](../collect/ImmutableList.md)

### `getExceptionTypes()`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? extends java.lang.Throwable>>`](../collect/ImmutableList.md)

### `returning(Class<R1> returnType)`

For example:

 

```

 Method factoryMethod = Person.class.getMethod("create");
 Invokable<?, Person> factory = Invokable.of(getNameMethod).returning(Person.class);
 
```

**Parameters:**
- `returnType` (`java.lang.Class<R1>`)

**Returns:** [`com.google.common.reflect.Invokable<T,R1>`](./Invokable.md)

### `returning(TypeToken<R1> returnType)`

**Parameters:**
- `returnType` ([`com.google.common.reflect.TypeToken<R1>`](./TypeToken.md))

**Returns:** [`com.google.common.reflect.Invokable<T,R1>`](./Invokable.md)

### `getDeclaringClass()`

**Returns:** `java.lang.Class<? super T>`

### `getOwnerType()`

**Returns:** [`com.google.common.reflect.TypeToken<T>`](./TypeToken.md)

### `invokeInternal(Object receiver, lang@Nullable Object[] args)`

**Parameters:**
- `receiver` (`java.lang.Object`)
- `args` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `java.lang.Object`

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

