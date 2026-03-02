# Interface: `OffsetInformation`

**Package:** [`ro.sync.ecss.extensions.api.content`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.content.OffsetInformation`

## Description

If the offset is on a marker character the returned result will also contain the node which contains the range indicated by the marker. 
 

  
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

## Fields

### `IN_CONTENT`

**Type:** `int`

### `ON_START_MARKER`

**Type:** `int`

### `ON_END_MARKER`

**Type:** `int`

## Methods

### `getNodeForMarkerOffset()`

Example on the situations when this method returns a node:

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)

### `getNodeForOffset()`

Never `null`.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)

### `getPositionType()`

It returns one of the constants: #IN_CONTENT or #ON_START_MARKER or #ON_END_MARKER

**Returns:** `int`

