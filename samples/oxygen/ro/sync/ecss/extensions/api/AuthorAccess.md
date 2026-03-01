# Interface: `AuthorAccess`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorAccess`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorConstants`](./AuthorConstants.md), [`ro.sync.ecss.extensions.api.AuthorAccessDeprecated`](./AuthorAccessDeprecated.md), [`ro.sync.ecss.extensions.api.AuthorClipboardAccess`](./AuthorClipboardAccess.md)

## Description

Provides access to specific components corresponding to editor, document, workspace,
 tables, change tracking and utility informations and actions.

## Methods

### `getEditorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](access/AuthorEditorAccess.md)

### `getDocumentController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md)

It has methods for changing the document model.

### `getWorkspaceAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](access/AuthorWorkspaceAccess.md)

Provides methods for obtaining workspace related 
 informations and performing workspace specific actions.

### `getUtilAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorUtilAccess`](access/AuthorUtilAccess.md)

### `getXMLUtilAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorXMLUtilAccess`](access/AuthorXMLUtilAccess.md)

### `getTableAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorTableAccess`](access/AuthorTableAccess.md)

### `getReviewController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReviewController`](./AuthorReviewController.md)

### `getOptionsStorage()`

**Returns:** [`ro.sync.ecss.extensions.api.OptionsStorage`](./OptionsStorage.md)

This is also responsible for adding and removing listeners that are notified
 about the option changes.

### `getOutlineAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`](access/AuthorOutlineAccess.md)

### `getClassPathResourcesAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.ClassPathResourcesAccess`](./ClassPathResourcesAccess.md)

### `getAuthorResourceBundle()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](./AuthorResourceBundle.md)

It works as a map in which any message is 
 accessed by a key defined in the ExtensionTags interface.

### `getElementByAnchor(`java.lang.String` anchor)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

The syntax of the anchor is interpreted by the ElementLocatorProvider provided by the framework.

### `getCaretOffsetByAnchor(`java.lang.String` anchor)`

**Returns:** `int`

The syntax of the anchor is interpreted by the ElementLocatorProvider provided by the framework or:
 
 "short;locationInfo\0pathItems\0isWhitespaceBefore\0tokenPosition\0chCount\0anchorsOnChangeTrackingPI"
 
 example: "short;chrysanthemum/section_anp_qrw_p1b /section[1]/p[3]/b[1] false 0 16 false"

