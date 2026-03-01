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

### `<init>([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md) node, `java.lang.String` renderedText, `java.lang.String` additionalRenderedText, `java.lang.String` tooltipText)`

### `<init>([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md) node, `java.lang.String` renderedText, `java.lang.String` additionalRenderedText, `java.lang.String` additionalRenderedAttributeValue, `java.lang.String` tooltipText)`

## Methods

### `setAdditionalRenderedText(`java.lang.String` additionalRenderedText)`

**Returns:** `void`

This will be used only in the Outliner.
 By default it shows some node text content.

### `setAdditionalRenderedAttributeValue(`java.lang.String` additionalRenderedAttributeValue)`

**Returns:** `void`

This will be used only in the Outliner.
 By default it shows the value of the first attribute.

### `getAdditionalRenderedText()`

**Returns:** `java.lang.String`

This will be used only in the Outliner.
 By default it shows some node text content.

### `getAdditionalRenderedAttributeValue()`

**Returns:** `java.lang.String`

This will be used only in the Outliner.
 By default it shows the value of the first attribute.

### `getNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)

### `setIgnoreNodeFromDisplay(`boolean` ignoreNodeFromDisplay)`

**Returns:** `void`

This takes effect only on the Breadcrumb Customizer.

### `isIgnoreNodeFromDisplay()`

**Returns:** `boolean`

