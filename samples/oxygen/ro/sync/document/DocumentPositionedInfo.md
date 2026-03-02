# Class: `DocumentPositionedInfo`

**Package:** [`ro.sync.document`](README.md)

**Fully Qualified Name:** `ro.sync.document.DocumentPositionedInfo`

## Fields

### `joc`

**Type:** `ro.sync.i18n.c`

### `noc`

**Type:** `org.slf4j.Logger`

### `SEVERITY_INFO`

**Type:** `int`

### `SEVERITY_WARN`

**Type:** `int`

### `SEVERITY_ERROR`

**Type:** `int`

### `SEVERITY_FATAL`

**Type:** `int`

### `NOT_KNOWN`

**Type:** `int`

### `goc`

**Type:** `int`

### `rnc`

**Type:** `int`

### `coc`

**Type:** `int`

### `snc`

**Type:** `int`

### `doc`

**Type:** `ro.sync.document.v`

### `nnc`

**Type:** `java.lang.String`

### `eoc`

**Type:** `java.net.URL`

### `vnc`

**Type:** `int`

### `foc`

**Type:** `boolean`

### `aoc`

**Type:** `int`

### `qnc`

**Type:** `int`

### `moc`

**Type:** [`ro.sync.document.DPIData`](./DPIData.md)

### `loc`

**Type:** [`ro.sync.document.DetailedExceptionInfo`](./DetailedExceptionInfo.md)

### `koc`

**Type:** `java.lang.String`

### `pnc`

**Type:** `java.lang.String`

### `znc`

**Type:** [`ro.sync.exml.editor.Anchor`](../exml/editor/Anchor.md)

### `ync`

**Type:** `int`

### `unc`

**Type:** [`ro.sync.document.OperationDescription`](./OperationDescription.md)

### `wnc`

**Type:** `ro.sync.document.o`

### `hoc`

**Type:** `ro.sync.document.bc`

### `boc`

**Type:** `java.util.Map<java.lang.String,javax.swing.text.Position[]>`

### `tnc`

**Type:** `java.lang.String`

### `ioc`

**Type:** `java.lang.String`

### `xnc`

**Type:** `int[]`

### `onc`

**Type:** `boolean`

## Constructors

### `<init>(int arg0)`

**Parameters:**
- `arg0` (`int`)

### `<init>(int arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`int`)
- `arg4` (`int`)
- `arg5` (`int`)

### `<init>(int arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, int arg6, java.net.URL arg7, boolean arg8)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`int`)
- `arg4` (`int`)
- `arg5` (`int`)
- `arg6` (`int`)
- `arg7` (`java.net.URL`)
- `arg8` (`boolean`)

### `<init>(int arg0, ro.sync.document.v arg1, java.lang.String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, java.net.URL arg9, boolean arg10)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`ro.sync.document.v`)
- `arg2` (`java.lang.String`)
- `arg3` (`int`)
- `arg4` (`int`)
- `arg5` (`int`)
- `arg6` (`int`)
- `arg7` (`int`)
- `arg8` (`int`)
- `arg9` (`java.net.URL`)
- `arg10` (`boolean`)

### `<init>(int arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`int`)
- `arg4` (`int`)

### `<init>(int arg0, java.lang.String arg1, java.lang.String arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `<init>(int arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`java.lang.String`)

### `<init>(java.net.URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

## Methods

### `flipSeverity(int arg0)`

**Returns:** `int`

**Parameters:**
- `arg0` (`int`)

### `equals(java.lang.Object arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `setSeverity(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setColumn(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setLine(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setMessage(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setMaskPasswordsInURLs(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `setLength(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setSystemID(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getLength()`

**Returns:** `int`

### `getColumn()`

**Returns:** `int`

### `getSeverity()`

**Returns:** `int`

### `getSeverityAsString()`

**Returns:** `java.lang.String`

### `getLine()`

**Returns:** `int`

### `getMessage()`

**Returns:** `java.lang.String`

### `getHTMLMessage()`

**Returns:** `java.lang.String`

