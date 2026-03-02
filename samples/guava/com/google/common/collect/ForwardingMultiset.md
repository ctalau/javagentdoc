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

### `count(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

### `add(E element, int occurrences)`

**Parameters:**
- `element` (`E`)
- `occurrences` (`int`)

**Returns:** `int`

### `remove(Object element, int occurrences)`

**Parameters:**
- `element` (`java.lang.Object`)
- `occurrences` (`int`)

**Returns:** `int`

### `elementSet()`

**Returns:** `java.util.Set<E>`

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setCount(E element, int count)`

**Parameters:**
- `element` (`E`)
- `count` (`int`)

**Returns:** `int`

### `setCount(E element, int oldCount, int newCount)`

**Parameters:**
- `element` (`E`)
- `oldCount` (`int`)
- `newCount` (`int`)

**Returns:** `boolean`

### `standardContains(Object object)`

If you override #count, you may wish to override #contains to forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `standardClear()`

If you override #entrySet, you may wish to override #clear to
 forward to this implementation.

**Returns:** `void`

### `standardCount(Object object)`

If
 you override #entrySet, you may wish to override #count to forward to this
 implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `int`

### `standardAdd(E element)`

If you
 override #add(Object, int), you may wish to override #add(Object) to forward to
 this implementation.

**Parameters:**
- `element` (`E`)

**Returns:** `boolean`

### `standardAddAll(Collection<? extends E> elementsToAdd)`

If you override either of these methods, you may wish to override
 #addAll(Collection) to forward to this implementation.

**Parameters:**
- `elementsToAdd` (`java.util.Collection<? extends E>`)

**Returns:** `boolean`

### `standardRemove(Object element)`

If
 you override #remove(Object, int), you may wish to override #remove(Object) to
 forward to this implementation.

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `boolean`

### `standardRemoveAll(Collection<?> elementsToRemove)`

If you override #elementSet, you may wish to override #removeAll
 to forward to this implementation.

**Parameters:**
- `elementsToRemove` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `standardRetainAll(Collection<?> elementsToRetain)`

If you override #elementSet, you may wish to override #retainAll
 to forward to this implementation.

**Parameters:**
- `elementsToRetain` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `standardSetCount(E element, int count)`

#entrySet(). If you
 override any of these methods, you may wish to override #setCount(Object, int) to
 forward to this implementation.

**Parameters:**
- `element` (`E`)
- `count` (`int`)

**Returns:** `int`

### `standardSetCount(E element, int oldCount, int newCount)`

If you override either of these methods, you may wish to
 override #setCount(Object, int, int) to forward to this implementation.

**Parameters:**
- `element` (`E`)
- `oldCount` (`int`)
- `newCount` (`int`)

**Returns:** `boolean`

### `standardIterator()`

If you override either of these methods, you may wish to override #iterator to forward to this implementation.

**Returns:** `java.util.Iterator<E>`

### `standardSize()`

If
 you override #entrySet, you may wish to override #size to forward to this
 implementation.

**Returns:** `int`

### `standardEquals(Object object)`

If you override either of these methods, you may wish to
 override #equals to forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `standardHashCode()`

If you override
 #entrySet, you may wish to override #hashCode to forward to this
 implementation.

**Returns:** `int`

### `standardToString()`

If you override
 #entrySet, you may wish to override #toString to forward to this
 implementation.

**Returns:** `java.lang.String`

