# Interface: `ImageInverter`

**Package:** [`ro.sync.exml.workspace.api.util`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.ImageInverter`

## Description

## Methods

### `loadImage(`java.net.URL` imageURL)`

**Returns:** `java.lang.Object`

Returns either a java.awt.image.BufferedImage for the standalone editor 
 or an org.eclipse.jface.resource.ImageDescriptor for the Oxygen plugin for Eclipse.

### `shouldInvertImage(`java.lang.Object` image)`

**Returns:** `boolean`

### `invertImage(`java.lang.Object` image)`

**Returns:** `java.lang.Object`

In the standalone implementation the received image is inverted, in the Eclipse
 implementation a new ImageDescriptor instance is returned.

