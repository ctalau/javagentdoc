# Class: `Streams`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Streams`

## Description

## Constructors

### `<init>()`

## Methods

### `stream(java.lang.Iterable<T> iterable)`

**Returns:** `java.util.stream.Stream<T>`

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

### `stream(java.util.Collection<T> collection)`

**Returns:** `java.util.stream.Stream<T>`

**Parameters:**
- `collection` (`java.util.Collection<T>`)

### `stream(java.util.Iterator<T> iterator)`

**Returns:** `java.util.stream.Stream<T>`

Do not use
 iterator directly after passing it to this method.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)

### `stream(com.google.common.base.Optional<T> optional)`

**Returns:** `java.util.stream.Stream<T>`

**Parameters:**
- `optional` ([`com.google.common.base.Optional<T>`](../base/Optional.md))

### `stream(java.util.Optional<T> optional)`

**Returns:** `java.util.stream.Stream<T>`

**Java 9 users:** use optional.stream() instead.

**Parameters:**
- `optional` (`java.util.Optional<T>`)

### `stream(java.util.OptionalInt optional)`

**Returns:** `java.util.stream.IntStream`

**Java 9 users:** use optional.stream() instead.

**Parameters:**
- `optional` (`java.util.OptionalInt`)

### `stream(java.util.OptionalLong optional)`

**Returns:** `java.util.stream.LongStream`

**Java 9 users:** use optional.stream() instead.

**Parameters:**
- `optional` (`java.util.OptionalLong`)

### `stream(java.util.OptionalDouble optional)`

**Returns:** `java.util.stream.DoubleStream`

**Java 9 users:** use optional.stream() instead.

**Parameters:**
- `optional` (`java.util.OptionalDouble`)

### `closeAll(java.util.stream.BaseStream<?,?>[] toClose)`

**Returns:** `void`

**Parameters:**
- `toClose` (`java.util.stream.BaseStream<?,?>[]`)

### `sneakyThrow(java.lang.Throwable t)`

**Returns:** `void`

**Parameters:**
- `t` (`java.lang.Throwable`)

### `concat(java.util.stream.Stream<? extends T>[] streams)`

**Returns:** `java.util.stream.Stream<T>`

This is equivalent to Stream.of(streams).flatMap(stream -> stream), but the returned
 stream may perform better.

**Parameters:**
- `streams` (`java.util.stream.Stream<? extends T>[]`)

### `concat(java.util.stream.IntStream[] streams)`

**Returns:** `java.util.stream.IntStream`

This is equivalent to Stream.of(streams).flatMapToInt(stream -> stream), but the
 returned stream may perform better.

**Parameters:**
- `streams` (`java.util.stream.IntStream[]`)

### `concat(java.util.stream.LongStream[] streams)`

**Returns:** `java.util.stream.LongStream`

This is equivalent to Stream.of(streams).flatMapToLong(stream -> stream), but the
 returned stream may perform better.

**Parameters:**
- `streams` (`java.util.stream.LongStream[]`)

### `concat(java.util.stream.DoubleStream[] streams)`

**Returns:** `java.util.stream.DoubleStream`

This is equivalent to Stream.of(streams).flatMapToDouble(stream -> stream), but the
 returned stream may perform better.

**Parameters:**
- `streams` (`java.util.stream.DoubleStream[]`)

### `zip(java.util.stream.Stream<A> streamA, java.util.stream.Stream<B> streamB, java.util.function.BiFunction<? super A,? super B,R> function)`

**Returns:** `java.util.stream.Stream<R>`

For example:

 

```

 Streams.zip(
   Stream.of("foo1", "foo2", "foo3"),
   Stream.of("bar1", "bar2"),
   (arg1, arg2) -> arg1 + ":" + arg2)
 
```


 
will return Stream.of("foo1:bar1", "foo2:bar2").

 
The resulting stream will only be as long as the shorter of the two input streams; if one
 stream is longer, its extra elements will be ignored.

 
Note that if you are calling Stream#forEach on the resulting stream, you might want
 to consider using #forEachPair instead of this method.

 
**Performance note:** The resulting stream is not [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html).
 This may harm parallel performance.

**Parameters:**
- `streamA` (`java.util.stream.Stream<A>`)
- `streamB` (`java.util.stream.Stream<B>`)
- `function` (`java.util.function.BiFunction<? super A,? super B,R>`)

### `forEachPair(java.util.stream.Stream<A> streamA, java.util.stream.Stream<B> streamB, java.util.function.BiConsumer<? super A,? super B> consumer)`

**Returns:** `void`

If one stream is longer than the other, the extra elements are silently
 ignored. Elements passed to the consumer are guaranteed to come from the same position in their
 respective source streams. For example:

 

