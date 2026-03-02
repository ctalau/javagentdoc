# Class: `DITATextAccess`

**Package:** [`ro.sync.ecss.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dita.DITATextAccess`

## Fields

### `b`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getKeyInfo(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage arg0, java.lang.String arg1)`

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`java.lang.String`)

### `getPreferredKeyRefElementName(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage arg0, ro.sync.ecss.dita.reference.keyref.KeyInfo arg1, boolean arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)
- `arg2` (`boolean`)

### `getPreferredKeyRefElementName(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage arg0, ro.sync.ecss.dita.reference.keyref.KeyInfo arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

### `getPreferredKeyRefElementName(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage arg0, boolean arg1, boolean arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`boolean`)
- `arg2` (`boolean`)

### `collectPossibleElements(java.lang.String arg0, java.lang.String arg1, ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager arg2, int arg3, java.lang.String[] arg4)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md))
- `arg3` (`int`)
- `arg4` (`java.lang.String[]`)

### `getPossibleElementQName(ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `getCurrentNodeBaseURL(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage arg0)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))

### `computeKeyReferenceElementName(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage arg0, ro.sync.ecss.dita.reference.keyref.KeyInfo arg1, boolean arg2, boolean arg3, boolean arg4)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)

### `buildFigureHrefImageXMLToInsert(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage arg0, java.net.URL arg1, java.lang.String arg2, java.lang.String[] arg3)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String[]`)

### `buildFigureKeyrefImageXMLToInsert(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `f(ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `buildNonMediaFragment(java.lang.String[] arg0, java.lang.String arg1, java.net.URL arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String[]`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.net.URL`)

### `getUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.UtilAccess`](../../exml/workspace/api/util/UtilAccess.md)

