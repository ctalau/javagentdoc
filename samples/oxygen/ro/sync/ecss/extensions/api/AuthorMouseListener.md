# Interface: `AuthorMouseListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorMouseListener`

## Description

## Methods

### `mouseClicked(ro.sync.ecss.extensions.api.AuthorMouseEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

### `mousePressed(ro.sync.ecss.extensions.api.AuthorMouseEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

### `mouseReleased(ro.sync.ecss.extensions.api.AuthorMouseEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

### `mouseDragged(ro.sync.ecss.extensions.api.AuthorMouseEvent e)`

**Returns:** `void`

`MOUSE_DRAGGED` events will continue to be 
 delivered to the author page where the drag originated until the 
 mouse button is released (regardless of whether the mouse position 
 is within the bounds of the author page).

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

### `mouseMoved(ro.sync.ecss.extensions.api.AuthorMouseEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AuthorMouseEvent`](./AuthorMouseEvent.md)): The AuthorMouseEvent.

