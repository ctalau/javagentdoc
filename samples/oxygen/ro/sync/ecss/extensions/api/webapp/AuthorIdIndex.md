# Interface: `AuthorIdIndex`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.AuthorIdIndex`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

## Methods

### `getObjectById(`long` id)`

**Returns:** `T`

### `getId(`T` object)`

**Returns:** `long`

If this index has not assigned an id already to the given object, a unique
 id is assigned and returned.

### `getIdIfExists(`T` object)`

**Returns:** `java.lang.Long`

