# Class: `Converter`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Converter`

**Implements:** [`com.google.common.base.Function<A,B>`](./Function.md)

## Type Parameters

- `A` extends `java.lang.Object`
- `B` extends `java.lang.Object`

## Description

A function from {@code A} to {@code B} with an associated <i>reverse</i> function from {@code B}
 to {@code A}; used for converting back and forth between <i>different representations of the same
 information</i>.

 <h3>Invertibility</h3>

 <p>The reverse operation <b>may</b> be a strict <i>inverse</i> (meaning that {@code
 converter.reverse().convert(converter.convert(a)).equals(a)} is always true). However, it is very
 common (perhaps <i>more</i> common) for round-trip conversion to be <i>lossy</i>. Consider an
 example round-trip using {@link com.google.common.primitives.Doubles#stringConverter}:

 <ol>
   <li>{@code stringConverter().convert("1.00")} returns the {@code Double} value {@code 1.0}
   <li>{@code stringConverter().reverse().convert(1.0)} returns the string {@code "1.0"} --
       <i>not</i> the same string ({@code "1.00"}) we started with
 </ol>

 <p>Note that it should still be the case that the round-tripped and original objects are
 <i>similar</i>.

 <h3>Nullability</h3>

 <p>A converter always converts {@code null} to {@code null} and non-null references to non-null
 references. It would not make sense to consider {@code null} and a non-null reference to be
 "different representations of the same information", since one is distinguishable from
 <i>missing</i> information and the other is not. The {@link #convert} method handles this null
 behavior for all converters; implementations of {@link #doForward} and {@link #doBackward} are
 guaranteed to never be passed {@code null}, and must never return {@code null}.

 <h3>Common ways to use</h3>

 <p>Getting a converter:

 <ul>
   <li>Use a provided converter implementation, such as {@link Enums#stringConverter}, {@link com.google.common.primitives.Ints#stringConverter Ints.stringConverter} or the {@linkplain #reverse reverse} views of these.
   <li>Convert between specific preset values using {@link com.google.common.collect.Maps#asConverter Maps.asConverter}. For example, use this to
       create a "fake" converter for a unit test. It is unnecessary (and confusing) to <i>mock</i>
       the {@code Converter} type using a mocking framework.
   <li>Extend this class and implement its {@link #doForward} and {@link #doBackward} methods.
   <li><b>Java 8 users:</b> you may prefer to pass two lambda expressions or method references to
       the {@link #from from} factory method.
 </ul>

 <p>Using a converter:

 <ul>
   <li>Convert one instance in the "forward" direction using {@code converter.convert(a)}.
   <li>Convert multiple instances "forward" using {@code converter.convertAll(as)}.
   <li>Convert in the "backward" direction using {@code converter.reverse().convert(b)} or {@code
       converter.reverse().convertAll(bs)}.
   <li>Use {@code converter} or {@code converter.reverse()} anywhere a {@link java.util.function.Function} is accepted (for example {@link java.util.stream.Stream#map Stream.map}).
   <li><b>Do not</b> call {@link #doForward} or {@link #doBackward} directly; these exist only to
       be overridden.
 </ul>

 <h3>Example</h3>

 <pre>
   return new Converter&lt;Integer, String&gt;() {
     protected String doForward(Integer i) {
       return Integer.toHexString(i);
     }

     protected Integer doBackward(String s) {
       return parseUnsignedInt(s, 16);
     }
   };</pre>

 <p>An alternative using Java 8:

 <pre>{@code
 return Converter.from(
     Integer::toHexString,
     s -> parseUnsignedInt(s, 16));
 }</pre>
@author Mike Ward
@author Kurt Alfred Kluever
@author Gregory Kick
@since 16.0

## Fields

### `handleNullAutomatically`

**Type:** `boolean`

### `reverse`

**Type:** [`com.google.common.base.Converter<B,A>`](./Converter.md)

## Constructors

### `<init>()`

Constructor for use by subclasses.

### `<init>(`boolean` handleNullAutomatically)`

Constructor used only by {@code LegacyConverter} to suspend automatic null-handling.

## Methods

### `doForward([`A`](A.md) a)`

**Returns:** [`B`](B.md)

Returns a representation of {@code a} as an instance of type {@code B}. If {@code a} cannot be
 converted, an unchecked exception (such as {@link IllegalArgumentException}) should be thrown.
@param a the instance to convert; will never be null
@return the converted instance; <b>must not</b> be null

### `doBackward([`B`](B.md) b)`

**Returns:** [`A`](A.md)

Returns a representation of {@code b} as an instance of type {@code A}. If {@code b} cannot be
 converted, an unchecked exception (such as {@link IllegalArgumentException}) should be thrown.
@param b the instance to convert; will never be null
@return the converted instance; <b>must not</b> be null
@throws UnsupportedOperationException if backward conversion is not implemented; this should be
     very rare. Note that if backward conversion is not only unimplemented but
     unimplement<i>able</i> (for example, consider a {@code Converter<Chicken, ChickenNugget>}),
     then this is not logically a {@code Converter} at all, and should just implement {@link Function}.

### `convert([`A`](A.md) a)`

**Returns:** [`B`](B.md)

Returns a representation of {@code a} as an instance of type {@code B}.
@return the converted value; is null <i>if and only if</i> {@code a} is null

### `correctedDoForward([`A`](A.md) a)`

**Returns:** [`B`](B.md)

### `correctedDoBackward([`B`](B.md) b)`

**Returns:** [`A`](A.md)

### `unsafeDoForward([`A`](A.md) a)`

**Returns:** [`B`](B.md)

### `unsafeDoBackward([`B`](B.md) b)`

**Returns:** [`A`](A.md)

### `convertAll(`java.lang.Iterable<? extends A>` fromIterable)`

**Returns:** `java.lang.Iterable<B>`

Returns an iterable that applies {@code convert} to each element of {@code fromIterable}. The
 conversion is done lazily.

 <p>The returned iterable's iterator supports {@code remove()} if the input iterator does. After
 a successful {@code remove()} call, {@code fromIterable} no longer contains the corresponding
 element.

### `reverse()`

**Returns:** [`com.google.common.base.Converter<B,A>`](./Converter.md)

Returns the reversed view of this converter, which converts {@code this.convert(a)} back to a
 value roughly equivalent to {@code a}.

 <p>The returned converter is serializable if {@code this} converter is.

 <p><b>Note:</b> you should not override this method. It is non-final for legacy reasons.

### `andThen([`com.google.common.base.Converter<B,C>`](./Converter.md) secondConverter)`

**Returns:** [`com.google.common.base.Converter<A,C>`](./Converter.md)

Returns a converter whose {@code convert} method applies {@code secondConverter} to the result
 of this converter. Its {@code reverse} method applies the converters in reverse order.

 <p>The returned converter is serializable if {@code this} converter and {@code secondConverter}
 are.

### `doAndThen([`com.google.common.base.Converter<B,C>`](./Converter.md) secondConverter)`

**Returns:** [`com.google.common.base.Converter<A,C>`](./Converter.md)

Package-private non-final implementation of andThen() so only we can override it.

### `apply([`A`](A.md) a)`

**Returns:** [`B`](B.md)

@deprecated Provided to satisfy the {@code Function} interface; use {@link #convert} instead.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Indicates whether another object is equal to this converter.

 <p>Most implementations will have no reason to override the behavior of {@link Object#equals}.
 However, an implementation may also choose to return {@code true} whenever {@code object} is a
 {@link Converter} that it considers <i>interchangeable</i> with this one. "Interchangeable"
 <i>typically</i> means that {@code Objects.equal(this.convert(a), that.convert(a))} is true for
 all {@code a} of type {@code A} (and similarly for {@code reverse}). Note that a {@code false}
 result from this method does not imply that the converters are known <i>not</i> to be
 interchangeable.

### `from([`com.google.common.base.Function<? super A,? extends B>`](./Function.md) forwardFunction, [`com.google.common.base.Function<? super B,? extends A>`](./Function.md) backwardFunction)`

**Returns:** [`com.google.common.base.Converter<A,B>`](./Converter.md)

Returns a converter based on separate forward and backward functions. This is useful if the
 function instances already exist, or so that you can supply lambda expressions. If those
 circumstances don't apply, you probably don't need to use this; subclass {@code Converter} and
 implement its {@link #doForward} and {@link #doBackward} methods directly.

 <p>These functions will never be passed {@code null} and must not under any circumstances
 return {@code null}. If a value cannot be converted, the function should throw an unchecked
 exception (typically, but not necessarily, {@link IllegalArgumentException}).

 <p>The returned converter is serializable if both provided functions are.
@since 17.0

### `identity()`

**Returns:** [`com.google.common.base.Converter<T,T>`](./Converter.md)

Returns a serializable converter that always converts or reverses an object to itself.

