# Class: `Funnels`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Funnels`

## Description

Funnels for common types. All implementations are serializable.
@author Dimitris Andreou
@since 11.0

## Constructors

### `<init>()`

## Methods

### `byteArrayFunnel()`

**Returns:** [`com.google.common.hash.Funnel<byte[]>`](./Funnel.md)

Returns a funnel that extracts the bytes from a {@code byte} array.

### `unencodedCharsFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.CharSequence>`](./Funnel.md)

Returns a funnel that extracts the characters from a {@code CharSequence}, a character at a
 time, without performing any encoding. If you need to use a specific encoding, use {@link Funnels#stringFunnel(Charset)} instead.
@since 15.0 (since 11.0 as {@code Funnels.stringFunnel()}.

### `stringFunnel([`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`com.google.common.hash.Funnel<java.lang.CharSequence>`](./Funnel.md)

Returns a funnel that encodes the characters of a {@code CharSequence} with the specified
 {@code Charset}.
@since 15.0

### `integerFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Integer>`](./Funnel.md)

Returns a funnel for integers.
@since 13.0

### `sequentialFunnel([`com.google.common.hash.Funnel<E>`](./Funnel.md) elementFunnel)`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Iterable<? extends E>>`](./Funnel>.md)

Returns a funnel that processes an {@code Iterable} by funneling its elements in iteration
 order with the specified funnel. No separators are added between the elements.
@since 15.0

### `longFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Long>`](./Funnel.md)

Returns a funnel for longs.
@since 13.0

### `asOutputStream([`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md) sink)`

**Returns:** [`java.io.OutputStream`](../../../../java/io/OutputStream.md)

Wraps a {@code PrimitiveSink} as an {@link OutputStream}, so it is easy to {@link Funnel#funnel funnel} an object to a {@code PrimitiveSink} if there is already a way to write the contents of
 the object to an {@code OutputStream}.

 <p>The {@code close} and {@code flush} methods of the returned {@code OutputStream} do nothing,
 and no method throws {@code IOException}.
@since 13.0

