# Interface: `IQuickAssistProposal`

**Package:** [`ro.sync.exml.editor.quickassist`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.quickassist.IQuickAssistProposal`

**Extends:** `ro.sync.contentcompletion.editor.InlineProposal`

## Type Parameters

- `I` extends `java.lang.Object`

## Description

A completion proposal contains information used to present the proposed completion
 to the user, to insert the completion should the user select it, and to present
 context information for the chosen completion once it has been inserted.

## Methods

### `apply()`

**Returns:** `void`

### `getSelection()`

**Returns:** `int[]`

If it returns
 `null`, no new selection is set.

 A document change can trigger other document changes, which have
 to be taken into account when calculating the new selection. Typically,
 this would be done by installing a document listener or by using a
 document position during #apply().

### `getImage()`

**Returns:** `I`

The image would typically be shown to the left of the display string.

### `getParentGroup()`

**Returns:** [`ro.sync.exml.editor.quickassist.QuickAssistProposalGroup`](./QuickAssistProposalGroup.md)

### `isQuickFix()`

**Returns:** `boolean`

