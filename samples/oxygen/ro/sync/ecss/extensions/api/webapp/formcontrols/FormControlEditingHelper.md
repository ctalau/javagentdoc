# Interface: `FormControlEditingHelper`

**Package:** [`ro.sync.ecss.extensions.api.webapp.formcontrols`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.formcontrols.FormControlEditingHelper`

## Description

## Fields

### `EDIT_CONTENT`

**Type:** `java.lang.String`

### `EDIT_TEXT`

**Type:** `java.lang.String`

## Methods

### `commitEditedValue(AuthorElement elem, String toEdit, String valueToCommit)`

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md)): The element whose value to edit.
- `toEdit` (`java.lang.String`): The attribute name or #CONTENT if we are editing the content of an element
   or #TEXT to edit the text of the element. `null` means #TEXT.
- `valueToCommit` (`java.lang.String`): The new value to be committed.

**Returns:** `void`

### `commitEditedValueForProcessingInstruction(AuthorParentNode elem, String toEdit, String valueToCommit)`

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](../../node/AuthorParentNode.md)): The processing instruction whose value to edit.
- `toEdit` (`java.lang.String`): The attribute name.
- `valueToCommit` (`java.lang.String`): The new value to be committed.

**Returns:** `void`

