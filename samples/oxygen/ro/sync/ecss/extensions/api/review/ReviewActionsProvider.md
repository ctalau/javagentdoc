# Class: `ReviewActionsProvider`

**Package:** [`ro.sync.ecss.extensions.api.review`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.review.ReviewActionsProvider`

## Description

The actions will be mounted on the contextual menu when right clicking a review entry.

## Constructors

### `<init>()`

## Methods

### `customizeContextualMenuActions([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](../highlights/AuthorPersistentHighlight.md) selectedHighlights, `java.lang.Object` popupMenu)`

**Returns:** `void`

### `performCustomActionOnDelete([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](../highlights/AuthorPersistentHighlight.md) selectedHighlights)`

**Returns:** `boolean`

### `customizeHoverActions([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md) authorPersistentHighlight, `java.util.List` actions)`

**Returns:** `void`

The actions are either Swing actions or SWT actions.
 For Swing actions you can use the API "ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace.getOxygenActionID(Action)" to query each action's ID.

