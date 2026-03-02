# Class: `CreateAndInsertTopicRef`

**Package:** [`ro.sync.ecss.extensions.dita.map.topicref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

## Fields

### `DITA_FILE_EXTENSION`

**Type:** `java.lang.String`

### `TITLE_ARGUMENT`

**Type:** `java.lang.String`

### `FOLDER_URL_ARGUMENT`

**Type:** `java.lang.String`

### `TOPIC_CONTENT_ARGUMENT`

**Type:** `java.lang.String`

### `TOPIC_CONTENT_PATH_ARGUMENT`

**Type:** `java.lang.String`

### `RELATIVE_LOCATION_ARGUMENT`

**Type:** `java.lang.String`

The value is `insertPosition`.

### `ARGUMENT_DESCRIPTOR_RELATIVE_LOCATION`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `getFrameworkFolder(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.io.File`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.

### `createTopicAndInsertReference(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments arguments)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access of the map.
- `arguments` (`ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments`): The arguments.

### `createTopic(java.net.URL folderUrl, ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments args)`

**Returns:** `java.net.URL`

**Parameters:**
- `folderUrl` (`java.net.URL`): The URL where to create the topic.
- `args` (`ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments`): The arguments.

### `getContentForNewTopic(ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments args)`

**Returns:** `java.lang.String`

**Parameters:**
- `args` (`ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments`): The operation arguments.

### `proposeFolderUrl(ro.sync.ecss.extensions.api.AuthorAccess access)`

**Returns:** `java.net.URL`

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.

### `getFolderOfMap(ro.sync.ecss.extensions.api.AuthorAccess access)`

**Returns:** `java.net.URL`

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access for the map.

### `getReferenceNodeOfInsertionPosition(ro.sync.ecss.extensions.api.AuthorAccess access)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))

### `getTopicUrl(java.net.URL folderUrl, ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments args)`

**Returns:** `java.net.URL`

**Parameters:**
- `folderUrl` (`java.net.URL`): The folder URL.
- `args` (`ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments`): The arguments.

### `getFolderUrl(java.net.URL editorLocation, ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments args)`

**Returns:** `java.util.Optional<java.net.URL>`

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor location.
- `args` (`ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments`): The operation arguments.

### `resolveRelativeUrl(java.net.URL baseUrl, java.lang.String relative)`

**Returns:** `java.net.URL`

**Parameters:**
- `baseUrl` (`java.net.URL`): The base URL.
- `relative` (`java.lang.String`): The relative URL.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

