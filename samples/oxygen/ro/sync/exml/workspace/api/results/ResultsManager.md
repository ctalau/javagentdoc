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

### `setResults(String tabKey, List<? extends DocumentPositionedInfo> results, ResultsManager.ResultType resultsType)`

If a results view does not exist for the given key, a new one is created.
 The view is selected automatically when setting a list of results in it.

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the view. It is set as the view's name.
- `results` (`java.util.List<? extends ro.sync.document.DocumentPositionedInfo>`): The list of new results. If `null`, the associated view is removed.
- `resultsType` (`ro.sync.exml.workspace.api.results.ResultsManager.ResultType`): The type of the results. One of ResultType#PROBLEM or ResultType#GENERIC.
                          It the type is ResultType#PROBLEM, the results tab will display an icon
                          corresponding to the severity of the results, otherwise it will not.

**Returns:** `void`

### `addResult(String tabKey, DocumentPositionedInfo result, ResultsManager.ResultType resultType, boolean selectTab, boolean selectResult)`

If a results view does not exist for the given key, a new one is created.

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the view. It is set as the view's name.
- `result` ([`ro.sync.document.DocumentPositionedInfo`](../../../../document/DocumentPositionedInfo.md)): The result to add. If `null`, nothing happens.
- `resultType` (`ro.sync.exml.workspace.api.results.ResultsManager.ResultType`): The type of the result. One of ResultType#PROBLEM or ResultType#GENERIC.
                          It the type is ResultType#PROBLEM, the results tab will display an icon
                          corresponding to the severity of the results, otherwise it will not. If for the current call
                          of this method the tab key is the same as for the previous, but the result type changes,
                          the tab will first be cleared, before adding the current result.
- `selectTab` (`boolean`): `true` to select the tab when adding a result.
- `selectResult` (`boolean`): `true` to scroll to the added result and select it, if the results tab was not already focused.

**Returns:** `void`

### `addResults(String tabKey, List<? extends DocumentPositionedInfo> results, ResultsManager.ResultType resultsType, boolean selectTab)`

If a results view does not exist for the given key, a new one is created.

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the view. It is set as the view's name.
- `results` (`java.util.List<? extends ro.sync.document.DocumentPositionedInfo>`): The list of results to append. If `null`, nothing happens.
- `resultsType` (`ro.sync.exml.workspace.api.results.ResultsManager.ResultType`): The type of the results. One of ResultType#PROBLEM or ResultType#GENERIC.
                          It the type is ResultType#PROBLEM, the results tab will display an icon
                          corresponding to the severity of the results, otherwise it will not. If for the current call
                          of this method the tab key is the same as for the previous, but the result type changes,
                          the tab will first be cleared, before adding the current results.
- `selectTab` (`boolean`): `true` to select the tab when adding the results.

**Returns:** `void`

### `getAllResults(String tabKey)`

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the tab from which the results are to be retrieved.

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `getSelectedResults(String tabKey)`

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the tab from which the selected results are to be retrieved.

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `addEventHandler(String tabKey, ResultsTabEventHandler handler)`

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the tab on which the handler is added.
- `handler` ([`ro.sync.exml.workspace.api.results.ResultsTabEventHandler`](./ResultsTabEventHandler.md)): The handler.

**Returns:** `void`

### `removeEventHandler(String tabKey, ResultsTabEventHandler handler)`

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the tab from which the handler is removed.
- `handler` ([`ro.sync.exml.workspace.api.results.ResultsTabEventHandler`](./ResultsTabEventHandler.md)): The handler.

**Returns:** `void`

### `selectResult(String tabKey, DocumentPositionedInfo result)`

The tab is also selected.

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the tab.
- `result` ([`ro.sync.document.DocumentPositionedInfo`](../../../../document/DocumentPositionedInfo.md)): The result to be selected.

**Returns:** `void`

### `removeResult(String tabKey, DocumentPositionedInfo result)`

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the tab.
- `result` ([`ro.sync.document.DocumentPositionedInfo`](../../../../document/DocumentPositionedInfo.md)): The result to be removed.

**Returns:** `void`

### `addPopUpMenuCustomizer(String tabKey, ResultsTabPopUpMenuCustomizer customizer)`

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the tab for which the menu customizer is added.
- `customizer` ([`ro.sync.exml.workspace.api.results.ResultsTabPopUpMenuCustomizer`](./ResultsTabPopUpMenuCustomizer.md)): The customizer to add.

**Returns:** `void`

### `removePopUpMenuCustomizer(String tabKey, ResultsTabPopUpMenuCustomizer customizer)`

**Parameters:**
- `tabKey` (`java.lang.String`): The key identifying the tab from which the menu customizer is removed.
- `customizer` ([`ro.sync.exml.workspace.api.results.ResultsTabPopUpMenuCustomizer`](./ResultsTabPopUpMenuCustomizer.md)): The customizer to remove.

**Returns:** `void`

