# Interface: `ReviewController`

**Package:** [`ro.sync.ecss.extensions.api.webapp.review`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.review.ReviewController`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](../../AuthorChangeTrackingController.md), [`ro.sync.ecss.extensions.api.AuthorReviewerNameController`](../../AuthorReviewerNameController.md)

## Description

## Methods

### `toggleMarkAsDone(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

This state is also applied 
 to all its replies.
 The highlight can one of the following types: 
 

 - PersistentHighlightType#CHANGE_INSERT
 
 - PersistentHighlightType#CHANGE_DELETE
 
 - PersistentHighlightType#COMMENT
 
 

 For other types, this method does nothing.

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md)): The highlight to toggle the done state for.

**Returns:** `void`

### `addReply(java.lang.String replyComment, ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight parentHighlight)`

If the highlight is the last child of its parent, 
 the reply is added to the parent highlight instead.
 
 The parent highlight can one of the following types: 
 

 - PersistentHighlightType#CHANGE_INSERT
 
 - PersistentHighlightType#CHANGE_DELETE
 
 - PersistentHighlightType#COMMENT
 
 

 For other types, this method does not insert any reply or comment.
 

 When the first reply is added to a highlight, a new property is set to this highlight:
 AuthorPersistentHighlightConstants#COMMENT_ID.
 All its replies will have the AuthorPersistentHighlightConstants#COMMENT_PARENT_ID
 property set, with the same value as the id of the parent.

**Parameters:**
- `replyComment` (`java.lang.String`): The reply comment.
- `parentHighlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md)): The parent highlight.

**Returns:** `void`

### `addReply(java.util.Map<java.lang.String,java.lang.String> properties, ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight parentHighlight)`

The parent highlight can one of the following types: 
 

 - PersistentHighlightType#CHANGE_INSERT
 
 - PersistentHighlightType#CHANGE_DELETE
 
 - PersistentHighlightType#COMMENT
 
 

 For other types, this method does not insert any reply or comment.
 

 When the first reply is added to a highlight, a new property is set to this highlight:
 AuthorPersistentHighlightConstants#COMMENT_ID.
 All its replies will have the AuthorPersistentHighlightConstants#COMMENT_PARENT_ID
 property set, with the same value as the id of the parent.
 
 The AuthorPersistentHighlightConstants#COMMENT_PARENT_ID property in the given map is 
 ignored. The ID of the parent highlight is used instead.

**Parameters:**
- `properties` (`java.util.Map<java.lang.String,java.lang.String>`): The reply properties. See 
                      ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightConstants 
                      for properties that are meaningful in Oxygen.
- `parentHighlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md)): The parent highlight.

**Returns:** `void`

### `addComment(int startOffset, int endOffset, java.lang.String comment)`

An error message is reported if the 
 comment cannot be added.

**Parameters:**
- `startOffset` (`int`): The start offset of the marker (inclusive).
- `endOffset` (`int`): The end offset of the marker (exclusive).
- `comment` (`java.lang.String`): The comment of the marker.

**Returns:** `void`

### `addCommentOnSelection(int startOffset, int endOffset, java.lang.String comment)`

It returns `false` if the comment 
 cannot be added.

**Parameters:**
- `startOffset` (`int`): The selection start offset.
- `endOffset` (`int`): Interval end offset. Inclusive
- `comment` (`java.lang.String`): The comment.

**Returns:** `boolean`

### `addPersistentMarker(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType type, int startOffset, int endOffset, java.util.Map<java.lang.String,java.lang.String> properties)`

It returns `false` if the comment 
 cannot be added.

**Parameters:**
- `type` (`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType`): The persistent highlight type (custom or comment)
- `startOffset` (`int`): The selection start offset.
- `endOffset` (`int`): Interval end offset. Inclusive
- `properties` (`java.util.Map<java.lang.String,java.lang.String>`): The comment properties. See 
                     ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightConstants 
                     for properties that are meaningful in Oxygen.

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md)

### `removeComment(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md)): The comment marker.

**Returns:** `void`

### `editComment(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight, java.lang.String newComment)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md)): The marker.
- `newComment` (`java.lang.String`): The new comment.

**Returns:** `void`

### `getAllHighlights()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`

### `getAuthorNumber(java.lang.String author)`

**Parameters:**
- `author` (`java.lang.String`): The name of the author.

**Returns:** `java.lang.Integer`

