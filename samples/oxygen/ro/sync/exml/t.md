# Class: `t`

**Package:** [`ro.sync.exml`](README.md)

**Fully Qualified Name:** `ro.sync.exml.t`

**Extends:** [`ro.sync.exml.v`](./v.md)

## Fields

### `qb`

**Type:** [`org.slf4j.Logger`](../../../org/slf4j/Logger.md)

### `rb`

**Type:** [`ro.sync.exml.editor.ob`](editor/ob.md)

### `ub`

**Type:** `int`

### `sb`

**Type:** `boolean`

### `tb`

**Type:** [`ro.sync.exml.editor.s.g`](editor/s/g.md)

## Constructors

### `<init>()`

## Methods

### `setResultsManager([`ro.sync.exml.editor.ob`](editor/ob.md) arg0)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, [`ro.sync.db.nxd.c.g`](../db/nxd/c/g.md) arg1)`

**Returns:** `void`

### `updateResults(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3, `java.net.URL` arg4)`

**Returns:** `void`

### `addResult(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `addResult(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `showConfirmDialog(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `int`

### `createConfirmDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String[]` arg2)`

**Returns:** [`ro.sync.exml.ab`](./ab.md)

### `showConfirmDialog(`java.lang.String` arg0)`

**Returns:** `int`

### `showErrorMessage(`java.lang.String` arg0)`

**Returns:** `void`

### `showErrorMessage(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `showErrorMessage(`java.lang.Throwable` arg0)`

**Returns:** `void`

### `showErrorMessage(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.Throwable` arg2)`

**Returns:** `void`

### `showErrorMessage(`java.lang.String` arg0, `java.lang.String` arg1, [`ro.sync.document.DetailedExceptionInfo`](../document/DetailedExceptionInfo.md) arg2)`

**Returns:** `void`

### `showHelpErrorMessage(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `showHelpErrorMessage(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `showHelpWarnMessage(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3)`

**Returns:** `void`

### `showWarnMessageWithOptionsLink(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3)`

**Returns:** `void`

### `showErrorMessageWithOptionsLink(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3)`

**Returns:** `void`

### `bc(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3, `boolean` arg4)`

**Returns:** `void`

### `showInfoMessage(`java.lang.String` arg0)`

**Returns:** `void`

### `invokeAndWait(`java.lang.Runnable` arg0)`

**Returns:** `void`

### `isEventDispatchThread()`

**Returns:** `boolean`

### `invokeLater(`java.lang.Runnable` arg0)`

**Returns:** `void`

### `setTestMode(`boolean` arg0)`

**Returns:** `void`

### `setStatusModelListener([`ro.sync.exml.editor.s.g`](editor/s/g.md) arg0)`

**Returns:** `void`

### `getStatusModelListener()`

**Returns:** [`ro.sync.exml.editor.s.g`](editor/s/g.md)

### `getResultsManager()`

**Returns:** [`ro.sync.exml.editor.ob`](editor/ob.md)

### `getEncodingChooser()`

**Returns:** [`ro.sync.basic.xml.encoding.EncodingChooser`](../basic/xml/encoding/EncodingChooser.md)

### `showConfirmationDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `boolean`

### `showConfirmationDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `boolean` arg3)`

**Returns:** `boolean`

### `uc(`java.lang.String` arg0, `java.lang.Object` arg1, `int` arg2, `java.lang.String[]` arg3, `int[]` arg4, `java.lang.String` arg5, `int` arg6, `java.lang.String` arg7, `java.lang.Runnable` arg8, `boolean` arg9)`

**Returns:** `int[]`

### `showComplexQuestionDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String[]` arg2, `int[]` arg3, `java.lang.String` arg4, `int` arg5)`

**Returns:** `int[]`

### `showComplexQuestionDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String[]` arg2, `int[]` arg3, `java.lang.String` arg4, `int` arg5, `java.lang.String` arg6, `java.lang.String` arg7, `boolean` arg8)`

**Returns:** `int[]`

### `showComplexWarnDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String[]` arg2, `int[]` arg3, `java.lang.String` arg4, `int` arg5)`

