# Interface: `EditorTemplateWithContent`

**Package:** [`ro.sync.template`](README.md)

**Fully Qualified Name:** `ro.sync.template.EditorTemplateWithContent`

**Extends:** [`ro.sync.exml.editor.EditorTemplate`](../exml/editor/EditorTemplate.md)

## Description

## Methods

### `getContentInfo(java.lang.String saveLocation)`

**Parameters:**
- `saveLocation` (`java.lang.String`): The location where the new template will be saved.

**Returns:** [`ro.sync.template.TemplateContentInfo`](./TemplateContentInfo.md)

### `getContentInfo(java.lang.String saveLocation, boolean interactive)`

**Parameters:**
- `saveLocation` (`java.lang.String`): The location where the content will be saved.
- `interactive` (`boolean`): `true` if we should expand interactive editor variables.

**Returns:** [`ro.sync.template.TemplateContentInfo`](./TemplateContentInfo.md)

### `getContentInfo(java.lang.String saveLocation, boolean expandEditorVariables, boolean interactive)`

**Parameters:**
- `saveLocation` (`java.lang.String`): The location where the content will be saved.
- `expandEditorVariables` (`boolean`): `true` to expand editor variables.
- `interactive` (`boolean`): `true` if we should expand interactive editor variables.

**Returns:** [`ro.sync.template.TemplateContentInfo`](./TemplateContentInfo.md)

