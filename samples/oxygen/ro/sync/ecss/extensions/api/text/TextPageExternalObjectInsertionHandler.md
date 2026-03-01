# Class: `TextPageExternalObjectInsertionHandler`

**Package:** [`ro.sync.ecss.extensions.api.text`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.text.TextPageExternalObjectInsertionHandler`

**Implements:** [`ro.sync.ecss.extensions.api.ExternalObjectInsertionSources`](../ExternalObjectInsertionSources.md), [`ro.sync.ecss.extensions.api.Extension`](../Extension.md)

## Description

For the Eclipse Plugin the dropped files are handled by the platform and this API may not be called.

## Constructors

### `<init>()`

## Methods

### `insertURLs([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.util.List<java.net.URL>` urls, `int` source)`

**Returns:** `void`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event.
 

 This call back is received if TextPageExternalObjectInsertionHandler#acceptsURLs(WSXMLTextEditorPage, List, int)
 returned `true` for the same `source` and `urls` list. 
 

 You can use it to link to those specific files/URLs.

### `acceptsURLs([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.util.List<java.net.URL>` urls, `int` source)`

**Returns:** `boolean`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event. If the source is of **drag and drop** type and 
 it is accepted, the caret will be moved to the drop position.
 

 By default all pasted URLs are accepted.
 Also all dropped images are accepted.
 For all other cases we accept by default URLs dropped from inside Oxygen (from views like Project and DITA Maps Manager).

### `acceptsSource([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `int` source)`

**Returns:** `boolean`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event. If the source is of **drag and drop** type and 
 it is accepted, the caret will be moved to the drag position.
 

 By default accepts paste sources and drags from the Oxygen Project and DITA Maps Manager.

### `containsOnlyImages([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textPage, `java.util.List<java.net.URL>` urlList)`

**Returns:** `boolean`

### `containsOnlyBinaryResources([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textPage, `java.util.List<java.net.URL>` urlList)`

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

