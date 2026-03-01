# Interface: `Content`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.Content`

## Description

## Methods

### `createPosition(`int` offset)`

**Returns:** `javax.swing.text.Position`

The position offset is changed as the
 content is edited.

### `getLength()`

**Returns:** `int`

### `insertChars(`int` where, `char[]` ch, `int` start, `int` length)`

**Returns:** `void`

### `remove(`int` where, `int` nitems)`

**Returns:** `void`

### `getString(`int` where, `int` len)`

**Returns:** `java.lang.String`

### `getChars(`int` where, `int` len, `javax.swing.text.Segment` chars)`

**Returns:** `void`

If the desired content spans the gap, we copy the content.  
 If the desired content does not span the gap, the actual store is returned to avoid the copy since
 it is contiguous.

