# Class: `FindSimilarTopicsOperation`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.FindSimilarTopicsOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../api/AuthorOperation.md)

## Description

The search for similar topics is based on key words collected from the 
 <title>, <shortdesc>, <keyword> and <indexterm> elements.

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../api/ArgumentsMap.md))

**Returns:** `void`

