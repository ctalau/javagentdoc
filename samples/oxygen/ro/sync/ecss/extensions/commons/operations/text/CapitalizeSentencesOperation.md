# Class: `CapitalizeSentencesOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations.text`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.text.CapitalizeSentencesOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.text.FormSelectedTextOperation`](./FormSelectedTextOperation.md)

## Description

If the start character of a sentence is lower case, it will be changed to upper case.

## Fields

### `SENTENCE_DELIMITER_CHARS`

**Type:** `char[]`

## Constructors

### `<init>()`

## Methods

### `isDelimiterBeforeTextNode(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int contentOffset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `contentOffset` (`int`)

**Returns:** `boolean`

### `processTextContent(char[] charArray, boolean isDelimiterBefore)`

**Parameters:**
- `charArray` (`char[]`)
- `isDelimiterBefore` (`boolean`)

**Returns:** `char[]`

### `isSentenceDelimiter(char ch)`

**Parameters:**
- `ch` (`char`): The character that must be evaluated.

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

