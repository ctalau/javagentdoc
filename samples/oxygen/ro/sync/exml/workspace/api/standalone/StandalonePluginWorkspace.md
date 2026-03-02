# Interface: `StandalonePluginWorkspace`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`

**Extends:** [`ro.sync.exml.workspace.api.PluginWorkspace`](../PluginWorkspace.md), [`ro.sync.exml.workspace.api.math.MathFlowConfigurator`](../math/MathFlowConfigurator.md), [`ro.sync.exml.workspace.api.standalone.DiffAndMergeTools`](./DiffAndMergeTools.md)

## Description

Each opened editor contains one or more pages.
 

 The current editor page can be accessed trough the WSEditor#getCurrentPage()
 method that returns specific editor implementations for Author and Text pages:
 

  - 
 WSAuthorEditorPage that provides access to Author editor page document controller or change tracking 
 controller 
  

  - 
  WSTextEditorPage that offers access to the edited document.
  

  

 Both text based editor pages provides informations and actions regarding the 
 caret position or the document current selection.

## Methods

### `addToolbarComponentsCustomizer(ro.sync.exml.workspace.api.standalone.ToolbarComponentsCustomizer componentsCustomizer)`

**Returns:** `void`

**IMPORTANT** This customizer must be set early, when the plugin extension's **applicationStarted** method gets called.
 

 **NOTICE** You will also receive notification for the Author extension toolbars (which are 
 dynamically constructed based on the document type of the current selected XML file).
 The notifications will be received before the toolbars are constructed after an XML editor which is opened in the Author page was selected.  
 Such toolbar IDs have the prefix "Author_custom_actions" and the suffix is a number depending 
 on how many toolbars were created for that specific document type.
 In this way you can dynamically filter or add to toolbar buttons already declared in the document type associated to the XML editor.

**Parameters:**
- `componentsCustomizer` ([`ro.sync.exml.workspace.api.standalone.ToolbarComponentsCustomizer`](./ToolbarComponentsCustomizer.md)): The tool bar components customizer.

### `addViewComponentCustomizer(ro.sync.exml.workspace.api.standalone.ViewComponentCustomizer viewComponentCustomizer)`

**Returns:** `void`

**IMPORTANT** This customizer must be set early, when the plugin extension's **applicationStarted** method gets called.

**Parameters:**
- `viewComponentCustomizer` ([`ro.sync.exml.workspace.api.standalone.ViewComponentCustomizer`](./ViewComponentCustomizer.md)): The views component customizer.

### `addMenuBarCustomizer(ro.sync.exml.workspace.api.standalone.MenuBarCustomizer menuBarCustomizer)`

**Returns:** `void`

**IMPORTANT** This customizer must be set early, when the plugin extension's **applicationStarted** method gets called.

**Parameters:**
- `menuBarCustomizer` ([`ro.sync.exml.workspace.api.standalone.MenuBarCustomizer`](./MenuBarCustomizer.md)): The menu bar components customizer.

### `addTopicRefTargetInfoProvider(java.lang.String protocol, ro.sync.exml.workspace.api.standalone.ditamap.TopicRefTargetInfoProvider targetInfoProvider)`

**Returns:** `void`

This method can be used by a CMS implementor to take control over the way Oxygen is gathering information about each topic reference.
 The protocol is the protocol of the URL of the opened DITA Map.
 
 For example when a DITA Map is opened in the DITA Maps Manager view the CMS can get called to compute titles for all topic references 
 instead of the default Oxygen behavior (requesting the entire content for the referenced URL).

**Parameters:**
- `protocol` (`java.lang.String`): The custom protocol of the opened DITA Map for which the plugin will compute the topic reference titles and auxiliary information.
- `targetInfoProvider` ([`ro.sync.exml.workspace.api.standalone.ditamap.TopicRefTargetInfoProvider`](ditamap/TopicRefTargetInfoProvider.md)): Gets called to resolve the title for the topic references in the DITA Map.

### `showView(java.lang.String viewID, boolean requestFocus)`

**Returns:** `void`

If the view is hidden, this method brings 
 it to front. If the view is in auto-hide state, this 
 method removes its auto-hide state and bring it to front.

**Parameters:**
- `viewID` (`java.lang.String`): The view ID.
- `requestFocus` (`boolean`): True to request the focus inside the view after show.

### `hideView(java.lang.String viewID)`

**Returns:** `void`

**Parameters:**
- `viewID` (`java.lang.String`): The view ID.

### `isViewShowing(java.lang.String viewID)`

**Returns:** `boolean`

**Parameters:**
- `viewID` (`java.lang.String`): The view ID.

### `isViewAvailable(java.lang.String viewID)`

**Returns:** `boolean`

**Parameters:**
- `viewID` (`java.lang.String`): The view ID.

### `hideToolbar(java.lang.String toolbarID)`

**Returns:** `void`

**Parameters:**
- `toolbarID` (`java.lang.String`): The toolbar ID.

### `showToolbar(java.lang.String toolbarID)`

**Returns:** `void`

If the toolbar is hidden, this method shows it.

**Parameters:**
- `toolbarID` (`java.lang.String`): The toolbar ID. You can install a toolbar component customizer and see all available IDs.

