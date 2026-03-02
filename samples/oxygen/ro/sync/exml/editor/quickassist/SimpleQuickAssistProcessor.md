# Interface: `SimpleQuickAssistProcessor`

**Package:** [`ro.sync.exml.editor.quickassist`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`

## Description

A processor can provide just quick fixes, just quick assists
 or both.
 
 

 This interface can be implemented by clients.

## Methods

### `canAssist(ro.sync.exml.workspace.api.editor.page.WSEditorPage editorPage, int offset)`

**Returns:** `boolean`

**Parameters:**
- `editorPage` ([`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../../workspace/api/editor/page/WSEditorPage.md)): The current editor page. Can be `null` if the editor page cannot be determined.
- `offset` (`int`): the offset where quick assist was invoked.

### `computeQuickAssistProposals(ro.sync.exml.workspace.api.editor.page.WSEditorPage editorPage, int offset)`

**Returns:** [`ro.sync.exml.editor.quickassist.IQuickAssistProposal[]`](./IQuickAssistProposal.md)

**Parameters:**
- `editorPage` ([`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](../../workspace/api/editor/page/WSEditorPage.md)): The current editor page. Can be `null` if the editor page cannot be determined.
- `offset` (`int`): the offset where quick assist was invoked.

### `getPriority()`

**Returns:** `short`

