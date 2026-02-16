# Class: `ImmutableCollection`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableCollection`

**Extends:** `java.util.AbstractCollection<E>`

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A `Collection` whose contents will never change, and which offers a few additional
 guarantees detailed below.

 <p><b>Warning:</b> avoid <i>direct</i> usage of `ImmutableCollection` as a type (just as
 with `Collection` itself). Prefer subtypes such as `ImmutableSet` or `ImmutableList`, which have well-defined `equals` semantics, thus avoiding a common source
 of bugs and confusion.

 <h3>About <i>all</i> `Immutable-` collections</h3>

 <p>The remainder of this documentation applies to every public `Immutable-` type in this
 package, whether it is a subtype of `ImmutableCollection` or not.

 <h4>Guarantees</h4>

 <p>Each makes the following guarantees:

 <ul>
   <li><b>Shallow immutability.</b> Elements can never be added, removed or replaced in this
       collection. This is a stronger guarantee than that of `Collections.unmodifiableCollection`, whose contents change whenever the wrapped collection
       is modified.
   <li><b>Null-hostility.</b> This collection will never contain a null element.
   <li><b>Deterministic iteration.</b> The iteration order is always well-defined, depending on
       how the collection was created. Typically this is insertion order unless an explicit
       ordering is otherwise specified (e.g. `ImmutableSortedSet.naturalOrder`). See the
       appropriate factory method for details. View collections such as `ImmutableMultiset.elementSet` iterate in the same order as the parent, except as noted.
   <li><b>Thread safety.</b> It is safe to access this collection concurrently from multiple
       threads.
   <li><b>Integrity.</b> This type cannot be subclassed outside this package (which would allow
       these guarantees to be violated).
 </ul>

 <h4>"Interfaces", not implementations</h4>

 <p>These are classes instead of interfaces to prevent external subtyping, but should be thought
 of as interfaces in every important sense. Each public class such as `ImmutableSet` is a
 <i>type</i> offering meaningful behavioral guarantees. This is substantially different from the
 case of (say) `HashSet`, which is an <i>implementation</i>, with semantics that were
 largely defined by its supertype.

 <p>For field types and method return types, you should generally use the immutable type (such as
 `ImmutableList`) instead of the general collection interface type (such as `List`).
 This communicates to your callers all of the semantic guarantees listed above, which is almost
 always very useful information.

 <p>On the other hand, a <i>parameter</i> type of `ImmutableList` is generally a nuisance to
 callers. Instead, accept `Iterable` and have your method or constructor body pass it to the
 appropriate `copyOf` method itself.

 <p>Expressing the immutability guarantee directly in the type that user code references is a
 powerful advantage. Although Java offers certain immutable collection factory methods, such as
 `Collections.singleton(Object)` and <a href="https://docs.oracle.com/javase/9/docs/api/java/util/Set.html#immutable">`Set.of`</a>,
 we recommend using <i>these</i> classes instead for this reason (as well as for consistency).

 <h4>Creation</h4>

 <p>Except for logically "abstract" types like `ImmutableCollection` itself, each `Immutable` type provides the static operations you need to obtain instances of that type. These
 usually include:

 <ul>
   <li>Static methods named `of`, accepting an explicit list of elements or entries.
   <li>Static methods named `copyOf` (or `copyOfSorted`), accepting an existing
       collection whose contents should be copied.
   <li>A static nested `Builder` class which can be used to populate a new immutable
       instance.
 </ul>

 <h4>Warnings</h4>

 <ul>
   <li><b>Warning:</b> as with any collection, it is almost always a bad idea to modify an element
       (in a way that affects its `Object.equals` behavior) while it is contained in a
       collection. Undefined behavior and bugs will result. It's generally best to avoid using
       mutable objects as elements at all, as many users may expect your "immutable" object to be
       <i>deeply</i> immutable.
 </ul>

 <h4>Performance notes</h4>

 <ul>
   <li>Implementations can be generally assumed to prioritize memory efficiency, then speed of
       access, and lastly speed of creation.
   <li>The `copyOf` methods will sometimes recognize that the actual copy operation is
       unnecessary; for example, `copyOf(copyOf(anArrayList))` should copy the data only
       once. This reduces the expense of habitually making defensive copies at API boundaries.
       However, the precise conditions for skipping the copy operation are undefined.
   <li><b>Warning:</b> a view collection such as `ImmutableMap.keySet` or `ImmutableList.subList` may retain a reference to the entire data set, preventing it from
       being garbage collected. If some of the data is no longer reachable through other means,
       this constitutes a memory leak. Pass the view collection to the appropriate `copyOf`
       method to obtain a correctly-sized copy.
   <li>The performance of using the associated `Builder` class can be assumed to be no
       worse, and possibly better, than creating a mutable collection and copying it.
   <li>Implementations generally do not cache hash codes. If your element or key type has a slow
       `hashCode` implementation, it should cache it itself.
 </ul>

 <h4>Example usage</h4>

 <pre>`class Foo {
   private static final ImmutableSet<String> RESERVED_CODES =
       ImmutableSet.of("AZ", "CQ", "ZX");

   private final ImmutableSet<String> codes;

   public Foo(Iterable<String> codes) {
     this.codes = ImmutableSet.copyOf(codes);
     checkArgument(Collections.disjoint(this.codes, RESERVED_CODES));
   `
 }
 }</pre>

 <h3>See also</h3>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**Since:** 2.0

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

Returns an unmodifiable iterator across the elements in this collection.

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `toArray()`

**Returns:** `java.lang.Object[]`

### `toArray(`T[]` other)`

**Returns:** `T[]`

### `internalArray()`

**Returns:** `java.lang.Object[]`

If this collection is backed by an array of its elements in insertion order, returns it.

### `internalArrayStart()`

**Returns:** `int`

If this collection is backed by an array of its elements in insertion order, returns the offset
 where this collection's elements start.

### `internalArrayEnd()`

**Returns:** `int`

If this collection is backed by an array of its elements in insertion order, returns the offset
 where this collection's elements end.

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `add(`E` e)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `remove(`java.lang.Object` object)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `addAll(`java.util.Collection<? extends E>` newElements)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `removeAll(`java.util.Collection<?>` oldElements)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `removeIf(`java.util.function.Predicate<? super E>` filter)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `retainAll(`java.util.Collection<?>` elementsToKeep)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `clear()`

**Returns:** `void`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an `ImmutableList` containing the same elements, in the same order, as this
 collection.

 <p><b>Performance note:</b> in most cases this method can return quickly without actually
 copying anything. The exact circumstances under which the copy is performed are undefined and
 subject to change.
**Since:** 2.0

### `isPartialView()`

**Returns:** `boolean`

Returns `true` if this immutable collection's implementation contains references to
 user-created objects that aren't accessible via this collection's methods. This is generally
 used to determine whether `copyOf` implementations should make an explicit copy to avoid
 memory leaks.

### `copyIntoArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` dst, `int` offset)`

**Returns:** `int`

Copies the contents of this immutable collection into the specified array at the specified
 offset. Returns `offset + size()`.

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

