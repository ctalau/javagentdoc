# Class: `CapitalizeWordsOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations.text`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.text.CapitalizeWordsOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.text.FormSelectedTextOperation`](./FormSelectedTextOperation.md)

## Description

If the start character of a word is lower case, it will be changed to upper case.

## Constructors

### `<init>()`

## Methods

### `isDelimiterBeforeTextNode(AuthorAccess authorAccess, int contentOffset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `contentOffset` (`int`)

**Returns:** `boolean`

### `processTextContent(char[] charArray, boolean isDelimiterBefore)`

**Parameters:**
- `charArray` (`char[]`)
- `isDelimiterBefore` (`boolean`)

**Returns:** `char[]`

### `getDescription()`

**Returns:** `java.lang.String`

