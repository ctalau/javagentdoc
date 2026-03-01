# Interface: `AuthorOperation`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorOperation`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

The operations are executed by the Author actions.
 
 All edits performed inside an AuthorOperation are part of a single compound edit 
 (AuthorDocumentController#beginCompoundEdit(). If this behavior is not desirable,
 one can implement the AuthorOperationWithCustomUndoBehavior interface.
 
 More information on various subclasses can be found in the 
 [user manual](https://www.oxygenxml.com/doc/ug-editor/topics/dg-default-author-operations.html).

## Fields

### `NAMESPACE_ARGUMENT`

**Type:** `java.lang.String`

The value is `'namespace'`.

### `NAMESPACE_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](./ArgumentDescriptor.md)

### `SCHEMA_AWARE_ARGUMENT`

**Type:** `java.lang.String`

### `SCHEMA_AWARE_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](./ArgumentDescriptor.md)

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](./ArgumentsMap.md) args)`

**Returns:** `void`

You can check if the operation was invoked from the oXygen standalone application 
 or from the oXygen plugin for Eclipse by using the method: 
 ro.sync.exml.workspace.api.Workspace#getPlatform().
 To get to the Workspace you may use: AuthorAccess#getWorkspaceAccess().

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](./ArgumentDescriptor.md)

