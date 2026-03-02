# Class: `InsertRowOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.xhtml.InsertRowOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](../InsertRowOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.XHTMLConstants`](./XHTMLConstants.md)

## Description

## Fields

### `ARGUMENT_HEADER_ROW`

**Type:** `java.lang.String`

The value is `header row`.

### `ARGUMENT_VALUE_YES`

**Type:** `java.lang.String`

The value is `yes`.

### `ARGUMENT_VALUE_NO`

**Type:** `java.lang.String`

The value is `no`

### `headerRow`

**Type:** `boolean`

In this case we will insert 'th' elements.

## Constructors

### `<init>()`

### `<init>(AuthorTableHelper tableHelper)`

**Parameters:**
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md)): Table helper

## Methods

### `getOperationArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

### `doOperationInternal(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getCellElementName(AuthorElement tableElement, int columnIndex)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `java.lang.String`

### `getRowElementName(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))

**Returns:** `java.lang.String`

### `useCurrentRowTemplateOnInsert()`

**Returns:** `boolean`

