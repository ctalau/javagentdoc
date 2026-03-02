# Interface: `Content`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.Content`

## Description

## Methods

### `createPosition(int offset)`

**Returns:** `javax.swing.text.Position`

The position offset is changed as the
 content is edited.

**Parameters:**
- `offset` (`int`): The offset in the content >= 0

### `getLength()`

**Returns:** `int`

### `insertChars(int where, char[] ch, int start, int length)`

**Returns:** `void`

**Parameters:**
- `where` (`int`): Offset into the content to make the insertion >= 0
- `ch` (`char[]`): The char buffer to insert from.
- `start` (`int`): Start of useful data in the char buffer.
- `length` (`int`): Length of useful data in the char buffer.

### `remove(int where, int nitems)`

**Returns:** `void`

**Parameters:**
- `where` (`int`): The offset into the sequence to make the removal >= 0.
- `nitems` (`int`): The number of items in the sequence to be removed >= 0.

### `getString(int where, int len)`

**Returns:** `java.lang.String`

**Parameters:**
- `where` (`int`): Offset into the sequence to fetch >= 0.
- `len` (`int`): Number of characters to copy >= 0.

### `getChars(int where, int len, javax.swing.text.Segment chars)`

**Returns:** `void`

If the desired content spans the gap, we copy the content.  
 If the desired content does not span the gap, the actual store is returned to avoid the copy since
 it is contiguous.

**Parameters:**
- `where` (`int`): The starting position >= 0, where + len <= length()
- `len` (`int`): The number of characters to be retrieved >= 0
- `chars` (`javax.swing.text.Segment`): The Segment object to return the characters into.

