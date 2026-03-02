# Interface: `InputURLChooserCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.InputURLChooserCustomizer`

## Description

## Methods

### `customizeBrowseActions(List<Action> existingBrowseActions, InputURLChooser chooser)`

**Parameters:**
- `existingBrowseActions` (`java.util.List<javax.swing.Action>`): The existing list of actions. 
   The first action in the list will be the default one (performed when the drop-down button is clicked). 
   
   
   
   
   *Note:* If a new action is added to the browse action list, a custom icon must be set on the action 
   for situations when its text is not used for display.
   
   
  For the Eclipse plugin the instances can be cast to "com.oxygenxml.editor.editors.EclipseActionWrapper" 
   and obtain the internal Eclipse action. To add a new action, just add it inside a new EclipseActionWrapper instance.
- `chooser` ([`ro.sync.exml.workspace.api.standalone.InputURLChooser`](./InputURLChooser.md)): The chooser which will get called to set the new URL by the custom code after the user has chosen the new URL.

**Returns:** `void`

