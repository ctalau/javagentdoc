# Interface: `RoomFactory`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.RoomFactory`

## Description

## Methods

### `createRoom(ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel model)`

**Returns:** `java.lang.String`

**Parameters:**
- `model` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md)): The document model.

### `createRoom(ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel model, ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy saveStrategy)`

**Returns:** `java.lang.String`

**Parameters:**
- `model` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md)): The document model.
- `saveStrategy` ([`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md)): Details required for save.

### `getRoom(java.lang.String roomId)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.Room`](./Room.md)

**Parameters:**
- `roomId` (`java.lang.String`): The ID of the room.

### `getRoomTryCreateProxy(java.lang.String roomId)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.Room`](./Room.md)

Tries to create a proxy room if the room doesn't 
  exist on this server.

**Parameters:**
- `roomId` (`java.lang.String`): The ID of the room.

### `addCommonEditingContextAttribute(java.lang.String attributeName)`

**Returns:** `void`

**Parameters:**
- `attributeName` (`java.lang.String`): the common attribute name.

