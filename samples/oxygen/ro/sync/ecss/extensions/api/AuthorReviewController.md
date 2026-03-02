# Interface: `AuthorReviewController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorReviewController`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](./AuthorChangeTrackingController.md), [`ro.sync.ecss.extensions.api.AuthorReviewerNameController`](./AuthorReviewerNameController.md)

## Description

## Methods

### `getAuthorCalloutsController()`

**Returns:** [`ro.sync.ecss.extensions.api.callouts.AuthorCalloutsController`](callouts/AuthorCalloutsController.md)

This controller can be used to check what types of callouts are presented in 
 Author mode. It also can be used to override the callouts display options 
 from Oxygen Preferences.

### `getAuthorReviewViewController()`

**Returns:** [`ro.sync.ecss.extensions.api.review.AuthorReviewViewController`](review/AuthorReviewViewController.md)

This controller can override review entries display options and contextual menu actions.

### `getCurrentTimestamp()`

**Returns:** `java.lang.String`

Form: `yyyyMMdd'T'HHmmssZ`

### `getReviewerAutoColor(java.lang.String reviewerAuthorName)`

**Returns:** `ro.sync.exml.view.graphics.Color`

It is used when in the Oxygen Preferences **Auto** coloring is set for the `Insert`, `Delete` or `Comment` reviews.

**Parameters:**
- `reviewerAuthorName` (`java.lang.String`): The reviewer author name.

### `setReviewRenderer(ro.sync.ecss.extensions.api.highlights.PersistentHighlightRenderer renderer)`

**Returns:** `void`

**Parameters:**
- `renderer` ([`ro.sync.ecss.extensions.api.highlights.PersistentHighlightRenderer`](highlights/PersistentHighlightRenderer.md)): the renderer used to customize painting for the review highlights.

### `getCommentHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](highlights/AuthorPersistentHighlight.md)

### `getCommentHighlights(int startOffset, int endOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](highlights/AuthorPersistentHighlight.md)

**Parameters:**
- `startOffset` (`int`): The start offset(inclusive).
- `endOffset` (`int`): The end offset (inclusive).

### `setPersistentHighlightProperties(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight, java.util.LinkedHashMap<java.lang.String,java.lang.String> properties)`

**Returns:** `void`

A copy of the initial properties can be obtained from AuthorPersistentHighlight#getClonedProperties()
 Please note that this method allows setting the properties of all persistent highlights, 
 whether the current author is the author of the highlight or not.
 
 The existing properties will be overwritten, excepting the ones that are specific to Oxygen XML 
 comments or track changes processing instructions, that cannot be changed. You can see the name of 
 these specific properties in AuthorPersistentHighlightConstants.

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)): The highlight.
- `properties` (`java.util.LinkedHashMap<java.lang.String,java.lang.String>`): name/value pairs which will get serialized to disk. 
 
Notes:

 1. Each property name must be a valid XML attribute name.

 2. Each property value will be escaped to be a valid XML attribute value.
 3. A `null` value means that the property will be removed.


### `removePersistentHighlightProperties(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight, java.util.List<java.lang.String> properties)`

**Returns:** `void`

A copy of the initial properties can be obtained from AuthorPersistentHighlight#getClonedProperties()
 Please note that the properties that are specific to Oxygen XML comments or track changes 
 processing instructions cannot be removed. You can see the name of these specific properties 
 in AuthorPersistentHighlightConstants

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)): The highlight.
- `properties` (`java.util.List<java.lang.String>`): The names of the properties to be removed.

### `addAuthorPersistentHighlightListener(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener listener)`

**Returns:** `void`

In the persistent highlights are included:
 

  -  Change tracking markers and comments
  -  Additional persistent highlights 
    added using AuthorPersistentHighlighter#addHighlight(int, int, java.util.LinkedHashMap)

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`](highlights/AuthorPersistentHighlightsListener.md)): The listener

### `removeAuthorPersistentHighlightListener(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`](highlights/AuthorPersistentHighlightsListener.md)): The listener to remove.

### `addPersistentHighlightsFilter(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsFilter persistentHighlightsFilter)`

**Returns:** `void`

A filter capable of filtering the highlights by author is present by default.

**Parameters:**
- `persistentHighlightsFilter` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsFilter`](highlights/AuthorPersistentHighlightsFilter.md)): The filter to be added.

