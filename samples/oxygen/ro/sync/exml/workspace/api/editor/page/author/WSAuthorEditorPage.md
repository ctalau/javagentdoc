# Interface: `WSAuthorEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPageBase`](./WSAuthorEditorPageBase.md)

## Description

## Methods

### `getDocumentController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../../../../ecss/extensions/api/AuthorDocumentController.md)

It has methods for changing the document model.

### `getTableAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorTableAccess`](../../../../../../ecss/extensions/api/access/AuthorTableAccess.md)

### `getChangeTrackingController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](../../../../../../ecss/extensions/api/AuthorChangeTrackingController.md)

### `getReviewController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReviewController`](../../../../../../ecss/extensions/api/AuthorReviewController.md)

### `getOptionsStorage()`

**Returns:** [`ro.sync.ecss.extensions.api.OptionsStorage`](../../../../../../ecss/extensions/api/OptionsStorage.md)

This is also responsible for adding and removing listeners that are notified
 about the option changes.

### `getOutlineAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`](../../../../../../ecss/extensions/api/access/AuthorOutlineAccess.md)

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../../ecss/extensions/api/AuthorAccess.md)

The WSAuthorEditorPage has most of the methods which can also be found in the AuthorAccess.
 This method is offered only as an useful way to have utility methods which take AuthorAccess as a parameter and 
 to use them both from a plugin and from a framework.
 
 Provides access to specific components corresponding to editor, document, workspace,
 tables, change tracking and utility informations and actions.

### `addQuickAssistProcessor(ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor processor)`

**Returns:** `void`

This allow you to provide quick custom quick assist 
 proposals in the current editor page quick assist menu.
 The quick assist processor cannot be registered for WebAuthor application.

**Parameters:**
- `processor` ([`ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`](../../../../../editor/quickassist/SimpleQuickAssistProcessor.md)): The processor to be registered.

### `removeQuickAssistProcessor(ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor processor)`

**Returns:** `void`

**Parameters:**
- `processor` ([`ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`](../../../../../editor/quickassist/SimpleQuickAssistProcessor.md)): The processor to be unregistered.

