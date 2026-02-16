# Class: `Streams`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Streams`

## Description

Static utility methods related to `Stream` instances.
**Since:** 21.0

## Constructors

### `<init>()`

## Methods

### `stream(`java.lang.Iterable<T>` iterable)`

**Returns:** `java.util.stream.Stream<T>`

Returns a sequential `Stream` of the contents of `iterable`, delegating to `Collection.stream` if possible.

### `stream(`java.util.Collection<T>` collection)`

**Returns:** `java.util.stream.Stream<T>`

Returns `Collection.stream`.
**Deprecated:** There is no reason to use this; just invoke `collection.stream()` directly.

### `stream(`java.util.Iterator<T>` iterator)`

**Returns:** `java.util.stream.Stream<T>`

Returns a sequential `Stream` of the remaining contents of `iterator`. Do not use
 `iterator` directly after passing it to this method.

### `stream([`com.google.common.base.Optional<T>`](../base/Optional.md) optional)`

**Returns:** `java.util.stream.Stream<T>`

If a value is present in `optional`, returns a stream containing only that element,
 otherwise returns an empty stream.

### `stream(`java.util.Optional<T>` optional)`

**Returns:** `java.util.stream.Stream<T>`

If a value is present in `optional`, returns a stream containing only that element,
 otherwise returns an empty stream.

 <p><b>Java 9 users:</b> use `optional.stream()` instead.

### `stream(`java.util.OptionalInt` optional)`

**Returns:** `java.util.stream.IntStream`

If a value is present in `optional`, returns a stream containing only that element,
 otherwise returns an empty stream.

 <p><b>Java 9 users:</b> use `optional.stream()` instead.

### `stream(`java.util.OptionalLong` optional)`

**Returns:** `java.util.stream.LongStream`

If a value is present in `optional`, returns a stream containing only that element,
 otherwise returns an empty stream.

 <p><b>Java 9 users:</b> use `optional.stream()` instead.

### `stream(`java.util.OptionalDouble` optional)`

**Returns:** `java.util.stream.DoubleStream`

If a value is present in `optional`, returns a stream containing only that element,
 otherwise returns an empty stream.

 <p><b>Java 9 users:</b> use `optional.stream()` instead.

### `closeAll(`java.util.stream.BaseStream<?,?>[]` toClose)`

**Returns:** `void`

### `sneakyThrow(`java.lang.Throwable` t)`

**Returns:** `void`

Throws an undeclared checked exception.

### `concat(`java.util.stream.Stream<? extends T>[]` streams)`

**Returns:** `java.util.stream.Stream<T>`

Returns a `Stream` containing the elements of the first stream, followed by the elements
 of the second stream, and so on.

 <p>This is equivalent to `Stream.of(streams).flatMap(stream -> stream)`, but the returned
 stream may perform better.
**See:** Stream#concat(Stream, Stream)

### `concat(`java.util.stream.IntStream[]` streams)`

**Returns:** `java.util.stream.IntStream`

Returns an `IntStream` containing the elements of the first stream, followed by the
 elements of the second stream, and so on.

 <p>This is equivalent to `Stream.of(streams).flatMapToInt(stream -> stream)`, but the
 returned stream may perform better.
**See:** IntStream#concat(IntStream, IntStream)

### `concat(`java.util.stream.LongStream[]` streams)`

**Returns:** `java.util.stream.LongStream`

Returns a `LongStream` containing the elements of the first stream, followed by the
 elements of the second stream, and so on.

 <p>This is equivalent to `Stream.of(streams).flatMapToLong(stream -> stream)`, but the
 returned stream may perform better.
**See:** LongStream#concat(LongStream, LongStream)

### `concat(`java.util.stream.DoubleStream[]` streams)`

**Returns:** `java.util.stream.DoubleStream`

Returns a `DoubleStream` containing the elements of the first stream, followed by the
 elements of the second stream, and so on.

 <p>This is equivalent to `Stream.of(streams).flatMapToDouble(stream -> stream)`, but the
 returned stream may perform better.
**See:** DoubleStream#concat(DoubleStream, DoubleStream)

### `zip(`java.util.stream.Stream<A>` streamA, `java.util.stream.Stream<B>` streamB, `java.util.function.BiFunction<? super A,? super B,R>` function)`

**Returns:** `java.util.stream.Stream<R>`

Returns a stream in which each element is the result of passing the corresponding element of
 each of `streamA` and `streamB` to `function`.

 <p>For example:

 <pre>`Streams.zip(
   Stream.of("foo1", "foo2", "foo3"),
   Stream.of("bar1", "bar2"),
   (arg1, arg2) -> arg1 + ":" + arg2)
 `</pre>

 <p>will return `Stream.of("foo1:bar1", "foo2:bar2")`.

 <p>The resulting stream will only be as long as the shorter of the two input streams; if one
 stream is longer, its extra elements will be ignored.

 <p>Note that if you are calling `Stream.forEach` on the resulting stream, you might want
 to consider using `forEachPair` instead of this method.

 <p><b>Performance note:</b> The resulting stream is not <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>.
 This may harm parallel performance.

### `forEachPair(`java.util.stream.Stream<A>` streamA, `java.util.stream.Stream<B>` streamB, `java.util.function.BiConsumer<? super A,? super B>` consumer)`

**Returns:** `void`

