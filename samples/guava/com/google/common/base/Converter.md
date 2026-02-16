# Class: `Converter`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Converter`

**Implements:** [`com.google.common.base.Function<A,B>`](./Function.md)

## Type Parameters

- `A` extends `java.lang.Object`
- `B` extends `java.lang.Object`

## Description

A function from `A` to `B` with an associated <i>reverse</i> function from `B`
 to `A`; used for converting back and forth between <i>different representations of the same
 information</i>.

 <h3>Invertibility</h3>

 <p>The reverse operation <b>may</b> be a strict <i>inverse</i> (meaning that `converter.reverse().convert(converter.convert(a)).equals(a)` is always true). However, it is very
 common (perhaps <i>more</i> common) for round-trip conversion to be <i>lossy</i>. Consider an
 example round-trip using `com.google.common.primitives.Doubles.stringConverter`:

 <ol>
   <li>`stringConverter().convert("1.00")` returns the `Double` value `1.0`
   <li>`stringConverter().reverse().convert(1.0)` returns the string `"1.0"` --
       <i>not</i> the same string (`"1.00"`) we started with
 </ol>

 <p>Note that it should still be the case that the round-tripped and original objects are
 <i>similar</i>.

 <h3>Nullability</h3>

 <p>A converter always converts `null` to `null` and non-null references to non-null
 references. It would not make sense to consider `null` and a non-null reference to be
 "different representations of the same information", since one is distinguishable from
 <i>missing</i> information and the other is not. The `convert` method handles this null
 behavior for all converters; implementations of `doForward` and `doBackward` are
 guaranteed to never be passed `null`, and must never return `null`.

 <h3>Common ways to use</h3>

 <p>Getting a converter:

 <ul>
   <li>Use a provided converter implementation, such as `Enums.stringConverter`, `com.google.common.primitives.Ints.stringConverter Ints.stringConverter` or the reverse views of these.
   <li>Convert between specific preset values using `com.google.common.collect.Maps.asConverter Maps.asConverter`. For example, use this to
       create a "fake" converter for a unit test. It is unnecessary (and confusing) to <i>mock</i>
       the `Converter` type using a mocking framework.
   <li>Extend this class and implement its `doForward` and `doBackward` methods.
   <li><b>Java 8 users:</b> you may prefer to pass two lambda expressions or method references to
       the `from from` factory method.
 </ul>

 <p>Using a converter:

 <ul>
   <li>Convert one instance in the "forward" direction using `converter.convert(a)`.
   <li>Convert multiple instances "forward" using `converter.convertAll(as)`.
   <li>Convert in the "backward" direction using `converter.reverse().convert(b)` or `converter.reverse().convertAll(bs)`.
   <li>Use `converter` or `converter.reverse()` anywhere a `java.util.function.Function` is accepted (for example `java.util.stream.Stream.map Stream.map`).
   <li><b>Do not</b> call `doForward` or `doBackward` directly; these exist only to
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

 <pre>`return Converter.from(
     Integer::toHexString,
     s -> parseUnsignedInt(s, 16));
 `</pre>
**Author:** Mike Ward
**Author:** Kurt Alfred Kluever
**Author:** Gregory Kick
**Since:** 16.0

## Fields

### `handleNullAutomatically`

**Type:** `boolean`

### `reverse`

**Type:** [`com.google.common.base.Converter<B,A>`](./Converter.md)

## Constructors

### `<init>()`

Constructor for use by subclasses.

### `<init>(`boolean` handleNullAutomatically)`

Constructor used only by `LegacyConverter` to suspend automatic null-handling.

## Methods

### `doForward(`A` a)`

**Returns:** `B`

Returns a representation of `a` as an instance of type `B`. If `a` cannot be
 converted, an unchecked exception (such as `IllegalArgumentException`) should be thrown.
@param a the instance to convert; will never be null
@return the converted instance; <b>must not</b> be null

### `doBackward(`B` b)`

**Returns:** `A`

