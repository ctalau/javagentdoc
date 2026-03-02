# Class: `TypeVisitor`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeVisitor`

## Description

By
 default, no recursion is done for type arguments or type bounds. But subclasses can opt to do
 recursion by calling #visit for any Type while visitation is in progress. For
 example, this can be used to reject wildcards or type variables contained in a type as in:

 

```

 new TypeVisitor() {
   protected void visitParameterizedType(ParameterizedType t) {
     visit(t.getOwnerType());
     visit(t.getActualTypeArguments());
   }
   protected void visitGenericArrayType(GenericArrayType t) {
     visit(t.getGenericComponentType());
   }
   protected void visitTypeVariable(TypeVariable<?> t) {
     throw new IllegalArgumentException("Cannot contain type variable.");
   }
   protected void visitWildcardType(WildcardType t) {
     throw new IllegalArgumentException("Cannot contain wildcard type.");
   }
 }.visit(type);
 
```


 
One Type is visited at most once. The second time the same type is visited, it's
 ignored by #visit. This avoids infinite recursion caused by recursive type bounds.

 
This class is *not* thread safe.

## Fields

### `visited`

**Type:** `java.util.Set<java.lang.reflect.Type>`

## Constructors

### `<init>()`

## Methods

### `visit(reflect@Nullable Type[] types)`

Null types are ignored. This allows subclasses to call 
 visit(parameterizedType.getOwnerType()) safely without having to check nulls.

**Parameters:**
- `types` (`java.lang.reflect.@org.checkerframework.checker.nullness.qual.Nullable Type[]`)

**Returns:** `void`

### `visitClass(Class<?> t)`

**Parameters:**
- `t` (`java.lang.Class<?>`)

**Returns:** `void`

### `visitGenericArrayType(GenericArrayType t)`

**Parameters:**
- `t` (`java.lang.reflect.GenericArrayType`)

**Returns:** `void`

### `visitParameterizedType(ParameterizedType t)`

**Parameters:**
- `t` (`java.lang.reflect.ParameterizedType`)

**Returns:** `void`

### `visitTypeVariable(TypeVariable<?> t)`

**Parameters:**
- `t` (`java.lang.reflect.TypeVariable<?>`)

**Returns:** `void`

### `visitWildcardType(WildcardType t)`

**Parameters:**
- `t` (`java.lang.reflect.WildcardType`)

**Returns:** `void`

