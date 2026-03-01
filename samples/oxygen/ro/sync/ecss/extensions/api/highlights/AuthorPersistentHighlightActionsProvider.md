# Interface: `AuthorPersistentHighlightActionsProvider`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightActionsProvider`

## Description

You can set such a provider by using the 
 AuthorPersistentHighlighter#setHighlightsActionsProvider(AuthorPersistentHighlightActionsProvider)
 method.

## Methods

### `getActions([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight)`

**Returns:** `java.util.List<javax.swing.AbstractAction>`

This method is called only for the highlights that have a a callout associated.
 

 Only the following action properties are used in oXygen Eclipse plugin: 
 Action#SMALL_ICON is used as action image in the menu 
 and Action#NAME is used as action name (label). 
 

 In the future, this will be called also for the custom persistent highlights 
 that are displayed in the main editing area.
 

 To associate callout information to custom persistent highlights use the method 
 AuthorCalloutsController#setCalloutsRenderingInformationProvider(
 ro.sync.ecss.extensions.api.callouts.CalloutsRenderingInformationProvider)

### `getDefaultAction([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight)`

**Returns:** `javax.swing.AbstractAction`

Is not necessary that this action to 
 be included in the ones returned by #getActions(AuthorPersistentHighlight).

