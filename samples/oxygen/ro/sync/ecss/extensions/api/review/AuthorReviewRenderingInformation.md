# Class: `AuthorReviewRenderingInformation`

**Package:** [`ro.sync.ecss.extensions.api.review`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.review.AuthorReviewRenderingInformation`

## Description

## Constructors

### `<init>()`

## Methods

### `getAuthor()`

**Returns:** `java.lang.String`

### `getTimestamp()`

**Returns:** `long`

### `getTooltip()`

By default this shows the review creation or modification time.

**Returns:** `java.lang.String`

### `getComment(int limit)`

This could be a part of the real comment stored in the change or persistent highlight.

**Parameters:**
- `limit` (`int`): the suggested text limit (in characters).

**Returns:** `java.lang.String`

### `getContentFromTarget(int limit)`

This will be presented in the content part of the review entry. Note that it is not
 necessary to provide the entire content related to the review entry.

**Parameters:**
- `limit` (`int`): the suggested text limit (in characters).

**Returns:** `java.lang.String`

### `getColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

### `getIconPath()`

**Returns:** `java.lang.String`

