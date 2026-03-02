# Class: `ReviewActionsProvider`

**Package:** [`ro.sync.ecss.extensions.api.review`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.review.ReviewActionsProvider`

## Description

The actions will be mounted on the contextual menu when right clicking a review entry.

## Constructors

### `<init>()`

## Methods

### `customizeContextualMenuActions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[] selectedHighlights, java.lang.Object popupMenu)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): The Author access.
- `selectedHighlights` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](../highlights/AuthorPersistentHighlight.md)): The list of selected highlights
- `popupMenu` (`java.lang.Object`): The popup menu with default actions. (implementation of JPopupMenu on Swing or MenuManager on Eclipse).

**Returns:** `void`

### `performCustomActionOnDelete(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[] selectedHighlights)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): The Author access.
- `selectedHighlights` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](../highlights/AuthorPersistentHighlight.md)): The list of selected highlights

**Returns:** `boolean`

### `customizeHoverActions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight authorPersistentHighlight, java.util.List actions)`

The actions are either Swing actions or SWT actions.
 For Swing actions you can use the API "ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace.getOxygenActionID(Action)" to query each action's ID.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): The author access.
- `authorPersistentHighlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md)): The current highlight.
- `actions` (`java.util.List`): The list of hover actions which appear by default when hovering a change/comment in the Review panel. 
   You can add more actions to it, wrap existing actions or remove actions.

**Returns:** `void`

