# Class: `AbstractInvocationHandler`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.AbstractInvocationHandler`

**Implements:** `java.lang.reflect.InvocationHandler`

## Description

Abstract implementation of {@link InvocationHandler} that handles {@link Object#equals}, {@link Object#hashCode} and {@link Object#toString}. For example:

 <pre>
 class Unsupported extends AbstractInvocationHandler {
   protected Object handleInvocation(Object proxy, Method method, Object[] args) {
     throw new UnsupportedOperationException();
   }
 }

 CharSequence unsupported = Reflection.newProxy(CharSequence.class, new Unsupported());
 </pre>
@author Ben Yu
@since 12.0

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
   <li>{@code proxy.hashCode()} delegates to {@link AbstractInvocationHandler#hashCode}
   <li>{@code proxy.toString()} delegates to {@link AbstractInvocationHandler#toString}
   <li>{@code proxy.equals(argument)} returns true if:
       <ul>
         <li>{@code proxy} and {@code argument} are of the same type
         <li>and {@link AbstractInvocationHandler#equals} returns true for the {@link InvocationHandler} of {@code argument}
       </ul>
   <li>other method calls are dispatched to {@link #handleInvocation}.
 </ul>

### `handleInvocation(`java.lang.Object` proxy, `java.lang.reflect.Method` method, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` args)`

**Returns:** `java.lang.Object`

{@link #invoke} delegates to this method upon any method invocation on the proxy instance,
 except {@link Object#equals}, {@link Object#hashCode} and {@link Object#toString}. The result
 will be returned as the proxied method's return value.

 <p>Unlike {@link #invoke}, {@code args} will never be null. When the method has no parameter,
 an empty array is passed in.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

By default delegates to {@link Object#equals} so instances are only equal if they are
 identical. {@code proxy.equals(argument)} returns true if:

 <ul>
   <li>{@code proxy} and {@code argument} are of the same type
   <li>and this method returns true for the {@link InvocationHandler} of {@code argument}
 </ul>

 <p>Subclasses can override this method to provide custom equality.

### `hashCode()`

**Returns:** `int`

By default delegates to {@link Object#hashCode}. The dynamic proxies' {@code hashCode()} will
 delegate to this method. Subclasses can override this method to provide custom equality.

### `toString()`

**Returns:** `java.lang.String`

By default delegates to {@link Object#toString}. The dynamic proxies' {@code toString()} will
 delegate to this method. Subclasses can override this method to provide custom string
 representation for the proxies.

### `isProxyOfSameInterfaces(`java.lang.Object` arg, `java.lang.Class<?>` proxyClass)`

**Returns:** `boolean`

