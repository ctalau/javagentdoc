# Interface: `AuthorReviewViewController`

**Package:** [`ro.sync.ecss.extensions.api.review`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.review.AuthorReviewViewController`

## Description

## Methods

### `setReviewsRenderingInformationProvider(ReviewsRenderingInformationProvider provider)`

The review entries are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.

**Parameters:**
- `provider` ([`ro.sync.ecss.extensions.api.review.ReviewsRenderingInformationProvider`](./ReviewsRenderingInformationProvider.md)): The highlights review rendering information provider.

**Returns:** `void`

### `addReviewActionsProvider(ReviewActionsProvider actionsProvider)`

**Parameters:**
- `actionsProvider` ([`ro.sync.ecss.extensions.api.review.ReviewActionsProvider`](./ReviewActionsProvider.md)): The review actions provider.

**Returns:** `void`

### `removeReviewActionsProvider(ReviewActionsProvider actionsProvider)`

**Parameters:**
- `actionsProvider` ([`ro.sync.ecss.extensions.api.review.ReviewActionsProvider`](./ReviewActionsProvider.md)): The review actions provider.

**Returns:** `void`

