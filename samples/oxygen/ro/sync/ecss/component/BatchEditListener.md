# Interface: `BatchEditListener`

**Package:** [`ro.sync.ecss.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.BatchEditListener`

## Description

One may choose to update the UI only at the end of such a batch.
 
 This interface is notified when a batch of events starts and ends.

## Methods

### `beginEdit()`

beginEdit and endEdit can't be nested. If beginEdit is called more than once 
 before an endEdit then events will be lost.

**Returns:** `void`

### `endEdit()`

**Returns:** `void`

