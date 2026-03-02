# Interface: `AuthorPreloadProcessor`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorPreloadProcessor`

## Description

It can be used to set various pseudo classes to elements before the content is presented visually.

## Methods

### `documentAboutToBeLoaded(AuthorDocument document, AuthorPseudoClassController pseudoClassController)`

**Parameters:**
- `document` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md)): The document.
- `pseudoClassController` ([`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](./AuthorPseudoClassController.md)): The pseudo class controller. Use this interface to set or remove pseudo classes from elements.

**Returns:** `void`

