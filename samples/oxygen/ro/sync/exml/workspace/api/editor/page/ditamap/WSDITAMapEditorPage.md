# Interface: `WSDITAMapEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../WSEditorPage.md)

## Description

## Methods

### `getDocumentController()`

It has methods for changing the document model.
 The insertions of XML content using the controller are not schema aware.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../../../../ecss/extensions/api/AuthorDocumentController.md)

### `getOptionsStorage()`

This is also responsible for adding and removing listeners that are notified
 about the option changes.

**Returns:** [`ro.sync.ecss.extensions.api.OptionsStorage`](../../../../../../ecss/extensions/api/OptionsStorage.md)

### `setPopUpMenuCustomizer(DITAMapPopupMenuCustomizer popUpCustomizer)`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapPopupMenuCustomizer`](./DITAMapPopupMenuCustomizer.md)): the pop-up menu customizer.

**Returns:** `void`

### `getDITAMapTreeComponent()`

**Returns:** `java.lang.Object`

### `addAuthorAttributesDisplayFilter(AuthorAttributesDisplayFilter attributesDisplayFilter)`

The filter will be applied when editing the attributes for a topic reference.

**Parameters:**
- `attributesDisplayFilter` ([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md)): The AuthorAttributesDisplayFilter to be added.

**Returns:** `void`

### `removeAuthorAttributesDisplayFilter(AuthorAttributesDisplayFilter attributesDisplayFilter)`

**Parameters:**
- `attributesDisplayFilter` ([`ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`](../../../../../../ecss/extensions/api/attributes/AuthorAttributesDisplayFilter.md)): The AuthorAttributesDisplayFilter to be removed.

**Returns:** `void`

### `setEditable(boolean editable)`

**Parameters:**
- `editable` (`boolean`): `true` if the DITA Map page should be editable.

**Returns:** `void`

### `isEditable()`

**Returns:** `boolean`

### `getSelectedNodes(boolean minimizeSelection)`

**Parameters:**
- `minimizeSelection` (`boolean`): If `true` and a parent and a child is selected, then only the parent is the list.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](../../../../../../ecss/extensions/api/node/AuthorNode.md)

### `getActionsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.actions.DITAMapActionsProvider`](actions/DITAMapActionsProvider.md)

### `addDropHandler(DITAMapTreeDropHandler dropHandler)`

**Parameters:**
- `dropHandler` ([`ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler`](dnd/DITAMapTreeDropHandler.md)): The newly added drop handler

**Returns:** `void`

### `removeDropHandler(DITAMapTreeDropHandler dropHandler)`

**Parameters:**
- `dropHandler` ([`ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler`](dnd/DITAMapTreeDropHandler.md)): The newly added drop handler

**Returns:** `void`

### `refreshReferences()`

This is equivalent to pressing F5 in the map tree.

**Returns:** `void`

### `getReviewController()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.ditamap.review.DITAMapReviewController`](review/DITAMapReviewController.md)

### `addNodeRendererCustomizer(DITAMapNodeRendererCustomizer customizer)`

The customizer can customize the icon and title which appears for each topicref
 in the DITA Maps Manager view.

**Parameters:**
- `customizer` ([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer`](./DITAMapNodeRendererCustomizer.md)): The customizer can customize the icon and title which appears for each topicref
   in the DITA Maps Manager view.

**Returns:** `void`

### `removeNodeRendererCustomizer(DITAMapNodeRendererCustomizer customizer)`

The customizer can customize the icon and title which appears for each topicref
 in the DITA Maps Manager view.

**Parameters:**
- `customizer` ([`ro.sync.exml.workspace.api.editor.page.ditamap.DITAMapNodeRendererCustomizer`](./DITAMapNodeRendererCustomizer.md)): The customizer can customize the icon and title which appears for each topicref
   in the DITA Maps Manager view.

**Returns:** `void`

### `getUnsavedContentReferenceManager()`

**Returns:** [`ro.sync.ecss.extensions.api.access.UnsavedContentReferenceManager`](../../../../../../ecss/extensions/api/access/UnsavedContentReferenceManager.md)

### `getCurrentSelectedURLs(boolean recurseReferences, boolean includeBinaryAndExternalResources)`

**Parameters:**
- `recurseReferences` (`boolean`): `true` to recursively collect references. `false` to limit to 
   the first level of references.
- `includeBinaryAndExternalResources` (`boolean`): `true` to include also resources which are possibly binary, 
   for example they have the format attribute set to a binary extension or which have external scope.

**Returns:** `java.net.URL[]`

