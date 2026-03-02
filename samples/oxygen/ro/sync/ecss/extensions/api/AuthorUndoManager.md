# Class: `AuthorUndoManager`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorUndoManager`

**Extends:** `javax.swing.undo.UndoManager`

## Description

It allows to register listeners that are notified
 when undoable edits occur.

## Constructors

### `<init>()`

## Methods

### `addUndoableEditListener(UndoableEditListener listener)`

The listener is notified when an edit occurs, with the **previous** undoable edit.

**Parameters:**
- `listener` (`javax.swing.event.UndoableEditListener`): The listener to be added

**Returns:** `void`

### `removeUndoableEditListener(UndoableEditListener listener)`

**Parameters:**
- `listener` (`javax.swing.event.UndoableEditListener`): The listener to be removed

**Returns:** `void`

