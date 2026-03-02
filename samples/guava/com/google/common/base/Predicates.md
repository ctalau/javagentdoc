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

### `not(com.google.common.base.Predicate<T> predicate)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<T>`](./Predicate.md))

### `and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> components)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a false predicate is found. It defensively copies the iterable passed in, so future
 changes to it won't alter the behavior of this predicate. If components is empty, the
 returned predicate will always evaluate to true.

**Parameters:**
- `components` (`java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>`)

### `and(com.google.common.base.Predicate<? super T>[] components)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a false predicate is found. It defensively copies the array passed in, so future
 changes to it won't alter the behavior of this predicate. If components is empty, the
 returned predicate will always evaluate to true.

**Parameters:**
- `components` ([`com.google.common.base.Predicate<? super T>[]`](./Predicate.md))

### `and(com.google.common.base.Predicate<? super T> first, com.google.common.base.Predicate<? super T> second)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

The components are evaluated in order, and evaluation will be "short-circuited" as soon
 as a false predicate is found.

**Parameters:**
- `first` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))
- `second` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))

### `or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> components)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found. It defensively copies the iterable passed in, so future
 changes to it won't alter the behavior of this predicate. If components is empty, the
 returned predicate will always evaluate to false.

**Parameters:**
- `components` (`java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>`)

### `or(com.google.common.base.Predicate<? super T>[] components)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found. It defensively copies the array passed in, so future
 changes to it won't alter the behavior of this predicate. If components is empty, the
 returned predicate will always evaluate to false.

**Parameters:**
- `components` ([`com.google.common.base.Predicate<? super T>[]`](./Predicate.md))

### `or(com.google.common.base.Predicate<? super T> first, com.google.common.base.Predicate<? super T> second)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

The components are evaluated in order, and evaluation will be "short-circuited"
 as soon as a true predicate is found.

**Parameters:**
- `first` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))
- `second` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))

### `equalTo(T target)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

**Parameters:**
- `target` (`T`)

### `instanceOf(java.lang.Class<?> clazz)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

If the object being tested is null this predicate evaluates to 
 false.

 
If you want to filter an Iterable to narrow its type, consider using com.google.common.collect.Iterables#filter(Iterable, Class) in preference.

 
**Warning:** contrary to the typical assumptions about predicates (as documented at
 Predicate#apply), the returned predicate may not be *consistent with equals*. For
 example, instanceOf(ArrayList.class) will yield different results for the two equal
 instances Lists.newArrayList(1) and Arrays.asList(1).

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

### `subtypeOf(java.lang.Class<?> clazz)`

**Returns:** [`com.google.common.base.Predicate<java.lang.Class<?>>`](./Predicate.md)

Example:

 

```

 List<Class<?>> classes = Arrays.asList(
     Object.class, String.class, Number.class, Long.class);
 return Iterables.filter(classes, subtypeOf(Number.class));
 
```


 The code above returns an iterable containing Number.class and Long.class.

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

### `in(java.util.Collection<? extends T> target)`

**Returns:** [`com.google.common.base.Predicate<T>`](./Predicate.md)

It does not defensively copy the collection passed in, so
 future changes to it will alter the behavior of the predicate.

 
This method can technically accept any Collection<?>, but using a typed collection
 helps prevent bugs. This approach doesn't block any potential users since it is always possible
 to use Predicates.<Object>in().

**Parameters:**
- `target` (`java.util.Collection<? extends T>`): the collection that may contain the function input

### `compose(com.google.common.base.Predicate<B> predicate, com.google.common.base.Function<A,? extends B> function)`

**Returns:** [`com.google.common.base.Predicate<A>`](./Predicate.md)

For every x, the generated
 predicate returns predicate(function(x)).

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<B>`](./Predicate.md))
- `function` ([`com.google.common.base.Function<A,? extends B>`](./Function.md))

### `containsPattern(java.lang.String pattern)`

**Returns:** [`com.google.common.base.Predicate<java.lang.CharSequence>`](./Predicate.md)

The test used is equivalent to
 Pattern.compile(pattern).matcher(arg).find()

**Parameters:**
- `pattern` (`java.lang.String`)

### `contains(java.util.regex.Pattern pattern)`

**Returns:** [`com.google.common.base.Predicate<java.lang.CharSequence>`](./Predicate.md)

The test used is equivalent to
 pattern.matcher(arg).find()

**Parameters:**
- `pattern` (`java.util.regex.Pattern`)

### `toStringHelper(java.lang.String methodName, java.lang.Iterable<?> components)`

**Returns:** `java.lang.String`

**Parameters:**
- `methodName` (`java.lang.String`)
- `components` (`java.lang.Iterable<?>`)

### `asList(com.google.common.base.Predicate<? super T> first, com.google.common.base.Predicate<? super T> second)`

**Returns:** `java.util.List<com.google.common.base.Predicate<? super T>>`

**Parameters:**
- `first` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))
- `second` ([`com.google.common.base.Predicate<? super T>`](./Predicate.md))

### `defensiveCopy(T[] array)`

**Returns:** `java.util.List<T>`

**Parameters:**
- `array` (`T[]`)

### `defensiveCopy(java.lang.Iterable<T> iterable)`

**Returns:** `java.util.List<T>`

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

