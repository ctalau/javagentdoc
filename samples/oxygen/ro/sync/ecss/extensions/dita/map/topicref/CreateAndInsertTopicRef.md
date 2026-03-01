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

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getFrameworkFolder([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.io.File`

### `createTopicAndInsertReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments` arguments)`

**Returns:** `void`

### `createTopic(`java.net.URL` folderUrl, `ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments` args)`

**Returns:** `java.net.URL`

### `getContentForNewTopic(`ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments` args)`

**Returns:** `java.lang.String`

### `proposeFolderUrl([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) access)`

**Returns:** `java.net.URL`

### `getFolderOfMap([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) access)`

**Returns:** `java.net.URL`

### `getReferenceNodeOfInsertionPosition([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) access)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)

### `getTopicUrl(`java.net.URL` folderUrl, `ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments` args)`

**Returns:** `java.net.URL`

### `getFolderUrl(`java.net.URL` editorLocation, `ro.sync.ecss.extensions.dita.map.topicref.CreateAndInsertTopicRef.Arguments` args)`

**Returns:** `java.util.Optional<java.net.URL>`

### `resolveRelativeUrl(`java.net.URL` baseUrl, `java.lang.String` relative)`

**Returns:** `java.net.URL`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

