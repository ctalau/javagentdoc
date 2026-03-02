# Class: `Funnels`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Funnels`

## Description

All implementations are serializable.

## Constructors

### `<init>()`

## Methods

### `byteArrayFunnel()`

**Returns:** [`com.google.common.hash.Funnel<byte[]>`](./Funnel.md)

### `unencodedCharsFunnel()`

If you need to use a specific encoding, use Funnels#stringFunnel(Charset) instead.

**Returns:** [`com.google.common.hash.Funnel<java.lang.CharSequence>`](./Funnel.md)

### `stringFunnel(Charset charset)`

**Parameters:**
- `charset` (`java.nio.charset.Charset`)

**Returns:** [`com.google.common.hash.Funnel<java.lang.CharSequence>`](./Funnel.md)

### `integerFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Integer>`](./Funnel.md)

### `sequentialFunnel(Funnel<E> elementFunnel)`

No separators are added between the elements.

**Parameters:**
- `elementFunnel` ([`com.google.common.hash.Funnel<E>`](./Funnel.md))

**Returns:** [`com.google.common.hash.Funnel<java.lang.Iterable<? extends E>>`](./Funnel.md)

### `longFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Long>`](./Funnel.md)

### `asOutputStream(PrimitiveSink sink)`

The close and flush methods of the returned OutputStream do nothing,
 and no method throws IOException.

**Parameters:**
- `sink` ([`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md))

**Returns:** `java.io.OutputStream`

