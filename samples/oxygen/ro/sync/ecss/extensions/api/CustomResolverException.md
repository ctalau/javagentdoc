# Class: `CustomResolverException`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.CustomResolverException`

**Extends:** `java.io.IOException`

## Description

It offers a possible solution
 to the user.

## Fields

### `errorResolver`

**Type:** [`ro.sync.ecss.extensions.api.ReferenceErrorResolver`](./ReferenceErrorResolver.md)

## Constructors

### `<init>(java.lang.String errorMessage, ro.sync.ecss.extensions.api.ReferenceErrorResolver errorResolver)`

**Parameters:**
- `errorMessage` (`java.lang.String`): The error message.
- `errorResolver` ([`ro.sync.ecss.extensions.api.ReferenceErrorResolver`](./ReferenceErrorResolver.md)): Can provide an error solution.

## Methods

### `getErrorResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.ReferenceErrorResolver`](./ReferenceErrorResolver.md)

