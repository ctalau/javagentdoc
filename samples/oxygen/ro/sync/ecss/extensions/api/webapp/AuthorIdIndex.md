# Interface: `AuthorIdIndex`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.AuthorIdIndex`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

## Methods

### `getObjectById(long id)`

**Parameters:**
- `id` (`long`): the id.

**Returns:** `T`

### `getId(T object)`

If this index has not assigned an id already to the given object, a unique
 id is assigned and returned.

**Parameters:**
- `object` (`T`): The object.

**Returns:** `long`

### `getIdIfExists(T object)`

**Parameters:**
- `object` (`T`): The object.

**Returns:** `java.lang.Long`

