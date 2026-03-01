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

**Returns:** `java.lang.String`

By default this shows the review creation or modification time.

### `getComment(`int` limit)`

**Returns:** `java.lang.String`

This could be a part of the real comment stored in the change or persistent highlight.

### `getContentFromTarget(`int` limit)`

**Returns:** `java.lang.String`

This will be presented in the content part of the review entry. Note that it is not
 necessary to provide the entire content related to the review entry.

### `getColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

### `getIconPath()`

**Returns:** `java.lang.String`

