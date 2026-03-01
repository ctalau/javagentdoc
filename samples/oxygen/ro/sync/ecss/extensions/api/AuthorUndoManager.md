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

### `addUndoableEditListener(`javax.swing.event.UndoableEditListener` listener)`

**Returns:** `void`

The listener is notified when an edit occurs, with the **previous** undoable edit.

### `removeUndoableEditListener(`javax.swing.event.UndoableEditListener` listener)`

**Returns:** `void`

