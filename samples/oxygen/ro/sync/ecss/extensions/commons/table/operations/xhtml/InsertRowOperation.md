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

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md) tableHelper)`

## Methods

### `getOperationArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getCellElementName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement, `int` columnIndex)`

**Returns:** `java.lang.String`

### `getRowElementName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `java.lang.String`

### `useCurrentRowTemplateOnInsert()`

**Returns:** `boolean`

