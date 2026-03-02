# Class: `Predicates`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Predicates`

## Description

All methods return serializable predicates as long as they're given serializable parameters.

 
See the Guava User Guide article on [the use of Predicate](https://github.com/google/guava/wiki/FunctionalExplained).

## Constructors

### `<init>()`

## Methods

### `alwaysTrue()`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `alwaysFalse()`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `isNull()`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `notNull()`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `not(Predicate<T> predicate)`

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<T>`](./Predicate.md))

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `and(Iterable<? extends Predicate<? super T>> components)`

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a false predicate is found. It defensively copies the iterable passed in, so future
 changes to it won't alter the behavior of this predicate. If components is empty, the
 returned predicate will always evaluate to true.

**Parameters:**
- `components` (`java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>`)

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `and(Predicate<? super T>[] components)`

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a false predicate is found. It defensively copies the array passed in, so future
 changes to it won't alter the behavior of this predicate. If components is empty, the
 returned predicate will always evaluate to true.

**Parameters:**
- `components` ([`com.google.common.base.Predicate<? super T>[]`](./Predicate.md))

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `and(Predicate<? super T> first, Predicate<? super T> second)`

The components are evaluated in order, and evaluation will be "short-circuited" as soon
 as a false predicate is found.

**Parameters:**
- `first` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))
- `second` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `or(Iterable<? extends Predicate<? super T>> components)`

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found. It defensively copies the iterable passed in, so future
 changes to it won't alter the behavior of this predicate. If components is empty, the
 returned predicate will always evaluate to false.

**Parameters:**
- `components` (`java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>`)

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `or(Predicate<? super T>[] components)`

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found. It defensively copies the array passed in, so future
 changes to it won't alter the behavior of this predicate. If components is empty, the
 returned predicate will always evaluate to false.

**Parameters:**
- `components` ([`com.google.common.base.Predicate<? super T>[]`](./Predicate.md))

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `or(Predicate<? super T> first, Predicate<? super T> second)`

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found.

**Parameters:**
- `first` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))
- `second` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `equalTo(T target)`

**Parameters:**
- `target` (`T`)

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `instanceOf(Class<?> clazz)`

If the object being tested is null this predicate evaluates to 
 false.

 
If you want to filter an Iterable to narrow its type, consider using com.google.common.collect.Iterables#filter(Iterable, Class) in preference.

 
**Warning:** contrary to the typical assumptions about predicates (as documented at
 Predicate#apply), the returned predicate may not be *consistent with equals*. For
 example, instanceOf(ArrayList.class) will yield different results for the two equal
 instances Lists.newArrayList(1) and Arrays.asList(1).

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `subtypeOf(Class<?> clazz)`

Example:

 

```

 List<Class<?>> classes = Arrays.asList(
     Object.class, String.class, Number.class, Long.class);
 return Iterables.filter(classes, subtypeOf(Number.class));
 
```


 The code above returns an iterable containing Number.class and Long.class.

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

**Returns:** [`com.google.common.base.Predicate<java.lang.Class<?>>`](./Predicate.md)

### `in(Collection<? extends T> target)`

It does not defensively copy the collection passed in, so
 future changes to it will alter the behavior of the predicate.

 
This method can technically accept any Collection<?>, but using a typed collection
 helps prevent bugs. This approach doesn't block any potential users since it is always possible
 to use Predicates.<Object>in().

**Parameters:**
- `target` (`java.util.Collection<? extends T>`): the collection that may contain the function input

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

### `compose(Predicate<B> predicate, Function<A,? extends B> function)`

For every x, the generated
 predicate returns predicate(function(x)).

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<B>`](./Predicate.md))
- `function` ([`com.google.common.base.Function<A,? extends B>`](./Function.md))

**Returns:** [`com.google.common.base.Predicate<A>`](./Predicate.md)

### `containsPattern(String pattern)`

The test used is equivalent to
 Pattern.compile(pattern).matcher(arg).find()

**Parameters:**
- `pattern` (`java.lang.String`)

**Returns:** [`com.google.common.base.Predicate<java.lang.CharSequence>`](./Predicate.md)

### `contains(Pattern pattern)`

The test used is equivalent to
 pattern.matcher(arg).find()

**Parameters:**
- `pattern` (`java.util.regex.Pattern`)

**Returns:** [`com.google.common.base.Predicate<java.lang.CharSequence>`](./Predicate.md)

### `toStringHelper(String methodName, Iterable<?> components)`

**Parameters:**
- `methodName` (`java.lang.String`)
- `components` (`java.lang.Iterable<?>`)

**Returns:** `java.lang.String`

### `asList(Predicate<? super T> first, Predicate<? super T> second)`

**Parameters:**
- `first` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))
- `second` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))

**Returns:** `java.util.List<com.google.common.base.Predicate<? super T>>`

### `defensiveCopy(T[] array)`

**Parameters:**
- `array` (`T[]`)

**Returns:** `java.util.List<T>`

### `defensiveCopy(Iterable<T> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

**Returns:** `java.util.List<T>`

