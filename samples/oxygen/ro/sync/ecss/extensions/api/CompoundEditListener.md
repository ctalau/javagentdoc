# Interface: `CompoundEditListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.CompoundEditListener`

## Description

## Methods

### `compoundEditStarted()`

**Returns:** `void`

A compound edit can be started by calling AuthorDocumentController#beginCompoundEdit().
 Note that this callback will not be invoked for nested calls of AuthorDocumentController#beginCompoundEdit(),
 but only for the first one.

### `compoundEditEnded()`

**Returns:** `void`

A compound edit can be ended by calling AuthorDocumentController#endCompoundEdit().
 Note that this callback will not be invoked for nested calls of AuthorDocumentController#endCompoundEdit(),
 but only for the last one.

### `compoundEditCancelled()`

**Returns:** `void`

A compound edit can be cancelled by calling AuthorDocumentController#cancelCompoundEdit().
 
 When a compound edit is cancelled, the edits performed so far are automatically undone 
 before this callback is invoked. After that, an #compoundEditEnded() call is also received.

### `beforeCompoundEditCancelled()`

**Returns:** `void`

A compound edit can be cancelled by calling AuthorDocumentController#cancelCompoundEdit().
 
 When a compound edit is cancelled, the edits performed so far are automatically undone 
 before this callback is invoked. After that, an #compoundEditEnded() call is also received.

