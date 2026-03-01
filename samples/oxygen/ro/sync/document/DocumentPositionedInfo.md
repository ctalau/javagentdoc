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

### `<init>(`int` arg0)`

### `<init>(`int` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `int` arg3, `int` arg4, `int` arg5)`

### `<init>(`int` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `int` arg3, `int` arg4, `int` arg5, `int` arg6, `java.net.URL` arg7, `boolean` arg8)`

### `<init>(`int` arg0, `ro.sync.document.v` arg1, `java.lang.String` arg2, `int` arg3, `int` arg4, `int` arg5, `int` arg6, `int` arg7, `int` arg8, `java.net.URL` arg9, `boolean` arg10)`

### `<init>(`int` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `int` arg3, `int` arg4)`

### `<init>(`int` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

### `<init>(`int` arg0, `java.lang.String` arg1)`

### `<init>(`java.net.URL` arg0)`

## Methods

### `flipSeverity(`int` arg0)`

**Returns:** `int`

### `equals(`java.lang.Object` arg0)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setSeverity(`int` arg0)`

**Returns:** `void`

### `setColumn(`int` arg0)`

**Returns:** `void`

### `setLine(`int` arg0)`

**Returns:** `void`

### `setMessage(`java.lang.String` arg0)`

**Returns:** `void`

### `setMaskPasswordsInURLs(`boolean` arg0)`

**Returns:** `void`

### `setLength(`int` arg0)`

**Returns:** `void`

### `setSystemID(`java.lang.String` arg0)`

**Returns:** `void`

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

### `getMessageWithEngine(`boolean` arg0, `boolean` arg1)`

**Returns:** `java.lang.String`

### `getMessageWithSeverity()`

**Returns:** `java.lang.String`

### `getMessageWithSeverity(`boolean` arg0)`

**Returns:** `java.lang.String`

### `getMessageWithSeverity(`boolean` arg0, `boolean` arg1)`

**Returns:** `java.lang.String`

### `wnb(`boolean` arg0)`

**Returns:** `java.lang.String`

### `ynb()`

**Returns:** `java.lang.String`

### `getSystemID()`

**Returns:** `java.lang.String`

### `setOffset(`int` arg0)`

**Returns:** `void`

### `getOffset()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `getAdditionalInfo()`

**Returns:** `java.net.URL`

### `setAdditionalInfo(`java.net.URL` arg0)`

**Returns:** `void`

### `isHighlightToColumn()`

**Returns:** `boolean`

### `setHighlightToColumn(`boolean` arg0)`

**Returns:** `void`

### `getEndColumn()`

**Returns:** `int`

### `getEndLine()`

**Returns:** `int`

### `setEndLine(`int` arg0)`

**Returns:** `void`

### `setEndColumn(`int` arg0)`

**Returns:** `void`

### `setData([`ro.sync.document.DPIData`](./DPIData.md) arg0)`

**Returns:** `void`

### `getData()`

**Returns:** [`ro.sync.document.DPIData`](./DPIData.md)

### `setDetailedExceptionInfo([`ro.sync.document.DetailedExceptionInfo`](./DetailedExceptionInfo.md) arg0)`

**Returns:** `void`

### `getDetailedExceptionInfo()`

**Returns:** [`ro.sync.document.DetailedExceptionInfo`](./DetailedExceptionInfo.md)

### `setEngineName(`java.lang.String` arg0)`

**Returns:** `void`

### `getEngineName()`

**Returns:** `java.lang.String`

### `getPreferredEngineName()`

**Returns:** `java.lang.String`

### `asXML()`

**Returns:** `java.lang.String`

### `asXML(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5)`

**Returns:** `java.lang.String`

### `asXML(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5, `boolean` arg6)`

**Returns:** `java.lang.String`

### `asJSON()`

**Returns:** `java.lang.String`

### `asJSON(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5)`

**Returns:** `java.lang.String`

### `asJSON(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5, `boolean` arg6)`

**Returns:** `java.lang.String`

### `asText()`

**Returns:** `java.lang.String`

### `asText(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5)`

**Returns:** `java.lang.String`

### `asText(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5, `boolean` arg6)`

**Returns:** `java.lang.String`

### `getImposedInitialPage()`

**Returns:** `java.lang.String`

### `setImposedInitialPage(`java.lang.String` arg0)`

**Returns:** `void`

### `getAnchor()`

**Returns:** [`ro.sync.exml.editor.Anchor`](../exml/editor/Anchor.md)

### `setAnchor([`ro.sync.exml.editor.Anchor`](../exml/editor/Anchor.md) arg0)`

**Returns:** `void`

### `getMatchRange()`

**Returns:** `int[]`

### `setMatchRange(`int[]` arg0)`

**Returns:** `void`

### `getMessageHighlightOffset()`

**Returns:** `int`

### `setMessageHighlightOffset(`int` arg0)`

**Returns:** `void`

### `setOperationDescription([`ro.sync.document.OperationDescription`](./OperationDescription.md) arg0)`

**Returns:** `void`

### `getOperationDescription()`

**Returns:** [`ro.sync.document.OperationDescription`](./OperationDescription.md)

### `getDITAAdditionalInfo()`

**Returns:** `ro.sync.document.o`

### `setDITAAdditionalInfo(`ro.sync.document.o` arg0)`

**Returns:** `void`

### `getECAdditionalInfo()`

**Returns:** `ro.sync.document.bc`

### `setECAdditionalInfo(`ro.sync.document.bc` arg0)`

**Returns:** `void`

### `setTemporaryPositions(`javax.swing.text.Position` arg0, `javax.swing.text.Position` arg1, `java.lang.String` arg2)`

**Returns:** `void`

### `getStartEndPositions(`java.lang.String` arg0)`

**Returns:** `javax.swing.text.Position[]`

### `setStartEndPositionsMap(`java.util.Map<java.lang.String,javax.swing.text.Position[]>` arg0)`

**Returns:** `void`

### `asHTML()`

**Returns:** `java.lang.String`

### `asHTML(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5)`

**Returns:** `java.lang.String`

### `asHTML(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5, `boolean` arg6)`

**Returns:** `java.lang.String`

### `asHTML(`boolean` arg0, `boolean` arg1, `boolean` arg2, `boolean` arg3, `boolean` arg4, `boolean` arg5, `boolean` arg6, `boolean` arg7)`

**Returns:** `java.lang.String`

### `xnb()`

**Returns:** `java.lang.String`

### `setHtmlMessageFragment(`java.lang.String` arg0)`

**Returns:** `void`

### `setErrorKey(`java.lang.String` arg0)`

**Returns:** `void`

### `getErrorKey()`

**Returns:** `java.lang.String`

### `isElementTarget()`

**Returns:** `boolean`

### `setElementTarget(`boolean` arg0)`

**Returns:** `void`

