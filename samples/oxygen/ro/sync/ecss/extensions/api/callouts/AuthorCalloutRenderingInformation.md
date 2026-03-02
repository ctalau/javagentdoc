# Class: `AuthorCalloutRenderingInformation`

**Package:** [`ro.sync.ecss.extensions.api.callouts`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.callouts.AuthorCalloutRenderingInformation`

## Description

By default, the callouts visibility in Author mode is controlled from Oxygen
 Preferences but it can be changed by using the AuthorCalloutsController methods.
 

 The AuthorReviewCalloutInformation object holds the data that will be rendered
 as a callout, in Author mode. 
 

 To render a custom highlight as a callout in Author mode, a callouts information 
 provider must be set from 
 AuthorCalloutsController#setCalloutsRenderingInformationProvider(CalloutsRenderingInformationProvider) method.

## Constructors

### `<init>()`

## Methods

### `getAuthor()`

**Returns:** `java.lang.String`

### `getTimestamp()`

**Returns:** `long`

### `getComment(int limit)`

**Returns:** `java.lang.String`

This could be a part of the real comment stored in the change or persistent highlight.

**Parameters:**
- `limit` (`int`): the suggested text limit (in characters). This value comes from the 
 Callouts Options (user preferences). Examples: 80 or 160 characters.

### `getContentFromTarget(int limit)`

**Returns:** `java.lang.String`

This will be presented in the content part of the callout. Note that it is not
 necessary to provide the entire content related to the callout.

**Parameters:**
- `limit` (`int`): the suggested text limit (in characters). This value comes from the 
 Callouts Options (user preferences). Examples: 80 or 160 characters.

### `getAdditionalData()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

The callout additional data must be provided as a map between data type and actual callout data.
 It will be rendered inside the callout as "data_type: data" strings, separated by new lines.

### `getCalloutType()`

**Returns:** `java.lang.String`

### `getHeaderInformation()`

**Returns:** `java.lang.String`

### `getColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

