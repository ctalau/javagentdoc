# Class: `Predicates`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Predicates`

## Description

Static utility methods pertaining to {@code Predicate} instances.

 <p>All methods return serializable predicates as long as they're given serializable parameters.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/FunctionalExplained">the use of {@code Predicate}</a>.
@author Kevin Bourrillion
@since 2.0

## Constructors

### `<init>()`

## Methods

### `alwaysTrue()`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that always evaluates to {@code true}.

### `alwaysFalse()`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that always evaluates to {@code false}.

### `isNull()`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if the object reference being tested is
 null.

### `notNull()`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if the object reference being tested is not
 null.

### `not([`com.google.common.base.Predicate<T>`](./Predicate.md) predicate)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if the given predicate evaluates to {@code
 false}.

### `and(`java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>` components)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if each of its components evaluates to
 {@code true}. The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a false predicate is found. It defensively copies the iterable passed in, so future
 changes to it won't alter the behavior of this predicate. If {@code components} is empty, the
 returned predicate will always evaluate to {@code true}.

### `and([`com.google.common.base.Predicate<? super T>[]`](./Predicate.md) components)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if each of its components evaluates to
 {@code true}. The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a false predicate is found. It defensively copies the array passed in, so future
 changes to it won't alter the behavior of this predicate. If {@code components} is empty, the
 returned predicate will always evaluate to {@code true}.

### `and([`com.google.common.base.Predicate<? super T>`](./Predicate.md) first, [`com.google.common.base.Predicate<? super T>`](./Predicate.md) second)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if both of its components evaluate to {@code
 true}. The components are evaluated in order, and evaluation will be "short-circuited" as soon
 as a false predicate is found.

### `or(`java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>` components)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if any one of its components evaluates to
 {@code true}. The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found. It defensively copies the iterable passed in, so future
 changes to it won't alter the behavior of this predicate. If {@code components} is empty, the
 returned predicate will always evaluate to {@code false}.

### `or([`com.google.common.base.Predicate<? super T>[]`](./Predicate.md) components)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if any one of its components evaluates to
 {@code true}. The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found. It defensively copies the array passed in, so future
 changes to it won't alter the behavior of this predicate. If {@code components} is empty, the
 returned predicate will always evaluate to {@code false}.

### `or([`com.google.common.base.Predicate<? super T>`](./Predicate.md) first, [`com.google.common.base.Predicate<? super T>`](./Predicate.md) second)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if either of its components evaluates to
 {@code true}. The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found.

### `equalTo([`T`](T.md) target)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if the object being tested {@code equals()}
 the given target or both are null.

### `instanceOf(`java.lang.Class<?>` clazz)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if the object being tested is an instance of
 the given class. If the object being tested is {@code null} this predicate evaluates to {@code
 false}.

 <p>If you want to filter an {@code Iterable} to narrow its type, consider using {@link com.google.common.collect.Iterables#filter(Iterable, Class)} in preference.

 <p><b>Warning:</b> contrary to the typical assumptions about predicates (as documented at
 {@link Predicate#apply}), the returned predicate may not be <i>consistent with equals</i>. For
 example, {@code instanceOf(ArrayList.class)} will yield different results for the two equal
 instances {@code Lists.newArrayList(1)} and {@code Arrays.asList(1)}.

### `subtypeOf(`java.lang.Class<?>` clazz)`

**Returns:** [`com.google.common.base.Predicate<java.lang.Class<?>>`](./Predicate>.md)

Returns a predicate that evaluates to {@code true} if the class being tested is assignable to
 (is a subtype of) {@code clazz}. Example:

 <pre>{@code
 List<Class<?>> classes = Arrays.asList(
     Object.class, String.class, Number.class, Long.class);
 return Iterables.filter(classes, subtypeOf(Number.class));
 }</pre>

 The code above returns an iterable containing {@code Number.class} and {@code Long.class}.
@since 20.0 (since 10.0 under the incorrect name {@code assignableFrom})

### `in([`java.util.Collection<? extends T>`](../../../../java/util/Collection.md) target)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if the object reference being tested is a
 member of the given collection. It does not defensively copy the collection passed in, so
 future changes to it will alter the behavior of the predicate.

 <p>This method can technically accept any {@code Collection<?>}, but using a typed collection
 helps prevent bugs. This approach doesn't block any potential users since it is always possible
 to use {@code Predicates.<Object>in()}.
@param target the collection that may contain the function input

### `compose([`com.google.common.base.Predicate<B>`](./Predicate.md) predicate, [`com.google.common.base.Function<A,? extends B>`](./Function.md) function)`

**Returns:** [`com.google.common.base.Predicate<A>`](./Predicate.md)

Returns the composition of a function and a predicate. For every {@code x}, the generated
 predicate returns {@code predicate(function(x))}.
@return the composition of the provided function and predicate

### `containsPattern(`java.lang.String` pattern)`

**Returns:** [`com.google.common.base.Predicate<java.lang.CharSequence>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if the {@code CharSequence} being tested
 contains any match for the given regular expression pattern. The test used is equivalent to
 {@code Pattern.compile(pattern).matcher(arg).find()}
@throws IllegalArgumentException if the pattern is invalid
@since 3.0

### `contains([`java.util.regex.Pattern`](../../../../java/util/regex/Pattern.md) pattern)`

**Returns:** [`com.google.common.base.Predicate<java.lang.CharSequence>`](./Predicate.md)

Returns a predicate that evaluates to {@code true} if the {@code CharSequence} being tested
 contains any match for the given regular expression pattern. The test used is equivalent to
 {@code pattern.matcher(arg).find()}
@since 3.0

### `toStringHelper(`java.lang.String` methodName, `java.lang.Iterable<?>` components)`

**Returns:** `java.lang.String`

### `asList([`com.google.common.base.Predicate<? super T>`](./Predicate.md) first, [`com.google.common.base.Predicate<? super T>`](./Predicate.md) second)`

**Returns:** [`java.util.List<com.google.common.base.Predicate<? super T>>`](../../../../java/util/List>.md)

### `defensiveCopy([`T[]`](T.md) array)`

**Returns:** [`java.util.List<T>`](../../../../java/util/List.md)

### `defensiveCopy(`java.lang.Iterable<T>` iterable)`

**Returns:** [`java.util.List<T>`](../../../../java/util/List.md)

