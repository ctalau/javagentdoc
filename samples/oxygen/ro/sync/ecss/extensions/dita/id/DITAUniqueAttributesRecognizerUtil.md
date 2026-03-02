# Class: `DITAUniqueAttributesRecognizerUtil`

**Package:** [`ro.sync.ecss.extensions.dita.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.id.DITAUniqueAttributesRecognizerUtil`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `correctFragmentReferences(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragment, java.net.URL sourceURL, java.net.URL destinationURL)`

**Returns:** `void`

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The fragment to check for references and correct.
- `sourceURL` (`java.net.URL`): Source URL.
- `destinationURL` (`java.net.URL`): The URL of the file where the fragments will be inserted. References will be relative to this location.

### `updateNodeHrefsBeforeInsert(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> contentNodes, java.lang.String sourceSystemID, java.net.URL destinationURL)`

**Returns:** `void`

**Parameters:**
- `contentNodes` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `sourceSystemID` (`java.lang.String`)
- `destinationURL` (`java.net.URL`)

### `targetAlreadyExists(java.net.URL destinationURL, java.lang.String initialRefVal)`

**Returns:** `boolean`

**Parameters:**
- `destinationURL` (`java.net.URL`): New destination context.
- `initialRefVal` (`java.lang.String`): Initial reference.

