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

### `getAllEditorLocations(`int` editingArea)`

**Returns:** `java.net.URL[]`

In such cases
 the URLs for these not yet instantiated editors are not returned by this method.

### `getEditorAccess(`java.net.URL` location, `int` editingArea)`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](editor/WSEditor.md)

### `getCurrentEditorAccess(`int` editingArea)`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](editor/WSEditor.md)

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

### `addEditorChangeListener([`ro.sync.exml.workspace.api.listeners.WSEditorChangeListener`](listeners/WSEditorChangeListener.md) editorListener, `int` editingArea)`

**Returns:** `void`

### `removeEditorChangeListener([`ro.sync.exml.workspace.api.listeners.WSEditorChangeListener`](listeners/WSEditorChangeListener.md) editorListener, `int` editingArea)`

**Returns:** `void`

### `getEditorChangeListeners(`int` editingArea)`

**Returns:** [`ro.sync.exml.workspace.api.listeners.WSEditorChangeListener[]`](listeners/WSEditorChangeListener.md)

### `getOptionsStorage()`

**Returns:** [`ro.sync.exml.workspace.api.options.WSOptionsStorage`](options/WSOptionsStorage.md)

It is also responsible for adding and removing listeners that are notified
 about the option changes.
 These keys are common to all plugin implementations.

### `setDITAKeyDefinitionManager([`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionManager`](editor/page/ditamap/keys/KeyDefinitionManager.md) keyDefitionManager)`

**Returns:** `void`

This API can be used by the developer to take control over the key definitions which will be used to resolve keyrefs and conkeyrefs for
 topics opened in the Author page.

### `addAuthorCSSAlternativesCustomizer([`ro.sync.exml.workspace.api.editor.page.author.css.AuthorCSSAlternativesCustomizer`](editor/page/author/css/AuthorCSSAlternativesCustomizer.md) cssAlternativesCustomizer)`

**Returns:** `void`

### `removeAuthorCSSAlternativesCustomizer([`ro.sync.exml.workspace.api.editor.page.author.css.AuthorCSSAlternativesCustomizer`](editor/page/author/css/AuthorCSSAlternativesCustomizer.md) cssAlternativesCustomizer)`

**Returns:** `void`

### `addBatchOperationsListener([`ro.sync.exml.workspace.api.listeners.BatchOperationsListener`](listeners/BatchOperationsListener.md) listener)`

**Returns:** `void`

The listener is only called with REPLACE_ALL events for the standalone version of Oxygen.

### `removeBatchOperationsListener([`ro.sync.exml.workspace.api.listeners.BatchOperationsListener`](listeners/BatchOperationsListener.md) listener)`

**Returns:** `void`

### `getBatchOperationsListenersAccess()`

**Returns:** [`ro.sync.exml.workspace.api.listeners.BatchOperationsListener`](listeners/BatchOperationsListener.md)

### `createAuthorDocumentProvider(`java.net.URL` systemId, `java.io.Reader` documentReader)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../../ecss/extensions/api/node/AuthorDocumentProvider.md)

References are not expanded. 
 The provider creates a structure of AuthorNodes and allows it to be manipulated via an AuthorDocumentController.
 
Such an API may be useful if you want to load XML content and use Author API to make changes to it. Afterwards you can serialize
 the structure back to XML. 
 
The parsing of the XML content to Author Nodes is quite fast and may also be used to batch change sets of XML resources by using the 
 AuthorDocumentController API.

### `createAuthorDocumentProvider(`java.net.URL` systemId, `java.io.Reader` documentReader, `boolean` expandReferences)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../../ecss/extensions/api/node/AuthorDocumentProvider.md)

The provider creates a structure of AuthorNodes and allows it to be manipulated via an AuthorDocumentController.
 
Such an API may be useful if you want to load XML content and use Author API to make changes to it. Afterwards you can serialize
 the structure back to XML. 
 
The parsing of the XML content to Author Nodes is quite fast and may also be used to batch change sets of XML resources by using the 
 AuthorDocumentController API.

### `getComponentsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.componentscollector.IComponentsProvider`](componentscollector/IComponentsProvider.md)

The provider allows you to obtain the components from an editor.

