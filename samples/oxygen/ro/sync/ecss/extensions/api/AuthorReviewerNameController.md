# Interface: `AuthorReviewerNameController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorReviewerNameController`

## Description

## Methods

### `setReviewerAuthorName(java.lang.String authorName)`

By default the author name specified in the Oxygen Preferences is used 
 for serialization.

**Parameters:**
- `authorName` (`java.lang.String`): The reviewer author name. 
   If set to `null`, the default author name (as set in the Oxygen Preferences) 
   will be used in Change Tracking and Comments serialization.

**Returns:** `void`

### `getReviewerAuthorName()`

By default, the reviewer author name is the author name specified in the Oxygen Preferences but it
 can be changed by using #setReviewerAuthorName(String).

**Returns:** `java.lang.String`

