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

**Returns:** [`com.google.common.hash.Funnel<java.lang.CharSequence>`](./Funnel.md)

If you need to use a specific encoding, use Funnels#stringFunnel(Charset) instead.

### `stringFunnel(java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.hash.Funnel<java.lang.CharSequence>`](./Funnel.md)

**Parameters:**
- `charset` (`java.nio.charset.Charset`)

### `integerFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Integer>`](./Funnel.md)

### `sequentialFunnel(com.google.common.hash.Funnel<E> elementFunnel)`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Iterable<? extends E>>`](./Funnel.md)

No separators are added between the elements.

**Parameters:**
- `elementFunnel` ([`com.google.common.hash.Funnel<E>`](./Funnel.md))

### `longFunnel()`

**Returns:** [`com.google.common.hash.Funnel<java.lang.Long>`](./Funnel.md)

### `asOutputStream(com.google.common.hash.PrimitiveSink sink)`

**Returns:** `java.io.OutputStream`

The close and flush methods of the returned OutputStream do nothing,
 and no method throws IOException.

**Parameters:**
- `sink` ([`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md))

