# Class: `Functions`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Functions`

## Description

All methods return serializable functions as long as they're given serializable parameters.

 
See the Guava User Guide article on [the use of Function](https://github.com/google/guava/wiki/FunctionalExplained).

## Constructors

### `<init>()`

## Methods

### `toStringFunction()`

The function simply invokes toString on its argument and returns the result. It
 throws a NullPointerException on null input.

 
**Warning:** The returned function may not be *consistent with equals* (as
 documented at Function#apply). For example, this function yields different results for
 the two equal instances ImmutableSet.of(1, 2) and ImmutableSet.of(2, 1).

 
**Warning:** as with all function types in this package, avoid depending on the specific
 equals, hashCode or toString behavior of the returned function. A
 future migration to java.util.function will not preserve this behavior.

 
**For Java 8 users:** use the method reference Object::toString instead. In the
 future, when this class requires Java 8, this method will be deprecated. See Function
 for more important information about the Java 8 transition.

**Returns:** [`com.google.common.base.Function<java.lang.Object,java.lang.String>`](./Function.md)

### `identity()`

**Discouraged:** Prefer using a lambda like v -> v, which is shorter and often
 more readable.

**Returns:** [`com.google.common.base.Function<E,E>`](./Function.md)

### `forMap(Map<K,V> map)`

The returned function throws an IllegalArgumentException if given a key that does not exist in the map. See also #forMap(Map, Object), which returns a default value in this case.

 
Note: if map is a BiMap (or can be one), you
 can use Maps.asConverter instead to get a
 function that also supports reverse conversion.

 
**Java 8 users:** if you are okay with null being returned for an unrecognized
 key (instead of an exception being thrown), you can use the method reference map::get
 instead.

**Parameters:**
- `map` (`java.util.Map<K,V>`)

**Returns:** [`com.google.common.base.Function<K,V>`](./Function.md)

### `forMap(Map<K,? extends V> map, V defaultValue)`

The function created by
 this method returns defaultValue for all inputs that do not belong to the map's key
 set. See also #forMap(Map), which throws an exception in this case.

 
**Java 8 users:** you can just write the lambda expression k ->
 map.getOrDefault(k, defaultValue) instead.

**Parameters:**
- `map` (`java.util.Map<K,? extends V>`): source map that determines the function behavior
- `defaultValue` (`V`): the value to return for inputs that aren't map keys

**Returns:** [`com.google.common.base.Function<K,V>`](./Function.md)

### `compose(Function<B,C> g, Function<A,? extends B> f)`

For f: A->B and g: B->C, composition
 is defined as the function h such that h(a) == g(f(a)) for each a.

 
**Java 8 users:** use g.compose(f) or (probably clearer) f.andThen(g)
 instead.

**Parameters:**
- `g` ([`com.google.common.base.Function<B,C>`](./Function.md)): the second function to apply
- `f` ([`com.google.common.base.Function<A,? extends B>`](./Function.md)): the first function to apply

**Returns:** [`com.google.common.base.Function<A,C>`](./Function.md)

### `forPredicate(Predicate<T> predicate)`

The returned function is *consistent with equals* (as documented at Function#apply) if and only if predicate is itself consistent with equals.

 
**Java 8 users:** use the method reference predicate::test instead.

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<T>`](./Predicate.md))

**Returns:** [`com.google.common.base.Function<T,java.lang.Boolean>`](./Function.md)

### `constant(E value)`

**Java 8 users:** use the lambda expression o -> value instead.

**Parameters:**
- `value` (`E`): the constant value for the function to return

**Returns:** [`com.google.common.base.Function<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object,E>`](./Function.md)

### `forSupplier(Supplier<T> supplier)`

**Java 8 users:** use the lambda expression o -> supplier.get() instead.

**Parameters:**
- `supplier` ([`com.google.common.base.Supplier<T>`](./Supplier.md))

**Returns:** [`com.google.common.base.Function<F,T>`](./Function.md)

