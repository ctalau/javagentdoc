# Interface: `SimpleQuickAssistProcessor`

**Package:** [`ro.sync.exml.editor.quickassist`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`

## Description

A processor can provide just quick fixes, just quick assists
 or both.
 
 

 This interface can be implemented by clients.

## Methods

### `canAssist(WSEditorPage editorPage, int offset)`

**Parameters:**
- `editorPage` ([`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../../workspace/api/editor/page/WSEditorPage.md)): The current editor page. Can be `null` if the editor page cannot be determined.
- `offset` (`int`): the offset where quick assist was invoked.

**Returns:** `boolean`

### `computeQuickAssistProposals(WSEditorPage editorPage, int offset)`

**Parameters:**
- `editorPage` ([`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../../workspace/api/editor/page/WSEditorPage.md)): The current editor page. Can be `null` if the editor page cannot be determined.
- `offset` (`int`): the offset where quick assist was invoked.

**Returns:** [`ro.sync.exml.editor.quickassist.IQuickAssistProposal[]`](./IQuickAssistProposal.md)

### `getPriority()`

**Returns:** `short`

