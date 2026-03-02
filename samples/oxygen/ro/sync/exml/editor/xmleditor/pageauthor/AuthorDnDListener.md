# Interface: `AuthorDnDListener`

**Package:** [`ro.sync.exml.editor.xmleditor.pageauthor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.xmleditor.pageauthor.AuthorDnDListener`

**Extends:** [`ro.sync.ecss.extensions.api.AWTExtension`](../../../../ecss/extensions/api/AWTExtension.md)

## Description

The `AuthorDnDListener` interface 
 is the callback interface used by the author editor page to provide 
 notification of DnD operations that involve it.
 

 Create a listener object by implementing the interface and then when 
 the drag enters, moves over, or exits
 the author editor page, when 
 the drop action changes, and when the drop occurs, the relevant method in 
 the listener object is invoked, and the `DropTargetEvent` is 
 passed to it.

## Methods

### `authorDragOver(java.awt.dnd.DropTargetDragEvent event)`

**Returns:** `boolean`

**Parameters:**
- `event` (`java.awt.dnd.DropTargetDragEvent`): The DropTargetDropEvent event.

### `authorDrop(java.awt.datatransfer.Transferable transferable, java.awt.dnd.DropTargetDropEvent event)`

**Returns:** `boolean`

This method is responsible for undertaking
 the transfer of the data associated with the
 gesture. The `DropTargetDropEvent` 
 provides a means to obtain a `Transferable`
 object that represents the data object(s) to 
 be transfered.

**Parameters:**
- `transferable` (`java.awt.datatransfer.Transferable`): The Transferable object.
- `event` (`java.awt.dnd.DropTargetDropEvent`): The DropTargetDragEvent event.

### `authorSupportsFlavor(java.awt.datatransfer.DataFlavor flavor)`

**Returns:** `boolean`

**Parameters:**
- `flavor` (`java.awt.datatransfer.DataFlavor`): The DataFlavor flavor.

### `authorDragExit(java.awt.dnd.DropTargetEvent event)`

**Returns:** `boolean`

**Parameters:**
- `event` (`java.awt.dnd.DropTargetEvent`): The DropTargetEvent event.

### `authorDragEnter(java.awt.dnd.DropTargetDragEvent event)`

**Returns:** `boolean`

**Parameters:**
- `event` (`java.awt.dnd.DropTargetDragEvent`): The DropTargetDragEvent event.

### `init(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../ecss/extensions/api/AuthorAccess.md)): The AuthorAccess providing access to 
 specific components corresponding to editor, document, workspace, 
 tables, change tracking and utility informations and actions.

