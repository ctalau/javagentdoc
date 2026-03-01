# Interface: `ResultsManager`

**Package:** [`ro.sync.exml.workspace.api.results`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.results.ResultsManager`

## Description

For example, the results
 can be presented in a new or an already existing view/tab.

 Available for the stand-alone and Eclipse plugin versions of oXygen.
 


 The results manager can be retrieved from an instance of PluginWorkspace 
 (see method `getResultsManager()`).

## Methods

### `setResults(`java.lang.String` tabKey, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` results, `ro.sync.exml.workspace.api.results.ResultsManager.ResultType` resultsType)`

**Returns:** `void`

If a results view does not exist for the given key, a new one is created.
 The view is selected automatically when setting a list of results in it.

### `addResult(`java.lang.String` tabKey, [`ro.sync.document.DocumentPositionedInfo`](../../../../document/DocumentPositionedInfo.md) result, `ro.sync.exml.workspace.api.results.ResultsManager.ResultType` resultType, `boolean` selectTab, `boolean` selectResult)`

**Returns:** `void`

If a results view does not exist for the given key, a new one is created.

### `addResults(`java.lang.String` tabKey, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` results, `ro.sync.exml.workspace.api.results.ResultsManager.ResultType` resultsType, `boolean` selectTab)`

**Returns:** `void`

If a results view does not exist for the given key, a new one is created.

### `getAllResults(`java.lang.String` tabKey)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `getSelectedResults(`java.lang.String` tabKey)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `addEventHandler(`java.lang.String` tabKey, [`ro.sync.exml.workspace.api.results.ResultsTabEventHandler`](./ResultsTabEventHandler.md) handler)`

**Returns:** `void`

### `removeEventHandler(`java.lang.String` tabKey, [`ro.sync.exml.workspace.api.results.ResultsTabEventHandler`](./ResultsTabEventHandler.md) handler)`

**Returns:** `void`

### `selectResult(`java.lang.String` tabKey, [`ro.sync.document.DocumentPositionedInfo`](../../../../document/DocumentPositionedInfo.md) result)`

**Returns:** `void`

The tab is also selected.

### `removeResult(`java.lang.String` tabKey, [`ro.sync.document.DocumentPositionedInfo`](../../../../document/DocumentPositionedInfo.md) result)`

**Returns:** `void`

### `addPopUpMenuCustomizer(`java.lang.String` tabKey, [`ro.sync.exml.workspace.api.results.ResultsTabPopUpMenuCustomizer`](./ResultsTabPopUpMenuCustomizer.md) customizer)`

**Returns:** `void`

### `removePopUpMenuCustomizer(`java.lang.String` tabKey, [`ro.sync.exml.workspace.api.results.ResultsTabPopUpMenuCustomizer`](./ResultsTabPopUpMenuCustomizer.md) customizer)`

**Returns:** `void`

