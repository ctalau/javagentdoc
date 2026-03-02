# Class: `WSEditorPageChangedListener`

**Package:** [`ro.sync.exml.workspace.api.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.listeners.WSEditorPageChangedListener`

## Description

Notified when an opened editor switches to another page.

## Constructors

### `<init>()`

## Methods

### `editorPageAboutToBeChangedVeto(java.lang.String newPageID)`

**Parameters:**
- `newPageID` (`java.lang.String`): The ID of the page to which the user switched, one of the constant fields: 
   EditorPageConstants#PAGE_TEXT, EditorPageConstants#PAGE_AUTHOR, EditorPageConstants#PAGE_GRID, 
   EditorPageConstants#PAGE_DESIGN, EditorPageConstants#PAGE_DITA_MAP

**Returns:** `boolean`

### `editorPageChanged()`

**Returns:** `void`

