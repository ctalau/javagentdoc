# Class: `Funnels`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Funnels`

## Description

Funnels for common types. All implementations are serializable.
**Author:** Dimitris Andreou
**Since:** 11.0

## Constructors

### `<init>()`

## Methods

### `byteArrayFunnel()`

**Returns:** [`com.google.common.hash.Funnel<byte[]>`](./Funnel.md)

Returns a funnel that extracts the bytes from a `byte` array.

### `unencodedCharsFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.CharSequence>`](./Funnel.md)

Returns a funnel that extracts the characters from a `CharSequence`, a character at a
 time, without performing any encoding. If you need to use a specific encoding, use `Funnels.stringFunnel(Charset)` instead.
**Since:** 15.0 (since 11.0 as `Funnels.stringFunnel()`.

### `stringFunnel(`java.nio.charset.Charset` charset)`

**Returns:** [`com.google.common.hash.Funnel<java.lang.CharSequence>`](./Funnel.md)

Returns a funnel that encodes the characters of a `CharSequence` with the specified
 `Charset`.
**Since:** 15.0

### `integerFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Integer>`](./Funnel.md)

Returns a funnel for integers.
**Since:** 13.0

### `sequentialFunnel([`com.google.common.hash.Funnel<E>`](./Funnel.md) elementFunnel)`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Iterable<? extends E>>`](./Funnel>.md)

Returns a funnel that processes an `Iterable` by funneling its elements in iteration
 order with the specified funnel. No separators are added between the elements.
**Since:** 15.0

### `longFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Long>`](./Funnel.md)

Returns a funnel for longs.
**Since:** 13.0

### `asOutputStream([`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md) sink)`

**Returns:** `java.io.OutputStream`

Wraps a `PrimitiveSink` as an `OutputStream`, so it is easy to `Funnel.funnel funnel` an object to a `PrimitiveSink` if there is already a way to write the contents of
 the object to an `OutputStream`.

 <p>The `close` and `flush` methods of the returned `OutputStream` do nothing,
 and no method throws `IOException`.
**Since:** 13.0

