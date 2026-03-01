# Interface: `ViewComponentCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ViewComponentCustomizer`

## Description

## Fields

### `CUSTOM`

**Type:** `java.lang.String`

## Methods

### `customizeView([`ro.sync.exml.workspace.api.standalone.ViewInfo`](./ViewInfo.md) viewInfo)`

**Returns:** `void`

This callback may be called multiple times if the application
 views layout (perspective) changes or is reloaded so you should strive to create your Swing components for a certain view ID only once.

