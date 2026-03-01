# Interface: `AuthorNodeRendererCustomizer`

**Package:** [`ro.sync.ecss.extensions.api.structure`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.structure.AuthorNodeRendererCustomizer`

## Description

## Methods

### `customizeRenderingInformation([`ro.sync.ecss.extensions.api.structure.RenderingInformation`](./RenderingInformation.md) renderInfo)`

**Returns:** `void`

By default a node is represented in the Outline by its tag name and a additional information obtained 
 from a specific attribute or text. You can set custom values for each rendered field.
 
 If you need to change the way the XML elements are displayed, you may consider 
 using a configuration file.
 For more information, search the oXygen documentation for "cc_config.xml" 
 configuration file. 
 For DITA, this file is in "frameworks/dita/resources/cc_config.xml".

