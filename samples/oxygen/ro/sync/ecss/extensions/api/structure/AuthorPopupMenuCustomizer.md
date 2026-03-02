# Interface: `AuthorPopupMenuCustomizer`

**Package:** [`ro.sync.ecss.extensions.api.structure`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`

## Description

## Methods

### `customizePopUpMenu(java.lang.Object popUp, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

If everything is removed then the menu will not be shown.

 For the standalone implementation the object is a *JPopupMenu*.

 For the eclipse implementation the object is a *IMenuManager*.

**Parameters:**
- `popUp` (`java.lang.Object`): The pop-up Menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): Access class to the author functions.

**Returns:** `void`

