# Interface: `ImageUtilitiesSpecificProvider`

**Package:** [`ro.sync.exml.workspace.api.images`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.ImageUtilitiesSpecificProvider`

## Description

## Methods

### `getIconDecoration(java.net.URL resource)`

**Returns:** `java.lang.Object`

For example if the URL ends in ".xml", this utility returns a small XML-symbol image.
 This is only implemented in the Swing-based application.

**Parameters:**
- `resource` (`java.net.URL`): The resource URL.

### `loadIcon(java.net.URL resource)`

**Returns:** `java.lang.Object`

When running on a retina or HiDPI display, the application will try to load a corresponding image for the current display.
 Also when running in a dark theme the dark icon will be loaded if available. 
 
This topic explains how the application tries to load an image based on the initial given image location and on the display type:
 https://www.oxygenxml.com/doc/versions/18/ug-author/topics/using-retina-hidpi-images.html 
 
 
 For the Swing-based application, the returned icon is an instance of javax.swing.ImageIcon.
 

 For the Eclipse-based plugin the returned icon is an instance of org.eclipse.jface.resource.ImageDescriptor.
 
 


 An example of loading an icon from Oxygen's existing set of icons:
 


 `PluginWorkspaceProvider.getPluginWorkspace().getImageUtilities()
 .loadIcon(ro.sync.exml.Oxygen.class.getResource("/images/OptionsShortcut16.png"));`

**Parameters:**
- `resource` (`java.net.URL`): The resource URL

