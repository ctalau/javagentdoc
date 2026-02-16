# Class: `Functions`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Functions`

## Description

Static utility methods pertaining to {@code com.google.common.base.Function} instances; see that
 class for information about migrating to {@code java.util.function}.

 <p>All methods return serializable functions as long as they're given serializable parameters.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/FunctionalExplained">the use of {@code Function}</a>.
@author Mike Bostock
@author Jared Levy
@since 2.0

## Constructors

### `<init>()`

## Methods

### `toStringFunction()`

**Returns:** [`com.google.common.base.Function<java.lang.Object,java.lang.String>`](./Function.md)

A function equivalent to the method reference {@code Object::toString}, for users not yet using
 Java 8. The function simply invokes {@code toString} on its argument and returns the result. It
 throws a {@link NullPointerException} on null input.

 <p><b>Warning:</b> The returned function may not be <i>consistent with equals</i> (as
 documented at {@link Function#apply}). For example, this function yields different results for
 the two equal instances {@code ImmutableSet.of(1, 2)} and {@code ImmutableSet.of(2, 1)}.

 <p><b>Warning:</b> as with all function types in this package, avoid depending on the specific
 {@code equals}, {@code hashCode} or {@code toString} behavior of the returned function. A
 future migration to {@code java.util.function} will not preserve this behavior.

 <p><b>For Java 8 users:</b> use the method reference {@code Object::toString} instead. In the
 future, when this class requires Java 8, this method will be deprecated. See {@link Function}
 for more important information about the Java 8 transition.

### `identity()`

**Returns:** [`com.google.common.base.Function<E,E>`](./Function.md)

Returns the identity function.

 <p><b>Discouraged:</b> Prefer using a lambda like {@code v -> v}, which is shorter and often
 more readable.

### `forMap([`java.util.Map<K,V>`](../../../../java/util/Map.md) map)`

**Returns:** [`com.google.common.base.Function<K,V>`](./Function.md)

Returns a function which performs a map lookup. The returned function throws an {@link IllegalArgumentException} if given a key that does not exist in the map. See also {@link #forMap(Map, Object)}, which returns a default value in this case.

 <p>Note: if {@code map} is a {@link com.google.common.collect.BiMap BiMap} (or can be one), you
 can use {@link com.google.common.collect.Maps#asConverter Maps.asConverter} instead to get a
 function that also supports reverse conversion.

 <p><b>Java 8 users:</b> if you are okay with {@code null} being returned for an unrecognized
 key (instead of an exception being thrown), you can use the method reference {@code map::get}
 instead.

### `forMap([`java.util.Map<K,? extends V>`](../../../../java/util/Map.md) map, [`V`](V.md) defaultValue)`

**Returns:** [`com.google.common.base.Function<K,V>`](./Function.md)

Returns a function which performs a map lookup with a default value. The function created by
 this method returns {@code defaultValue} for all inputs that do not belong to the map's key
 set. See also {@link #forMap(Map)}, which throws an exception in this case.

 <p><b>Java 8 users:</b> you can just write the lambda expression {@code k ->
 map.getOrDefault(k, defaultValue)} instead.
@param map source map that determines the function behavior
@param defaultValue the value to return for inputs that aren't map keys
@return function that returns {@code map.get(a)} when {@code a} is a key, or {@code
     defaultValue} otherwise

### `compose([`com.google.common.base.Function<B,C>`](./Function.md) g, [`com.google.common.base.Function<A,? extends B>`](./Function.md) f)`

**Returns:** [`com.google.common.base.Function<A,C>`](./Function.md)

Returns the composition of two functions. For {@code f: A->B} and {@code g: B->C}, composition
 is defined as the function h such that {@code h(a) == g(f(a))} for each {@code a}.

 <p><b>Java 8 users:</b> use {@code g.compose(f)} or (probably clearer) {@code f.andThen(g)}
 instead.
@param g the second function to apply
@param f the first function to apply
@return the composition of {@code f} and {@code g}
@see <a href="//en.wikipedia.org/wiki/Function_composition">function composition</a>

### `forPredicate([`com.google.common.base.Predicate<T>`](./Predicate.md) predicate)`

**Returns:** [`com.google.common.base.Function<T,java.lang.Boolean>`](./Function.md)

Creates a function that returns the same boolean output as the given predicate for all inputs.

 <p>The returned function is <i>consistent with equals</i> (as documented at {@link Function#apply}) if and only if {@code predicate} is itself consistent with equals.

 <p><b>Java 8 users:</b> use the method reference {@code predicate::test} instead.

### `constant([`E`](E.md) value)`

**Returns:** [`com.google.common.base.Function<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object,E>`](./Function.md)

Returns a function that ignores its input and always returns {@code value}.

 <p><b>Java 8 users:</b> use the lambda expression {@code o -> value} instead.
@param value the constant value for the function to return
@return a function that always returns {@code value}

### `forSupplier([`com.google.common.base.Supplier<T>`](./Supplier.md) supplier)`

**Returns:** [`com.google.common.base.Function<F,T>`](./Function.md)

Returns a function that ignores its input and returns the result of {@code supplier.get()}.

 <p><b>Java 8 users:</b> use the lambda expression {@code o -> supplier.get()} instead.
@since 10.0

