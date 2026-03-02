# Class: `ProjectRendererCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`

## Description

## Constructors

### `<init>()`

## Methods

### `getDecorationIcon(java.io.File projectFile)`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

**Parameters:**
- `projectFile` (`java.io.File`): The file in the Project view.

**Returns:** `javax.swing.Icon`

### `getTooltip(java.io.File projectFile, java.lang.String defaultTooltip)`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

**Parameters:**
- `projectFile` (`java.io.File`): The file in the Project view.
- `defaultTooltip` (`java.lang.String`): The default tooltip.

**Returns:** `java.lang.String`

### `getName(java.io.File projectFile, java.lang.String defaultName)`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

**Parameters:**
- `projectFile` (`java.io.File`): The file in the Project view.
- `defaultName` (`java.lang.String`): The default name.

**Returns:** `java.lang.String`

