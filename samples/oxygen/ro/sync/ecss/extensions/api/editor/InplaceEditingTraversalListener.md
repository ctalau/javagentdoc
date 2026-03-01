# Interface: `InplaceEditingTraversalListener`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceEditingTraversalListener`

## Description

The next edit position will
 be computed and edititng will be started.
 
 If the editor is a SWING implementation it will only have to provide these 
 notifications if it declares itself a focus cycle root using {Container#setFocusCycleRoot(boolean)}. 
 Otherwise the author panel will intercept this cycle events and handle them automatically.
 
 If the editor is a SWT implementation it will have to add a org.eclipse.swt.events.TraverseListener
 and forward SWT.TRAVERSE_TAB_NEXT and SWT.TRAVERSE_TAB_PREVIOUS events.

## Methods

### `nextEditLocationRequested()`

**Returns:** `void`

### `previousEditLocationRequested()`

**Returns:** `void`

