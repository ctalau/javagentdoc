# Interface: `ReviewController`

**Package:** [`ro.sync.ecss.extensions.api.webapp.review`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.review.ReviewController`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](../../AuthorChangeTrackingController.md), [`ro.sync.ecss.extensions.api.AuthorReviewerNameController`](../../AuthorReviewerNameController.md)

## Description

## Methods

### `toggleMarkAsDone([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md) highlight)`

**Returns:** `void`

This state is also applied 
 to all its replies.
 The highlight can one of the following types: 
 

 - PersistentHighlightType#CHANGE_INSERT
 
 - PersistentHighlightType#CHANGE_DELETE
 
 - PersistentHighlightType#COMMENT
 
 

 For other types, this method does nothing.

### `addReply(`java.lang.String` replyComment, [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md) parentHighlight)`

**Returns:** `void`

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

### `addReply(`java.util.Map<java.lang.String,java.lang.String>` properties, [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md) parentHighlight)`

**Returns:** `void`

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

### `addComment(`int` startOffset, `int` endOffset, `java.lang.String` comment)`

**Returns:** `void`

An error message is reported if the 
 comment cannot be added.

### `addCommentOnSelection(`int` startOffset, `int` endOffset, `java.lang.String` comment)`

**Returns:** `boolean`

It returns `false` if the comment 
 cannot be added.

### `addPersistentMarker(`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType` type, `int` startOffset, `int` endOffset, `java.util.Map<java.lang.String,java.lang.String>` properties)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md)

It returns `false` if the comment 
 cannot be added.

### `removeComment([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md) highlight)`

**Returns:** `void`

### `editComment([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../../highlights/AuthorPersistentHighlight.md) highlight, `java.lang.String` newComment)`

**Returns:** `void`

### `getAllHighlights()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`

### `getAuthorNumber(`java.lang.String` author)`

**Returns:** `java.lang.Integer`

