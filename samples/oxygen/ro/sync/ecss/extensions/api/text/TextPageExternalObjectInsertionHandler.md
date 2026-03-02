# Class: `TextPageExternalObjectInsertionHandler`

**Package:** [`ro.sync.ecss.extensions.api.text`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.text.TextPageExternalObjectInsertionHandler`

**Implements:** [`ro.sync.ecss.extensions.api.ExternalObjectInsertionSources`](../ExternalObjectInsertionSources.md), [`ro.sync.ecss.extensions.api.Extension`](../Extension.md)

## Description

For the Eclipse Plugin the dropped files are handled by the platform and this API may not be called.

## Constructors

### `<init>()`

## Methods

### `insertURLs(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.util.List<java.net.URL> urls, int source)`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event.
 

 This call back is received if TextPageExternalObjectInsertionHandler#acceptsURLs(WSXMLTextEditorPage, List, int)
 returned `true` for the same `source` and `urls` list. 
 

 You can use it to link to those specific files/URLs.

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): The text page access
- `urls` (`java.util.List<java.net.URL>`): The list of URLs.
- `source` (`int`): The source of the URLs, one of the ExternalObjectInsertionSources constants.

**Returns:** `void`

### `acceptsURLs(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.util.List<java.net.URL> urls, int source)`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event. If the source is of **drag and drop** type and 
 it is accepted, the caret will be moved to the drop position.
 

 By default all pasted URLs are accepted.
 Also all dropped images are accepted.
 For all other cases we accept by default URLs dropped from inside Oxygen (from views like Project and DITA Maps Manager).

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): The text page access.
- `urls` (`java.util.List<java.net.URL>`): The list of URLs.
- `source` (`int`): The source of the URLs, one of the ExternalObjectInsertionSources constants.

**Returns:** `boolean`

### `acceptsSource(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, int source)`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event. If the source is of **drag and drop** type and 
 it is accepted, the caret will be moved to the drag position.
 

 By default accepts paste sources and drags from the Oxygen Project and DITA Maps Manager.

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): The text page access.
- `source` (`int`): The source of the URLs, one of the 
   ExternalObjectInsertionSources constants (that represents a 
   **paste** or a **drag and drop** event)

**Returns:** `boolean`

### `containsOnlyImages(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textPage, java.util.List<java.net.URL> urlList)`

**Parameters:**
- `textPage` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): The text page access.
- `urlList` (`java.util.List<java.net.URL>`): The list of URLs.

**Returns:** `boolean`

### `containsOnlyBinaryResources(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textPage, java.util.List<java.net.URL> urlList)`

**Parameters:**
- `textPage` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): The text page access.
- `urlList` (`java.util.List<java.net.URL>`): The list of URLs.

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

