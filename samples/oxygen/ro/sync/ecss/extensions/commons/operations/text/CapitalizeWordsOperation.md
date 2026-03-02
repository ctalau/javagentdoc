# Class: `CapitalizeWordsOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations.text`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.text.CapitalizeWordsOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.text.FormSelectedTextOperation`](./FormSelectedTextOperation.md)

## Description

If the start character of a word is lower case, it will be changed to upper case.

## Constructors

### `<init>()`

## Methods

### `isDelimiterBeforeTextNode(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int contentOffset)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `contentOffset` (`int`)

### `processTextContent(char[] charArray, boolean isDelimiterBefore)`

**Returns:** `char[]`

**Parameters:**
- `charArray` (`char[]`)
- `isDelimiterBefore` (`boolean`)

### `getDescription()`

**Returns:** `java.lang.String`

