# Interface: `ReferencesCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ReferencesCustomizer`

## Description

## Methods

### `addInputURLChooserCustomizer([`ro.sync.exml.workspace.api.standalone.InputURLChooserCustomizer`](./InputURLChooserCustomizer.md) inputURLChooserCustomizer)`

**Returns:** `void`

These actions are available in 
 Oxygen, in any control or dialog that contains an URL input box. 
 

 **IMPORTANT** This customizer must be set early, when the plugin extension's **applicationStarted** 
 method gets called or after the AuthorComponentFactory was initialized (if running the Author component).
 

 *Example:* If a CMS developer wants the user to choose the URL from their custom CMS chooser 
 then it will add a new action (possibly removing the others).
 When the new action gets called the custom code shows the custom chooser and at the end it can call the 
 **ro.sync.exml.workspace.api.standalone.InputURLChooser** interface to set the new URL in the combo box.

### `addRelativeReferencesResolver(`java.lang.String` protocol, [`ro.sync.exml.workspace.api.util.RelativeReferenceResolver`](../util/RelativeReferenceResolver.md) resolver)`

**Returns:** `void`

This method can be used by a CMS implementor to take control over the way Oxygen is computing relative references for a certain URL protocol.
 For example when inserting in a DITA Topic a reference to an image Oxygen will try to make the reference relative to the current XML document.
 If the DITA Topic is opened using your custom URL protocol you can take control over they way in which the relative path is computed.

