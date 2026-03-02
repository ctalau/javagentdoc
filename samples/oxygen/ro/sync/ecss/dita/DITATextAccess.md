# Class: `DITATextAccess`

**Package:** [`ro.sync.ecss.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dita.DITATextAccess`

## Fields

### `b`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getKeyInfo(WSXMLTextEditorPage arg0, String arg1)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`java.lang.String`)

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

### `getPreferredKeyRefElementName(WSXMLTextEditorPage arg0, KeyInfo arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)
- `arg2` (`boolean`)

**Returns:** `java.lang.String`

### `getPreferredKeyRefElementName(WSXMLTextEditorPage arg0, KeyInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

**Returns:** `java.lang.String`

### `getPreferredKeyRefElementName(WSXMLTextEditorPage arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `java.lang.String`

### `collectPossibleElements(String arg0, String arg1, WSTextXMLSchemaManager arg2, int arg3, String[] arg4)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md))
- `arg3` (`int`)
- `arg4` (`java.lang.String[]`)

**Returns:** `java.lang.String[]`

### `getPossibleElementQName(WSTextXMLSchemaManager arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getCurrentNodeBaseURL(WSXMLTextEditorPage arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))

**Returns:** `java.net.URL`

### `computeKeyReferenceElementName(WSXMLTextEditorPage arg0, KeyInfo arg1, boolean arg2, boolean arg3, boolean arg4)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)

**Returns:** `java.lang.String`

### `buildFigureHrefImageXMLToInsert(WSXMLTextEditorPage arg0, URL arg1, String arg2, String[] arg3)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String[]`)

**Returns:** `java.lang.String`

### `buildFigureKeyrefImageXMLToInsert(WSXMLTextEditorPage arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `f(WSTextXMLSchemaManager arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `buildNonMediaFragment(String[] arg0, String arg1, URL arg2)`

**Parameters:**
- `arg0` (`java.lang.String[]`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.net.URL`)

**Returns:** `java.lang.String`

### `getUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.UtilAccess`](../../exml/workspace/api/util/UtilAccess.md)