### `isToolbarShowing(java.lang.String toolbarID)`

**Returns:** `boolean`

**Parameters:**
- `toolbarID` (`java.lang.String`): The toolbar ID.

### `getOxygenActionID(javax.swing.Action action)`

**Returns:** `java.lang.String`

If the action appears on a contextual menu but is not installed on a main menu it will pe prefixed with the constant "ACTION_WITH_NO_SHORTCUT/"

**Parameters:**
- `action` (`javax.swing.Action`): The action for which to retrieve the ID.

### `getActionsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.actions.ActionsProvider`](actions/ActionsProvider.md)

It might be `null` when called in certain contexts (for example from the webapp application).

### `addMenusAndToolbarsContributorCustomizer(ro.sync.exml.workspace.api.standalone.actions.MenusAndToolbarsContributorCustomizer customizer)`

**Returns:** `void`

It will be notified to customize various menus and toolbars.

**Parameters:**
- `customizer` ([`ro.sync.exml.workspace.api.standalone.actions.MenusAndToolbarsContributorCustomizer`](actions/MenusAndToolbarsContributorCustomizer.md)): The customizer which will be notified to customize menus and toolbars.

### `removeMenusAndToolbarsContributorCustomizer(ro.sync.exml.workspace.api.standalone.actions.MenusAndToolbarsContributorCustomizer customizer)`

**Returns:** `void`

**Parameters:**
- `customizer` ([`ro.sync.exml.workspace.api.standalone.actions.MenusAndToolbarsContributorCustomizer`](actions/MenusAndToolbarsContributorCustomizer.md)): The customizer to remove.

### `createEditorComponentProvider(java.lang.String[] allowedPages, java.lang.String initialPage)`

**Returns:** [`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](../../../../ecss/extensions/api/component/EditorComponentProvider.md)

Such a component is a small XML editing container which can have
  all editing modes and can be added to a custom Swing-based dialog created
 by the developer in order for example to preview content from various target files.

**Parameters:**
- `allowedPages` (`java.lang.String[]`): The pages which will be used in the editor. One of the constant fields: 
 EditorPageConstants#PAGE_TEXT, EditorPageConstants#PAGE_AUTHOR, EditorPageConstants#PAGE_GRID
- `initialPage` (`java.lang.String`): The initial page in which the component will edit.

### `createEditorComponentProvider(java.lang.String[] allowedPages, java.lang.String initialPage, java.lang.String contentType)`

**Returns:** [`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](../../../../ecss/extensions/api/component/EditorComponentProvider.md)

Such a component is a small editing container which can have
  all editing modes and can be added to a custom Swing-based dialog created
 by the developer in order for example to preview content from various target files.

**Parameters:**
- `allowedPages` (`java.lang.String[]`): The pages which will be used in the editor. One of the constant fields: 
 EditorPageConstants#PAGE_TEXT, EditorPageConstants#PAGE_AUTHOR, EditorPageConstants#PAGE_GRID
- `initialPage` (`java.lang.String`): The initial page in which the component will edit.
- `contentType` (`java.lang.String`): The proposed content type for the component, `null` to fall back to XML content type.

### `createAuthorPreviewComponentProvider()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.AuthorPreviewComponentProvider`](../editor/page/author/AuthorPreviewComponentProvider.md)

### `getResourceBundle()`

**Returns:** [`ro.sync.exml.workspace.api.PluginResourceBundle`](../PluginResourceBundle.md)

It works as a map in which any message is accessed by a specific key.
 The translation file must be located in a directory named "i18n" (placed in the plugin's root directory).
 The translation file name must be: **translation*.xml** 
 Here is a small sample of an translation XML file structure: 
 
 

```

 
 <translation>
     <languageList>
       <language description="English US" lang="en_US"/>
       <language description="German" lang="de_DE"/>
       <language description="French" lang="fr_FR"/>
    </languageList>
    <key value="key_name1">
       <comment>key description1</comment>
      <val lang="en_US">en_US_translation1</val>
      <val lang="de_DE">de_DE_translation1</val>
      <val lang="fr_FR">fr_FR_translation1</val>
  </key>
   <key value="key_name2">
       <comment>key description2</comment>
      <val lang="en_US">en_US_translation2</val>
      <val lang="de_DE">de_DE_translation2</val>
      <val lang="fr_FR">fr_FR_translation2</val>
  </key>
  ........................
 </translation>
 
 

```

### `getProxyDetailsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.proxy.ProxyDetailsProvider`](proxy/ProxyDetailsProvider.md)

### `getProjectManager()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.project.ProjectController`](project/ProjectController.md)

### `addPluginExtension(java.lang.String extensionType, ro.sync.exml.plugin.PluginExtension pluginExtension)`

**Returns:** `void`

**Parameters:**
- `extensionType` (`java.lang.String`): The type of the plugin extension; can be a constant from {@linkro.sync.exml.plugin.PluginDescriptor }.
- `pluginExtension` ([`ro.sync.exml.plugin.PluginExtension`](../../../plugin/PluginExtension.md)): The plugin extension implementation to be added.

