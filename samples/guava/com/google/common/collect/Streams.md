# Class: `Streams`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Streams`

## Description

## Constructors

### `<init>()`

## Methods

### `stream(Iterable<T> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

**Returns:** `java.util.stream.Stream<T>`

### `stream(Collection<T> collection)`

**Parameters:**
- `collection` (`java.util.Collection<T>`)

**Returns:** `java.util.stream.Stream<T>`

### `stream(Iterator<T> iterator)`

Do not use
 iterator directly after passing it to this method.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)

**Returns:** `java.util.stream.Stream<T>`

### `stream(Optional<T> optional)`

**Parameters:**
- `optional` ([`com.google.common.base.Optional<T>`](../base/Optional.md))

**Returns:** `java.util.stream.Stream<T>`

### `stream(Optional<T> optional)`

**Java 9 users:** use optional.stream() instead.

**Parameters:**
- `optional` (`java.util.Optional<T>`)

**Returns:** `java.util.stream.Stream<T>`

### `stream(OptionalInt optional)`

**Java 9 users:** use optional.stream() instead.

**Parameters:**
- `optional` (`java.util.OptionalInt`)

**Returns:** `java.util.stream.IntStream`

### `stream(OptionalLong optional)`

**Java 9 users:** use optional.stream() instead.

**Parameters:**
- `optional` (`java.util.OptionalLong`)

**Returns:** `java.util.stream.LongStream`

### `stream(OptionalDouble optional)`

**Java 9 users:** use optional.stream() instead.

**Parameters:**
- `optional` (`java.util.OptionalDouble`)

**Returns:** `java.util.stream.DoubleStream`

### `closeAll(BaseStream<?,?>[] toClose)`

**Parameters:**
- `toClose` (`java.util.stream.BaseStream<?,?>[]`)

**Returns:** `void`

### `sneakyThrow(Throwable t)`

**Parameters:**
- `t` (`java.lang.Throwable`)

**Returns:** `void`

### `concat(Stream<? extends T>[] streams)`

This is equivalent to Stream.of(streams).flatMap(stream -> stream), but the returned
 stream may perform better.

**Parameters:**
- `streams` (`java.util.stream.Stream<? extends T>[]`)

**Returns:** `java.util.stream.Stream<T>`

### `concat(IntStream[] streams)`

This is equivalent to Stream.of(streams).flatMapToInt(stream -> stream), but the
 returned stream may perform better.

**Parameters:**
- `streams` (`java.util.stream.IntStream[]`)

**Returns:** `java.util.stream.IntStream`

### `concat(LongStream[] streams)`

This is equivalent to Stream.of(streams).flatMapToLong(stream -> stream), but the
 returned stream may perform better.

**Parameters:**
- `streams` (`java.util.stream.LongStream[]`)

**Returns:** `java.util.stream.LongStream`

### `concat(DoubleStream[] streams)`

This is equivalent to Stream.of(streams).flatMapToDouble(stream -> stream), but the
 returned stream may perform better.

**Parameters:**
- `streams` (`java.util.stream.DoubleStream[]`)

**Returns:** `java.util.stream.DoubleStream`

### `zip(Stream<A> streamA, Stream<B> streamB, BiFunction<? super A,? super B,R> function)`

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

**Returns:** `java.util.stream.Stream<R>`

### `forEachPair(Stream<A> streamA, Stream<B> streamB, BiConsumer<? super A,? super B> consumer)`

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

**Returns:** `void`

### `mapWithIndex(Stream<T> stream, Streams.FunctionWithIndex<? super T,? extends R> function)`

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

**Returns:** `java.util.stream.Stream<R>`

### `mapWithIndex(IntStream stream, Streams.IntFunctionWithIndex<R> function)`

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

**Returns:** `java.util.stream.Stream<R>`

### `mapWithIndex(LongStream stream, Streams.LongFunctionWithIndex<R> function)`

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

**Returns:** `java.util.stream.Stream<R>`

### `mapWithIndex(DoubleStream stream, Streams.DoubleFunctionWithIndex<R> function)`

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

**Returns:** `java.util.stream.Stream<R>`

### `findLast(Stream<T> stream)`

Equivalent to stream.reduce((a, b) -> b), but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 streams.

 
If the stream has nondeterministic order, this has equivalent semantics to Stream#findAny (which you might as well use).

**Parameters:**
- `stream` (`java.util.stream.Stream<T>`)

**Returns:** `java.util.Optional<T>`

### `findLast(IntStream stream)`

Equivalent to stream.reduce((a, b) -> b), but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 streams.

**Parameters:**
- `stream` (`java.util.stream.IntStream`)

**Returns:** `java.util.OptionalInt`

### `findLast(LongStream stream)`

Equivalent to stream.reduce((a, b) -> b), but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 streams.

**Parameters:**
- `stream` (`java.util.stream.LongStream`)

**Returns:** `java.util.OptionalLong`

### `findLast(DoubleStream stream)`

Equivalent to stream.reduce((a, b) -> b), but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on [efficiently splittable](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
 streams.

**Parameters:**
- `stream` (`java.util.stream.DoubleStream`)

**Returns:** `java.util.OptionalDouble`

