# Class: `ProjectRendererCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`

## Description

## Constructors

### `<init>()`

## Methods

### `getDecorationIcon(java.io.File projectFile)`

**Returns:** `javax.swing.Icon`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

**Parameters:**
- `projectFile` (`java.io.File`): The file in the Project view.

### `getTooltip(java.io.File projectFile, java.lang.String defaultTooltip)`

**Returns:** `java.lang.String`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

**Parameters:**
- `projectFile` (`java.io.File`): The file in the Project view.
- `defaultTooltip` (`java.lang.String`): The default tooltip.

### `getName(java.io.File projectFile, java.lang.String defaultName)`

**Returns:** `java.lang.String`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

**Parameters:**
- `projectFile` (`java.io.File`): The file in the Project view.
- `defaultName` (`java.lang.String`): The default name.