Invokes `consumer` once for each pair of <i>corresponding</i> elements in `streamA`
 and `streamB`. If one stream is longer than the other, the extra elements are silently
 ignored. Elements passed to the consumer are guaranteed to come from the same position in their
 respective source streams. For example:

 <pre>`Streams.forEachPair(
   Stream.of("foo1", "foo2", "foo3"),
   Stream.of("bar1", "bar2"),
   (arg1, arg2) -> System.out.println(arg1 + ":" + arg2)
 `</pre>

 <p>will print:

 <pre>`foo1:bar1
 foo2:bar2
 `</pre>

 <p><b>Warning:</b> If either supplied stream is a parallel stream, the same correspondence
 between elements will be made, but the order in which those pairs of elements are passed to the
 consumer is <i>not</i> defined.

 <p>Note that many usages of this method can be replaced with simpler calls to `zip`.
 This method behaves equivalently to zipping the stream elements into
 temporary pair objects and then using `Stream.forEach` on that stream.
**Since:** 22.0

### `mapWithIndex(`java.util.stream.Stream<T>` stream, [`com.google.common.collect.Streams.FunctionWithIndex<? super T,? extends R>`](Streams/FunctionWithIndex.md) function)`

**Returns:** `java.util.stream.Stream<R>`

Returns a stream consisting of the results of applying the given function to the elements of
 `stream` and their indices in the stream. For example,

 <pre>`mapWithIndex(
     Stream.of("a", "b", "c"),
     (e, index) -> index + ":" + e)
 `</pre>

 <p>would return `Stream.of("0:a", "1:b", "2:c")`.

 <p>The resulting stream is <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 if and only if `stream` was efficiently splittable and its underlying spliterator
 reported `Spliterator.SUBSIZED`. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 <p>The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

### `mapWithIndex(`java.util.stream.IntStream` stream, [`com.google.common.collect.Streams.IntFunctionWithIndex<R>`](Streams/IntFunctionWithIndex.md) function)`

**Returns:** `java.util.stream.Stream<R>`

Returns a stream consisting of the results of applying the given function to the elements of
 `stream` and their indexes in the stream. For example,

 <pre>`mapWithIndex(
     IntStream.of(10, 11, 12),
     (e, index) -> index + ":" + e)
 `</pre>

 <p>...would return `Stream.of("0:10", "1:11", "2:12")`.

 <p>The resulting stream is <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 if and only if `stream` was efficiently splittable and its underlying spliterator
 reported `Spliterator.SUBSIZED`. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 <p>The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

### `mapWithIndex(`java.util.stream.LongStream` stream, [`com.google.common.collect.Streams.LongFunctionWithIndex<R>`](Streams/LongFunctionWithIndex.md) function)`

**Returns:** `java.util.stream.Stream<R>`

Returns a stream consisting of the results of applying the given function to the elements of
 `stream` and their indexes in the stream. For example,

 <pre>`mapWithIndex(
     LongStream.of(10, 11, 12),
     (e, index) -> index + ":" + e)
 `</pre>

 <p>...would return `Stream.of("0:10", "1:11", "2:12")`.

 <p>The resulting stream is <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 if and only if `stream` was efficiently splittable and its underlying spliterator
 reported `Spliterator.SUBSIZED`. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 <p>The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

### `mapWithIndex(`java.util.stream.DoubleStream` stream, [`com.google.common.collect.Streams.DoubleFunctionWithIndex<R>`](Streams/DoubleFunctionWithIndex.md) function)`

**Returns:** `java.util.stream.Stream<R>`

Returns a stream consisting of the results of applying the given function to the elements of
 `stream` and their indexes in the stream. For example,

 <pre>`mapWithIndex(
     DoubleStream.of(0.0, 1.0, 2.0)
     (e, index) -> index + ":" + e)
 `</pre>

 <p>...would return `Stream.of("0:0.0", "1:1.0", "2:2.0")`.

 <p>The resulting stream is <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 if and only if `stream` was efficiently splittable and its underlying spliterator
 reported `Spliterator.SUBSIZED`. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 <p>The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

### `findLast(`java.util.stream.Stream<T>` stream)`

**Returns:** `java.util.Optional<T>`

Returns the last element of the specified stream, or `java.util.Optional.empty` if the
 stream is empty.

 <p>Equivalent to `stream.reduce((a, b) -> b)`, but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 streams.

 <p>If the stream has nondeterministic order, this has equivalent semantics to `Stream.findAny` (which you might as well use).
**See:** Stream#findFirst()
@throws NullPointerException if the last element of the stream is null

### `findLast(`java.util.stream.IntStream` stream)`

**Returns:** `java.util.OptionalInt`

Returns the last element of the specified stream, or `OptionalInt.empty` if the stream is
 empty.

 <p>Equivalent to `stream.reduce((a, b) -> b)`, but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 streams.
**See:** IntStream#findFirst()
@throws NullPointerException if the last element of the stream is null

### `findLast(`java.util.stream.LongStream` stream)`

**Returns:** `java.util.OptionalLong`

Returns the last element of the specified stream, or `OptionalLong.empty` if the stream
 is empty.

 <p>Equivalent to `stream.reduce((a, b) -> b)`, but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 streams.
**See:** LongStream#findFirst()
@throws NullPointerException if the last element of the stream is null

### `findLast(`java.util.stream.DoubleStream` stream)`

**Returns:** `java.util.OptionalDouble`

Returns the last element of the specified stream, or `OptionalDouble.empty` if the stream
 is empty.

 <p>Equivalent to `stream.reduce((a, b) -> b)`, but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 streams.
**See:** DoubleStream#findFirst()
@throws NullPointerException if the last element of the stream is null

