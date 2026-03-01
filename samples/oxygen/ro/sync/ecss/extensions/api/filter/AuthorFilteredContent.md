# Interface: `AuthorFilteredContent`

**Package:** [`ro.sync.ecss.extensions.api.filter`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.filter.AuthorFilteredContent`

**Extends:** `java.lang.CharSequence`

## Description

The content represents the entire text content of the Author page + additional markers/sentinels 
 at offsets which are pointed to by the AuthorNodes.
 Each AuthorNode points to specific start and end character markers in the content.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()

## Methods

### `getOriginalOffset(`int` filteredOffset)`

**Returns:** `int`

