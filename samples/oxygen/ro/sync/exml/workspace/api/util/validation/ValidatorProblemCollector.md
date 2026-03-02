# Interface: `ValidatorProblemCollector`

**Package:** [`ro.sync.exml.workspace.api.util.validation`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.validation.ValidatorProblemCollector`

## Description

## Methods

### `problemsOccured(DocumentPositionedInfo[] problems)`

May be called multiple times, usually for each validated file 
 if problems are detected inside it.

**Parameters:**
- `problems` ([`ro.sync.document.DocumentPositionedInfo[]`](../../../../../document/DocumentPositionedInfo.md)): The DocumentPositionedInfo array containing possible problems.

**Returns:** `void`

