# Interface: `WSDITAMapEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../WSEditorPage.md)

## Description

## Methods

### `getDocumentController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../../../../ecss/extensions/api/AuthorDocumentController.md)

It has methods for changing the document model.
 The insertions of XML content using the controller are not schema aware.

### `getOptionsStorage()`

**Returns:** [`ro.sync.ecss.extensions.api.OptionsStorage`](../../../../../../ecss/extensions/api/OptionsStorage.md)

This is also responsible for adding and removing listeners that are notified
 about the option changes.

### `setPopUpMenuCustomizer([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapPopupMenuCustomizer`](./DITAMapPopupMenuCustomizer.md) popUpCustomizer)`

**Returns:** `void`

### `getDITAMapTreeComponent()`

**Returns:** `java.lang.Object`

### `addAuthorAttributesDisplayFilter([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md) attributesDisplayFilter)`

**Returns:** `void`

The filter will be applied when editing the attributes for a topic reference.

### `removeAuthorAttributesDisplayFilter([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md) attributesDisplayFilter)`

**Returns:** `void`

### `setEditable(`boolean` editable)`

**Returns:** `void`

### `isEditable()`

**Returns:** `boolean`

### `getSelectedNodes(`boolean` minimizeSelection)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](../../../../../../ecss/extensions/api/node/AuthorNode.md)

### `getActionsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.actions.DITAMapActionsProvider`](actions/DITAMapActionsProvider.md)

### `addDropHandler([`ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler`](dnd/DITAMapTreeDropHandler.md) dropHandler)`

**Returns:** `void`

### `removeDropHandler([`ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler`](dnd/DITAMapTreeDropHandler.md) dropHandler)`

**Returns:** `void`

### `refreshReferences()`

**Returns:** `void`

This is equivalent to pressing F5 in the map tree.

### `getReviewController()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.review.DITAMapReviewController`](review/DITAMapReviewController.md)

### `addNodeRendererCustomizer([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer`](./DITAMapNodeRendererCustomizer.md) customizer)`

**Returns:** `void`

The customizer can customize the icon and title which appears for each topicref
 in the DITA Maps Manager view.

### `removeNodeRendererCustomizer([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer`](./DITAMapNodeRendererCustomizer.md) customizer)`

**Returns:** `void`

The customizer can customize the icon and title which appears for each topicref
 in the DITA Maps Manager view.

### `getUnsavedContentReferenceManager()`

**Returns:** [`ro.sync.ecss.extensions.api.access.UnsavedContentReferenceManager`](../../../../../../ecss/extensions/api/access/UnsavedContentReferenceManager.md)

### `getCurrentSelectedURLs(`boolean` recurseReferences, `boolean` includeBinaryAndExternalResources)`

**Returns:** `java.net.URL[]`

