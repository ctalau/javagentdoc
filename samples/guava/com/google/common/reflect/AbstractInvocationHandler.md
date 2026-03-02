# Class: `AbstractInvocationHandler`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.AbstractInvocationHandler`

**Implements:** `java.lang.reflect.InvocationHandler`

## Description

For example:

 

```

 class Unsupported extends AbstractInvocationHandler {
   protected Object handleInvocation(Object proxy, Method method, Object[] args) {
     throw new UnsupportedOperationException();
   }
 }

 CharSequence unsupported = Reflection.newProxy(CharSequence.class, new Unsupported());
 
```

## Fields

### `NO_ARGS`

**Type:** `java.lang.Object[]`

## Constructors

### `<init>()`

## Methods

### `invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] args)`

**Returns:** `java.lang.Object`

**Parameters:**
- `proxy` (`java.lang.Object`)
- `method` (`java.lang.reflect.Method`)
- `args` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `handleInvocation(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] args)`

**Returns:** `java.lang.Object`

The result
 will be returned as the proxied method's return value.

 
Unlike #invoke, args will never be null. When the method has no parameter,
 an empty array is passed in.

**Parameters:**
- `proxy` (`java.lang.Object`)
- `method` (`java.lang.reflect.Method`)
- `args` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

proxy.equals(argument) returns true if:

 

   - proxy and argument are of the same type
   - and this method returns true for the InvocationHandler of argument
 


 
Subclasses can override this method to provide custom equality.

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

The dynamic proxies' hashCode() will
 delegate to this method. Subclasses can override this method to provide custom equality.

### `toString()`

**Returns:** `java.lang.String`

The dynamic proxies' toString() will
 delegate to this method. Subclasses can override this method to provide custom string
 representation for the proxies.

### `isProxyOfSameInterfaces(java.lang.Object arg, java.lang.Class<?> proxyClass)`

**Returns:** `boolean`

**Parameters:**
- `arg` (`java.lang.Object`)
- `proxyClass` (`java.lang.Class<?>`)

