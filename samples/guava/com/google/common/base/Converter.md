# Class: `Converter`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Converter`

**Implements:** [`com.google.common.base.Function<A,B>`](./Function.md)

## Type Parameters

- `A` extends `java.lang.Object`
- `B` extends `java.lang.Object`

## Description

Invertibility

 
The reverse operation **may** be a strict *inverse* (meaning that 
 converter.reverse().convert(converter.convert(a)).equals(a) is always true). However, it is very
 common (perhaps *more* common) for round-trip conversion to be *lossy*. Consider an
 example round-trip using com.google.common.primitives.Doubles#stringConverter:

 

   - stringConverter().convert("1.00") returns the Double value 1.0
   - stringConverter().reverse().convert(1.0) returns the string "1.0" --
       *not* the same string ("1.00") we started with
 


 
Note that it should still be the case that the round-tripped and original objects are
 *similar*.

 Nullability

 
A converter always converts null to null and non-null references to non-null
 references. It would not make sense to consider null and a non-null reference to be
 "different representations of the same information", since one is distinguishable from
 *missing* information and the other is not. The #convert method handles this null
 behavior for all converters; implementations of #doForward and #doBackward are
 guaranteed to never be passed null, and must never return null.

 Common ways to use

 
Getting a converter:

 

   - Use a provided converter implementation, such as Enums#stringConverter, Ints.stringConverter or the reverse views of these.
   - Convert between specific preset values using Maps.asConverter. For example, use this to
       create a "fake" converter for a unit test. It is unnecessary (and confusing) to *mock*
       the Converter type using a mocking framework.
   - Extend this class and implement its #doForward and #doBackward methods.
   - **Java 8 users:** you may prefer to pass two lambda expressions or method references to
       the from factory method.
 


 
Using a converter:

 

   - Convert one instance in the "forward" direction using converter.convert(a).
   - Convert multiple instances "forward" using converter.convertAll(as).
   - Convert in the "backward" direction using converter.reverse().convert(b) or 
       converter.reverse().convertAll(bs).
   - Use converter or converter.reverse() anywhere a java.util.function.Function is accepted (for example Stream.map).
   - **Do not** call #doForward or #doBackward directly; these exist only to
       be overridden.
 


 Example

 

```

   return new Converter<Integer, String>() {
     protected String doForward(Integer i) {
       return Integer.toHexString(i);
     }

     protected Integer doBackward(String s) {
       return parseUnsignedInt(s, 16);
     }
   };
```


 
An alternative using Java 8:

 

```

 return Converter.from(
     Integer::toHexString,
     s -> parseUnsignedInt(s, 16));
 
```

## Fields

### `handleNullAutomatically`

**Type:** `boolean`

### `reverse`

**Type:** [`com.google.common.base.Converter<B,A>`](./Converter.md)

## Constructors

### `<init>()`

### `<init>(boolean handleNullAutomatically)`

**Parameters:**
- `handleNullAutomatically` (`boolean`)

## Methods

### `doForward(A a)`

**Returns:** `B`

If a cannot be
 converted, an unchecked exception (such as IllegalArgumentException) should be thrown.

**Parameters:**
- `a` (`A`): the instance to convert; will never be null

### `doBackward(B b)`

**Returns:** `A`

If b cannot be
 converted, an unchecked exception (such as IllegalArgumentException) should be thrown.

**Parameters:**
- `b` (`B`): the instance to convert; will never be null

### `convert(A a)`

**Returns:** `B`

**Parameters:**
- `a` (`A`)

### `correctedDoForward(A a)`

**Returns:** `B`

**Parameters:**
- `a` (`A`)

### `correctedDoBackward(B b)`

**Returns:** `A`

**Parameters:**
- `b` (`B`)

### `unsafeDoForward(A a)`

**Returns:** `B`

**Parameters:**
- `a` (`A`)

### `unsafeDoBackward(B b)`

**Returns:** `A`

**Parameters:**
- `b` (`B`)

### `convertAll(java.lang.Iterable<? extends A> fromIterable)`

**Returns:** `java.lang.Iterable<B>`

The
 conversion is done lazily.

 
The returned iterable's iterator supports remove() if the input iterator does. After
 a successful remove() call, fromIterable no longer contains the corresponding
 element.

**Parameters:**
- `fromIterable` (`java.lang.Iterable<? extends A>`)

### `reverse()`

**Returns:** [`com.google.common.base.Converter<B,A>`](./Converter.md)

The returned converter is serializable if this converter is.

 
**Note:** you should not override this method. It is non-final for legacy reasons.

### `andThen(com.google.common.base.Converter<B,C> secondConverter)`

**Returns:** [`com.google.common.base.Converter<A,C>`](./Converter.md)

Its reverse method applies the converters in reverse order.

 
The returned converter is serializable if this converter and secondConverter
 are.

**Parameters:**
- `secondConverter` ([`com.google.common.base.Converter<B,C>`](./Converter.md))

### `doAndThen(com.google.common.base.Converter<B,C> secondConverter)`

**Returns:** [`com.google.common.base.Converter<A,C>`](./Converter.md)

**Parameters:**
- `secondConverter` ([`com.google.common.base.Converter<B,C>`](./Converter.md))

### `apply(A a)`

**Returns:** `B`

**Parameters:**
- `a` (`A`)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

Most implementations will have no reason to override the behavior of Object#equals.
 However, an implementation may also choose to return true whenever object is a
 Converter that it considers *interchangeable* with this one. "Interchangeable"
 *typically* means that Objects.equal(this.convert(a), that.convert(a)) is true for
 all a of type A (and similarly for reverse). Note that a false
 result from this method does not imply that the converters are known *not* to be
 interchangeable.

**Parameters:**
- `object` (`java.lang.Object`)

### `from(com.google.common.base.Function<? super A,? extends B> forwardFunction, com.google.common.base.Function<? super B,? extends A> backwardFunction)`

**Returns:** [`com.google.common.base.Converter<A,B>`](./Converter.md)

This is useful if the
 function instances already exist, or so that you can supply lambda expressions. If those
 circumstances don't apply, you probably don't need to use this; subclass Converter and
 implement its #doForward and #doBackward methods directly.

 
These functions will never be passed null and must not under any circumstances
 return null. If a value cannot be converted, the function should throw an unchecked
 exception (typically, but not necessarily, IllegalArgumentException).

 
The returned converter is serializable if both provided functions are.

**Parameters:**
- `forwardFunction` ([`com.google.common.base.Function<? super A,? extends B>`](./Function.md))
- `backwardFunction` ([`com.google.common.base.Function<? super B,? extends A>`](./Function.md))

### `identity()`

**Returns:** [`com.google.common.base.Converter<T,T>`](./Converter.md)