Returns a representation of `b` as an instance of type `A`. If `b` cannot be
 converted, an unchecked exception (such as `IllegalArgumentException`) should be thrown.
@param b the instance to convert; will never be null
@return the converted instance; <b>must not</b> be null
@throws UnsupportedOperationException if backward conversion is not implemented; this should be
     very rare. Note that if backward conversion is not only unimplemented but
     unimplement<i>able</i> (for example, consider a `Converter<Chicken, ChickenNugget>`),
     then this is not logically a `Converter` at all, and should just implement `Function`.

### `convert(`A` a)`

**Returns:** `B`

Returns a representation of `a` as an instance of type `B`.
@return the converted value; is null <i>if and only if</i> `a` is null

### `correctedDoForward(`A` a)`

**Returns:** `B`

### `correctedDoBackward(`B` b)`

**Returns:** `A`

### `unsafeDoForward(`A` a)`

**Returns:** `B`

### `unsafeDoBackward(`B` b)`

**Returns:** `A`

### `convertAll(`java.lang.Iterable<? extends A>` fromIterable)`

**Returns:** `java.lang.Iterable<B>`

Returns an iterable that applies `convert` to each element of `fromIterable`. The
 conversion is done lazily.

 <p>The returned iterable's iterator supports `remove()` if the input iterator does. After
 a successful `remove()` call, `fromIterable` no longer contains the corresponding
 element.

### `reverse()`

**Returns:** [`com.google.common.base.Converter<B,A>`](./Converter.md)

Returns the reversed view of this converter, which converts `this.convert(a)` back to a
 value roughly equivalent to `a`.

 <p>The returned converter is serializable if `this` converter is.

 <p><b>Note:</b> you should not override this method. It is non-final for legacy reasons.

### `andThen([`com.google.common.base.Converter<B,C>`](./Converter.md) secondConverter)`

**Returns:** [`com.google.common.base.Converter<A,C>`](./Converter.md)

Returns a converter whose `convert` method applies `secondConverter` to the result
 of this converter. Its `reverse` method applies the converters in reverse order.

 <p>The returned converter is serializable if `this` converter and `secondConverter`
 are.

### `doAndThen([`com.google.common.base.Converter<B,C>`](./Converter.md) secondConverter)`

**Returns:** [`com.google.common.base.Converter<A,C>`](./Converter.md)

Package-private non-final implementation of andThen() so only we can override it.

### `apply(`A` a)`

**Returns:** `B`

**Deprecated:**Provided to satisfy the `Function` interface; use `convert` instead.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Indicates whether another object is equal to this converter.

 <p>Most implementations will have no reason to override the behavior of `Object.equals`.
 However, an implementation may also choose to return `true` whenever `object` is a
 `Converter` that it considers <i>interchangeable</i> with this one. "Interchangeable"
 <i>typically</i> means that `Objects.equal(this.convert(a), that.convert(a))` is true for
 all `a` of type `A` (and similarly for `reverse`). Note that a `false`
 result from this method does not imply that the converters are known <i>not</i> to be
 interchangeable.

### `from([`com.google.common.base.Function<? super A,? extends B>`](./Function.md) forwardFunction, [`com.google.common.base.Function<? super B,? extends A>`](./Function.md) backwardFunction)`

**Returns:** [`com.google.common.base.Converter<A,B>`](./Converter.md)

Returns a converter based on separate forward and backward functions. This is useful if the
 function instances already exist, or so that you can supply lambda expressions. If those
 circumstances don't apply, you probably don't need to use this; subclass `Converter` and
 implement its `doForward` and `doBackward` methods directly.

 <p>These functions will never be passed `null` and must not under any circumstances
 return `null`. If a value cannot be converted, the function should throw an unchecked
 exception (typically, but not necessarily, `IllegalArgumentException`).

 <p>The returned converter is serializable if both provided functions are.
**Since:** 17.0

### `identity()`

**Returns:** [`com.google.common.base.Converter<T,T>`](./Converter.md)

Returns a serializable converter that always converts or reverses an object to itself.

