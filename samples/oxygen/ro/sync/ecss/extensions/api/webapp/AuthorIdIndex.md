# Interface: `AuthorIdIndex`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.AuthorIdIndex`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

## Methods

### `getObjectById(long id)`

**Returns:** `T`

**Parameters:**
- `id` (`long`): the id.

### `getId(T object)`

**Returns:** `long`

If this index has not assigned an id already to the given object, a unique
 id is assigned and returned.

**Parameters:**
- `object` (`T`): The object.

### `getIdIfExists(T object)`

**Returns:** `java.lang.Long`

**Parameters:**
- `object` (`T`): The object.

