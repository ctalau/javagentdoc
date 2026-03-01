# Class: `EditingSessionContext`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.EditingSessionContext`

**Implements:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)

## Description

An editing session correspond to an user editing a document in the editor. 
 Custom attributes can be registered from the API which can include information
 about the context of the editing, e.g. the user that performs the edit, 
 the project in whose scope the editing session was started, etc. 
 
 
The session context is serializable and it serializes only the attributes
 whose value is serializable. The rest of the attributes are ignored.
 
 
In Web Author, attributes can be added to the editing context by using:
 - URL parameters specified in the web brosers
 - JavaScript `LoadingOptions` set on the `sync.api.Workspace.EventType.BEFORE_EDITOR_LOADED` event handler.
 - The WebappEditingSessionLifecycleListener#editingSessionAboutToBeStarted(String, String, java.net.URL, java.util.Map) callback.

## Constructors

### `<init>()`

## Methods

### `setAttribute(`java.lang.String` attr, `java.lang.Object` value)`

**Returns:** `void`

If the attribute is already set it overrides the previous value.

### `getAttribute(`java.lang.String` attr)`

**Returns:** `java.lang.Object`

### `getAttributes()`

**Returns:** `java.util.Set<java.lang.String>`

