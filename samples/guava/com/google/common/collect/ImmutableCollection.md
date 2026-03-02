# Class: `ImmutableCollection`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableCollection`

**Extends:** `java.util.AbstractCollection<E>`

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

**Warning:** avoid *direct* usage of ImmutableCollection as a type (just as
 with Collection itself). Prefer subtypes such as ImmutableSet or ImmutableList, which have well-defined #equals semantics, thus avoiding a common source
 of bugs and confusion.

 About *all* Immutable- collections

 
The remainder of this documentation applies to every public Immutable- type in this
 package, whether it is a subtype of ImmutableCollection or not.

 Guarantees

 
Each makes the following guarantees:

 

   - **Shallow immutability.** Elements can never be added, removed or replaced in this
       collection. This is a stronger guarantee than that of Collections#unmodifiableCollection, whose contents change whenever the wrapped collection
       is modified.
   - **Null-hostility.** This collection will never contain a null element.
   - **Deterministic iteration.** The iteration order is always well-defined, depending on
       how the collection was created. Typically this is insertion order unless an explicit
       ordering is otherwise specified (e.g. ImmutableSortedSet#naturalOrder). See the
       appropriate factory method for details. View collections such as ImmutableMultiset#elementSet iterate in the same order as the parent, except as noted.
   - **Thread safety.** It is safe to access this collection concurrently from multiple
       threads.
   - **Integrity.** This type cannot be subclassed outside this package (which would allow
       these guarantees to be violated).
 


 "Interfaces", not implementations

 
These are classes instead of interfaces to prevent external subtyping, but should be thought
 of as interfaces in every important sense. Each public class such as ImmutableSet is a
 *type* offering meaningful behavioral guarantees. This is substantially different from the
 case of (say) HashSet, which is an *implementation*, with semantics that were
 largely defined by its supertype.

 
For field types and method return types, you should generally use the immutable type (such as
 ImmutableList) instead of the general collection interface type (such as List).
 This communicates to your callers all of the semantic guarantees listed above, which is almost
 always very useful information.

 
On the other hand, a *parameter* type of ImmutableList is generally a nuisance to
 callers. Instead, accept Iterable and have your method or constructor body pass it to the
 appropriate copyOf method itself.

 
Expressing the immutability guarantee directly in the type that user code references is a
 powerful advantage. Although Java offers certain immutable collection factory methods, such as
 Collections#singleton(Object) and [Set.of](https://docs.oracle.com/javase/9/docs/api/java/util/Set.html#immutable),
 we recommend using *these* classes instead for this reason (as well as for consistency).

 Creation

 
Except for logically "abstract" types like ImmutableCollection itself, each 
 Immutable type provides the static operations you need to obtain instances of that type. These
 usually include:

 

   - Static methods named of, accepting an explicit list of elements or entries.
   - Static methods named copyOf (or copyOfSorted), accepting an existing
       collection whose contents should be copied.
   - A static nested Builder class which can be used to populate a new immutable
       instance.
 


 Warnings

 

   - **Warning:** as with any collection, it is almost always a bad idea to modify an element
       (in a way that affects its Object#equals behavior) while it is contained in a
       collection. Undefined behavior and bugs will result. It's generally best to avoid using
       mutable objects as elements at all, as many users may expect your "immutable" object to be
       *deeply* immutable.
 


 Performance notes

 

   - Implementations can be generally assumed to prioritize memory efficiency, then speed of
       access, and lastly speed of creation.
   - The copyOf methods will sometimes recognize that the actual copy operation is
       unnecessary; for example, copyOf(copyOf(anArrayList)) should copy the data only
       once. This reduces the expense of habitually making defensive copies at API boundaries.
       However, the precise conditions for skipping the copy operation are undefined.
   - **Warning:** a view collection such as ImmutableMap#keySet or ImmutableList#subList may retain a reference to the entire data set, preventing it from
       being garbage collected. If some of the data is no longer reachable through other means,
       this constitutes a memory leak. Pass the view collection to the appropriate copyOf
       method to obtain a correctly-sized copy.
   - The performance of using the associated Builder class can be assumed to be no
       worse, and possibly better, than creating a mutable collection and copying it.
   - Implementations generally do not cache hash codes. If your element or key type has a slow
       hashCode implementation, it should cache it itself.
 


 Example usage

 

```

 class Foo {
   private static final ImmutableSet<String> RESERVED_CODES =
       ImmutableSet.of("AZ", "CQ", "ZX");

   private final ImmutableSet<String> codes;

   public Foo(Iterable<String> codes) {
     this.codes = ImmutableSet.copyOf(codes);
     checkArgument(Collections.disjoint(this.codes, RESERVED_CODES));
   }
 }
 
```


 See also

 
See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `SPLITERATOR_CHARACTERISTICS`

**Type:** `int`

### `EMPTY_ARRAY`

**Type:** `java.lang.Object[]`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `toArray()`

**Returns:** `java.lang.Object[]`

### `toArray(T[] other)`

**Parameters:**
- `other` (`T[]`)

**Returns:** `T[]`

### `internalArray()`

**Returns:** `java.lang.Object[]`

### `internalArrayStart()`

**Returns:** `int`

### `internalArrayEnd()`

**Returns:** `int`

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `add(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `boolean`

### `remove(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `addAll(Collection<? extends E> newElements)`

**Parameters:**
- `newElements` (`java.util.Collection<? extends E>`)

**Returns:** `boolean`

### `removeAll(Collection<?> oldElements)`

**Parameters:**
- `oldElements` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `removeIf(Predicate<? super E> filter)`

**Parameters:**
- `filter` (`java.util.function.Predicate<? super E>`)

**Returns:** `boolean`

### `retainAll(Collection<?> elementsToKeep)`

**Parameters:**
- `elementsToKeep` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `asList()`

**Performance note:** in most cases this method can return quickly without actually
 copying anything. The exact circumstances under which the copy is performed are undefined and
 subject to change.

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `isPartialView()`

This is generally
 used to determine whether copyOf implementations should make an explicit copy to avoid
 memory leaks.

**Returns:** `boolean`

### `copyIntoArray(lang@Nullable Object[] dst, int offset)`

Returns offset + size().

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

