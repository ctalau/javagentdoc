# Class: `WebappEditingSessionLifecycleListener`

**Package:** [`ro.sync.ecss.extensions.api.webapp.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.access.WebappEditingSessionLifecycleListener`

## Description

The lifecycle is influenced by the fact that we cannot safely detect when
 the users closed the application and that the users may have a lot of 
 instances of the application open.
 
 In order to optimize memory consumption, we serialize editing sessions to 
 disk sometimes (after periods of inactivity or if there are too many 
 concurrent sessions). However, the moment when the session gets serialized
 can be configured separately.
 
 This listener can be registered on WebappPluginWorkspace.

## Constructors

### `<init>()`

## Methods

### `editingSessionAboutToBeStarted(`java.lang.String` editingSessionId, `java.lang.String` licenseeId, `java.net.URL` systemId, `java.util.Map<java.lang.String,java.lang.Object>` options)`

**Returns:** `void`

If it throws a EditingSessionOpenVetoException, the details in the exception
 will be presented to the user.

### `editingSessionFailedToStart(`java.lang.String` editingSessionId, `java.lang.String` licenseeId, `java.net.URL` systemId, `java.util.Map<java.lang.String,java.lang.Object>` options)`

**Returns:** `void`

### `editingSessionStarted(`java.lang.String` editingSessionId, [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md) documentModel)`

**Returns:** `void`

### `editingSessionClosed(`java.lang.String` editingSessionId, [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md) documentModel)`

**Returns:** `void`

Note that on some platforms, the user may close the browser without triggering
 this event.

### `editingSessionAboutToBeSerialized(`java.lang.String` editingSessionId, [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md) documentModel)`

**Returns:** `void`

After this method is called, the document model given as a parameter cannot 
 be used anymore.

### `editingSessionDeserialized(`java.lang.String` editingSessionId, [`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md) documentModel)`

**Returns:** `void`

