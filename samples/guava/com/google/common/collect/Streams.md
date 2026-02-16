# Class: `Streams`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Streams`

## Description

Static utility methods related to {@code Stream} instances.
@since 21.0

## Constructors

### `<init>()`

## Methods

### `stream(`java.lang.Iterable<T>` iterable)`

**Returns:** [`java.util.stream.Stream<T>`](../../../../java/util/stream/Stream.md)

Returns a sequential {@link Stream} of the contents of {@code iterable}, delegating to {@link Collection#stream} if possible.

### `stream([`java.util.Collection<T>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.stream.Stream<T>`](../../../../java/util/stream/Stream.md)

Returns {@link Collection#stream}.
@deprecated There is no reason to use this; just invoke {@code collection.stream()} directly.

### `stream([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`java.util.stream.Stream<T>`](../../../../java/util/stream/Stream.md)

Returns a sequential {@link Stream} of the remaining contents of {@code iterator}. Do not use
 {@code iterator} directly after passing it to this method.

### `stream([`com.google.common.base.Optional<T>`](../base/Optional.md) optional)`

**Returns:** [`java.util.stream.Stream<T>`](../../../../java/util/stream/Stream.md)

If a value is present in {@code optional}, returns a stream containing only that element,
 otherwise returns an empty stream.

### `stream([`java.util.Optional<T>`](../../../../java/util/Optional.md) optional)`

**Returns:** [`java.util.stream.Stream<T>`](../../../../java/util/stream/Stream.md)

If a value is present in {@code optional}, returns a stream containing only that element,
 otherwise returns an empty stream.

 <p><b>Java 9 users:</b> use {@code optional.stream()} instead.

### `stream([`java.util.OptionalInt`](../../../../java/util/OptionalInt.md) optional)`

**Returns:** [`java.util.stream.IntStream`](../../../../java/util/stream/IntStream.md)

If a value is present in {@code optional}, returns a stream containing only that element,
 otherwise returns an empty stream.

 <p><b>Java 9 users:</b> use {@code optional.stream()} instead.

### `stream([`java.util.OptionalLong`](../../../../java/util/OptionalLong.md) optional)`

**Returns:** [`java.util.stream.LongStream`](../../../../java/util/stream/LongStream.md)

If a value is present in {@code optional}, returns a stream containing only that element,
 otherwise returns an empty stream.

 <p><b>Java 9 users:</b> use {@code optional.stream()} instead.

### `stream([`java.util.OptionalDouble`](../../../../java/util/OptionalDouble.md) optional)`

**Returns:** [`java.util.stream.DoubleStream`](../../../../java/util/stream/DoubleStream.md)

If a value is present in {@code optional}, returns a stream containing only that element,
 otherwise returns an empty stream.

 <p><b>Java 9 users:</b> use {@code optional.stream()} instead.

### `closeAll([`java.util.stream.BaseStream<?,?>[]`](../../../../java/util/stream/BaseStream.md) toClose)`

**Returns:** `void`

### `sneakyThrow(`java.lang.Throwable` t)`

**Returns:** `void`

Throws an undeclared checked exception.

### `concat([`java.util.stream.Stream<? extends T>[]`](../../../../java/util/stream/Stream.md) streams)`

**Returns:** [`java.util.stream.Stream<T>`](../../../../java/util/stream/Stream.md)

Returns a {@link Stream} containing the elements of the first stream, followed by the elements
 of the second stream, and so on.

 <p>This is equivalent to {@code Stream.of(streams).flatMap(stream -> stream)}, but the returned
 stream may perform better.
@see Stream#concat(Stream, Stream)

### `concat([`java.util.stream.IntStream[]`](../../../../java/util/stream/IntStream.md) streams)`

**Returns:** [`java.util.stream.IntStream`](../../../../java/util/stream/IntStream.md)

Returns an {@link IntStream} containing the elements of the first stream, followed by the
 elements of the second stream, and so on.

 <p>This is equivalent to {@code Stream.of(streams).flatMapToInt(stream -> stream)}, but the
 returned stream may perform better.
@see IntStream#concat(IntStream, IntStream)

### `concat([`java.util.stream.LongStream[]`](../../../../java/util/stream/LongStream.md) streams)`

**Returns:** [`java.util.stream.LongStream`](../../../../java/util/stream/LongStream.md)

Returns a {@link LongStream} containing the elements of the first stream, followed by the
 elements of the second stream, and so on.

 <p>This is equivalent to {@code Stream.of(streams).flatMapToLong(stream -> stream)}, but the
 returned stream may perform better.
@see LongStream#concat(LongStream, LongStream)

### `concat([`java.util.stream.DoubleStream[]`](../../../../java/util/stream/DoubleStream.md) streams)`

**Returns:** [`java.util.stream.DoubleStream`](../../../../java/util/stream/DoubleStream.md)

Returns a {@link DoubleStream} containing the elements of the first stream, followed by the
 elements of the second stream, and so on.

 <p>This is equivalent to {@code Stream.of(streams).flatMapToDouble(stream -> stream)}, but the
 returned stream may perform better.
@see DoubleStream#concat(DoubleStream, DoubleStream)

### `zip([`java.util.stream.Stream<A>`](../../../../java/util/stream/Stream.md) streamA, [`java.util.stream.Stream<B>`](../../../../java/util/stream/Stream.md) streamB, [`java.util.function.BiFunction<? super A,? super B,R>`](../../../../java/util/function/BiFunction.md) function)`

**Returns:** [`java.util.stream.Stream<R>`](../../../../java/util/stream/Stream.md)

Returns a stream in which each element is the result of passing the corresponding element of
 each of {@code streamA} and {@code streamB} to {@code function}.

 <p>For example:

 <pre>{@code
 Streams.zip(
   Stream.of("foo1", "foo2", "foo3"),
   Stream.of("bar1", "bar2"),
   (arg1, arg2) -> arg1 + ":" + arg2)
 }</pre>

 <p>will return {@code Stream.of("foo1:bar1", "foo2:bar2")}.

 <p>The resulting stream will only be as long as the shorter of the two input streams; if one
 stream is longer, its extra elements will be ignored.

 <p>Note that if you are calling {@link Stream#forEach} on the resulting stream, you might want
 to consider using {@link #forEachPair} instead of this method.

 <p><b>Performance note:</b> The resulting stream is not <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>.
 This may harm parallel performance.

### `forEachPair([`java.util.stream.Stream<A>`](../../../../java/util/stream/Stream.md) streamA, [`java.util.stream.Stream<B>`](../../../../java/util/stream/Stream.md) streamB, [`java.util.function.BiConsumer<? super A,? super B>`](../../../../java/util/function/BiConsumer.md) consumer)`

**Returns:** `void`

Invokes {@code consumer} once for each pair of <i>corresponding</i> elements in {@code streamA}
 and {@code streamB}. If one stream is longer than the other, the extra elements are silently
 ignored. Elements passed to the consumer are guaranteed to come from the same position in their
 respective source streams. For example:

 <pre>{@code
 Streams.forEachPair(
   Stream.of("foo1", "foo2", "foo3"),
   Stream.of("bar1", "bar2"),
   (arg1, arg2) -> System.out.println(arg1 + ":" + arg2)
 }</pre>

 <p>will print:

 <pre>{@code
 foo1:bar1
 foo2:bar2
 }</pre>

 <p><b>Warning:</b> If either supplied stream is a parallel stream, the same correspondence
 between elements will be made, but the order in which those pairs of elements are passed to the
 consumer is <i>not</i> defined.

 <p>Note that many usages of this method can be replaced with simpler calls to {@link #zip}.
 This method behaves equivalently to {@linkplain #zip zipping} the stream elements into
 temporary pair objects and then using {@link Stream#forEach} on that stream.
@since 22.0

### `mapWithIndex([`java.util.stream.Stream<T>`](../../../../java/util/stream/Stream.md) stream, [`com.google.common.collect.Streams.FunctionWithIndex<? super T,? extends R>`](Streams/FunctionWithIndex.md) function)`

**Returns:** [`java.util.stream.Stream<R>`](../../../../java/util/stream/Stream.md)

Returns a stream consisting of the results of applying the given function to the elements of
 {@code stream} and their indices in the stream. For example,

 <pre>{@code
 mapWithIndex(
     Stream.of("a", "b", "c"),
     (e, index) -> index + ":" + e)
 }</pre>

 <p>would return {@code Stream.of("0:a", "1:b", "2:c")}.

 <p>The resulting stream is <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 if and only if {@code stream} was efficiently splittable and its underlying spliterator
 reported {@link Spliterator#SUBSIZED}. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 <p>The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

### `mapWithIndex([`java.util.stream.IntStream`](../../../../java/util/stream/IntStream.md) stream, [`com.google.common.collect.Streams.IntFunctionWithIndex<R>`](Streams/IntFunctionWithIndex.md) function)`

**Returns:** [`java.util.stream.Stream<R>`](../../../../java/util/stream/Stream.md)

Returns a stream consisting of the results of applying the given function to the elements of
 {@code stream} and their indexes in the stream. For example,

 <pre>{@code
 mapWithIndex(
     IntStream.of(10, 11, 12),
     (e, index) -> index + ":" + e)
 }</pre>

 <p>...would return {@code Stream.of("0:10", "1:11", "2:12")}.

 <p>The resulting stream is <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 if and only if {@code stream} was efficiently splittable and its underlying spliterator
 reported {@link Spliterator#SUBSIZED}. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 <p>The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

### `mapWithIndex([`java.util.stream.LongStream`](../../../../java/util/stream/LongStream.md) stream, [`com.google.common.collect.Streams.LongFunctionWithIndex<R>`](Streams/LongFunctionWithIndex.md) function)`

**Returns:** [`java.util.stream.Stream<R>`](../../../../java/util/stream/Stream.md)

Returns a stream consisting of the results of applying the given function to the elements of
 {@code stream} and their indexes in the stream. For example,

 <pre>{@code
 mapWithIndex(
     LongStream.of(10, 11, 12),
     (e, index) -> index + ":" + e)
 }</pre>

 <p>...would return {@code Stream.of("0:10", "1:11", "2:12")}.

 <p>The resulting stream is <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 if and only if {@code stream} was efficiently splittable and its underlying spliterator
 reported {@link Spliterator#SUBSIZED}. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 <p>The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

### `mapWithIndex([`java.util.stream.DoubleStream`](../../../../java/util/stream/DoubleStream.md) stream, [`com.google.common.collect.Streams.DoubleFunctionWithIndex<R>`](Streams/DoubleFunctionWithIndex.md) function)`

**Returns:** [`java.util.stream.Stream<R>`](../../../../java/util/stream/Stream.md)

Returns a stream consisting of the results of applying the given function to the elements of
 {@code stream} and their indexes in the stream. For example,

 <pre>{@code
 mapWithIndex(
     DoubleStream.of(0.0, 1.0, 2.0)
     (e, index) -> index + ":" + e)
 }</pre>

 <p>...would return {@code Stream.of("0:0.0", "1:1.0", "2:2.0")}.

 <p>The resulting stream is <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 if and only if {@code stream} was efficiently splittable and its underlying spliterator
 reported {@link Spliterator#SUBSIZED}. This is generally the case if the underlying stream
 comes from a data structure supporting efficient indexed random access, typically an array or
 list.

 <p>The order of the resulting stream is defined if and only if the order of the original stream
 was defined.

### `findLast([`java.util.stream.Stream<T>`](../../../../java/util/stream/Stream.md) stream)`

**Returns:** [`java.util.Optional<T>`](../../../../java/util/Optional.md)

Returns the last element of the specified stream, or {@link java.util.Optional#empty} if the
 stream is empty.

 <p>Equivalent to {@code stream.reduce((a, b) -> b)}, but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 streams.

 <p>If the stream has nondeterministic order, this has equivalent semantics to {@link Stream#findAny} (which you might as well use).
@see Stream#findFirst()
@throws NullPointerException if the last element of the stream is null

### `findLast([`java.util.stream.IntStream`](../../../../java/util/stream/IntStream.md) stream)`

**Returns:** [`java.util.OptionalInt`](../../../../java/util/OptionalInt.md)

Returns the last element of the specified stream, or {@link OptionalInt#empty} if the stream is
 empty.

 <p>Equivalent to {@code stream.reduce((a, b) -> b)}, but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 streams.
@see IntStream#findFirst()
@throws NullPointerException if the last element of the stream is null

### `findLast([`java.util.stream.LongStream`](../../../../java/util/stream/LongStream.md) stream)`

**Returns:** [`java.util.OptionalLong`](../../../../java/util/OptionalLong.md)

Returns the last element of the specified stream, or {@link OptionalLong#empty} if the stream
 is empty.

 <p>Equivalent to {@code stream.reduce((a, b) -> b)}, but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 streams.
@see LongStream#findFirst()
@throws NullPointerException if the last element of the stream is null

### `findLast([`java.util.stream.DoubleStream`](../../../../java/util/stream/DoubleStream.md) stream)`

**Returns:** [`java.util.OptionalDouble`](../../../../java/util/OptionalDouble.md)

Returns the last element of the specified stream, or {@link OptionalDouble#empty} if the stream
 is empty.

 <p>Equivalent to {@code stream.reduce((a, b) -> b)}, but may perform significantly better. This
 method's runtime will be between O(log n) and O(n), performing better on <a href="http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html">efficiently splittable</a>
 streams.
@see DoubleStream#findFirst()
@throws NullPointerException if the last element of the stream is null

