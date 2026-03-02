# Class: `DITAIDTypeIdentifier`

**Package:** [`ro.sync.ecss.extensions.dita.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`

**Extends:** [`ro.sync.ecss.extensions.api.link.DefaultIDTypeIdentifier`](../../api/link/DefaultIDTypeIdentifier.md)

## Description

## Fields

### `topicID`

**Type:** `java.lang.String`

Only filled if the identifier is for a subtopic element.

### `location`

**Type:** `java.lang.String`

### `elementID`

**Type:** `java.lang.String`

### `topicIsFirstInFile`

**Type:** `boolean`

### `isElementInMap`

**Type:** `boolean`

## Constructors

### `<init>(java.lang.String location, java.lang.String topicID, java.lang.String elementID, boolean topicIsFirstInFile, boolean isDeclaration)`

**Parameters:**
- `location` (`java.lang.String`): The location
- `topicID` (`java.lang.String`): The topic ID.
- `elementID` (`java.lang.String`): The element ID.
- `topicIsFirstInFile` (`boolean`): `true` if the topic is the first one in the file
- `isDeclaration` (`boolean`): true if it is a declaration.

## Methods

### `setElementInMap(boolean isElementInMap)`

**Returns:** `void`

**Parameters:**
- `isElementInMap` (`boolean`): `true` if it's an element in a DITA Map

### `isElementInMap()`

**Returns:** `boolean`

### `isTopicFirstInFile()`

**Returns:** `boolean`

### `getLocation()`

**Returns:** `java.lang.String`

### `getTopicID()`

**Returns:** `java.lang.String`

### `getElementID()`

**Returns:** `java.lang.String`

### `toString()`

**Returns:** `java.lang.String`

