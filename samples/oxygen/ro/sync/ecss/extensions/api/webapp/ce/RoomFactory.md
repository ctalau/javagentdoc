# Interface: `RoomFactory`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.RoomFactory`

## Description

## Methods

### `createRoom([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md) model)`

**Returns:** `java.lang.String`

### `createRoom([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md) model, [`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md) saveStrategy)`

**Returns:** `java.lang.String`

### `getRoom(`java.lang.String` roomId)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.Room`](./Room.md)

### `getRoomTryCreateProxy(`java.lang.String` roomId)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.Room`](./Room.md)

Tries to create a proxy room if the room doesn't 
  exist on this server.

### `addCommonEditingContextAttribute(`java.lang.String` attributeName)`

**Returns:** `void`

