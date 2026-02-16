# Interface: `FinalizableReference`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FinalizableReference`

## Description

Implemented by references that have code to run after garbage collection of their referents.
@see FinalizableReferenceQueue
@author Bob Lee
@since 2.0

## Methods

### `finalizeReferent()`

**Returns:** `void`

Invoked on a background thread after the referent has been garbage collected unless security
 restrictions prevented starting a background thread, in which case this method is invoked when
 new references are created.

