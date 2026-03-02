# Interface: `RoomObserver`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.RoomObserver`

## Description

## Fields

### `ROOM_ID_HEADER`

**Type:** `java.lang.String`

## Methods

### `sync(RoomObserver.SyncListener listener)`

The observer synchronizes its state with changes from multiple users that 
 changed the document since the last sync. The observer tries to batch together
 as many changes from the same user as possible (without breaking causality of changes).
 
 After synchronizing changes from a single user the listener is called.

**Parameters:**
- `listener` (`ro.sync.ecss.extensions.api.webapp.ce.RoomObserver.SyncListener`): The listener to call after synchronizing changes from an user.

**Returns:** `void`

### `createInputStream()`

**Returns:** `java.io.InputStream`

### `getUnsavedContentReferenceManager()`

**Returns:** [`ro.sync.ecss.extensions.api.access.UnsavedContentReferenceManager`](../../access/UnsavedContentReferenceManager.md)

### `getUserContext()`

When it opens such connections, 
 the URLStreamHandlerWithContext instance will receive this 
 UserContext.
 
 The UserContext has the "service account" flag set to true and a 
 header #ROOM_ID_HEADER that contains the ID of the room.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.UserContext`](../plugin/UserContext.md)

### `addEditListener(RoomObserver.EditListener listener)`

**Parameters:**
- `listener` (`ro.sync.ecss.extensions.api.webapp.ce.RoomObserver.EditListener`): The edit listener to register.

**Returns:** `void`

### `removeEditListener(RoomObserver.EditListener listener)`

**Parameters:**
- `listener` (`ro.sync.ecss.extensions.api.webapp.ce.RoomObserver.EditListener`): The edit listener to register.

**Returns:** `void`

