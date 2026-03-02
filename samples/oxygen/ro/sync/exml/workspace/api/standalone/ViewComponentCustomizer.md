# Interface: `ViewComponentCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ViewComponentCustomizer`

## Description

## Fields

### `CUSTOM`

**Type:** `java.lang.String`

## Methods

### `customizeView(ro.sync.exml.workspace.api.standalone.ViewInfo viewInfo)`

This callback may be called multiple times if the application
 views layout (perspective) changes or is reloaded so you should strive to create your Swing components for a certain view ID only once.

**Parameters:**
- `viewInfo` ([`ro.sync.exml.workspace.api.standalone.ViewInfo`](./ViewInfo.md)): Information about a view. The view ID is either the ID of an existing Oxygen
                   view or the reserved **CUSTOM** view.
   
   
  You can set a new component to display for the view, new title or icon.

**Returns:** `void`

