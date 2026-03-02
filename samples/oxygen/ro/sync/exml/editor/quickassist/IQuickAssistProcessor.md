# Interface: `IQuickAssistProcessor`

**Package:** [`ro.sync.exml.editor.quickassist`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.quickassist.IQuickAssistProcessor`

## Description

A processor can provide just quick fixes, just quick assists
 or both.
 
 

 This interface can be implemented by clients.

## Fields

### `PRIORITY_LOW`

**Type:** `short`

### `PRIORITY_NORMAL`

**Type:** `short`

### `PRIORITY_HIGH`

**Type:** `short`

## Methods

### `getPriority()`

**Returns:** `short`

The processors are requested depending on this priority, 
 only the proposals of the first processor will be presented.

### `canAssist(ro.sync.exml.editor.quickassist.IQuickAssistInvocationContext invocationContext)`

**Returns:** `boolean`

**Parameters:**
- `invocationContext` ([`ro.sync.exml.editor.quickassist.IQuickAssistInvocationContext`](./IQuickAssistInvocationContext.md)): the invocation context

### `computeQuickAssistProposals(ro.sync.exml.editor.quickassist.IQuickAssistInvocationContext invocationContext)`

**Returns:** [`ro.sync.exml.editor.quickassist.IQuickAssistProposal[]`](./IQuickAssistProposal.md)

**Parameters:**
- `invocationContext` ([`ro.sync.exml.editor.quickassist.IQuickAssistInvocationContext`](./IQuickAssistInvocationContext.md)): the invocation context

