# Interface: `Room`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.Room`

## Description

Such models belong to different users and are edited concurrently and synchronized 
 in real-time.
 
 An document model that is part in a room is called a "peer".

## Fields

### `PEER_ID_ATTRIBUTE`

**Type:** `java.lang.String`

### `ROOM_ID_ATTRIBUTE`

**Type:** `java.lang.String`

### `ROOM_CREATOR_ATTRIBUTE`

**Type:** `java.lang.String`

## Methods

### `getPeerContext(int peerId)`

**Parameters:**
- `peerId` (`int`): The peer ID.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.PeerContext`](./PeerContext.md)

### `getObserver()`

Note: The room observer needs to be requested when the room is created.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.RoomObserver`](./RoomObserver.md)

### `close()`

Should do any necessary cleanup and should notify all peers.

**Returns:** `void`

