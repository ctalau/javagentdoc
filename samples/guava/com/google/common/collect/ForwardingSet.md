# Class: `ForwardingSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSet`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** `java.util.Set<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override one or more
 methods to modify the behavior of the backing set as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingSet forward **indiscriminately** to the
 methods of the delegate. For example, overriding #add alone **will not** change the
 behavior of #addAll, which can lead to unexpected behavior. In this case, you should
 override addAll as well, either providing your own implementation, or delegating to the
 provided standardAddAll method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingSet.

 
The standard methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.Set<E>`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardRemoveAll(Collection<?> collection)`

If you override iterator or remove, you may wish to override #removeAll
 to forward to this implementation.

**Parameters:**
- `collection` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `standardEquals(Object object)`

If
 you override either of those methods, you may wish to override #equals to forward to
 this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `standardHashCode()`

If you override
 #iterator, you may wish to override #equals to forward to this implementation.

**Returns:** `int`

