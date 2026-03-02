# Class: `InsertTopicrefOperation`

**Package:** [`ro.sync.ecss.extensions.dita.map.topicref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.topicref.InsertTopicrefOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

Can be a topic 
 or a topic specialization.
 
 If this operation is invoked from Web Author it needs to have the `topicUrl` argument set to a valid URI.

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_TOPIC_URL`

**Type:** `java.lang.String`

### `ARGUMENT_TOPICREF_NAME`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `getTopicUrlFromArgs(ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `java.net.URL`

**Parameters:**
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md)): The arguments.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

The operation will display a dialog for choosing the topic to refer.

### `getDescription()`

**Returns:** `java.lang.String`