```

 Streams.forEachPair(
   Stream.of("foo1", "foo2", "foo3"),
   Stream.of("bar1", "bar2"),
   (arg1, arg2) -> System.out.println(arg1 + ":" + arg2)
 
```


 
will print:

 

```

 foo1:bar1
 foo2:bar2
 
```


 
**Warning:** If either supplied stream is a parallel stream, the same correspondence
 between elements will be made, but the order in which those pairs of elements are passed to the
 consumer is *not* defined.

 
Note that many usages of this method can be replaced with simpler calls to #zip.
 This method behaves equivalently to zipping the stream elements into
 temporary pair objects and then using Stream#forEach on that stream.

**Parameters:**
- `streamA` (`java.util.stream.Stream<A>`)
- `streamB` (`java.util.stream.Stream<B>`)
- `consumer` (`java.util.function.BiConsumer<? super A,? super B>`)

### `mapWithIndex(java.util.stream.Stream<T> stream, com.google.common.collect.Streams.FunctionWithIndex<? super T,? extends R> function)`

**Returns:** `java.util.stream.Stream<R>`

For example,

 

```

 mapWithIndex(
     Stream.of("a", "b", "c"),
     (e, index) -> index + ":" + e)
 
```


 
would return Stream.of("0:a", "1:b", "2:c").

 
The resulting stream is [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 if and only if stream was efficiently splittable and its underlying spliterator
 reported Spliterator#SUBSIZED. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 
The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

**Parameters:**
- `stream` (`java.util.stream.Stream<T>`)
- `function` (`com.google.common.collect.Streams.FunctionWithIndex<? super T,? extends R>`)

### `mapWithIndex(java.util.stream.IntStream stream, com.google.common.collect.Streams.IntFunctionWithIndex<R> function)`

**Returns:** `java.util.stream.Stream<R>`

For example,

 

```

 mapWithIndex(
     IntStream.of(10, 11, 12),
     (e, index) -> index + ":" + e)
 
```


 
...would return Stream.of("0:10", "1:11", "2:12").

 
The resulting stream is [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 if and only if stream was efficiently splittable and its underlying spliterator
 reported Spliterator#SUBSIZED. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 
The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

**Parameters:**
- `stream` (`java.util.stream.IntStream`)
- `function` (`com.google.common.collect.Streams.IntFunctionWithIndex<R>`)

### `mapWithIndex(java.util.stream.LongStream stream, com.google.common.collect.Streams.LongFunctionWithIndex<R> function)`

**Returns:** `java.util.stream.Stream<R>`

For example,

 

```

 mapWithIndex(
     LongStream.of(10, 11, 12),
     (e, index) -> index + ":" + e)
 
```


 
...would return Stream.of("0:10", "1:11", "2:12").

 
The resulting stream is [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 if and only if stream was efficiently splittable and its underlying spliterator
 reported Spliterator#SUBSIZED. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 
The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

**Parameters:**
- `stream` (`java.util.stream.LongStream`)
- `function` (`com.google.common.collect.Streams.LongFunctionWithIndex<R>`)

### `mapWithIndex(java.util.stream.DoubleStream stream, com.google.common.collect.Streams.DoubleFunctionWithIndex<R> function)`

**Returns:** `java.util.stream.Stream<R>`

For example,

 

```

 mapWithIndex(
     DoubleStream.of(0.0, 1.0, 2.0)
     (e, index) -> index + ":" + e)
 
```


 
...would return Stream.of("0:0.0", "1:1.0", "2:2.0").

 
The resulting stream is [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 if and only if stream was efficiently splittable and its underlying spliterator
 reported Spliterator#SUBSIZED. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 
The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

**Parameters:**
- `stream` (`java.util.stream.DoubleStream`)
- `function` (`com.google.common.collect.Streams.DoubleFunctionWithIndex<R>`)

### `findLast(java.util.stream.Stream<T> stream)`

**Returns:** `java.util.Optional<T>`

Equivalent to stream.reduce((a, b) -> b), but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 streams.

 
If the stream has nondeterministic order, this has equivalent semantics to Stream#findAny (which you might as well use).

**Parameters:**
- `stream` (`java.util.stream.Stream<T>`)

### `findLast(java.util.stream.IntStream stream)`

**Returns:** `java.util.OptionalInt`

Equivalent to stream.reduce((a, b) -> b), but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 streams.

**Parameters:**
- `stream` (`java.util.stream.IntStream`)

### `findLast(java.util.stream.LongStream stream)`

**Returns:** `java.util.OptionalLong`

Equivalent to stream.reduce((a, b) -> b), but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 streams.

**Parameters:**
- `stream` (`java.util.stream.LongStream`)

### `findLast(java.util.stream.DoubleStream stream)`

**Returns:** `java.util.OptionalDouble`

Equivalent to stream.reduce((a, b) -> b), but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 streams.

**Parameters:**
- `stream` (`java.util.stream.DoubleStream`)

