# Interface: `ob`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.ob`

**Extends:** [`ro.sync.exml.editor.ub`](./ub.md)

## Methods

### `addEventHandler(`java.lang.String` arg0, [`ro.sync.exml.workspace.api.results.ResultsTabEventHandler`](../workspace/api/results/ResultsTabEventHandler.md) arg1)`

**Returns:** `void`

### `removeEventHandler(`java.lang.String` arg0, [`ro.sync.exml.workspace.api.results.ResultsTabEventHandler`](../workspace/api/results/ResultsTabEventHandler.md) arg1)`

**Returns:** `void`

### `getSelectedResults(`java.lang.String` arg0)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `getAllResults(`java.lang.String` arg0)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `addResultsManagerListener([`ro.sync.exml.editor.te`](./te.md) arg0)`

**Returns:** `void`

### `removeResultsManagerListener([`ro.sync.exml.editor.te`](./te.md) arg0)`

**Returns:** `void`

### `printSelectedTabContent()`

**Returns:** `void`

### `saveSelectedTabContent(`boolean` arg0)`

**Returns:** `void`

### `saveSelectedTabContentAsHTML()`

**Returns:** `void`

### `saveSelectedTabContentToHTMLValidationReport()`

**Returns:** `void`

### `closeSelectedTab([`ro.sync.exml.editor.results.db`](results/db.md) arg0)`

**Returns:** `void`

### `closeAllTabs()`

**Returns:** `void`

### `updateNodeInfoResults(`java.lang.String` arg0, `java.util.List` arg1)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3, `java.net.URL` arg4)`

**Returns:** `void`

### `addResult(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `addResult(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `addResult(`java.lang.String` arg0, `java.util.List<ro.sync.f.c.c>` arg1, [`ro.sync.f.f.n`](../../f/f/n.md) arg2, `java.lang.String` arg3, `java.lang.String` arg4)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, [`ro.sync.db.nxd.c.g`](../../db/nxd/c/g.md) arg1)`

**Returns:** `void`

### `isShowing(`java.lang.String` arg0)`

**Returns:** `boolean`

### `getComponent()`

**Returns:** `javax.swing.JComponent`

### `setTabSize(`int` arg0)`

**Returns:** `void`

### `setLineWrap(`boolean` arg0)`

**Returns:** `void`

### `isEmpty()`

**Returns:** `boolean`

### `unregisterKeyStrokes()`

**Returns:** `void`

### `registerKeyStrokes()`

**Returns:** `void`

### `closeOtherTabs([`ro.sync.exml.editor.results.db`](results/db.md) arg0)`

**Returns:** `void`

### `setBackgroundColor(`java.awt.Color` arg0)`

**Returns:** `void`

### `setCloseActions([`ro.sync.ui.application.action.d[]`](../../ui/application/action/d.md) arg0)`

**Returns:** `void`

### `closeSelectedTab()`

**Returns:** `void`

### `closeOtherTabs()`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, [`ro.sync.exml.editor.results.iterator.b`](results/iterator/b.md) arg1)`

**Returns:** `void`

### `setLineHighlightColor(`java.awt.Color` arg0)`

**Returns:** `void`

### `setFindHighlightColor(`java.awt.Color` arg0)`

**Returns:** `void`

### `setVisibleLineHighlight(`boolean` arg0)`

**Returns:** `void`

### `updateProblemsResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1, [`ro.sync.exml.editor.re`](./re.md) arg2)`

**Returns:** `void`

### `updateFindResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1, [`ro.sync.exml.editor.ld`](./ld.md) arg2)`

**Returns:** `void`

### `updateSearchReferencesResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1, `boolean` arg2)`

**Returns:** `void`

### `updateSQLResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1)`

**Returns:** `void`

### `updateXPathResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1)`

**Returns:** `void`

### `updateMessagesResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1, [`ro.sync.exml.editor.mg`](./mg.md) arg2)`

**Returns:** `void`

### `updateSpellCheckResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1)`

**Returns:** `void`

### `addProblemResult(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, [`ro.sync.exml.editor.re`](./re.md) arg2, `boolean` arg3, `boolean` arg4)`

**Returns:** `void`

### `addFindInFilesResult(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, [`ro.sync.exml.editor.ld`](./ld.md) arg2, `boolean` arg3)`

**Returns:** `void`

### `addSearchReferencesResults(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, `boolean` arg2, [`ro.sync.exml.editor.ae`](./ae.md) arg3)`

**Returns:** `void`

### `addSQLResults(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, `boolean` arg2)`

**Returns:** `void`

### `addXPathResults(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, `boolean` arg2)`

**Returns:** `void`

### `addMessageResult(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, [`ro.sync.exml.editor.mg`](./mg.md) arg2, `boolean` arg3, `boolean` arg4)`

**Returns:** `void`

### `addSpellCheckResults(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1, `boolean` arg2)`

**Returns:** `void`

### `resetLayout()`

**Returns:** `void`

### `getSelectedTab()`

**Returns:** [`ro.sync.exml.editor.results.db`](results/db.md)

### `selectTab(`javax.swing.JComponent` arg0)`

**Returns:** `void`

### `editorFontChanged(`java.awt.Font` arg0)`

**Returns:** `void`

### `getMarkersManager()`

**Returns:** [`ro.sync.exml.editor.ob.d`](ob/d.md)

### `findInFilesEnded()`

**Returns:** `void`

### `xpathInFilesEnded()`

**Returns:** `void`

### `selectResult(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1)`

**Returns:** `void`

### `removeResult(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../../document/DocumentPositionedInfo.md) arg1)`

**Returns:** `void`

### `addPopUpMenuCustomizer(`java.lang.String` arg0, [`ro.sync.exml.workspace.api.results.ResultsTabPopUpMenuCustomizer`](../workspace/api/results/ResultsTabPopUpMenuCustomizer.md) arg1)`

**Returns:** `void`

### `removePopUpMenuCustomizer(`java.lang.String` arg0, [`ro.sync.exml.workspace.api.results.ResultsTabPopUpMenuCustomizer`](../workspace/api/results/ResultsTabPopUpMenuCustomizer.md) arg1)`

**Returns:** `void`

### `getResultsTabPopUpMenuCustomizers(`java.lang.String` arg0)`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.results.ResultsTabPopUpMenuCustomizer>`

### `requestFocusInView()`

**Returns:** `void`

