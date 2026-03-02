# Interface: `XMLRefactorProblemCollector`

**Package:** [`ro.sync.exml.workspace.api.util.refactor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.refactor.XMLRefactorProblemCollector`

## Description

## Methods

### `problemsOccured(ro.sync.document.DocumentPositionedInfo[] problems)`

**Returns:** `void`

May be called multiple times, usually for each validated file 
 if problems are detected inside it.

**Parameters:**
- `problems` ([`ro.sync.document.DocumentPositionedInfo[]`](../../../../../document/DocumentPositionedInfo.md)): The DocumentPositionedInfo array containing possible problems.

