# Class: `RoomsManager`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.RoomsManager`

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `INSTANCE`

**Type:** [`ro.sync.ecss.extensions.api.webapp.ce.RoomsManager`](./RoomsManager.md)

### `ROOM_EXTENSION_TYPE`

**Type:** `java.lang.String`

### `DEFAULT_SAVE_STRATEGY`

**Type:** [`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md)

### `SHARED_CONTEXT_ATTRIBUTES`

**Type:** `java.util.List<java.lang.String>`

### `roomFactory`

**Type:** `java.util.Optional<ro.sync.ecss.extensions.api.webapp.ce.RoomFactory>`

### `roomCreatedListeners`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.webapp.ce.RoomCreatedListener>`

## Constructors

### `<init>()`

## Methods

### `createRoomFromDocument([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md) arg0)`

**Returns:** `java.lang.String`

### `createRoomFromDocument([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md) arg0, [`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md) arg1)`

**Returns:** `java.lang.String`

### `getRoom(`java.lang.String` arg0)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.webapp.ce.Room>`

### `getRoomTryCreateProxy(`java.lang.String` arg0)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.webapp.ce.Room>`

### `isEnabled()`

**Returns:** `boolean`

### `getRoomFactoryOrThrow()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.RoomFactory`](./RoomFactory.md)

### `getRoomFactory()`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.webapp.ce.RoomFactory>`

### `getRoomFactory(`ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.RoomFactory`](./RoomFactory.md)

### `checkLicense()`

**Returns:** `void`

### `getCurrentLicenseInformation()`

**Returns:** `java.util.Optional<ro.sync.g.e.h>`

### `addRoomCreatedListener([`ro.sync.ecss.extensions.api.webapp.ce.RoomCreatedListener`](./RoomCreatedListener.md) arg0)`

**Returns:** `void`

### `removeRoomCreatedListener([`ro.sync.ecss.extensions.api.webapp.ce.RoomCreatedListener`](./RoomCreatedListener.md) arg0)`

**Returns:** `void`

### `callRoomCreatedListeners(`java.lang.String` arg0)`

**Returns:** `void`

