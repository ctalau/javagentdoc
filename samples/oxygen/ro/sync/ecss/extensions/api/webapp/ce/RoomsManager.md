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

### `createRoomFromDocument(ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md))

**Returns:** `java.lang.String`

### `createRoomFromDocument(ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel arg0, ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md))
- `arg1` ([`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md))

**Returns:** `java.lang.String`

### `getRoom(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.webapp.ce.Room>`

### `getRoomTryCreateProxy(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.webapp.ce.Room>`

### `isEnabled()`

**Returns:** `boolean`

### `getRoomFactoryOrThrow()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.RoomFactory`](./RoomFactory.md)

### `getRoomFactory()`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.webapp.ce.RoomFactory>`

### `getRoomFactory(ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription`)

**Returns:** [`ro.sync.ecss.extensions.api.webapp.ce.RoomFactory`](./RoomFactory.md)

### `checkLicense()`

**Returns:** `void`

### `getCurrentLicenseInformation()`

**Returns:** `java.util.Optional<ro.sync.g.e.h>`

### `addRoomCreatedListener(ro.sync.ecss.extensions.api.webapp.ce.RoomCreatedListener arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.ce.RoomCreatedListener`](./RoomCreatedListener.md))

**Returns:** `void`

### `removeRoomCreatedListener(ro.sync.ecss.extensions.api.webapp.ce.RoomCreatedListener arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.ce.RoomCreatedListener`](./RoomCreatedListener.md))

**Returns:** `void`

### `callRoomCreatedListeners(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

