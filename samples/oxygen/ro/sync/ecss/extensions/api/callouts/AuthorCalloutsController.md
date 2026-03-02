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

By default, the comments callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the #setShowCommentsCallouts(Boolean) 
 method. 
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

**Returns:** `boolean`

### `setShowCommentsCallouts(java.lang.Boolean showCommentsCallouts)`

This method can be used to override the default option from Oxygen Preferences 
 that controls if the callouts corresponding to review comments and Change Tracking
 deletions and insertions with comments are displayed in Author mode.
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

**Parameters:**
- `showCommentsCallouts` (`java.lang.Boolean`): If `true`, the review callouts with comments
   are displayed in Author mode. The callouts with comments are hidden when the provided 
   value is `false`.
   
   
   When the value is set to `null`, the option from Oxygen Preferences
   is taken into consideration.

**Returns:** `void`

### `isShowingDeletionsCallouts()`

By default, the Change Tracking deletions callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the #setShowDeletionsCallouts(Boolean) 
 method. 
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

**Returns:** `boolean`

### `setShowDeletionsCallouts(java.lang.Boolean showDeletionsCallouts)`

This method can be used to override the default option from Oxygen Preferences 
 that controls if the callouts corresponding to Change Tracking
 deletions are displayed in Author mode.
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

**Parameters:**
- `showDeletionsCallouts` (`java.lang.Boolean`): If `true`, the Track Changes deletions callouts
   are displayed in Author mode. The deletions callouts are hidden when the provided value is `false`.
   
   
   When the value is set to `null`, the option from Oxygen Preferences
   is taken into consideration.

**Returns:** `void`

### `isShowingInsertionsCallouts()`

By default, the Change Tracking insertions callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the #setShowInsertionsCallouts(Boolean) 
 method. 
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

**Returns:** `boolean`

### `setShowInsertionsCallouts(java.lang.Boolean showInsertionsCallouts)`

This method can be used to override the default option from Oxygen Preferences 
 that controls if the callouts corresponding to Change Tracking
 insertions are displayed in Author mode.
 

 Note that when there are no review callouts, the callouts side bar is collapsed.

**Parameters:**
- `showInsertionsCallouts` (`java.lang.Boolean`): If `true`, the Track Changes insertions callouts
   are displayed in Author mode. The insertions callouts are hidden when the provided value is `false`.
   
   
   When the value is set to `null`, the option from Oxygen Preferences
   is taken into consideration.

**Returns:** `void`

### `setCalloutsRenderingInformationProvider(ro.sync.ecss.extensions.api.callouts.CalloutsRenderingInformationProvider provider)`

The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.
 

 By default, the callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the AuthorCalloutsController methods.

**Parameters:**
- `provider` ([`ro.sync.ecss.extensions.api.callouts.CalloutsRenderingInformationProvider`](./CalloutsRenderingInformationProvider.md)): The highlights callout rendering information provider.

**Returns:** `void`

### `getCalloutRectangle(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight persistentHighlight)`

**Parameters:**
- `persistentHighlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md)): The Author persistent highlight.

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `addCalloutActionsProvider(ro.sync.ecss.extensions.api.callouts.CalloutActionsProvider actionsProvider)`

**Parameters:**
- `actionsProvider` ([`ro.sync.ecss.extensions.api.callouts.CalloutActionsProvider`](./CalloutActionsProvider.md)): The callout actions provider.

**Returns:** `void`

### `removeCalloutActionsProvider(ro.sync.ecss.extensions.api.callouts.CalloutActionsProvider actionsProvider)`

**Parameters:**
- `actionsProvider` ([`ro.sync.ecss.extensions.api.callouts.CalloutActionsProvider`](./CalloutActionsProvider.md)): The callout actions provider.

**Returns:** `void`

### `getDefaultAuthorCalloutRenderingInformation(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

You can change the rendering information for such highlights by setting a CalloutsRenderingInformationProvider 
 and overriding its method CalloutsRenderingInformationProvider#handlesAlsoDefaultHighlights() to return `true`. 
 

 The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md)): The Author persistent highlight. 
   The type of the highlight can be obtained by using the AuthorPersistentHighlight#getType()

**Returns:** [`ro.sync.ecss.extensions.api.callouts.AuthorCalloutRenderingInformation`](./AuthorCalloutRenderingInformation.md)

