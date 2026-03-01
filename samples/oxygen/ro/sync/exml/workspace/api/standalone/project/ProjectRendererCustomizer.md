# Class: `ProjectRendererCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`

## Description

## Constructors

### `<init>()`

## Methods

### `getDecorationIcon(`java.io.File` projectFile)`

**Returns:** `javax.swing.Icon`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

### `getTooltip(`java.io.File` projectFile, `java.lang.String` defaultTooltip)`

**Returns:** `java.lang.String`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

### `getName(`java.io.File` projectFile, `java.lang.String` defaultName)`

**Returns:** `java.lang.String`

This callback comes very often, each time the Project Swing JTree is repainted, so the developers implementing it
 need to develop their own internal caches.

