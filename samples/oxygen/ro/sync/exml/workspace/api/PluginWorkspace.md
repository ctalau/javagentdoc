# Interface: `PluginWorkspace`

**Package:** [`ro.sync.exml.workspace.api`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.PluginWorkspace`

**Extends:** [`ro.sync.exml.workspace.api.Workspace`](./Workspace.md), [`ro.sync.exml.workspace.api.standalone.ReferencesCustomizer`](standalone/ReferencesCustomizer.md), [`ro.sync.exml.workspace.api.options.GlobalOptionsStorage`](options/GlobalOptionsStorage.md)

## Description

## Fields

### `MAIN_EDITING_AREA`

**Type:** `int`

### `DITA_MAPS_EDITING_AREA`

**Type:** `int`

## Methods

### `getAllEditorLocations(int editingArea)`

**Returns:** `java.net.URL[]`

In such cases
 the URLs for these not yet instantiated editors are not returned by this method.

**Parameters:**
- `editingArea` (`int`): One of the constants in this class:
 

 #MAIN_EDITING_AREA - for the editors in the main Oxygen workspace area.
 

 #DITA_MAPS_EDITING_AREA - for the editors in the DITA Maps Manager view workspace area.
 


### `getEditorAccess(java.net.URL location, int editingArea)`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](editor/WSEditor.md)

**Parameters:**
- `location` (`java.net.URL`): The editor location
- `editingArea` (`int`): One of the constants in this class:
 

 #MAIN_EDITING_AREA - for the editors in the main Oxygen workspace area.
 

 #DITA_MAPS_EDITING_AREA - for the editors in the DITA Maps Manager view workspace area.
 


### `getCurrentEditorAccess(int editingArea)`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](editor/WSEditor.md)

**Parameters:**
- `editingArea` (`int`): One of the constants in this class:
 

 #MAIN_EDITING_AREA - for the editors in the main Oxygen workspace area.
 

 #DITA_MAPS_EDITING_AREA - for the editors in the DITA Maps Manager view workspace area.
 


### `getXMLUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.XMLUtilAccess`](util/XMLUtilAccess.md)

### `getCompareUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.CompareUtilAccess`](util/CompareUtilAccess.md)

### `getUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.UtilAccess`](util/UtilAccess.md)

### `getValidationUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.validation.ValidationUtilAccess`](util/validation/ValidationUtilAccess.md)

### `getXMLRefactorUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.refactor.XMLRefactorUtilAccess`](util/refactor/XMLRefactorUtilAccess.md)

### `getResultsManager()`

**Returns:** [`ro.sync.exml.workspace.api.results.ResultsManager`](results/ResultsManager.md)

### `addEditorChangeListener(ro.sync.exml.workspace.api.listeners.WSEditorChangeListener editorListener, int editingArea)`

**Returns:** `void`

**Parameters:**
- `editorListener` ([`ro.sync.exml.workspace.api.listeners.WSEditorChangeListener`](listeners/WSEditorChangeListener.md)): The listener notified when an editor is added, removed or the editor page is changed.
- `editingArea` (`int`): One of the constants in this class:
 

 #MAIN_EDITING_AREA - for the editors in the main Oxygen workspace area.
 

 #DITA_MAPS_EDITING_AREA - for the editors in the DITA Maps Manager view workspace area.
 


### `removeEditorChangeListener(ro.sync.exml.workspace.api.listeners.WSEditorChangeListener editorListener, int editingArea)`

**Returns:** `void`

**Parameters:**
- `editorListener` ([`ro.sync.exml.workspace.api.listeners.WSEditorChangeListener`](listeners/WSEditorChangeListener.md)): The listener notified when an editor is added, removed or the editor page is changed.
- `editingArea` (`int`): One of the constants in this class:
 

 #MAIN_EDITING_AREA - for the editors in the main Oxygen workspace area.
 

 #DITA_MAPS_EDITING_AREA - for the editors in the DITA Maps Manager view workspace area.
 


### `getEditorChangeListeners(int editingArea)`

**Returns:** [`ro.sync.exml.workspace.api.listeners.WSEditorChangeListener[]`](listeners/WSEditorChangeListener.md)

**Parameters:**
- `editingArea` (`int`): One of the constants in this class:
 

 #MAIN_EDITING_AREA - for the editors in the main Oxygen workspace area.
 

 #DITA_MAPS_EDITING_AREA - for the editors in the DITA Maps Manager view workspace area.

### `getOptionsStorage()`

**Returns:** [`ro.sync.exml.workspace.api.options.WSOptionsStorage`](options/WSOptionsStorage.md)

It is also responsible for adding and removing listeners that are notified
 about the option changes.
 These keys are common to all plugin implementations.

### `setDITAKeyDefinitionManager(ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionManager keyDefitionManager)`

**Returns:** `void`

This API can be used by the developer to take control over the key definitions which will be used to resolve keyrefs and conkeyrefs for
 topics opened in the Author page.

**Parameters:**
- `keyDefitionManager` ([`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionManager`](editor/page/ditamap/keys/KeyDefinitionManager.md)): The key definition manager

### `addAuthorCSSAlternativesCustomizer(ro.sync.exml.workspace.api.editor.page.author.css.AuthorCSSAlternativesCustomizer cssAlternativesCustomizer)`

**Returns:** `void`

**Parameters:**
- `cssAlternativesCustomizer` ([`ro.sync.exml.workspace.api.editor.page.author.css.AuthorCSSAlternativesCustomizer`](editor/page/author/css/AuthorCSSAlternativesCustomizer.md)): The CSS alternatives customizer.

### `removeAuthorCSSAlternativesCustomizer(ro.sync.exml.workspace.api.editor.page.author.css.AuthorCSSAlternativesCustomizer cssAlternativesCustomizer)`

**Returns:** `void`

**Parameters:**
- `cssAlternativesCustomizer` ([`ro.sync.exml.workspace.api.editor.page.author.css.AuthorCSSAlternativesCustomizer`](editor/page/author/css/AuthorCSSAlternativesCustomizer.md)): The CSS alternatives customizer.

### `addBatchOperationsListener(ro.sync.exml.workspace.api.listeners.BatchOperationsListener listener)`

**Returns:** `void`

The listener is only called with REPLACE_ALL events for the standalone version of Oxygen.

**Parameters:**
- `listener` ([`ro.sync.exml.workspace.api.listeners.BatchOperationsListener`](listeners/BatchOperationsListener.md)): The batch operations listener.

### `removeBatchOperationsListener(ro.sync.exml.workspace.api.listeners.BatchOperationsListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.exml.workspace.api.listeners.BatchOperationsListener`](listeners/BatchOperationsListener.md)): The batch operations listener.

### `getBatchOperationsListenersAccess()`

**Returns:** [`ro.sync.exml.workspace.api.listeners.BatchOperationsListener`](listeners/BatchOperationsListener.md)

### `createAuthorDocumentProvider(java.net.URL systemId, java.io.Reader documentReader)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../../ecss/extensions/api/node/AuthorDocumentProvider.md)

References are not expanded. 
 The provider creates a structure of AuthorNodes and allows it to be manipulated via an AuthorDocumentController.
 
Such an API may be useful if you want to load XML content and use Author API to make changes to it. Afterwards you can serialize
 the structure back to XML. 
 
The parsing of the XML content to Author Nodes is quite fast and may also be used to batch change sets of XML resources by using the 
 AuthorDocumentController API.

**Parameters:**
- `systemId` (`java.net.URL`): The system id of the resource. If `null`, the reader must be provided
      and relative DTD entity references will not be properly resolved.
- `documentReader` (`java.io.Reader`): The document reader. If `null`, the reader will be created internally.

### `createAuthorDocumentProvider(java.net.URL systemId, java.io.Reader documentReader, boolean expandReferences)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../../ecss/extensions/api/node/AuthorDocumentProvider.md)

The provider creates a structure of AuthorNodes and allows it to be manipulated via an AuthorDocumentController.
 
Such an API may be useful if you want to load XML content and use Author API to make changes to it. Afterwards you can serialize
 the structure back to XML. 
 
The parsing of the XML content to Author Nodes is quite fast and may also be used to batch change sets of XML resources by using the 
 AuthorDocumentController API.

**Parameters:**
- `systemId` (`java.net.URL`): The system id of the resource. If `null`, the reader must be provided
      and relative DTD entity references will not be properly resolved.
- `documentReader` (`java.io.Reader`): The document reader. If `null`, the reader will be created internally.
- `expandReferences` (`boolean`): `true` to expand references in the created document.

### `getComponentsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.componentscollector.IComponentsProvider`](componentscollector/IComponentsProvider.md)

The provider allows you to obtain the components from an editor.

