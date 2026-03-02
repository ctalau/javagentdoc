# Class: `DITAMapNodeRendererCustomizer`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer`

**Extends:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../node/customizer/XMLNodeRendererCustomizer.md)

## Description

## Constructors

### `<init>()`

## Methods

### `customizeComputedTopicrefTitle(ro.sync.ecss.extensions.api.node.AuthorNode topicref, ro.sync.ecss.extensions.api.node.AuthorNode targetTopicOrMap, java.lang.String defaultComputedTitle)`

**Returns:** `java.lang.String`

After the API returns the modified title, the title will be cached for the current referenced topic. 
 So this method is called usually once for every individual referenced topic.
 This kind of method is useful for example if you want to get some significant attributes 
 (maybe profiling attributes) from the topic's root element and display them in the title.

**Parameters:**
- `topicref` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)): The topicref node present in the DITA Maps Manager
- `targetTopicOrMap` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)): Oxygen already parsed the document referenced via topicref, computed a title
  and this parameter gives you access to the root element of the parsed topic.
- `defaultComputedTitle` (`java.lang.String`): The default title computed by Oxygen

### `customizeRenderedTopicrefTitle(ro.sync.ecss.extensions.api.node.AuthorNode topicref, java.lang.String defaultRenderedTitle)`

**Returns:** `java.lang.String`

This method is called very often, each time the tree or part of the tree is rendered.
 It is also called separately if there are multiple topicrefs pointing to the same topic.
  
 This kind of method is useful for example if you want to number topicrefs displayed in the DITA Maps Manager view based on depth.

**Parameters:**
- `topicref` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../ecss/extensions/api/node/AuthorNode.md)): The topicref node present in the DITA Maps Manager
- `defaultRenderedTitle` (`java.lang.String`): The default title which will be rendered by Oxygen

### `getRenderingInformation(ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext context)`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.BasicRenderingInformation`](../../../node/customizer/BasicRenderingInformation.md)

The context is an instance of DITAMapNodeRendererCustomizerContext which has more information about topicrefs.

**Parameters:**
- `context` ([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../node/customizer/NodeRendererCustomizerContext.md))

### `getDescription()`

**Returns:** `java.lang.String`

