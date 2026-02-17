# Interface: `SimpleQuickAssistProcessor`

**Package:** [`ro.sync.exml.editor.quickassist`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`

## Description

A processor can provide just quick fixes, just quick assists
 or both.
 
 

 This interface can be implemented by clients.

## Methods

### `canAssist([`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../../workspace/api/editor/page/WSEditorPage.md) editorPage, `int` offset)`

**Returns:** `boolean`

### `computeQuickAssistProposals([`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../../workspace/api/editor/page/WSEditorPage.md) editorPage, `int` offset)`

**Returns:** [`ro.sync.exml.editor.quickassist.IQuickAssistProposal[]`](./IQuickAssistProposal.md)

### `getPriority()`

**Returns:** `short`

