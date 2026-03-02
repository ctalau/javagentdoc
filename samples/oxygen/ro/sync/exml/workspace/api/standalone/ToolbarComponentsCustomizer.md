# Interface: `ToolbarComponentsCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ToolbarComponentsCustomizer`

## Description

## Fields

### `CUSTOM`

**Type:** `java.lang.String`

## Methods

### `customizeToolbar(ro.sync.exml.workspace.api.standalone.ToolbarInfo toolbarInfo)`

**NOTICE** You will also receive notification for the Author extension toolbars (which are 
 dynamically constructed based on the document type of the current selected XML file).
 The notifications will be received before the toolbars are constructed after an XML editor which is opened in the Author page was selected.  
 Such toolbar IDs have the prefix "Author_custom_actions" and the suffix is a number depending on 
 how many toolbars were created for that specific document type.
 In this way you can dynamically filter or add to toolbar buttons already declared in the document type associated to the XML editor.
 

 **NOTICE** Notifications will arrive for the Dita Map Manager toolbars too. These toolbars have the IDs:
 

  - ro.sync.exml.MainFrameComponentsConstants#TOOLBAR_DITA_MAP_GLOBAL

  - ro.sync.exml.MainFrameComponentsConstants#TOOLBAR_DITA_MAP_EXTEND

  - ro.sync.exml.MainFrameComponentsConstants#TOOLBAR_DITA_MAP_CUSTOM

**Parameters:**
- `toolbarInfo` ([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](./ToolbarInfo.md)): Information about the toolbar (id, default components to add, title).
   The toolbar ID is either the ID of an existing Oxygen toolbar or the reserved **CUSTOM** toolbar.
   All Oxygen toolbars IDs are found in ro.sync.exml.MainFrameComponentsConstants and begin with TOOLBAR_ prefix. 
   
   You can set new components in the toolbar and change its title.

**Returns:** `void`

