# Class: `CalloutsRenderingInformationProvider`

**Package:** [`ro.sync.ecss.extensions.api.callouts`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.callouts.CalloutsRenderingInformationProvider`

## Description

By default it only handles custom persistent highlights but you can override the method #handlesAlsoDefaultHighlights() to 
 handle also built-in persistent highlights (comment, insertion or deletion change). 
 

 The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.
 

 By default, the callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the AuthorCalloutsController methods.
 

 The callouts rendering provider can be set from 
 AuthorCalloutsController#setCalloutsRenderingInformationProvider(CalloutsRenderingInformationProvider)

## Constructors

### `<init>()`

## Methods

### `getCalloutRenderingInformation(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

For **custom highlights** the callout rendering information is requested only for that custom
 persistent highlights for which the #shouldRenderAsCallout(AuthorPersistentHighlight)
 

 For **built-in persistent highlights** (comment, insertion or deletion change) the rendering can be requested only you
 override the #handlesAlsoDefaultHighlights() method to return `true`. 
 

 The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md)): The Author persistent highlight. The type of the highlight can be obtained by using the AuthorPersistentHighlight#getType()

**Returns:** [`ro.sync.ecss.extensions.api.callouts.AuthorCalloutRenderingInformation`](./AuthorCalloutRenderingInformation.md)

### `shouldRenderAsCallout(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom persistent highlights in Author mode.
 

 If this method returns `true`, the callout rendering information
 for this callout must be provided by #getCalloutRenderingInformation(AuthorPersistentHighlight)
 method.
 

 The implementation of this method must be fast, being called frequently.

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md)): The Author custom persistent highlight.

**Returns:** `boolean`

### `handlesAlsoDefaultHighlights()`

The callout rendering information is requested only if the application
 preferences are configured to show callouts for these highlight types. 
 By default the rendering information provider is called only for custom highlights.
 

 The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.

**Returns:** `boolean`

