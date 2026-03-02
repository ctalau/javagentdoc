# Class: `RendererLayoutInfo`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`

## Description

The baseline and the size of the renderer are computed
 in a certain context.

## Fields

### `baseline`

**Type:** `int`

The baseline is measured from the top of the component.

### `size`

**Type:** `ro.sync.exml.view.graphics.Dimension`

## Constructors

### `<init>(int baseline, Dimension size)`

**Parameters:**
- `baseline` (`int`): The baseline of the rendering component.
- `size` (`ro.sync.exml.view.graphics.Dimension`): The size of the renderer.

## Methods

### `getBaseline()`

The baseline is measured from the top of the component. 
 This method is primarily meant for the layout manager to align components along their baseline.

**Returns:** `int`

### `getSize()`

**Returns:** `ro.sync.exml.view.graphics.Dimension`

