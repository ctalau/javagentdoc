# Class: `RenderingInformation`

**Package:** [`ro.sync.ecss.extensions.api.structure`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.structure.RenderingInformation`

**Extends:** [`ro.sync.exml.workspace.api.node.customizer.BasicRenderingInformation`](../../../../exml/workspace/api/node/customizer/BasicRenderingInformation.md)

## Description

## Fields

### `node`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)

### `additionalRenderedText`

**Type:** `java.lang.String`

This will be used only in the Outliner.
 By default it shows some node text content.

### `additionalRenderedAttributeValue`

**Type:** `java.lang.String`

This will be used only in the Outliner.
 By default it shows the value of the first attribute.

### `ignoreNodeFromDisplay`

**Type:** `boolean`

## Constructors

### `<init>(AuthorNode node, String renderedText, String additionalRenderedText, String tooltipText)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)): The node to render
- `renderedText` (`java.lang.String`): The rendered text. This will be used both in the Outliner and the Bread Crumb.
   By default it is usually the node name.
- `additionalRenderedText` (`java.lang.String`): The additional rendered text. This will be used only in the Outliner.
   By default it shows some node text content.
- `tooltipText` (`java.lang.String`): The tooltip text which will appear in the tooltip associated with the node

### `<init>(AuthorNode node, String renderedText, String additionalRenderedText, String additionalRenderedAttributeValue, String tooltipText)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)): The node to render
- `renderedText` (`java.lang.String`): The rendered text. This will be used both in the Outliner and the Bread Crumb.
   By default it is usually the node name.
- `additionalRenderedText` (`java.lang.String`): The additional rendered text. This will be used only in the Outliner.
   By default it shows some node text content .
- `additionalRenderedAttributeValue` (`java.lang.String`): The additional rendered attribute value. This will be used only in the Outliner.
   By default it shows the value of the first attribute.
- `tooltipText` (`java.lang.String`): The tooltip text which will appear in the tooltip associated with the node

## Methods

### `setAdditionalRenderedText(String additionalRenderedText)`

This will be used only in the Outliner.
 By default it shows some node text content.

**Parameters:**
- `additionalRenderedText` (`java.lang.String`): The additional rendered text. This will be used only in the Outliner.
   By default it shows some node text content.

**Returns:** `void`

### `setAdditionalRenderedAttributeValue(String additionalRenderedAttributeValue)`

This will be used only in the Outliner.
 By default it shows the value of the first attribute.

**Parameters:**
- `additionalRenderedAttributeValue` (`java.lang.String`): The additional rendered attribute value.

**Returns:** `void`

### `getAdditionalRenderedText()`

This will be used only in the Outliner.
 By default it shows some node text content.

**Returns:** `java.lang.String`

### `getAdditionalRenderedAttributeValue()`

This will be used only in the Outliner.
 By default it shows the value of the first attribute.

**Returns:** `java.lang.String`

### `getNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)

### `setIgnoreNodeFromDisplay(boolean ignoreNodeFromDisplay)`

This takes effect only on the Breadcrumb Customizer.

**Parameters:**
- `ignoreNodeFromDisplay` (`boolean`): Set this to `true` to ignore this node from being displayed.

**Returns:** `void`

### `isIgnoreNodeFromDisplay()`

**Returns:** `boolean`