**Returns:** `int[]`

### `showComplexWarnDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String[]` arg2, `int[]` arg3, `java.lang.String` arg4, `int` arg5, `java.lang.String` arg6, `java.lang.String` arg7, `boolean` arg8)`

**Returns:** `int[]`

### `showComplexWarnDialog(`java.lang.String` arg0, `java.lang.Object` arg1, `java.lang.String[]` arg2, `int[]` arg3, `java.lang.String` arg4, `int` arg5, `java.lang.String` arg6, `java.lang.Runnable` arg7)`

**Returns:** `int[]`

### `showComplexInfoDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `java.lang.Runnable` arg5)`

**Returns:** `int[]`

### `showComplexInfoDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `java.lang.Runnable` arg5, `boolean` arg6)`

**Returns:** `int[]`

### `showComplexInfoDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String[]` arg2, `int[]` arg3, `java.lang.String` arg4, `int` arg5)`

**Returns:** `int[]`

### `showInputDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, [`ro.sync.ui.y`](../ui/y.md) arg3, `boolean` arg4)`

**Returns:** `java.lang.String`

### `showInputTextAreaDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, [`ro.sync.ui.y`](../ui/y.md) arg3)`

**Returns:** `java.lang.String`

### `showInfoMessage(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `showWarningMessage(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `showWarningMessage(`java.lang.String` arg0, `java.lang.Throwable` arg1)`

**Returns:** `void`

### `yb(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `int` arg3)`

**Returns:** `void`

### `showImproveOxygenExperienceDialog()`

**Returns:** `int`

### `updateProblemResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1, [`ro.sync.exml.editor.re`](editor/re.md) arg2)`

**Returns:** `void`

### `updateSearchReferencesResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1, `boolean` arg2)`

**Returns:** `void`

### `updateSQLResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1)`

**Returns:** `void`

### `updateFindResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1, [`ro.sync.exml.editor.ld`](editor/ld.md) arg2)`

**Returns:** `void`

### `updateSpellCheckResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1)`

**Returns:** `void`

### `updateXPathResults(`java.lang.String` arg0, `java.util.List<ro.sync.exml.editor.xmleditor.i.g>` arg1)`

**Returns:** `void`

### `updateMessagesResults(`java.lang.String` arg0, `java.util.List<? extends ro.sync.document.DocumentPositionedInfo>` arg1, [`ro.sync.exml.editor.mg`](editor/mg.md) arg2)`

**Returns:** `void`

### `addMessageResult(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../document/DocumentPositionedInfo.md) arg1, [`ro.sync.exml.editor.mg`](editor/mg.md) arg2, `boolean` arg3, `boolean` arg4)`

**Returns:** `void`

### `addProblemResult(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../document/DocumentPositionedInfo.md) arg1, [`ro.sync.exml.editor.re`](editor/re.md) arg2, `boolean` arg3, `boolean` arg4)`

**Returns:** `void`

### `addSearchReferencesResults(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../document/DocumentPositionedInfo.md) arg1, `boolean` arg2, [`ro.sync.exml.editor.ae`](editor/ae.md) arg3)`

**Returns:** `void`

### `addSpellCheckResults(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../document/DocumentPositionedInfo.md) arg1, `boolean` arg2)`

**Returns:** `void`

### `addSQLResults(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../document/DocumentPositionedInfo.md) arg1, `boolean` arg2)`

**Returns:** `void`

### `addXPathResults(`java.lang.String` arg0, [`ro.sync.document.DocumentPositionedInfo`](../document/DocumentPositionedInfo.md) arg1, `boolean` arg2)`

**Returns:** `void`

### `xpathInFilesEnded()`

**Returns:** `void`

### `showComplexErrorDialog(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String[]` arg2, `int[]` arg3, `java.lang.String` arg4, `int` arg5, `java.lang.String` arg6, `java.lang.Runnable` arg7)`

**Returns:** `int[]`

### `getExternalTransformerProvider()`

**Returns:** [`ro.sync.exml.plugin.ExternalTransformerProvider`](plugin/ExternalTransformerProvider.md)

