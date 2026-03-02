# Interface: `RoomFactory`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.RoomFactory`

## Description

## Methods

### `createRoom(AuthorDocumentModel model)`

**Parameters:**
- `model` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md)): The document model.

**Returns:** `java.lang.String`

### `createRoom(AuthorDocumentModel model, SaveStrategy saveStrategy)`

**Parameters:**
- `model` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md)): The document model.
- `saveStrategy` ([`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md)): Details required for save.

**Returns:** `java.lang.String`

### `getRoom(String roomId)`

**Parameters:**
- `roomId` (`java.lang.String`): The ID of the room.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.Room`](./Room.md)

### `getRoomTryCreateProxy(String roomId)`

Tries to create a proxy room if the room doesn't 
  exist on this server.

**Parameters:**
- `roomId` (`java.lang.String`): The ID of the room.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.Room`](./Room.md)

### `addCommonEditingContextAttribute(String attributeName)`

**Parameters:**
- `attributeName` (`java.lang.String`): the common attribute name.

**Returns:** `void`

