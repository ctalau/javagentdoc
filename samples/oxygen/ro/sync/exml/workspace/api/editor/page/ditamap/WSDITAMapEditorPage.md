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

### `setPopUpMenuCustomizer(ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapPopupMenuCustomizer popUpCustomizer)`

**Returns:** `void`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapPopupMenuCustomizer`](./DITAMapPopupMenuCustomizer.md)): the pop-up menu customizer.

### `getDITAMapTreeComponent()`

**Returns:** `java.lang.Object`

### `addAuthorAttributesDisplayFilter(ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter attributesDisplayFilter)`

**Returns:** `void`

The filter will be applied when editing the attributes for a topic reference.

**Parameters:**
- `attributesDisplayFilter` ([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md)): The AuthorAttributesDisplayFilter to be added.

### `removeAuthorAttributesDisplayFilter(ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter attributesDisplayFilter)`

**Returns:** `void`

**Parameters:**
- `attributesDisplayFilter` ([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md)): The AuthorAttributesDisplayFilter to be removed.

### `setEditable(boolean editable)`

**Returns:** `void`

**Parameters:**
- `editable` (`boolean`): `true` if the DITA Map page should be editable.

### `isEditable()`

**Returns:** `boolean`

### `getSelectedNodes(boolean minimizeSelection)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](../../../../../../ecss/extensions/api/node/AuthorNode.md)

**Parameters:**
- `minimizeSelection` (`boolean`): If `true` and a parent and a child is selected, then only the parent is the list.

### `getActionsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.actions.DITAMapActionsProvider`](actions/DITAMapActionsProvider.md)

### `addDropHandler(ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler dropHandler)`

**Returns:** `void`

**Parameters:**
- `dropHandler` ([`ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler`](dnd/DITAMapTreeDropHandler.md)): The newly added drop handler

### `removeDropHandler(ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler dropHandler)`

**Returns:** `void`

**Parameters:**
- `dropHandler` ([`ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler`](dnd/DITAMapTreeDropHandler.md)): The newly added drop handler

### `refreshReferences()`

**Returns:** `void`

This is equivalent to pressing F5 in the map tree.

### `getReviewController()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.review.DITAMapReviewController`](review/DITAMapReviewController.md)

### `addNodeRendererCustomizer(ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer customizer)`

**Returns:** `void`

The customizer can customize the icon and title which appears for each topicref
 in the DITA Maps Manager view.

**Parameters:**
- `customizer` ([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer`](./DITAMapNodeRendererCustomizer.md)): The customizer can customize the icon and title which appears for each topicref
 in the DITA Maps Manager view.

### `removeNodeRendererCustomizer(ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer customizer)`

**Returns:** `void`

The customizer can customize the icon and title which appears for each topicref
 in the DITA Maps Manager view.

**Parameters:**
- `customizer` ([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer`](./DITAMapNodeRendererCustomizer.md)): The customizer can customize the icon and title which appears for each topicref
 in the DITA Maps Manager view.

### `getUnsavedContentReferenceManager()`

**Returns:** [`ro.sync.ecss.extensions.api.access.UnsavedContentReferenceManager`](../../../../../../ecss/extensions/api/access/UnsavedContentReferenceManager.md)

### `getCurrentSelectedURLs(boolean recurseReferences, boolean includeBinaryAndExternalResources)`

**Returns:** `java.net.URL[]`

**Parameters:**
- `recurseReferences` (`boolean`): `true` to recursively collect references. `false` to limit to 
 the first level of references.
- `includeBinaryAndExternalResources` (`boolean`): `true` to include also resources which are possibly binary, 
 for example they have the format attribute set to a binary extension or which have external scope.

