# Interface: `AuthorMouseListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorMouseListener`

## Description

## Methods

### `mouseClicked(AuthorMouseEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

**Returns:** `void`

### `mousePressed(AuthorMouseEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

**Returns:** `void`

### `mouseReleased(AuthorMouseEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

**Returns:** `void`

### `mouseDragged(AuthorMouseEvent e)`

`MOUSE_DRAGGED` events will continue to be 
 delivered to the author page where the drag originated until the 
 mouse button is released (regardless of whether the mouse position 
 is within the bounds of the author page).

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

**Returns:** `void`

### `mouseMoved(AuthorMouseEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

**Returns:** `void`

