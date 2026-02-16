# Class: `AbstractInvocationHandler`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.AbstractInvocationHandler`

**Implements:** `java.lang.reflect.InvocationHandler`

## Description

Abstract implementation of `InvocationHandler` that handles `Object.equals`, `Object.hashCode` and `Object.toString`. For example:

 <pre>
 class Unsupported extends AbstractInvocationHandler {
   protected Object handleInvocation(Object proxy, Method method, Object[] args) {
     throw new UnsupportedOperationException();
   }
 }

 CharSequence unsupported = Reflection.newProxy(CharSequence.class, new Unsupported());
 </pre>
**Author:** Ben Yu
**Since:** 12.0

## Fields

### `NO_ARGS`

**Type:** `java.lang.Object[]`

## Constructors

### `<init>()`

## Methods

### `invoke(`java.lang.Object` proxy, `java.lang.reflect.Method` method, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` args)`

**Returns:** `java.lang.Object`

{@inheritDoc}

 <ul>
   <li>`proxy.hashCode()` delegates to `AbstractInvocationHandler.hashCode`
   <li>`proxy.toString()` delegates to `AbstractInvocationHandler.toString`
   <li>`proxy.equals(argument)` returns true if:
       <ul>
         <li>`proxy` and `argument` are of the same type
         <li>and `AbstractInvocationHandler.equals` returns true for the `InvocationHandler` of `argument`
       </ul>
   <li>other method calls are dispatched to `handleInvocation`.
 </ul>

### `handleInvocation(`java.lang.Object` proxy, `java.lang.reflect.Method` method, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` args)`

**Returns:** `java.lang.Object`

`invoke` delegates to this method upon any method invocation on the proxy instance,
 except `Object.equals`, `Object.hashCode` and `Object.toString`. The result
 will be returned as the proxied method's return value.

 <p>Unlike `invoke`, `args` will never be null. When the method has no parameter,
 an empty array is passed in.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

By default delegates to `Object.equals` so instances are only equal if they are
 identical. `proxy.equals(argument)` returns true if:

 <ul>
   <li>`proxy` and `argument` are of the same type
   <li>and this method returns true for the `InvocationHandler` of `argument`
 </ul>

 <p>Subclasses can override this method to provide custom equality.

### `hashCode()`

**Returns:** `int`

By default delegates to `Object.hashCode`. The dynamic proxies' `hashCode()` will
 delegate to this method. Subclasses can override this method to provide custom equality.

### `toString()`

**Returns:** `java.lang.String`

By default delegates to `Object.toString`. The dynamic proxies' `toString()` will
 delegate to this method. Subclasses can override this method to provide custom string
 representation for the proxies.

### `isProxyOfSameInterfaces(`java.lang.Object` arg, `java.lang.Class<?>` proxyClass)`

**Returns:** `boolean`

