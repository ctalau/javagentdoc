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

### `visit(java.lang.reflect.@org.checkerframework.checker.nullness.qual.Nullable Type[] types)`

**Returns:** `void`

Null types are ignored. This allows subclasses to call 
 visit(parameterizedType.getOwnerType()) safely without having to check nulls.

**Parameters:**
- `types` (`java.lang.reflect.@org.checkerframework.checker.nullness.qual.Nullable Type[]`)

### `visitClass(java.lang.Class<?> t)`

**Returns:** `void`

**Parameters:**
- `t` (`java.lang.Class<?>`)

### `visitGenericArrayType(java.lang.reflect.GenericArrayType t)`

**Returns:** `void`

**Parameters:**
- `t` (`java.lang.reflect.GenericArrayType`)

### `visitParameterizedType(java.lang.reflect.ParameterizedType t)`

**Returns:** `void`

**Parameters:**
- `t` (`java.lang.reflect.ParameterizedType`)

### `visitTypeVariable(java.lang.reflect.TypeVariable<?> t)`

**Returns:** `void`

**Parameters:**
- `t` (`java.lang.reflect.TypeVariable<?>`)

### `visitWildcardType(java.lang.reflect.WildcardType t)`

**Returns:** `void`

**Parameters:**
- `t` (`java.lang.reflect.WildcardType`)

