# Class: `ReviewsRenderingInformationProvider`

**Package:** [`ro.sync.ecss.extensions.api.review`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.review.ReviewsRenderingInformationProvider`

## Description

## Constructors

### `<init>()`

## Methods

### `getReviewRenderingInformation(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

The review entries are representations of Track Changes insert and delete highlights and review comment highlights in Author mode.

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md)): The Author persistent highlight. You can use the AuthorPersistentHighlight#getType() method to obtain its type.

**Returns:** [`ro.sync.ecss.extensions.api.review.AuthorReviewRenderingInformation`](./AuthorReviewRenderingInformation.md)