### `getMessageProvider()`

**Returns:** `ro.sync.document.v`

### `getMessageWithEngine()`

**Returns:** `java.lang.String`

### `getMessageWithEngine(boolean arg0, boolean arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)

### `getMessageWithSeverity()`

**Returns:** `java.lang.String`

### `getMessageWithSeverity(boolean arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)

### `getMessageWithSeverity(boolean arg0, boolean arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)

### `wnb(boolean arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)

### `ynb()`

**Returns:** `java.lang.String`

### `getSystemID()`

**Returns:** `java.lang.String`

### `setOffset(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `getOffset()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `getAdditionalInfo()`

**Returns:** `java.net.URL`

### `setAdditionalInfo(java.net.URL arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)

### `isHighlightToColumn()`

**Returns:** `boolean`

### `setHighlightToColumn(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `getEndColumn()`

**Returns:** `int`

### `getEndLine()`

**Returns:** `int`

### `setEndLine(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setEndColumn(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setData(ro.sync.document.DPIData arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.document.DPIData`](./DPIData.md))

### `getData()`

**Returns:** [`ro.sync.document.DPIData`](./DPIData.md)

### `setDetailedExceptionInfo(ro.sync.document.DetailedExceptionInfo arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.document.DetailedExceptionInfo`](./DetailedExceptionInfo.md))

### `getDetailedExceptionInfo()`

**Returns:** [`ro.sync.document.DetailedExceptionInfo`](./DetailedExceptionInfo.md)

### `setEngineName(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getEngineName()`

**Returns:** `java.lang.String`

### `getPreferredEngineName()`

**Returns:** `java.lang.String`

### `asXML()`

**Returns:** `java.lang.String`

### `asXML(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)

### `asXML(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)

### `asJSON()`

**Returns:** `java.lang.String`

### `asJSON(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)

### `asJSON(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)

### `asText()`

**Returns:** `java.lang.String`

### `asText(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)

### `asText(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)

### `getImposedInitialPage()`

**Returns:** `java.lang.String`

### `setImposedInitialPage(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getAnchor()`

**Returns:** [`ro.sync.exml.editor.Anchor`](../exml/editor/Anchor.md)

### `setAnchor(ro.sync.exml.editor.Anchor arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.exml.editor.Anchor`](../exml/editor/Anchor.md))

### `getMatchRange()`

**Returns:** `int[]`

### `setMatchRange(int[] arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int[]`)

### `getMessageHighlightOffset()`

**Returns:** `int`

### `setMessageHighlightOffset(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setOperationDescription(ro.sync.document.OperationDescription arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.document.OperationDescription`](./OperationDescription.md))

### `getOperationDescription()`

**Returns:** [`ro.sync.document.OperationDescription`](./OperationDescription.md)

### `getDITAAdditionalInfo()`

**Returns:** `ro.sync.document.o`

### `setDITAAdditionalInfo(ro.sync.document.o arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.document.o`)

### `getECAdditionalInfo()`

**Returns:** `ro.sync.document.bc`

### `setECAdditionalInfo(ro.sync.document.bc arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.document.bc`)

### `setTemporaryPositions(javax.swing.text.Position arg0, javax.swing.text.Position arg1, java.lang.String arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.text.Position`)
- `arg1` (`javax.swing.text.Position`)
- `arg2` (`java.lang.String`)

### `getStartEndPositions(java.lang.String arg0)`

**Returns:** `javax.swing.text.Position[]`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setStartEndPositionsMap(java.util.Map<java.lang.String,javax.swing.text.Position[]> arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,javax.swing.text.Position[]>`)

### `asHTML()`

**Returns:** `java.lang.String`

### `asHTML(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)

### `asHTML(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)

### `asHTML(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)
- `arg7` (`boolean`)

### `xnb()`

**Returns:** `java.lang.String`

### `setHtmlMessageFragment(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setErrorKey(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getErrorKey()`

**Returns:** `java.lang.String`

### `isElementTarget()`

**Returns:** `boolean`

### `setElementTarget(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

