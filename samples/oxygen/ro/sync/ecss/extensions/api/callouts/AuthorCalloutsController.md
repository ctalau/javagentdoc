# Interface: `AuthorCalloutsController`

**Package:** [`ro.sync.ecss.extensions.api.callouts`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.callouts.AuthorCalloutsController`

## Description

This controller can be used to decide what types of callouts must be presented in 
 Author mode. It must be provided through AuthorReviewController#getAuthorCalloutsController()
 method.
 

 

 To render a custom highlight as a callout in Author mode, a callout information 
 provider must be set from 
 AuthorCalloutsController#setCalloutsRenderingInformationProvider(CalloutsRenderingInformationProvider) method.
 

 

 By default, the callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the methods in this class.
 The Preferences will not be affected by the API.

## Methods

### `isShowingCommentsCallouts()`

**Returns:** `boolean`

By default, the comments callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the #setShowCommentsCallouts(Boolean) 
 method. 
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

### `setShowCommentsCallouts(`java.lang.Boolean` showCommentsCallouts)`

**Returns:** `void`

This method can be used to override the default option from Oxygen Preferences 
 that controls if the callouts corresponding to review comments and Change Tracking
 deletions and insertions with comments are displayed in Author mode.
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

### `isShowingDeletionsCallouts()`

**Returns:** `boolean`

By default, the Change Tracking deletions callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the #setShowDeletionsCallouts(Boolean) 
 method. 
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

### `setShowDeletionsCallouts(`java.lang.Boolean` showDeletionsCallouts)`

**Returns:** `void`

This method can be used to override the default option from Oxygen Preferences 
 that controls if the callouts corresponding to Change Tracking
 deletions are displayed in Author mode.
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

### `isShowingInsertionsCallouts()`

**Returns:** `boolean`

By default, the Change Tracking insertions callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the #setShowInsertionsCallouts(Boolean) 
 method. 
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

### `setShowInsertionsCallouts(`java.lang.Boolean` showInsertionsCallouts)`

**Returns:** `void`

This method can be used to override the default option from Oxygen Preferences 
 that controls if the callouts corresponding to Change Tracking
 insertions are displayed in Author mode.
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

### `setCalloutsRenderingInformationProvider([`ro.sync.ecss.extensions.api.callouts.CalloutsRenderingInformationProvider`](./CalloutsRenderingInformationProvider.md) provider)`

**Returns:** `void`

The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.
 

 By default, the callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the AuthorCalloutsController methods.

### `getCalloutRectangle([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md) persistentHighlight)`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `addCalloutActionsProvider([`ro.sync.ecss.extensions.api.callouts.CalloutActionsProvider`](./CalloutActionsProvider.md) actionsProvider)`

**Returns:** `void`

### `removeCalloutActionsProvider([`ro.sync.ecss.extensions.api.callouts.CalloutActionsProvider`](./CalloutActionsProvider.md) actionsProvider)`

**Returns:** `void`

### `getDefaultAuthorCalloutRenderingInformation([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md) highlight)`

**Returns:** [`ro.sync.ecss.extensions.api.callouts.AuthorCalloutRenderingInformation`](./AuthorCalloutRenderingInformation.md)

You can change the rendering information for such highlights by setting a CalloutsRenderingInformationProvider 
 and overriding its method CalloutsRenderingInformationProvider#handlesAlsoDefaultHighlights() to return `true`. 
 

 The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.

