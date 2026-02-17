# Class: `TooltipInformation`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author.tooltip`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.tooltip.TooltipInformation`

## Description

## Fields

### `description`

**Type:** `java.lang.String`

Can be `null`

### `mouseX`

**Type:** `int`

### `mouseY`

**Type:** `int`

### `hoveredNode`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md)

### `tooltipOriginInformation`

**Type:** `java.lang.String`

### `ORIGIN_CALLOUTS`

**Type:** `java.lang.String`

### `ORIGIN_FORM_CONTROLS`

**Type:** `java.lang.String`

### `ORIGIN_LINK`

**Type:** `java.lang.String`

### `ORIGIN_PROFILING_CONDITIONS`

**Type:** `java.lang.String`

### `ORIGIN_SCHEMA_DESCRIPTION`

**Type:** `java.lang.String`

### `ORIGIN_IMAGE`

**Type:** `java.lang.String`

### `ORIGIN_ERROR_NODE`

**Type:** `java.lang.String`

### `ORIGIN_VALIDATION_ERROR`

**Type:** `java.lang.String`

### `ORIGIN_CHANGE_MARKERS`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` description, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md) hoveredNode, `java.lang.String` tooltipOriginInformation, `int` mouseX, `int` mouseY)`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `setDescription(`java.lang.String` description)`

**Returns:** `void`

The description can also be in HTML format.

### `getMouseX()`

**Returns:** `int`

### `getMouseY()`

**Returns:** `int`

### `getHoveredNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md)

### `getHoveredErrorOriginInformation()`

**Returns:** `java.lang.String`

Can be `null`.

