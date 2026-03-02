# Class: `ForwardingMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMultiset`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override
 one or more methods to modify the behavior of the backing multiset as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingMultiset forward **indiscriminately** to
 the methods of the delegate. For example, overriding #add(Object, int) alone **will
 not** change the behavior of #add(Object), which can lead to unexpected behavior. In
 this case, you should override add(Object) as well, either providing your own
 implementation, or delegating to the provided standardAdd method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingMultiset.

 
The standard methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `count(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

### `add(E element, int occurrences)`

**Returns:** `int`

**Parameters:**
- `element` (`E`)
- `occurrences` (`int`)

### `remove(java.lang.Object element, int occurrences)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)
- `occurrences` (`int`)

### `elementSet()`

**Returns:** `java.util.Set<E>`

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `setCount(E element, int count)`

**Returns:** `int`

**Parameters:**
- `element` (`E`)
- `count` (`int`)

### `setCount(E element, int oldCount, int newCount)`

**Returns:** `boolean`

**Parameters:**
- `element` (`E`)
- `oldCount` (`int`)
- `newCount` (`int`)

### `standardContains(java.lang.Object object)`

**Returns:** `boolean`

If you override #count, you may wish to override #contains to forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

### `standardClear()`

**Returns:** `void`

If you override #entrySet, you may wish to override #clear to
 forward to this implementation.

### `standardCount(java.lang.Object object)`

**Returns:** `int`

If
 you override #entrySet, you may wish to override #count to forward to this
 implementation.

**Parameters:**
- `object` (`java.lang.Object`)

### `standardAdd(E element)`

**Returns:** `boolean`

If you
 override #add(Object, int), you may wish to override #add(Object) to forward to
 this implementation.

**Parameters:**
- `element` (`E`)

### `standardAddAll(java.util.Collection<? extends E> elementsToAdd)`

**Returns:** `boolean`

If you override either of these methods, you may wish to override
 #addAll(Collection) to forward to this implementation.

**Parameters:**
- `elementsToAdd` (`java.util.Collection<? extends E>`)

### `standardRemove(java.lang.Object element)`

**Returns:** `boolean`

If
 you override #remove(Object, int), you may wish to override #remove(Object) to
 forward to this implementation.

**Parameters:**
- `element` (`java.lang.Object`)

### `standardRemoveAll(java.util.Collection<?> elementsToRemove)`

**Returns:** `boolean`

If you override #elementSet, you may wish to override #removeAll
 to forward to this implementation.

**Parameters:**
- `elementsToRemove` (`java.util.Collection<?>`)

### `standardRetainAll(java.util.Collection<?> elementsToRetain)`

**Returns:** `boolean`

If you override #elementSet, you may wish to override #retainAll
 to forward to this implementation.

**Parameters:**
- `elementsToRetain` (`java.util.Collection<?>`)

### `standardSetCount(E element, int count)`

**Returns:** `int`

#entrySet(). If you
 override any of these methods, you may wish to override #setCount(Object, int) to
 forward to this implementation.

**Parameters:**
- `element` (`E`)
- `count` (`int`)

### `standardSetCount(E element, int oldCount, int newCount)`

**Returns:** `boolean`

If you override either of these methods, you may wish to
 override #setCount(Object, int, int) to forward to this implementation.

**Parameters:**
- `element` (`E`)
- `oldCount` (`int`)
- `newCount` (`int`)

### `standardIterator()`

**Returns:** `java.util.Iterator<E>`

If you override either of these methods, you may wish to override #iterator to forward to this implementation.

### `standardSize()`

**Returns:** `int`

If
 you override #entrySet, you may wish to override #size to forward to this
 implementation.

### `standardEquals(java.lang.Object object)`

**Returns:** `boolean`

If you override either of these methods, you may wish to
 override #equals to forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

### `standardHashCode()`

**Returns:** `int`

If you override
 #entrySet, you may wish to override #hashCode to forward to this
 implementation.

### `standardToString()`

**Returns:** `java.lang.String`

If you override
 #entrySet, you may wish to override #toString to forward to this
 implementation.

