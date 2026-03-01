# Interface: `UnsavedContentReferenceManager`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.UnsavedContentReferenceManager`

## Description

## Methods

### `getUnsavedReferencesList()`

**Returns:** `java.util.List<java.net.URL>`

### `getUnsavedReferencedNodeDescriptors()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.access.UnsavedReferenceNodeDescriptor>`

### `getUnsavedReferenceInputStream(`java.net.URL` referenceUrl)`

**Returns:** `java.io.InputStream`

This input stream offers the entire content of the reference, with all the unsaved modifications
 applied.

### `markReferenceAsSaved(`java.net.URL` referenceUrl)`

**Returns:** `void`

Signal to the application that the reference should now be considered as saved.

### `isDocumentUnsaved()`

**Returns:** `boolean`

### `markDocumentAsSaved()`

**Returns:** `void`

Signal to the application that the document should now be considered as saved.

