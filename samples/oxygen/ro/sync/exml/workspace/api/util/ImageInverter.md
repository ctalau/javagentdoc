# Interface: `ImageInverter`

**Package:** [`ro.sync.exml.workspace.api.util`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.ImageInverter`

## Description

## Methods

### `loadImage(URL imageURL)`

Returns either a java.awt.image.BufferedImage for the standalone editor 
 or an org.eclipse.jface.resource.ImageDescriptor for the Oxygen plugin for Eclipse.

**Parameters:**
- `imageURL` (`java.net.URL`): The image URL

**Returns:** `java.lang.Object`

### `shouldInvertImage(Object image)`

**Parameters:**
- `image` (`java.lang.Object`): Either a java.awt.image.BufferedImage for the standalone editor 
   or an org.eclipse.jface.resource.ImageDescriptor for the Oxygen plugin for Eclipse

**Returns:** `boolean`

### `invertImage(Object image)`

In the standalone implementation the received image is inverted, in the Eclipse
 implementation a new ImageDescriptor instance is returned.

**Parameters:**
- `image` (`java.lang.Object`): The image. Either a java.awt.image.BufferedImage for the standalone editor 
   or an org.eclipse.jface.resource.ImageDescriptor for the Oxygen plugin for Eclipse

**Returns:** `java.lang.Object`

