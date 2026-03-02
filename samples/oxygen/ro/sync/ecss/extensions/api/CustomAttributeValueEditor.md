# Class: `CustomAttributeValueEditor`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.CustomAttributeValueEditor`

**Implements:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getAttributeValue(ro.sync.ecss.extensions.api.EditedAttribute attribute, java.lang.Object parentComponent)`

**Returns:** `java.lang.String`

**Parameters:**
- `attribute` ([`ro.sync.ecss.extensions.api.EditedAttribute`](./EditedAttribute.md)): The attribute to be edited.
- `parentComponent` (`java.lang.Object`): The parent component, usually the table in which the user double clicked the value. Used for example to find the parent window/shell when creating dialogs.
 
It is very important to set the parent of the dialog used as custom editor when showing it from oXygen's
 in-place attribute-editing dialog in the Author page. This needs to be done in order for oXygen's in-place attribute editor
 not to disappear when presenting the custom attribute value editor.

 The code that creates a simple input dialog as a custom editor, with the proper parent dialog, for the stand-alone oXygen,
 looks as following:
 

```

 public String getAttributeValue(EditedAttribute attribute, Object parentComponent)
     throws CancelledByUserException {
   String attrValue = null;
   PluginWorkspace pluginWorkspace = PluginWorkspaceProvider.getPluginWorkspace();
   Platform platform = pluginWorkspace.getPlatform();
   if (platform == Platform.STANDALONE) {
     // Find the parent window
     Component parent = (Component) parentComponent;
     while (!(parent instanceof Window)) {
       parent = parent.getParent();
     }
     attrValue = JOptionPane.showInputDialog(
         parent,
         "Set a new value for \"" + attribute.getAttributeQName() + "\":");
   }
   return attrValue;
 }
 
```

 For the Eclipse plug-in, the code changes into:
 

```

 public String getAttributeValue(EditedAttribute attribute, Object parentComponent)
     throws CancelledByUserException {
   String attrValue = null;
   PluginWorkspace pluginWorkspace = PluginWorkspaceProvider.getPluginWorkspace();
   Platform platform = pluginWorkspace.getPlatform();
   if (platform == Platform.ECLIPSE) {
     // Find the parent shell
     Control parent = (Control) parentComponent;
     while (!(parent instanceof Shell)) {
       parent = parent.getParent();
     }
     InputDialog inputDialog = new InputDialog(
         (Shell) parent,
         "Edit attribute",
         "Set a new value for \"" + attribute.getAttributeQName() + "\":",
         null,
         null);
     if (inputDialog.open() == org.eclipse.jface.window.Window.OK) {
       // OK pressed. Get the value.
       attrValue = inputDialog.getValue();
     }
   }
   return attrValue;
 }
 
```


### `shouldHandleAttribute(ro.sync.ecss.extensions.api.EditedAttribute attribute)`

**Returns:** `boolean`

**Parameters:**
- `attribute` ([`ro.sync.ecss.extensions.api.EditedAttribute`](./EditedAttribute.md)): The attribute.

### `shouldHandleAttribute(ro.sync.ecss.extensions.api.EditedAttribute attribute, ro.sync.ecss.extensions.api.CustomAttributeValueEditingContext editContext)`

**Returns:** `boolean`

**Parameters:**
- `attribute` ([`ro.sync.ecss.extensions.api.EditedAttribute`](./EditedAttribute.md)): The attribute.
- `editContext` ([`ro.sync.ecss.extensions.api.CustomAttributeValueEditingContext`](./CustomAttributeValueEditingContext.md)): The context from the editing is invoked. 
 Can be CustomAttributeValueEditingContext#ATTRIBUTES_TABLE_CELL_CONTEXT or 
 CustomAttributeValueEditingContext#CUSTOM_EDIT_BUTTON_CONTEXT

### `getTooltipButtonInfo(ro.sync.ecss.extensions.api.EditedAttribute attribute)`

**Returns:** [`ro.sync.ecss.extensions.api.TooltipIconInfo`](./TooltipIconInfo.md)

**Parameters:**
- `attribute` ([`ro.sync.ecss.extensions.api.EditedAttribute`](./EditedAttribute.md)): The attribute to be edited.

