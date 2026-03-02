# Class: `EditorVariablesResolver`

**Package:** [`ro.sync.exml.workspace.api.util`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.EditorVariablesResolver`

## Description

## Constructors

### `<init>()`

## Methods

### `resolveEditorVariables(String contentWithEditorVariables, String currentEditedFileURL)`

**Parameters:**
- `contentWithEditorVariables` (`java.lang.String`): The initial content which possibly contains unresolved editor variables.
- `currentEditedFileURL` (`java.lang.String`): The current edited file URL, can be used if the editor variable depends on the current edited file.

**Returns:** `java.lang.String`

### `getCustomResolverEditorVariableDescriptions()`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.util.EditorVariableDescription>`

