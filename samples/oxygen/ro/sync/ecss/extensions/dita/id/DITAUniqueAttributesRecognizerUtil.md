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

### `correctFragmentReferences(AuthorDocumentFragment fragment, URL sourceURL, URL destinationURL)`

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The fragment to check for references and correct.
- `sourceURL` (`java.net.URL`): Source URL.
- `destinationURL` (`java.net.URL`): The URL of the file where the fragments will be inserted. References will be relative to this location.

**Returns:** `void`

### `updateNodeHrefsBeforeInsert(List<AuthorNode> contentNodes, String sourceSystemID, URL destinationURL)`

**Parameters:**
- `contentNodes` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `sourceSystemID` (`java.lang.String`)
- `destinationURL` (`java.net.URL`)

**Returns:** `void`

### `targetAlreadyExists(URL destinationURL, String initialRefVal)`

**Parameters:**
- `destinationURL` (`java.net.URL`): New destination context.
- `initialRefVal` (`java.lang.String`): Initial reference.

**Returns:** `boolean`

