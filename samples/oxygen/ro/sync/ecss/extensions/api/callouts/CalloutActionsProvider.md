# Class: `CalloutActionsProvider`

**Package:** [`ro.sync.ecss.extensions.api.callouts`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.callouts.CalloutActionsProvider`

## Description

The actions will be mounted on the contextual menu when right clicking a callout.

## Constructors

### `<init>()`

## Methods

### `getActions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight, java.util.List<javax.swing.AbstractAction> defaultActionsList)`

**Returns:** `java.util.List<javax.swing.AbstractAction>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): The Author access.
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md)): The highlight for which the actions will be presented.
- `defaultActionsList` (`java.util.List<javax.swing.AbstractAction>`): The default list of actions which would be contributed by the standard implementation. 
 The default actions list can be `null` when used with custom highlights.

### `getDefaultAction(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight, java.util.List<javax.swing.AbstractAction> actionsList)`

**Returns:** `javax.swing.AbstractAction`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): The Author access.
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](../highlights/AuthorPersistentHighlight.md)): The highlight for which the actions will be presented.
- `actionsList` (`java.util.List<javax.swing.AbstractAction>`): The default list of actions which would be contributed by the standard implementation.

