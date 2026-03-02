# Interface: `WSAuthorComponentEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.WSAuthorComponentEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](./WSAuthorEditorPage.md)

## Description

## Methods

### `createExtensionActionsToolbars()`

**Returns:** `java.util.List<javax.swing.JToolBar>`

The toolbars will look almost identical with the ones which appear when the XML is opened in an Oxygen standalone version.

### `setBreadCrumbPopUpCustomizer(ro.sync.ecss.extensions.api.component.PopupMenuCustomizer popUpCustomizer)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUpCustomizer` ([`ro.sync.ecss.extensions.api.component.PopupMenuCustomizer`](../../../../../../ecss/extensions/api/component/PopupMenuCustomizer.md)): The pop Up Customizer.

### `showBreadCrumb(boolean showBreadCrumb)`

**Returns:** `void`

**Parameters:**
- `showBreadCrumb` (`boolean`): `true` to show the Bread Crumb.

### `setOutlinerPopUpCustomizer(ro.sync.ecss.extensions.api.component.PopupMenuCustomizer popUpCustomizer)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUpCustomizer` ([`ro.sync.ecss.extensions.api.component.PopupMenuCustomizer`](../../../../../../ecss/extensions/api/component/PopupMenuCustomizer.md)): The pop Up Customizer.

### `createReviewToolbar()`

**Returns:** `javax.swing.JToolBar`

### `createCSSAlternativesToolbar()`

**Returns:** `javax.swing.JToolBar`

### `createBasicAuthorToolbar()`

**Returns:** `javax.swing.JToolBar`

### `showRangeRuler(boolean showRangeRuler)`

**Returns:** `void`

By default the validation stripe is shown.

**Parameters:**
- `showRangeRuler` (`boolean`): `true` to show the validation stripe, `false` to hide it.

### `showValidationStatusBar(boolean showValidationStatus)`

**Returns:** `void`

By default it is shown.

**Parameters:**
- `showValidationStatus` (`boolean`): `true` to show the validation status bar. `false` to always hide it.

