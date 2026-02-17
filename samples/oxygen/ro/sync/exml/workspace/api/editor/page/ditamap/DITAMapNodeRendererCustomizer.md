# Class: `DITAMapNodeRendererCustomizer`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer`

**Extends:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../node/customizer/XMLNodeRendererCustomizer.md)

## Description

## Constructors

### `<init>()`

## Methods

### `customizeComputedTopicrefTitle([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md) topicref, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md) targetTopicOrMap, `java.lang.String` defaultComputedTitle)`

**Returns:** `java.lang.String`

After the API returns the modified title, the title will be cached for the current referenced topic. 
 So this method is called usually once for every individual referenced topic.
 This kind of method is useful for example if you want to get some significant attributes 
 (maybe profiling attributes) from the topic's root element and display them in the title.

### `customizeRenderedTopicrefTitle([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md) topicref, `java.lang.String` defaultRenderedTitle)`

**Returns:** `java.lang.String`

This method is called very often, each time the tree or part of the tree is rendered.
 It is also called separately if there are multiple topicrefs pointing to the same topic.
  
 This kind of method is useful for example if you want to number topicrefs displayed in the DITA Maps Manager view based on depth.

### `getRenderingInformation([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../node/customizer/NodeRendererCustomizerContext.md) context)`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.BasicRenderingInformation`](../../../node/customizer/BasicRenderingInformation.md)

The context is an instance of DITAMapNodeRendererCustomizerContext which has more information about topicrefs.

### `getDescription()`

**Returns:** `java.lang.String`

