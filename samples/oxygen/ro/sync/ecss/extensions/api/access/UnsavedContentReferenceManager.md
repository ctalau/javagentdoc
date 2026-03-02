# Interface: `UnsavedContentReferenceManager`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.UnsavedContentReferenceManager`

## Description

## Methods

### `getUnsavedReferencesList()`

**Returns:** `java.util.List<java.net.URL>`

### `getUnsavedReferencedNodeDescriptors()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.access.UnsavedReferenceNodeDescriptor>`

### `getUnsavedReferenceInputStream(URL referenceUrl)`

This input stream offers the entire content of the reference, with all the unsaved modifications
 applied.

**Parameters:**
- `referenceUrl` (`java.net.URL`): The reference URL.

**Returns:** `java.io.InputStream`

### `markReferenceAsSaved(URL referenceUrl)`

Signal to the application that the reference should now be considered as saved.

**Parameters:**
- `referenceUrl` (`java.net.URL`): The reference URL.

**Returns:** `void`

### `isDocumentUnsaved()`

**Returns:** `boolean`

### `markDocumentAsSaved()`

Signal to the application that the document should now be considered as saved.

**Returns:** `void`

